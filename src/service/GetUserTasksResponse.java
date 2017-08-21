
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
 *         &lt;element name="GetUserTasksResult" type="{http://schemas.datacontract.org/2004/07/UrenregistratieService}ArrayOfTask" minOccurs="0"/>
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
    "getUserTasksResult"
})
@XmlRootElement(name = "GetUserTasksResponse")
public class GetUserTasksResponse {

    @XmlElementRef(name = "GetUserTasksResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfTask> getUserTasksResult;

    /**
     * Gets the value of the getUserTasksResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfTask }{@code >}
     *     
     */
    public JAXBElement<ArrayOfTask> getGetUserTasksResult() {
        return getUserTasksResult;
    }

    /**
     * Sets the value of the getUserTasksResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfTask }{@code >}
     *     
     */
    public void setGetUserTasksResult(JAXBElement<ArrayOfTask> value) {
        this.getUserTasksResult = value;
    }

}
