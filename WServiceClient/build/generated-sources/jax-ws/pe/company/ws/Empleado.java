
package pe.company.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para empleado complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="empleado">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fecha_contrato" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="profesion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sueldo" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "empleado", propOrder = {
    "fechaContrato",
    "id",
    "nombre",
    "profesion",
    "sueldo"
})
public class Empleado {

    @XmlElement(name = "fecha_contrato")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaContrato;
    protected Integer id;
    protected String nombre;
    protected String profesion;
    protected Double sueldo;

    /**
     * Obtiene el valor de la propiedad fechaContrato.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaContrato() {
        return fechaContrato;
    }

    /**
     * Define el valor de la propiedad fechaContrato.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaContrato(XMLGregorianCalendar value) {
        this.fechaContrato = value;
    }

    /**
     * Obtiene el valor de la propiedad id.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setId(Integer value) {
        this.id = value;
    }

    /**
     * Obtiene el valor de la propiedad nombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Define el valor de la propiedad nombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombre(String value) {
        this.nombre = value;
    }

    /**
     * Obtiene el valor de la propiedad profesion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfesion() {
        return profesion;
    }

    /**
     * Define el valor de la propiedad profesion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfesion(String value) {
        this.profesion = value;
    }

    /**
     * Obtiene el valor de la propiedad sueldo.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSueldo() {
        return sueldo;
    }

    /**
     * Define el valor de la propiedad sueldo.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSueldo(Double value) {
        this.sueldo = value;
    }

}
