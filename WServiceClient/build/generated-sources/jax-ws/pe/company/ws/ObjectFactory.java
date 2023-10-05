
package pe.company.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the pe.company.ws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ListEmpleado_QNAME = new QName("http://ws.company.pe/", "listEmpleado");
    private final static QName _ListEmpleadoResponse_QNAME = new QName("http://ws.company.pe/", "listEmpleadoResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: pe.company.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ListEmpleadoResponse }
     * 
     */
    public ListEmpleadoResponse createListEmpleadoResponse() {
        return new ListEmpleadoResponse();
    }

    /**
     * Create an instance of {@link ListEmpleado }
     * 
     */
    public ListEmpleado createListEmpleado() {
        return new ListEmpleado();
    }

    /**
     * Create an instance of {@link Empleado }
     * 
     */
    public Empleado createEmpleado() {
        return new Empleado();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListEmpleado }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.company.pe/", name = "listEmpleado")
    public JAXBElement<ListEmpleado> createListEmpleado(ListEmpleado value) {
        return new JAXBElement<ListEmpleado>(_ListEmpleado_QNAME, ListEmpleado.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListEmpleadoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.company.pe/", name = "listEmpleadoResponse")
    public JAXBElement<ListEmpleadoResponse> createListEmpleadoResponse(ListEmpleadoResponse value) {
        return new JAXBElement<ListEmpleadoResponse>(_ListEmpleadoResponse_QNAME, ListEmpleadoResponse.class, null, value);
    }

}
