
package generated;

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
 * JAX-WS RI 2.3.2
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "Itinerary", targetNamespace = "http://tempuri.org/", wsdlLocation = "http://localhost:8733/Design_Time_Addresses/RoutingServer/Service1/?wsdl")
public class Itinerary
    extends Service
{

    private final static URL ITINERARY_WSDL_LOCATION;
    private final static WebServiceException ITINERARY_EXCEPTION;
    private final static QName ITINERARY_QNAME = new QName("http://tempuri.org/", "Itinerary");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8733/Design_Time_Addresses/RoutingServer/Service1/?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        ITINERARY_WSDL_LOCATION = url;
        ITINERARY_EXCEPTION = e;
    }

    public Itinerary() {
        super(__getWsdlLocation(), ITINERARY_QNAME);
    }

    public Itinerary(WebServiceFeature... features) {
        super(__getWsdlLocation(), ITINERARY_QNAME, features);
    }

    public Itinerary(URL wsdlLocation) {
        super(wsdlLocation, ITINERARY_QNAME);
    }

    public Itinerary(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, ITINERARY_QNAME, features);
    }

    public Itinerary(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Itinerary(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns IItinerary
     */
    @WebEndpoint(name = "BasicHttpBinding_IItinerary")
    public IItinerary getBasicHttpBindingIItinerary() {
        return super.getPort(new QName("http://tempuri.org/", "BasicHttpBinding_IItinerary"), IItinerary.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IItinerary
     */
    @WebEndpoint(name = "BasicHttpBinding_IItinerary")
    public IItinerary getBasicHttpBindingIItinerary(WebServiceFeature... features) {
        return super.getPort(new QName("http://tempuri.org/", "BasicHttpBinding_IItinerary"), IItinerary.class, features);
    }

    private static URL __getWsdlLocation() {
        if (ITINERARY_EXCEPTION!= null) {
            throw ITINERARY_EXCEPTION;
        }
        return ITINERARY_WSDL_LOCATION;
    }

}
