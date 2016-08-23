
package com.elong.nb.agent.ProductForPartnerServiceContract;

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
 * generated in the com.elong.nb.agent.ProductForPartnerServiceContract package. 
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

    private final static QName _BedTypeEnum_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Enums", "BedTypeEnum");
    private final static QName _EnumCutType_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Enums", "EnumCutType");
    private final static QName _EnumPrepayRule_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Enums", "EnumPrepayRule");
    private final static QName _EnumRuleTarget_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Enums", "EnumRuleTarget");
    private final static QName _EnumDateType_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Enums", "EnumDateType");
    private final static QName _WeekDays_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Enums", "WeekDays");
    private final static QName _EnumIsArriveTimeVouch_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Enums", "EnumIsArriveTimeVouch");
    private final static QName _EnumIsRoomCountVouch_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Enums", "EnumIsRoomCountVouch");
    private final static QName _EnumVouchMoneyType_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Enums", "EnumVouchMoneyType");
    private final static QName _EnumVouchRule_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Enums", "EnumVouchRule");
    private final static QName _EnumVouchWay_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Enums", "EnumVouchWay");
    private final static QName _AuthorizationType_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Enums", "AuthorizationType");
    private final static QName _SupplierStatus_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Enums", "SupplierStatus");
    private final static QName _RoomAdditionType_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Enums", "RoomAdditionType");
    private final static QName _BedInfoForDay_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model.Room", "BedInfoForDay");
    private final static QName _ProductRequestBase_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Request", "ProductRequestBase");
    private final static QName _GetClosedBedTypeInfoRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Request", "GetClosedBedTypeInfoRequest");
    private final static QName _SaveBedInfoRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Request", "SaveBedInfoRequest");
    private final static QName _CreatePerpayPolicyRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Request", "CreatePerpayPolicyRequest");
    private final static QName _CreateRatePalnPolicyBase_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Request", "CreateRatePalnPolicyBase");
    private final static QName _CreateVouchPolicyRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Request", "CreateVouchPolicyRequest");
    private final static QName _DeleteVouchPolicyByDateSpan4PartnerRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Request", "DeleteVouchPolicyByDateSpan4PartnerRequest");
    private final static QName _DeletePrepayPolicyByDateSpan4PartnerRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Request", "DeletePrepayPolicyByDateSpan4PartnerRequest");
    private final static QName _GetSupplierSwitchStatusRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Request", "GetSupplierSwitchStatusRequest");
    private final static QName _CreateShotelForPartnerRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Request", "CreateShotelForPartnerRequest");
    private final static QName _CheckMHotelNameRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Request", "CheckMHotelNameRequest");
    private final static QName _GetSupplierInfoRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Request", "GetSupplierInfoRequest");
    private final static QName _EditRoomAmount4PartnersIntRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Request", "EditRoomAmount4PartnersIntRequest");
    private final static QName _SaveRoomOverSaleInventory4PartnerRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Request", "SaveRoomOverSaleInventory4PartnerRequest");
    private final static QName _BatchReplaceInventory4PartnerRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Request", "BatchReplaceInventory4PartnerRequest");
    private final static QName _EditRoomStatus4PartnersIntRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Request", "EditRoomStatus4PartnersIntRequest");
    private final static QName _EditRoomStatus4EBIntRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Request", "EditRoomStatus4EBIntRequest");
    private final static QName _BatchEditInvAmountAndStatusForEBookingRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Request", "BatchEditInvAmountAndStatusForEBookingRequest");
    private final static QName _GetRoomTypeByShotelIdRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Request", "GetRoomTypeByShotelIdRequest");
    private final static QName _ArrayOfBedInfoEntity_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model", "ArrayOfBedInfoEntity");
    private final static QName _BedInfoEntity_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model", "BedInfoEntity");
    private final static QName _CPPerpayPolicyInfoChangeRule_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model", "CP_PerpayPolicyInfo.ChangeRule");
    private final static QName _SHotelInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model", "SHotelInfo");
    private final static QName _ArrayOfSupplierInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model", "ArrayOfSupplierInfo");
    private final static QName _SupplierInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model", "SupplierInfo");
    private final static QName _ArrayOfInventoryDayDetailInfoInt_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model", "ArrayOfInventoryDayDetailInfoInt");
    private final static QName _InventoryDayDetailInfoInt_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model", "InventoryDayDetailInfoInt");
    private final static QName _ArrayOfResourceInventoryDetailInt_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model", "ArrayOfResourceInventoryDetailInt");
    private final static QName _ResourceInventoryDetailInt_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model", "ResourceInventoryDetailInt");
    private final static QName _ArrayOfGetEbookingRoomNumModel_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model", "ArrayOfGetEbookingRoomNumModel");
    private final static QName _GetEbookingRoomNumModel_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model", "GetEbookingRoomNumModel");
    private final static QName _ArrayOfInventoryChangeModel_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model", "ArrayOfInventoryChangeModel");
    private final static QName _InventoryChangeModel_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model", "InventoryChangeModel");
    private final static QName _ArrayOfMRoomInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model", "ArrayOfMRoomInfo");
    private final static QName _MRoomInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model", "MRoomInfo");
    private final static QName _ArrayOfMRoomAddition_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model", "ArrayOfMRoomAddition");
    private final static QName _MRoomAddition_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model", "MRoomAddition");
    private final static QName _GetInventoryChangeDetailResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response.Inventory", "GetInventoryChangeDetailResponse");
    private final static QName _GetInventoryChangeListResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response.Inventory", "GetInventoryChangeListResponse");
    private final static QName _GetInventoryChangeMinIDResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response.Inventory", "GetInventoryChangeMinIDResponse");
    private final static QName _GetInvChangeAndInstantConfirmResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response.Inventory", "GetInvChangeAndInstantConfirmResponse");
    private final static QName _FreeSaleResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response.Inventory", "FreeSaleResponse");
    private final static QName _GetInventoryRoomStatusResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response.Inventory", "GetInventoryRoomStatusResponse");
    private final static QName _GetResSupplyUseGroupHotel3Response_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response.Inventory", "GetResSupplyUseGroupHotel3Response");
    private final static QName _GetBuyedInventoryResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response.Inventory", "GetBuyedInventoryResponse");
    private final static QName _CreateRatePalnPolicyResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response.CreateRatePalnPolicy", "CreateRatePalnPolicyResponse");
    private final static QName _DeleteVouchPolicyByDateSpan4PartnerResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response.CreateRatePalnPolicy", "DeleteVouchPolicyByDateSpan4PartnerResponse");
    private final static QName _DeletePrepayPolicyByDateSpan4PartnerResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response.CreateRatePalnPolicy", "DeletePrepayPolicyByDateSpan4PartnerResponse");
    private final static QName _GetInventoryChangeDetailRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Request.Inventory", "GetInventoryChangeDetailRequest");
    private final static QName _GetHotelSwitchStatusRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Request.Inventory", "GetHotelSwitchStatusRequest");
    private final static QName _GetInventoryChangeListRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Request.Inventory", "GetInventoryChangeListRequest");
    private final static QName _GetInventoryChangeMinIDRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Request.Inventory", "GetInventoryChangeMinIDRequest");
    private final static QName _GetInvChangeAndInstantConfirmRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Request.Inventory", "GetInvChangeAndInstantConfirmRequest");
    private final static QName _FreeSaleRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Request.Inventory", "FreeSaleRequest");
    private final static QName _GetInventoryRoomStatusRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Request.Inventory", "GetInventoryRoomStatusRequest");
    private final static QName _GetResSupplyUseGroupHotel3Request_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Request.Inventory", "GetResSupplyUseGroupHotel3Request");
    private final static QName _GetBuyedInventoryRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Request.Inventory", "GetBuyedInventoryRequest");
    private final static QName _ArrayOfResourceInventoryState_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model.Inventory", "ArrayOfResourceInventoryState");
    private final static QName _ResourceInventoryState_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model.Inventory", "ResourceInventoryState");
    private final static QName _ArrayOfInventoryAvailableInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model.Inventory", "ArrayOfInventoryAvailableInfo");
    private final static QName _InventoryAvailableInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model.Inventory", "InventoryAvailableInfo");
    private final static QName _ArrayOfDateIntervalInventoryInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model.Inventory", "ArrayOfDateIntervalInventoryInfo");
    private final static QName _DateIntervalInventoryInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model.Inventory", "DateIntervalInventoryInfo");
    private final static QName _ArrayOfInventoryAmountAndStatusOperation_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model.Inventory", "ArrayOfInventoryAmountAndStatusOperation");
    private final static QName _InventoryAmountAndStatusOperation_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model.Inventory", "InventoryAmountAndStatusOperation");
    private final static QName _ArrayOfResourceInvAndInstantConfirmState_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model.Inventory", "ArrayOfResourceInvAndInstantConfirmState");
    private final static QName _ResourceInvAndInstantConfirmState_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model.Inventory", "ResourceInvAndInstantConfirmState");
    private final static QName _ArrayOfFreeSaleInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model.Inventory", "ArrayOfFreeSaleInfo");
    private final static QName _FreeSaleInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model.Inventory", "FreeSaleInfo");
    private final static QName _ArrayOfGetHotelInventoryRoomStatus4Backend_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model.Inventory", "ArrayOfGetHotelInventoryRoomStatus4Backend");
    private final static QName _GetHotelInventoryRoomStatus4Backend_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model.Inventory", "GetHotelInventoryRoomStatus4Backend");
    private final static QName _ArrayOfGetBuyedInventoryModel_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model.Inventory", "ArrayOfGetBuyedInventoryModel");
    private final static QName _GetBuyedInventoryModel_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model.Inventory", "GetBuyedInventoryModel");
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
    private final static QName _GetBedInfoToOtherSysResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response.Product4Partners", "GetBedInfoToOtherSysResponse");
    private final static QName _IsUseDcInvResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response.Product4Partners", "IsUseDcInvResponse");
    private final static QName _EditInvStatus4DCResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response.Product4Partners", "EditInvStatus4DCResponse");
    private final static QName _IsDCRoomBackupResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response.Product4Partners", "IsDCRoomBackupResponse");
    private final static QName _EditRoomAmount4PartnersResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response.Product4Partners", "EditRoomAmount4PartnersResponse");
    private final static QName _EditRoomAmount4PartnersIntResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response.Product4Partners", "EditRoomAmount4PartnersIntResponse");
    private final static QName _EditRoomStatus4PartnersResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response.Product4Partners", "EditRoomStatus4PartnersResponse");
    private final static QName _EditRoomStatus4PartnersIntResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response.Product4Partners", "EditRoomStatus4PartnersIntResponse");
    private final static QName _BatchEditInvAmountAndStatusForEBookingResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response.Product4Partners", "BatchEditInvAmountAndStatusForEBookingResponse");
    private final static QName _InvAmountAndStatusResult4OneInvType_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response.Product4Partners", "InvAmountAndStatusResult4OneInvType");
    private final static QName _InvAmountAndStatusResultElement_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response.Product4Partners", "InvAmountAndStatusResultElement");
    private final static QName _OperateBedTypeResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response.Product4Partners", "OperateBedTypeResult");
    private final static QName _EditInventoryEndDate4PartnersResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response.Product4Partners", "EditInventoryEndDate4PartnersResponse");
    private final static QName _GetHotelInventoryDetail4PartnersResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response.Product4Partners", "GetHotelInventoryDetail4PartnersResponse");
    private final static QName _GetHotelInventoryDetail4PartnersIntResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response.Product4Partners", "GetHotelInventoryDetail4PartnersIntResponse");
    private final static QName _GetEbookingRoomNumHisHotel3Response_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response.Product4Partners", "GetEbookingRoomNumHisHotel3Response");
    private final static QName _ArrayOfInventoryDayDetailInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model.Product4Partners", "ArrayOfInventoryDayDetailInfo");
    private final static QName _InventoryDayDetailInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model.Product4Partners", "InventoryDayDetailInfo");
    private final static QName _ArrayOfResourceInventoryDetail_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model.Product4Partners", "ArrayOfResourceInventoryDetail");
    private final static QName _ResourceInventoryDetail_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model.Product4Partners", "ResourceInventoryDetail");
    private final static QName _ArrayOfHotelResourceInventoryStateInfoProc_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model.HotelProduct", "ArrayOfHotelResourceInventoryStateInfoProc");
    private final static QName _HotelResourceInventoryStateInfoProc_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model.HotelProduct", "HotelResourceInventoryStateInfoProc");
    private final static QName _GetSupplierInfoBySettlementTypeRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities", "GetSupplierInfoBySettlementTypeRequest");
    private final static QName _GetSupplierInfoBySettlementTypeResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities", "GetSupplierInfoBySettlementTypeResponse");
    private final static QName _ArrayOfSupplierInfo4Commision_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities", "ArrayOfSupplierInfo4Commision");
    private final static QName _SupplierInfo4Commision_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities", "SupplierInfo4Commision");
    private final static QName _IsUseDcInvRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Request.Product4Partners", "IsUseDcInvRequest");
    private final static QName _EditInvStatus4DCRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Request.Product4Partners", "EditInvStatus4DCRequest");
    private final static QName _IsDCRoomBackupRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Request.Product4Partners", "IsDCRoomBackupRequest");
    private final static QName _EditRoomAmount4PartnersRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Request.Product4Partners", "EditRoomAmount4PartnersRequest");
    private final static QName _EditRoomStatus4PartnersRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Request.Product4Partners", "EditRoomStatus4PartnersRequest");
    private final static QName _EditRoomStatus4EBRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Request.Product4Partners", "EditRoomStatus4EBRequest");
    private final static QName _EditInventoryEndDate4PartnersRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Request.Product4Partners", "EditInventoryEndDate4PartnersRequest");
    private final static QName _GetHotelInventoryDetail4PartnersRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Request.Product4Partners", "GetHotelInventoryDetail4PartnersRequest");
    private final static QName _GetHotelInventoryDetail4PartnersIntRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Request.Product4Partners", "GetHotelInventoryDetail4PartnersIntRequest");
    private final static QName _GetEbookingRoomNumHisHotel3Request_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Request.Product4Partners", "GetEbookingRoomNumHisHotel3Request");
    private final static QName _HotelResourceInventoryStateInfoProcResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response.HotelProduct", "HotelResourceInventoryStateInfoProcResponse");
    private final static QName _InventoryType_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Enums.Inventory", "InventoryType");
    private final static QName _EnumCloseRoomType_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Enums.Inventory", "EnumCloseRoomType");
    private final static QName _InventoryStatus_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Enums.Inventory", "InventoryStatus");
    private final static QName _ArrayOfInventoryType_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Enums.Inventory", "ArrayOfInventoryType");
    private final static QName _HotelResourceInventoryStateInfoProcRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Request.HotelProduct", "HotelResourceInventoryStateInfoProcRequest");
    private final static QName _SaveBedInfoResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response", "SaveBedInfoResponse");
    private final static QName _GetSupplierSwitchStatusResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response", "GetSupplierSwitchStatusResponse");
    private final static QName _GetHotelSwitchStatusResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response", "GetHotelSwitchStatusResponse");
    private final static QName _AddMHotelInfoResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response", "AddMHotelInfoResponse");
    private final static QName _CreateShotelForPartnerResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response", "CreateShotelForPartnerResponse");
    private final static QName _CheckMHotelNameResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response", "CheckMHotelNameResponse");
    private final static QName _GetSupplierInfoResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response", "GetSupplierInfoResponse");
    private final static QName _SaveRoomOverSaleInventory4PartnerResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response", "SaveRoomOverSaleInventory4PartnerResponse");
    private final static QName _BatchReplaceInventory4PartnerResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response", "BatchReplaceInventory4PartnerResponse");
    private final static QName _GetRoomTypeByShotelIdResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response", "GetRoomTypeByShotelIdResponse");
    private final static QName _ArrayOfKeyValueOfstringBedInfoForDaywSkfccAu_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOfKeyValueOfstringBedInfoForDayw_SkfccAu");
    private final static QName _ArrayOfstring_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOfstring");
    private final static QName _ArrayOfint_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOfint");
    private final static QName _ArrayOfKeyValueOfdateTimedateTime_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOfKeyValueOfdateTimedateTime");
    private final static QName _ArrayOfKeyValueOfintArrayOfDateIntervalInventoryInfoyrFq0QSa_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOfKeyValueOfintArrayOfDateIntervalInventoryInfoyrFq0q_Sa");
    private final static QName _ArrayOfKeyValueOfintInvAmountAndStatusResult4OneInvType8X1Z9B1I_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOfKeyValueOfintInvAmountAndStatusResult4OneInvType8x1z9B1i");
    private final static QName _ArrayOfKeyValueOfintInvAmountAndStatusResultElement8X1Z9B1I_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOfKeyValueOfintInvAmountAndStatusResultElement8x1z9B1i");
    private final static QName _ServiceResponseBase_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Framework", "ServiceResponseBase");
    private final static QName _ResponseResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Framework", "ResponseResult");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.elong.nb.agent.ProductForPartnerServiceContract
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ArrayOfKeyValueOfintInvAmountAndStatusResultElement8X1Z9B1I }
     * 
     */
    public ArrayOfKeyValueOfintInvAmountAndStatusResultElement8X1Z9B1I createArrayOfKeyValueOfintInvAmountAndStatusResultElement8X1Z9B1I() {
        return new ArrayOfKeyValueOfintInvAmountAndStatusResultElement8X1Z9B1I();
    }

    /**
     * Create an instance of {@link ArrayOfKeyValueOfintInvAmountAndStatusResult4OneInvType8X1Z9B1I }
     * 
     */
    public ArrayOfKeyValueOfintInvAmountAndStatusResult4OneInvType8X1Z9B1I createArrayOfKeyValueOfintInvAmountAndStatusResult4OneInvType8X1Z9B1I() {
        return new ArrayOfKeyValueOfintInvAmountAndStatusResult4OneInvType8X1Z9B1I();
    }

    /**
     * Create an instance of {@link ArrayOfKeyValueOfintArrayOfDateIntervalInventoryInfoyrFq0QSa }
     * 
     */
    public ArrayOfKeyValueOfintArrayOfDateIntervalInventoryInfoyrFq0QSa createArrayOfKeyValueOfintArrayOfDateIntervalInventoryInfoyrFq0QSa() {
        return new ArrayOfKeyValueOfintArrayOfDateIntervalInventoryInfoyrFq0QSa();
    }

    /**
     * Create an instance of {@link ArrayOfKeyValueOfdateTimedateTime }
     * 
     */
    public ArrayOfKeyValueOfdateTimedateTime createArrayOfKeyValueOfdateTimedateTime() {
        return new ArrayOfKeyValueOfdateTimedateTime();
    }

    /**
     * Create an instance of {@link ArrayOfKeyValueOfstringBedInfoForDaywSkfccAu }
     * 
     */
    public ArrayOfKeyValueOfstringBedInfoForDaywSkfccAu createArrayOfKeyValueOfstringBedInfoForDaywSkfccAu() {
        return new ArrayOfKeyValueOfstringBedInfoForDaywSkfccAu();
    }

    /**
     * Create an instance of {@link BedInfoForDay }
     * 
     */
    public BedInfoForDay createBedInfoForDay() {
        return new BedInfoForDay();
    }

    /**
     * Create an instance of {@link ProductRequestBase }
     * 
     */
    public ProductRequestBase createProductRequestBase() {
        return new ProductRequestBase();
    }

    /**
     * Create an instance of {@link GetClosedBedTypeInfoRequest }
     * 
     */
    public GetClosedBedTypeInfoRequest createGetClosedBedTypeInfoRequest() {
        return new GetClosedBedTypeInfoRequest();
    }

    /**
     * Create an instance of {@link SaveBedInfoRequest }
     * 
     */
    public SaveBedInfoRequest createSaveBedInfoRequest() {
        return new SaveBedInfoRequest();
    }

    /**
     * Create an instance of {@link CreatePerpayPolicyRequest }
     * 
     */
    public CreatePerpayPolicyRequest createCreatePerpayPolicyRequest() {
        return new CreatePerpayPolicyRequest();
    }

    /**
     * Create an instance of {@link CreateRatePalnPolicyBase }
     * 
     */
    public CreateRatePalnPolicyBase createCreateRatePalnPolicyBase() {
        return new CreateRatePalnPolicyBase();
    }

    /**
     * Create an instance of {@link CreateVouchPolicyRequest }
     * 
     */
    public CreateVouchPolicyRequest createCreateVouchPolicyRequest() {
        return new CreateVouchPolicyRequest();
    }

    /**
     * Create an instance of {@link DeleteVouchPolicyByDateSpan4PartnerRequest }
     * 
     */
    public DeleteVouchPolicyByDateSpan4PartnerRequest createDeleteVouchPolicyByDateSpan4PartnerRequest() {
        return new DeleteVouchPolicyByDateSpan4PartnerRequest();
    }

    /**
     * Create an instance of {@link DeletePrepayPolicyByDateSpan4PartnerRequest }
     * 
     */
    public DeletePrepayPolicyByDateSpan4PartnerRequest createDeletePrepayPolicyByDateSpan4PartnerRequest() {
        return new DeletePrepayPolicyByDateSpan4PartnerRequest();
    }

    /**
     * Create an instance of {@link GetSupplierSwitchStatusRequest }
     * 
     */
    public GetSupplierSwitchStatusRequest createGetSupplierSwitchStatusRequest() {
        return new GetSupplierSwitchStatusRequest();
    }

    /**
     * Create an instance of {@link CreateShotelForPartnerRequest }
     * 
     */
    public CreateShotelForPartnerRequest createCreateShotelForPartnerRequest() {
        return new CreateShotelForPartnerRequest();
    }

    /**
     * Create an instance of {@link CheckMHotelNameRequest }
     * 
     */
    public CheckMHotelNameRequest createCheckMHotelNameRequest() {
        return new CheckMHotelNameRequest();
    }

    /**
     * Create an instance of {@link GetSupplierInfoRequest }
     * 
     */
    public GetSupplierInfoRequest createGetSupplierInfoRequest() {
        return new GetSupplierInfoRequest();
    }

    /**
     * Create an instance of {@link EditRoomAmount4PartnersIntRequest }
     * 
     */
    public EditRoomAmount4PartnersIntRequest createEditRoomAmount4PartnersIntRequest() {
        return new EditRoomAmount4PartnersIntRequest();
    }

    /**
     * Create an instance of {@link SaveRoomOverSaleInventory4PartnerRequest }
     * 
     */
    public SaveRoomOverSaleInventory4PartnerRequest createSaveRoomOverSaleInventory4PartnerRequest() {
        return new SaveRoomOverSaleInventory4PartnerRequest();
    }

    /**
     * Create an instance of {@link BatchReplaceInventory4PartnerRequest }
     * 
     */
    public BatchReplaceInventory4PartnerRequest createBatchReplaceInventory4PartnerRequest() {
        return new BatchReplaceInventory4PartnerRequest();
    }

    /**
     * Create an instance of {@link EditRoomStatus4PartnersIntRequest }
     * 
     */
    public EditRoomStatus4PartnersIntRequest createEditRoomStatus4PartnersIntRequest() {
        return new EditRoomStatus4PartnersIntRequest();
    }

    /**
     * Create an instance of {@link EditRoomStatus4EBIntRequest }
     * 
     */
    public EditRoomStatus4EBIntRequest createEditRoomStatus4EBIntRequest() {
        return new EditRoomStatus4EBIntRequest();
    }

    /**
     * Create an instance of {@link BatchEditInvAmountAndStatusForEBookingRequest }
     * 
     */
    public BatchEditInvAmountAndStatusForEBookingRequest createBatchEditInvAmountAndStatusForEBookingRequest() {
        return new BatchEditInvAmountAndStatusForEBookingRequest();
    }

    /**
     * Create an instance of {@link GetRoomTypeByShotelIdRequest }
     * 
     */
    public GetRoomTypeByShotelIdRequest createGetRoomTypeByShotelIdRequest() {
        return new GetRoomTypeByShotelIdRequest();
    }

    /**
     * Create an instance of {@link ArrayOfBedInfoEntity }
     * 
     */
    public ArrayOfBedInfoEntity createArrayOfBedInfoEntity() {
        return new ArrayOfBedInfoEntity();
    }

    /**
     * Create an instance of {@link BedInfoEntity }
     * 
     */
    public BedInfoEntity createBedInfoEntity() {
        return new BedInfoEntity();
    }

    /**
     * Create an instance of {@link CPPerpayPolicyInfoChangeRule }
     * 
     */
    public CPPerpayPolicyInfoChangeRule createCPPerpayPolicyInfoChangeRule() {
        return new CPPerpayPolicyInfoChangeRule();
    }

    /**
     * Create an instance of {@link SHotelInfo }
     * 
     */
    public SHotelInfo createSHotelInfo() {
        return new SHotelInfo();
    }

    /**
     * Create an instance of {@link ArrayOfSupplierInfo }
     * 
     */
    public ArrayOfSupplierInfo createArrayOfSupplierInfo() {
        return new ArrayOfSupplierInfo();
    }

    /**
     * Create an instance of {@link SupplierInfo }
     * 
     */
    public SupplierInfo createSupplierInfo() {
        return new SupplierInfo();
    }

    /**
     * Create an instance of {@link ArrayOfInventoryDayDetailInfoInt }
     * 
     */
    public ArrayOfInventoryDayDetailInfoInt createArrayOfInventoryDayDetailInfoInt() {
        return new ArrayOfInventoryDayDetailInfoInt();
    }

    /**
     * Create an instance of {@link InventoryDayDetailInfoInt }
     * 
     */
    public InventoryDayDetailInfoInt createInventoryDayDetailInfoInt() {
        return new InventoryDayDetailInfoInt();
    }

    /**
     * Create an instance of {@link ArrayOfResourceInventoryDetailInt }
     * 
     */
    public ArrayOfResourceInventoryDetailInt createArrayOfResourceInventoryDetailInt() {
        return new ArrayOfResourceInventoryDetailInt();
    }

    /**
     * Create an instance of {@link ResourceInventoryDetailInt }
     * 
     */
    public ResourceInventoryDetailInt createResourceInventoryDetailInt() {
        return new ResourceInventoryDetailInt();
    }

    /**
     * Create an instance of {@link ArrayOfGetEbookingRoomNumModel }
     * 
     */
    public ArrayOfGetEbookingRoomNumModel createArrayOfGetEbookingRoomNumModel() {
        return new ArrayOfGetEbookingRoomNumModel();
    }

    /**
     * Create an instance of {@link GetEbookingRoomNumModel }
     * 
     */
    public GetEbookingRoomNumModel createGetEbookingRoomNumModel() {
        return new GetEbookingRoomNumModel();
    }

    /**
     * Create an instance of {@link ArrayOfInventoryChangeModel }
     * 
     */
    public ArrayOfInventoryChangeModel createArrayOfInventoryChangeModel() {
        return new ArrayOfInventoryChangeModel();
    }

    /**
     * Create an instance of {@link InventoryChangeModel }
     * 
     */
    public InventoryChangeModel createInventoryChangeModel() {
        return new InventoryChangeModel();
    }

    /**
     * Create an instance of {@link ArrayOfMRoomInfo }
     * 
     */
    public ArrayOfMRoomInfo createArrayOfMRoomInfo() {
        return new ArrayOfMRoomInfo();
    }

    /**
     * Create an instance of {@link MRoomInfo }
     * 
     */
    public MRoomInfo createMRoomInfo() {
        return new MRoomInfo();
    }

    /**
     * Create an instance of {@link ArrayOfMRoomAddition }
     * 
     */
    public ArrayOfMRoomAddition createArrayOfMRoomAddition() {
        return new ArrayOfMRoomAddition();
    }

    /**
     * Create an instance of {@link MRoomAddition }
     * 
     */
    public MRoomAddition createMRoomAddition() {
        return new MRoomAddition();
    }

    /**
     * Create an instance of {@link GetInventoryChangeDetailResponse }
     * 
     */
    public GetInventoryChangeDetailResponse createGetInventoryChangeDetailResponse() {
        return new GetInventoryChangeDetailResponse();
    }

    /**
     * Create an instance of {@link GetInventoryChangeListResponse }
     * 
     */
    public GetInventoryChangeListResponse createGetInventoryChangeListResponse() {
        return new GetInventoryChangeListResponse();
    }

    /**
     * Create an instance of {@link GetInventoryChangeMinIDResponse }
     * 
     */
    public GetInventoryChangeMinIDResponse createGetInventoryChangeMinIDResponse() {
        return new GetInventoryChangeMinIDResponse();
    }

    /**
     * Create an instance of {@link GetInvChangeAndInstantConfirmResponse }
     * 
     */
    public GetInvChangeAndInstantConfirmResponse createGetInvChangeAndInstantConfirmResponse() {
        return new GetInvChangeAndInstantConfirmResponse();
    }

    /**
     * Create an instance of {@link FreeSaleResponse }
     * 
     */
    public FreeSaleResponse createFreeSaleResponse() {
        return new FreeSaleResponse();
    }

    /**
     * Create an instance of {@link GetInventoryRoomStatusResponse }
     * 
     */
    public GetInventoryRoomStatusResponse createGetInventoryRoomStatusResponse() {
        return new GetInventoryRoomStatusResponse();
    }

    /**
     * Create an instance of {@link GetResSupplyUseGroupHotel3Response }
     * 
     */
    public GetResSupplyUseGroupHotel3Response createGetResSupplyUseGroupHotel3Response() {
        return new GetResSupplyUseGroupHotel3Response();
    }

    /**
     * Create an instance of {@link GetBuyedInventoryResponse }
     * 
     */
    public GetBuyedInventoryResponse createGetBuyedInventoryResponse() {
        return new GetBuyedInventoryResponse();
    }

    /**
     * Create an instance of {@link CreateRatePalnPolicyResponse }
     * 
     */
    public CreateRatePalnPolicyResponse createCreateRatePalnPolicyResponse() {
        return new CreateRatePalnPolicyResponse();
    }

    /**
     * Create an instance of {@link DeleteVouchPolicyByDateSpan4PartnerResponse }
     * 
     */
    public DeleteVouchPolicyByDateSpan4PartnerResponse createDeleteVouchPolicyByDateSpan4PartnerResponse() {
        return new DeleteVouchPolicyByDateSpan4PartnerResponse();
    }

    /**
     * Create an instance of {@link DeletePrepayPolicyByDateSpan4PartnerResponse }
     * 
     */
    public DeletePrepayPolicyByDateSpan4PartnerResponse createDeletePrepayPolicyByDateSpan4PartnerResponse() {
        return new DeletePrepayPolicyByDateSpan4PartnerResponse();
    }

    /**
     * Create an instance of {@link GetInventoryChangeDetailRequest }
     * 
     */
    public GetInventoryChangeDetailRequest createGetInventoryChangeDetailRequest() {
        return new GetInventoryChangeDetailRequest();
    }

    /**
     * Create an instance of {@link GetHotelSwitchStatusRequest }
     * 
     */
    public GetHotelSwitchStatusRequest createGetHotelSwitchStatusRequest() {
        return new GetHotelSwitchStatusRequest();
    }

    /**
     * Create an instance of {@link GetInventoryChangeListRequest }
     * 
     */
    public GetInventoryChangeListRequest createGetInventoryChangeListRequest() {
        return new GetInventoryChangeListRequest();
    }

    /**
     * Create an instance of {@link GetInventoryChangeMinIDRequest }
     * 
     */
    public GetInventoryChangeMinIDRequest createGetInventoryChangeMinIDRequest() {
        return new GetInventoryChangeMinIDRequest();
    }

    /**
     * Create an instance of {@link GetInvChangeAndInstantConfirmRequest }
     * 
     */
    public GetInvChangeAndInstantConfirmRequest createGetInvChangeAndInstantConfirmRequest() {
        return new GetInvChangeAndInstantConfirmRequest();
    }

    /**
     * Create an instance of {@link FreeSaleRequest }
     * 
     */
    public FreeSaleRequest createFreeSaleRequest() {
        return new FreeSaleRequest();
    }

    /**
     * Create an instance of {@link GetInventoryRoomStatusRequest }
     * 
     */
    public GetInventoryRoomStatusRequest createGetInventoryRoomStatusRequest() {
        return new GetInventoryRoomStatusRequest();
    }

    /**
     * Create an instance of {@link GetResSupplyUseGroupHotel3Request }
     * 
     */
    public GetResSupplyUseGroupHotel3Request createGetResSupplyUseGroupHotel3Request() {
        return new GetResSupplyUseGroupHotel3Request();
    }

    /**
     * Create an instance of {@link GetBuyedInventoryRequest }
     * 
     */
    public GetBuyedInventoryRequest createGetBuyedInventoryRequest() {
        return new GetBuyedInventoryRequest();
    }

    /**
     * Create an instance of {@link ArrayOfResourceInventoryState }
     * 
     */
    public ArrayOfResourceInventoryState createArrayOfResourceInventoryState() {
        return new ArrayOfResourceInventoryState();
    }

    /**
     * Create an instance of {@link ResourceInventoryState }
     * 
     */
    public ResourceInventoryState createResourceInventoryState() {
        return new ResourceInventoryState();
    }

    /**
     * Create an instance of {@link ArrayOfInventoryAvailableInfo }
     * 
     */
    public ArrayOfInventoryAvailableInfo createArrayOfInventoryAvailableInfo() {
        return new ArrayOfInventoryAvailableInfo();
    }

    /**
     * Create an instance of {@link InventoryAvailableInfo }
     * 
     */
    public InventoryAvailableInfo createInventoryAvailableInfo() {
        return new InventoryAvailableInfo();
    }

    /**
     * Create an instance of {@link ArrayOfDateIntervalInventoryInfo }
     * 
     */
    public ArrayOfDateIntervalInventoryInfo createArrayOfDateIntervalInventoryInfo() {
        return new ArrayOfDateIntervalInventoryInfo();
    }

    /**
     * Create an instance of {@link DateIntervalInventoryInfo }
     * 
     */
    public DateIntervalInventoryInfo createDateIntervalInventoryInfo() {
        return new DateIntervalInventoryInfo();
    }

    /**
     * Create an instance of {@link ArrayOfInventoryAmountAndStatusOperation }
     * 
     */
    public ArrayOfInventoryAmountAndStatusOperation createArrayOfInventoryAmountAndStatusOperation() {
        return new ArrayOfInventoryAmountAndStatusOperation();
    }

    /**
     * Create an instance of {@link InventoryAmountAndStatusOperation }
     * 
     */
    public InventoryAmountAndStatusOperation createInventoryAmountAndStatusOperation() {
        return new InventoryAmountAndStatusOperation();
    }

    /**
     * Create an instance of {@link ArrayOfResourceInvAndInstantConfirmState }
     * 
     */
    public ArrayOfResourceInvAndInstantConfirmState createArrayOfResourceInvAndInstantConfirmState() {
        return new ArrayOfResourceInvAndInstantConfirmState();
    }

    /**
     * Create an instance of {@link ResourceInvAndInstantConfirmState }
     * 
     */
    public ResourceInvAndInstantConfirmState createResourceInvAndInstantConfirmState() {
        return new ResourceInvAndInstantConfirmState();
    }

    /**
     * Create an instance of {@link ArrayOfFreeSaleInfo }
     * 
     */
    public ArrayOfFreeSaleInfo createArrayOfFreeSaleInfo() {
        return new ArrayOfFreeSaleInfo();
    }

    /**
     * Create an instance of {@link FreeSaleInfo }
     * 
     */
    public FreeSaleInfo createFreeSaleInfo() {
        return new FreeSaleInfo();
    }

    /**
     * Create an instance of {@link ArrayOfGetHotelInventoryRoomStatus4Backend }
     * 
     */
    public ArrayOfGetHotelInventoryRoomStatus4Backend createArrayOfGetHotelInventoryRoomStatus4Backend() {
        return new ArrayOfGetHotelInventoryRoomStatus4Backend();
    }

    /**
     * Create an instance of {@link GetHotelInventoryRoomStatus4Backend }
     * 
     */
    public GetHotelInventoryRoomStatus4Backend createGetHotelInventoryRoomStatus4Backend() {
        return new GetHotelInventoryRoomStatus4Backend();
    }

    /**
     * Create an instance of {@link ArrayOfGetBuyedInventoryModel }
     * 
     */
    public ArrayOfGetBuyedInventoryModel createArrayOfGetBuyedInventoryModel() {
        return new ArrayOfGetBuyedInventoryModel();
    }

    /**
     * Create an instance of {@link GetBuyedInventoryModel }
     * 
     */
    public GetBuyedInventoryModel createGetBuyedInventoryModel() {
        return new GetBuyedInventoryModel();
    }

    /**
     * Create an instance of {@link GetBedInfoToOtherSysResponse }
     * 
     */
    public GetBedInfoToOtherSysResponse createGetBedInfoToOtherSysResponse() {
        return new GetBedInfoToOtherSysResponse();
    }

    /**
     * Create an instance of {@link IsUseDcInvResponse }
     * 
     */
    public IsUseDcInvResponse createIsUseDcInvResponse() {
        return new IsUseDcInvResponse();
    }

    /**
     * Create an instance of {@link EditInvStatus4DCResponse }
     * 
     */
    public EditInvStatus4DCResponse createEditInvStatus4DCResponse() {
        return new EditInvStatus4DCResponse();
    }

    /**
     * Create an instance of {@link IsDCRoomBackupResponse }
     * 
     */
    public IsDCRoomBackupResponse createIsDCRoomBackupResponse() {
        return new IsDCRoomBackupResponse();
    }

    /**
     * Create an instance of {@link EditRoomAmount4PartnersResponse }
     * 
     */
    public EditRoomAmount4PartnersResponse createEditRoomAmount4PartnersResponse() {
        return new EditRoomAmount4PartnersResponse();
    }

    /**
     * Create an instance of {@link EditRoomAmount4PartnersIntResponse }
     * 
     */
    public EditRoomAmount4PartnersIntResponse createEditRoomAmount4PartnersIntResponse() {
        return new EditRoomAmount4PartnersIntResponse();
    }

    /**
     * Create an instance of {@link EditRoomStatus4PartnersResponse }
     * 
     */
    public EditRoomStatus4PartnersResponse createEditRoomStatus4PartnersResponse() {
        return new EditRoomStatus4PartnersResponse();
    }

    /**
     * Create an instance of {@link EditRoomStatus4PartnersIntResponse }
     * 
     */
    public EditRoomStatus4PartnersIntResponse createEditRoomStatus4PartnersIntResponse() {
        return new EditRoomStatus4PartnersIntResponse();
    }

    /**
     * Create an instance of {@link BatchEditInvAmountAndStatusForEBookingResponse }
     * 
     */
    public BatchEditInvAmountAndStatusForEBookingResponse createBatchEditInvAmountAndStatusForEBookingResponse() {
        return new BatchEditInvAmountAndStatusForEBookingResponse();
    }

    /**
     * Create an instance of {@link InvAmountAndStatusResult4OneInvType }
     * 
     */
    public InvAmountAndStatusResult4OneInvType createInvAmountAndStatusResult4OneInvType() {
        return new InvAmountAndStatusResult4OneInvType();
    }

    /**
     * Create an instance of {@link InvAmountAndStatusResultElement }
     * 
     */
    public InvAmountAndStatusResultElement createInvAmountAndStatusResultElement() {
        return new InvAmountAndStatusResultElement();
    }

    /**
     * Create an instance of {@link OperateBedTypeResult }
     * 
     */
    public OperateBedTypeResult createOperateBedTypeResult() {
        return new OperateBedTypeResult();
    }

    /**
     * Create an instance of {@link EditInventoryEndDate4PartnersResponse }
     * 
     */
    public EditInventoryEndDate4PartnersResponse createEditInventoryEndDate4PartnersResponse() {
        return new EditInventoryEndDate4PartnersResponse();
    }

    /**
     * Create an instance of {@link GetHotelInventoryDetail4PartnersResponse }
     * 
     */
    public GetHotelInventoryDetail4PartnersResponse createGetHotelInventoryDetail4PartnersResponse() {
        return new GetHotelInventoryDetail4PartnersResponse();
    }

    /**
     * Create an instance of {@link GetHotelInventoryDetail4PartnersIntResponse }
     * 
     */
    public GetHotelInventoryDetail4PartnersIntResponse createGetHotelInventoryDetail4PartnersIntResponse() {
        return new GetHotelInventoryDetail4PartnersIntResponse();
    }

    /**
     * Create an instance of {@link GetEbookingRoomNumHisHotel3Response }
     * 
     */
    public GetEbookingRoomNumHisHotel3Response createGetEbookingRoomNumHisHotel3Response() {
        return new GetEbookingRoomNumHisHotel3Response();
    }

    /**
     * Create an instance of {@link ArrayOfInventoryDayDetailInfo }
     * 
     */
    public ArrayOfInventoryDayDetailInfo createArrayOfInventoryDayDetailInfo() {
        return new ArrayOfInventoryDayDetailInfo();
    }

    /**
     * Create an instance of {@link InventoryDayDetailInfo }
     * 
     */
    public InventoryDayDetailInfo createInventoryDayDetailInfo() {
        return new InventoryDayDetailInfo();
    }

    /**
     * Create an instance of {@link ArrayOfResourceInventoryDetail }
     * 
     */
    public ArrayOfResourceInventoryDetail createArrayOfResourceInventoryDetail() {
        return new ArrayOfResourceInventoryDetail();
    }

    /**
     * Create an instance of {@link ResourceInventoryDetail }
     * 
     */
    public ResourceInventoryDetail createResourceInventoryDetail() {
        return new ResourceInventoryDetail();
    }

    /**
     * Create an instance of {@link ArrayOfHotelResourceInventoryStateInfoProc }
     * 
     */
    public ArrayOfHotelResourceInventoryStateInfoProc createArrayOfHotelResourceInventoryStateInfoProc() {
        return new ArrayOfHotelResourceInventoryStateInfoProc();
    }

    /**
     * Create an instance of {@link HotelResourceInventoryStateInfoProc }
     * 
     */
    public HotelResourceInventoryStateInfoProc createHotelResourceInventoryStateInfoProc() {
        return new HotelResourceInventoryStateInfoProc();
    }

    /**
     * Create an instance of {@link GetSupplierInfoBySettlementTypeRequest }
     * 
     */
    public GetSupplierInfoBySettlementTypeRequest createGetSupplierInfoBySettlementTypeRequest() {
        return new GetSupplierInfoBySettlementTypeRequest();
    }

    /**
     * Create an instance of {@link GetSupplierInfoBySettlementTypeResponse }
     * 
     */
    public GetSupplierInfoBySettlementTypeResponse createGetSupplierInfoBySettlementTypeResponse() {
        return new GetSupplierInfoBySettlementTypeResponse();
    }

    /**
     * Create an instance of {@link ArrayOfSupplierInfo4Commision }
     * 
     */
    public ArrayOfSupplierInfo4Commision createArrayOfSupplierInfo4Commision() {
        return new ArrayOfSupplierInfo4Commision();
    }

    /**
     * Create an instance of {@link SupplierInfo4Commision }
     * 
     */
    public SupplierInfo4Commision createSupplierInfo4Commision() {
        return new SupplierInfo4Commision();
    }

    /**
     * Create an instance of {@link IsUseDcInvRequest }
     * 
     */
    public IsUseDcInvRequest createIsUseDcInvRequest() {
        return new IsUseDcInvRequest();
    }

    /**
     * Create an instance of {@link EditInvStatus4DCRequest }
     * 
     */
    public EditInvStatus4DCRequest createEditInvStatus4DCRequest() {
        return new EditInvStatus4DCRequest();
    }

    /**
     * Create an instance of {@link IsDCRoomBackupRequest }
     * 
     */
    public IsDCRoomBackupRequest createIsDCRoomBackupRequest() {
        return new IsDCRoomBackupRequest();
    }

    /**
     * Create an instance of {@link EditRoomAmount4PartnersRequest }
     * 
     */
    public EditRoomAmount4PartnersRequest createEditRoomAmount4PartnersRequest() {
        return new EditRoomAmount4PartnersRequest();
    }

    /**
     * Create an instance of {@link EditRoomStatus4PartnersRequest }
     * 
     */
    public EditRoomStatus4PartnersRequest createEditRoomStatus4PartnersRequest() {
        return new EditRoomStatus4PartnersRequest();
    }

    /**
     * Create an instance of {@link EditRoomStatus4EBRequest }
     * 
     */
    public EditRoomStatus4EBRequest createEditRoomStatus4EBRequest() {
        return new EditRoomStatus4EBRequest();
    }

    /**
     * Create an instance of {@link EditInventoryEndDate4PartnersRequest }
     * 
     */
    public EditInventoryEndDate4PartnersRequest createEditInventoryEndDate4PartnersRequest() {
        return new EditInventoryEndDate4PartnersRequest();
    }

    /**
     * Create an instance of {@link GetHotelInventoryDetail4PartnersRequest }
     * 
     */
    public GetHotelInventoryDetail4PartnersRequest createGetHotelInventoryDetail4PartnersRequest() {
        return new GetHotelInventoryDetail4PartnersRequest();
    }

    /**
     * Create an instance of {@link GetHotelInventoryDetail4PartnersIntRequest }
     * 
     */
    public GetHotelInventoryDetail4PartnersIntRequest createGetHotelInventoryDetail4PartnersIntRequest() {
        return new GetHotelInventoryDetail4PartnersIntRequest();
    }

    /**
     * Create an instance of {@link GetEbookingRoomNumHisHotel3Request }
     * 
     */
    public GetEbookingRoomNumHisHotel3Request createGetEbookingRoomNumHisHotel3Request() {
        return new GetEbookingRoomNumHisHotel3Request();
    }

    /**
     * Create an instance of {@link HotelResourceInventoryStateInfoProcResponse }
     * 
     */
    public HotelResourceInventoryStateInfoProcResponse createHotelResourceInventoryStateInfoProcResponse() {
        return new HotelResourceInventoryStateInfoProcResponse();
    }

    /**
     * Create an instance of {@link ArrayOfInventoryType }
     * 
     */
    public ArrayOfInventoryType createArrayOfInventoryType() {
        return new ArrayOfInventoryType();
    }

    /**
     * Create an instance of {@link HotelResourceInventoryStateInfoProcRequest }
     * 
     */
    public HotelResourceInventoryStateInfoProcRequest createHotelResourceInventoryStateInfoProcRequest() {
        return new HotelResourceInventoryStateInfoProcRequest();
    }

    /**
     * Create an instance of {@link SaveBedInfoResponse }
     * 
     */
    public SaveBedInfoResponse createSaveBedInfoResponse() {
        return new SaveBedInfoResponse();
    }

    /**
     * Create an instance of {@link GetSupplierSwitchStatusResponse }
     * 
     */
    public GetSupplierSwitchStatusResponse createGetSupplierSwitchStatusResponse() {
        return new GetSupplierSwitchStatusResponse();
    }

    /**
     * Create an instance of {@link GetHotelSwitchStatusResponse }
     * 
     */
    public GetHotelSwitchStatusResponse createGetHotelSwitchStatusResponse() {
        return new GetHotelSwitchStatusResponse();
    }

    /**
     * Create an instance of {@link AddMHotelInfoResponse }
     * 
     */
    public AddMHotelInfoResponse createAddMHotelInfoResponse() {
        return new AddMHotelInfoResponse();
    }

    /**
     * Create an instance of {@link CreateShotelForPartnerResponse }
     * 
     */
    public CreateShotelForPartnerResponse createCreateShotelForPartnerResponse() {
        return new CreateShotelForPartnerResponse();
    }

    /**
     * Create an instance of {@link CheckMHotelNameResponse }
     * 
     */
    public CheckMHotelNameResponse createCheckMHotelNameResponse() {
        return new CheckMHotelNameResponse();
    }

    /**
     * Create an instance of {@link GetSupplierInfoResponse }
     * 
     */
    public GetSupplierInfoResponse createGetSupplierInfoResponse() {
        return new GetSupplierInfoResponse();
    }

    /**
     * Create an instance of {@link SaveRoomOverSaleInventory4PartnerResponse }
     * 
     */
    public SaveRoomOverSaleInventory4PartnerResponse createSaveRoomOverSaleInventory4PartnerResponse() {
        return new SaveRoomOverSaleInventory4PartnerResponse();
    }

    /**
     * Create an instance of {@link BatchReplaceInventory4PartnerResponse }
     * 
     */
    public BatchReplaceInventory4PartnerResponse createBatchReplaceInventory4PartnerResponse() {
        return new BatchReplaceInventory4PartnerResponse();
    }

    /**
     * Create an instance of {@link GetRoomTypeByShotelIdResponse }
     * 
     */
    public GetRoomTypeByShotelIdResponse createGetRoomTypeByShotelIdResponse() {
        return new GetRoomTypeByShotelIdResponse();
    }

    /**
     * Create an instance of {@link ArrayOfstring }
     * 
     */
    public ArrayOfstring createArrayOfstring() {
        return new ArrayOfstring();
    }

    /**
     * Create an instance of {@link ArrayOfint }
     * 
     */
    public ArrayOfint createArrayOfint() {
        return new ArrayOfint();
    }

    /**
     * Create an instance of {@link GetHotelInventorySumRoomToProcUseV3 }
     * 
     */
    public GetHotelInventorySumRoomToProcUseV3 createGetHotelInventorySumRoomToProcUseV3() {
        return new GetHotelInventorySumRoomToProcUseV3();
    }

    /**
     * Create an instance of {@link GetHotelInventorySumRoomToProcUseV3Response }
     * 
     */
    public GetHotelInventorySumRoomToProcUseV3Response createGetHotelInventorySumRoomToProcUseV3Response() {
        return new GetHotelInventorySumRoomToProcUseV3Response();
    }

    /**
     * Create an instance of {@link GetInventorySumInfoByHRT }
     * 
     */
    public GetInventorySumInfoByHRT createGetInventorySumInfoByHRT() {
        return new GetInventorySumInfoByHRT();
    }

    /**
     * Create an instance of {@link GetInventorySumInfoByHRTResponse }
     * 
     */
    public GetInventorySumInfoByHRTResponse createGetInventorySumInfoByHRTResponse() {
        return new GetInventorySumInfoByHRTResponse();
    }

    /**
     * Create an instance of {@link GetResourceInventoryStateListByReserNo }
     * 
     */
    public GetResourceInventoryStateListByReserNo createGetResourceInventoryStateListByReserNo() {
        return new GetResourceInventoryStateListByReserNo();
    }

    /**
     * Create an instance of {@link GetResourceInventoryStateListByReserNoResponse }
     * 
     */
    public GetResourceInventoryStateListByReserNoResponse createGetResourceInventoryStateListByReserNoResponse() {
        return new GetResourceInventoryStateListByReserNoResponse();
    }

    /**
     * Create an instance of {@link GetBedInfoToOtherSys }
     * 
     */
    public GetBedInfoToOtherSys createGetBedInfoToOtherSys() {
        return new GetBedInfoToOtherSys();
    }

    /**
     * Create an instance of {@link GetBedInfoToOtherSysResponse2 }
     * 
     */
    public GetBedInfoToOtherSysResponse2 createGetBedInfoToOtherSysResponse2() {
        return new GetBedInfoToOtherSysResponse2();
    }

    /**
     * Create an instance of {@link SaveBedInfoForOtherSys }
     * 
     */
    public SaveBedInfoForOtherSys createSaveBedInfoForOtherSys() {
        return new SaveBedInfoForOtherSys();
    }

    /**
     * Create an instance of {@link SaveBedInfoForOtherSysResponse }
     * 
     */
    public SaveBedInfoForOtherSysResponse createSaveBedInfoForOtherSysResponse() {
        return new SaveBedInfoForOtherSysResponse();
    }

    /**
     * Create an instance of {@link CreateIncrementalPerpayPolicy }
     * 
     */
    public CreateIncrementalPerpayPolicy createCreateIncrementalPerpayPolicy() {
        return new CreateIncrementalPerpayPolicy();
    }

    /**
     * Create an instance of {@link CreateIncrementalPerpayPolicyResponse }
     * 
     */
    public CreateIncrementalPerpayPolicyResponse createCreateIncrementalPerpayPolicyResponse() {
        return new CreateIncrementalPerpayPolicyResponse();
    }

    /**
     * Create an instance of {@link CreateIncrementalVouchPolicy }
     * 
     */
    public CreateIncrementalVouchPolicy createCreateIncrementalVouchPolicy() {
        return new CreateIncrementalVouchPolicy();
    }

    /**
     * Create an instance of {@link CreateIncrementalVouchPolicyResponse }
     * 
     */
    public CreateIncrementalVouchPolicyResponse createCreateIncrementalVouchPolicyResponse() {
        return new CreateIncrementalVouchPolicyResponse();
    }

    /**
     * Create an instance of {@link DeleteVouchPolicyByDateSpan4Partner }
     * 
     */
    public DeleteVouchPolicyByDateSpan4Partner createDeleteVouchPolicyByDateSpan4Partner() {
        return new DeleteVouchPolicyByDateSpan4Partner();
    }

    /**
     * Create an instance of {@link DeleteVouchPolicyByDateSpan4PartnerResponse2 }
     * 
     */
    public DeleteVouchPolicyByDateSpan4PartnerResponse2 createDeleteVouchPolicyByDateSpan4PartnerResponse2() {
        return new DeleteVouchPolicyByDateSpan4PartnerResponse2();
    }

    /**
     * Create an instance of {@link DeletePrepayPolicyByDateSpan4Partner }
     * 
     */
    public DeletePrepayPolicyByDateSpan4Partner createDeletePrepayPolicyByDateSpan4Partner() {
        return new DeletePrepayPolicyByDateSpan4Partner();
    }

    /**
     * Create an instance of {@link DeletePrepayPolicyByDateSpan4PartnerResponse2 }
     * 
     */
    public DeletePrepayPolicyByDateSpan4PartnerResponse2 createDeletePrepayPolicyByDateSpan4PartnerResponse2() {
        return new DeletePrepayPolicyByDateSpan4PartnerResponse2();
    }

    /**
     * Create an instance of {@link IsUseDcInv }
     * 
     */
    public IsUseDcInv createIsUseDcInv() {
        return new IsUseDcInv();
    }

    /**
     * Create an instance of {@link IsUseDcInvResponse2 }
     * 
     */
    public IsUseDcInvResponse2 createIsUseDcInvResponse2() {
        return new IsUseDcInvResponse2();
    }

    /**
     * Create an instance of {@link GetSupplierSwitchStatus }
     * 
     */
    public GetSupplierSwitchStatus createGetSupplierSwitchStatus() {
        return new GetSupplierSwitchStatus();
    }

    /**
     * Create an instance of {@link GetSupplierSwitchStatusResponse2 }
     * 
     */
    public GetSupplierSwitchStatusResponse2 createGetSupplierSwitchStatusResponse2() {
        return new GetSupplierSwitchStatusResponse2();
    }

    /**
     * Create an instance of {@link GetHotelSwitchStatus }
     * 
     */
    public GetHotelSwitchStatus createGetHotelSwitchStatus() {
        return new GetHotelSwitchStatus();
    }

    /**
     * Create an instance of {@link GetHotelSwitchStatusResponse2 }
     * 
     */
    public GetHotelSwitchStatusResponse2 createGetHotelSwitchStatusResponse2() {
        return new GetHotelSwitchStatusResponse2();
    }

    /**
     * Create an instance of {@link EditInvStatus4DC }
     * 
     */
    public EditInvStatus4DC createEditInvStatus4DC() {
        return new EditInvStatus4DC();
    }

    /**
     * Create an instance of {@link EditInvStatus4DCResponse2 }
     * 
     */
    public EditInvStatus4DCResponse2 createEditInvStatus4DCResponse2() {
        return new EditInvStatus4DCResponse2();
    }

    /**
     * Create an instance of {@link IsDCRoomBackup }
     * 
     */
    public IsDCRoomBackup createIsDCRoomBackup() {
        return new IsDCRoomBackup();
    }

    /**
     * Create an instance of {@link IsDCRoomBackupResponse2 }
     * 
     */
    public IsDCRoomBackupResponse2 createIsDCRoomBackupResponse2() {
        return new IsDCRoomBackupResponse2();
    }

    /**
     * Create an instance of {@link AddMHotelInfoByShotelId }
     * 
     */
    public AddMHotelInfoByShotelId createAddMHotelInfoByShotelId() {
        return new AddMHotelInfoByShotelId();
    }

    /**
     * Create an instance of {@link AddMHotelInfoByShotelIdResponse }
     * 
     */
    public AddMHotelInfoByShotelIdResponse createAddMHotelInfoByShotelIdResponse() {
        return new AddMHotelInfoByShotelIdResponse();
    }

    /**
     * Create an instance of {@link CreateShotelForPartner }
     * 
     */
    public CreateShotelForPartner createCreateShotelForPartner() {
        return new CreateShotelForPartner();
    }

    /**
     * Create an instance of {@link CreateShotelForPartnerResponse2 }
     * 
     */
    public CreateShotelForPartnerResponse2 createCreateShotelForPartnerResponse2() {
        return new CreateShotelForPartnerResponse2();
    }

    /**
     * Create an instance of {@link GetSupplierInfoBySettlementType }
     * 
     */
    public GetSupplierInfoBySettlementType createGetSupplierInfoBySettlementType() {
        return new GetSupplierInfoBySettlementType();
    }

    /**
     * Create an instance of {@link GetSupplierInfoBySettlementTypeResponse2 }
     * 
     */
    public GetSupplierInfoBySettlementTypeResponse2 createGetSupplierInfoBySettlementTypeResponse2() {
        return new GetSupplierInfoBySettlementTypeResponse2();
    }

    /**
     * Create an instance of {@link CheckMHotelName }
     * 
     */
    public CheckMHotelName createCheckMHotelName() {
        return new CheckMHotelName();
    }

    /**
     * Create an instance of {@link CheckMHotelNameResponse2 }
     * 
     */
    public CheckMHotelNameResponse2 createCheckMHotelNameResponse2() {
        return new CheckMHotelNameResponse2();
    }

    /**
     * Create an instance of {@link GetSupplierInfo }
     * 
     */
    public GetSupplierInfo createGetSupplierInfo() {
        return new GetSupplierInfo();
    }

    /**
     * Create an instance of {@link GetSupplierInfoResponse2 }
     * 
     */
    public GetSupplierInfoResponse2 createGetSupplierInfoResponse2() {
        return new GetSupplierInfoResponse2();
    }

    /**
     * Create an instance of {@link EditRoomAmount4Partners }
     * 
     */
    public EditRoomAmount4Partners createEditRoomAmount4Partners() {
        return new EditRoomAmount4Partners();
    }

    /**
     * Create an instance of {@link EditRoomAmount4PartnersResponse2 }
     * 
     */
    public EditRoomAmount4PartnersResponse2 createEditRoomAmount4PartnersResponse2() {
        return new EditRoomAmount4PartnersResponse2();
    }

    /**
     * Create an instance of {@link EditRoomAmount4PartnersInt }
     * 
     */
    public EditRoomAmount4PartnersInt createEditRoomAmount4PartnersInt() {
        return new EditRoomAmount4PartnersInt();
    }

    /**
     * Create an instance of {@link EditRoomAmount4PartnersIntResponse2 }
     * 
     */
    public EditRoomAmount4PartnersIntResponse2 createEditRoomAmount4PartnersIntResponse2() {
        return new EditRoomAmount4PartnersIntResponse2();
    }

    /**
     * Create an instance of {@link SaveRoomOverSaleInventory4Partner }
     * 
     */
    public SaveRoomOverSaleInventory4Partner createSaveRoomOverSaleInventory4Partner() {
        return new SaveRoomOverSaleInventory4Partner();
    }

    /**
     * Create an instance of {@link SaveRoomOverSaleInventory4PartnerResponse2 }
     * 
     */
    public SaveRoomOverSaleInventory4PartnerResponse2 createSaveRoomOverSaleInventory4PartnerResponse2() {
        return new SaveRoomOverSaleInventory4PartnerResponse2();
    }

    /**
     * Create an instance of {@link BatchReplaceInventory4Partner }
     * 
     */
    public BatchReplaceInventory4Partner createBatchReplaceInventory4Partner() {
        return new BatchReplaceInventory4Partner();
    }

    /**
     * Create an instance of {@link BatchReplaceInventory4PartnerResponse2 }
     * 
     */
    public BatchReplaceInventory4PartnerResponse2 createBatchReplaceInventory4PartnerResponse2() {
        return new BatchReplaceInventory4PartnerResponse2();
    }

    /**
     * Create an instance of {@link EditRoomStatus4Partners }
     * 
     */
    public EditRoomStatus4Partners createEditRoomStatus4Partners() {
        return new EditRoomStatus4Partners();
    }

    /**
     * Create an instance of {@link EditRoomStatus4PartnersResponse2 }
     * 
     */
    public EditRoomStatus4PartnersResponse2 createEditRoomStatus4PartnersResponse2() {
        return new EditRoomStatus4PartnersResponse2();
    }

    /**
     * Create an instance of {@link EditRoomStatus4PartnersInt }
     * 
     */
    public EditRoomStatus4PartnersInt createEditRoomStatus4PartnersInt() {
        return new EditRoomStatus4PartnersInt();
    }

    /**
     * Create an instance of {@link EditRoomStatus4PartnersIntResponse2 }
     * 
     */
    public EditRoomStatus4PartnersIntResponse2 createEditRoomStatus4PartnersIntResponse2() {
        return new EditRoomStatus4PartnersIntResponse2();
    }

    /**
     * Create an instance of {@link EditRoomStatus4EB }
     * 
     */
    public EditRoomStatus4EB createEditRoomStatus4EB() {
        return new EditRoomStatus4EB();
    }

    /**
     * Create an instance of {@link EditRoomStatus4EBResponse }
     * 
     */
    public EditRoomStatus4EBResponse createEditRoomStatus4EBResponse() {
        return new EditRoomStatus4EBResponse();
    }

    /**
     * Create an instance of {@link EditRoomStatus4EBInt }
     * 
     */
    public EditRoomStatus4EBInt createEditRoomStatus4EBInt() {
        return new EditRoomStatus4EBInt();
    }

    /**
     * Create an instance of {@link EditRoomStatus4EBIntResponse }
     * 
     */
    public EditRoomStatus4EBIntResponse createEditRoomStatus4EBIntResponse() {
        return new EditRoomStatus4EBIntResponse();
    }

    /**
     * Create an instance of {@link BatchEditInvAmountAndStatusForEBooking }
     * 
     */
    public BatchEditInvAmountAndStatusForEBooking createBatchEditInvAmountAndStatusForEBooking() {
        return new BatchEditInvAmountAndStatusForEBooking();
    }

    /**
     * Create an instance of {@link BatchEditInvAmountAndStatusForEBookingResponse2 }
     * 
     */
    public BatchEditInvAmountAndStatusForEBookingResponse2 createBatchEditInvAmountAndStatusForEBookingResponse2() {
        return new BatchEditInvAmountAndStatusForEBookingResponse2();
    }

    /**
     * Create an instance of {@link BatchEditInvAmountAndStatusExecutorForEBooking }
     * 
     */
    public BatchEditInvAmountAndStatusExecutorForEBooking createBatchEditInvAmountAndStatusExecutorForEBooking() {
        return new BatchEditInvAmountAndStatusExecutorForEBooking();
    }

    /**
     * Create an instance of {@link BatchEditInvAmountAndStatusExecutorForEBookingResponse }
     * 
     */
    public BatchEditInvAmountAndStatusExecutorForEBookingResponse createBatchEditInvAmountAndStatusExecutorForEBookingResponse() {
        return new BatchEditInvAmountAndStatusExecutorForEBookingResponse();
    }

    /**
     * Create an instance of {@link EditInventoryEndDate4Partners }
     * 
     */
    public EditInventoryEndDate4Partners createEditInventoryEndDate4Partners() {
        return new EditInventoryEndDate4Partners();
    }

    /**
     * Create an instance of {@link EditInventoryEndDate4PartnersResponse2 }
     * 
     */
    public EditInventoryEndDate4PartnersResponse2 createEditInventoryEndDate4PartnersResponse2() {
        return new EditInventoryEndDate4PartnersResponse2();
    }

    /**
     * Create an instance of {@link GetHotelInventoryDetail4Partners }
     * 
     */
    public GetHotelInventoryDetail4Partners createGetHotelInventoryDetail4Partners() {
        return new GetHotelInventoryDetail4Partners();
    }

    /**
     * Create an instance of {@link GetHotelInventoryDetail4PartnersResponse2 }
     * 
     */
    public GetHotelInventoryDetail4PartnersResponse2 createGetHotelInventoryDetail4PartnersResponse2() {
        return new GetHotelInventoryDetail4PartnersResponse2();
    }

    /**
     * Create an instance of {@link GetHotelInventoryDetail4PartnersInt }
     * 
     */
    public GetHotelInventoryDetail4PartnersInt createGetHotelInventoryDetail4PartnersInt() {
        return new GetHotelInventoryDetail4PartnersInt();
    }

    /**
     * Create an instance of {@link GetHotelInventoryDetail4PartnersIntResponse2 }
     * 
     */
    public GetHotelInventoryDetail4PartnersIntResponse2 createGetHotelInventoryDetail4PartnersIntResponse2() {
        return new GetHotelInventoryDetail4PartnersIntResponse2();
    }

    /**
     * Create an instance of {@link GetEbookingRoomNumHisHotel3 }
     * 
     */
    public GetEbookingRoomNumHisHotel3 createGetEbookingRoomNumHisHotel3() {
        return new GetEbookingRoomNumHisHotel3();
    }

    /**
     * Create an instance of {@link GetEbookingRoomNumHisHotel3Response2 }
     * 
     */
    public GetEbookingRoomNumHisHotel3Response2 createGetEbookingRoomNumHisHotel3Response2() {
        return new GetEbookingRoomNumHisHotel3Response2();
    }

    /**
     * Create an instance of {@link GetInventoryChangeList }
     * 
     */
    public GetInventoryChangeList createGetInventoryChangeList() {
        return new GetInventoryChangeList();
    }

    /**
     * Create an instance of {@link GetInventoryChangeListResponse2 }
     * 
     */
    public GetInventoryChangeListResponse2 createGetInventoryChangeListResponse2() {
        return new GetInventoryChangeListResponse2();
    }

    /**
     * Create an instance of {@link GetInventoryChangeMinID }
     * 
     */
    public GetInventoryChangeMinID createGetInventoryChangeMinID() {
        return new GetInventoryChangeMinID();
    }

    /**
     * Create an instance of {@link GetInventoryChangeMinIDResponse2 }
     * 
     */
    public GetInventoryChangeMinIDResponse2 createGetInventoryChangeMinIDResponse2() {
        return new GetInventoryChangeMinIDResponse2();
    }

    /**
     * Create an instance of {@link GetInventoryChangeDetail }
     * 
     */
    public GetInventoryChangeDetail createGetInventoryChangeDetail() {
        return new GetInventoryChangeDetail();
    }

    /**
     * Create an instance of {@link GetInventoryChangeDetailResponse2 }
     * 
     */
    public GetInventoryChangeDetailResponse2 createGetInventoryChangeDetailResponse2() {
        return new GetInventoryChangeDetailResponse2();
    }

    /**
     * Create an instance of {@link GetInventoryChangeDetailAndInstantConfirm }
     * 
     */
    public GetInventoryChangeDetailAndInstantConfirm createGetInventoryChangeDetailAndInstantConfirm() {
        return new GetInventoryChangeDetailAndInstantConfirm();
    }

    /**
     * Create an instance of {@link GetInventoryChangeDetailAndInstantConfirmResponse }
     * 
     */
    public GetInventoryChangeDetailAndInstantConfirmResponse createGetInventoryChangeDetailAndInstantConfirmResponse() {
        return new GetInventoryChangeDetailAndInstantConfirmResponse();
    }

    /**
     * Create an instance of {@link SelectFSInfoDayByDay }
     * 
     */
    public SelectFSInfoDayByDay createSelectFSInfoDayByDay() {
        return new SelectFSInfoDayByDay();
    }

    /**
     * Create an instance of {@link SelectFSInfoDayByDayResponse }
     * 
     */
    public SelectFSInfoDayByDayResponse createSelectFSInfoDayByDayResponse() {
        return new SelectFSInfoDayByDayResponse();
    }

    /**
     * Create an instance of {@link GetRoomTypeByShotelId }
     * 
     */
    public GetRoomTypeByShotelId createGetRoomTypeByShotelId() {
        return new GetRoomTypeByShotelId();
    }

    /**
     * Create an instance of {@link GetRoomTypeByShotelIdResponse2 }
     * 
     */
    public GetRoomTypeByShotelIdResponse2 createGetRoomTypeByShotelIdResponse2() {
        return new GetRoomTypeByShotelIdResponse2();
    }

    /**
     * Create an instance of {@link GetInventoryRoomStatusHotel3 }
     * 
     */
    public GetInventoryRoomStatusHotel3 createGetInventoryRoomStatusHotel3() {
        return new GetInventoryRoomStatusHotel3();
    }

    /**
     * Create an instance of {@link GetInventoryRoomStatusHotel3Response }
     * 
     */
    public GetInventoryRoomStatusHotel3Response createGetInventoryRoomStatusHotel3Response() {
        return new GetInventoryRoomStatusHotel3Response();
    }

    /**
     * Create an instance of {@link GetResSupplyUseGroupByInventoryTypeHotel3 }
     * 
     */
    public GetResSupplyUseGroupByInventoryTypeHotel3 createGetResSupplyUseGroupByInventoryTypeHotel3() {
        return new GetResSupplyUseGroupByInventoryTypeHotel3();
    }

    /**
     * Create an instance of {@link GetResSupplyUseGroupByInventoryTypeHotel3Response }
     * 
     */
    public GetResSupplyUseGroupByInventoryTypeHotel3Response createGetResSupplyUseGroupByInventoryTypeHotel3Response() {
        return new GetResSupplyUseGroupByInventoryTypeHotel3Response();
    }

    /**
     * Create an instance of {@link GetBuyedInventoryDetailofHotel }
     * 
     */
    public GetBuyedInventoryDetailofHotel createGetBuyedInventoryDetailofHotel() {
        return new GetBuyedInventoryDetailofHotel();
    }

    /**
     * Create an instance of {@link GetBuyedInventoryDetailofHotelResponse }
     * 
     */
    public GetBuyedInventoryDetailofHotelResponse createGetBuyedInventoryDetailofHotelResponse() {
        return new GetBuyedInventoryDetailofHotelResponse();
    }

    /**
     * Create an instance of {@link GetHotelInventorySumRoomToProcUseV1 }
     * 
     */
    public GetHotelInventorySumRoomToProcUseV1 createGetHotelInventorySumRoomToProcUseV1() {
        return new GetHotelInventorySumRoomToProcUseV1();
    }

    /**
     * Create an instance of {@link GetHotelInventorySumRoomToProcUseV1Response }
     * 
     */
    public GetHotelInventorySumRoomToProcUseV1Response createGetHotelInventorySumRoomToProcUseV1Response() {
        return new GetHotelInventorySumRoomToProcUseV1Response();
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
     * Create an instance of {@link ArrayOfKeyValueOfintInvAmountAndStatusResultElement8X1Z9B1I.KeyValueOfintInvAmountAndStatusResultElement8X1Z9B1I }
     * 
     */
    public ArrayOfKeyValueOfintInvAmountAndStatusResultElement8X1Z9B1I.KeyValueOfintInvAmountAndStatusResultElement8X1Z9B1I createArrayOfKeyValueOfintInvAmountAndStatusResultElement8X1Z9B1IKeyValueOfintInvAmountAndStatusResultElement8X1Z9B1I() {
        return new ArrayOfKeyValueOfintInvAmountAndStatusResultElement8X1Z9B1I.KeyValueOfintInvAmountAndStatusResultElement8X1Z9B1I();
    }

    /**
     * Create an instance of {@link ArrayOfKeyValueOfintInvAmountAndStatusResult4OneInvType8X1Z9B1I.KeyValueOfintInvAmountAndStatusResult4OneInvType8X1Z9B1I }
     * 
     */
    public ArrayOfKeyValueOfintInvAmountAndStatusResult4OneInvType8X1Z9B1I.KeyValueOfintInvAmountAndStatusResult4OneInvType8X1Z9B1I createArrayOfKeyValueOfintInvAmountAndStatusResult4OneInvType8X1Z9B1IKeyValueOfintInvAmountAndStatusResult4OneInvType8X1Z9B1I() {
        return new ArrayOfKeyValueOfintInvAmountAndStatusResult4OneInvType8X1Z9B1I.KeyValueOfintInvAmountAndStatusResult4OneInvType8X1Z9B1I();
    }

    /**
     * Create an instance of {@link ArrayOfKeyValueOfintArrayOfDateIntervalInventoryInfoyrFq0QSa.KeyValueOfintArrayOfDateIntervalInventoryInfoyrFq0QSa }
     * 
     */
    public ArrayOfKeyValueOfintArrayOfDateIntervalInventoryInfoyrFq0QSa.KeyValueOfintArrayOfDateIntervalInventoryInfoyrFq0QSa createArrayOfKeyValueOfintArrayOfDateIntervalInventoryInfoyrFq0QSaKeyValueOfintArrayOfDateIntervalInventoryInfoyrFq0QSa() {
        return new ArrayOfKeyValueOfintArrayOfDateIntervalInventoryInfoyrFq0QSa.KeyValueOfintArrayOfDateIntervalInventoryInfoyrFq0QSa();
    }

    /**
     * Create an instance of {@link ArrayOfKeyValueOfdateTimedateTime.KeyValueOfdateTimedateTime }
     * 
     */
    public ArrayOfKeyValueOfdateTimedateTime.KeyValueOfdateTimedateTime createArrayOfKeyValueOfdateTimedateTimeKeyValueOfdateTimedateTime() {
        return new ArrayOfKeyValueOfdateTimedateTime.KeyValueOfdateTimedateTime();
    }

    /**
     * Create an instance of {@link ArrayOfKeyValueOfstringBedInfoForDaywSkfccAu.KeyValueOfstringBedInfoForDaywSkfccAu }
     * 
     */
    public ArrayOfKeyValueOfstringBedInfoForDaywSkfccAu.KeyValueOfstringBedInfoForDaywSkfccAu createArrayOfKeyValueOfstringBedInfoForDaywSkfccAuKeyValueOfstringBedInfoForDaywSkfccAu() {
        return new ArrayOfKeyValueOfstringBedInfoForDaywSkfccAu.KeyValueOfstringBedInfoForDaywSkfccAu();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link String }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Enums", name = "BedTypeEnum")
    public JAXBElement<List<String>> createBedTypeEnum(List<String> value) {
        return new JAXBElement<List<String>>(_BedTypeEnum_QNAME, ((Class) List.class), null, (value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnumCutType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Enums", name = "EnumCutType")
    public JAXBElement<EnumCutType> createEnumCutType(EnumCutType value) {
        return new JAXBElement<EnumCutType>(_EnumCutType_QNAME, EnumCutType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnumPrepayRule }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Enums", name = "EnumPrepayRule")
    public JAXBElement<EnumPrepayRule> createEnumPrepayRule(EnumPrepayRule value) {
        return new JAXBElement<EnumPrepayRule>(_EnumPrepayRule_QNAME, EnumPrepayRule.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnumRuleTarget }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Enums", name = "EnumRuleTarget")
    public JAXBElement<EnumRuleTarget> createEnumRuleTarget(EnumRuleTarget value) {
        return new JAXBElement<EnumRuleTarget>(_EnumRuleTarget_QNAME, EnumRuleTarget.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnumDateType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Enums", name = "EnumDateType")
    public JAXBElement<EnumDateType> createEnumDateType(EnumDateType value) {
        return new JAXBElement<EnumDateType>(_EnumDateType_QNAME, EnumDateType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link String }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Enums", name = "WeekDays")
    public JAXBElement<List<String>> createWeekDays(List<String> value) {
        return new JAXBElement<List<String>>(_WeekDays_QNAME, ((Class) List.class), null, (value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnumIsArriveTimeVouch }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Enums", name = "EnumIsArriveTimeVouch")
    public JAXBElement<EnumIsArriveTimeVouch> createEnumIsArriveTimeVouch(EnumIsArriveTimeVouch value) {
        return new JAXBElement<EnumIsArriveTimeVouch>(_EnumIsArriveTimeVouch_QNAME, EnumIsArriveTimeVouch.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnumIsRoomCountVouch }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Enums", name = "EnumIsRoomCountVouch")
    public JAXBElement<EnumIsRoomCountVouch> createEnumIsRoomCountVouch(EnumIsRoomCountVouch value) {
        return new JAXBElement<EnumIsRoomCountVouch>(_EnumIsRoomCountVouch_QNAME, EnumIsRoomCountVouch.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnumVouchMoneyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Enums", name = "EnumVouchMoneyType")
    public JAXBElement<EnumVouchMoneyType> createEnumVouchMoneyType(EnumVouchMoneyType value) {
        return new JAXBElement<EnumVouchMoneyType>(_EnumVouchMoneyType_QNAME, EnumVouchMoneyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnumVouchRule }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Enums", name = "EnumVouchRule")
    public JAXBElement<EnumVouchRule> createEnumVouchRule(EnumVouchRule value) {
        return new JAXBElement<EnumVouchRule>(_EnumVouchRule_QNAME, EnumVouchRule.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnumVouchWay }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Enums", name = "EnumVouchWay")
    public JAXBElement<EnumVouchWay> createEnumVouchWay(EnumVouchWay value) {
        return new JAXBElement<EnumVouchWay>(_EnumVouchWay_QNAME, EnumVouchWay.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthorizationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Enums", name = "AuthorizationType")
    public JAXBElement<AuthorizationType> createAuthorizationType(AuthorizationType value) {
        return new JAXBElement<AuthorizationType>(_AuthorizationType_QNAME, AuthorizationType.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link RoomAdditionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Enums", name = "RoomAdditionType")
    public JAXBElement<RoomAdditionType> createRoomAdditionType(RoomAdditionType value) {
        return new JAXBElement<RoomAdditionType>(_RoomAdditionType_QNAME, RoomAdditionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BedInfoForDay }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model.Room", name = "BedInfoForDay")
    public JAXBElement<BedInfoForDay> createBedInfoForDay(BedInfoForDay value) {
        return new JAXBElement<BedInfoForDay>(_BedInfoForDay_QNAME, BedInfoForDay.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GetClosedBedTypeInfoRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Request", name = "GetClosedBedTypeInfoRequest")
    public JAXBElement<GetClosedBedTypeInfoRequest> createGetClosedBedTypeInfoRequest(GetClosedBedTypeInfoRequest value) {
        return new JAXBElement<GetClosedBedTypeInfoRequest>(_GetClosedBedTypeInfoRequest_QNAME, GetClosedBedTypeInfoRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveBedInfoRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Request", name = "SaveBedInfoRequest")
    public JAXBElement<SaveBedInfoRequest> createSaveBedInfoRequest(SaveBedInfoRequest value) {
        return new JAXBElement<SaveBedInfoRequest>(_SaveBedInfoRequest_QNAME, SaveBedInfoRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreatePerpayPolicyRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Request", name = "CreatePerpayPolicyRequest")
    public JAXBElement<CreatePerpayPolicyRequest> createCreatePerpayPolicyRequest(CreatePerpayPolicyRequest value) {
        return new JAXBElement<CreatePerpayPolicyRequest>(_CreatePerpayPolicyRequest_QNAME, CreatePerpayPolicyRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateRatePalnPolicyBase }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Request", name = "CreateRatePalnPolicyBase")
    public JAXBElement<CreateRatePalnPolicyBase> createCreateRatePalnPolicyBase(CreateRatePalnPolicyBase value) {
        return new JAXBElement<CreateRatePalnPolicyBase>(_CreateRatePalnPolicyBase_QNAME, CreateRatePalnPolicyBase.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateVouchPolicyRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Request", name = "CreateVouchPolicyRequest")
    public JAXBElement<CreateVouchPolicyRequest> createCreateVouchPolicyRequest(CreateVouchPolicyRequest value) {
        return new JAXBElement<CreateVouchPolicyRequest>(_CreateVouchPolicyRequest_QNAME, CreateVouchPolicyRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteVouchPolicyByDateSpan4PartnerRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Request", name = "DeleteVouchPolicyByDateSpan4PartnerRequest")
    public JAXBElement<DeleteVouchPolicyByDateSpan4PartnerRequest> createDeleteVouchPolicyByDateSpan4PartnerRequest(DeleteVouchPolicyByDateSpan4PartnerRequest value) {
        return new JAXBElement<DeleteVouchPolicyByDateSpan4PartnerRequest>(_DeleteVouchPolicyByDateSpan4PartnerRequest_QNAME, DeleteVouchPolicyByDateSpan4PartnerRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeletePrepayPolicyByDateSpan4PartnerRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Request", name = "DeletePrepayPolicyByDateSpan4PartnerRequest")
    public JAXBElement<DeletePrepayPolicyByDateSpan4PartnerRequest> createDeletePrepayPolicyByDateSpan4PartnerRequest(DeletePrepayPolicyByDateSpan4PartnerRequest value) {
        return new JAXBElement<DeletePrepayPolicyByDateSpan4PartnerRequest>(_DeletePrepayPolicyByDateSpan4PartnerRequest_QNAME, DeletePrepayPolicyByDateSpan4PartnerRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSupplierSwitchStatusRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Request", name = "GetSupplierSwitchStatusRequest")
    public JAXBElement<GetSupplierSwitchStatusRequest> createGetSupplierSwitchStatusRequest(GetSupplierSwitchStatusRequest value) {
        return new JAXBElement<GetSupplierSwitchStatusRequest>(_GetSupplierSwitchStatusRequest_QNAME, GetSupplierSwitchStatusRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateShotelForPartnerRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Request", name = "CreateShotelForPartnerRequest")
    public JAXBElement<CreateShotelForPartnerRequest> createCreateShotelForPartnerRequest(CreateShotelForPartnerRequest value) {
        return new JAXBElement<CreateShotelForPartnerRequest>(_CreateShotelForPartnerRequest_QNAME, CreateShotelForPartnerRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckMHotelNameRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Request", name = "CheckMHotelNameRequest")
    public JAXBElement<CheckMHotelNameRequest> createCheckMHotelNameRequest(CheckMHotelNameRequest value) {
        return new JAXBElement<CheckMHotelNameRequest>(_CheckMHotelNameRequest_QNAME, CheckMHotelNameRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSupplierInfoRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Request", name = "GetSupplierInfoRequest")
    public JAXBElement<GetSupplierInfoRequest> createGetSupplierInfoRequest(GetSupplierInfoRequest value) {
        return new JAXBElement<GetSupplierInfoRequest>(_GetSupplierInfoRequest_QNAME, GetSupplierInfoRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditRoomAmount4PartnersIntRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Request", name = "EditRoomAmount4PartnersIntRequest")
    public JAXBElement<EditRoomAmount4PartnersIntRequest> createEditRoomAmount4PartnersIntRequest(EditRoomAmount4PartnersIntRequest value) {
        return new JAXBElement<EditRoomAmount4PartnersIntRequest>(_EditRoomAmount4PartnersIntRequest_QNAME, EditRoomAmount4PartnersIntRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveRoomOverSaleInventory4PartnerRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Request", name = "SaveRoomOverSaleInventory4PartnerRequest")
    public JAXBElement<SaveRoomOverSaleInventory4PartnerRequest> createSaveRoomOverSaleInventory4PartnerRequest(SaveRoomOverSaleInventory4PartnerRequest value) {
        return new JAXBElement<SaveRoomOverSaleInventory4PartnerRequest>(_SaveRoomOverSaleInventory4PartnerRequest_QNAME, SaveRoomOverSaleInventory4PartnerRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BatchReplaceInventory4PartnerRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Request", name = "BatchReplaceInventory4PartnerRequest")
    public JAXBElement<BatchReplaceInventory4PartnerRequest> createBatchReplaceInventory4PartnerRequest(BatchReplaceInventory4PartnerRequest value) {
        return new JAXBElement<BatchReplaceInventory4PartnerRequest>(_BatchReplaceInventory4PartnerRequest_QNAME, BatchReplaceInventory4PartnerRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditRoomStatus4PartnersIntRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Request", name = "EditRoomStatus4PartnersIntRequest")
    public JAXBElement<EditRoomStatus4PartnersIntRequest> createEditRoomStatus4PartnersIntRequest(EditRoomStatus4PartnersIntRequest value) {
        return new JAXBElement<EditRoomStatus4PartnersIntRequest>(_EditRoomStatus4PartnersIntRequest_QNAME, EditRoomStatus4PartnersIntRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditRoomStatus4EBIntRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Request", name = "EditRoomStatus4EBIntRequest")
    public JAXBElement<EditRoomStatus4EBIntRequest> createEditRoomStatus4EBIntRequest(EditRoomStatus4EBIntRequest value) {
        return new JAXBElement<EditRoomStatus4EBIntRequest>(_EditRoomStatus4EBIntRequest_QNAME, EditRoomStatus4EBIntRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BatchEditInvAmountAndStatusForEBookingRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Request", name = "BatchEditInvAmountAndStatusForEBookingRequest")
    public JAXBElement<BatchEditInvAmountAndStatusForEBookingRequest> createBatchEditInvAmountAndStatusForEBookingRequest(BatchEditInvAmountAndStatusForEBookingRequest value) {
        return new JAXBElement<BatchEditInvAmountAndStatusForEBookingRequest>(_BatchEditInvAmountAndStatusForEBookingRequest_QNAME, BatchEditInvAmountAndStatusForEBookingRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRoomTypeByShotelIdRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Request", name = "GetRoomTypeByShotelIdRequest")
    public JAXBElement<GetRoomTypeByShotelIdRequest> createGetRoomTypeByShotelIdRequest(GetRoomTypeByShotelIdRequest value) {
        return new JAXBElement<GetRoomTypeByShotelIdRequest>(_GetRoomTypeByShotelIdRequest_QNAME, GetRoomTypeByShotelIdRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfBedInfoEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model", name = "ArrayOfBedInfoEntity")
    public JAXBElement<ArrayOfBedInfoEntity> createArrayOfBedInfoEntity(ArrayOfBedInfoEntity value) {
        return new JAXBElement<ArrayOfBedInfoEntity>(_ArrayOfBedInfoEntity_QNAME, ArrayOfBedInfoEntity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BedInfoEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model", name = "BedInfoEntity")
    public JAXBElement<BedInfoEntity> createBedInfoEntity(BedInfoEntity value) {
        return new JAXBElement<BedInfoEntity>(_BedInfoEntity_QNAME, BedInfoEntity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CPPerpayPolicyInfoChangeRule }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model", name = "CP_PerpayPolicyInfo.ChangeRule")
    public JAXBElement<CPPerpayPolicyInfoChangeRule> createCPPerpayPolicyInfoChangeRule(CPPerpayPolicyInfoChangeRule value) {
        return new JAXBElement<CPPerpayPolicyInfoChangeRule>(_CPPerpayPolicyInfoChangeRule_QNAME, CPPerpayPolicyInfoChangeRule.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SHotelInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model", name = "SHotelInfo")
    public JAXBElement<SHotelInfo> createSHotelInfo(SHotelInfo value) {
        return new JAXBElement<SHotelInfo>(_SHotelInfo_QNAME, SHotelInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSupplierInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model", name = "ArrayOfSupplierInfo")
    public JAXBElement<ArrayOfSupplierInfo> createArrayOfSupplierInfo(ArrayOfSupplierInfo value) {
        return new JAXBElement<ArrayOfSupplierInfo>(_ArrayOfSupplierInfo_QNAME, ArrayOfSupplierInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SupplierInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model", name = "SupplierInfo")
    public JAXBElement<SupplierInfo> createSupplierInfo(SupplierInfo value) {
        return new JAXBElement<SupplierInfo>(_SupplierInfo_QNAME, SupplierInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfInventoryDayDetailInfoInt }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model", name = "ArrayOfInventoryDayDetailInfoInt")
    public JAXBElement<ArrayOfInventoryDayDetailInfoInt> createArrayOfInventoryDayDetailInfoInt(ArrayOfInventoryDayDetailInfoInt value) {
        return new JAXBElement<ArrayOfInventoryDayDetailInfoInt>(_ArrayOfInventoryDayDetailInfoInt_QNAME, ArrayOfInventoryDayDetailInfoInt.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InventoryDayDetailInfoInt }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model", name = "InventoryDayDetailInfoInt")
    public JAXBElement<InventoryDayDetailInfoInt> createInventoryDayDetailInfoInt(InventoryDayDetailInfoInt value) {
        return new JAXBElement<InventoryDayDetailInfoInt>(_InventoryDayDetailInfoInt_QNAME, InventoryDayDetailInfoInt.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfResourceInventoryDetailInt }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model", name = "ArrayOfResourceInventoryDetailInt")
    public JAXBElement<ArrayOfResourceInventoryDetailInt> createArrayOfResourceInventoryDetailInt(ArrayOfResourceInventoryDetailInt value) {
        return new JAXBElement<ArrayOfResourceInventoryDetailInt>(_ArrayOfResourceInventoryDetailInt_QNAME, ArrayOfResourceInventoryDetailInt.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResourceInventoryDetailInt }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model", name = "ResourceInventoryDetailInt")
    public JAXBElement<ResourceInventoryDetailInt> createResourceInventoryDetailInt(ResourceInventoryDetailInt value) {
        return new JAXBElement<ResourceInventoryDetailInt>(_ResourceInventoryDetailInt_QNAME, ResourceInventoryDetailInt.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfGetEbookingRoomNumModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model", name = "ArrayOfGetEbookingRoomNumModel")
    public JAXBElement<ArrayOfGetEbookingRoomNumModel> createArrayOfGetEbookingRoomNumModel(ArrayOfGetEbookingRoomNumModel value) {
        return new JAXBElement<ArrayOfGetEbookingRoomNumModel>(_ArrayOfGetEbookingRoomNumModel_QNAME, ArrayOfGetEbookingRoomNumModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEbookingRoomNumModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model", name = "GetEbookingRoomNumModel")
    public JAXBElement<GetEbookingRoomNumModel> createGetEbookingRoomNumModel(GetEbookingRoomNumModel value) {
        return new JAXBElement<GetEbookingRoomNumModel>(_GetEbookingRoomNumModel_QNAME, GetEbookingRoomNumModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfInventoryChangeModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model", name = "ArrayOfInventoryChangeModel")
    public JAXBElement<ArrayOfInventoryChangeModel> createArrayOfInventoryChangeModel(ArrayOfInventoryChangeModel value) {
        return new JAXBElement<ArrayOfInventoryChangeModel>(_ArrayOfInventoryChangeModel_QNAME, ArrayOfInventoryChangeModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InventoryChangeModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model", name = "InventoryChangeModel")
    public JAXBElement<InventoryChangeModel> createInventoryChangeModel(InventoryChangeModel value) {
        return new JAXBElement<InventoryChangeModel>(_InventoryChangeModel_QNAME, InventoryChangeModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfMRoomInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model", name = "ArrayOfMRoomInfo")
    public JAXBElement<ArrayOfMRoomInfo> createArrayOfMRoomInfo(ArrayOfMRoomInfo value) {
        return new JAXBElement<ArrayOfMRoomInfo>(_ArrayOfMRoomInfo_QNAME, ArrayOfMRoomInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MRoomInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model", name = "MRoomInfo")
    public JAXBElement<MRoomInfo> createMRoomInfo(MRoomInfo value) {
        return new JAXBElement<MRoomInfo>(_MRoomInfo_QNAME, MRoomInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfMRoomAddition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model", name = "ArrayOfMRoomAddition")
    public JAXBElement<ArrayOfMRoomAddition> createArrayOfMRoomAddition(ArrayOfMRoomAddition value) {
        return new JAXBElement<ArrayOfMRoomAddition>(_ArrayOfMRoomAddition_QNAME, ArrayOfMRoomAddition.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MRoomAddition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model", name = "MRoomAddition")
    public JAXBElement<MRoomAddition> createMRoomAddition(MRoomAddition value) {
        return new JAXBElement<MRoomAddition>(_MRoomAddition_QNAME, MRoomAddition.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetInventoryChangeDetailResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response.Inventory", name = "GetInventoryChangeDetailResponse")
    public JAXBElement<GetInventoryChangeDetailResponse> createGetInventoryChangeDetailResponse(GetInventoryChangeDetailResponse value) {
        return new JAXBElement<GetInventoryChangeDetailResponse>(_GetInventoryChangeDetailResponse_QNAME, GetInventoryChangeDetailResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetInventoryChangeListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response.Inventory", name = "GetInventoryChangeListResponse")
    public JAXBElement<GetInventoryChangeListResponse> createGetInventoryChangeListResponse(GetInventoryChangeListResponse value) {
        return new JAXBElement<GetInventoryChangeListResponse>(_GetInventoryChangeListResponse_QNAME, GetInventoryChangeListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetInventoryChangeMinIDResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response.Inventory", name = "GetInventoryChangeMinIDResponse")
    public JAXBElement<GetInventoryChangeMinIDResponse> createGetInventoryChangeMinIDResponse(GetInventoryChangeMinIDResponse value) {
        return new JAXBElement<GetInventoryChangeMinIDResponse>(_GetInventoryChangeMinIDResponse_QNAME, GetInventoryChangeMinIDResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetInvChangeAndInstantConfirmResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response.Inventory", name = "GetInvChangeAndInstantConfirmResponse")
    public JAXBElement<GetInvChangeAndInstantConfirmResponse> createGetInvChangeAndInstantConfirmResponse(GetInvChangeAndInstantConfirmResponse value) {
        return new JAXBElement<GetInvChangeAndInstantConfirmResponse>(_GetInvChangeAndInstantConfirmResponse_QNAME, GetInvChangeAndInstantConfirmResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FreeSaleResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response.Inventory", name = "FreeSaleResponse")
    public JAXBElement<FreeSaleResponse> createFreeSaleResponse(FreeSaleResponse value) {
        return new JAXBElement<FreeSaleResponse>(_FreeSaleResponse_QNAME, FreeSaleResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetInventoryRoomStatusResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response.Inventory", name = "GetInventoryRoomStatusResponse")
    public JAXBElement<GetInventoryRoomStatusResponse> createGetInventoryRoomStatusResponse(GetInventoryRoomStatusResponse value) {
        return new JAXBElement<GetInventoryRoomStatusResponse>(_GetInventoryRoomStatusResponse_QNAME, GetInventoryRoomStatusResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetResSupplyUseGroupHotel3Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response.Inventory", name = "GetResSupplyUseGroupHotel3Response")
    public JAXBElement<GetResSupplyUseGroupHotel3Response> createGetResSupplyUseGroupHotel3Response(GetResSupplyUseGroupHotel3Response value) {
        return new JAXBElement<GetResSupplyUseGroupHotel3Response>(_GetResSupplyUseGroupHotel3Response_QNAME, GetResSupplyUseGroupHotel3Response.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBuyedInventoryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response.Inventory", name = "GetBuyedInventoryResponse")
    public JAXBElement<GetBuyedInventoryResponse> createGetBuyedInventoryResponse(GetBuyedInventoryResponse value) {
        return new JAXBElement<GetBuyedInventoryResponse>(_GetBuyedInventoryResponse_QNAME, GetBuyedInventoryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateRatePalnPolicyResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response.CreateRatePalnPolicy", name = "CreateRatePalnPolicyResponse")
    public JAXBElement<CreateRatePalnPolicyResponse> createCreateRatePalnPolicyResponse(CreateRatePalnPolicyResponse value) {
        return new JAXBElement<CreateRatePalnPolicyResponse>(_CreateRatePalnPolicyResponse_QNAME, CreateRatePalnPolicyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteVouchPolicyByDateSpan4PartnerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response.CreateRatePalnPolicy", name = "DeleteVouchPolicyByDateSpan4PartnerResponse")
    public JAXBElement<DeleteVouchPolicyByDateSpan4PartnerResponse> createDeleteVouchPolicyByDateSpan4PartnerResponse(DeleteVouchPolicyByDateSpan4PartnerResponse value) {
        return new JAXBElement<DeleteVouchPolicyByDateSpan4PartnerResponse>(_DeleteVouchPolicyByDateSpan4PartnerResponse_QNAME, DeleteVouchPolicyByDateSpan4PartnerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeletePrepayPolicyByDateSpan4PartnerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response.CreateRatePalnPolicy", name = "DeletePrepayPolicyByDateSpan4PartnerResponse")
    public JAXBElement<DeletePrepayPolicyByDateSpan4PartnerResponse> createDeletePrepayPolicyByDateSpan4PartnerResponse(DeletePrepayPolicyByDateSpan4PartnerResponse value) {
        return new JAXBElement<DeletePrepayPolicyByDateSpan4PartnerResponse>(_DeletePrepayPolicyByDateSpan4PartnerResponse_QNAME, DeletePrepayPolicyByDateSpan4PartnerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetInventoryChangeDetailRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Request.Inventory", name = "GetInventoryChangeDetailRequest")
    public JAXBElement<GetInventoryChangeDetailRequest> createGetInventoryChangeDetailRequest(GetInventoryChangeDetailRequest value) {
        return new JAXBElement<GetInventoryChangeDetailRequest>(_GetInventoryChangeDetailRequest_QNAME, GetInventoryChangeDetailRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetHotelSwitchStatusRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Request.Inventory", name = "GetHotelSwitchStatusRequest")
    public JAXBElement<GetHotelSwitchStatusRequest> createGetHotelSwitchStatusRequest(GetHotelSwitchStatusRequest value) {
        return new JAXBElement<GetHotelSwitchStatusRequest>(_GetHotelSwitchStatusRequest_QNAME, GetHotelSwitchStatusRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetInventoryChangeListRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Request.Inventory", name = "GetInventoryChangeListRequest")
    public JAXBElement<GetInventoryChangeListRequest> createGetInventoryChangeListRequest(GetInventoryChangeListRequest value) {
        return new JAXBElement<GetInventoryChangeListRequest>(_GetInventoryChangeListRequest_QNAME, GetInventoryChangeListRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetInventoryChangeMinIDRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Request.Inventory", name = "GetInventoryChangeMinIDRequest")
    public JAXBElement<GetInventoryChangeMinIDRequest> createGetInventoryChangeMinIDRequest(GetInventoryChangeMinIDRequest value) {
        return new JAXBElement<GetInventoryChangeMinIDRequest>(_GetInventoryChangeMinIDRequest_QNAME, GetInventoryChangeMinIDRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetInvChangeAndInstantConfirmRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Request.Inventory", name = "GetInvChangeAndInstantConfirmRequest")
    public JAXBElement<GetInvChangeAndInstantConfirmRequest> createGetInvChangeAndInstantConfirmRequest(GetInvChangeAndInstantConfirmRequest value) {
        return new JAXBElement<GetInvChangeAndInstantConfirmRequest>(_GetInvChangeAndInstantConfirmRequest_QNAME, GetInvChangeAndInstantConfirmRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FreeSaleRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Request.Inventory", name = "FreeSaleRequest")
    public JAXBElement<FreeSaleRequest> createFreeSaleRequest(FreeSaleRequest value) {
        return new JAXBElement<FreeSaleRequest>(_FreeSaleRequest_QNAME, FreeSaleRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetInventoryRoomStatusRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Request.Inventory", name = "GetInventoryRoomStatusRequest")
    public JAXBElement<GetInventoryRoomStatusRequest> createGetInventoryRoomStatusRequest(GetInventoryRoomStatusRequest value) {
        return new JAXBElement<GetInventoryRoomStatusRequest>(_GetInventoryRoomStatusRequest_QNAME, GetInventoryRoomStatusRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetResSupplyUseGroupHotel3Request }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Request.Inventory", name = "GetResSupplyUseGroupHotel3Request")
    public JAXBElement<GetResSupplyUseGroupHotel3Request> createGetResSupplyUseGroupHotel3Request(GetResSupplyUseGroupHotel3Request value) {
        return new JAXBElement<GetResSupplyUseGroupHotel3Request>(_GetResSupplyUseGroupHotel3Request_QNAME, GetResSupplyUseGroupHotel3Request.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBuyedInventoryRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Request.Inventory", name = "GetBuyedInventoryRequest")
    public JAXBElement<GetBuyedInventoryRequest> createGetBuyedInventoryRequest(GetBuyedInventoryRequest value) {
        return new JAXBElement<GetBuyedInventoryRequest>(_GetBuyedInventoryRequest_QNAME, GetBuyedInventoryRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfResourceInventoryState }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model.Inventory", name = "ArrayOfResourceInventoryState")
    public JAXBElement<ArrayOfResourceInventoryState> createArrayOfResourceInventoryState(ArrayOfResourceInventoryState value) {
        return new JAXBElement<ArrayOfResourceInventoryState>(_ArrayOfResourceInventoryState_QNAME, ArrayOfResourceInventoryState.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResourceInventoryState }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model.Inventory", name = "ResourceInventoryState")
    public JAXBElement<ResourceInventoryState> createResourceInventoryState(ResourceInventoryState value) {
        return new JAXBElement<ResourceInventoryState>(_ResourceInventoryState_QNAME, ResourceInventoryState.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfInventoryAvailableInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model.Inventory", name = "ArrayOfInventoryAvailableInfo")
    public JAXBElement<ArrayOfInventoryAvailableInfo> createArrayOfInventoryAvailableInfo(ArrayOfInventoryAvailableInfo value) {
        return new JAXBElement<ArrayOfInventoryAvailableInfo>(_ArrayOfInventoryAvailableInfo_QNAME, ArrayOfInventoryAvailableInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InventoryAvailableInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model.Inventory", name = "InventoryAvailableInfo")
    public JAXBElement<InventoryAvailableInfo> createInventoryAvailableInfo(InventoryAvailableInfo value) {
        return new JAXBElement<InventoryAvailableInfo>(_InventoryAvailableInfo_QNAME, InventoryAvailableInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDateIntervalInventoryInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model.Inventory", name = "ArrayOfDateIntervalInventoryInfo")
    public JAXBElement<ArrayOfDateIntervalInventoryInfo> createArrayOfDateIntervalInventoryInfo(ArrayOfDateIntervalInventoryInfo value) {
        return new JAXBElement<ArrayOfDateIntervalInventoryInfo>(_ArrayOfDateIntervalInventoryInfo_QNAME, ArrayOfDateIntervalInventoryInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DateIntervalInventoryInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model.Inventory", name = "DateIntervalInventoryInfo")
    public JAXBElement<DateIntervalInventoryInfo> createDateIntervalInventoryInfo(DateIntervalInventoryInfo value) {
        return new JAXBElement<DateIntervalInventoryInfo>(_DateIntervalInventoryInfo_QNAME, DateIntervalInventoryInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfInventoryAmountAndStatusOperation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model.Inventory", name = "ArrayOfInventoryAmountAndStatusOperation")
    public JAXBElement<ArrayOfInventoryAmountAndStatusOperation> createArrayOfInventoryAmountAndStatusOperation(ArrayOfInventoryAmountAndStatusOperation value) {
        return new JAXBElement<ArrayOfInventoryAmountAndStatusOperation>(_ArrayOfInventoryAmountAndStatusOperation_QNAME, ArrayOfInventoryAmountAndStatusOperation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InventoryAmountAndStatusOperation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model.Inventory", name = "InventoryAmountAndStatusOperation")
    public JAXBElement<InventoryAmountAndStatusOperation> createInventoryAmountAndStatusOperation(InventoryAmountAndStatusOperation value) {
        return new JAXBElement<InventoryAmountAndStatusOperation>(_InventoryAmountAndStatusOperation_QNAME, InventoryAmountAndStatusOperation.class, null, value);
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

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfFreeSaleInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model.Inventory", name = "ArrayOfFreeSaleInfo")
    public JAXBElement<ArrayOfFreeSaleInfo> createArrayOfFreeSaleInfo(ArrayOfFreeSaleInfo value) {
        return new JAXBElement<ArrayOfFreeSaleInfo>(_ArrayOfFreeSaleInfo_QNAME, ArrayOfFreeSaleInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FreeSaleInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model.Inventory", name = "FreeSaleInfo")
    public JAXBElement<FreeSaleInfo> createFreeSaleInfo(FreeSaleInfo value) {
        return new JAXBElement<FreeSaleInfo>(_FreeSaleInfo_QNAME, FreeSaleInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfGetHotelInventoryRoomStatus4Backend }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model.Inventory", name = "ArrayOfGetHotelInventoryRoomStatus4Backend")
    public JAXBElement<ArrayOfGetHotelInventoryRoomStatus4Backend> createArrayOfGetHotelInventoryRoomStatus4Backend(ArrayOfGetHotelInventoryRoomStatus4Backend value) {
        return new JAXBElement<ArrayOfGetHotelInventoryRoomStatus4Backend>(_ArrayOfGetHotelInventoryRoomStatus4Backend_QNAME, ArrayOfGetHotelInventoryRoomStatus4Backend.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetHotelInventoryRoomStatus4Backend }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model.Inventory", name = "GetHotelInventoryRoomStatus4Backend")
    public JAXBElement<GetHotelInventoryRoomStatus4Backend> createGetHotelInventoryRoomStatus4Backend(GetHotelInventoryRoomStatus4Backend value) {
        return new JAXBElement<GetHotelInventoryRoomStatus4Backend>(_GetHotelInventoryRoomStatus4Backend_QNAME, GetHotelInventoryRoomStatus4Backend.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfGetBuyedInventoryModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model.Inventory", name = "ArrayOfGetBuyedInventoryModel")
    public JAXBElement<ArrayOfGetBuyedInventoryModel> createArrayOfGetBuyedInventoryModel(ArrayOfGetBuyedInventoryModel value) {
        return new JAXBElement<ArrayOfGetBuyedInventoryModel>(_ArrayOfGetBuyedInventoryModel_QNAME, ArrayOfGetBuyedInventoryModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBuyedInventoryModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model.Inventory", name = "GetBuyedInventoryModel")
    public JAXBElement<GetBuyedInventoryModel> createGetBuyedInventoryModel(GetBuyedInventoryModel value) {
        return new JAXBElement<GetBuyedInventoryModel>(_GetBuyedInventoryModel_QNAME, GetBuyedInventoryModel.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBedInfoToOtherSysResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response.Product4Partners", name = "GetBedInfoToOtherSysResponse")
    public JAXBElement<GetBedInfoToOtherSysResponse> createGetBedInfoToOtherSysResponse(GetBedInfoToOtherSysResponse value) {
        return new JAXBElement<GetBedInfoToOtherSysResponse>(_GetBedInfoToOtherSysResponse_QNAME, GetBedInfoToOtherSysResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IsUseDcInvResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response.Product4Partners", name = "IsUseDcInvResponse")
    public JAXBElement<IsUseDcInvResponse> createIsUseDcInvResponse(IsUseDcInvResponse value) {
        return new JAXBElement<IsUseDcInvResponse>(_IsUseDcInvResponse_QNAME, IsUseDcInvResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditInvStatus4DCResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response.Product4Partners", name = "EditInvStatus4DCResponse")
    public JAXBElement<EditInvStatus4DCResponse> createEditInvStatus4DCResponse(EditInvStatus4DCResponse value) {
        return new JAXBElement<EditInvStatus4DCResponse>(_EditInvStatus4DCResponse_QNAME, EditInvStatus4DCResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IsDCRoomBackupResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response.Product4Partners", name = "IsDCRoomBackupResponse")
    public JAXBElement<IsDCRoomBackupResponse> createIsDCRoomBackupResponse(IsDCRoomBackupResponse value) {
        return new JAXBElement<IsDCRoomBackupResponse>(_IsDCRoomBackupResponse_QNAME, IsDCRoomBackupResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditRoomAmount4PartnersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response.Product4Partners", name = "EditRoomAmount4PartnersResponse")
    public JAXBElement<EditRoomAmount4PartnersResponse> createEditRoomAmount4PartnersResponse(EditRoomAmount4PartnersResponse value) {
        return new JAXBElement<EditRoomAmount4PartnersResponse>(_EditRoomAmount4PartnersResponse_QNAME, EditRoomAmount4PartnersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditRoomAmount4PartnersIntResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response.Product4Partners", name = "EditRoomAmount4PartnersIntResponse")
    public JAXBElement<EditRoomAmount4PartnersIntResponse> createEditRoomAmount4PartnersIntResponse(EditRoomAmount4PartnersIntResponse value) {
        return new JAXBElement<EditRoomAmount4PartnersIntResponse>(_EditRoomAmount4PartnersIntResponse_QNAME, EditRoomAmount4PartnersIntResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditRoomStatus4PartnersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response.Product4Partners", name = "EditRoomStatus4PartnersResponse")
    public JAXBElement<EditRoomStatus4PartnersResponse> createEditRoomStatus4PartnersResponse(EditRoomStatus4PartnersResponse value) {
        return new JAXBElement<EditRoomStatus4PartnersResponse>(_EditRoomStatus4PartnersResponse_QNAME, EditRoomStatus4PartnersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditRoomStatus4PartnersIntResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response.Product4Partners", name = "EditRoomStatus4PartnersIntResponse")
    public JAXBElement<EditRoomStatus4PartnersIntResponse> createEditRoomStatus4PartnersIntResponse(EditRoomStatus4PartnersIntResponse value) {
        return new JAXBElement<EditRoomStatus4PartnersIntResponse>(_EditRoomStatus4PartnersIntResponse_QNAME, EditRoomStatus4PartnersIntResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BatchEditInvAmountAndStatusForEBookingResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response.Product4Partners", name = "BatchEditInvAmountAndStatusForEBookingResponse")
    public JAXBElement<BatchEditInvAmountAndStatusForEBookingResponse> createBatchEditInvAmountAndStatusForEBookingResponse(BatchEditInvAmountAndStatusForEBookingResponse value) {
        return new JAXBElement<BatchEditInvAmountAndStatusForEBookingResponse>(_BatchEditInvAmountAndStatusForEBookingResponse_QNAME, BatchEditInvAmountAndStatusForEBookingResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvAmountAndStatusResult4OneInvType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response.Product4Partners", name = "InvAmountAndStatusResult4OneInvType")
    public JAXBElement<InvAmountAndStatusResult4OneInvType> createInvAmountAndStatusResult4OneInvType(InvAmountAndStatusResult4OneInvType value) {
        return new JAXBElement<InvAmountAndStatusResult4OneInvType>(_InvAmountAndStatusResult4OneInvType_QNAME, InvAmountAndStatusResult4OneInvType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvAmountAndStatusResultElement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response.Product4Partners", name = "InvAmountAndStatusResultElement")
    public JAXBElement<InvAmountAndStatusResultElement> createInvAmountAndStatusResultElement(InvAmountAndStatusResultElement value) {
        return new JAXBElement<InvAmountAndStatusResultElement>(_InvAmountAndStatusResultElement_QNAME, InvAmountAndStatusResultElement.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OperateBedTypeResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response.Product4Partners", name = "OperateBedTypeResult")
    public JAXBElement<OperateBedTypeResult> createOperateBedTypeResult(OperateBedTypeResult value) {
        return new JAXBElement<OperateBedTypeResult>(_OperateBedTypeResult_QNAME, OperateBedTypeResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditInventoryEndDate4PartnersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response.Product4Partners", name = "EditInventoryEndDate4PartnersResponse")
    public JAXBElement<EditInventoryEndDate4PartnersResponse> createEditInventoryEndDate4PartnersResponse(EditInventoryEndDate4PartnersResponse value) {
        return new JAXBElement<EditInventoryEndDate4PartnersResponse>(_EditInventoryEndDate4PartnersResponse_QNAME, EditInventoryEndDate4PartnersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetHotelInventoryDetail4PartnersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response.Product4Partners", name = "GetHotelInventoryDetail4PartnersResponse")
    public JAXBElement<GetHotelInventoryDetail4PartnersResponse> createGetHotelInventoryDetail4PartnersResponse(GetHotelInventoryDetail4PartnersResponse value) {
        return new JAXBElement<GetHotelInventoryDetail4PartnersResponse>(_GetHotelInventoryDetail4PartnersResponse_QNAME, GetHotelInventoryDetail4PartnersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetHotelInventoryDetail4PartnersIntResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response.Product4Partners", name = "GetHotelInventoryDetail4PartnersIntResponse")
    public JAXBElement<GetHotelInventoryDetail4PartnersIntResponse> createGetHotelInventoryDetail4PartnersIntResponse(GetHotelInventoryDetail4PartnersIntResponse value) {
        return new JAXBElement<GetHotelInventoryDetail4PartnersIntResponse>(_GetHotelInventoryDetail4PartnersIntResponse_QNAME, GetHotelInventoryDetail4PartnersIntResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEbookingRoomNumHisHotel3Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response.Product4Partners", name = "GetEbookingRoomNumHisHotel3Response")
    public JAXBElement<GetEbookingRoomNumHisHotel3Response> createGetEbookingRoomNumHisHotel3Response(GetEbookingRoomNumHisHotel3Response value) {
        return new JAXBElement<GetEbookingRoomNumHisHotel3Response>(_GetEbookingRoomNumHisHotel3Response_QNAME, GetEbookingRoomNumHisHotel3Response.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfInventoryDayDetailInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model.Product4Partners", name = "ArrayOfInventoryDayDetailInfo")
    public JAXBElement<ArrayOfInventoryDayDetailInfo> createArrayOfInventoryDayDetailInfo(ArrayOfInventoryDayDetailInfo value) {
        return new JAXBElement<ArrayOfInventoryDayDetailInfo>(_ArrayOfInventoryDayDetailInfo_QNAME, ArrayOfInventoryDayDetailInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InventoryDayDetailInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model.Product4Partners", name = "InventoryDayDetailInfo")
    public JAXBElement<InventoryDayDetailInfo> createInventoryDayDetailInfo(InventoryDayDetailInfo value) {
        return new JAXBElement<InventoryDayDetailInfo>(_InventoryDayDetailInfo_QNAME, InventoryDayDetailInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfResourceInventoryDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model.Product4Partners", name = "ArrayOfResourceInventoryDetail")
    public JAXBElement<ArrayOfResourceInventoryDetail> createArrayOfResourceInventoryDetail(ArrayOfResourceInventoryDetail value) {
        return new JAXBElement<ArrayOfResourceInventoryDetail>(_ArrayOfResourceInventoryDetail_QNAME, ArrayOfResourceInventoryDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResourceInventoryDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model.Product4Partners", name = "ResourceInventoryDetail")
    public JAXBElement<ResourceInventoryDetail> createResourceInventoryDetail(ResourceInventoryDetail value) {
        return new JAXBElement<ResourceInventoryDetail>(_ResourceInventoryDetail_QNAME, ResourceInventoryDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfHotelResourceInventoryStateInfoProc }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model.HotelProduct", name = "ArrayOfHotelResourceInventoryStateInfoProc")
    public JAXBElement<ArrayOfHotelResourceInventoryStateInfoProc> createArrayOfHotelResourceInventoryStateInfoProc(ArrayOfHotelResourceInventoryStateInfoProc value) {
        return new JAXBElement<ArrayOfHotelResourceInventoryStateInfoProc>(_ArrayOfHotelResourceInventoryStateInfoProc_QNAME, ArrayOfHotelResourceInventoryStateInfoProc.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HotelResourceInventoryStateInfoProc }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model.HotelProduct", name = "HotelResourceInventoryStateInfoProc")
    public JAXBElement<HotelResourceInventoryStateInfoProc> createHotelResourceInventoryStateInfoProc(HotelResourceInventoryStateInfoProc value) {
        return new JAXBElement<HotelResourceInventoryStateInfoProc>(_HotelResourceInventoryStateInfoProc_QNAME, HotelResourceInventoryStateInfoProc.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSupplierInfoBySettlementTypeRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities", name = "GetSupplierInfoBySettlementTypeRequest")
    public JAXBElement<GetSupplierInfoBySettlementTypeRequest> createGetSupplierInfoBySettlementTypeRequest(GetSupplierInfoBySettlementTypeRequest value) {
        return new JAXBElement<GetSupplierInfoBySettlementTypeRequest>(_GetSupplierInfoBySettlementTypeRequest_QNAME, GetSupplierInfoBySettlementTypeRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSupplierInfoBySettlementTypeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities", name = "GetSupplierInfoBySettlementTypeResponse")
    public JAXBElement<GetSupplierInfoBySettlementTypeResponse> createGetSupplierInfoBySettlementTypeResponse(GetSupplierInfoBySettlementTypeResponse value) {
        return new JAXBElement<GetSupplierInfoBySettlementTypeResponse>(_GetSupplierInfoBySettlementTypeResponse_QNAME, GetSupplierInfoBySettlementTypeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSupplierInfo4Commision }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities", name = "ArrayOfSupplierInfo4Commision")
    public JAXBElement<ArrayOfSupplierInfo4Commision> createArrayOfSupplierInfo4Commision(ArrayOfSupplierInfo4Commision value) {
        return new JAXBElement<ArrayOfSupplierInfo4Commision>(_ArrayOfSupplierInfo4Commision_QNAME, ArrayOfSupplierInfo4Commision.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SupplierInfo4Commision }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities", name = "SupplierInfo4Commision")
    public JAXBElement<SupplierInfo4Commision> createSupplierInfo4Commision(SupplierInfo4Commision value) {
        return new JAXBElement<SupplierInfo4Commision>(_SupplierInfo4Commision_QNAME, SupplierInfo4Commision.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IsUseDcInvRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Request.Product4Partners", name = "IsUseDcInvRequest")
    public JAXBElement<IsUseDcInvRequest> createIsUseDcInvRequest(IsUseDcInvRequest value) {
        return new JAXBElement<IsUseDcInvRequest>(_IsUseDcInvRequest_QNAME, IsUseDcInvRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditInvStatus4DCRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Request.Product4Partners", name = "EditInvStatus4DCRequest")
    public JAXBElement<EditInvStatus4DCRequest> createEditInvStatus4DCRequest(EditInvStatus4DCRequest value) {
        return new JAXBElement<EditInvStatus4DCRequest>(_EditInvStatus4DCRequest_QNAME, EditInvStatus4DCRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IsDCRoomBackupRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Request.Product4Partners", name = "IsDCRoomBackupRequest")
    public JAXBElement<IsDCRoomBackupRequest> createIsDCRoomBackupRequest(IsDCRoomBackupRequest value) {
        return new JAXBElement<IsDCRoomBackupRequest>(_IsDCRoomBackupRequest_QNAME, IsDCRoomBackupRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditRoomAmount4PartnersRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Request.Product4Partners", name = "EditRoomAmount4PartnersRequest")
    public JAXBElement<EditRoomAmount4PartnersRequest> createEditRoomAmount4PartnersRequest(EditRoomAmount4PartnersRequest value) {
        return new JAXBElement<EditRoomAmount4PartnersRequest>(_EditRoomAmount4PartnersRequest_QNAME, EditRoomAmount4PartnersRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditRoomStatus4PartnersRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Request.Product4Partners", name = "EditRoomStatus4PartnersRequest")
    public JAXBElement<EditRoomStatus4PartnersRequest> createEditRoomStatus4PartnersRequest(EditRoomStatus4PartnersRequest value) {
        return new JAXBElement<EditRoomStatus4PartnersRequest>(_EditRoomStatus4PartnersRequest_QNAME, EditRoomStatus4PartnersRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditRoomStatus4EBRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Request.Product4Partners", name = "EditRoomStatus4EBRequest")
    public JAXBElement<EditRoomStatus4EBRequest> createEditRoomStatus4EBRequest(EditRoomStatus4EBRequest value) {
        return new JAXBElement<EditRoomStatus4EBRequest>(_EditRoomStatus4EBRequest_QNAME, EditRoomStatus4EBRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditInventoryEndDate4PartnersRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Request.Product4Partners", name = "EditInventoryEndDate4PartnersRequest")
    public JAXBElement<EditInventoryEndDate4PartnersRequest> createEditInventoryEndDate4PartnersRequest(EditInventoryEndDate4PartnersRequest value) {
        return new JAXBElement<EditInventoryEndDate4PartnersRequest>(_EditInventoryEndDate4PartnersRequest_QNAME, EditInventoryEndDate4PartnersRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetHotelInventoryDetail4PartnersRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Request.Product4Partners", name = "GetHotelInventoryDetail4PartnersRequest")
    public JAXBElement<GetHotelInventoryDetail4PartnersRequest> createGetHotelInventoryDetail4PartnersRequest(GetHotelInventoryDetail4PartnersRequest value) {
        return new JAXBElement<GetHotelInventoryDetail4PartnersRequest>(_GetHotelInventoryDetail4PartnersRequest_QNAME, GetHotelInventoryDetail4PartnersRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetHotelInventoryDetail4PartnersIntRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Request.Product4Partners", name = "GetHotelInventoryDetail4PartnersIntRequest")
    public JAXBElement<GetHotelInventoryDetail4PartnersIntRequest> createGetHotelInventoryDetail4PartnersIntRequest(GetHotelInventoryDetail4PartnersIntRequest value) {
        return new JAXBElement<GetHotelInventoryDetail4PartnersIntRequest>(_GetHotelInventoryDetail4PartnersIntRequest_QNAME, GetHotelInventoryDetail4PartnersIntRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEbookingRoomNumHisHotel3Request }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Request.Product4Partners", name = "GetEbookingRoomNumHisHotel3Request")
    public JAXBElement<GetEbookingRoomNumHisHotel3Request> createGetEbookingRoomNumHisHotel3Request(GetEbookingRoomNumHisHotel3Request value) {
        return new JAXBElement<GetEbookingRoomNumHisHotel3Request>(_GetEbookingRoomNumHisHotel3Request_QNAME, GetEbookingRoomNumHisHotel3Request.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HotelResourceInventoryStateInfoProcResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response.HotelProduct", name = "HotelResourceInventoryStateInfoProcResponse")
    public JAXBElement<HotelResourceInventoryStateInfoProcResponse> createHotelResourceInventoryStateInfoProcResponse(HotelResourceInventoryStateInfoProcResponse value) {
        return new JAXBElement<HotelResourceInventoryStateInfoProcResponse>(_HotelResourceInventoryStateInfoProcResponse_QNAME, HotelResourceInventoryStateInfoProcResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InventoryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Enums.Inventory", name = "InventoryType")
    public JAXBElement<InventoryType> createInventoryType(InventoryType value) {
        return new JAXBElement<InventoryType>(_InventoryType_QNAME, InventoryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnumCloseRoomType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Enums.Inventory", name = "EnumCloseRoomType")
    public JAXBElement<EnumCloseRoomType> createEnumCloseRoomType(EnumCloseRoomType value) {
        return new JAXBElement<EnumCloseRoomType>(_EnumCloseRoomType_QNAME, EnumCloseRoomType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InventoryStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Enums.Inventory", name = "InventoryStatus")
    public JAXBElement<InventoryStatus> createInventoryStatus(InventoryStatus value) {
        return new JAXBElement<InventoryStatus>(_InventoryStatus_QNAME, InventoryStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfInventoryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Enums.Inventory", name = "ArrayOfInventoryType")
    public JAXBElement<ArrayOfInventoryType> createArrayOfInventoryType(ArrayOfInventoryType value) {
        return new JAXBElement<ArrayOfInventoryType>(_ArrayOfInventoryType_QNAME, ArrayOfInventoryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HotelResourceInventoryStateInfoProcRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Request.HotelProduct", name = "HotelResourceInventoryStateInfoProcRequest")
    public JAXBElement<HotelResourceInventoryStateInfoProcRequest> createHotelResourceInventoryStateInfoProcRequest(HotelResourceInventoryStateInfoProcRequest value) {
        return new JAXBElement<HotelResourceInventoryStateInfoProcRequest>(_HotelResourceInventoryStateInfoProcRequest_QNAME, HotelResourceInventoryStateInfoProcRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveBedInfoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response", name = "SaveBedInfoResponse")
    public JAXBElement<SaveBedInfoResponse> createSaveBedInfoResponse(SaveBedInfoResponse value) {
        return new JAXBElement<SaveBedInfoResponse>(_SaveBedInfoResponse_QNAME, SaveBedInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSupplierSwitchStatusResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response", name = "GetSupplierSwitchStatusResponse")
    public JAXBElement<GetSupplierSwitchStatusResponse> createGetSupplierSwitchStatusResponse(GetSupplierSwitchStatusResponse value) {
        return new JAXBElement<GetSupplierSwitchStatusResponse>(_GetSupplierSwitchStatusResponse_QNAME, GetSupplierSwitchStatusResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetHotelSwitchStatusResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response", name = "GetHotelSwitchStatusResponse")
    public JAXBElement<GetHotelSwitchStatusResponse> createGetHotelSwitchStatusResponse(GetHotelSwitchStatusResponse value) {
        return new JAXBElement<GetHotelSwitchStatusResponse>(_GetHotelSwitchStatusResponse_QNAME, GetHotelSwitchStatusResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddMHotelInfoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response", name = "AddMHotelInfoResponse")
    public JAXBElement<AddMHotelInfoResponse> createAddMHotelInfoResponse(AddMHotelInfoResponse value) {
        return new JAXBElement<AddMHotelInfoResponse>(_AddMHotelInfoResponse_QNAME, AddMHotelInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateShotelForPartnerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response", name = "CreateShotelForPartnerResponse")
    public JAXBElement<CreateShotelForPartnerResponse> createCreateShotelForPartnerResponse(CreateShotelForPartnerResponse value) {
        return new JAXBElement<CreateShotelForPartnerResponse>(_CreateShotelForPartnerResponse_QNAME, CreateShotelForPartnerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckMHotelNameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response", name = "CheckMHotelNameResponse")
    public JAXBElement<CheckMHotelNameResponse> createCheckMHotelNameResponse(CheckMHotelNameResponse value) {
        return new JAXBElement<CheckMHotelNameResponse>(_CheckMHotelNameResponse_QNAME, CheckMHotelNameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSupplierInfoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response", name = "GetSupplierInfoResponse")
    public JAXBElement<GetSupplierInfoResponse> createGetSupplierInfoResponse(GetSupplierInfoResponse value) {
        return new JAXBElement<GetSupplierInfoResponse>(_GetSupplierInfoResponse_QNAME, GetSupplierInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveRoomOverSaleInventory4PartnerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response", name = "SaveRoomOverSaleInventory4PartnerResponse")
    public JAXBElement<SaveRoomOverSaleInventory4PartnerResponse> createSaveRoomOverSaleInventory4PartnerResponse(SaveRoomOverSaleInventory4PartnerResponse value) {
        return new JAXBElement<SaveRoomOverSaleInventory4PartnerResponse>(_SaveRoomOverSaleInventory4PartnerResponse_QNAME, SaveRoomOverSaleInventory4PartnerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BatchReplaceInventory4PartnerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response", name = "BatchReplaceInventory4PartnerResponse")
    public JAXBElement<BatchReplaceInventory4PartnerResponse> createBatchReplaceInventory4PartnerResponse(BatchReplaceInventory4PartnerResponse value) {
        return new JAXBElement<BatchReplaceInventory4PartnerResponse>(_BatchReplaceInventory4PartnerResponse_QNAME, BatchReplaceInventory4PartnerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRoomTypeByShotelIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response", name = "GetRoomTypeByShotelIdResponse")
    public JAXBElement<GetRoomTypeByShotelIdResponse> createGetRoomTypeByShotelIdResponse(GetRoomTypeByShotelIdResponse value) {
        return new JAXBElement<GetRoomTypeByShotelIdResponse>(_GetRoomTypeByShotelIdResponse_QNAME, GetRoomTypeByShotelIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfstringBedInfoForDaywSkfccAu }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/Arrays", name = "ArrayOfKeyValueOfstringBedInfoForDayw_SkfccAu")
    public JAXBElement<ArrayOfKeyValueOfstringBedInfoForDaywSkfccAu> createArrayOfKeyValueOfstringBedInfoForDaywSkfccAu(ArrayOfKeyValueOfstringBedInfoForDaywSkfccAu value) {
        return new JAXBElement<ArrayOfKeyValueOfstringBedInfoForDaywSkfccAu>(_ArrayOfKeyValueOfstringBedInfoForDaywSkfccAu_QNAME, ArrayOfKeyValueOfstringBedInfoForDaywSkfccAu.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/Arrays", name = "ArrayOfint")
    public JAXBElement<ArrayOfint> createArrayOfint(ArrayOfint value) {
        return new JAXBElement<ArrayOfint>(_ArrayOfint_QNAME, ArrayOfint.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfdateTimedateTime }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/Arrays", name = "ArrayOfKeyValueOfdateTimedateTime")
    public JAXBElement<ArrayOfKeyValueOfdateTimedateTime> createArrayOfKeyValueOfdateTimedateTime(ArrayOfKeyValueOfdateTimedateTime value) {
        return new JAXBElement<ArrayOfKeyValueOfdateTimedateTime>(_ArrayOfKeyValueOfdateTimedateTime_QNAME, ArrayOfKeyValueOfdateTimedateTime.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfintArrayOfDateIntervalInventoryInfoyrFq0QSa }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/Arrays", name = "ArrayOfKeyValueOfintArrayOfDateIntervalInventoryInfoyrFq0q_Sa")
    public JAXBElement<ArrayOfKeyValueOfintArrayOfDateIntervalInventoryInfoyrFq0QSa> createArrayOfKeyValueOfintArrayOfDateIntervalInventoryInfoyrFq0QSa(ArrayOfKeyValueOfintArrayOfDateIntervalInventoryInfoyrFq0QSa value) {
        return new JAXBElement<ArrayOfKeyValueOfintArrayOfDateIntervalInventoryInfoyrFq0QSa>(_ArrayOfKeyValueOfintArrayOfDateIntervalInventoryInfoyrFq0QSa_QNAME, ArrayOfKeyValueOfintArrayOfDateIntervalInventoryInfoyrFq0QSa.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfintInvAmountAndStatusResult4OneInvType8X1Z9B1I }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/Arrays", name = "ArrayOfKeyValueOfintInvAmountAndStatusResult4OneInvType8x1z9B1i")
    public JAXBElement<ArrayOfKeyValueOfintInvAmountAndStatusResult4OneInvType8X1Z9B1I> createArrayOfKeyValueOfintInvAmountAndStatusResult4OneInvType8X1Z9B1I(ArrayOfKeyValueOfintInvAmountAndStatusResult4OneInvType8X1Z9B1I value) {
        return new JAXBElement<ArrayOfKeyValueOfintInvAmountAndStatusResult4OneInvType8X1Z9B1I>(_ArrayOfKeyValueOfintInvAmountAndStatusResult4OneInvType8X1Z9B1I_QNAME, ArrayOfKeyValueOfintInvAmountAndStatusResult4OneInvType8X1Z9B1I.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfintInvAmountAndStatusResultElement8X1Z9B1I }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/Arrays", name = "ArrayOfKeyValueOfintInvAmountAndStatusResultElement8x1z9B1i")
    public JAXBElement<ArrayOfKeyValueOfintInvAmountAndStatusResultElement8X1Z9B1I> createArrayOfKeyValueOfintInvAmountAndStatusResultElement8X1Z9B1I(ArrayOfKeyValueOfintInvAmountAndStatusResultElement8X1Z9B1I value) {
        return new JAXBElement<ArrayOfKeyValueOfintInvAmountAndStatusResultElement8X1Z9B1I>(_ArrayOfKeyValueOfintInvAmountAndStatusResultElement8X1Z9B1I_QNAME, ArrayOfKeyValueOfintInvAmountAndStatusResultElement8X1Z9B1I.class, null, value);
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

}
