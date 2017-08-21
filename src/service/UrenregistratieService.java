
package service;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "UrenregistratieService", targetNamespace = "http://tempuri.org/", wsdlLocation = "http://localhost:8733/Design_Time_Addresses/UrenregistratieService/UrenregistratieService/?Wsdl")
public class UrenregistratieService
    extends Service
{

    private final static URL URENREGISTRATIESERVICE_WSDL_LOCATION;
    private final static WebServiceException URENREGISTRATIESERVICE_EXCEPTION;
    private final static QName URENREGISTRATIESERVICE_QNAME = new QName("http://tempuri.org/", "UrenregistratieService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8733/Design_Time_Addresses/UrenregistratieService/UrenregistratieService/?Wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        URENREGISTRATIESERVICE_WSDL_LOCATION = url;
        URENREGISTRATIESERVICE_EXCEPTION = e;
    }

    public UrenregistratieService() {
        super(__getWsdlLocation(), URENREGISTRATIESERVICE_QNAME);
    }

    public UrenregistratieService(WebServiceFeature... features) {
        super(__getWsdlLocation(), URENREGISTRATIESERVICE_QNAME, features);
    }

    public UrenregistratieService(URL wsdlLocation) {
        super(wsdlLocation, URENREGISTRATIESERVICE_QNAME);
    }

    public UrenregistratieService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, URENREGISTRATIESERVICE_QNAME, features);
    }

    public UrenregistratieService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public UrenregistratieService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns IUrenregistratieService
     */
    @WebEndpoint(name = "BasicHttpBinding_IUrenregistratieService")
    public IUrenregistratieService getBasicHttpBindingIUrenregistratieService() {
        return super.getPort(new QName("http://tempuri.org/", "BasicHttpBinding_IUrenregistratieService"), IUrenregistratieService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IUrenregistratieService
     */
    @WebEndpoint(name = "BasicHttpBinding_IUrenregistratieService")
    public IUrenregistratieService getBasicHttpBindingIUrenregistratieService(WebServiceFeature... features) {
        return super.getPort(new QName("http://tempuri.org/", "BasicHttpBinding_IUrenregistratieService"), IUrenregistratieService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (URENREGISTRATIESERVICE_EXCEPTION!= null) {
            throw URENREGISTRATIESERVICE_EXCEPTION;
        }
        return URENREGISTRATIESERVICE_WSDL_LOCATION;
    }

}