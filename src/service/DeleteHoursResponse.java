
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
 *         &lt;element name="DeleteHoursResult" type="{http://schemas.datacontract.org/2004/07/UrenregistratieService}AppUser" minOccurs="0"/>
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
    "deleteHoursResult"
})
@XmlRootElement(name = "DeleteHoursResponse")
public class DeleteHoursResponse {

    @XmlElementRef(name = "DeleteHoursResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<AppUser> deleteHoursResult;

    /**
     * Gets the value of the deleteHoursResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AppUser }{@code >}
     *     
     */
    public JAXBElement<AppUser> getDeleteHoursResult() {
        return deleteHoursResult;
    }

    /**
     * Sets the value of the deleteHoursResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AppUser }{@code >}
     *     
     */
    public void setDeleteHoursResult(JAXBElement<AppUser> value) {
        this.deleteHoursResult = value;
    }

}
