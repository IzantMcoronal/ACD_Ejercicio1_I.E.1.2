//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantaci�n de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perder�n si se vuelve a compilar el esquema de origen. 
// Generado el: 2020.10.07 a las 05:40:24 PM CEST 
//


package generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para TipoCentro complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TipoCentro">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigocentro" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nombrecentro" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="direccion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="director" type="{}TipoProfesor"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TipoCentro", propOrder = {
    "codigocentro",
    "nombrecentro",
    "direccion",
    "director"
})
public class TipoCentro {

    @XmlElement(required = true)
    protected String codigocentro;
    @XmlElement(required = true)
    protected String nombrecentro;
    @XmlElement(required = true)
    protected String direccion;
    @XmlElement(required = true)
    protected TipoProfesor director;

    /**
     * Obtiene el valor de la propiedad codigocentro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigocentro() {
        return codigocentro;
    }

    /**
     * Define el valor de la propiedad codigocentro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigocentro(String value) {
        this.codigocentro = value;
    }

    /**
     * Obtiene el valor de la propiedad nombrecentro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombrecentro() {
        return nombrecentro;
    }

    /**
     * Define el valor de la propiedad nombrecentro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombrecentro(String value) {
        this.nombrecentro = value;
    }

    /**
     * Obtiene el valor de la propiedad direccion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Define el valor de la propiedad direccion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDireccion(String value) {
        this.direccion = value;
    }

    /**
     * Obtiene el valor de la propiedad director.
     * 
     * @return
     *     possible object is
     *     {@link TipoProfesor }
     *     
     */
    public TipoProfesor getDirector() {
        return director;
    }

    /**
     * Define el valor de la propiedad director.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoProfesor }
     *     
     */
    public void setDirector(TipoProfesor value) {
        this.director = value;
    }

}
