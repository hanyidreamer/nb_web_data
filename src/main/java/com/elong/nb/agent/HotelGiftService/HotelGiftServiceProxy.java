package com.elong.nb.agent.HotelGiftService;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.0.3
 * 2016-08-26T14:50:46.856+08:00
 * Generated source version: 3.0.3
 * 
 */
@WebServiceClient(name = "HotelGiftServiceProxy", 
                  wsdlLocation = "http://hotel3:9000/WCF/com.eLong.Hotel.Product.Services/HotelGiftService?wsdl",
                  targetNamespace = "http://tempuri.org/") 
public class HotelGiftServiceProxy extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://tempuri.org/", "HotelGiftServiceProxy");
    public final static QName BasicHttpBindingIHotelGiftServiceContract = new QName("http://tempuri.org/", "BasicHttpBinding_IHotelGiftServiceContract");
    static {
        URL url = null;
        try {
            url = new URL("http://hotel3:9000/WCF/com.eLong.Hotel.Product.Services/HotelGiftService?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(HotelGiftServiceProxy.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://hotel3:9000/WCF/com.eLong.Hotel.Product.Services/HotelGiftService?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public HotelGiftServiceProxy(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public HotelGiftServiceProxy(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public HotelGiftServiceProxy() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public HotelGiftServiceProxy(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public HotelGiftServiceProxy(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public HotelGiftServiceProxy(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    

    /**
     *
     * @return
     *     returns IHotelGiftServiceContract
     */
    @WebEndpoint(name = "BasicHttpBinding_IHotelGiftServiceContract")
    public IHotelGiftServiceContract getBasicHttpBindingIHotelGiftServiceContract() {
        return super.getPort(BasicHttpBindingIHotelGiftServiceContract, IHotelGiftServiceContract.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IHotelGiftServiceContract
     */
    @WebEndpoint(name = "BasicHttpBinding_IHotelGiftServiceContract")
    public IHotelGiftServiceContract getBasicHttpBindingIHotelGiftServiceContract(WebServiceFeature... features) {
        return super.getPort(BasicHttpBindingIHotelGiftServiceContract, IHotelGiftServiceContract.class, features);
    }

}
