
package com.elong.nb.agent.ProductForSearchServiceForRealTimeCheck;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.Duration;
import javax.xml.namespace.QName;
import org.joda.time.DateTime;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.elong.nb.agent.ProductForSearchServiceForRealTimeCheck package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CheckInventoryAndPriceRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Request", "CheckInventoryAndPriceRequest");
    private final static QName _ProductRequestBase_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Request", "ProductRequestBase");
    private final static QName _CheckReservationRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Request", "CheckReservationRequest");
    private final static QName _GetHotelOnlineSearchTypeRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Request", "GetHotelOnlineSearchTypeRequest");
    private final static QName _GetHotelOrderCreationVerifyModeRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Request", "GetHotelOrderCreationVerifyModeRequest");
    private final static QName _InventoryChangeForDCRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Request", "InventoryChangeForDCRequest");
    private final static QName _CheckInstantConfirmRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Request", "CheckInstantConfirmRequest");
    private final static QName _ServiceResponseBase_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Framework", "ServiceResponseBase");
    private final static QName _ResponseResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Framework", "ResponseResult");
    private final static QName _ServiceRequestBase_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Framework", "ServiceRequestBase");
    private final static QName _ClientServerInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Framework", "ClientServerInfo");
    private final static QName _ClientOperatorInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Framework", "ClientOperatorInfo");
    private final static QName _ArrayOfPriceDaySimple_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model", "ArrayOfPriceDaySimple");
    private final static QName _PriceDaySimple_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model", "PriceDaySimple");
    private final static QName _ArrayOfCheckDetail_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model", "ArrayOfCheckDetail");
    private final static QName _CheckDetail_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model", "CheckDetail");
    private final static QName _ReservationRatePlan_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model", "ReservationRatePlan");
    private final static QName _ReservationPrepayPolicy_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model", "ReservationPrepayPolicy");
    private final static QName _PrepayCancelNeedOneTimeRule_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model", "PrepayCancelNeedOneTimeRule");
    private final static QName _ReservationVouchPolicy_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model", "ReservationVouchPolicy");
    private final static QName _VouchCancelNeedBeforeCheckInTimeRule_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model", "VouchCancelNeedBeforeCheckInTimeRule");
    private final static QName _VouchCancelNeedCheckin24HourRule_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model", "VouchCancelNeedCheckin24hourRule");
    private final static QName _HotelOnlineEntity_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model", "HotelOnlineEntity");
    private final static QName _HotelOrderCreationVerifyModeEntity_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model", "HotelOrderCreationVerifyModeEntity");
    private final static QName _ProductCheckType_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Enums", "ProductCheckType");
    private final static QName _InventoryAndPriceCheckResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Enums", "InventoryAndPriceCheckResult");
    private final static QName _OnlineSearchType_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Enums", "OnlineSearchType");
    private final static QName _AnyType_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyType");
    private final static QName _AnyURI_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyURI");
    private final static QName _Base64Binary_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "base64Binary");
    private final static QName _Boolean_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "boolean");
    private final static QName _Byte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "byte");
    private final static QName _DateTime_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "dateTime");
    private final static QName _Decimal_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "decimal");
    private final static QName _Double_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "double");
    private final static QName _Float_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "float");
    private final static QName _Int_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "int");
    private final static QName _Long_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "long");
    private final static QName _QName_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "QName");
    private final static QName _Short_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "short");
    private final static QName _String_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "string");
    private final static QName _UnsignedByte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedByte");
    private final static QName _UnsignedInt_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedInt");
    private final static QName _UnsignedLong_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedLong");
    private final static QName _UnsignedShort_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedShort");
    private final static QName _Char_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "char");
    private final static QName _Duration_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "duration");
    private final static QName _Guid_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "guid");
    private final static QName _CheckInventoryAndPriceResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response", "CheckInventoryAndPriceResponse");
    private final static QName _CheckReservationResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response", "CheckReservationResponse");
    private final static QName _GetHotelOnlineSearchTypeResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response", "GetHotelOnlineSearchTypeResponse");
    private final static QName _GetHotelOrderCreationVerifyModeResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response", "GetHotelOrderCreationVerifyModeResponse");
    private final static QName _InventoryChangeForDCResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response", "InventoryChangeForDCResponse");
    private final static QName _CheckInstantConfirmResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response", "CheckInstantConfirmResponse");
    private final static QName _CheckInstantConfirm4NBResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response", "CheckInstantConfirm4NBResponse");
    private final static QName _ArrayOfResourceInvAndInstantConfirmState_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model.Inventory", "ArrayOfResourceInvAndInstantConfirmState");
    private final static QName _ResourceInvAndInstantConfirmState_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model.Inventory", "ResourceInvAndInstantConfirmState");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.elong.nb.agent.ProductForSearchServiceForRealTimeCheck
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CheckInventoryAndPriceRequest }
     * 
     */
    public CheckInventoryAndPriceRequest createCheckInventoryAndPriceRequest() {
        return new CheckInventoryAndPriceRequest();
    }

    /**
     * Create an instance of {@link ProductRequestBase }
     * 
     */
    public ProductRequestBase createProductRequestBase() {
        return new ProductRequestBase();
    }

    /**
     * Create an instance of {@link CheckReservationRequest }
     * 
     */
    public CheckReservationRequest createCheckReservationRequest() {
        return new CheckReservationRequest();
    }

    /**
     * Create an instance of {@link GetHotelOnlineSearchTypeRequest }
     * 
     */
    public GetHotelOnlineSearchTypeRequest createGetHotelOnlineSearchTypeRequest() {
        return new GetHotelOnlineSearchTypeRequest();
    }

    /**
     * Create an instance of {@link GetHotelOrderCreationVerifyModeRequest }
     * 
     */
    public GetHotelOrderCreationVerifyModeRequest createGetHotelOrderCreationVerifyModeRequest() {
        return new GetHotelOrderCreationVerifyModeRequest();
    }

    /**
     * Create an instance of {@link InventoryChangeForDCRequest }
     * 
     */
    public InventoryChangeForDCRequest createInventoryChangeForDCRequest() {
        return new InventoryChangeForDCRequest();
    }

    /**
     * Create an instance of {@link CheckInstantConfirmRequest }
     * 
     */
    public CheckInstantConfirmRequest createCheckInstantConfirmRequest() {
        return new CheckInstantConfirmRequest();
    }

    /**
     * Create an instance of {@link ServiceResponseBase }
     * 
     */
    public ServiceResponseBase createServiceResponseBase() {
        return new ServiceResponseBase();
    }

    /**
     * Create an instance of {@link ResponseResult }
     * 
     */
    public ResponseResult createResponseResult() {
        return new ResponseResult();
    }

    /**
     * Create an instance of {@link ServiceRequestBase }
     * 
     */
    public ServiceRequestBase createServiceRequestBase() {
        return new ServiceRequestBase();
    }

    /**
     * Create an instance of {@link ClientServerInfo }
     * 
     */
    public ClientServerInfo createClientServerInfo() {
        return new ClientServerInfo();
    }

    /**
     * Create an instance of {@link ClientOperatorInfo }
     * 
     */
    public ClientOperatorInfo createClientOperatorInfo() {
        return new ClientOperatorInfo();
    }

    /**
     * Create an instance of {@link ArrayOfPriceDaySimple }
     * 
     */
    public ArrayOfPriceDaySimple createArrayOfPriceDaySimple() {
        return new ArrayOfPriceDaySimple();
    }

    /**
     * Create an instance of {@link PriceDaySimple }
     * 
     */
    public PriceDaySimple createPriceDaySimple() {
        return new PriceDaySimple();
    }

    /**
     * Create an instance of {@link ArrayOfCheckDetail }
     * 
     */
    public ArrayOfCheckDetail createArrayOfCheckDetail() {
        return new ArrayOfCheckDetail();
    }

    /**
     * Create an instance of {@link CheckDetail }
     * 
     */
    public CheckDetail createCheckDetail() {
        return new CheckDetail();
    }

    /**
     * Create an instance of {@link ReservationRatePlan }
     * 
     */
    public ReservationRatePlan createReservationRatePlan() {
        return new ReservationRatePlan();
    }

    /**
     * Create an instance of {@link ReservationPrepayPolicy }
     * 
     */
    public ReservationPrepayPolicy createReservationPrepayPolicy() {
        return new ReservationPrepayPolicy();
    }

    /**
     * Create an instance of {@link PrepayCancelNeedOneTimeRule }
     * 
     */
    public PrepayCancelNeedOneTimeRule createPrepayCancelNeedOneTimeRule() {
        return new PrepayCancelNeedOneTimeRule();
    }

    /**
     * Create an instance of {@link ReservationVouchPolicy }
     * 
     */
    public ReservationVouchPolicy createReservationVouchPolicy() {
        return new ReservationVouchPolicy();
    }

    /**
     * Create an instance of {@link VouchCancelNeedBeforeCheckInTimeRule }
     * 
     */
    public VouchCancelNeedBeforeCheckInTimeRule createVouchCancelNeedBeforeCheckInTimeRule() {
        return new VouchCancelNeedBeforeCheckInTimeRule();
    }

    /**
     * Create an instance of {@link VouchCancelNeedCheckin24HourRule }
     * 
     */
    public VouchCancelNeedCheckin24HourRule createVouchCancelNeedCheckin24HourRule() {
        return new VouchCancelNeedCheckin24HourRule();
    }

    /**
     * Create an instance of {@link HotelOnlineEntity }
     * 
     */
    public HotelOnlineEntity createHotelOnlineEntity() {
        return new HotelOnlineEntity();
    }

    /**
     * Create an instance of {@link HotelOrderCreationVerifyModeEntity }
     * 
     */
    public HotelOrderCreationVerifyModeEntity createHotelOrderCreationVerifyModeEntity() {
        return new HotelOrderCreationVerifyModeEntity();
    }

    /**
     * Create an instance of {@link CheckInventoryAndPriceResponse }
     * 
     */
    public CheckInventoryAndPriceResponse createCheckInventoryAndPriceResponse() {
        return new CheckInventoryAndPriceResponse();
    }

    /**
     * Create an instance of {@link CheckReservationResponse }
     * 
     */
    public CheckReservationResponse createCheckReservationResponse() {
        return new CheckReservationResponse();
    }

    /**
     * Create an instance of {@link GetHotelOnlineSearchTypeResponse }
     * 
     */
    public GetHotelOnlineSearchTypeResponse createGetHotelOnlineSearchTypeResponse() {
        return new GetHotelOnlineSearchTypeResponse();
    }

    /**
     * Create an instance of {@link GetHotelOrderCreationVerifyModeResponse }
     * 
     */
    public GetHotelOrderCreationVerifyModeResponse createGetHotelOrderCreationVerifyModeResponse() {
        return new GetHotelOrderCreationVerifyModeResponse();
    }

    /**
     * Create an instance of {@link InventoryChangeForDCResponse }
     * 
     */
    public InventoryChangeForDCResponse createInventoryChangeForDCResponse() {
        return new InventoryChangeForDCResponse();
    }

    /**
     * Create an instance of {@link CheckInstantConfirmResponse }
     * 
     */
    public CheckInstantConfirmResponse createCheckInstantConfirmResponse() {
        return new CheckInstantConfirmResponse();
    }

    /**
     * Create an instance of {@link CheckInstantConfirm4NBResponse }
     * 
     */
    public CheckInstantConfirm4NBResponse createCheckInstantConfirm4NBResponse() {
        return new CheckInstantConfirm4NBResponse();
    }

    /**
     * Create an instance of {@link CheckInventoryAndPrice }
     * 
     */
    public CheckInventoryAndPrice createCheckInventoryAndPrice() {
        return new CheckInventoryAndPrice();
    }

    /**
     * Create an instance of {@link CheckInventoryAndPriceResponse2 }
     * 
     */
    public CheckInventoryAndPriceResponse2 createCheckInventoryAndPriceResponse2() {
        return new CheckInventoryAndPriceResponse2();
    }

    /**
     * Create an instance of {@link CheckReservation }
     * 
     */
    public CheckReservation createCheckReservation() {
        return new CheckReservation();
    }

    /**
     * Create an instance of {@link CheckReservationResponse2 }
     * 
     */
    public CheckReservationResponse2 createCheckReservationResponse2() {
        return new CheckReservationResponse2();
    }

    /**
     * Create an instance of {@link GetHotelOnlineSearchType }
     * 
     */
    public GetHotelOnlineSearchType createGetHotelOnlineSearchType() {
        return new GetHotelOnlineSearchType();
    }

    /**
     * Create an instance of {@link GetHotelOnlineSearchTypeResponse2 }
     * 
     */
    public GetHotelOnlineSearchTypeResponse2 createGetHotelOnlineSearchTypeResponse2() {
        return new GetHotelOnlineSearchTypeResponse2();
    }

    /**
     * Create an instance of {@link GetHotelOrderCreatoinVerifyMode }
     * 
     */
    public GetHotelOrderCreatoinVerifyMode createGetHotelOrderCreatoinVerifyMode() {
        return new GetHotelOrderCreatoinVerifyMode();
    }

    /**
     * Create an instance of {@link GetHotelOrderCreatoinVerifyModeResponse }
     * 
     */
    public GetHotelOrderCreatoinVerifyModeResponse createGetHotelOrderCreatoinVerifyModeResponse() {
        return new GetHotelOrderCreatoinVerifyModeResponse();
    }

    /**
     * Create an instance of {@link InventoryChangeForDC }
     * 
     */
    public InventoryChangeForDC createInventoryChangeForDC() {
        return new InventoryChangeForDC();
    }

    /**
     * Create an instance of {@link InventoryChangeForDCResponse2 }
     * 
     */
    public InventoryChangeForDCResponse2 createInventoryChangeForDCResponse2() {
        return new InventoryChangeForDCResponse2();
    }

    /**
     * Create an instance of {@link CheckInstantConfirm }
     * 
     */
    public CheckInstantConfirm createCheckInstantConfirm() {
        return new CheckInstantConfirm();
    }

    /**
     * Create an instance of {@link CheckInstantConfirmResponse2 }
     * 
     */
    public CheckInstantConfirmResponse2 createCheckInstantConfirmResponse2() {
        return new CheckInstantConfirmResponse2();
    }

    /**
     * Create an instance of {@link CheckInstantConfirm4NB }
     * 
     */
    public CheckInstantConfirm4NB createCheckInstantConfirm4NB() {
        return new CheckInstantConfirm4NB();
    }

    /**
     * Create an instance of {@link ArrayOfResourceInvAndInstantConfirmState }
     * 
     */
    public ArrayOfResourceInvAndInstantConfirmState createArrayOfResourceInvAndInstantConfirmState() {
        return new ArrayOfResourceInvAndInstantConfirmState();
    }

    /**
     * Create an instance of {@link CheckInstantConfirm4NBResponse2 }
     * 
     */
    public CheckInstantConfirm4NBResponse2 createCheckInstantConfirm4NBResponse2() {
        return new CheckInstantConfirm4NBResponse2();
    }

    /**
     * Create an instance of {@link CheckInventoryAndPriceForNB }
     * 
     */
    public CheckInventoryAndPriceForNB createCheckInventoryAndPriceForNB() {
        return new CheckInventoryAndPriceForNB();
    }

    /**
     * Create an instance of {@link CheckInventoryAndPriceForNBResponse }
     * 
     */
    public CheckInventoryAndPriceForNBResponse createCheckInventoryAndPriceForNBResponse() {
        return new CheckInventoryAndPriceForNBResponse();
    }

    /**
     * Create an instance of {@link ResourceInvAndInstantConfirmState }
     * 
     */
    public ResourceInvAndInstantConfirmState createResourceInvAndInstantConfirmState() {
        return new ResourceInvAndInstantConfirmState();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckInventoryAndPriceRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Request", name = "CheckInventoryAndPriceRequest")
    public JAXBElement<CheckInventoryAndPriceRequest> createCheckInventoryAndPriceRequest(CheckInventoryAndPriceRequest value) {
        return new JAXBElement<CheckInventoryAndPriceRequest>(_CheckInventoryAndPriceRequest_QNAME, CheckInventoryAndPriceRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductRequestBase }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Request", name = "ProductRequestBase")
    public JAXBElement<ProductRequestBase> createProductRequestBase(ProductRequestBase value) {
        return new JAXBElement<ProductRequestBase>(_ProductRequestBase_QNAME, ProductRequestBase.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckReservationRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Request", name = "CheckReservationRequest")
    public JAXBElement<CheckReservationRequest> createCheckReservationRequest(CheckReservationRequest value) {
        return new JAXBElement<CheckReservationRequest>(_CheckReservationRequest_QNAME, CheckReservationRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetHotelOnlineSearchTypeRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Request", name = "GetHotelOnlineSearchTypeRequest")
    public JAXBElement<GetHotelOnlineSearchTypeRequest> createGetHotelOnlineSearchTypeRequest(GetHotelOnlineSearchTypeRequest value) {
        return new JAXBElement<GetHotelOnlineSearchTypeRequest>(_GetHotelOnlineSearchTypeRequest_QNAME, GetHotelOnlineSearchTypeRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetHotelOrderCreationVerifyModeRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Request", name = "GetHotelOrderCreationVerifyModeRequest")
    public JAXBElement<GetHotelOrderCreationVerifyModeRequest> createGetHotelOrderCreationVerifyModeRequest(GetHotelOrderCreationVerifyModeRequest value) {
        return new JAXBElement<GetHotelOrderCreationVerifyModeRequest>(_GetHotelOrderCreationVerifyModeRequest_QNAME, GetHotelOrderCreationVerifyModeRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InventoryChangeForDCRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Request", name = "InventoryChangeForDCRequest")
    public JAXBElement<InventoryChangeForDCRequest> createInventoryChangeForDCRequest(InventoryChangeForDCRequest value) {
        return new JAXBElement<InventoryChangeForDCRequest>(_InventoryChangeForDCRequest_QNAME, InventoryChangeForDCRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckInstantConfirmRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Request", name = "CheckInstantConfirmRequest")
    public JAXBElement<CheckInstantConfirmRequest> createCheckInstantConfirmRequest(CheckInstantConfirmRequest value) {
        return new JAXBElement<CheckInstantConfirmRequest>(_CheckInstantConfirmRequest_QNAME, CheckInstantConfirmRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceResponseBase }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Framework", name = "ServiceResponseBase")
    public JAXBElement<ServiceResponseBase> createServiceResponseBase(ServiceResponseBase value) {
        return new JAXBElement<ServiceResponseBase>(_ServiceResponseBase_QNAME, ServiceResponseBase.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponseResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Framework", name = "ResponseResult")
    public JAXBElement<ResponseResult> createResponseResult(ResponseResult value) {
        return new JAXBElement<ResponseResult>(_ResponseResult_QNAME, ResponseResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceRequestBase }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Framework", name = "ServiceRequestBase")
    public JAXBElement<ServiceRequestBase> createServiceRequestBase(ServiceRequestBase value) {
        return new JAXBElement<ServiceRequestBase>(_ServiceRequestBase_QNAME, ServiceRequestBase.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClientServerInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Framework", name = "ClientServerInfo")
    public JAXBElement<ClientServerInfo> createClientServerInfo(ClientServerInfo value) {
        return new JAXBElement<ClientServerInfo>(_ClientServerInfo_QNAME, ClientServerInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClientOperatorInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Framework", name = "ClientOperatorInfo")
    public JAXBElement<ClientOperatorInfo> createClientOperatorInfo(ClientOperatorInfo value) {
        return new JAXBElement<ClientOperatorInfo>(_ClientOperatorInfo_QNAME, ClientOperatorInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPriceDaySimple }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model", name = "ArrayOfPriceDaySimple")
    public JAXBElement<ArrayOfPriceDaySimple> createArrayOfPriceDaySimple(ArrayOfPriceDaySimple value) {
        return new JAXBElement<ArrayOfPriceDaySimple>(_ArrayOfPriceDaySimple_QNAME, ArrayOfPriceDaySimple.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PriceDaySimple }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model", name = "PriceDaySimple")
    public JAXBElement<PriceDaySimple> createPriceDaySimple(PriceDaySimple value) {
        return new JAXBElement<PriceDaySimple>(_PriceDaySimple_QNAME, PriceDaySimple.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCheckDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model", name = "ArrayOfCheckDetail")
    public JAXBElement<ArrayOfCheckDetail> createArrayOfCheckDetail(ArrayOfCheckDetail value) {
        return new JAXBElement<ArrayOfCheckDetail>(_ArrayOfCheckDetail_QNAME, ArrayOfCheckDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model", name = "CheckDetail")
    public JAXBElement<CheckDetail> createCheckDetail(CheckDetail value) {
        return new JAXBElement<CheckDetail>(_CheckDetail_QNAME, CheckDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReservationRatePlan }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model", name = "ReservationRatePlan")
    public JAXBElement<ReservationRatePlan> createReservationRatePlan(ReservationRatePlan value) {
        return new JAXBElement<ReservationRatePlan>(_ReservationRatePlan_QNAME, ReservationRatePlan.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReservationPrepayPolicy }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model", name = "ReservationPrepayPolicy")
    public JAXBElement<ReservationPrepayPolicy> createReservationPrepayPolicy(ReservationPrepayPolicy value) {
        return new JAXBElement<ReservationPrepayPolicy>(_ReservationPrepayPolicy_QNAME, ReservationPrepayPolicy.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PrepayCancelNeedOneTimeRule }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model", name = "PrepayCancelNeedOneTimeRule")
    public JAXBElement<PrepayCancelNeedOneTimeRule> createPrepayCancelNeedOneTimeRule(PrepayCancelNeedOneTimeRule value) {
        return new JAXBElement<PrepayCancelNeedOneTimeRule>(_PrepayCancelNeedOneTimeRule_QNAME, PrepayCancelNeedOneTimeRule.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReservationVouchPolicy }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model", name = "ReservationVouchPolicy")
    public JAXBElement<ReservationVouchPolicy> createReservationVouchPolicy(ReservationVouchPolicy value) {
        return new JAXBElement<ReservationVouchPolicy>(_ReservationVouchPolicy_QNAME, ReservationVouchPolicy.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VouchCancelNeedBeforeCheckInTimeRule }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model", name = "VouchCancelNeedBeforeCheckInTimeRule")
    public JAXBElement<VouchCancelNeedBeforeCheckInTimeRule> createVouchCancelNeedBeforeCheckInTimeRule(VouchCancelNeedBeforeCheckInTimeRule value) {
        return new JAXBElement<VouchCancelNeedBeforeCheckInTimeRule>(_VouchCancelNeedBeforeCheckInTimeRule_QNAME, VouchCancelNeedBeforeCheckInTimeRule.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VouchCancelNeedCheckin24HourRule }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model", name = "VouchCancelNeedCheckin24hourRule")
    public JAXBElement<VouchCancelNeedCheckin24HourRule> createVouchCancelNeedCheckin24HourRule(VouchCancelNeedCheckin24HourRule value) {
        return new JAXBElement<VouchCancelNeedCheckin24HourRule>(_VouchCancelNeedCheckin24HourRule_QNAME, VouchCancelNeedCheckin24HourRule.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HotelOnlineEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model", name = "HotelOnlineEntity")
    public JAXBElement<HotelOnlineEntity> createHotelOnlineEntity(HotelOnlineEntity value) {
        return new JAXBElement<HotelOnlineEntity>(_HotelOnlineEntity_QNAME, HotelOnlineEntity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HotelOrderCreationVerifyModeEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model", name = "HotelOrderCreationVerifyModeEntity")
    public JAXBElement<HotelOrderCreationVerifyModeEntity> createHotelOrderCreationVerifyModeEntity(HotelOrderCreationVerifyModeEntity value) {
        return new JAXBElement<HotelOrderCreationVerifyModeEntity>(_HotelOrderCreationVerifyModeEntity_QNAME, HotelOrderCreationVerifyModeEntity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link String }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Enums", name = "ProductCheckType")
    public JAXBElement<List<String>> createProductCheckType(List<String> value) {
        return new JAXBElement<List<String>>(_ProductCheckType_QNAME, ((Class) List.class), null, ((List<String> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InventoryAndPriceCheckResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Enums", name = "InventoryAndPriceCheckResult")
    public JAXBElement<InventoryAndPriceCheckResult> createInventoryAndPriceCheckResult(InventoryAndPriceCheckResult value) {
        return new JAXBElement<InventoryAndPriceCheckResult>(_InventoryAndPriceCheckResult_QNAME, InventoryAndPriceCheckResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OnlineSearchType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Enums", name = "OnlineSearchType")
    public JAXBElement<OnlineSearchType> createOnlineSearchType(OnlineSearchType value) {
        return new JAXBElement<OnlineSearchType>(_OnlineSearchType_QNAME, OnlineSearchType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "anyType")
    public JAXBElement<Object> createAnyType(Object value) {
        return new JAXBElement<Object>(_AnyType_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "anyURI")
    public JAXBElement<String> createAnyURI(String value) {
        return new JAXBElement<String>(_AnyURI_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "base64Binary")
    public JAXBElement<byte[]> createBase64Binary(byte[] value) {
        return new JAXBElement<byte[]>(_Base64Binary_QNAME, byte[].class, null, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "boolean")
    public JAXBElement<Boolean> createBoolean(Boolean value) {
        return new JAXBElement<Boolean>(_Boolean_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Byte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "byte")
    public JAXBElement<Byte> createByte(Byte value) {
        return new JAXBElement<Byte>(_Byte_QNAME, Byte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DateTime }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "dateTime")
    @XmlJavaTypeAdapter(Adapter1 .class)
    public JAXBElement<DateTime> createDateTime(DateTime value) {
        return new JAXBElement<DateTime>(_DateTime_QNAME, DateTime.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "decimal")
    public JAXBElement<BigDecimal> createDecimal(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Decimal_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "double")
    public JAXBElement<Double> createDouble(Double value) {
        return new JAXBElement<Double>(_Double_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "float")
    public JAXBElement<Float> createFloat(Float value) {
        return new JAXBElement<Float>(_Float_QNAME, Float.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "int")
    public JAXBElement<Integer> createInt(Integer value) {
        return new JAXBElement<Integer>(_Int_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "long")
    public JAXBElement<Long> createLong(Long value) {
        return new JAXBElement<Long>(_Long_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "QName")
    public JAXBElement<QName> createQName(QName value) {
        return new JAXBElement<QName>(_QName_QNAME, QName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "short")
    public JAXBElement<Short> createShort(Short value) {
        return new JAXBElement<Short>(_Short_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "string")
    public JAXBElement<String> createString(String value) {
        return new JAXBElement<String>(_String_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedByte")
    public JAXBElement<Short> createUnsignedByte(Short value) {
        return new JAXBElement<Short>(_UnsignedByte_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedInt")
    public JAXBElement<Long> createUnsignedInt(Long value) {
        return new JAXBElement<Long>(_UnsignedInt_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedLong")
    public JAXBElement<BigInteger> createUnsignedLong(BigInteger value) {
        return new JAXBElement<BigInteger>(_UnsignedLong_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedShort")
    public JAXBElement<Integer> createUnsignedShort(Integer value) {
        return new JAXBElement<Integer>(_UnsignedShort_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "char")
    public JAXBElement<Integer> createChar(Integer value) {
        return new JAXBElement<Integer>(_Char_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "duration")
    public JAXBElement<Duration> createDuration(Duration value) {
        return new JAXBElement<Duration>(_Duration_QNAME, Duration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "guid")
    public JAXBElement<String> createGuid(String value) {
        return new JAXBElement<String>(_Guid_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckInventoryAndPriceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response", name = "CheckInventoryAndPriceResponse")
    public JAXBElement<CheckInventoryAndPriceResponse> createCheckInventoryAndPriceResponse(CheckInventoryAndPriceResponse value) {
        return new JAXBElement<CheckInventoryAndPriceResponse>(_CheckInventoryAndPriceResponse_QNAME, CheckInventoryAndPriceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckReservationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response", name = "CheckReservationResponse")
    public JAXBElement<CheckReservationResponse> createCheckReservationResponse(CheckReservationResponse value) {
        return new JAXBElement<CheckReservationResponse>(_CheckReservationResponse_QNAME, CheckReservationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetHotelOnlineSearchTypeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response", name = "GetHotelOnlineSearchTypeResponse")
    public JAXBElement<GetHotelOnlineSearchTypeResponse> createGetHotelOnlineSearchTypeResponse(GetHotelOnlineSearchTypeResponse value) {
        return new JAXBElement<GetHotelOnlineSearchTypeResponse>(_GetHotelOnlineSearchTypeResponse_QNAME, GetHotelOnlineSearchTypeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetHotelOrderCreationVerifyModeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response", name = "GetHotelOrderCreationVerifyModeResponse")
    public JAXBElement<GetHotelOrderCreationVerifyModeResponse> createGetHotelOrderCreationVerifyModeResponse(GetHotelOrderCreationVerifyModeResponse value) {
        return new JAXBElement<GetHotelOrderCreationVerifyModeResponse>(_GetHotelOrderCreationVerifyModeResponse_QNAME, GetHotelOrderCreationVerifyModeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InventoryChangeForDCResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response", name = "InventoryChangeForDCResponse")
    public JAXBElement<InventoryChangeForDCResponse> createInventoryChangeForDCResponse(InventoryChangeForDCResponse value) {
        return new JAXBElement<InventoryChangeForDCResponse>(_InventoryChangeForDCResponse_QNAME, InventoryChangeForDCResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckInstantConfirmResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response", name = "CheckInstantConfirmResponse")
    public JAXBElement<CheckInstantConfirmResponse> createCheckInstantConfirmResponse(CheckInstantConfirmResponse value) {
        return new JAXBElement<CheckInstantConfirmResponse>(_CheckInstantConfirmResponse_QNAME, CheckInstantConfirmResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckInstantConfirm4NBResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response", name = "CheckInstantConfirm4NBResponse")
    public JAXBElement<CheckInstantConfirm4NBResponse> createCheckInstantConfirm4NBResponse(CheckInstantConfirm4NBResponse value) {
        return new JAXBElement<CheckInstantConfirm4NBResponse>(_CheckInstantConfirm4NBResponse_QNAME, CheckInstantConfirm4NBResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfResourceInvAndInstantConfirmState }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model.Inventory", name = "ArrayOfResourceInvAndInstantConfirmState")
    public JAXBElement<ArrayOfResourceInvAndInstantConfirmState> createArrayOfResourceInvAndInstantConfirmState(ArrayOfResourceInvAndInstantConfirmState value) {
        return new JAXBElement<ArrayOfResourceInvAndInstantConfirmState>(_ArrayOfResourceInvAndInstantConfirmState_QNAME, ArrayOfResourceInvAndInstantConfirmState.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResourceInvAndInstantConfirmState }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model.Inventory", name = "ResourceInvAndInstantConfirmState")
    public JAXBElement<ResourceInvAndInstantConfirmState> createResourceInvAndInstantConfirmState(ResourceInvAndInstantConfirmState value) {
        return new JAXBElement<ResourceInvAndInstantConfirmState>(_ResourceInvAndInstantConfirmState_QNAME, ResourceInvAndInstantConfirmState.class, null, value);
    }

}
