package com.elong.nb.agent.ProductForSearchServiceForRealTimeCheck;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.1.7
 * 2016-08-15T18:22:04.171+08:00
 * Generated source version: 3.1.7
 * 
 */
@WebServiceClient(name = "ProductForSearchServiceProxy", 
                  wsdlLocation = "http://hotel3:9000/WCF/com.eLong.Hotel.Product.Services/ProductForSearchService?wsdl",
                  targetNamespace = "http://tempuri.org/") 
public class ProductForSearchServiceProxy extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://tempuri.org/", "ProductForSearchServiceProxy");
    public final static QName BasicHttpBindingIProductForSearchServiceContract = new QName("http://tempuri.org/", "BasicHttpBinding_IProductForSearchServiceContract");
    static {
        URL url = null;
        try {
            url = new URL("http://hotel3:9000/WCF/com.eLong.Hotel.Product.Services/ProductForSearchService?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(ProductForSearchServiceProxy.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://hotel3:9000/WCF/com.eLong.Hotel.Product.Services/ProductForSearchService?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public ProductForSearchServiceProxy(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public ProductForSearchServiceProxy(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ProductForSearchServiceProxy() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public ProductForSearchServiceProxy(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public ProductForSearchServiceProxy(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public ProductForSearchServiceProxy(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns IProductForSearchServiceContract
     */
    @WebEndpoint(name = "BasicHttpBinding_IProductForSearchServiceContract")
    public IProductForSearchServiceContract getBasicHttpBindingIProductForSearchServiceContract() {
        return super.getPort(BasicHttpBindingIProductForSearchServiceContract, IProductForSearchServiceContract.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IProductForSearchServiceContract
     */
    @WebEndpoint(name = "BasicHttpBinding_IProductForSearchServiceContract")
    public IProductForSearchServiceContract getBasicHttpBindingIProductForSearchServiceContract(WebServiceFeature... features) {
        return super.getPort(BasicHttpBindingIProductForSearchServiceContract, IProductForSearchServiceContract.class, features);
    }

}
