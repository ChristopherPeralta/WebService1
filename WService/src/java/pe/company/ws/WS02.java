/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.company.ws;

import java.util.*;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import pe.company.model.Empleado;

/**
 *
 * @author Cris
 */
@WebService(serviceName = "WS02")
public class WS02 {

    private static final Collection<Empleado> itemsEmpleado = new ArrayList();
    static
    {
        Empleado empleado1 = new Empleado(1021, "Luis", new GregorianCalendar(2023,05,4).getTime(),"Contador",4000.0);
        Empleado empleado2 = new Empleado(1022, "Javier", new GregorianCalendar(2022,05,9).getTime(),"Programador",3500.0);
        Empleado empleado3 = new Empleado(1023, "Luna", new GregorianCalendar(2021,04,10).getTime(),"Economista",5000.0);
        Empleado empleado4 = new Empleado(1024, "Jeremy", new GregorianCalendar(2020,07,8).getTime(),"Diseñador",4000.0);
        
        itemsEmpleado.add(empleado1);
        itemsEmpleado.add(empleado2);
        itemsEmpleado.add(empleado3);
        itemsEmpleado.add(empleado4);
    }
    
    @WebMethod(operationName = "listEmpleado")
    public Collection<Empleado> listarEmpleados(@WebParam(name = "codigo") String codigo) {
        return itemsEmpleado;
    }
}
