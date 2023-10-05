/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wserviceclient;

import java.util.Collection;
import pe.company.ws.Empleado;

/**
 *
 * @author Cris
 */
public class WServiceClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Collection<Empleado> itemsEmpleado = listEmpleado("1021");
       
        for(Empleado item:itemsEmpleado)
        {
            System.out.println("ID Empleado: " + item.getId());
            System.out.println("Nombre: " + item.getNombre());
            System.out.println("Fecha Contrato: " + item.getFechaContrato());
            System.out.println("Profesion: " + item.getProfesion());
            System.out.println("Sueldo: " + item.getSueldo());
        }
    }

    private static java.util.List<pe.company.ws.Empleado> listEmpleado(java.lang.String codigo) {
        pe.company.ws.WS02_Service service = new pe.company.ws.WS02_Service();
        pe.company.ws.WS02 port = service.getWS02Port();
        return port.listEmpleado(codigo);
    }
    
    
}
