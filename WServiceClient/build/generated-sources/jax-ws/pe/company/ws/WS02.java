
package pe.company.ws;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "WS02", targetNamespace = "http://ws.company.pe/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface WS02 {


    /**
     * 
     * @param codigo
     * @return
     *     returns java.util.List<pe.company.ws.Empleado>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listEmpleado", targetNamespace = "http://ws.company.pe/", className = "pe.company.ws.ListEmpleado")
    @ResponseWrapper(localName = "listEmpleadoResponse", targetNamespace = "http://ws.company.pe/", className = "pe.company.ws.ListEmpleadoResponse")
    @Action(input = "http://ws.company.pe/WS02/listEmpleadoRequest", output = "http://ws.company.pe/WS02/listEmpleadoResponse")
    public List<Empleado> listEmpleado(
        @WebParam(name = "codigo", targetNamespace = "")
        String codigo);

}
