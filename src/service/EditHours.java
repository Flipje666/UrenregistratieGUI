
package service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="task" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hours" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="u" type="{http://schemas.datacontract.org/2004/07/UrenregistratieService}AppUser" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "task",
    "hours",
    "u"
})
@XmlRootElement(name = "EditHours")
public class EditHours {

    @XmlElementRef(name = "task", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> task;
    protected Integer hours;
    @XmlElementRef(name = "u", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<AppUser> u;

    /**
     * Gets the value of the task property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTask() {
        return task;
    }

    /**
     * Sets the value of the task property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTask(JAXBElement<String> value) {
        this.task = value;
    }

    /**
     * Gets the value of the hours property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHours() {
        return hours;
    }

    /**
     * Sets the value of the hours property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHours(Integer value) {
        this.hours = value;
    }

    /**
     * Gets the value of the u property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AppUser }{@code >}
     *     
     */
    public JAXBElement<AppUser> getU() {
        return u;
    }

    /**
     * Sets the value of the u property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AppUser }{@code >}
     *     
     */
    public void setU(JAXBElement<AppUser> value) {
        this.u = value;
    }

}
