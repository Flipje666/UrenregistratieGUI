
package service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Task complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Task">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AppUser" type="{http://schemas.datacontract.org/2004/07/UrenregistratieService}AppUser" minOccurs="0"/>
 *         &lt;element name="Hours" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Taskid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Task", namespace = "http://schemas.datacontract.org/2004/07/UrenregistratieService", propOrder = {
    "appUser",
    "hours",
    "name",
    "taskid"
})
public class Task {

    @XmlElementRef(name = "AppUser", namespace = "http://schemas.datacontract.org/2004/07/UrenregistratieService", type = JAXBElement.class, required = false)
    protected JAXBElement<AppUser> appUser;
    @XmlElement(name = "Hours")
    protected Integer hours;
    @XmlElementRef(name = "Name", namespace = "http://schemas.datacontract.org/2004/07/UrenregistratieService", type = JAXBElement.class, required = false)
    protected JAXBElement<String> name;
    @XmlElement(name = "Taskid")
    protected Integer taskid;

    /**
     * Gets the value of the appUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AppUser }{@code >}
     *     
     */
    public JAXBElement<AppUser> getAppUser() {
        return appUser;
    }

    /**
     * Sets the value of the appUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AppUser }{@code >}
     *     
     */
    public void setAppUser(JAXBElement<AppUser> value) {
        this.appUser = value;
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
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setName(JAXBElement<String> value) {
        this.name = value;
    }

    /**
     * Gets the value of the taskid property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTaskid() {
        return taskid;
    }

    /**
     * Sets the value of the taskid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTaskid(Integer value) {
        this.taskid = value;
    }

}
