
package com.elong.nb.agent.NorthBoundForAPIService;

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
 * generated in the com.elong.nb.agent.NorthBoundForAPIService package. 
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

    private final static QName _ArrayOfRatePlanBaseInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.Domain.Hotel.Entity", "ArrayOfRatePlanBaseInfo");
    private final static QName _RatePlanBaseInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.Domain.Hotel.Entity", "RatePlanBaseInfo");
    private final static QName _ArrayOfMarketingPromotion_QNAME = new QName("http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.Domain.Hotel.Entity", "ArrayOfMarketingPromotion");
    private final static QName _MarketingPromotion_QNAME = new QName("http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.Domain.Hotel.Entity", "MarketingPromotion");
    private final static QName _ArrayOfBookingChannel_QNAME = new QName("http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.Domain.Hotel.Entity", "ArrayOfBookingChannel");
    private final static QName _BookingChannel_QNAME = new QName("http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.Domain.Hotel.Entity", "BookingChannel");
    private final static QName _RatePlanChannel_QNAME = new QName("http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.Domain.Hotel.Entity", "RatePlanChannel");
    private final static QName _ArrayOfSellChannel_QNAME = new QName("http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.Domain.Hotel.Entity", "ArrayOfSellChannel");
    private final static QName _SellChannel_QNAME = new QName("http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.Domain.Hotel.Entity", "SellChannel");
    private final static QName _CheckHotelProductStatusRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.Domain.Hotel.Message.ProductUse", "CheckHotelProductStatusRequest");
    private final static QName _CheckHotelProductStatusResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.Domain.Hotel.Message.ProductUse", "CheckHotelProductStatusResponse");
    private final static QName _ArrayOfHotelBookingRule_QNAME = new QName("http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.Domain.Hotel.HotelProductUseBusiness", "ArrayOfHotelBookingRule");
    private final static QName _HotelBookingRule_QNAME = new QName("http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.Domain.Hotel.HotelProductUseBusiness", "HotelBookingRule");
    private final static QName _ArrayOfAddValueDayInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.Domain.Hotel.HotelProductUseBusiness", "ArrayOfAddValueDayInfo");
    private final static QName _AddValueDayInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.Domain.Hotel.HotelProductUseBusiness", "AddValueDayInfo");
    private final static QName _ArrayOfAddValuePolicyInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.Domain.Hotel.HotelProductUseBusiness", "ArrayOfAddValuePolicyInfo");
    private final static QName _AddValuePolicyInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.Domain.Hotel.HotelProductUseBusiness", "AddValuePolicyInfo");
    private final static QName _ArrayOfDRRInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.Domain.Hotel.HotelProductUseBusiness", "ArrayOfDRRInfo");
    private final static QName _DRRInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.Domain.Hotel.HotelProductUseBusiness", "DRRInfo");
    private final static QName _ArrayOfPrePayInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.Domain.Hotel.HotelProductUseBusiness", "ArrayOfPrePayInfo");
    private final static QName _PrePayInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.Domain.Hotel.HotelProductUseBusiness", "PrePayInfo");
    private final static QName _ArrayOfVouchInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.Domain.Hotel.HotelProductUseBusiness", "ArrayOfVouchInfo");
    private final static QName _VouchInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.Domain.Hotel.HotelProductUseBusiness", "VouchInfo");
    private final static QName _ArrayOfMSRelation_QNAME = new QName("http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.Domain.Hotel.HotelProductUseBusiness", "ArrayOfM_SRelation");
    private final static QName _MSRelation_QNAME = new QName("http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.Domain.Hotel.HotelProductUseBusiness", "M_SRelation");
    private final static QName _ArrayOfstring_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOfstring");
    private final static QName _ArrayOfchar_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOfchar");
    private final static QName _ArrayOfint_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOfint");
    private final static QName _OperateTimeInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.DataAccess.Hotel", "OperateTimeInfo");
    private final static QName _ArrayOfRackRateChangeRecord_QNAME = new QName("http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.DataAccess.Hotel", "ArrayOfRackRateChangeRecord");
    private final static QName _RackRateChangeRecord_QNAME = new QName("http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.DataAccess.Hotel", "RackRateChangeRecord");
    private final static QName _RecordBase_QNAME = new QName("http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.DataAccess.Hotel", "RecordBase");
    private final static QName _HotelNorthBoundAPIUsers_QNAME = new QName("http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.DataAccess.Hotel", "HotelNorthBoundAPIUsers");
    private final static QName _ArrayOfHotelNorthBoundAPIUsers_QNAME = new QName("http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.DataAccess.Hotel", "ArrayOfHotelNorthBoundAPIUsers");
    private final static QName _BookingRuleBase_QNAME = new QName("http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.DataAccess.Hotel", "BookingRuleBase");
    private final static QName _RatePlanForRoomtype_QNAME = new QName("http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.DataAccess.Hotel", "RatePlanForRoomtype");
    private final static QName _ArrayOfAddValueInfoSimple_QNAME = new QName("http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.DataAccess.Hotel", "ArrayOfAddValueInfoSimple");
    private final static QName _AddValueInfoSimple_QNAME = new QName("http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.DataAccess.Hotel", "AddValueInfoSimple");
    private final static QName _HotelNorthBoundOrders_QNAME = new QName("http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.DataAccess.Hotel", "HotelNorthBoundOrders");
    private final static QName _ArrayOfGeoInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.DataAccess.Hotel", "ArrayOfGeo_Info");
    private final static QName _GeoInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.DataAccess.Hotel", "Geo_Info");
    private final static QName _ArrayOfGeoDetailInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.DataAccess.Hotel", "ArrayOfGeoDetail_Info");
    private final static QName _GeoDetailInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.DataAccess.Hotel", "GeoDetail_Info");
    private final static QName _ArrayOfResourceInventoryStateChangeRecord_QNAME = new QName("http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.DataAccess.Hotel", "ArrayOfResourceInventoryStateChangeRecord");
    private final static QName _ResourceInventoryStateChangeRecord_QNAME = new QName("http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.DataAccess.Hotel", "ResourceInventoryStateChangeRecord");
    private final static QName _ArrayOfPriceInfoChangeRecord_QNAME = new QName("http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.DataAccess.Hotel", "ArrayOfPriceInfoChangeRecord");
    private final static QName _PriceInfoChangeRecord_QNAME = new QName("http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.DataAccess.Hotel", "PriceInfoChangeRecord");
    private final static QName _ArrayOfReservationChangeRecord_QNAME = new QName("http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.DataAccess.Hotel", "ArrayOfReservationChangeRecord");
    private final static QName _ReservationChangeRecord_QNAME = new QName("http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.DataAccess.Hotel", "ReservationChangeRecord");
    private final static QName _ReservationExtendInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.DataAccess.Hotel", "ReservationExtendInfo");
    private final static QName _BStaticInfoSearchRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.DataAccess.Hotel.HotelProductUse", "BStaticInfoSearchRequest");
    private final static QName _HotelRatePlanSearchFor114_QNAME = new QName("http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.DataAccess.Hotel.HotelProductUse", "HotelRatePlanSearchFor114");
    private final static QName _HotelRatePlanCondition_QNAME = new QName("http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.DataAccess.Hotel.HotelProductUse", "HotelRatePlanCondition");
    private final static QName _Request_QNAME = new QName("http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.Domain.Hotel", "Request");
    private final static QName _ClientSystemInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.Domain.Hotel", "ClientSystemInfo");
    private final static QName _Response_QNAME = new QName("http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.Domain.Hotel", "Response");
    private final static QName _ArrayOfRoomTypeInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.Domain.Hotel", "ArrayOfRoomTypeInfo");
    private final static QName _RoomTypeInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.Domain.Hotel", "RoomTypeInfo");
    private final static QName _RoomNumbers_QNAME = new QName("http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.Domain.Hotel", "RoomNumbers");
    private final static QName _ArrayOfRoomNumDay_QNAME = new QName("http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.Domain.Hotel", "ArrayOfRoomNumDay");
    private final static QName _RoomNumDay_QNAME = new QName("http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.Domain.Hotel", "RoomNumDay");
    private final static QName _RoomRate_QNAME = new QName("http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.Domain.Hotel", "RoomRate");
    private final static QName _HotelPrice_QNAME = new QName("http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.Domain.Hotel", "HotelPrice");
    private final static QName _ArrayOfPriceDay_QNAME = new QName("http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.Domain.Hotel", "ArrayOfPriceDay");
    private final static QName _PriceDay_QNAME = new QName("http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.Domain.Hotel", "PriceDay");
    private final static QName _ArrayOfRatePlanPaymentRule_QNAME = new QName("http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.Domain.Hotel", "ArrayOfRatePlanPaymentRule");
    private final static QName _RatePlanPaymentRule_QNAME = new QName("http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.Domain.Hotel", "RatePlanPaymentRule");
    private final static QName _ArrayOfHotelDetail_QNAME = new QName("http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.Domain.Hotel", "ArrayOfHotelDetail");
    private final static QName _HotelDetail_QNAME = new QName("http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.Domain.Hotel", "HotelDetail");
    private final static QName _HotelInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.Domain.Hotel", "HotelInfo");
    private final static QName _ArrayOfHotelActivity_QNAME = new QName("http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.Domain.Hotel", "ArrayOfHotelActivity");
    private final static QName _HotelActivity_QNAME = new QName("http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.Domain.Hotel", "HotelActivity");
    private final static QName _ArrayOfHotelInfoForIndex_QNAME = new QName("http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.DataAccess.Hotel.Northbound", "ArrayOfHotelInfoForIndex");
    private final static QName _HotelInfoForIndex_QNAME = new QName("http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.DataAccess.Hotel.Northbound", "HotelInfoForIndex");
    private final static QName _ArrayOfDictionaryEntry_QNAME = new QName("http://schemas.datacontract.org/2004/07/System.Collections", "ArrayOfDictionaryEntry");
    private final static QName _DictionaryEntry_QNAME = new QName("http://schemas.datacontract.org/2004/07/System.Collections", "DictionaryEntry");
    private final static QName _EnumResponseCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/Com.Elong.Utility.Hotel.Enum", "EnumResponseCode");
    private final static QName _ERoomAdditionsType_QNAME = new QName("http://schemas.datacontract.org/2004/07/Com.Elong.Utility.Hotel.Enum", "ERoomAdditionsType");
    private final static QName _EnumDateType_QNAME = new QName("http://schemas.datacontract.org/2004/07/Com.Elong.Utility.Hotel.Enum", "EnumDateType");
    private final static QName _EnumBookRuleForHotel_QNAME = new QName("http://schemas.datacontract.org/2004/07/Com.Elong.Utility.Hotel.Enum", "EnumBookRuleForHotel");
    private final static QName _EnumRoomNumStatus_QNAME = new QName("http://schemas.datacontract.org/2004/07/Com.Elong.Utility.Hotel.Enum", "EnumRoomNumStatus");
    private final static QName _EActionType_QNAME = new QName("http://schemas.datacontract.org/2004/07/Com.Elong.Utility.Hotel.Enum", "EActionType");
    private final static QName _EHotelCostType_QNAME = new QName("http://schemas.datacontract.org/2004/07/Com.Elong.Utility.Hotel.Enum", "EHotelCostType");
    private final static QName _EExclusive_QNAME = new QName("http://schemas.datacontract.org/2004/07/Com.Elong.Utility.Hotel.Enum", "EExclusive");
    private final static QName _EPromotionType_QNAME = new QName("http://schemas.datacontract.org/2004/07/Com.Elong.Utility.Hotel.Enum", "EPromotionType");
    private final static QName _EnumDRRRule_QNAME = new QName("http://schemas.datacontract.org/2004/07/Com.Elong.Utility.Hotel.Enum", "EnumDRRRule");
    private final static QName _EnumFeeType_QNAME = new QName("http://schemas.datacontract.org/2004/07/Com.Elong.Utility.Hotel.Enum", "EnumFeeType");
    private final static QName _EnumMeasureUnit_QNAME = new QName("http://schemas.datacontract.org/2004/07/Com.Elong.Utility.Hotel.Enum", "EnumMeasureUnit");
    private final static QName _EnumCutType_QNAME = new QName("http://schemas.datacontract.org/2004/07/Com.Elong.Utility.Hotel.Enum", "EnumCutType");
    private final static QName _EnumPrepayRule_QNAME = new QName("http://schemas.datacontract.org/2004/07/Com.Elong.Utility.Hotel.Enum", "EnumPrepayRule");
    private final static QName _EnumRuleTarget_QNAME = new QName("http://schemas.datacontract.org/2004/07/Com.Elong.Utility.Hotel.Enum", "EnumRuleTarget");
    private final static QName _EnumPriceStatus_QNAME = new QName("http://schemas.datacontract.org/2004/07/Com.Elong.Utility.Hotel.Enum", "EnumPriceStatus");
    private final static QName _EnumVouchWay_QNAME = new QName("http://schemas.datacontract.org/2004/07/Com.Elong.Utility.Hotel.Enum", "EnumVouchWay");
    private final static QName _EnumVouchRule_QNAME = new QName("http://schemas.datacontract.org/2004/07/Com.Elong.Utility.Hotel.Enum", "EnumVouchRule");
    private final static QName _EnumVouchMoneyType_QNAME = new QName("http://schemas.datacontract.org/2004/07/Com.Elong.Utility.Hotel.Enum", "EnumVouchMoneyType");
    private final static QName _EnumPayMentType_QNAME = new QName("http://schemas.datacontract.org/2004/07/Com.Elong.Utility.Hotel.Enum", "EnumPayMentType");
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
    private final static QName _RoomTypeInfoBase_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Contract", "RoomTypeInfoBase");
    private final static QName _ArrayOfRoomAdditionDefine_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Contract", "ArrayOfRoomAdditionDefine");
    private final static QName _RoomAdditionDefine_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Contract", "RoomAdditionDefine");
    private final static QName _HotelContent_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Contract", "HotelContent");
    private final static QName _HotelAirportPickUpService_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Contract", "HotelAirportPickUpService");
    private final static QName _HotelConferenceAmenities_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Contract", "HotelConferenceAmenities");
    private final static QName _ArrayOfHotelAmenity_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Contract", "ArrayOfHotelAmenity");
    private final static QName _HotelAmenity_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Contract", "HotelAmenity");
    private final static QName _ArrayOfHotelCreditCategory_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Contract", "ArrayOfHotelCreditCategory");
    private final static QName _HotelCreditCategory_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Contract", "HotelCreditCategory");
    private final static QName _HotelDiningAmenities_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Contract", "HotelDiningAmenities");
    private final static QName _HotelfeatureInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Contract", "HotelfeatureInfo");
    private final static QName _HotelGeneralAmenities_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Contract", "HotelGeneralAmenities");
    private final static QName _ArrayOfHotelLandMark_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Contract", "ArrayOfHotelLandMark");
    private final static QName _HotelLandMark_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Contract", "HotelLandMark");
    private final static QName _HotelRecreationAmenities_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Contract", "HotelRecreationAmenities");
    private final static QName _HotelRoomAmenities_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Contract", "HotelRoomAmenities");
    private final static QName _ArrayOfHotelSurroundingAttractions_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Contract", "ArrayOfHotelSurroundingAttractions");
    private final static QName _HotelSurroundingAttractions_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Contract", "HotelSurroundingAttractions");
    private final static QName _ArrayOfHotelTrafficAndAroundInformation_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Contract", "ArrayOfHotelTrafficAndAroundInformation");
    private final static QName _HotelTrafficAndAroundInformation_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Contract", "HotelTrafficAndAroundInformation");
    private final static QName _ArrayOfHotelAroundInformaiton_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Contract", "ArrayOfHotelAroundInformaiton");
    private final static QName _HotelAroundInformaiton_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Contract", "HotelAroundInformaiton");
    private final static QName _HotelTrafficAndAroundInformations_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Contract", "HotelTrafficAndAroundInformations");
    private final static QName _ArrayOfHotelProductRelation_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Contract", "ArrayOfHotelProductRelation");
    private final static QName _HotelProductRelation_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Contract", "HotelProductRelation");
    private final static QName _ArrayOfHotelTag_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Contract", "ArrayOfHotelTag");
    private final static QName _HotelTag_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Contract", "HotelTag");
    private final static QName _ArrayOfHotelImage_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Contract", "ArrayOfHotelImage");
    private final static QName _HotelImage_QNAME = new QName("http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Contract", "HotelImage");
    private final static QName _RackRateChangeDataRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.Domain.Hotel.Message", "RackRateChangeDataRequest");
    private final static QName _RackRateChangeDataResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.Domain.Hotel.Message", "RackRateChangeDataResponse");
    private final static QName _GetMSRelationRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.Domain.Hotel.Message", "GetMSRelationRequest");
    private final static QName _GetMSRelationResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.Domain.Hotel.Message", "GetMSRelationResponse");
    private final static QName _InventoryChangeDataRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.Domain.Hotel.Message", "InventoryChangeDataRequest");
    private final static QName _InventoryChangeDataResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.Domain.Hotel.Message", "InventoryChangeDataResponse");
    private final static QName _PriceInfoChangeDataRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.Domain.Hotel.Message", "PriceInfoChangeDataRequest");
    private final static QName _PriceInfoChangeDataResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.Domain.Hotel.Message", "PriceInfoChangeDataResponse");
    private final static QName _ReserveChangeDataRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.Domain.Hotel.Message", "ReserveChangeDataRequest");
    private final static QName _ReserveChangeDataResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.Domain.Hotel.Message", "ReserveChangeDataResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.elong.nb.agent.NorthBoundForAPIService
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ArrayOfRatePlanBaseInfo }
     * 
     */
    public ArrayOfRatePlanBaseInfo createArrayOfRatePlanBaseInfo() {
        return new ArrayOfRatePlanBaseInfo();
    }

    /**
     * Create an instance of {@link RatePlanBaseInfo }
     * 
     */
    public RatePlanBaseInfo createRatePlanBaseInfo() {
        return new RatePlanBaseInfo();
    }

    /**
     * Create an instance of {@link ArrayOfMarketingPromotion }
     * 
     */
    public ArrayOfMarketingPromotion createArrayOfMarketingPromotion() {
        return new ArrayOfMarketingPromotion();
    }

    /**
     * Create an instance of {@link MarketingPromotion }
     * 
     */
    public MarketingPromotion createMarketingPromotion() {
        return new MarketingPromotion();
    }

    /**
     * Create an instance of {@link ArrayOfBookingChannel }
     * 
     */
    public ArrayOfBookingChannel createArrayOfBookingChannel() {
        return new ArrayOfBookingChannel();
    }

    /**
     * Create an instance of {@link BookingChannel }
     * 
     */
    public BookingChannel createBookingChannel() {
        return new BookingChannel();
    }

    /**
     * Create an instance of {@link RatePlanChannel }
     * 
     */
    public RatePlanChannel createRatePlanChannel() {
        return new RatePlanChannel();
    }

    /**
     * Create an instance of {@link ArrayOfSellChannel }
     * 
     */
    public ArrayOfSellChannel createArrayOfSellChannel() {
        return new ArrayOfSellChannel();
    }

    /**
     * Create an instance of {@link SellChannel }
     * 
     */
    public SellChannel createSellChannel() {
        return new SellChannel();
    }

    /**
     * Create an instance of {@link CheckHotelProductStatusRequest }
     * 
     */
    public CheckHotelProductStatusRequest createCheckHotelProductStatusRequest() {
        return new CheckHotelProductStatusRequest();
    }

    /**
     * Create an instance of {@link CheckHotelProductStatusResponse }
     * 
     */
    public CheckHotelProductStatusResponse createCheckHotelProductStatusResponse() {
        return new CheckHotelProductStatusResponse();
    }

    /**
     * Create an instance of {@link ArrayOfHotelBookingRule }
     * 
     */
    public ArrayOfHotelBookingRule createArrayOfHotelBookingRule() {
        return new ArrayOfHotelBookingRule();
    }

    /**
     * Create an instance of {@link HotelBookingRule }
     * 
     */
    public HotelBookingRule createHotelBookingRule() {
        return new HotelBookingRule();
    }

    /**
     * Create an instance of {@link ArrayOfAddValueDayInfo }
     * 
     */
    public ArrayOfAddValueDayInfo createArrayOfAddValueDayInfo() {
        return new ArrayOfAddValueDayInfo();
    }

    /**
     * Create an instance of {@link AddValueDayInfo }
     * 
     */
    public AddValueDayInfo createAddValueDayInfo() {
        return new AddValueDayInfo();
    }

    /**
     * Create an instance of {@link ArrayOfAddValuePolicyInfo }
     * 
     */
    public ArrayOfAddValuePolicyInfo createArrayOfAddValuePolicyInfo() {
        return new ArrayOfAddValuePolicyInfo();
    }

    /**
     * Create an instance of {@link AddValuePolicyInfo }
     * 
     */
    public AddValuePolicyInfo createAddValuePolicyInfo() {
        return new AddValuePolicyInfo();
    }

    /**
     * Create an instance of {@link ArrayOfDRRInfo }
     * 
     */
    public ArrayOfDRRInfo createArrayOfDRRInfo() {
        return new ArrayOfDRRInfo();
    }

    /**
     * Create an instance of {@link DRRInfo }
     * 
     */
    public DRRInfo createDRRInfo() {
        return new DRRInfo();
    }

    /**
     * Create an instance of {@link ArrayOfPrePayInfo }
     * 
     */
    public ArrayOfPrePayInfo createArrayOfPrePayInfo() {
        return new ArrayOfPrePayInfo();
    }

    /**
     * Create an instance of {@link PrePayInfo }
     * 
     */
    public PrePayInfo createPrePayInfo() {
        return new PrePayInfo();
    }

    /**
     * Create an instance of {@link ArrayOfVouchInfo }
     * 
     */
    public ArrayOfVouchInfo createArrayOfVouchInfo() {
        return new ArrayOfVouchInfo();
    }

    /**
     * Create an instance of {@link VouchInfo }
     * 
     */
    public VouchInfo createVouchInfo() {
        return new VouchInfo();
    }

    /**
     * Create an instance of {@link ArrayOfMSRelation }
     * 
     */
    public ArrayOfMSRelation createArrayOfMSRelation() {
        return new ArrayOfMSRelation();
    }

    /**
     * Create an instance of {@link MSRelation }
     * 
     */
    public MSRelation createMSRelation() {
        return new MSRelation();
    }

    /**
     * Create an instance of {@link ArrayOfstring }
     * 
     */
    public ArrayOfstring createArrayOfstring() {
        return new ArrayOfstring();
    }

    /**
     * Create an instance of {@link ArrayOfchar }
     * 
     */
    public ArrayOfchar createArrayOfchar() {
        return new ArrayOfchar();
    }

    /**
     * Create an instance of {@link ArrayOfint }
     * 
     */
    public ArrayOfint createArrayOfint() {
        return new ArrayOfint();
    }

    /**
     * Create an instance of {@link OperateTimeInfo }
     * 
     */
    public OperateTimeInfo createOperateTimeInfo() {
        return new OperateTimeInfo();
    }

    /**
     * Create an instance of {@link ArrayOfRackRateChangeRecord }
     * 
     */
    public ArrayOfRackRateChangeRecord createArrayOfRackRateChangeRecord() {
        return new ArrayOfRackRateChangeRecord();
    }

    /**
     * Create an instance of {@link RackRateChangeRecord }
     * 
     */
    public RackRateChangeRecord createRackRateChangeRecord() {
        return new RackRateChangeRecord();
    }

    /**
     * Create an instance of {@link RecordBase }
     * 
     */
    public RecordBase createRecordBase() {
        return new RecordBase();
    }

    /**
     * Create an instance of {@link HotelNorthBoundAPIUsers }
     * 
     */
    public HotelNorthBoundAPIUsers createHotelNorthBoundAPIUsers() {
        return new HotelNorthBoundAPIUsers();
    }

    /**
     * Create an instance of {@link ArrayOfHotelNorthBoundAPIUsers }
     * 
     */
    public ArrayOfHotelNorthBoundAPIUsers createArrayOfHotelNorthBoundAPIUsers() {
        return new ArrayOfHotelNorthBoundAPIUsers();
    }

    /**
     * Create an instance of {@link BookingRuleBase }
     * 
     */
    public BookingRuleBase createBookingRuleBase() {
        return new BookingRuleBase();
    }

    /**
     * Create an instance of {@link RatePlanForRoomtype }
     * 
     */
    public RatePlanForRoomtype createRatePlanForRoomtype() {
        return new RatePlanForRoomtype();
    }

    /**
     * Create an instance of {@link ArrayOfAddValueInfoSimple }
     * 
     */
    public ArrayOfAddValueInfoSimple createArrayOfAddValueInfoSimple() {
        return new ArrayOfAddValueInfoSimple();
    }

    /**
     * Create an instance of {@link AddValueInfoSimple }
     * 
     */
    public AddValueInfoSimple createAddValueInfoSimple() {
        return new AddValueInfoSimple();
    }

    /**
     * Create an instance of {@link HotelNorthBoundOrders }
     * 
     */
    public HotelNorthBoundOrders createHotelNorthBoundOrders() {
        return new HotelNorthBoundOrders();
    }

    /**
     * Create an instance of {@link ArrayOfGeoInfo }
     * 
     */
    public ArrayOfGeoInfo createArrayOfGeoInfo() {
        return new ArrayOfGeoInfo();
    }

    /**
     * Create an instance of {@link GeoInfo }
     * 
     */
    public GeoInfo createGeoInfo() {
        return new GeoInfo();
    }

    /**
     * Create an instance of {@link ArrayOfGeoDetailInfo }
     * 
     */
    public ArrayOfGeoDetailInfo createArrayOfGeoDetailInfo() {
        return new ArrayOfGeoDetailInfo();
    }

    /**
     * Create an instance of {@link GeoDetailInfo }
     * 
     */
    public GeoDetailInfo createGeoDetailInfo() {
        return new GeoDetailInfo();
    }

    /**
     * Create an instance of {@link ArrayOfResourceInventoryStateChangeRecord }
     * 
     */
    public ArrayOfResourceInventoryStateChangeRecord createArrayOfResourceInventoryStateChangeRecord() {
        return new ArrayOfResourceInventoryStateChangeRecord();
    }

    /**
     * Create an instance of {@link ResourceInventoryStateChangeRecord }
     * 
     */
    public ResourceInventoryStateChangeRecord createResourceInventoryStateChangeRecord() {
        return new ResourceInventoryStateChangeRecord();
    }

    /**
     * Create an instance of {@link ArrayOfPriceInfoChangeRecord }
     * 
     */
    public ArrayOfPriceInfoChangeRecord createArrayOfPriceInfoChangeRecord() {
        return new ArrayOfPriceInfoChangeRecord();
    }

    /**
     * Create an instance of {@link PriceInfoChangeRecord }
     * 
     */
    public PriceInfoChangeRecord createPriceInfoChangeRecord() {
        return new PriceInfoChangeRecord();
    }

    /**
     * Create an instance of {@link ArrayOfReservationChangeRecord }
     * 
     */
    public ArrayOfReservationChangeRecord createArrayOfReservationChangeRecord() {
        return new ArrayOfReservationChangeRecord();
    }

    /**
     * Create an instance of {@link ReservationChangeRecord }
     * 
     */
    public ReservationChangeRecord createReservationChangeRecord() {
        return new ReservationChangeRecord();
    }

    /**
     * Create an instance of {@link ReservationExtendInfo }
     * 
     */
    public ReservationExtendInfo createReservationExtendInfo() {
        return new ReservationExtendInfo();
    }

    /**
     * Create an instance of {@link BStaticInfoSearchRequest }
     * 
     */
    public BStaticInfoSearchRequest createBStaticInfoSearchRequest() {
        return new BStaticInfoSearchRequest();
    }

    /**
     * Create an instance of {@link HotelRatePlanSearchFor114 }
     * 
     */
    public HotelRatePlanSearchFor114 createHotelRatePlanSearchFor114() {
        return new HotelRatePlanSearchFor114();
    }

    /**
     * Create an instance of {@link HotelRatePlanCondition }
     * 
     */
    public HotelRatePlanCondition createHotelRatePlanCondition() {
        return new HotelRatePlanCondition();
    }

    /**
     * Create an instance of {@link Request }
     * 
     */
    public Request createRequest() {
        return new Request();
    }

    /**
     * Create an instance of {@link ClientSystemInfo }
     * 
     */
    public ClientSystemInfo createClientSystemInfo() {
        return new ClientSystemInfo();
    }

    /**
     * Create an instance of {@link Response }
     * 
     */
    public Response createResponse() {
        return new Response();
    }

    /**
     * Create an instance of {@link ArrayOfRoomTypeInfo }
     * 
     */
    public ArrayOfRoomTypeInfo createArrayOfRoomTypeInfo() {
        return new ArrayOfRoomTypeInfo();
    }

    /**
     * Create an instance of {@link RoomTypeInfo }
     * 
     */
    public RoomTypeInfo createRoomTypeInfo() {
        return new RoomTypeInfo();
    }

    /**
     * Create an instance of {@link RoomNumbers }
     * 
     */
    public RoomNumbers createRoomNumbers() {
        return new RoomNumbers();
    }

    /**
     * Create an instance of {@link ArrayOfRoomNumDay }
     * 
     */
    public ArrayOfRoomNumDay createArrayOfRoomNumDay() {
        return new ArrayOfRoomNumDay();
    }

    /**
     * Create an instance of {@link RoomNumDay }
     * 
     */
    public RoomNumDay createRoomNumDay() {
        return new RoomNumDay();
    }

    /**
     * Create an instance of {@link RoomRate }
     * 
     */
    public RoomRate createRoomRate() {
        return new RoomRate();
    }

    /**
     * Create an instance of {@link HotelPrice }
     * 
     */
    public HotelPrice createHotelPrice() {
        return new HotelPrice();
    }

    /**
     * Create an instance of {@link ArrayOfPriceDay }
     * 
     */
    public ArrayOfPriceDay createArrayOfPriceDay() {
        return new ArrayOfPriceDay();
    }

    /**
     * Create an instance of {@link PriceDay }
     * 
     */
    public PriceDay createPriceDay() {
        return new PriceDay();
    }

    /**
     * Create an instance of {@link ArrayOfRatePlanPaymentRule }
     * 
     */
    public ArrayOfRatePlanPaymentRule createArrayOfRatePlanPaymentRule() {
        return new ArrayOfRatePlanPaymentRule();
    }

    /**
     * Create an instance of {@link RatePlanPaymentRule }
     * 
     */
    public RatePlanPaymentRule createRatePlanPaymentRule() {
        return new RatePlanPaymentRule();
    }

    /**
     * Create an instance of {@link ArrayOfHotelDetail }
     * 
     */
    public ArrayOfHotelDetail createArrayOfHotelDetail() {
        return new ArrayOfHotelDetail();
    }

    /**
     * Create an instance of {@link HotelDetail }
     * 
     */
    public HotelDetail createHotelDetail() {
        return new HotelDetail();
    }

    /**
     * Create an instance of {@link HotelInfo }
     * 
     */
    public HotelInfo createHotelInfo() {
        return new HotelInfo();
    }

    /**
     * Create an instance of {@link ArrayOfHotelActivity }
     * 
     */
    public ArrayOfHotelActivity createArrayOfHotelActivity() {
        return new ArrayOfHotelActivity();
    }

    /**
     * Create an instance of {@link HotelActivity }
     * 
     */
    public HotelActivity createHotelActivity() {
        return new HotelActivity();
    }

    /**
     * Create an instance of {@link GetRackRateChangeData }
     * 
     */
    public GetRackRateChangeData createGetRackRateChangeData() {
        return new GetRackRateChangeData();
    }

    /**
     * Create an instance of {@link RackRateChangeDataRequest }
     * 
     */
    public RackRateChangeDataRequest createRackRateChangeDataRequest() {
        return new RackRateChangeDataRequest();
    }

    /**
     * Create an instance of {@link GetRackRateChangeDataResponse }
     * 
     */
    public GetRackRateChangeDataResponse createGetRackRateChangeDataResponse() {
        return new GetRackRateChangeDataResponse();
    }

    /**
     * Create an instance of {@link RackRateChangeDataResponse }
     * 
     */
    public RackRateChangeDataResponse createRackRateChangeDataResponse() {
        return new RackRateChangeDataResponse();
    }

    /**
     * Create an instance of {@link CheckHotelProductStatus }
     * 
     */
    public CheckHotelProductStatus createCheckHotelProductStatus() {
        return new CheckHotelProductStatus();
    }

    /**
     * Create an instance of {@link CheckHotelProductStatusResponse2 }
     * 
     */
    public CheckHotelProductStatusResponse2 createCheckHotelProductStatusResponse2() {
        return new CheckHotelProductStatusResponse2();
    }

    /**
     * Create an instance of {@link DoWork }
     * 
     */
    public DoWork createDoWork() {
        return new DoWork();
    }

    /**
     * Create an instance of {@link DoWorkResponse }
     * 
     */
    public DoWorkResponse createDoWorkResponse() {
        return new DoWorkResponse();
    }

    /**
     * Create an instance of {@link Add }
     * 
     */
    public Add createAdd() {
        return new Add();
    }

    /**
     * Create an instance of {@link AddResponse }
     * 
     */
    public AddResponse createAddResponse() {
        return new AddResponse();
    }

    /**
     * Create an instance of {@link Delete }
     * 
     */
    public Delete createDelete() {
        return new Delete();
    }

    /**
     * Create an instance of {@link DeleteResponse }
     * 
     */
    public DeleteResponse createDeleteResponse() {
        return new DeleteResponse();
    }

    /**
     * Create an instance of {@link Update }
     * 
     */
    public Update createUpdate() {
        return new Update();
    }

    /**
     * Create an instance of {@link UpdateResponse }
     * 
     */
    public UpdateResponse createUpdateResponse() {
        return new UpdateResponse();
    }

    /**
     * Create an instance of {@link UpdateLoginTokenExpiredTime }
     * 
     */
    public UpdateLoginTokenExpiredTime createUpdateLoginTokenExpiredTime() {
        return new UpdateLoginTokenExpiredTime();
    }

    /**
     * Create an instance of {@link UpdateLoginTokenExpiredTimeResponse }
     * 
     */
    public UpdateLoginTokenExpiredTimeResponse createUpdateLoginTokenExpiredTimeResponse() {
        return new UpdateLoginTokenExpiredTimeResponse();
    }

    /**
     * Create an instance of {@link UpdateLoginTokenInfo }
     * 
     */
    public UpdateLoginTokenInfo createUpdateLoginTokenInfo() {
        return new UpdateLoginTokenInfo();
    }

    /**
     * Create an instance of {@link UpdateLoginTokenInfoResponse }
     * 
     */
    public UpdateLoginTokenInfoResponse createUpdateLoginTokenInfoResponse() {
        return new UpdateLoginTokenInfoResponse();
    }

    /**
     * Create an instance of {@link Find }
     * 
     */
    public Find createFind() {
        return new Find();
    }

    /**
     * Create an instance of {@link FindResponse }
     * 
     */
    public FindResponse createFindResponse() {
        return new FindResponse();
    }

    /**
     * Create an instance of {@link GetHotelAPIUsersByUserInfo }
     * 
     */
    public GetHotelAPIUsersByUserInfo createGetHotelAPIUsersByUserInfo() {
        return new GetHotelAPIUsersByUserInfo();
    }

    /**
     * Create an instance of {@link GetHotelAPIUsersByUserInfoResponse }
     * 
     */
    public GetHotelAPIUsersByUserInfoResponse createGetHotelAPIUsersByUserInfoResponse() {
        return new GetHotelAPIUsersByUserInfoResponse();
    }

    /**
     * Create an instance of {@link GetHotelAPIUsersByLoginToken }
     * 
     */
    public GetHotelAPIUsersByLoginToken createGetHotelAPIUsersByLoginToken() {
        return new GetHotelAPIUsersByLoginToken();
    }

    /**
     * Create an instance of {@link GetHotelAPIUsersByLoginTokenResponse }
     * 
     */
    public GetHotelAPIUsersByLoginTokenResponse createGetHotelAPIUsersByLoginTokenResponse() {
        return new GetHotelAPIUsersByLoginTokenResponse();
    }

    /**
     * Create an instance of {@link GetHotelAPIUsersByID }
     * 
     */
    public GetHotelAPIUsersByID createGetHotelAPIUsersByID() {
        return new GetHotelAPIUsersByID();
    }

    /**
     * Create an instance of {@link GetHotelAPIUsersByIDResponse }
     * 
     */
    public GetHotelAPIUsersByIDResponse createGetHotelAPIUsersByIDResponse() {
        return new GetHotelAPIUsersByIDResponse();
    }

    /**
     * Create an instance of {@link GetAllHotelAPIUsers }
     * 
     */
    public GetAllHotelAPIUsers createGetAllHotelAPIUsers() {
        return new GetAllHotelAPIUsers();
    }

    /**
     * Create an instance of {@link GetAllHotelAPIUsersResponse }
     * 
     */
    public GetAllHotelAPIUsersResponse createGetAllHotelAPIUsersResponse() {
        return new GetAllHotelAPIUsersResponse();
    }

    /**
     * Create an instance of {@link GetProductUpDatedHotelId }
     * 
     */
    public GetProductUpDatedHotelId createGetProductUpDatedHotelId() {
        return new GetProductUpDatedHotelId();
    }

    /**
     * Create an instance of {@link GetProductUpDatedHotelIdResponse }
     * 
     */
    public GetProductUpDatedHotelIdResponse createGetProductUpDatedHotelIdResponse() {
        return new GetProductUpDatedHotelIdResponse();
    }

    /**
     * Create an instance of {@link HotelRoomGetPeriodChangeRoomList }
     * 
     */
    public HotelRoomGetPeriodChangeRoomList createHotelRoomGetPeriodChangeRoomList() {
        return new HotelRoomGetPeriodChangeRoomList();
    }

    /**
     * Create an instance of {@link HotelRoomGetPeriodChangeRoomListResponse }
     * 
     */
    public HotelRoomGetPeriodChangeRoomListResponse createHotelRoomGetPeriodChangeRoomListResponse() {
        return new HotelRoomGetPeriodChangeRoomListResponse();
    }

    /**
     * Create an instance of {@link SearchHotelDetailListFor114 }
     * 
     */
    public SearchHotelDetailListFor114 createSearchHotelDetailListFor114() {
        return new SearchHotelDetailListFor114();
    }

    /**
     * Create an instance of {@link SearchHotelDetailListFor114Response }
     * 
     */
    public SearchHotelDetailListFor114Response createSearchHotelDetailListFor114Response() {
        return new SearchHotelDetailListFor114Response();
    }

    /**
     * Create an instance of {@link AddHotelNorthBoundOrders }
     * 
     */
    public AddHotelNorthBoundOrders createAddHotelNorthBoundOrders() {
        return new AddHotelNorthBoundOrders();
    }

    /**
     * Create an instance of {@link AddHotelNorthBoundOrdersResponse }
     * 
     */
    public AddHotelNorthBoundOrdersResponse createAddHotelNorthBoundOrdersResponse() {
        return new AddHotelNorthBoundOrdersResponse();
    }

    /**
     * Create an instance of {@link FindOrder }
     * 
     */
    public FindOrder createFindOrder() {
        return new FindOrder();
    }

    /**
     * Create an instance of {@link FindOrderResponse }
     * 
     */
    public FindOrderResponse createFindOrderResponse() {
        return new FindOrderResponse();
    }

    /**
     * Create an instance of {@link GetHotelImageServiceInfo }
     * 
     */
    public GetHotelImageServiceInfo createGetHotelImageServiceInfo() {
        return new GetHotelImageServiceInfo();
    }

    /**
     * Create an instance of {@link GetHotelImageServiceInfoResponse }
     * 
     */
    public GetHotelImageServiceInfoResponse createGetHotelImageServiceInfoResponse() {
        return new GetHotelImageServiceInfoResponse();
    }

    /**
     * Create an instance of {@link ArrayOfHotelImage }
     * 
     */
    public ArrayOfHotelImage createArrayOfHotelImage() {
        return new ArrayOfHotelImage();
    }

    /**
     * Create an instance of {@link GetParterParameter }
     * 
     */
    public GetParterParameter createGetParterParameter() {
        return new GetParterParameter();
    }

    /**
     * Create an instance of {@link GetParterParameterResponse }
     * 
     */
    public GetParterParameterResponse createGetParterParameterResponse() {
        return new GetParterParameterResponse();
    }

    /**
     * Create an instance of {@link GetHotelDetailInfos }
     * 
     */
    public GetHotelDetailInfos createGetHotelDetailInfos() {
        return new GetHotelDetailInfos();
    }

    /**
     * Create an instance of {@link GetHotelDetailInfosResponse }
     * 
     */
    public GetHotelDetailInfosResponse createGetHotelDetailInfosResponse() {
        return new GetHotelDetailInfosResponse();
    }

    /**
     * Create an instance of {@link GetNewHotelIds }
     * 
     */
    public GetNewHotelIds createGetNewHotelIds() {
        return new GetNewHotelIds();
    }

    /**
     * Create an instance of {@link GetNewHotelIdsResponse }
     * 
     */
    public GetNewHotelIdsResponse createGetNewHotelIdsResponse() {
        return new GetNewHotelIdsResponse();
    }

    /**
     * Create an instance of {@link GetHotelInventoryStateByHotelID }
     * 
     */
    public GetHotelInventoryStateByHotelID createGetHotelInventoryStateByHotelID() {
        return new GetHotelInventoryStateByHotelID();
    }

    /**
     * Create an instance of {@link GetHotelInventoryStateByHotelIDResponse }
     * 
     */
    public GetHotelInventoryStateByHotelIDResponse createGetHotelInventoryStateByHotelIDResponse() {
        return new GetHotelInventoryStateByHotelIDResponse();
    }

    /**
     * Create an instance of {@link GetAllGeoInfo }
     * 
     */
    public GetAllGeoInfo createGetAllGeoInfo() {
        return new GetAllGeoInfo();
    }

    /**
     * Create an instance of {@link GetAllGeoInfoResponse }
     * 
     */
    public GetAllGeoInfoResponse createGetAllGeoInfoResponse() {
        return new GetAllGeoInfoResponse();
    }

    /**
     * Create an instance of {@link GetGeoDetailByCityId }
     * 
     */
    public GetGeoDetailByCityId createGetGeoDetailByCityId() {
        return new GetGeoDetailByCityId();
    }

    /**
     * Create an instance of {@link GetGeoDetailByCityIdResponse }
     * 
     */
    public GetGeoDetailByCityIdResponse createGetGeoDetailByCityIdResponse() {
        return new GetGeoDetailByCityIdResponse();
    }

    /**
     * Create an instance of {@link AllOndutyHotelIDs }
     * 
     */
    public AllOndutyHotelIDs createAllOndutyHotelIDs() {
        return new AllOndutyHotelIDs();
    }

    /**
     * Create an instance of {@link AllOndutyHotelIDsResponse }
     * 
     */
    public AllOndutyHotelIDsResponse createAllOndutyHotelIDsResponse() {
        return new AllOndutyHotelIDsResponse();
    }

    /**
     * Create an instance of {@link GetMHotelSHotelRelations }
     * 
     */
    public GetMHotelSHotelRelations createGetMHotelSHotelRelations() {
        return new GetMHotelSHotelRelations();
    }

    /**
     * Create an instance of {@link GetMSRelationRequest }
     * 
     */
    public GetMSRelationRequest createGetMSRelationRequest() {
        return new GetMSRelationRequest();
    }

    /**
     * Create an instance of {@link GetMHotelSHotelRelationsResponse }
     * 
     */
    public GetMHotelSHotelRelationsResponse createGetMHotelSHotelRelationsResponse() {
        return new GetMHotelSHotelRelationsResponse();
    }

    /**
     * Create an instance of {@link GetMSRelationResponse }
     * 
     */
    public GetMSRelationResponse createGetMSRelationResponse() {
        return new GetMSRelationResponse();
    }

    /**
     * Create an instance of {@link InstantConfirm }
     * 
     */
    public InstantConfirm createInstantConfirm() {
        return new InstantConfirm();
    }

    /**
     * Create an instance of {@link InstantConfirmResponse }
     * 
     */
    public InstantConfirmResponse createInstantConfirmResponse() {
        return new InstantConfirmResponse();
    }

    /**
     * Create an instance of {@link GetRelatedReserve }
     * 
     */
    public GetRelatedReserve createGetRelatedReserve() {
        return new GetRelatedReserve();
    }

    /**
     * Create an instance of {@link GetRelatedReserveResponse }
     * 
     */
    public GetRelatedReserveResponse createGetRelatedReserveResponse() {
        return new GetRelatedReserveResponse();
    }

    /**
     * Create an instance of {@link GetHotelInfoIndex }
     * 
     */
    public GetHotelInfoIndex createGetHotelInfoIndex() {
        return new GetHotelInfoIndex();
    }

    /**
     * Create an instance of {@link GetHotelInfoIndexResponse }
     * 
     */
    public GetHotelInfoIndexResponse createGetHotelInfoIndexResponse() {
        return new GetHotelInfoIndexResponse();
    }

    /**
     * Create an instance of {@link ArrayOfHotelInfoForIndex }
     * 
     */
    public ArrayOfHotelInfoForIndex createArrayOfHotelInfoForIndex() {
        return new ArrayOfHotelInfoForIndex();
    }

    /**
     * Create an instance of {@link SearchHotelRatePlanList }
     * 
     */
    public SearchHotelRatePlanList createSearchHotelRatePlanList() {
        return new SearchHotelRatePlanList();
    }

    /**
     * Create an instance of {@link SearchHotelRatePlanListResponse }
     * 
     */
    public SearchHotelRatePlanListResponse createSearchHotelRatePlanListResponse() {
        return new SearchHotelRatePlanListResponse();
    }

    /**
     * Create an instance of {@link GetInventoryChangeData }
     * 
     */
    public GetInventoryChangeData createGetInventoryChangeData() {
        return new GetInventoryChangeData();
    }

    /**
     * Create an instance of {@link InventoryChangeDataRequest }
     * 
     */
    public InventoryChangeDataRequest createInventoryChangeDataRequest() {
        return new InventoryChangeDataRequest();
    }

    /**
     * Create an instance of {@link GetInventoryChangeDataResponse }
     * 
     */
    public GetInventoryChangeDataResponse createGetInventoryChangeDataResponse() {
        return new GetInventoryChangeDataResponse();
    }

    /**
     * Create an instance of {@link InventoryChangeDataResponse }
     * 
     */
    public InventoryChangeDataResponse createInventoryChangeDataResponse() {
        return new InventoryChangeDataResponse();
    }

    /**
     * Create an instance of {@link GetPriceChangeData }
     * 
     */
    public GetPriceChangeData createGetPriceChangeData() {
        return new GetPriceChangeData();
    }

    /**
     * Create an instance of {@link PriceInfoChangeDataRequest }
     * 
     */
    public PriceInfoChangeDataRequest createPriceInfoChangeDataRequest() {
        return new PriceInfoChangeDataRequest();
    }

    /**
     * Create an instance of {@link GetPriceChangeDataResponse }
     * 
     */
    public GetPriceChangeDataResponse createGetPriceChangeDataResponse() {
        return new GetPriceChangeDataResponse();
    }

    /**
     * Create an instance of {@link PriceInfoChangeDataResponse }
     * 
     */
    public PriceInfoChangeDataResponse createPriceInfoChangeDataResponse() {
        return new PriceInfoChangeDataResponse();
    }

    /**
     * Create an instance of {@link GetReserveChangeData }
     * 
     */
    public GetReserveChangeData createGetReserveChangeData() {
        return new GetReserveChangeData();
    }

    /**
     * Create an instance of {@link ReserveChangeDataRequest }
     * 
     */
    public ReserveChangeDataRequest createReserveChangeDataRequest() {
        return new ReserveChangeDataRequest();
    }

    /**
     * Create an instance of {@link GetReserveChangeDataResponse }
     * 
     */
    public GetReserveChangeDataResponse createGetReserveChangeDataResponse() {
        return new GetReserveChangeDataResponse();
    }

    /**
     * Create an instance of {@link ReserveChangeDataResponse }
     * 
     */
    public ReserveChangeDataResponse createReserveChangeDataResponse() {
        return new ReserveChangeDataResponse();
    }

    /**
     * Create an instance of {@link HotelInfoForIndex }
     * 
     */
    public HotelInfoForIndex createHotelInfoForIndex() {
        return new HotelInfoForIndex();
    }

    /**
     * Create an instance of {@link ArrayOfDictionaryEntry }
     * 
     */
    public ArrayOfDictionaryEntry createArrayOfDictionaryEntry() {
        return new ArrayOfDictionaryEntry();
    }

    /**
     * Create an instance of {@link DictionaryEntry }
     * 
     */
    public DictionaryEntry createDictionaryEntry() {
        return new DictionaryEntry();
    }

    /**
     * Create an instance of {@link RoomTypeInfoBase }
     * 
     */
    public RoomTypeInfoBase createRoomTypeInfoBase() {
        return new RoomTypeInfoBase();
    }

    /**
     * Create an instance of {@link ArrayOfRoomAdditionDefine }
     * 
     */
    public ArrayOfRoomAdditionDefine createArrayOfRoomAdditionDefine() {
        return new ArrayOfRoomAdditionDefine();
    }

    /**
     * Create an instance of {@link RoomAdditionDefine }
     * 
     */
    public RoomAdditionDefine createRoomAdditionDefine() {
        return new RoomAdditionDefine();
    }

    /**
     * Create an instance of {@link HotelContent }
     * 
     */
    public HotelContent createHotelContent() {
        return new HotelContent();
    }

    /**
     * Create an instance of {@link HotelAirportPickUpService }
     * 
     */
    public HotelAirportPickUpService createHotelAirportPickUpService() {
        return new HotelAirportPickUpService();
    }

    /**
     * Create an instance of {@link HotelConferenceAmenities }
     * 
     */
    public HotelConferenceAmenities createHotelConferenceAmenities() {
        return new HotelConferenceAmenities();
    }

    /**
     * Create an instance of {@link ArrayOfHotelAmenity }
     * 
     */
    public ArrayOfHotelAmenity createArrayOfHotelAmenity() {
        return new ArrayOfHotelAmenity();
    }

    /**
     * Create an instance of {@link HotelAmenity }
     * 
     */
    public HotelAmenity createHotelAmenity() {
        return new HotelAmenity();
    }

    /**
     * Create an instance of {@link ArrayOfHotelCreditCategory }
     * 
     */
    public ArrayOfHotelCreditCategory createArrayOfHotelCreditCategory() {
        return new ArrayOfHotelCreditCategory();
    }

    /**
     * Create an instance of {@link HotelCreditCategory }
     * 
     */
    public HotelCreditCategory createHotelCreditCategory() {
        return new HotelCreditCategory();
    }

    /**
     * Create an instance of {@link HotelDiningAmenities }
     * 
     */
    public HotelDiningAmenities createHotelDiningAmenities() {
        return new HotelDiningAmenities();
    }

    /**
     * Create an instance of {@link HotelfeatureInfo }
     * 
     */
    public HotelfeatureInfo createHotelfeatureInfo() {
        return new HotelfeatureInfo();
    }

    /**
     * Create an instance of {@link HotelGeneralAmenities }
     * 
     */
    public HotelGeneralAmenities createHotelGeneralAmenities() {
        return new HotelGeneralAmenities();
    }

    /**
     * Create an instance of {@link ArrayOfHotelLandMark }
     * 
     */
    public ArrayOfHotelLandMark createArrayOfHotelLandMark() {
        return new ArrayOfHotelLandMark();
    }

    /**
     * Create an instance of {@link HotelLandMark }
     * 
     */
    public HotelLandMark createHotelLandMark() {
        return new HotelLandMark();
    }

    /**
     * Create an instance of {@link HotelRecreationAmenities }
     * 
     */
    public HotelRecreationAmenities createHotelRecreationAmenities() {
        return new HotelRecreationAmenities();
    }

    /**
     * Create an instance of {@link HotelRoomAmenities }
     * 
     */
    public HotelRoomAmenities createHotelRoomAmenities() {
        return new HotelRoomAmenities();
    }

    /**
     * Create an instance of {@link ArrayOfHotelSurroundingAttractions }
     * 
     */
    public ArrayOfHotelSurroundingAttractions createArrayOfHotelSurroundingAttractions() {
        return new ArrayOfHotelSurroundingAttractions();
    }

    /**
     * Create an instance of {@link HotelSurroundingAttractions }
     * 
     */
    public HotelSurroundingAttractions createHotelSurroundingAttractions() {
        return new HotelSurroundingAttractions();
    }

    /**
     * Create an instance of {@link ArrayOfHotelTrafficAndAroundInformation }
     * 
     */
    public ArrayOfHotelTrafficAndAroundInformation createArrayOfHotelTrafficAndAroundInformation() {
        return new ArrayOfHotelTrafficAndAroundInformation();
    }

    /**
     * Create an instance of {@link HotelTrafficAndAroundInformation }
     * 
     */
    public HotelTrafficAndAroundInformation createHotelTrafficAndAroundInformation() {
        return new HotelTrafficAndAroundInformation();
    }

    /**
     * Create an instance of {@link ArrayOfHotelAroundInformaiton }
     * 
     */
    public ArrayOfHotelAroundInformaiton createArrayOfHotelAroundInformaiton() {
        return new ArrayOfHotelAroundInformaiton();
    }

    /**
     * Create an instance of {@link HotelAroundInformaiton }
     * 
     */
    public HotelAroundInformaiton createHotelAroundInformaiton() {
        return new HotelAroundInformaiton();
    }

    /**
     * Create an instance of {@link HotelTrafficAndAroundInformations }
     * 
     */
    public HotelTrafficAndAroundInformations createHotelTrafficAndAroundInformations() {
        return new HotelTrafficAndAroundInformations();
    }

    /**
     * Create an instance of {@link ArrayOfHotelProductRelation }
     * 
     */
    public ArrayOfHotelProductRelation createArrayOfHotelProductRelation() {
        return new ArrayOfHotelProductRelation();
    }

    /**
     * Create an instance of {@link HotelProductRelation }
     * 
     */
    public HotelProductRelation createHotelProductRelation() {
        return new HotelProductRelation();
    }

    /**
     * Create an instance of {@link ArrayOfHotelTag }
     * 
     */
    public ArrayOfHotelTag createArrayOfHotelTag() {
        return new ArrayOfHotelTag();
    }

    /**
     * Create an instance of {@link HotelTag }
     * 
     */
    public HotelTag createHotelTag() {
        return new HotelTag();
    }

    /**
     * Create an instance of {@link HotelImage }
     * 
     */
    public HotelImage createHotelImage() {
        return new HotelImage();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRatePlanBaseInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.Domain.Hotel.Entity", name = "ArrayOfRatePlanBaseInfo")
    public JAXBElement<ArrayOfRatePlanBaseInfo> createArrayOfRatePlanBaseInfo(ArrayOfRatePlanBaseInfo value) {
        return new JAXBElement<ArrayOfRatePlanBaseInfo>(_ArrayOfRatePlanBaseInfo_QNAME, ArrayOfRatePlanBaseInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RatePlanBaseInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.Domain.Hotel.Entity", name = "RatePlanBaseInfo")
    public JAXBElement<RatePlanBaseInfo> createRatePlanBaseInfo(RatePlanBaseInfo value) {
        return new JAXBElement<RatePlanBaseInfo>(_RatePlanBaseInfo_QNAME, RatePlanBaseInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfMarketingPromotion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.Domain.Hotel.Entity", name = "ArrayOfMarketingPromotion")
    public JAXBElement<ArrayOfMarketingPromotion> createArrayOfMarketingPromotion(ArrayOfMarketingPromotion value) {
        return new JAXBElement<ArrayOfMarketingPromotion>(_ArrayOfMarketingPromotion_QNAME, ArrayOfMarketingPromotion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MarketingPromotion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.Domain.Hotel.Entity", name = "MarketingPromotion")
    public JAXBElement<MarketingPromotion> createMarketingPromotion(MarketingPromotion value) {
        return new JAXBElement<MarketingPromotion>(_MarketingPromotion_QNAME, MarketingPromotion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfBookingChannel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.Domain.Hotel.Entity", name = "ArrayOfBookingChannel")
    public JAXBElement<ArrayOfBookingChannel> createArrayOfBookingChannel(ArrayOfBookingChannel value) {
        return new JAXBElement<ArrayOfBookingChannel>(_ArrayOfBookingChannel_QNAME, ArrayOfBookingChannel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BookingChannel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.Domain.Hotel.Entity", name = "BookingChannel")
    public JAXBElement<BookingChannel> createBookingChannel(BookingChannel value) {
        return new JAXBElement<BookingChannel>(_BookingChannel_QNAME, BookingChannel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RatePlanChannel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.Domain.Hotel.Entity", name = "RatePlanChannel")
    public JAXBElement<RatePlanChannel> createRatePlanChannel(RatePlanChannel value) {
        return new JAXBElement<RatePlanChannel>(_RatePlanChannel_QNAME, RatePlanChannel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSellChannel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.Domain.Hotel.Entity", name = "ArrayOfSellChannel")
    public JAXBElement<ArrayOfSellChannel> createArrayOfSellChannel(ArrayOfSellChannel value) {
        return new JAXBElement<ArrayOfSellChannel>(_ArrayOfSellChannel_QNAME, ArrayOfSellChannel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SellChannel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.Domain.Hotel.Entity", name = "SellChannel")
    public JAXBElement<SellChannel> createSellChannel(SellChannel value) {
        return new JAXBElement<SellChannel>(_SellChannel_QNAME, SellChannel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckHotelProductStatusRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.Domain.Hotel.Message.ProductUse", name = "CheckHotelProductStatusRequest")
    public JAXBElement<CheckHotelProductStatusRequest> createCheckHotelProductStatusRequest(CheckHotelProductStatusRequest value) {
        return new JAXBElement<CheckHotelProductStatusRequest>(_CheckHotelProductStatusRequest_QNAME, CheckHotelProductStatusRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckHotelProductStatusResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.Domain.Hotel.Message.ProductUse", name = "CheckHotelProductStatusResponse")
    public JAXBElement<CheckHotelProductStatusResponse> createCheckHotelProductStatusResponse(CheckHotelProductStatusResponse value) {
        return new JAXBElement<CheckHotelProductStatusResponse>(_CheckHotelProductStatusResponse_QNAME, CheckHotelProductStatusResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfHotelBookingRule }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.Domain.Hotel.HotelProductUseBusiness", name = "ArrayOfHotelBookingRule")
    public JAXBElement<ArrayOfHotelBookingRule> createArrayOfHotelBookingRule(ArrayOfHotelBookingRule value) {
        return new JAXBElement<ArrayOfHotelBookingRule>(_ArrayOfHotelBookingRule_QNAME, ArrayOfHotelBookingRule.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HotelBookingRule }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.Domain.Hotel.HotelProductUseBusiness", name = "HotelBookingRule")
    public JAXBElement<HotelBookingRule> createHotelBookingRule(HotelBookingRule value) {
        return new JAXBElement<HotelBookingRule>(_HotelBookingRule_QNAME, HotelBookingRule.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAddValueDayInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.Domain.Hotel.HotelProductUseBusiness", name = "ArrayOfAddValueDayInfo")
    public JAXBElement<ArrayOfAddValueDayInfo> createArrayOfAddValueDayInfo(ArrayOfAddValueDayInfo value) {
        return new JAXBElement<ArrayOfAddValueDayInfo>(_ArrayOfAddValueDayInfo_QNAME, ArrayOfAddValueDayInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddValueDayInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.Domain.Hotel.HotelProductUseBusiness", name = "AddValueDayInfo")
    public JAXBElement<AddValueDayInfo> createAddValueDayInfo(AddValueDayInfo value) {
        return new JAXBElement<AddValueDayInfo>(_AddValueDayInfo_QNAME, AddValueDayInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAddValuePolicyInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.Domain.Hotel.HotelProductUseBusiness", name = "ArrayOfAddValuePolicyInfo")
    public JAXBElement<ArrayOfAddValuePolicyInfo> createArrayOfAddValuePolicyInfo(ArrayOfAddValuePolicyInfo value) {
        return new JAXBElement<ArrayOfAddValuePolicyInfo>(_ArrayOfAddValuePolicyInfo_QNAME, ArrayOfAddValuePolicyInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddValuePolicyInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.Domain.Hotel.HotelProductUseBusiness", name = "AddValuePolicyInfo")
    public JAXBElement<AddValuePolicyInfo> createAddValuePolicyInfo(AddValuePolicyInfo value) {
        return new JAXBElement<AddValuePolicyInfo>(_AddValuePolicyInfo_QNAME, AddValuePolicyInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDRRInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.Domain.Hotel.HotelProductUseBusiness", name = "ArrayOfDRRInfo")
    public JAXBElement<ArrayOfDRRInfo> createArrayOfDRRInfo(ArrayOfDRRInfo value) {
        return new JAXBElement<ArrayOfDRRInfo>(_ArrayOfDRRInfo_QNAME, ArrayOfDRRInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DRRInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.Domain.Hotel.HotelProductUseBusiness", name = "DRRInfo")
    public JAXBElement<DRRInfo> createDRRInfo(DRRInfo value) {
        return new JAXBElement<DRRInfo>(_DRRInfo_QNAME, DRRInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPrePayInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.Domain.Hotel.HotelProductUseBusiness", name = "ArrayOfPrePayInfo")
    public JAXBElement<ArrayOfPrePayInfo> createArrayOfPrePayInfo(ArrayOfPrePayInfo value) {
        return new JAXBElement<ArrayOfPrePayInfo>(_ArrayOfPrePayInfo_QNAME, ArrayOfPrePayInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PrePayInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.Domain.Hotel.HotelProductUseBusiness", name = "PrePayInfo")
    public JAXBElement<PrePayInfo> createPrePayInfo(PrePayInfo value) {
        return new JAXBElement<PrePayInfo>(_PrePayInfo_QNAME, PrePayInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfVouchInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.Domain.Hotel.HotelProductUseBusiness", name = "ArrayOfVouchInfo")
    public JAXBElement<ArrayOfVouchInfo> createArrayOfVouchInfo(ArrayOfVouchInfo value) {
        return new JAXBElement<ArrayOfVouchInfo>(_ArrayOfVouchInfo_QNAME, ArrayOfVouchInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VouchInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.Domain.Hotel.HotelProductUseBusiness", name = "VouchInfo")
    public JAXBElement<VouchInfo> createVouchInfo(VouchInfo value) {
        return new JAXBElement<VouchInfo>(_VouchInfo_QNAME, VouchInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfMSRelation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.Domain.Hotel.HotelProductUseBusiness", name = "ArrayOfM_SRelation")
    public JAXBElement<ArrayOfMSRelation> createArrayOfMSRelation(ArrayOfMSRelation value) {
        return new JAXBElement<ArrayOfMSRelation>(_ArrayOfMSRelation_QNAME, ArrayOfMSRelation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSRelation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.Domain.Hotel.HotelProductUseBusiness", name = "M_SRelation")
    public JAXBElement<MSRelation> createMSRelation(MSRelation value) {
        return new JAXBElement<MSRelation>(_MSRelation_QNAME, MSRelation.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfchar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/Arrays", name = "ArrayOfchar")
    public JAXBElement<ArrayOfchar> createArrayOfchar(ArrayOfchar value) {
        return new JAXBElement<ArrayOfchar>(_ArrayOfchar_QNAME, ArrayOfchar.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link OperateTimeInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.DataAccess.Hotel", name = "OperateTimeInfo")
    public JAXBElement<OperateTimeInfo> createOperateTimeInfo(OperateTimeInfo value) {
        return new JAXBElement<OperateTimeInfo>(_OperateTimeInfo_QNAME, OperateTimeInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRackRateChangeRecord }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.DataAccess.Hotel", name = "ArrayOfRackRateChangeRecord")
    public JAXBElement<ArrayOfRackRateChangeRecord> createArrayOfRackRateChangeRecord(ArrayOfRackRateChangeRecord value) {
        return new JAXBElement<ArrayOfRackRateChangeRecord>(_ArrayOfRackRateChangeRecord_QNAME, ArrayOfRackRateChangeRecord.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RackRateChangeRecord }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.DataAccess.Hotel", name = "RackRateChangeRecord")
    public JAXBElement<RackRateChangeRecord> createRackRateChangeRecord(RackRateChangeRecord value) {
        return new JAXBElement<RackRateChangeRecord>(_RackRateChangeRecord_QNAME, RackRateChangeRecord.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecordBase }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.DataAccess.Hotel", name = "RecordBase")
    public JAXBElement<RecordBase> createRecordBase(RecordBase value) {
        return new JAXBElement<RecordBase>(_RecordBase_QNAME, RecordBase.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HotelNorthBoundAPIUsers }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.DataAccess.Hotel", name = "HotelNorthBoundAPIUsers")
    public JAXBElement<HotelNorthBoundAPIUsers> createHotelNorthBoundAPIUsers(HotelNorthBoundAPIUsers value) {
        return new JAXBElement<HotelNorthBoundAPIUsers>(_HotelNorthBoundAPIUsers_QNAME, HotelNorthBoundAPIUsers.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfHotelNorthBoundAPIUsers }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.DataAccess.Hotel", name = "ArrayOfHotelNorthBoundAPIUsers")
    public JAXBElement<ArrayOfHotelNorthBoundAPIUsers> createArrayOfHotelNorthBoundAPIUsers(ArrayOfHotelNorthBoundAPIUsers value) {
        return new JAXBElement<ArrayOfHotelNorthBoundAPIUsers>(_ArrayOfHotelNorthBoundAPIUsers_QNAME, ArrayOfHotelNorthBoundAPIUsers.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BookingRuleBase }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.DataAccess.Hotel", name = "BookingRuleBase")
    public JAXBElement<BookingRuleBase> createBookingRuleBase(BookingRuleBase value) {
        return new JAXBElement<BookingRuleBase>(_BookingRuleBase_QNAME, BookingRuleBase.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RatePlanForRoomtype }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.DataAccess.Hotel", name = "RatePlanForRoomtype")
    public JAXBElement<RatePlanForRoomtype> createRatePlanForRoomtype(RatePlanForRoomtype value) {
        return new JAXBElement<RatePlanForRoomtype>(_RatePlanForRoomtype_QNAME, RatePlanForRoomtype.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAddValueInfoSimple }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.DataAccess.Hotel", name = "ArrayOfAddValueInfoSimple")
    public JAXBElement<ArrayOfAddValueInfoSimple> createArrayOfAddValueInfoSimple(ArrayOfAddValueInfoSimple value) {
        return new JAXBElement<ArrayOfAddValueInfoSimple>(_ArrayOfAddValueInfoSimple_QNAME, ArrayOfAddValueInfoSimple.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddValueInfoSimple }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.DataAccess.Hotel", name = "AddValueInfoSimple")
    public JAXBElement<AddValueInfoSimple> createAddValueInfoSimple(AddValueInfoSimple value) {
        return new JAXBElement<AddValueInfoSimple>(_AddValueInfoSimple_QNAME, AddValueInfoSimple.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HotelNorthBoundOrders }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.DataAccess.Hotel", name = "HotelNorthBoundOrders")
    public JAXBElement<HotelNorthBoundOrders> createHotelNorthBoundOrders(HotelNorthBoundOrders value) {
        return new JAXBElement<HotelNorthBoundOrders>(_HotelNorthBoundOrders_QNAME, HotelNorthBoundOrders.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfGeoInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.DataAccess.Hotel", name = "ArrayOfGeo_Info")
    public JAXBElement<ArrayOfGeoInfo> createArrayOfGeoInfo(ArrayOfGeoInfo value) {
        return new JAXBElement<ArrayOfGeoInfo>(_ArrayOfGeoInfo_QNAME, ArrayOfGeoInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GeoInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.DataAccess.Hotel", name = "Geo_Info")
    public JAXBElement<GeoInfo> createGeoInfo(GeoInfo value) {
        return new JAXBElement<GeoInfo>(_GeoInfo_QNAME, GeoInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfGeoDetailInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.DataAccess.Hotel", name = "ArrayOfGeoDetail_Info")
    public JAXBElement<ArrayOfGeoDetailInfo> createArrayOfGeoDetailInfo(ArrayOfGeoDetailInfo value) {
        return new JAXBElement<ArrayOfGeoDetailInfo>(_ArrayOfGeoDetailInfo_QNAME, ArrayOfGeoDetailInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GeoDetailInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.DataAccess.Hotel", name = "GeoDetail_Info")
    public JAXBElement<GeoDetailInfo> createGeoDetailInfo(GeoDetailInfo value) {
        return new JAXBElement<GeoDetailInfo>(_GeoDetailInfo_QNAME, GeoDetailInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfResourceInventoryStateChangeRecord }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.DataAccess.Hotel", name = "ArrayOfResourceInventoryStateChangeRecord")
    public JAXBElement<ArrayOfResourceInventoryStateChangeRecord> createArrayOfResourceInventoryStateChangeRecord(ArrayOfResourceInventoryStateChangeRecord value) {
        return new JAXBElement<ArrayOfResourceInventoryStateChangeRecord>(_ArrayOfResourceInventoryStateChangeRecord_QNAME, ArrayOfResourceInventoryStateChangeRecord.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResourceInventoryStateChangeRecord }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.DataAccess.Hotel", name = "ResourceInventoryStateChangeRecord")
    public JAXBElement<ResourceInventoryStateChangeRecord> createResourceInventoryStateChangeRecord(ResourceInventoryStateChangeRecord value) {
        return new JAXBElement<ResourceInventoryStateChangeRecord>(_ResourceInventoryStateChangeRecord_QNAME, ResourceInventoryStateChangeRecord.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPriceInfoChangeRecord }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.DataAccess.Hotel", name = "ArrayOfPriceInfoChangeRecord")
    public JAXBElement<ArrayOfPriceInfoChangeRecord> createArrayOfPriceInfoChangeRecord(ArrayOfPriceInfoChangeRecord value) {
        return new JAXBElement<ArrayOfPriceInfoChangeRecord>(_ArrayOfPriceInfoChangeRecord_QNAME, ArrayOfPriceInfoChangeRecord.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PriceInfoChangeRecord }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.DataAccess.Hotel", name = "PriceInfoChangeRecord")
    public JAXBElement<PriceInfoChangeRecord> createPriceInfoChangeRecord(PriceInfoChangeRecord value) {
        return new JAXBElement<PriceInfoChangeRecord>(_PriceInfoChangeRecord_QNAME, PriceInfoChangeRecord.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfReservationChangeRecord }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.DataAccess.Hotel", name = "ArrayOfReservationChangeRecord")
    public JAXBElement<ArrayOfReservationChangeRecord> createArrayOfReservationChangeRecord(ArrayOfReservationChangeRecord value) {
        return new JAXBElement<ArrayOfReservationChangeRecord>(_ArrayOfReservationChangeRecord_QNAME, ArrayOfReservationChangeRecord.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReservationChangeRecord }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.DataAccess.Hotel", name = "ReservationChangeRecord")
    public JAXBElement<ReservationChangeRecord> createReservationChangeRecord(ReservationChangeRecord value) {
        return new JAXBElement<ReservationChangeRecord>(_ReservationChangeRecord_QNAME, ReservationChangeRecord.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReservationExtendInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.DataAccess.Hotel", name = "ReservationExtendInfo")
    public JAXBElement<ReservationExtendInfo> createReservationExtendInfo(ReservationExtendInfo value) {
        return new JAXBElement<ReservationExtendInfo>(_ReservationExtendInfo_QNAME, ReservationExtendInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BStaticInfoSearchRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.DataAccess.Hotel.HotelProductUse", name = "BStaticInfoSearchRequest")
    public JAXBElement<BStaticInfoSearchRequest> createBStaticInfoSearchRequest(BStaticInfoSearchRequest value) {
        return new JAXBElement<BStaticInfoSearchRequest>(_BStaticInfoSearchRequest_QNAME, BStaticInfoSearchRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HotelRatePlanSearchFor114 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.DataAccess.Hotel.HotelProductUse", name = "HotelRatePlanSearchFor114")
    public JAXBElement<HotelRatePlanSearchFor114> createHotelRatePlanSearchFor114(HotelRatePlanSearchFor114 value) {
        return new JAXBElement<HotelRatePlanSearchFor114>(_HotelRatePlanSearchFor114_QNAME, HotelRatePlanSearchFor114 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HotelRatePlanCondition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.DataAccess.Hotel.HotelProductUse", name = "HotelRatePlanCondition")
    public JAXBElement<HotelRatePlanCondition> createHotelRatePlanCondition(HotelRatePlanCondition value) {
        return new JAXBElement<HotelRatePlanCondition>(_HotelRatePlanCondition_QNAME, HotelRatePlanCondition.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Request }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.Domain.Hotel", name = "Request")
    public JAXBElement<Request> createRequest(Request value) {
        return new JAXBElement<Request>(_Request_QNAME, Request.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClientSystemInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.Domain.Hotel", name = "ClientSystemInfo")
    public JAXBElement<ClientSystemInfo> createClientSystemInfo(ClientSystemInfo value) {
        return new JAXBElement<ClientSystemInfo>(_ClientSystemInfo_QNAME, ClientSystemInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.Domain.Hotel", name = "Response")
    public JAXBElement<Response> createResponse(Response value) {
        return new JAXBElement<Response>(_Response_QNAME, Response.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRoomTypeInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.Domain.Hotel", name = "ArrayOfRoomTypeInfo")
    public JAXBElement<ArrayOfRoomTypeInfo> createArrayOfRoomTypeInfo(ArrayOfRoomTypeInfo value) {
        return new JAXBElement<ArrayOfRoomTypeInfo>(_ArrayOfRoomTypeInfo_QNAME, ArrayOfRoomTypeInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RoomTypeInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.Domain.Hotel", name = "RoomTypeInfo")
    public JAXBElement<RoomTypeInfo> createRoomTypeInfo(RoomTypeInfo value) {
        return new JAXBElement<RoomTypeInfo>(_RoomTypeInfo_QNAME, RoomTypeInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RoomNumbers }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.Domain.Hotel", name = "RoomNumbers")
    public JAXBElement<RoomNumbers> createRoomNumbers(RoomNumbers value) {
        return new JAXBElement<RoomNumbers>(_RoomNumbers_QNAME, RoomNumbers.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRoomNumDay }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.Domain.Hotel", name = "ArrayOfRoomNumDay")
    public JAXBElement<ArrayOfRoomNumDay> createArrayOfRoomNumDay(ArrayOfRoomNumDay value) {
        return new JAXBElement<ArrayOfRoomNumDay>(_ArrayOfRoomNumDay_QNAME, ArrayOfRoomNumDay.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RoomNumDay }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.Domain.Hotel", name = "RoomNumDay")
    public JAXBElement<RoomNumDay> createRoomNumDay(RoomNumDay value) {
        return new JAXBElement<RoomNumDay>(_RoomNumDay_QNAME, RoomNumDay.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RoomRate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.Domain.Hotel", name = "RoomRate")
    public JAXBElement<RoomRate> createRoomRate(RoomRate value) {
        return new JAXBElement<RoomRate>(_RoomRate_QNAME, RoomRate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HotelPrice }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.Domain.Hotel", name = "HotelPrice")
    public JAXBElement<HotelPrice> createHotelPrice(HotelPrice value) {
        return new JAXBElement<HotelPrice>(_HotelPrice_QNAME, HotelPrice.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPriceDay }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.Domain.Hotel", name = "ArrayOfPriceDay")
    public JAXBElement<ArrayOfPriceDay> createArrayOfPriceDay(ArrayOfPriceDay value) {
        return new JAXBElement<ArrayOfPriceDay>(_ArrayOfPriceDay_QNAME, ArrayOfPriceDay.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PriceDay }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.Domain.Hotel", name = "PriceDay")
    public JAXBElement<PriceDay> createPriceDay(PriceDay value) {
        return new JAXBElement<PriceDay>(_PriceDay_QNAME, PriceDay.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRatePlanPaymentRule }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.Domain.Hotel", name = "ArrayOfRatePlanPaymentRule")
    public JAXBElement<ArrayOfRatePlanPaymentRule> createArrayOfRatePlanPaymentRule(ArrayOfRatePlanPaymentRule value) {
        return new JAXBElement<ArrayOfRatePlanPaymentRule>(_ArrayOfRatePlanPaymentRule_QNAME, ArrayOfRatePlanPaymentRule.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RatePlanPaymentRule }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.Domain.Hotel", name = "RatePlanPaymentRule")
    public JAXBElement<RatePlanPaymentRule> createRatePlanPaymentRule(RatePlanPaymentRule value) {
        return new JAXBElement<RatePlanPaymentRule>(_RatePlanPaymentRule_QNAME, RatePlanPaymentRule.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfHotelDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.Domain.Hotel", name = "ArrayOfHotelDetail")
    public JAXBElement<ArrayOfHotelDetail> createArrayOfHotelDetail(ArrayOfHotelDetail value) {
        return new JAXBElement<ArrayOfHotelDetail>(_ArrayOfHotelDetail_QNAME, ArrayOfHotelDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HotelDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.Domain.Hotel", name = "HotelDetail")
    public JAXBElement<HotelDetail> createHotelDetail(HotelDetail value) {
        return new JAXBElement<HotelDetail>(_HotelDetail_QNAME, HotelDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HotelInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.Domain.Hotel", name = "HotelInfo")
    public JAXBElement<HotelInfo> createHotelInfo(HotelInfo value) {
        return new JAXBElement<HotelInfo>(_HotelInfo_QNAME, HotelInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfHotelActivity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.Domain.Hotel", name = "ArrayOfHotelActivity")
    public JAXBElement<ArrayOfHotelActivity> createArrayOfHotelActivity(ArrayOfHotelActivity value) {
        return new JAXBElement<ArrayOfHotelActivity>(_ArrayOfHotelActivity_QNAME, ArrayOfHotelActivity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HotelActivity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.Domain.Hotel", name = "HotelActivity")
    public JAXBElement<HotelActivity> createHotelActivity(HotelActivity value) {
        return new JAXBElement<HotelActivity>(_HotelActivity_QNAME, HotelActivity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfHotelInfoForIndex }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.DataAccess.Hotel.Northbound", name = "ArrayOfHotelInfoForIndex")
    public JAXBElement<ArrayOfHotelInfoForIndex> createArrayOfHotelInfoForIndex(ArrayOfHotelInfoForIndex value) {
        return new JAXBElement<ArrayOfHotelInfoForIndex>(_ArrayOfHotelInfoForIndex_QNAME, ArrayOfHotelInfoForIndex.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HotelInfoForIndex }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.DataAccess.Hotel.Northbound", name = "HotelInfoForIndex")
    public JAXBElement<HotelInfoForIndex> createHotelInfoForIndex(HotelInfoForIndex value) {
        return new JAXBElement<HotelInfoForIndex>(_HotelInfoForIndex_QNAME, HotelInfoForIndex.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDictionaryEntry }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/System.Collections", name = "ArrayOfDictionaryEntry")
    public JAXBElement<ArrayOfDictionaryEntry> createArrayOfDictionaryEntry(ArrayOfDictionaryEntry value) {
        return new JAXBElement<ArrayOfDictionaryEntry>(_ArrayOfDictionaryEntry_QNAME, ArrayOfDictionaryEntry.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DictionaryEntry }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/System.Collections", name = "DictionaryEntry")
    public JAXBElement<DictionaryEntry> createDictionaryEntry(DictionaryEntry value) {
        return new JAXBElement<DictionaryEntry>(_DictionaryEntry_QNAME, DictionaryEntry.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnumResponseCode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Com.Elong.Utility.Hotel.Enum", name = "EnumResponseCode")
    public JAXBElement<EnumResponseCode> createEnumResponseCode(EnumResponseCode value) {
        return new JAXBElement<EnumResponseCode>(_EnumResponseCode_QNAME, EnumResponseCode.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ERoomAdditionsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Com.Elong.Utility.Hotel.Enum", name = "ERoomAdditionsType")
    public JAXBElement<ERoomAdditionsType> createERoomAdditionsType(ERoomAdditionsType value) {
        return new JAXBElement<ERoomAdditionsType>(_ERoomAdditionsType_QNAME, ERoomAdditionsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnumDateType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Com.Elong.Utility.Hotel.Enum", name = "EnumDateType")
    public JAXBElement<EnumDateType> createEnumDateType(EnumDateType value) {
        return new JAXBElement<EnumDateType>(_EnumDateType_QNAME, EnumDateType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnumBookRuleForHotel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Com.Elong.Utility.Hotel.Enum", name = "EnumBookRuleForHotel")
    public JAXBElement<EnumBookRuleForHotel> createEnumBookRuleForHotel(EnumBookRuleForHotel value) {
        return new JAXBElement<EnumBookRuleForHotel>(_EnumBookRuleForHotel_QNAME, EnumBookRuleForHotel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnumRoomNumStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Com.Elong.Utility.Hotel.Enum", name = "EnumRoomNumStatus")
    public JAXBElement<EnumRoomNumStatus> createEnumRoomNumStatus(EnumRoomNumStatus value) {
        return new JAXBElement<EnumRoomNumStatus>(_EnumRoomNumStatus_QNAME, EnumRoomNumStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EActionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Com.Elong.Utility.Hotel.Enum", name = "EActionType")
    public JAXBElement<EActionType> createEActionType(EActionType value) {
        return new JAXBElement<EActionType>(_EActionType_QNAME, EActionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EHotelCostType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Com.Elong.Utility.Hotel.Enum", name = "EHotelCostType")
    public JAXBElement<EHotelCostType> createEHotelCostType(EHotelCostType value) {
        return new JAXBElement<EHotelCostType>(_EHotelCostType_QNAME, EHotelCostType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EExclusive }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Com.Elong.Utility.Hotel.Enum", name = "EExclusive")
    public JAXBElement<EExclusive> createEExclusive(EExclusive value) {
        return new JAXBElement<EExclusive>(_EExclusive_QNAME, EExclusive.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EPromotionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Com.Elong.Utility.Hotel.Enum", name = "EPromotionType")
    public JAXBElement<EPromotionType> createEPromotionType(EPromotionType value) {
        return new JAXBElement<EPromotionType>(_EPromotionType_QNAME, EPromotionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnumDRRRule }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Com.Elong.Utility.Hotel.Enum", name = "EnumDRRRule")
    public JAXBElement<EnumDRRRule> createEnumDRRRule(EnumDRRRule value) {
        return new JAXBElement<EnumDRRRule>(_EnumDRRRule_QNAME, EnumDRRRule.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnumFeeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Com.Elong.Utility.Hotel.Enum", name = "EnumFeeType")
    public JAXBElement<EnumFeeType> createEnumFeeType(EnumFeeType value) {
        return new JAXBElement<EnumFeeType>(_EnumFeeType_QNAME, EnumFeeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnumMeasureUnit }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Com.Elong.Utility.Hotel.Enum", name = "EnumMeasureUnit")
    public JAXBElement<EnumMeasureUnit> createEnumMeasureUnit(EnumMeasureUnit value) {
        return new JAXBElement<EnumMeasureUnit>(_EnumMeasureUnit_QNAME, EnumMeasureUnit.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnumCutType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Com.Elong.Utility.Hotel.Enum", name = "EnumCutType")
    public JAXBElement<EnumCutType> createEnumCutType(EnumCutType value) {
        return new JAXBElement<EnumCutType>(_EnumCutType_QNAME, EnumCutType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnumPrepayRule }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Com.Elong.Utility.Hotel.Enum", name = "EnumPrepayRule")
    public JAXBElement<EnumPrepayRule> createEnumPrepayRule(EnumPrepayRule value) {
        return new JAXBElement<EnumPrepayRule>(_EnumPrepayRule_QNAME, EnumPrepayRule.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnumRuleTarget }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Com.Elong.Utility.Hotel.Enum", name = "EnumRuleTarget")
    public JAXBElement<EnumRuleTarget> createEnumRuleTarget(EnumRuleTarget value) {
        return new JAXBElement<EnumRuleTarget>(_EnumRuleTarget_QNAME, EnumRuleTarget.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnumPriceStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Com.Elong.Utility.Hotel.Enum", name = "EnumPriceStatus")
    public JAXBElement<EnumPriceStatus> createEnumPriceStatus(EnumPriceStatus value) {
        return new JAXBElement<EnumPriceStatus>(_EnumPriceStatus_QNAME, EnumPriceStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnumVouchWay }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Com.Elong.Utility.Hotel.Enum", name = "EnumVouchWay")
    public JAXBElement<EnumVouchWay> createEnumVouchWay(EnumVouchWay value) {
        return new JAXBElement<EnumVouchWay>(_EnumVouchWay_QNAME, EnumVouchWay.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnumVouchRule }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Com.Elong.Utility.Hotel.Enum", name = "EnumVouchRule")
    public JAXBElement<EnumVouchRule> createEnumVouchRule(EnumVouchRule value) {
        return new JAXBElement<EnumVouchRule>(_EnumVouchRule_QNAME, EnumVouchRule.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnumVouchMoneyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Com.Elong.Utility.Hotel.Enum", name = "EnumVouchMoneyType")
    public JAXBElement<EnumVouchMoneyType> createEnumVouchMoneyType(EnumVouchMoneyType value) {
        return new JAXBElement<EnumVouchMoneyType>(_EnumVouchMoneyType_QNAME, EnumVouchMoneyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnumPayMentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Com.Elong.Utility.Hotel.Enum", name = "EnumPayMentType")
    public JAXBElement<EnumPayMentType> createEnumPayMentType(EnumPayMentType value) {
        return new JAXBElement<EnumPayMentType>(_EnumPayMentType_QNAME, EnumPayMentType.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link RoomTypeInfoBase }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Contract", name = "RoomTypeInfoBase")
    public JAXBElement<RoomTypeInfoBase> createRoomTypeInfoBase(RoomTypeInfoBase value) {
        return new JAXBElement<RoomTypeInfoBase>(_RoomTypeInfoBase_QNAME, RoomTypeInfoBase.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRoomAdditionDefine }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Contract", name = "ArrayOfRoomAdditionDefine")
    public JAXBElement<ArrayOfRoomAdditionDefine> createArrayOfRoomAdditionDefine(ArrayOfRoomAdditionDefine value) {
        return new JAXBElement<ArrayOfRoomAdditionDefine>(_ArrayOfRoomAdditionDefine_QNAME, ArrayOfRoomAdditionDefine.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RoomAdditionDefine }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Contract", name = "RoomAdditionDefine")
    public JAXBElement<RoomAdditionDefine> createRoomAdditionDefine(RoomAdditionDefine value) {
        return new JAXBElement<RoomAdditionDefine>(_RoomAdditionDefine_QNAME, RoomAdditionDefine.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HotelContent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Contract", name = "HotelContent")
    public JAXBElement<HotelContent> createHotelContent(HotelContent value) {
        return new JAXBElement<HotelContent>(_HotelContent_QNAME, HotelContent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HotelAirportPickUpService }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Contract", name = "HotelAirportPickUpService")
    public JAXBElement<HotelAirportPickUpService> createHotelAirportPickUpService(HotelAirportPickUpService value) {
        return new JAXBElement<HotelAirportPickUpService>(_HotelAirportPickUpService_QNAME, HotelAirportPickUpService.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HotelConferenceAmenities }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Contract", name = "HotelConferenceAmenities")
    public JAXBElement<HotelConferenceAmenities> createHotelConferenceAmenities(HotelConferenceAmenities value) {
        return new JAXBElement<HotelConferenceAmenities>(_HotelConferenceAmenities_QNAME, HotelConferenceAmenities.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfHotelAmenity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Contract", name = "ArrayOfHotelAmenity")
    public JAXBElement<ArrayOfHotelAmenity> createArrayOfHotelAmenity(ArrayOfHotelAmenity value) {
        return new JAXBElement<ArrayOfHotelAmenity>(_ArrayOfHotelAmenity_QNAME, ArrayOfHotelAmenity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HotelAmenity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Contract", name = "HotelAmenity")
    public JAXBElement<HotelAmenity> createHotelAmenity(HotelAmenity value) {
        return new JAXBElement<HotelAmenity>(_HotelAmenity_QNAME, HotelAmenity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfHotelCreditCategory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Contract", name = "ArrayOfHotelCreditCategory")
    public JAXBElement<ArrayOfHotelCreditCategory> createArrayOfHotelCreditCategory(ArrayOfHotelCreditCategory value) {
        return new JAXBElement<ArrayOfHotelCreditCategory>(_ArrayOfHotelCreditCategory_QNAME, ArrayOfHotelCreditCategory.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HotelCreditCategory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Contract", name = "HotelCreditCategory")
    public JAXBElement<HotelCreditCategory> createHotelCreditCategory(HotelCreditCategory value) {
        return new JAXBElement<HotelCreditCategory>(_HotelCreditCategory_QNAME, HotelCreditCategory.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HotelDiningAmenities }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Contract", name = "HotelDiningAmenities")
    public JAXBElement<HotelDiningAmenities> createHotelDiningAmenities(HotelDiningAmenities value) {
        return new JAXBElement<HotelDiningAmenities>(_HotelDiningAmenities_QNAME, HotelDiningAmenities.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HotelfeatureInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Contract", name = "HotelfeatureInfo")
    public JAXBElement<HotelfeatureInfo> createHotelfeatureInfo(HotelfeatureInfo value) {
        return new JAXBElement<HotelfeatureInfo>(_HotelfeatureInfo_QNAME, HotelfeatureInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HotelGeneralAmenities }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Contract", name = "HotelGeneralAmenities")
    public JAXBElement<HotelGeneralAmenities> createHotelGeneralAmenities(HotelGeneralAmenities value) {
        return new JAXBElement<HotelGeneralAmenities>(_HotelGeneralAmenities_QNAME, HotelGeneralAmenities.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfHotelLandMark }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Contract", name = "ArrayOfHotelLandMark")
    public JAXBElement<ArrayOfHotelLandMark> createArrayOfHotelLandMark(ArrayOfHotelLandMark value) {
        return new JAXBElement<ArrayOfHotelLandMark>(_ArrayOfHotelLandMark_QNAME, ArrayOfHotelLandMark.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HotelLandMark }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Contract", name = "HotelLandMark")
    public JAXBElement<HotelLandMark> createHotelLandMark(HotelLandMark value) {
        return new JAXBElement<HotelLandMark>(_HotelLandMark_QNAME, HotelLandMark.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HotelRecreationAmenities }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Contract", name = "HotelRecreationAmenities")
    public JAXBElement<HotelRecreationAmenities> createHotelRecreationAmenities(HotelRecreationAmenities value) {
        return new JAXBElement<HotelRecreationAmenities>(_HotelRecreationAmenities_QNAME, HotelRecreationAmenities.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HotelRoomAmenities }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Contract", name = "HotelRoomAmenities")
    public JAXBElement<HotelRoomAmenities> createHotelRoomAmenities(HotelRoomAmenities value) {
        return new JAXBElement<HotelRoomAmenities>(_HotelRoomAmenities_QNAME, HotelRoomAmenities.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfHotelSurroundingAttractions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Contract", name = "ArrayOfHotelSurroundingAttractions")
    public JAXBElement<ArrayOfHotelSurroundingAttractions> createArrayOfHotelSurroundingAttractions(ArrayOfHotelSurroundingAttractions value) {
        return new JAXBElement<ArrayOfHotelSurroundingAttractions>(_ArrayOfHotelSurroundingAttractions_QNAME, ArrayOfHotelSurroundingAttractions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HotelSurroundingAttractions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Contract", name = "HotelSurroundingAttractions")
    public JAXBElement<HotelSurroundingAttractions> createHotelSurroundingAttractions(HotelSurroundingAttractions value) {
        return new JAXBElement<HotelSurroundingAttractions>(_HotelSurroundingAttractions_QNAME, HotelSurroundingAttractions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfHotelTrafficAndAroundInformation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Contract", name = "ArrayOfHotelTrafficAndAroundInformation")
    public JAXBElement<ArrayOfHotelTrafficAndAroundInformation> createArrayOfHotelTrafficAndAroundInformation(ArrayOfHotelTrafficAndAroundInformation value) {
        return new JAXBElement<ArrayOfHotelTrafficAndAroundInformation>(_ArrayOfHotelTrafficAndAroundInformation_QNAME, ArrayOfHotelTrafficAndAroundInformation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HotelTrafficAndAroundInformation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Contract", name = "HotelTrafficAndAroundInformation")
    public JAXBElement<HotelTrafficAndAroundInformation> createHotelTrafficAndAroundInformation(HotelTrafficAndAroundInformation value) {
        return new JAXBElement<HotelTrafficAndAroundInformation>(_HotelTrafficAndAroundInformation_QNAME, HotelTrafficAndAroundInformation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfHotelAroundInformaiton }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Contract", name = "ArrayOfHotelAroundInformaiton")
    public JAXBElement<ArrayOfHotelAroundInformaiton> createArrayOfHotelAroundInformaiton(ArrayOfHotelAroundInformaiton value) {
        return new JAXBElement<ArrayOfHotelAroundInformaiton>(_ArrayOfHotelAroundInformaiton_QNAME, ArrayOfHotelAroundInformaiton.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HotelAroundInformaiton }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Contract", name = "HotelAroundInformaiton")
    public JAXBElement<HotelAroundInformaiton> createHotelAroundInformaiton(HotelAroundInformaiton value) {
        return new JAXBElement<HotelAroundInformaiton>(_HotelAroundInformaiton_QNAME, HotelAroundInformaiton.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HotelTrafficAndAroundInformations }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Contract", name = "HotelTrafficAndAroundInformations")
    public JAXBElement<HotelTrafficAndAroundInformations> createHotelTrafficAndAroundInformations(HotelTrafficAndAroundInformations value) {
        return new JAXBElement<HotelTrafficAndAroundInformations>(_HotelTrafficAndAroundInformations_QNAME, HotelTrafficAndAroundInformations.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfHotelProductRelation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Contract", name = "ArrayOfHotelProductRelation")
    public JAXBElement<ArrayOfHotelProductRelation> createArrayOfHotelProductRelation(ArrayOfHotelProductRelation value) {
        return new JAXBElement<ArrayOfHotelProductRelation>(_ArrayOfHotelProductRelation_QNAME, ArrayOfHotelProductRelation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HotelProductRelation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Contract", name = "HotelProductRelation")
    public JAXBElement<HotelProductRelation> createHotelProductRelation(HotelProductRelation value) {
        return new JAXBElement<HotelProductRelation>(_HotelProductRelation_QNAME, HotelProductRelation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfHotelTag }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Contract", name = "ArrayOfHotelTag")
    public JAXBElement<ArrayOfHotelTag> createArrayOfHotelTag(ArrayOfHotelTag value) {
        return new JAXBElement<ArrayOfHotelTag>(_ArrayOfHotelTag_QNAME, ArrayOfHotelTag.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HotelTag }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Contract", name = "HotelTag")
    public JAXBElement<HotelTag> createHotelTag(HotelTag value) {
        return new JAXBElement<HotelTag>(_HotelTag_QNAME, HotelTag.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfHotelImage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Contract", name = "ArrayOfHotelImage")
    public JAXBElement<ArrayOfHotelImage> createArrayOfHotelImage(ArrayOfHotelImage value) {
        return new JAXBElement<ArrayOfHotelImage>(_ArrayOfHotelImage_QNAME, ArrayOfHotelImage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HotelImage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Contract", name = "HotelImage")
    public JAXBElement<HotelImage> createHotelImage(HotelImage value) {
        return new JAXBElement<HotelImage>(_HotelImage_QNAME, HotelImage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RackRateChangeDataRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.Domain.Hotel.Message", name = "RackRateChangeDataRequest")
    public JAXBElement<RackRateChangeDataRequest> createRackRateChangeDataRequest(RackRateChangeDataRequest value) {
        return new JAXBElement<RackRateChangeDataRequest>(_RackRateChangeDataRequest_QNAME, RackRateChangeDataRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RackRateChangeDataResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.Domain.Hotel.Message", name = "RackRateChangeDataResponse")
    public JAXBElement<RackRateChangeDataResponse> createRackRateChangeDataResponse(RackRateChangeDataResponse value) {
        return new JAXBElement<RackRateChangeDataResponse>(_RackRateChangeDataResponse_QNAME, RackRateChangeDataResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMSRelationRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.Domain.Hotel.Message", name = "GetMSRelationRequest")
    public JAXBElement<GetMSRelationRequest> createGetMSRelationRequest(GetMSRelationRequest value) {
        return new JAXBElement<GetMSRelationRequest>(_GetMSRelationRequest_QNAME, GetMSRelationRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMSRelationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.Domain.Hotel.Message", name = "GetMSRelationResponse")
    public JAXBElement<GetMSRelationResponse> createGetMSRelationResponse(GetMSRelationResponse value) {
        return new JAXBElement<GetMSRelationResponse>(_GetMSRelationResponse_QNAME, GetMSRelationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InventoryChangeDataRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.Domain.Hotel.Message", name = "InventoryChangeDataRequest")
    public JAXBElement<InventoryChangeDataRequest> createInventoryChangeDataRequest(InventoryChangeDataRequest value) {
        return new JAXBElement<InventoryChangeDataRequest>(_InventoryChangeDataRequest_QNAME, InventoryChangeDataRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InventoryChangeDataResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.Domain.Hotel.Message", name = "InventoryChangeDataResponse")
    public JAXBElement<InventoryChangeDataResponse> createInventoryChangeDataResponse(InventoryChangeDataResponse value) {
        return new JAXBElement<InventoryChangeDataResponse>(_InventoryChangeDataResponse_QNAME, InventoryChangeDataResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PriceInfoChangeDataRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.Domain.Hotel.Message", name = "PriceInfoChangeDataRequest")
    public JAXBElement<PriceInfoChangeDataRequest> createPriceInfoChangeDataRequest(PriceInfoChangeDataRequest value) {
        return new JAXBElement<PriceInfoChangeDataRequest>(_PriceInfoChangeDataRequest_QNAME, PriceInfoChangeDataRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PriceInfoChangeDataResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.Domain.Hotel.Message", name = "PriceInfoChangeDataResponse")
    public JAXBElement<PriceInfoChangeDataResponse> createPriceInfoChangeDataResponse(PriceInfoChangeDataResponse value) {
        return new JAXBElement<PriceInfoChangeDataResponse>(_PriceInfoChangeDataResponse_QNAME, PriceInfoChangeDataResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReserveChangeDataRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.Domain.Hotel.Message", name = "ReserveChangeDataRequest")
    public JAXBElement<ReserveChangeDataRequest> createReserveChangeDataRequest(ReserveChangeDataRequest value) {
        return new JAXBElement<ReserveChangeDataRequest>(_ReserveChangeDataRequest_QNAME, ReserveChangeDataRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReserveChangeDataResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.Domain.Hotel.Message", name = "ReserveChangeDataResponse")
    public JAXBElement<ReserveChangeDataResponse> createReserveChangeDataResponse(ReserveChangeDataResponse value) {
        return new JAXBElement<ReserveChangeDataResponse>(_ReserveChangeDataResponse_QNAME, ReserveChangeDataResponse.class, null, value);
    }

}
