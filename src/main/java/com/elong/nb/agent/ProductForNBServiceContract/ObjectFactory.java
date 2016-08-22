
package com.elong.nb.agent.ProductForNBServiceContract;

import java.math.BigDecimal;
import java.math.BigInteger;
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
 * generated in the com.elong.nb.agent.ProductForNBServiceContract package. 
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

    private final static QName _SetB2BSellChannelRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Request", "SetB2BSellChannelRequest");
    private final static QName _GetHotelRoomPriceRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Request", "GetHotelRoomPriceRequest");
    private final static QName _GetAllPriceByHotelIdRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Request", "GetAllPriceByHotelIdRequest");
    private final static QName _GetRatePlanBaseInfoRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Request", "GetRatePlanBaseInfoRequest");
    private final static QName _GetRatePlanBaseListRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Request", "GetRatePlanBaseListRequest");
    private final static QName _ArrayOfPriceInfoForNB_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model", "ArrayOfPriceInfoForNB");
    private final static QName _PriceInfoForNB_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model", "PriceInfoForNB");
    private final static QName _ArrayOfPriceInfoForPartner_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model", "ArrayOfPriceInfoForPartner");
    private final static QName _PriceInfoForPartner_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model", "PriceInfoForPartner");
    private final static QName _CPRatePlanBase_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model", "CP_RatePlanBase");
    private final static QName _ArrayOfCPRatePlanBase_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model", "ArrayOfCP_RatePlanBase");
    private final static QName _ServiceResponseBase_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Framework", "ServiceResponseBase");
    private final static QName _ResponseResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Framework", "ResponseResult");
    private final static QName _ArrayOfint_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOfint");
    private final static QName _SetB2BSellChannelResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response", "SetB2BSellChannelResponse");
    private final static QName _GetRatePlanBaseInfoResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response", "GetRatePlanBaseInfoResponse");
    private final static QName _GetRatePlanBaseListResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response", "GetRatePlanBaseListResponse");
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
    private final static QName _GetHotelRoomPriceResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities", "GetHotelRoomPriceResponse");
    private final static QName _GetAllPriceByHotelIdResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities", "GetAllPriceByHotelIdResponse");
    private final static QName _EnumPayMentType_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Enums", "EnumPayMentType");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.elong.nb.agent.ProductForNBServiceContract
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SetB2BSellChannelRequest }
     * 
     */
    public SetB2BSellChannelRequest createSetB2BSellChannelRequest() {
        return new SetB2BSellChannelRequest();
    }

    /**
     * Create an instance of {@link GetHotelRoomPriceRequest }
     * 
     */
    public GetHotelRoomPriceRequest createGetHotelRoomPriceRequest() {
        return new GetHotelRoomPriceRequest();
    }

    /**
     * Create an instance of {@link GetAllPriceByHotelIdRequest }
     * 
     */
    public GetAllPriceByHotelIdRequest createGetAllPriceByHotelIdRequest() {
        return new GetAllPriceByHotelIdRequest();
    }

    /**
     * Create an instance of {@link GetRatePlanBaseInfoRequest }
     * 
     */
    public GetRatePlanBaseInfoRequest createGetRatePlanBaseInfoRequest() {
        return new GetRatePlanBaseInfoRequest();
    }

    /**
     * Create an instance of {@link GetRatePlanBaseListRequest }
     * 
     */
    public GetRatePlanBaseListRequest createGetRatePlanBaseListRequest() {
        return new GetRatePlanBaseListRequest();
    }

    /**
     * Create an instance of {@link ArrayOfPriceInfoForNB }
     * 
     */
    public ArrayOfPriceInfoForNB createArrayOfPriceInfoForNB() {
        return new ArrayOfPriceInfoForNB();
    }

    /**
     * Create an instance of {@link PriceInfoForNB }
     * 
     */
    public PriceInfoForNB createPriceInfoForNB() {
        return new PriceInfoForNB();
    }

    /**
     * Create an instance of {@link ArrayOfPriceInfoForPartner }
     * 
     */
    public ArrayOfPriceInfoForPartner createArrayOfPriceInfoForPartner() {
        return new ArrayOfPriceInfoForPartner();
    }

    /**
     * Create an instance of {@link PriceInfoForPartner }
     * 
     */
    public PriceInfoForPartner createPriceInfoForPartner() {
        return new PriceInfoForPartner();
    }

    /**
     * Create an instance of {@link CPRatePlanBase }
     * 
     */
    public CPRatePlanBase createCPRatePlanBase() {
        return new CPRatePlanBase();
    }

    /**
     * Create an instance of {@link ArrayOfCPRatePlanBase }
     * 
     */
    public ArrayOfCPRatePlanBase createArrayOfCPRatePlanBase() {
        return new ArrayOfCPRatePlanBase();
    }

    /**
     * Create an instance of {@link SetB2BSellChannel }
     * 
     */
    public SetB2BSellChannel createSetB2BSellChannel() {
        return new SetB2BSellChannel();
    }

    /**
     * Create an instance of {@link SetB2BSellChannelResponse }
     * 
     */
    public SetB2BSellChannelResponse createSetB2BSellChannelResponse() {
        return new SetB2BSellChannelResponse();
    }

    /**
     * Create an instance of {@link SetB2BSellChannelResponse2 }
     * 
     */
    public SetB2BSellChannelResponse2 createSetB2BSellChannelResponse2() {
        return new SetB2BSellChannelResponse2();
    }

    /**
     * Create an instance of {@link GetHotelRoomPrice }
     * 
     */
    public GetHotelRoomPrice createGetHotelRoomPrice() {
        return new GetHotelRoomPrice();
    }

    /**
     * Create an instance of {@link GetHotelRoomPriceResponse }
     * 
     */
    public GetHotelRoomPriceResponse createGetHotelRoomPriceResponse() {
        return new GetHotelRoomPriceResponse();
    }

    /**
     * Create an instance of {@link GetHotelRoomPriceResponse2 }
     * 
     */
    public GetHotelRoomPriceResponse2 createGetHotelRoomPriceResponse2() {
        return new GetHotelRoomPriceResponse2();
    }

    /**
     * Create an instance of {@link GetAllPriceByHotelId }
     * 
     */
    public GetAllPriceByHotelId createGetAllPriceByHotelId() {
        return new GetAllPriceByHotelId();
    }

    /**
     * Create an instance of {@link GetAllPriceByHotelIdResponse }
     * 
     */
    public GetAllPriceByHotelIdResponse createGetAllPriceByHotelIdResponse() {
        return new GetAllPriceByHotelIdResponse();
    }

    /**
     * Create an instance of {@link GetAllPriceByHotelIdResponse2 }
     * 
     */
    public GetAllPriceByHotelIdResponse2 createGetAllPriceByHotelIdResponse2() {
        return new GetAllPriceByHotelIdResponse2();
    }

    /**
     * Create an instance of {@link GetRatePlanBaseInfo }
     * 
     */
    public GetRatePlanBaseInfo createGetRatePlanBaseInfo() {
        return new GetRatePlanBaseInfo();
    }

    /**
     * Create an instance of {@link GetRatePlanBaseInfoResponse }
     * 
     */
    public GetRatePlanBaseInfoResponse createGetRatePlanBaseInfoResponse() {
        return new GetRatePlanBaseInfoResponse();
    }

    /**
     * Create an instance of {@link GetRatePlanBaseInfoResponse2 }
     * 
     */
    public GetRatePlanBaseInfoResponse2 createGetRatePlanBaseInfoResponse2() {
        return new GetRatePlanBaseInfoResponse2();
    }

    /**
     * Create an instance of {@link GetRatePlanBaseList }
     * 
     */
    public GetRatePlanBaseList createGetRatePlanBaseList() {
        return new GetRatePlanBaseList();
    }

    /**
     * Create an instance of {@link GetRatePlanBaseListResponse }
     * 
     */
    public GetRatePlanBaseListResponse createGetRatePlanBaseListResponse() {
        return new GetRatePlanBaseListResponse();
    }

    /**
     * Create an instance of {@link GetRatePlanBaseListResponse2 }
     * 
     */
    public GetRatePlanBaseListResponse2 createGetRatePlanBaseListResponse2() {
        return new GetRatePlanBaseListResponse2();
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
     * Create an instance of {@link ArrayOfint }
     * 
     */
    public ArrayOfint createArrayOfint() {
        return new ArrayOfint();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetB2BSellChannelRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Request", name = "SetB2BSellChannelRequest")
    public JAXBElement<SetB2BSellChannelRequest> createSetB2BSellChannelRequest(SetB2BSellChannelRequest value) {
        return new JAXBElement<SetB2BSellChannelRequest>(_SetB2BSellChannelRequest_QNAME, SetB2BSellChannelRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetHotelRoomPriceRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Request", name = "GetHotelRoomPriceRequest")
    public JAXBElement<GetHotelRoomPriceRequest> createGetHotelRoomPriceRequest(GetHotelRoomPriceRequest value) {
        return new JAXBElement<GetHotelRoomPriceRequest>(_GetHotelRoomPriceRequest_QNAME, GetHotelRoomPriceRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllPriceByHotelIdRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Request", name = "GetAllPriceByHotelIdRequest")
    public JAXBElement<GetAllPriceByHotelIdRequest> createGetAllPriceByHotelIdRequest(GetAllPriceByHotelIdRequest value) {
        return new JAXBElement<GetAllPriceByHotelIdRequest>(_GetAllPriceByHotelIdRequest_QNAME, GetAllPriceByHotelIdRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRatePlanBaseInfoRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Request", name = "GetRatePlanBaseInfoRequest")
    public JAXBElement<GetRatePlanBaseInfoRequest> createGetRatePlanBaseInfoRequest(GetRatePlanBaseInfoRequest value) {
        return new JAXBElement<GetRatePlanBaseInfoRequest>(_GetRatePlanBaseInfoRequest_QNAME, GetRatePlanBaseInfoRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRatePlanBaseListRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Request", name = "GetRatePlanBaseListRequest")
    public JAXBElement<GetRatePlanBaseListRequest> createGetRatePlanBaseListRequest(GetRatePlanBaseListRequest value) {
        return new JAXBElement<GetRatePlanBaseListRequest>(_GetRatePlanBaseListRequest_QNAME, GetRatePlanBaseListRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPriceInfoForNB }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model", name = "ArrayOfPriceInfoForNB")
    public JAXBElement<ArrayOfPriceInfoForNB> createArrayOfPriceInfoForNB(ArrayOfPriceInfoForNB value) {
        return new JAXBElement<ArrayOfPriceInfoForNB>(_ArrayOfPriceInfoForNB_QNAME, ArrayOfPriceInfoForNB.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PriceInfoForNB }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model", name = "PriceInfoForNB")
    public JAXBElement<PriceInfoForNB> createPriceInfoForNB(PriceInfoForNB value) {
        return new JAXBElement<PriceInfoForNB>(_PriceInfoForNB_QNAME, PriceInfoForNB.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPriceInfoForPartner }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model", name = "ArrayOfPriceInfoForPartner")
    public JAXBElement<ArrayOfPriceInfoForPartner> createArrayOfPriceInfoForPartner(ArrayOfPriceInfoForPartner value) {
        return new JAXBElement<ArrayOfPriceInfoForPartner>(_ArrayOfPriceInfoForPartner_QNAME, ArrayOfPriceInfoForPartner.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PriceInfoForPartner }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model", name = "PriceInfoForPartner")
    public JAXBElement<PriceInfoForPartner> createPriceInfoForPartner(PriceInfoForPartner value) {
        return new JAXBElement<PriceInfoForPartner>(_PriceInfoForPartner_QNAME, PriceInfoForPartner.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CPRatePlanBase }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model", name = "CP_RatePlanBase")
    public JAXBElement<CPRatePlanBase> createCPRatePlanBase(CPRatePlanBase value) {
        return new JAXBElement<CPRatePlanBase>(_CPRatePlanBase_QNAME, CPRatePlanBase.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCPRatePlanBase }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model", name = "ArrayOfCP_RatePlanBase")
    public JAXBElement<ArrayOfCPRatePlanBase> createArrayOfCPRatePlanBase(ArrayOfCPRatePlanBase value) {
        return new JAXBElement<ArrayOfCPRatePlanBase>(_ArrayOfCPRatePlanBase_QNAME, ArrayOfCPRatePlanBase.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/Arrays", name = "ArrayOfint")
    public JAXBElement<ArrayOfint> createArrayOfint(ArrayOfint value) {
        return new JAXBElement<ArrayOfint>(_ArrayOfint_QNAME, ArrayOfint.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetB2BSellChannelResponse2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response", name = "SetB2BSellChannelResponse")
    public JAXBElement<SetB2BSellChannelResponse2> createSetB2BSellChannelResponse(SetB2BSellChannelResponse2 value) {
        return new JAXBElement<SetB2BSellChannelResponse2>(_SetB2BSellChannelResponse_QNAME, SetB2BSellChannelResponse2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRatePlanBaseInfoResponse2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response", name = "GetRatePlanBaseInfoResponse")
    public JAXBElement<GetRatePlanBaseInfoResponse2> createGetRatePlanBaseInfoResponse(GetRatePlanBaseInfoResponse2 value) {
        return new JAXBElement<GetRatePlanBaseInfoResponse2>(_GetRatePlanBaseInfoResponse_QNAME, GetRatePlanBaseInfoResponse2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRatePlanBaseListResponse2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response", name = "GetRatePlanBaseListResponse")
    public JAXBElement<GetRatePlanBaseListResponse2> createGetRatePlanBaseListResponse(GetRatePlanBaseListResponse2 value) {
        return new JAXBElement<GetRatePlanBaseListResponse2>(_GetRatePlanBaseListResponse_QNAME, GetRatePlanBaseListResponse2 .class, null, value);
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
        return new JAXBElement<byte[]>(_Base64Binary_QNAME, byte[].class, null, (value));
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GetHotelRoomPriceResponse2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities", name = "GetHotelRoomPriceResponse")
    public JAXBElement<GetHotelRoomPriceResponse2> createGetHotelRoomPriceResponse(GetHotelRoomPriceResponse2 value) {
        return new JAXBElement<GetHotelRoomPriceResponse2>(_GetHotelRoomPriceResponse_QNAME, GetHotelRoomPriceResponse2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllPriceByHotelIdResponse2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities", name = "GetAllPriceByHotelIdResponse")
    public JAXBElement<GetAllPriceByHotelIdResponse2> createGetAllPriceByHotelIdResponse(GetAllPriceByHotelIdResponse2 value) {
        return new JAXBElement<GetAllPriceByHotelIdResponse2>(_GetAllPriceByHotelIdResponse_QNAME, GetAllPriceByHotelIdResponse2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnumPayMentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Enums", name = "EnumPayMentType")
    public JAXBElement<EnumPayMentType> createEnumPayMentType(EnumPayMentType value) {
        return new JAXBElement<EnumPayMentType>(_EnumPayMentType_QNAME, EnumPayMentType.class, null, value);
    }

}
