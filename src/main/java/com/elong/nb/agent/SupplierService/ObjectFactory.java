
package com.elong.nb.agent.SupplierService;

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
 * generated in the com.elong.nb.agent.SupplierService package. 
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
    private final static QName _SupplierStatus_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Enums", "SupplierStatus");
    private final static QName _CheckSupplierByNameAbbrRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Request", "CheckSupplierByNameAbbrRequest");
    private final static QName _Char_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "char");
    private final static QName _InsertSupplierInfoResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response", "InsertSupplierInfoResponse");
    private final static QName _SettlementCycleEnum_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Enums", "SettlementCycleEnum");
    private final static QName _Float_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "float");
    private final static QName _Long_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "long");
    private final static QName _ReceiveAccountType_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Enums", "ReceiveAccountType");
    private final static QName _GetNameStrategyInfoResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response.Supplier", "GetNameStrategyInfoResponse");
    private final static QName _Base64Binary_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "base64Binary");
    private final static QName _IsCtripSupplierResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response.Supplier", "IsCtripSupplierResponse");
    private final static QName _ArrayOfNewSupplierInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model", "ArrayOfNewSupplierInfo");
    private final static QName _Byte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "byte");
    private final static QName _AccountPayType_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Enums", "AccountPayType");
    private final static QName _Boolean_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "boolean");
    private final static QName _SupplierRMBBankInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model", "SupplierRMBBankInfo");
    private final static QName _GetSupplierInfoBySupplierIDResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response", "GetSupplierInfoBySupplierIDResponse");
    private final static QName _BillNoticeType_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Enums", "BillNoticeType");
    private final static QName _NameStrategyInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model", "NameStrategyInfo");
    private final static QName _SettlementBankType_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Enums", "SettlementBankType");
    private final static QName _GetSupplierListByParamsRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Request", "GetSupplierListByParamsRequest");
    private final static QName _UnsignedByte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedByte");
    private final static QName _AnyType_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyType");
    private final static QName _SupplierBaseInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model", "SupplierBaseInfo");
    private final static QName _NewSupplierInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model", "NewSupplierInfo");
    private final static QName _HotelInfoDB_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model", "HotelInfoDB");
    private final static QName _ArrayOfHotelInfoDB_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model", "ArrayOfHotelInfoDB");
    private final static QName _Int_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "int");
    private final static QName _GetSupplierAllInfoIntResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response", "GetSupplierAllInfoIntResponse");
    private final static QName _IsQunarSupplierRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Request", "IsQunarSupplierRequest");
    private final static QName _SupplierInfoInt_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model", "SupplierInfoInt");
    private final static QName _SupplierInvoiceInfoInt_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model", "SupplierInvoiceInfoInt");
    private final static QName _Double_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "double");
    private final static QName _IsCtripSupplierRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Request.Supplier", "IsCtripSupplierRequest");
    private final static QName _GetSupplierAllInfoResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response", "GetSupplierAllInfoResponse");
    private final static QName _CurrencyType_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Enums", "CurrencyType");
    private final static QName _UpdateSupplierInfoRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Request", "UpdateSupplierInfoRequest");
    private final static QName _ArrayOfint_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOfint");
    private final static QName _ArrayOfSupplierInfoInt_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model", "ArrayOfSupplierInfoInt");
    private final static QName _DeleteNameStrategyInfoRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Request.Supplier", "DeleteNameStrategyInfoRequest");
    private final static QName _BankDicInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model", "BankDicInfo");
    private final static QName _GetNameStrategyInfoRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Request.Supplier", "GetNameStrategyInfoRequest");
    private final static QName _ProductRequestBase_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Request", "ProductRequestBase");
    private final static QName _GetSupplierInfoBySupplierIDIntResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response", "GetSupplierInfoBySupplierIDIntResponse");
    private final static QName _GetSupplierInfoBySupplierIDRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Request", "GetSupplierInfoBySupplierIDRequest");
    private final static QName _InsertNameStrategyInfoResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response.Supplier", "InsertNameStrategyInfoResponse");
    private final static QName _SupplierInvoiceInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model", "SupplierInvoiceInfo");
    private final static QName _DateTime_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "dateTime");
    private final static QName _QName_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "QName");
    private final static QName _UnsignedShort_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedShort");
    private final static QName _ResponseResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Framework", "ResponseResult");
    private final static QName _ArrayOfBankDicInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model", "ArrayOfBankDicInfo");
    private final static QName _InsertSupplierInfoRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Request", "InsertSupplierInfoRequest");
    private final static QName _InsertNameStrategyInfoRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Request.Supplier", "InsertNameStrategyInfoRequest");
    private final static QName _Short_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "short");
    private final static QName _DeleteNameStrategyInfoResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response.Supplier", "DeleteNameStrategyInfoResponse");
    private final static QName _AgreementEntityInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model", "AgreementEntityInfo");
    private final static QName _AccountPayeeType_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Enums", "AccountPayeeType");
    private final static QName _ServiceResponseBase_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Framework", "ServiceResponseBase");
    private final static QName _SupplierForeignCurrencyBankInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model", "SupplierForeignCurrencyBankInfo");
    private final static QName _SupplierSettlementInfoInt_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model", "SupplierSettlementInfoInt");
    private final static QName _IsQunarSupplierResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response.Supplier", "IsQunarSupplierResponse");
    private final static QName _UnsignedInt_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedInt");
    private final static QName _SupplierBaseInfoInt_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model", "SupplierBaseInfoInt");
    private final static QName _SupplierRMBBankInfoInt_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model", "SupplierRMBBankInfoInt");
    private final static QName _GetAllAgreementEntityResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response", "GetAllAgreementEntityResponse");
    private final static QName _Decimal_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "decimal");
    private final static QName _DefaultResponseResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response", "DefaultResponseResult");
    private final static QName _Guid_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "guid");
    private final static QName _ArrayOfAgreementEntityInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model", "ArrayOfAgreementEntityInfo");
    private final static QName _UpdateSupplierStatusRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Request", "UpdateSupplierStatusRequest");
    private final static QName _Duration_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "duration");
    private final static QName _CheckSupplierByNameAbbrResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response", "CheckSupplierByNameAbbrResponse");
    private final static QName _SettlementModle_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Enums", "SettlementModle");
    private final static QName _String_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "string");
    private final static QName _GetAllBankDicInfoResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response", "GetAllBankDicInfoResponse");
    private final static QName _UnsignedLong_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedLong");
    private final static QName _SupplierSettlementInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model", "SupplierSettlementInfo");
    private final static QName _InvoiceMode_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Enums", "InvoiceMode");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.elong.nb.agent.SupplierService
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link IsQunarSupplierResponse }
     * 
     */
    public IsQunarSupplierResponse createIsQunarSupplierResponse() {
        return new IsQunarSupplierResponse();
    }

    /**
     * Create an instance of {@link IsCtripSupplierResponse }
     * 
     */
    public IsCtripSupplierResponse createIsCtripSupplierResponse() {
        return new IsCtripSupplierResponse();
    }

    /**
     * Create an instance of {@link GetNameStrategyInfoResponse }
     * 
     */
    public GetNameStrategyInfoResponse createGetNameStrategyInfoResponse() {
        return new GetNameStrategyInfoResponse();
    }

    /**
     * Create an instance of {@link InsertNameStrategyInfoResponse }
     * 
     */
    public InsertNameStrategyInfoResponse createInsertNameStrategyInfoResponse() {
        return new InsertNameStrategyInfoResponse();
    }

    /**
     * Create an instance of {@link DeleteNameStrategyInfoResponse }
     * 
     */
    public DeleteNameStrategyInfoResponse createDeleteNameStrategyInfoResponse() {
        return new DeleteNameStrategyInfoResponse();
    }

    /**
     * Create an instance of {@link GetSupplierAllInfoIntResponse }
     * 
     */
    public GetSupplierAllInfoIntResponse createGetSupplierAllInfoIntResponse() {
        return new GetSupplierAllInfoIntResponse();
    }

    /**
     * Create an instance of {@link GetAllAgreementEntityResponse }
     * 
     */
    public GetAllAgreementEntityResponse createGetAllAgreementEntityResponse() {
        return new GetAllAgreementEntityResponse();
    }

    /**
     * Create an instance of {@link GetSupplierInfoBySupplierIDResponse }
     * 
     */
    public GetSupplierInfoBySupplierIDResponse createGetSupplierInfoBySupplierIDResponse() {
        return new GetSupplierInfoBySupplierIDResponse();
    }

    /**
     * Create an instance of {@link DefaultResponseResult }
     * 
     */
    public DefaultResponseResult createDefaultResponseResult() {
        return new DefaultResponseResult();
    }

    /**
     * Create an instance of {@link GetSupplierInfoBySupplierIDIntResponse }
     * 
     */
    public GetSupplierInfoBySupplierIDIntResponse createGetSupplierInfoBySupplierIDIntResponse() {
        return new GetSupplierInfoBySupplierIDIntResponse();
    }

    /**
     * Create an instance of {@link GetSupplierAllInfoResponse }
     * 
     */
    public GetSupplierAllInfoResponse createGetSupplierAllInfoResponse() {
        return new GetSupplierAllInfoResponse();
    }

    /**
     * Create an instance of {@link CheckSupplierByNameAbbrResponse }
     * 
     */
    public CheckSupplierByNameAbbrResponse createCheckSupplierByNameAbbrResponse() {
        return new CheckSupplierByNameAbbrResponse();
    }

    /**
     * Create an instance of {@link GetAllBankDicInfoResponse }
     * 
     */
    public GetAllBankDicInfoResponse createGetAllBankDicInfoResponse() {
        return new GetAllBankDicInfoResponse();
    }

    /**
     * Create an instance of {@link InsertSupplierInfoResponse }
     * 
     */
    public InsertSupplierInfoResponse createInsertSupplierInfoResponse() {
        return new InsertSupplierInfoResponse();
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
     * Create an instance of {@link SupplierBaseInfoInt }
     * 
     */
    public SupplierBaseInfoInt createSupplierBaseInfoInt() {
        return new SupplierBaseInfoInt();
    }

    /**
     * Create an instance of {@link SupplierSettlementInfoInt }
     * 
     */
    public SupplierSettlementInfoInt createSupplierSettlementInfoInt() {
        return new SupplierSettlementInfoInt();
    }

    /**
     * Create an instance of {@link SupplierForeignCurrencyBankInfo }
     * 
     */
    public SupplierForeignCurrencyBankInfo createSupplierForeignCurrencyBankInfo() {
        return new SupplierForeignCurrencyBankInfo();
    }

    /**
     * Create an instance of {@link ArrayOfHotelInfoDB }
     * 
     */
    public ArrayOfHotelInfoDB createArrayOfHotelInfoDB() {
        return new ArrayOfHotelInfoDB();
    }

    /**
     * Create an instance of {@link HotelInfoDB }
     * 
     */
    public HotelInfoDB createHotelInfoDB() {
        return new HotelInfoDB();
    }

    /**
     * Create an instance of {@link NewSupplierInfo }
     * 
     */
    public NewSupplierInfo createNewSupplierInfo() {
        return new NewSupplierInfo();
    }

    /**
     * Create an instance of {@link SupplierBaseInfo }
     * 
     */
    public SupplierBaseInfo createSupplierBaseInfo() {
        return new SupplierBaseInfo();
    }

    /**
     * Create an instance of {@link NameStrategyInfo }
     * 
     */
    public NameStrategyInfo createNameStrategyInfo() {
        return new NameStrategyInfo();
    }

    /**
     * Create an instance of {@link SupplierInvoiceInfo }
     * 
     */
    public SupplierInvoiceInfo createSupplierInvoiceInfo() {
        return new SupplierInvoiceInfo();
    }

    /**
     * Create an instance of {@link SupplierInvoiceInfoInt }
     * 
     */
    public SupplierInvoiceInfoInt createSupplierInvoiceInfoInt() {
        return new SupplierInvoiceInfoInt();
    }

    /**
     * Create an instance of {@link SupplierRMBBankInfoInt }
     * 
     */
    public SupplierRMBBankInfoInt createSupplierRMBBankInfoInt() {
        return new SupplierRMBBankInfoInt();
    }

    /**
     * Create an instance of {@link ArrayOfBankDicInfo }
     * 
     */
    public ArrayOfBankDicInfo createArrayOfBankDicInfo() {
        return new ArrayOfBankDicInfo();
    }

    /**
     * Create an instance of {@link SupplierInfoInt }
     * 
     */
    public SupplierInfoInt createSupplierInfoInt() {
        return new SupplierInfoInt();
    }

    /**
     * Create an instance of {@link ArrayOfNewSupplierInfo }
     * 
     */
    public ArrayOfNewSupplierInfo createArrayOfNewSupplierInfo() {
        return new ArrayOfNewSupplierInfo();
    }

    /**
     * Create an instance of {@link ArrayOfAgreementEntityInfo }
     * 
     */
    public ArrayOfAgreementEntityInfo createArrayOfAgreementEntityInfo() {
        return new ArrayOfAgreementEntityInfo();
    }

    /**
     * Create an instance of {@link SupplierRMBBankInfo }
     * 
     */
    public SupplierRMBBankInfo createSupplierRMBBankInfo() {
        return new SupplierRMBBankInfo();
    }

    /**
     * Create an instance of {@link BankDicInfo }
     * 
     */
    public BankDicInfo createBankDicInfo() {
        return new BankDicInfo();
    }

    /**
     * Create an instance of {@link SupplierSettlementInfo }
     * 
     */
    public SupplierSettlementInfo createSupplierSettlementInfo() {
        return new SupplierSettlementInfo();
    }

    /**
     * Create an instance of {@link AgreementEntityInfo }
     * 
     */
    public AgreementEntityInfo createAgreementEntityInfo() {
        return new AgreementEntityInfo();
    }

    /**
     * Create an instance of {@link ArrayOfSupplierInfoInt }
     * 
     */
    public ArrayOfSupplierInfoInt createArrayOfSupplierInfoInt() {
        return new ArrayOfSupplierInfoInt();
    }

    /**
     * Create an instance of {@link InsertNameStrategyInfoRequest }
     * 
     */
    public InsertNameStrategyInfoRequest createInsertNameStrategyInfoRequest() {
        return new InsertNameStrategyInfoRequest();
    }

    /**
     * Create an instance of {@link IsCtripSupplierRequest }
     * 
     */
    public IsCtripSupplierRequest createIsCtripSupplierRequest() {
        return new IsCtripSupplierRequest();
    }

    /**
     * Create an instance of {@link GetNameStrategyInfoRequest }
     * 
     */
    public GetNameStrategyInfoRequest createGetNameStrategyInfoRequest() {
        return new GetNameStrategyInfoRequest();
    }

    /**
     * Create an instance of {@link DeleteNameStrategyInfoRequest }
     * 
     */
    public DeleteNameStrategyInfoRequest createDeleteNameStrategyInfoRequest() {
        return new DeleteNameStrategyInfoRequest();
    }

    /**
     * Create an instance of {@link IsQunarSupplierRequest }
     * 
     */
    public IsQunarSupplierRequest createIsQunarSupplierRequest() {
        return new IsQunarSupplierRequest();
    }

    /**
     * Create an instance of {@link GetSupplierInfoBySupplierIDRequest }
     * 
     */
    public GetSupplierInfoBySupplierIDRequest createGetSupplierInfoBySupplierIDRequest() {
        return new GetSupplierInfoBySupplierIDRequest();
    }

    /**
     * Create an instance of {@link InsertSupplierInfoRequest }
     * 
     */
    public InsertSupplierInfoRequest createInsertSupplierInfoRequest() {
        return new InsertSupplierInfoRequest();
    }

    /**
     * Create an instance of {@link ProductRequestBase }
     * 
     */
    public ProductRequestBase createProductRequestBase() {
        return new ProductRequestBase();
    }

    /**
     * Create an instance of {@link GetSupplierListByParamsRequest }
     * 
     */
    public GetSupplierListByParamsRequest createGetSupplierListByParamsRequest() {
        return new GetSupplierListByParamsRequest();
    }

    /**
     * Create an instance of {@link CheckSupplierByNameAbbrRequest }
     * 
     */
    public CheckSupplierByNameAbbrRequest createCheckSupplierByNameAbbrRequest() {
        return new CheckSupplierByNameAbbrRequest();
    }

    /**
     * Create an instance of {@link UpdateSupplierStatusRequest }
     * 
     */
    public UpdateSupplierStatusRequest createUpdateSupplierStatusRequest() {
        return new UpdateSupplierStatusRequest();
    }

    /**
     * Create an instance of {@link UpdateSupplierInfoRequest }
     * 
     */
    public UpdateSupplierInfoRequest createUpdateSupplierInfoRequest() {
        return new UpdateSupplierInfoRequest();
    }

    /**
     * Create an instance of {@link ArrayOfint }
     * 
     */
    public ArrayOfint createArrayOfint() {
        return new ArrayOfint();
    }

    /**
     * Create an instance of {@link GetAllAgreementEntityResponse2 }
     * 
     */
    public GetAllAgreementEntityResponse2 createGetAllAgreementEntityResponse2() {
        return new GetAllAgreementEntityResponse2();
    }

    /**
     * Create an instance of {@link GetAllBankDicInfo }
     * 
     */
    public GetAllBankDicInfo createGetAllBankDicInfo() {
        return new GetAllBankDicInfo();
    }

    /**
     * Create an instance of {@link CheckSupplierByNameAbbr }
     * 
     */
    public CheckSupplierByNameAbbr createCheckSupplierByNameAbbr() {
        return new CheckSupplierByNameAbbr();
    }

    /**
     * Create an instance of {@link InsertSupplierInfo }
     * 
     */
    public InsertSupplierInfo createInsertSupplierInfo() {
        return new InsertSupplierInfo();
    }

    /**
     * Create an instance of {@link InsertNameStrategyInfo }
     * 
     */
    public InsertNameStrategyInfo createInsertNameStrategyInfo() {
        return new InsertNameStrategyInfo();
    }

    /**
     * Create an instance of {@link GetNameStrategyInfo }
     * 
     */
    public GetNameStrategyInfo createGetNameStrategyInfo() {
        return new GetNameStrategyInfo();
    }

    /**
     * Create an instance of {@link GetSupplierList4PageResponse }
     * 
     */
    public GetSupplierList4PageResponse createGetSupplierList4PageResponse() {
        return new GetSupplierList4PageResponse();
    }

    /**
     * Create an instance of {@link GetSupplierListInt }
     * 
     */
    public GetSupplierListInt createGetSupplierListInt() {
        return new GetSupplierListInt();
    }

    /**
     * Create an instance of {@link GetSupplierListResponse }
     * 
     */
    public GetSupplierListResponse createGetSupplierListResponse() {
        return new GetSupplierListResponse();
    }

    /**
     * Create an instance of {@link GetSupplierList4Page }
     * 
     */
    public GetSupplierList4Page createGetSupplierList4Page() {
        return new GetSupplierList4Page();
    }

    /**
     * Create an instance of {@link UpdateSupplierInfo }
     * 
     */
    public UpdateSupplierInfo createUpdateSupplierInfo() {
        return new UpdateSupplierInfo();
    }

    /**
     * Create an instance of {@link GetSupplierInfoResponse }
     * 
     */
    public GetSupplierInfoResponse createGetSupplierInfoResponse() {
        return new GetSupplierInfoResponse();
    }

    /**
     * Create an instance of {@link IsCtripSupplierResponse2 }
     * 
     */
    public IsCtripSupplierResponse2 createIsCtripSupplierResponse2() {
        return new IsCtripSupplierResponse2();
    }

    /**
     * Create an instance of {@link GetNameStrategyInfoResponse2 }
     * 
     */
    public GetNameStrategyInfoResponse2 createGetNameStrategyInfoResponse2() {
        return new GetNameStrategyInfoResponse2();
    }

    /**
     * Create an instance of {@link GetSupplierListIntResponse }
     * 
     */
    public GetSupplierListIntResponse createGetSupplierListIntResponse() {
        return new GetSupplierListIntResponse();
    }

    /**
     * Create an instance of {@link GetSupplierList }
     * 
     */
    public GetSupplierList createGetSupplierList() {
        return new GetSupplierList();
    }

    /**
     * Create an instance of {@link GetSupplierInfoBySupplierIDIntResponse2 }
     * 
     */
    public GetSupplierInfoBySupplierIDIntResponse2 createGetSupplierInfoBySupplierIDIntResponse2() {
        return new GetSupplierInfoBySupplierIDIntResponse2();
    }

    /**
     * Create an instance of {@link IsQunarSupplier }
     * 
     */
    public IsQunarSupplier createIsQunarSupplier() {
        return new IsQunarSupplier();
    }

    /**
     * Create an instance of {@link CheckSupplierByNameAbbrResponse2 }
     * 
     */
    public CheckSupplierByNameAbbrResponse2 createCheckSupplierByNameAbbrResponse2() {
        return new CheckSupplierByNameAbbrResponse2();
    }

    /**
     * Create an instance of {@link IsCtripSupplier }
     * 
     */
    public IsCtripSupplier createIsCtripSupplier() {
        return new IsCtripSupplier();
    }

    /**
     * Create an instance of {@link GetSupplierInfoBySupplierIDForMISResponse }
     * 
     */
    public GetSupplierInfoBySupplierIDForMISResponse createGetSupplierInfoBySupplierIDForMISResponse() {
        return new GetSupplierInfoBySupplierIDForMISResponse();
    }

    /**
     * Create an instance of {@link DeleteNameStrategyInfoResponse2 }
     * 
     */
    public DeleteNameStrategyInfoResponse2 createDeleteNameStrategyInfoResponse2() {
        return new DeleteNameStrategyInfoResponse2();
    }

    /**
     * Create an instance of {@link GetSupplierInfoBySupplierID }
     * 
     */
    public GetSupplierInfoBySupplierID createGetSupplierInfoBySupplierID() {
        return new GetSupplierInfoBySupplierID();
    }

    /**
     * Create an instance of {@link GetAllBankDicInfoResponse2 }
     * 
     */
    public GetAllBankDicInfoResponse2 createGetAllBankDicInfoResponse2() {
        return new GetAllBankDicInfoResponse2();
    }

    /**
     * Create an instance of {@link IsQunarSupplierResponse2 }
     * 
     */
    public IsQunarSupplierResponse2 createIsQunarSupplierResponse2() {
        return new IsQunarSupplierResponse2();
    }

    /**
     * Create an instance of {@link DeleteNameStrategyInfo }
     * 
     */
    public DeleteNameStrategyInfo createDeleteNameStrategyInfo() {
        return new DeleteNameStrategyInfo();
    }

    /**
     * Create an instance of {@link GetSupplierInfoBySupplierIDInt }
     * 
     */
    public GetSupplierInfoBySupplierIDInt createGetSupplierInfoBySupplierIDInt() {
        return new GetSupplierInfoBySupplierIDInt();
    }

    /**
     * Create an instance of {@link GetAllAgreementEntity }
     * 
     */
    public GetAllAgreementEntity createGetAllAgreementEntity() {
        return new GetAllAgreementEntity();
    }

    /**
     * Create an instance of {@link InsertSupplierInfoResponse2 }
     * 
     */
    public InsertSupplierInfoResponse2 createInsertSupplierInfoResponse2() {
        return new InsertSupplierInfoResponse2();
    }

    /**
     * Create an instance of {@link UpdateSupplierStatusResponse }
     * 
     */
    public UpdateSupplierStatusResponse createUpdateSupplierStatusResponse() {
        return new UpdateSupplierStatusResponse();
    }

    /**
     * Create an instance of {@link GetSupplierInfo }
     * 
     */
    public GetSupplierInfo createGetSupplierInfo() {
        return new GetSupplierInfo();
    }

    /**
     * Create an instance of {@link UpdateSupplierStatus }
     * 
     */
    public UpdateSupplierStatus createUpdateSupplierStatus() {
        return new UpdateSupplierStatus();
    }

    /**
     * Create an instance of {@link UpdateSupplierInfoResponse }
     * 
     */
    public UpdateSupplierInfoResponse createUpdateSupplierInfoResponse() {
        return new UpdateSupplierInfoResponse();
    }

    /**
     * Create an instance of {@link GetSupplierInfoBySupplierIDResponse2 }
     * 
     */
    public GetSupplierInfoBySupplierIDResponse2 createGetSupplierInfoBySupplierIDResponse2() {
        return new GetSupplierInfoBySupplierIDResponse2();
    }

    /**
     * Create an instance of {@link GetSupplierInfoBySupplierIDForMIS }
     * 
     */
    public GetSupplierInfoBySupplierIDForMIS createGetSupplierInfoBySupplierIDForMIS() {
        return new GetSupplierInfoBySupplierIDForMIS();
    }

    /**
     * Create an instance of {@link InsertNameStrategyInfoResponse2 }
     * 
     */
    public InsertNameStrategyInfoResponse2 createInsertNameStrategyInfoResponse2() {
        return new InsertNameStrategyInfoResponse2();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link SupplierStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Enums", name = "SupplierStatus")
    public JAXBElement<SupplierStatus> createSupplierStatus(SupplierStatus value) {
        return new JAXBElement<SupplierStatus>(_SupplierStatus_QNAME, SupplierStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckSupplierByNameAbbrRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Request", name = "CheckSupplierByNameAbbrRequest")
    public JAXBElement<CheckSupplierByNameAbbrRequest> createCheckSupplierByNameAbbrRequest(CheckSupplierByNameAbbrRequest value) {
        return new JAXBElement<CheckSupplierByNameAbbrRequest>(_CheckSupplierByNameAbbrRequest_QNAME, CheckSupplierByNameAbbrRequest.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertSupplierInfoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response", name = "InsertSupplierInfoResponse")
    public JAXBElement<InsertSupplierInfoResponse> createInsertSupplierInfoResponse(InsertSupplierInfoResponse value) {
        return new JAXBElement<InsertSupplierInfoResponse>(_InsertSupplierInfoResponse_QNAME, InsertSupplierInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SettlementCycleEnum }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Enums", name = "SettlementCycleEnum")
    public JAXBElement<SettlementCycleEnum> createSettlementCycleEnum(SettlementCycleEnum value) {
        return new JAXBElement<SettlementCycleEnum>(_SettlementCycleEnum_QNAME, SettlementCycleEnum.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ReceiveAccountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Enums", name = "ReceiveAccountType")
    public JAXBElement<ReceiveAccountType> createReceiveAccountType(ReceiveAccountType value) {
        return new JAXBElement<ReceiveAccountType>(_ReceiveAccountType_QNAME, ReceiveAccountType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNameStrategyInfoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response.Supplier", name = "GetNameStrategyInfoResponse")
    public JAXBElement<GetNameStrategyInfoResponse> createGetNameStrategyInfoResponse(GetNameStrategyInfoResponse value) {
        return new JAXBElement<GetNameStrategyInfoResponse>(_GetNameStrategyInfoResponse_QNAME, GetNameStrategyInfoResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link IsCtripSupplierResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response.Supplier", name = "IsCtripSupplierResponse")
    public JAXBElement<IsCtripSupplierResponse> createIsCtripSupplierResponse(IsCtripSupplierResponse value) {
        return new JAXBElement<IsCtripSupplierResponse>(_IsCtripSupplierResponse_QNAME, IsCtripSupplierResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfNewSupplierInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model", name = "ArrayOfNewSupplierInfo")
    public JAXBElement<ArrayOfNewSupplierInfo> createArrayOfNewSupplierInfo(ArrayOfNewSupplierInfo value) {
        return new JAXBElement<ArrayOfNewSupplierInfo>(_ArrayOfNewSupplierInfo_QNAME, ArrayOfNewSupplierInfo.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link AccountPayType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Enums", name = "AccountPayType")
    public JAXBElement<AccountPayType> createAccountPayType(AccountPayType value) {
        return new JAXBElement<AccountPayType>(_AccountPayType_QNAME, AccountPayType.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link SupplierRMBBankInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model", name = "SupplierRMBBankInfo")
    public JAXBElement<SupplierRMBBankInfo> createSupplierRMBBankInfo(SupplierRMBBankInfo value) {
        return new JAXBElement<SupplierRMBBankInfo>(_SupplierRMBBankInfo_QNAME, SupplierRMBBankInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSupplierInfoBySupplierIDResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response", name = "GetSupplierInfoBySupplierIDResponse")
    public JAXBElement<GetSupplierInfoBySupplierIDResponse> createGetSupplierInfoBySupplierIDResponse(GetSupplierInfoBySupplierIDResponse value) {
        return new JAXBElement<GetSupplierInfoBySupplierIDResponse>(_GetSupplierInfoBySupplierIDResponse_QNAME, GetSupplierInfoBySupplierIDResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link String }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Enums", name = "BillNoticeType")
    public JAXBElement<List<String>> createBillNoticeType(List<String> value) {
        return new JAXBElement<List<String>>(_BillNoticeType_QNAME, ((Class) List.class), null, ((List<String> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NameStrategyInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model", name = "NameStrategyInfo")
    public JAXBElement<NameStrategyInfo> createNameStrategyInfo(NameStrategyInfo value) {
        return new JAXBElement<NameStrategyInfo>(_NameStrategyInfo_QNAME, NameStrategyInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SettlementBankType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Enums", name = "SettlementBankType")
    public JAXBElement<SettlementBankType> createSettlementBankType(SettlementBankType value) {
        return new JAXBElement<SettlementBankType>(_SettlementBankType_QNAME, SettlementBankType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSupplierListByParamsRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Request", name = "GetSupplierListByParamsRequest")
    public JAXBElement<GetSupplierListByParamsRequest> createGetSupplierListByParamsRequest(GetSupplierListByParamsRequest value) {
        return new JAXBElement<GetSupplierListByParamsRequest>(_GetSupplierListByParamsRequest_QNAME, GetSupplierListByParamsRequest.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link SupplierBaseInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model", name = "SupplierBaseInfo")
    public JAXBElement<SupplierBaseInfo> createSupplierBaseInfo(SupplierBaseInfo value) {
        return new JAXBElement<SupplierBaseInfo>(_SupplierBaseInfo_QNAME, SupplierBaseInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NewSupplierInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model", name = "NewSupplierInfo")
    public JAXBElement<NewSupplierInfo> createNewSupplierInfo(NewSupplierInfo value) {
        return new JAXBElement<NewSupplierInfo>(_NewSupplierInfo_QNAME, NewSupplierInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HotelInfoDB }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model", name = "HotelInfoDB")
    public JAXBElement<HotelInfoDB> createHotelInfoDB(HotelInfoDB value) {
        return new JAXBElement<HotelInfoDB>(_HotelInfoDB_QNAME, HotelInfoDB.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfHotelInfoDB }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model", name = "ArrayOfHotelInfoDB")
    public JAXBElement<ArrayOfHotelInfoDB> createArrayOfHotelInfoDB(ArrayOfHotelInfoDB value) {
        return new JAXBElement<ArrayOfHotelInfoDB>(_ArrayOfHotelInfoDB_QNAME, ArrayOfHotelInfoDB.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSupplierAllInfoIntResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response", name = "GetSupplierAllInfoIntResponse")
    public JAXBElement<GetSupplierAllInfoIntResponse> createGetSupplierAllInfoIntResponse(GetSupplierAllInfoIntResponse value) {
        return new JAXBElement<GetSupplierAllInfoIntResponse>(_GetSupplierAllInfoIntResponse_QNAME, GetSupplierAllInfoIntResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IsQunarSupplierRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Request", name = "IsQunarSupplierRequest")
    public JAXBElement<IsQunarSupplierRequest> createIsQunarSupplierRequest(IsQunarSupplierRequest value) {
        return new JAXBElement<IsQunarSupplierRequest>(_IsQunarSupplierRequest_QNAME, IsQunarSupplierRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SupplierInfoInt }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model", name = "SupplierInfoInt")
    public JAXBElement<SupplierInfoInt> createSupplierInfoInt(SupplierInfoInt value) {
        return new JAXBElement<SupplierInfoInt>(_SupplierInfoInt_QNAME, SupplierInfoInt.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SupplierInvoiceInfoInt }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model", name = "SupplierInvoiceInfoInt")
    public JAXBElement<SupplierInvoiceInfoInt> createSupplierInvoiceInfoInt(SupplierInvoiceInfoInt value) {
        return new JAXBElement<SupplierInvoiceInfoInt>(_SupplierInvoiceInfoInt_QNAME, SupplierInvoiceInfoInt.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link IsCtripSupplierRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Request.Supplier", name = "IsCtripSupplierRequest")
    public JAXBElement<IsCtripSupplierRequest> createIsCtripSupplierRequest(IsCtripSupplierRequest value) {
        return new JAXBElement<IsCtripSupplierRequest>(_IsCtripSupplierRequest_QNAME, IsCtripSupplierRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSupplierAllInfoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response", name = "GetSupplierAllInfoResponse")
    public JAXBElement<GetSupplierAllInfoResponse> createGetSupplierAllInfoResponse(GetSupplierAllInfoResponse value) {
        return new JAXBElement<GetSupplierAllInfoResponse>(_GetSupplierAllInfoResponse_QNAME, GetSupplierAllInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CurrencyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Enums", name = "CurrencyType")
    public JAXBElement<CurrencyType> createCurrencyType(CurrencyType value) {
        return new JAXBElement<CurrencyType>(_CurrencyType_QNAME, CurrencyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateSupplierInfoRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Request", name = "UpdateSupplierInfoRequest")
    public JAXBElement<UpdateSupplierInfoRequest> createUpdateSupplierInfoRequest(UpdateSupplierInfoRequest value) {
        return new JAXBElement<UpdateSupplierInfoRequest>(_UpdateSupplierInfoRequest_QNAME, UpdateSupplierInfoRequest.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSupplierInfoInt }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model", name = "ArrayOfSupplierInfoInt")
    public JAXBElement<ArrayOfSupplierInfoInt> createArrayOfSupplierInfoInt(ArrayOfSupplierInfoInt value) {
        return new JAXBElement<ArrayOfSupplierInfoInt>(_ArrayOfSupplierInfoInt_QNAME, ArrayOfSupplierInfoInt.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteNameStrategyInfoRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Request.Supplier", name = "DeleteNameStrategyInfoRequest")
    public JAXBElement<DeleteNameStrategyInfoRequest> createDeleteNameStrategyInfoRequest(DeleteNameStrategyInfoRequest value) {
        return new JAXBElement<DeleteNameStrategyInfoRequest>(_DeleteNameStrategyInfoRequest_QNAME, DeleteNameStrategyInfoRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BankDicInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model", name = "BankDicInfo")
    public JAXBElement<BankDicInfo> createBankDicInfo(BankDicInfo value) {
        return new JAXBElement<BankDicInfo>(_BankDicInfo_QNAME, BankDicInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNameStrategyInfoRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Request.Supplier", name = "GetNameStrategyInfoRequest")
    public JAXBElement<GetNameStrategyInfoRequest> createGetNameStrategyInfoRequest(GetNameStrategyInfoRequest value) {
        return new JAXBElement<GetNameStrategyInfoRequest>(_GetNameStrategyInfoRequest_QNAME, GetNameStrategyInfoRequest.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSupplierInfoBySupplierIDIntResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response", name = "GetSupplierInfoBySupplierIDIntResponse")
    public JAXBElement<GetSupplierInfoBySupplierIDIntResponse> createGetSupplierInfoBySupplierIDIntResponse(GetSupplierInfoBySupplierIDIntResponse value) {
        return new JAXBElement<GetSupplierInfoBySupplierIDIntResponse>(_GetSupplierInfoBySupplierIDIntResponse_QNAME, GetSupplierInfoBySupplierIDIntResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSupplierInfoBySupplierIDRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Request", name = "GetSupplierInfoBySupplierIDRequest")
    public JAXBElement<GetSupplierInfoBySupplierIDRequest> createGetSupplierInfoBySupplierIDRequest(GetSupplierInfoBySupplierIDRequest value) {
        return new JAXBElement<GetSupplierInfoBySupplierIDRequest>(_GetSupplierInfoBySupplierIDRequest_QNAME, GetSupplierInfoBySupplierIDRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertNameStrategyInfoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response.Supplier", name = "InsertNameStrategyInfoResponse")
    public JAXBElement<InsertNameStrategyInfoResponse> createInsertNameStrategyInfoResponse(InsertNameStrategyInfoResponse value) {
        return new JAXBElement<InsertNameStrategyInfoResponse>(_InsertNameStrategyInfoResponse_QNAME, InsertNameStrategyInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SupplierInvoiceInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model", name = "SupplierInvoiceInfo")
    public JAXBElement<SupplierInvoiceInfo> createSupplierInvoiceInfo(SupplierInvoiceInfo value) {
        return new JAXBElement<SupplierInvoiceInfo>(_SupplierInvoiceInfo_QNAME, SupplierInvoiceInfo.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link QName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "QName")
    public JAXBElement<QName> createQName(QName value) {
        return new JAXBElement<QName>(_QName_QNAME, QName.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponseResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Framework", name = "ResponseResult")
    public JAXBElement<ResponseResult> createResponseResult(ResponseResult value) {
        return new JAXBElement<ResponseResult>(_ResponseResult_QNAME, ResponseResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfBankDicInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model", name = "ArrayOfBankDicInfo")
    public JAXBElement<ArrayOfBankDicInfo> createArrayOfBankDicInfo(ArrayOfBankDicInfo value) {
        return new JAXBElement<ArrayOfBankDicInfo>(_ArrayOfBankDicInfo_QNAME, ArrayOfBankDicInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertSupplierInfoRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Request", name = "InsertSupplierInfoRequest")
    public JAXBElement<InsertSupplierInfoRequest> createInsertSupplierInfoRequest(InsertSupplierInfoRequest value) {
        return new JAXBElement<InsertSupplierInfoRequest>(_InsertSupplierInfoRequest_QNAME, InsertSupplierInfoRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertNameStrategyInfoRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Request.Supplier", name = "InsertNameStrategyInfoRequest")
    public JAXBElement<InsertNameStrategyInfoRequest> createInsertNameStrategyInfoRequest(InsertNameStrategyInfoRequest value) {
        return new JAXBElement<InsertNameStrategyInfoRequest>(_InsertNameStrategyInfoRequest_QNAME, InsertNameStrategyInfoRequest.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteNameStrategyInfoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response.Supplier", name = "DeleteNameStrategyInfoResponse")
    public JAXBElement<DeleteNameStrategyInfoResponse> createDeleteNameStrategyInfoResponse(DeleteNameStrategyInfoResponse value) {
        return new JAXBElement<DeleteNameStrategyInfoResponse>(_DeleteNameStrategyInfoResponse_QNAME, DeleteNameStrategyInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgreementEntityInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model", name = "AgreementEntityInfo")
    public JAXBElement<AgreementEntityInfo> createAgreementEntityInfo(AgreementEntityInfo value) {
        return new JAXBElement<AgreementEntityInfo>(_AgreementEntityInfo_QNAME, AgreementEntityInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccountPayeeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Enums", name = "AccountPayeeType")
    public JAXBElement<AccountPayeeType> createAccountPayeeType(AccountPayeeType value) {
        return new JAXBElement<AccountPayeeType>(_AccountPayeeType_QNAME, AccountPayeeType.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link SupplierForeignCurrencyBankInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model", name = "SupplierForeignCurrencyBankInfo")
    public JAXBElement<SupplierForeignCurrencyBankInfo> createSupplierForeignCurrencyBankInfo(SupplierForeignCurrencyBankInfo value) {
        return new JAXBElement<SupplierForeignCurrencyBankInfo>(_SupplierForeignCurrencyBankInfo_QNAME, SupplierForeignCurrencyBankInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SupplierSettlementInfoInt }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model", name = "SupplierSettlementInfoInt")
    public JAXBElement<SupplierSettlementInfoInt> createSupplierSettlementInfoInt(SupplierSettlementInfoInt value) {
        return new JAXBElement<SupplierSettlementInfoInt>(_SupplierSettlementInfoInt_QNAME, SupplierSettlementInfoInt.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IsQunarSupplierResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response.Supplier", name = "IsQunarSupplierResponse")
    public JAXBElement<IsQunarSupplierResponse> createIsQunarSupplierResponse(IsQunarSupplierResponse value) {
        return new JAXBElement<IsQunarSupplierResponse>(_IsQunarSupplierResponse_QNAME, IsQunarSupplierResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link SupplierBaseInfoInt }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model", name = "SupplierBaseInfoInt")
    public JAXBElement<SupplierBaseInfoInt> createSupplierBaseInfoInt(SupplierBaseInfoInt value) {
        return new JAXBElement<SupplierBaseInfoInt>(_SupplierBaseInfoInt_QNAME, SupplierBaseInfoInt.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SupplierRMBBankInfoInt }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model", name = "SupplierRMBBankInfoInt")
    public JAXBElement<SupplierRMBBankInfoInt> createSupplierRMBBankInfoInt(SupplierRMBBankInfoInt value) {
        return new JAXBElement<SupplierRMBBankInfoInt>(_SupplierRMBBankInfoInt_QNAME, SupplierRMBBankInfoInt.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllAgreementEntityResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response", name = "GetAllAgreementEntityResponse")
    public JAXBElement<GetAllAgreementEntityResponse> createGetAllAgreementEntityResponse(GetAllAgreementEntityResponse value) {
        return new JAXBElement<GetAllAgreementEntityResponse>(_GetAllAgreementEntityResponse_QNAME, GetAllAgreementEntityResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link DefaultResponseResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response", name = "DefaultResponseResult")
    public JAXBElement<DefaultResponseResult> createDefaultResponseResult(DefaultResponseResult value) {
        return new JAXBElement<DefaultResponseResult>(_DefaultResponseResult_QNAME, DefaultResponseResult.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAgreementEntityInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model", name = "ArrayOfAgreementEntityInfo")
    public JAXBElement<ArrayOfAgreementEntityInfo> createArrayOfAgreementEntityInfo(ArrayOfAgreementEntityInfo value) {
        return new JAXBElement<ArrayOfAgreementEntityInfo>(_ArrayOfAgreementEntityInfo_QNAME, ArrayOfAgreementEntityInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateSupplierStatusRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Request", name = "UpdateSupplierStatusRequest")
    public JAXBElement<UpdateSupplierStatusRequest> createUpdateSupplierStatusRequest(UpdateSupplierStatusRequest value) {
        return new JAXBElement<UpdateSupplierStatusRequest>(_UpdateSupplierStatusRequest_QNAME, UpdateSupplierStatusRequest.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckSupplierByNameAbbrResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response", name = "CheckSupplierByNameAbbrResponse")
    public JAXBElement<CheckSupplierByNameAbbrResponse> createCheckSupplierByNameAbbrResponse(CheckSupplierByNameAbbrResponse value) {
        return new JAXBElement<CheckSupplierByNameAbbrResponse>(_CheckSupplierByNameAbbrResponse_QNAME, CheckSupplierByNameAbbrResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SettlementModle }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Enums", name = "SettlementModle")
    public JAXBElement<SettlementModle> createSettlementModle(SettlementModle value) {
        return new JAXBElement<SettlementModle>(_SettlementModle_QNAME, SettlementModle.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllBankDicInfoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response", name = "GetAllBankDicInfoResponse")
    public JAXBElement<GetAllBankDicInfoResponse> createGetAllBankDicInfoResponse(GetAllBankDicInfoResponse value) {
        return new JAXBElement<GetAllBankDicInfoResponse>(_GetAllBankDicInfoResponse_QNAME, GetAllBankDicInfoResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link SupplierSettlementInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model", name = "SupplierSettlementInfo")
    public JAXBElement<SupplierSettlementInfo> createSupplierSettlementInfo(SupplierSettlementInfo value) {
        return new JAXBElement<SupplierSettlementInfo>(_SupplierSettlementInfo_QNAME, SupplierSettlementInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvoiceMode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Enums", name = "InvoiceMode")
    public JAXBElement<InvoiceMode> createInvoiceMode(InvoiceMode value) {
        return new JAXBElement<InvoiceMode>(_InvoiceMode_QNAME, InvoiceMode.class, null, value);
    }

}
