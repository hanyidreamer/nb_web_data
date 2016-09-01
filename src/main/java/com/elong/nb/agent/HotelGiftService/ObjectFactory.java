
package com.elong.nb.agent.HotelGiftService;

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
 * generated in the com.elong.nb.agent.HotelGiftService package. 
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

    private final static QName _AnyURI_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyURI");
    private final static QName _Char_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "char");
    private final static QName _GetGiftInfoPreviewResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response.HotelGift", "GetGiftInfoPreviewResponse");
    private final static QName _Float_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "float");
    private final static QName _Long_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "long");
    private final static QName _Base64Binary_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "base64Binary");
    private final static QName _ArrayOfRatePlan4GiftDetail_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model", "ArrayOfRatePlan4GiftDetail");
    private final static QName _Byte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "byte");
    private final static QName _SaveNewHotelGiftRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Request", "SaveNewHotelGiftRequest");
    private final static QName _HotelGiftRelationDate_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model", "HotelGiftRelationDate");
    private final static QName _GetHotelGiftDetailResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response.HotelGift", "GetHotelGiftDetailResponse");
    private final static QName _Boolean_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "boolean");
    private final static QName _ArrayOfHotelGiftRelationProduct_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model", "ArrayOfHotelGiftRelationProduct");
    private final static QName _HotelGiftHisModel_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model", "HotelGiftHisModel");
    private final static QName _HotelGiftDetail_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model", "HotelGiftDetail");
    private final static QName _UnsignedByte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedByte");
    private final static QName _AnyType_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyType");
    private final static QName _SaveHotelGiftResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response", "SaveHotelGiftResponse");
    private final static QName _Int_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "int");
    private final static QName _HotelGiftRelationProduct_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model", "HotelGiftRelationProduct");
    private final static QName _ArrayOfHotelGiftAdditional_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model", "ArrayOfHotelGiftAdditional");
    private final static QName _HotelGiftDateTypeEnum_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Enums", "HotelGiftDateTypeEnum");
    private final static QName _GetAllHotelGiftTypeResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response.HotelGift", "GetAllHotelGiftTypeResponse");
    private final static QName _ArrayOfHotelGiftHisModel_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model", "ArrayOfHotelGiftHisModel");
    private final static QName _Double_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "double");
    private final static QName _ArrayOfKeyValueOfstringArrayOfstringty7Ep6D1_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOfKeyValueOfstringArrayOfstringty7Ep6D1");
    private final static QName _HotelGiftSubType_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model", "HotelGiftSubType");
    private final static QName _ArrayOfHotelGiftModel_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model", "ArrayOfHotelGiftModel");
    private final static QName _ArrayOfHotelGiftRelationDate_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model", "ArrayOfHotelGiftRelationDate");
    private final static QName _HotelGiftType_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model", "HotelGiftType");
    private final static QName _ArrayOfHotelProduct4GiftDetail_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model", "ArrayOfHotelProduct4GiftDetail");
    private final static QName _ProductRequestBase_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Request", "ProductRequestBase");
    private final static QName _DateTime_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "dateTime");
    private final static QName _HotelGiftModel_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model", "HotelGiftModel");
    private final static QName _UpdateHotelGiftTypeResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response.HotelGift", "UpdateHotelGiftTypeResponse");
    private final static QName _QName_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "QName");
    private final static QName _ResponseResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Framework", "ResponseResult");
    private final static QName _UnsignedShort_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedShort");
    private final static QName _GetNewHotelGiftDetailResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response.HotelGift", "GetNewHotelGiftDetailResponse");
    private final static QName _GetHotelGiftHisListResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response.HotelGift", "GetHotelGiftHisListResponse");
    private final static QName _Short_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "short");
    private final static QName _SaveHotelGiftRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Request", "SaveHotelGiftRequest");
    private final static QName _UpdateHotelGiftTypeRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Request", "UpdateHotelGiftTypeRequest");
    private final static QName _GetHotelGiftListResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response.HotelGift", "GetHotelGiftListResponse");
    private final static QName _ServiceResponseBase_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Framework", "ServiceResponseBase");
    private final static QName _UnsignedInt_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedInt");
    private final static QName _RatePlan4GiftDetail_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model", "RatePlan4GiftDetail");
    private final static QName _GetTwoHotelGiftTypeResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response.HotelGift", "GetTwoHotelGiftTypeResponse");
    private final static QName _Decimal_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "decimal");
    private final static QName _ArrayOfstring_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOfstring");
    private final static QName _NewHotelGiftModel_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model", "NewHotelGiftModel");
    private final static QName _ArrayOfHotelGiftSubType_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model", "ArrayOfHotelGiftSubType");
    private final static QName _HotelProduct4GiftDetail_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model", "HotelProduct4GiftDetail");
    private final static QName _Guid_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "guid");
    private final static QName _GetGiftTypeCheckResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response.HotelGift", "GetGiftTypeCheckResponse");
    private final static QName _Duration_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "duration");
    private final static QName _HotelGiftAdditional_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model", "HotelGiftAdditional");
    private final static QName _NewHotelGiftDetail_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model", "NewHotelGiftDetail");
    private final static QName _String_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "string");
    private final static QName _HotelGiftHourTypeEnum_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Enums", "HotelGiftHourTypeEnum");
    private final static QName _UnsignedLong_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedLong");
    private final static QName _ArrayOfHotelGiftType_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model", "ArrayOfHotelGiftType");
    private final static QName _SaveNewHotelGiftResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response", "SaveNewHotelGiftResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.elong.nb.agent.HotelGiftService
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ArrayOfKeyValueOfstringArrayOfstringty7Ep6D1 }
     * 
     */
    public ArrayOfKeyValueOfstringArrayOfstringty7Ep6D1 createArrayOfKeyValueOfstringArrayOfstringty7Ep6D1() {
        return new ArrayOfKeyValueOfstringArrayOfstringty7Ep6D1();
    }

    /**
     * Create an instance of {@link SaveHotelGiftRequest }
     * 
     */
    public SaveHotelGiftRequest createSaveHotelGiftRequest() {
        return new SaveHotelGiftRequest();
    }

    /**
     * Create an instance of {@link UpdateHotelGiftTypeRequest }
     * 
     */
    public UpdateHotelGiftTypeRequest createUpdateHotelGiftTypeRequest() {
        return new UpdateHotelGiftTypeRequest();
    }

    /**
     * Create an instance of {@link ProductRequestBase }
     * 
     */
    public ProductRequestBase createProductRequestBase() {
        return new ProductRequestBase();
    }

    /**
     * Create an instance of {@link SaveNewHotelGiftRequest }
     * 
     */
    public SaveNewHotelGiftRequest createSaveNewHotelGiftRequest() {
        return new SaveNewHotelGiftRequest();
    }

    /**
     * Create an instance of {@link ArrayOfstring }
     * 
     */
    public ArrayOfstring createArrayOfstring() {
        return new ArrayOfstring();
    }

    /**
     * Create an instance of {@link SaveNewHotelGiftResponse }
     * 
     */
    public SaveNewHotelGiftResponse createSaveNewHotelGiftResponse() {
        return new SaveNewHotelGiftResponse();
    }

    /**
     * Create an instance of {@link SaveHotelGiftResponse }
     * 
     */
    public SaveHotelGiftResponse createSaveHotelGiftResponse() {
        return new SaveHotelGiftResponse();
    }

    /**
     * Create an instance of {@link GetTwoHotelGiftTypeResponse }
     * 
     */
    public GetTwoHotelGiftTypeResponse createGetTwoHotelGiftTypeResponse() {
        return new GetTwoHotelGiftTypeResponse();
    }

    /**
     * Create an instance of {@link GetNewHotelGiftDetailResponse }
     * 
     */
    public GetNewHotelGiftDetailResponse createGetNewHotelGiftDetailResponse() {
        return new GetNewHotelGiftDetailResponse();
    }

    /**
     * Create an instance of {@link GetHotelGiftListResponse }
     * 
     */
    public GetHotelGiftListResponse createGetHotelGiftListResponse() {
        return new GetHotelGiftListResponse();
    }

    /**
     * Create an instance of {@link GetAllHotelGiftTypeResponse }
     * 
     */
    public GetAllHotelGiftTypeResponse createGetAllHotelGiftTypeResponse() {
        return new GetAllHotelGiftTypeResponse();
    }

    /**
     * Create an instance of {@link GetHotelGiftDetailResponse }
     * 
     */
    public GetHotelGiftDetailResponse createGetHotelGiftDetailResponse() {
        return new GetHotelGiftDetailResponse();
    }

    /**
     * Create an instance of {@link GetGiftInfoPreviewResponse }
     * 
     */
    public GetGiftInfoPreviewResponse createGetGiftInfoPreviewResponse() {
        return new GetGiftInfoPreviewResponse();
    }

    /**
     * Create an instance of {@link UpdateHotelGiftTypeResponse }
     * 
     */
    public UpdateHotelGiftTypeResponse createUpdateHotelGiftTypeResponse() {
        return new UpdateHotelGiftTypeResponse();
    }

    /**
     * Create an instance of {@link GetHotelGiftHisListResponse }
     * 
     */
    public GetHotelGiftHisListResponse createGetHotelGiftHisListResponse() {
        return new GetHotelGiftHisListResponse();
    }

    /**
     * Create an instance of {@link GetGiftTypeCheckResponse }
     * 
     */
    public GetGiftTypeCheckResponse createGetGiftTypeCheckResponse() {
        return new GetGiftTypeCheckResponse();
    }

    /**
     * Create an instance of {@link HotelGiftModel }
     * 
     */
    public HotelGiftModel createHotelGiftModel() {
        return new HotelGiftModel();
    }

    /**
     * Create an instance of {@link HotelGiftDetail }
     * 
     */
    public HotelGiftDetail createHotelGiftDetail() {
        return new HotelGiftDetail();
    }

    /**
     * Create an instance of {@link HotelGiftHisModel }
     * 
     */
    public HotelGiftHisModel createHotelGiftHisModel() {
        return new HotelGiftHisModel();
    }

    /**
     * Create an instance of {@link NewHotelGiftModel }
     * 
     */
    public NewHotelGiftModel createNewHotelGiftModel() {
        return new NewHotelGiftModel();
    }

    /**
     * Create an instance of {@link ArrayOfHotelGiftSubType }
     * 
     */
    public ArrayOfHotelGiftSubType createArrayOfHotelGiftSubType() {
        return new ArrayOfHotelGiftSubType();
    }

    /**
     * Create an instance of {@link ArrayOfHotelGiftHisModel }
     * 
     */
    public ArrayOfHotelGiftHisModel createArrayOfHotelGiftHisModel() {
        return new ArrayOfHotelGiftHisModel();
    }

    /**
     * Create an instance of {@link RatePlan4GiftDetail }
     * 
     */
    public RatePlan4GiftDetail createRatePlan4GiftDetail() {
        return new RatePlan4GiftDetail();
    }

    /**
     * Create an instance of {@link ArrayOfHotelGiftAdditional }
     * 
     */
    public ArrayOfHotelGiftAdditional createArrayOfHotelGiftAdditional() {
        return new ArrayOfHotelGiftAdditional();
    }

    /**
     * Create an instance of {@link HotelGiftRelationProduct }
     * 
     */
    public HotelGiftRelationProduct createHotelGiftRelationProduct() {
        return new HotelGiftRelationProduct();
    }

    /**
     * Create an instance of {@link NewHotelGiftDetail }
     * 
     */
    public NewHotelGiftDetail createNewHotelGiftDetail() {
        return new NewHotelGiftDetail();
    }

    /**
     * Create an instance of {@link ArrayOfRatePlan4GiftDetail }
     * 
     */
    public ArrayOfRatePlan4GiftDetail createArrayOfRatePlan4GiftDetail() {
        return new ArrayOfRatePlan4GiftDetail();
    }

    /**
     * Create an instance of {@link HotelGiftAdditional }
     * 
     */
    public HotelGiftAdditional createHotelGiftAdditional() {
        return new HotelGiftAdditional();
    }

    /**
     * Create an instance of {@link HotelGiftSubType }
     * 
     */
    public HotelGiftSubType createHotelGiftSubType() {
        return new HotelGiftSubType();
    }

    /**
     * Create an instance of {@link ArrayOfHotelGiftModel }
     * 
     */
    public ArrayOfHotelGiftModel createArrayOfHotelGiftModel() {
        return new ArrayOfHotelGiftModel();
    }

    /**
     * Create an instance of {@link HotelProduct4GiftDetail }
     * 
     */
    public HotelProduct4GiftDetail createHotelProduct4GiftDetail() {
        return new HotelProduct4GiftDetail();
    }

    /**
     * Create an instance of {@link ArrayOfHotelGiftRelationProduct }
     * 
     */
    public ArrayOfHotelGiftRelationProduct createArrayOfHotelGiftRelationProduct() {
        return new ArrayOfHotelGiftRelationProduct();
    }

    /**
     * Create an instance of {@link HotelGiftRelationDate }
     * 
     */
    public HotelGiftRelationDate createHotelGiftRelationDate() {
        return new HotelGiftRelationDate();
    }

    /**
     * Create an instance of {@link ArrayOfHotelGiftType }
     * 
     */
    public ArrayOfHotelGiftType createArrayOfHotelGiftType() {
        return new ArrayOfHotelGiftType();
    }

    /**
     * Create an instance of {@link ArrayOfHotelProduct4GiftDetail }
     * 
     */
    public ArrayOfHotelProduct4GiftDetail createArrayOfHotelProduct4GiftDetail() {
        return new ArrayOfHotelProduct4GiftDetail();
    }

    /**
     * Create an instance of {@link ArrayOfHotelGiftRelationDate }
     * 
     */
    public ArrayOfHotelGiftRelationDate createArrayOfHotelGiftRelationDate() {
        return new ArrayOfHotelGiftRelationDate();
    }

    /**
     * Create an instance of {@link HotelGiftType }
     * 
     */
    public HotelGiftType createHotelGiftType() {
        return new HotelGiftType();
    }

    /**
     * Create an instance of {@link ResponseResult }
     * 
     */
    public ResponseResult createResponseResult() {
        return new ResponseResult();
    }

    /**
     * Create an instance of {@link ServiceResponseBase }
     * 
     */
    public ServiceResponseBase createServiceResponseBase() {
        return new ServiceResponseBase();
    }

    /**
     * Create an instance of {@link SaveHotelGift }
     * 
     */
    public SaveHotelGift createSaveHotelGift() {
        return new SaveHotelGift();
    }

    /**
     * Create an instance of {@link GetHotelGiftByGiftIDResponse }
     * 
     */
    public GetHotelGiftByGiftIDResponse createGetHotelGiftByGiftIDResponse() {
        return new GetHotelGiftByGiftIDResponse();
    }

    /**
     * Create an instance of {@link SaveHotelGiftResponse2 }
     * 
     */
    public SaveHotelGiftResponse2 createSaveHotelGiftResponse2() {
        return new SaveHotelGiftResponse2();
    }

    /**
     * Create an instance of {@link GetGiftTypeCheckResponse2 }
     * 
     */
    public GetGiftTypeCheckResponse2 createGetGiftTypeCheckResponse2() {
        return new GetGiftTypeCheckResponse2();
    }

    /**
     * Create an instance of {@link GetPreviewInfoFromGiftModelResponse }
     * 
     */
    public GetPreviewInfoFromGiftModelResponse createGetPreviewInfoFromGiftModelResponse() {
        return new GetPreviewInfoFromGiftModelResponse();
    }

    /**
     * Create an instance of {@link GetTwoHotelGiftTypeResponse2 }
     * 
     */
    public GetTwoHotelGiftTypeResponse2 createGetTwoHotelGiftTypeResponse2() {
        return new GetTwoHotelGiftTypeResponse2();
    }

    /**
     * Create an instance of {@link GetGiftTypeHisByTypeID }
     * 
     */
    public GetGiftTypeHisByTypeID createGetGiftTypeHisByTypeID() {
        return new GetGiftTypeHisByTypeID();
    }

    /**
     * Create an instance of {@link AddNewHotelGiftTypeResponse }
     * 
     */
    public AddNewHotelGiftTypeResponse createAddNewHotelGiftTypeResponse() {
        return new AddNewHotelGiftTypeResponse();
    }

    /**
     * Create an instance of {@link GetHotelGiftHisByGiftIDResponse }
     * 
     */
    public GetHotelGiftHisByGiftIDResponse createGetHotelGiftHisByGiftIDResponse() {
        return new GetHotelGiftHisByGiftIDResponse();
    }

    /**
     * Create an instance of {@link SaveNewHotelGiftResponse2 }
     * 
     */
    public SaveNewHotelGiftResponse2 createSaveNewHotelGiftResponse2() {
        return new SaveNewHotelGiftResponse2();
    }

    /**
     * Create an instance of {@link GetHotelGiftListByHotelID }
     * 
     */
    public GetHotelGiftListByHotelID createGetHotelGiftListByHotelID() {
        return new GetHotelGiftListByHotelID();
    }

    /**
     * Create an instance of {@link GetAllHotelGiftTypeResponse2 }
     * 
     */
    public GetAllHotelGiftTypeResponse2 createGetAllHotelGiftTypeResponse2() {
        return new GetAllHotelGiftTypeResponse2();
    }

    /**
     * Create an instance of {@link GetHotelGiftHisByGiftID }
     * 
     */
    public GetHotelGiftHisByGiftID createGetHotelGiftHisByGiftID() {
        return new GetHotelGiftHisByGiftID();
    }

    /**
     * Create an instance of {@link GetNewHotelGiftByGiftID }
     * 
     */
    public GetNewHotelGiftByGiftID createGetNewHotelGiftByGiftID() {
        return new GetNewHotelGiftByGiftID();
    }

    /**
     * Create an instance of {@link GetGiftTypeHisByTypeIDResponse }
     * 
     */
    public GetGiftTypeHisByTypeIDResponse createGetGiftTypeHisByTypeIDResponse() {
        return new GetGiftTypeHisByTypeIDResponse();
    }

    /**
     * Create an instance of {@link SaveNewHotelGift }
     * 
     */
    public SaveNewHotelGift createSaveNewHotelGift() {
        return new SaveNewHotelGift();
    }

    /**
     * Create an instance of {@link GetNewHotelGiftByGiftIDResponse }
     * 
     */
    public GetNewHotelGiftByGiftIDResponse createGetNewHotelGiftByGiftIDResponse() {
        return new GetNewHotelGiftByGiftIDResponse();
    }

    /**
     * Create an instance of {@link GetPreviewInfoFromGiftModel }
     * 
     */
    public GetPreviewInfoFromGiftModel createGetPreviewInfoFromGiftModel() {
        return new GetPreviewInfoFromGiftModel();
    }

    /**
     * Create an instance of {@link GetHotelGiftListByHotelIDResponse }
     * 
     */
    public GetHotelGiftListByHotelIDResponse createGetHotelGiftListByHotelIDResponse() {
        return new GetHotelGiftListByHotelIDResponse();
    }

    /**
     * Create an instance of {@link GetHotelGiftByGiftID }
     * 
     */
    public GetHotelGiftByGiftID createGetHotelGiftByGiftID() {
        return new GetHotelGiftByGiftID();
    }

    /**
     * Create an instance of {@link GetGiftTypeCheck }
     * 
     */
    public GetGiftTypeCheck createGetGiftTypeCheck() {
        return new GetGiftTypeCheck();
    }

    /**
     * Create an instance of {@link AddNewHotelGiftType }
     * 
     */
    public AddNewHotelGiftType createAddNewHotelGiftType() {
        return new AddNewHotelGiftType();
    }

    /**
     * Create an instance of {@link GetHotelGiftType }
     * 
     */
    public GetHotelGiftType createGetHotelGiftType() {
        return new GetHotelGiftType();
    }

    /**
     * Create an instance of {@link GetTwoHotelGiftType }
     * 
     */
    public GetTwoHotelGiftType createGetTwoHotelGiftType() {
        return new GetTwoHotelGiftType();
    }

    /**
     * Create an instance of {@link UpdateHotelGiftType }
     * 
     */
    public UpdateHotelGiftType createUpdateHotelGiftType() {
        return new UpdateHotelGiftType();
    }

    /**
     * Create an instance of {@link GetAllHotelGiftType }
     * 
     */
    public GetAllHotelGiftType createGetAllHotelGiftType() {
        return new GetAllHotelGiftType();
    }

    /**
     * Create an instance of {@link UpdateHotelGiftTypeResponse2 }
     * 
     */
    public UpdateHotelGiftTypeResponse2 createUpdateHotelGiftTypeResponse2() {
        return new UpdateHotelGiftTypeResponse2();
    }

    /**
     * Create an instance of {@link GetHotelGiftTypeResponse }
     * 
     */
    public GetHotelGiftTypeResponse createGetHotelGiftTypeResponse() {
        return new GetHotelGiftTypeResponse();
    }

    /**
     * Create an instance of {@link ArrayOfKeyValueOfstringArrayOfstringty7Ep6D1 .KeyValueOfstringArrayOfstringty7Ep6D1 }
     * 
     */
    public ArrayOfKeyValueOfstringArrayOfstringty7Ep6D1 .KeyValueOfstringArrayOfstringty7Ep6D1 createArrayOfKeyValueOfstringArrayOfstringty7Ep6D1KeyValueOfstringArrayOfstringty7Ep6D1() {
        return new ArrayOfKeyValueOfstringArrayOfstringty7Ep6D1 .KeyValueOfstringArrayOfstringty7Ep6D1();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "char")
    public JAXBElement<Integer> createChar(Integer value) {
        return new JAXBElement<Integer>(_Char_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetGiftInfoPreviewResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response.HotelGift", name = "GetGiftInfoPreviewResponse")
    public JAXBElement<GetGiftInfoPreviewResponse> createGetGiftInfoPreviewResponse(GetGiftInfoPreviewResponse value) {
        return new JAXBElement<GetGiftInfoPreviewResponse>(_GetGiftInfoPreviewResponse_QNAME, GetGiftInfoPreviewResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "long")
    public JAXBElement<Long> createLong(Long value) {
        return new JAXBElement<Long>(_Long_QNAME, Long.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRatePlan4GiftDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model", name = "ArrayOfRatePlan4GiftDetail")
    public JAXBElement<ArrayOfRatePlan4GiftDetail> createArrayOfRatePlan4GiftDetail(ArrayOfRatePlan4GiftDetail value) {
        return new JAXBElement<ArrayOfRatePlan4GiftDetail>(_ArrayOfRatePlan4GiftDetail_QNAME, ArrayOfRatePlan4GiftDetail.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveNewHotelGiftRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Request", name = "SaveNewHotelGiftRequest")
    public JAXBElement<SaveNewHotelGiftRequest> createSaveNewHotelGiftRequest(SaveNewHotelGiftRequest value) {
        return new JAXBElement<SaveNewHotelGiftRequest>(_SaveNewHotelGiftRequest_QNAME, SaveNewHotelGiftRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HotelGiftRelationDate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model", name = "HotelGiftRelationDate")
    public JAXBElement<HotelGiftRelationDate> createHotelGiftRelationDate(HotelGiftRelationDate value) {
        return new JAXBElement<HotelGiftRelationDate>(_HotelGiftRelationDate_QNAME, HotelGiftRelationDate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetHotelGiftDetailResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response.HotelGift", name = "GetHotelGiftDetailResponse")
    public JAXBElement<GetHotelGiftDetailResponse> createGetHotelGiftDetailResponse(GetHotelGiftDetailResponse value) {
        return new JAXBElement<GetHotelGiftDetailResponse>(_GetHotelGiftDetailResponse_QNAME, GetHotelGiftDetailResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfHotelGiftRelationProduct }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model", name = "ArrayOfHotelGiftRelationProduct")
    public JAXBElement<ArrayOfHotelGiftRelationProduct> createArrayOfHotelGiftRelationProduct(ArrayOfHotelGiftRelationProduct value) {
        return new JAXBElement<ArrayOfHotelGiftRelationProduct>(_ArrayOfHotelGiftRelationProduct_QNAME, ArrayOfHotelGiftRelationProduct.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HotelGiftHisModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model", name = "HotelGiftHisModel")
    public JAXBElement<HotelGiftHisModel> createHotelGiftHisModel(HotelGiftHisModel value) {
        return new JAXBElement<HotelGiftHisModel>(_HotelGiftHisModel_QNAME, HotelGiftHisModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HotelGiftDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model", name = "HotelGiftDetail")
    public JAXBElement<HotelGiftDetail> createHotelGiftDetail(HotelGiftDetail value) {
        return new JAXBElement<HotelGiftDetail>(_HotelGiftDetail_QNAME, HotelGiftDetail.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "anyType")
    public JAXBElement<Object> createAnyType(Object value) {
        return new JAXBElement<Object>(_AnyType_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveHotelGiftResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response", name = "SaveHotelGiftResponse")
    public JAXBElement<SaveHotelGiftResponse> createSaveHotelGiftResponse(SaveHotelGiftResponse value) {
        return new JAXBElement<SaveHotelGiftResponse>(_SaveHotelGiftResponse_QNAME, SaveHotelGiftResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link HotelGiftRelationProduct }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model", name = "HotelGiftRelationProduct")
    public JAXBElement<HotelGiftRelationProduct> createHotelGiftRelationProduct(HotelGiftRelationProduct value) {
        return new JAXBElement<HotelGiftRelationProduct>(_HotelGiftRelationProduct_QNAME, HotelGiftRelationProduct.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfHotelGiftAdditional }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model", name = "ArrayOfHotelGiftAdditional")
    public JAXBElement<ArrayOfHotelGiftAdditional> createArrayOfHotelGiftAdditional(ArrayOfHotelGiftAdditional value) {
        return new JAXBElement<ArrayOfHotelGiftAdditional>(_ArrayOfHotelGiftAdditional_QNAME, ArrayOfHotelGiftAdditional.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HotelGiftDateTypeEnum }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Enums", name = "HotelGiftDateTypeEnum")
    public JAXBElement<HotelGiftDateTypeEnum> createHotelGiftDateTypeEnum(HotelGiftDateTypeEnum value) {
        return new JAXBElement<HotelGiftDateTypeEnum>(_HotelGiftDateTypeEnum_QNAME, HotelGiftDateTypeEnum.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllHotelGiftTypeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response.HotelGift", name = "GetAllHotelGiftTypeResponse")
    public JAXBElement<GetAllHotelGiftTypeResponse> createGetAllHotelGiftTypeResponse(GetAllHotelGiftTypeResponse value) {
        return new JAXBElement<GetAllHotelGiftTypeResponse>(_GetAllHotelGiftTypeResponse_QNAME, GetAllHotelGiftTypeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfHotelGiftHisModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model", name = "ArrayOfHotelGiftHisModel")
    public JAXBElement<ArrayOfHotelGiftHisModel> createArrayOfHotelGiftHisModel(ArrayOfHotelGiftHisModel value) {
        return new JAXBElement<ArrayOfHotelGiftHisModel>(_ArrayOfHotelGiftHisModel_QNAME, ArrayOfHotelGiftHisModel.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfstringArrayOfstringty7Ep6D1 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/Arrays", name = "ArrayOfKeyValueOfstringArrayOfstringty7Ep6D1")
    public JAXBElement<ArrayOfKeyValueOfstringArrayOfstringty7Ep6D1> createArrayOfKeyValueOfstringArrayOfstringty7Ep6D1(ArrayOfKeyValueOfstringArrayOfstringty7Ep6D1 value) {
        return new JAXBElement<ArrayOfKeyValueOfstringArrayOfstringty7Ep6D1>(_ArrayOfKeyValueOfstringArrayOfstringty7Ep6D1_QNAME, ArrayOfKeyValueOfstringArrayOfstringty7Ep6D1 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HotelGiftSubType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model", name = "HotelGiftSubType")
    public JAXBElement<HotelGiftSubType> createHotelGiftSubType(HotelGiftSubType value) {
        return new JAXBElement<HotelGiftSubType>(_HotelGiftSubType_QNAME, HotelGiftSubType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfHotelGiftModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model", name = "ArrayOfHotelGiftModel")
    public JAXBElement<ArrayOfHotelGiftModel> createArrayOfHotelGiftModel(ArrayOfHotelGiftModel value) {
        return new JAXBElement<ArrayOfHotelGiftModel>(_ArrayOfHotelGiftModel_QNAME, ArrayOfHotelGiftModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfHotelGiftRelationDate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model", name = "ArrayOfHotelGiftRelationDate")
    public JAXBElement<ArrayOfHotelGiftRelationDate> createArrayOfHotelGiftRelationDate(ArrayOfHotelGiftRelationDate value) {
        return new JAXBElement<ArrayOfHotelGiftRelationDate>(_ArrayOfHotelGiftRelationDate_QNAME, ArrayOfHotelGiftRelationDate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HotelGiftType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model", name = "HotelGiftType")
    public JAXBElement<HotelGiftType> createHotelGiftType(HotelGiftType value) {
        return new JAXBElement<HotelGiftType>(_HotelGiftType_QNAME, HotelGiftType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfHotelProduct4GiftDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model", name = "ArrayOfHotelProduct4GiftDetail")
    public JAXBElement<ArrayOfHotelProduct4GiftDetail> createArrayOfHotelProduct4GiftDetail(ArrayOfHotelProduct4GiftDetail value) {
        return new JAXBElement<ArrayOfHotelProduct4GiftDetail>(_ArrayOfHotelProduct4GiftDetail_QNAME, ArrayOfHotelProduct4GiftDetail.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link DateTime }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "dateTime")
    @XmlJavaTypeAdapter(Adapter1 .class)
    public JAXBElement<DateTime> createDateTime(DateTime value) {
        return new JAXBElement<DateTime>(_DateTime_QNAME, DateTime.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HotelGiftModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model", name = "HotelGiftModel")
    public JAXBElement<HotelGiftModel> createHotelGiftModel(HotelGiftModel value) {
        return new JAXBElement<HotelGiftModel>(_HotelGiftModel_QNAME, HotelGiftModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateHotelGiftTypeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response.HotelGift", name = "UpdateHotelGiftTypeResponse")
    public JAXBElement<UpdateHotelGiftTypeResponse> createUpdateHotelGiftTypeResponse(UpdateHotelGiftTypeResponse value) {
        return new JAXBElement<UpdateHotelGiftTypeResponse>(_UpdateHotelGiftTypeResponse_QNAME, UpdateHotelGiftTypeResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponseResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Framework", name = "ResponseResult")
    public JAXBElement<ResponseResult> createResponseResult(ResponseResult value) {
        return new JAXBElement<ResponseResult>(_ResponseResult_QNAME, ResponseResult.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNewHotelGiftDetailResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response.HotelGift", name = "GetNewHotelGiftDetailResponse")
    public JAXBElement<GetNewHotelGiftDetailResponse> createGetNewHotelGiftDetailResponse(GetNewHotelGiftDetailResponse value) {
        return new JAXBElement<GetNewHotelGiftDetailResponse>(_GetNewHotelGiftDetailResponse_QNAME, GetNewHotelGiftDetailResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetHotelGiftHisListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response.HotelGift", name = "GetHotelGiftHisListResponse")
    public JAXBElement<GetHotelGiftHisListResponse> createGetHotelGiftHisListResponse(GetHotelGiftHisListResponse value) {
        return new JAXBElement<GetHotelGiftHisListResponse>(_GetHotelGiftHisListResponse_QNAME, GetHotelGiftHisListResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveHotelGiftRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Request", name = "SaveHotelGiftRequest")
    public JAXBElement<SaveHotelGiftRequest> createSaveHotelGiftRequest(SaveHotelGiftRequest value) {
        return new JAXBElement<SaveHotelGiftRequest>(_SaveHotelGiftRequest_QNAME, SaveHotelGiftRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateHotelGiftTypeRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Request", name = "UpdateHotelGiftTypeRequest")
    public JAXBElement<UpdateHotelGiftTypeRequest> createUpdateHotelGiftTypeRequest(UpdateHotelGiftTypeRequest value) {
        return new JAXBElement<UpdateHotelGiftTypeRequest>(_UpdateHotelGiftTypeRequest_QNAME, UpdateHotelGiftTypeRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetHotelGiftListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response.HotelGift", name = "GetHotelGiftListResponse")
    public JAXBElement<GetHotelGiftListResponse> createGetHotelGiftListResponse(GetHotelGiftListResponse value) {
        return new JAXBElement<GetHotelGiftListResponse>(_GetHotelGiftListResponse_QNAME, GetHotelGiftListResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedInt")
    public JAXBElement<Long> createUnsignedInt(Long value) {
        return new JAXBElement<Long>(_UnsignedInt_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RatePlan4GiftDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model", name = "RatePlan4GiftDetail")
    public JAXBElement<RatePlan4GiftDetail> createRatePlan4GiftDetail(RatePlan4GiftDetail value) {
        return new JAXBElement<RatePlan4GiftDetail>(_RatePlan4GiftDetail_QNAME, RatePlan4GiftDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTwoHotelGiftTypeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response.HotelGift", name = "GetTwoHotelGiftTypeResponse")
    public JAXBElement<GetTwoHotelGiftTypeResponse> createGetTwoHotelGiftTypeResponse(GetTwoHotelGiftTypeResponse value) {
        return new JAXBElement<GetTwoHotelGiftTypeResponse>(_GetTwoHotelGiftTypeResponse_QNAME, GetTwoHotelGiftTypeResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/Arrays", name = "ArrayOfstring")
    public JAXBElement<ArrayOfstring> createArrayOfstring(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_ArrayOfstring_QNAME, ArrayOfstring.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NewHotelGiftModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model", name = "NewHotelGiftModel")
    public JAXBElement<NewHotelGiftModel> createNewHotelGiftModel(NewHotelGiftModel value) {
        return new JAXBElement<NewHotelGiftModel>(_NewHotelGiftModel_QNAME, NewHotelGiftModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfHotelGiftSubType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model", name = "ArrayOfHotelGiftSubType")
    public JAXBElement<ArrayOfHotelGiftSubType> createArrayOfHotelGiftSubType(ArrayOfHotelGiftSubType value) {
        return new JAXBElement<ArrayOfHotelGiftSubType>(_ArrayOfHotelGiftSubType_QNAME, ArrayOfHotelGiftSubType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HotelProduct4GiftDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model", name = "HotelProduct4GiftDetail")
    public JAXBElement<HotelProduct4GiftDetail> createHotelProduct4GiftDetail(HotelProduct4GiftDetail value) {
        return new JAXBElement<HotelProduct4GiftDetail>(_HotelProduct4GiftDetail_QNAME, HotelProduct4GiftDetail.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GetGiftTypeCheckResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response.HotelGift", name = "GetGiftTypeCheckResponse")
    public JAXBElement<GetGiftTypeCheckResponse> createGetGiftTypeCheckResponse(GetGiftTypeCheckResponse value) {
        return new JAXBElement<GetGiftTypeCheckResponse>(_GetGiftTypeCheckResponse_QNAME, GetGiftTypeCheckResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link HotelGiftAdditional }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model", name = "HotelGiftAdditional")
    public JAXBElement<HotelGiftAdditional> createHotelGiftAdditional(HotelGiftAdditional value) {
        return new JAXBElement<HotelGiftAdditional>(_HotelGiftAdditional_QNAME, HotelGiftAdditional.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NewHotelGiftDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model", name = "NewHotelGiftDetail")
    public JAXBElement<NewHotelGiftDetail> createNewHotelGiftDetail(NewHotelGiftDetail value) {
        return new JAXBElement<NewHotelGiftDetail>(_NewHotelGiftDetail_QNAME, NewHotelGiftDetail.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link HotelGiftHourTypeEnum }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Enums", name = "HotelGiftHourTypeEnum")
    public JAXBElement<HotelGiftHourTypeEnum> createHotelGiftHourTypeEnum(HotelGiftHourTypeEnum value) {
        return new JAXBElement<HotelGiftHourTypeEnum>(_HotelGiftHourTypeEnum_QNAME, HotelGiftHourTypeEnum.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfHotelGiftType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model", name = "ArrayOfHotelGiftType")
    public JAXBElement<ArrayOfHotelGiftType> createArrayOfHotelGiftType(ArrayOfHotelGiftType value) {
        return new JAXBElement<ArrayOfHotelGiftType>(_ArrayOfHotelGiftType_QNAME, ArrayOfHotelGiftType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveNewHotelGiftResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response", name = "SaveNewHotelGiftResponse")
    public JAXBElement<SaveNewHotelGiftResponse> createSaveNewHotelGiftResponse(SaveNewHotelGiftResponse value) {
        return new JAXBElement<SaveNewHotelGiftResponse>(_SaveNewHotelGiftResponse_QNAME, SaveNewHotelGiftResponse.class, null, value);
    }

}
