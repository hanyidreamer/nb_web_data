
package com.elong.nb.agent.NorthBoundForAPIService;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.joda.time.DateTime;


/**
 * <p>HotelContent complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="HotelContent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AdditionalStatus" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="Address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AddressEN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AdminAreaID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AgreementEntityID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="AirportPickUpService" type="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Contract}HotelAirportPickUpService" minOccurs="0"/&gt;
 *         &lt;element name="Apartment" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="AreaId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Audit" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" minOccurs="0"/&gt;
 *         &lt;element name="AuditName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AuditingType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="AuthorizeType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="AutoSendFax" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="BankInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BuildGroupCondition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CityId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CommendHotelIDs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ConferenceAmenities" type="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Contract}HotelConferenceAmenities" minOccurs="0"/&gt;
 *         &lt;element name="ConnendHotelIDs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Contacter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CorpGroupID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Credit" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="CreditCard" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CreditCardEn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CreditCategoryList" type="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Contract}ArrayOfHotelCreditCategory" minOccurs="0"/&gt;
 *         &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DateUpdated" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="DecorateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DescriptionEN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DiningAmenities" type="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Contract}HotelDiningAmenities" minOccurs="0"/&gt;
 *         &lt;element name="EbookingUse" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Economic" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="Fax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FeatureInfo" type="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Contract}HotelfeatureInfo" minOccurs="0"/&gt;
 *         &lt;element name="GeneralAmenities" type="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Contract}HotelGeneralAmenities" minOccurs="0"/&gt;
 *         &lt;element name="GeoId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="HotelAmenities" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HotelAmenitiesEn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HotelBrandID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="HotelGroupID" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" minOccurs="0"/&gt;
 *         &lt;element name="HotelId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HotelLandMarksList" type="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Contract}ArrayOfHotelLandMark" minOccurs="0"/&gt;
 *         &lt;element name="HotelName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HotelNameEn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HotelSpecialInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HotelSpecialInfoEndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="HotelSpecialInfoStartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="HotelUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IntroEditorCN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IntroEditorEN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="InventoryUseType" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="IsMultiSupply" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="IsReserve" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IsShadow" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="IsShowOut" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Latitude" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="LobbyFax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LobbyTel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Longitude" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="Meetings" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MeetingsEn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Notes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OpDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="OpenDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="Payment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PhotoUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PostCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PropertyIntro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PropertyIntroEn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PropertyUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Province" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ProvinceID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RealStar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RecommondedHotelComment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RecreationAmenities" type="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Contract}HotelRecreationAmenities" minOccurs="0"/&gt;
 *         &lt;element name="RelationHotelId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Relaxs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RelaxsEn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Restaurants" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RestaurantsEn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RoomAmenitier" type="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Contract}HotelRoomAmenities" minOccurs="0"/&gt;
 *         &lt;element name="RoomAmenities" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RoomAmenitiesEn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SecondName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SecondNameEn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ShadowHotelId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SimpleTraffic" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SimpleTrafficEn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Star" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="StarOut" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="SurroundingAttractionsList" type="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Contract}ArrayOfHotelSurroundingAttractions" minOccurs="0"/&gt;
 *         &lt;element name="SurroundingCommercesList" type="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Contract}ArrayOfHotelTrafficAndAroundInformation" minOccurs="0"/&gt;
 *         &lt;element name="SurroundingRestaurantsList" type="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Contract}ArrayOfHotelAroundInformaiton" minOccurs="0"/&gt;
 *         &lt;element name="SurroundingShopsList" type="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Contract}ArrayOfHotelAroundInformaiton" minOccurs="0"/&gt;
 *         &lt;element name="TrafficAndAroundInformations" type="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Contract}HotelTrafficAndAroundInformations" minOccurs="0"/&gt;
 *         &lt;element name="VirtualOut" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="WeekEndEnd" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="WeekEndSpe" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" minOccurs="0"/&gt;
 *         &lt;element name="WeekEndStart" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HotelContent", namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Contract", propOrder = {
    "additionalStatus",
    "address",
    "addressEN",
    "adminAreaID",
    "agreementEntityID",
    "airportPickUpService",
    "apartment",
    "areaId",
    "audit",
    "auditName",
    "auditingType",
    "authorizeType",
    "autoSendFax",
    "bankInfo",
    "buildGroupCondition",
    "city",
    "cityId",
    "commendHotelIDs",
    "conferenceAmenities",
    "connendHotelIDs",
    "contacter",
    "corpGroupID",
    "country",
    "credit",
    "creditCard",
    "creditCardEn",
    "creditCategoryList",
    "currency",
    "dateUpdated",
    "decorateDate",
    "description",
    "descriptionEN",
    "diningAmenities",
    "ebookingUse",
    "economic",
    "fax",
    "featureInfo",
    "generalAmenities",
    "geoId",
    "hId",
    "hotelAmenities",
    "hotelAmenitiesEn",
    "hotelBrandID",
    "hotelGroupID",
    "hotelId",
    "hotelLandMarksList",
    "hotelName",
    "hotelNameEn",
    "hotelSpecialInfo",
    "hotelSpecialInfoEndDate",
    "hotelSpecialInfoStartDate",
    "hotelUrl",
    "introEditorCN",
    "introEditorEN",
    "inventoryUseType",
    "isMultiSupply",
    "isReserve",
    "isShadow",
    "isShowOut",
    "latitude",
    "lobbyFax",
    "lobbyTel",
    "longitude",
    "meetings",
    "meetingsEn",
    "notes",
    "opDate",
    "openDate",
    "payment",
    "phone",
    "photoUrl",
    "postCode",
    "propertyIntro",
    "propertyIntroEn",
    "propertyUrl",
    "province",
    "provinceID",
    "realStar",
    "recommondedHotelComment",
    "recreationAmenities",
    "relationHotelId",
    "relaxs",
    "relaxsEn",
    "restaurants",
    "restaurantsEn",
    "roomAmenitier",
    "roomAmenities",
    "roomAmenitiesEn",
    "secondName",
    "secondNameEn",
    "shadowHotelId",
    "simpleTraffic",
    "simpleTrafficEn",
    "star",
    "starOut",
    "surroundingAttractionsList",
    "surroundingCommercesList",
    "surroundingRestaurantsList",
    "surroundingShopsList",
    "trafficAndAroundInformations",
    "virtualOut",
    "weekEndEnd",
    "weekEndSpe",
    "weekEndStart"
})
@XmlSeeAlso({
    HotelInfo.class
})
public class HotelContent {

    @XmlElement(name = "AdditionalStatus")
    protected Long additionalStatus;
    @XmlElement(name = "Address", nillable = true)
    protected String address;
    @XmlElement(name = "AddressEN", nillable = true)
    protected String addressEN;
    @XmlElement(name = "AdminAreaID", nillable = true)
    protected String adminAreaID;
    @XmlElement(name = "AgreementEntityID")
    protected Integer agreementEntityID;
    @XmlElement(name = "AirportPickUpService", nillable = true)
    protected HotelAirportPickUpService airportPickUpService;
    @XmlElement(name = "Apartment")
    protected Short apartment;
    @XmlElement(name = "AreaId", nillable = true)
    protected String areaId;
    @XmlElement(name = "Audit")
    @XmlSchemaType(name = "unsignedByte")
    protected Short audit;
    @XmlElement(name = "AuditName", nillable = true)
    protected String auditName;
    @XmlElement(name = "AuditingType")
    protected Integer auditingType;
    @XmlElement(name = "AuthorizeType")
    protected Integer authorizeType;
    @XmlElement(name = "AutoSendFax")
    protected Integer autoSendFax;
    @XmlElement(name = "BankInfo", nillable = true)
    protected String bankInfo;
    @XmlElement(name = "BuildGroupCondition", nillable = true)
    protected String buildGroupCondition;
    @XmlElement(name = "City", nillable = true)
    protected String city;
    @XmlElement(name = "CityId", nillable = true)
    protected String cityId;
    @XmlElement(name = "CommendHotelIDs", nillable = true)
    protected String commendHotelIDs;
    @XmlElement(name = "ConferenceAmenities", nillable = true)
    protected HotelConferenceAmenities conferenceAmenities;
    @XmlElement(name = "ConnendHotelIDs", nillable = true)
    protected String connendHotelIDs;
    @XmlElement(name = "Contacter", nillable = true)
    protected String contacter;
    @XmlElement(name = "CorpGroupID")
    protected Integer corpGroupID;
    @XmlElement(name = "Country", nillable = true)
    protected String country;
    @XmlElement(name = "Credit")
    protected Short credit;
    @XmlElement(name = "CreditCard", nillable = true)
    protected String creditCard;
    @XmlElement(name = "CreditCardEn", nillable = true)
    protected String creditCardEn;
    @XmlElement(name = "CreditCategoryList", nillable = true)
    protected ArrayOfHotelCreditCategory creditCategoryList;
    @XmlElement(name = "Currency", nillable = true)
    protected String currency;
    @XmlElement(name = "DateUpdated", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected DateTime dateUpdated;
    @XmlElement(name = "DecorateDate", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected DateTime decorateDate;
    @XmlElement(name = "Description", nillable = true)
    protected String description;
    @XmlElement(name = "DescriptionEN", nillable = true)
    protected String descriptionEN;
    @XmlElement(name = "DiningAmenities", nillable = true)
    protected HotelDiningAmenities diningAmenities;
    @XmlElement(name = "EbookingUse")
    protected Integer ebookingUse;
    @XmlElement(name = "Economic")
    protected Short economic;
    @XmlElement(name = "Fax", nillable = true)
    protected String fax;
    @XmlElement(name = "FeatureInfo", nillable = true)
    protected HotelfeatureInfo featureInfo;
    @XmlElement(name = "GeneralAmenities", nillable = true)
    protected HotelGeneralAmenities generalAmenities;
    @XmlElement(name = "GeoId", nillable = true)
    protected String geoId;
    @XmlElement(name = "HId")
    protected Integer hId;
    @XmlElement(name = "HotelAmenities", nillable = true)
    protected String hotelAmenities;
    @XmlElement(name = "HotelAmenitiesEn", nillable = true)
    protected String hotelAmenitiesEn;
    @XmlElement(name = "HotelBrandID")
    protected Integer hotelBrandID;
    @XmlElement(name = "HotelGroupID")
    @XmlSchemaType(name = "unsignedByte")
    protected Short hotelGroupID;
    @XmlElement(name = "HotelId", nillable = true)
    protected String hotelId;
    @XmlElement(name = "HotelLandMarksList", nillable = true)
    protected ArrayOfHotelLandMark hotelLandMarksList;
    @XmlElement(name = "HotelName", nillable = true)
    protected String hotelName;
    @XmlElement(name = "HotelNameEn", nillable = true)
    protected String hotelNameEn;
    @XmlElement(name = "HotelSpecialInfo", nillable = true)
    protected String hotelSpecialInfo;
    @XmlElement(name = "HotelSpecialInfoEndDate", type = String.class, nillable = true)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected DateTime hotelSpecialInfoEndDate;
    @XmlElement(name = "HotelSpecialInfoStartDate", type = String.class, nillable = true)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected DateTime hotelSpecialInfoStartDate;
    @XmlElement(name = "HotelUrl", nillable = true)
    protected String hotelUrl;
    @XmlElement(name = "IntroEditorCN", nillable = true)
    protected String introEditorCN;
    @XmlElement(name = "IntroEditorEN", nillable = true)
    protected String introEditorEN;
    @XmlElement(name = "InventoryUseType")
    protected Short inventoryUseType;
    @XmlElement(name = "IsMultiSupply")
    protected Short isMultiSupply;
    @XmlElement(name = "IsReserve", nillable = true)
    protected String isReserve;
    @XmlElement(name = "IsShadow")
    protected Integer isShadow;
    @XmlElement(name = "IsShowOut")
    protected Boolean isShowOut;
    @XmlElement(name = "Latitude")
    protected BigDecimal latitude;
    @XmlElement(name = "LobbyFax", nillable = true)
    protected String lobbyFax;
    @XmlElement(name = "LobbyTel", nillable = true)
    protected String lobbyTel;
    @XmlElement(name = "Longitude")
    protected BigDecimal longitude;
    @XmlElement(name = "Meetings", nillable = true)
    protected String meetings;
    @XmlElement(name = "MeetingsEn", nillable = true)
    protected String meetingsEn;
    @XmlElement(name = "Notes", nillable = true)
    protected String notes;
    @XmlElement(name = "OpDate", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected DateTime opDate;
    @XmlElement(name = "OpenDate", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected DateTime openDate;
    @XmlElement(name = "Payment", nillable = true)
    protected String payment;
    @XmlElement(name = "Phone", nillable = true)
    protected String phone;
    @XmlElement(name = "PhotoUrl", nillable = true)
    protected String photoUrl;
    @XmlElement(name = "PostCode", nillable = true)
    protected String postCode;
    @XmlElement(name = "PropertyIntro", nillable = true)
    protected String propertyIntro;
    @XmlElement(name = "PropertyIntroEn", nillable = true)
    protected String propertyIntroEn;
    @XmlElement(name = "PropertyUrl", nillable = true)
    protected String propertyUrl;
    @XmlElement(name = "Province", nillable = true)
    protected String province;
    @XmlElement(name = "ProvinceID", nillable = true)
    protected String provinceID;
    @XmlElement(name = "RealStar", nillable = true)
    protected String realStar;
    @XmlElement(name = "RecommondedHotelComment", nillable = true)
    protected String recommondedHotelComment;
    @XmlElement(name = "RecreationAmenities", nillable = true)
    protected HotelRecreationAmenities recreationAmenities;
    @XmlElement(name = "RelationHotelId", nillable = true)
    protected String relationHotelId;
    @XmlElement(name = "Relaxs", nillable = true)
    protected String relaxs;
    @XmlElement(name = "RelaxsEn", nillable = true)
    protected String relaxsEn;
    @XmlElement(name = "Restaurants", nillable = true)
    protected String restaurants;
    @XmlElement(name = "RestaurantsEn", nillable = true)
    protected String restaurantsEn;
    @XmlElement(name = "RoomAmenitier", nillable = true)
    protected HotelRoomAmenities roomAmenitier;
    @XmlElement(name = "RoomAmenities", nillable = true)
    protected String roomAmenities;
    @XmlElement(name = "RoomAmenitiesEn", nillable = true)
    protected String roomAmenitiesEn;
    @XmlElement(name = "SecondName", nillable = true)
    protected String secondName;
    @XmlElement(name = "SecondNameEn", nillable = true)
    protected String secondNameEn;
    @XmlElement(name = "ShadowHotelId", nillable = true)
    protected String shadowHotelId;
    @XmlElement(name = "SimpleTraffic", nillable = true)
    protected String simpleTraffic;
    @XmlElement(name = "SimpleTrafficEn", nillable = true)
    protected String simpleTrafficEn;
    @XmlElement(name = "Star")
    protected Short star;
    @XmlElement(name = "StarOut")
    protected Short starOut;
    @XmlElement(name = "SurroundingAttractionsList", nillable = true)
    protected ArrayOfHotelSurroundingAttractions surroundingAttractionsList;
    @XmlElement(name = "SurroundingCommercesList", nillable = true)
    protected ArrayOfHotelTrafficAndAroundInformation surroundingCommercesList;
    @XmlElement(name = "SurroundingRestaurantsList", nillable = true)
    protected ArrayOfHotelAroundInformaiton surroundingRestaurantsList;
    @XmlElement(name = "SurroundingShopsList", nillable = true)
    protected ArrayOfHotelAroundInformaiton surroundingShopsList;
    @XmlElement(name = "TrafficAndAroundInformations", nillable = true)
    protected HotelTrafficAndAroundInformations trafficAndAroundInformations;
    @XmlElement(name = "VirtualOut")
    protected Integer virtualOut;
    @XmlElement(name = "WeekEndEnd")
    protected Short weekEndEnd;
    @XmlElement(name = "WeekEndSpe")
    @XmlSchemaType(name = "unsignedByte")
    protected Short weekEndSpe;
    @XmlElement(name = "WeekEndStart")
    protected Short weekEndStart;

    /**
     * 获取additionalStatus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAdditionalStatus() {
        return additionalStatus;
    }

    /**
     * 设置additionalStatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAdditionalStatus(Long value) {
        this.additionalStatus = value;
    }

    /**
     * 获取address属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置address属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress(String value) {
        this.address = value;
    }

    /**
     * 获取addressEN属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressEN() {
        return addressEN;
    }

    /**
     * 设置addressEN属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressEN(String value) {
        this.addressEN = value;
    }

    /**
     * 获取adminAreaID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdminAreaID() {
        return adminAreaID;
    }

    /**
     * 设置adminAreaID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdminAreaID(String value) {
        this.adminAreaID = value;
    }

    /**
     * 获取agreementEntityID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAgreementEntityID() {
        return agreementEntityID;
    }

    /**
     * 设置agreementEntityID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAgreementEntityID(Integer value) {
        this.agreementEntityID = value;
    }

    /**
     * 获取airportPickUpService属性的值。
     * 
     * @return
     *     possible object is
     *     {@link HotelAirportPickUpService }
     *     
     */
    public HotelAirportPickUpService getAirportPickUpService() {
        return airportPickUpService;
    }

    /**
     * 设置airportPickUpService属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link HotelAirportPickUpService }
     *     
     */
    public void setAirportPickUpService(HotelAirportPickUpService value) {
        this.airportPickUpService = value;
    }

    /**
     * 获取apartment属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getApartment() {
        return apartment;
    }

    /**
     * 设置apartment属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setApartment(Short value) {
        this.apartment = value;
    }

    /**
     * 获取areaId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAreaId() {
        return areaId;
    }

    /**
     * 设置areaId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAreaId(String value) {
        this.areaId = value;
    }

    /**
     * 获取audit属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getAudit() {
        return audit;
    }

    /**
     * 设置audit属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setAudit(Short value) {
        this.audit = value;
    }

    /**
     * 获取auditName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuditName() {
        return auditName;
    }

    /**
     * 设置auditName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuditName(String value) {
        this.auditName = value;
    }

    /**
     * 获取auditingType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAuditingType() {
        return auditingType;
    }

    /**
     * 设置auditingType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAuditingType(Integer value) {
        this.auditingType = value;
    }

    /**
     * 获取authorizeType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAuthorizeType() {
        return authorizeType;
    }

    /**
     * 设置authorizeType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAuthorizeType(Integer value) {
        this.authorizeType = value;
    }

    /**
     * 获取autoSendFax属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAutoSendFax() {
        return autoSendFax;
    }

    /**
     * 设置autoSendFax属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAutoSendFax(Integer value) {
        this.autoSendFax = value;
    }

    /**
     * 获取bankInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankInfo() {
        return bankInfo;
    }

    /**
     * 设置bankInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankInfo(String value) {
        this.bankInfo = value;
    }

    /**
     * 获取buildGroupCondition属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuildGroupCondition() {
        return buildGroupCondition;
    }

    /**
     * 设置buildGroupCondition属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuildGroupCondition(String value) {
        this.buildGroupCondition = value;
    }

    /**
     * 获取city属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * 设置city属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * 获取cityId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCityId() {
        return cityId;
    }

    /**
     * 设置cityId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCityId(String value) {
        this.cityId = value;
    }

    /**
     * 获取commendHotelIDs属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommendHotelIDs() {
        return commendHotelIDs;
    }

    /**
     * 设置commendHotelIDs属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommendHotelIDs(String value) {
        this.commendHotelIDs = value;
    }

    /**
     * 获取conferenceAmenities属性的值。
     * 
     * @return
     *     possible object is
     *     {@link HotelConferenceAmenities }
     *     
     */
    public HotelConferenceAmenities getConferenceAmenities() {
        return conferenceAmenities;
    }

    /**
     * 设置conferenceAmenities属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link HotelConferenceAmenities }
     *     
     */
    public void setConferenceAmenities(HotelConferenceAmenities value) {
        this.conferenceAmenities = value;
    }

    /**
     * 获取connendHotelIDs属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConnendHotelIDs() {
        return connendHotelIDs;
    }

    /**
     * 设置connendHotelIDs属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConnendHotelIDs(String value) {
        this.connendHotelIDs = value;
    }

    /**
     * 获取contacter属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContacter() {
        return contacter;
    }

    /**
     * 设置contacter属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContacter(String value) {
        this.contacter = value;
    }

    /**
     * 获取corpGroupID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCorpGroupID() {
        return corpGroupID;
    }

    /**
     * 设置corpGroupID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCorpGroupID(Integer value) {
        this.corpGroupID = value;
    }

    /**
     * 获取country属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * 设置country属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
    }

    /**
     * 获取credit属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getCredit() {
        return credit;
    }

    /**
     * 设置credit属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setCredit(Short value) {
        this.credit = value;
    }

    /**
     * 获取creditCard属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditCard() {
        return creditCard;
    }

    /**
     * 设置creditCard属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditCard(String value) {
        this.creditCard = value;
    }

    /**
     * 获取creditCardEn属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditCardEn() {
        return creditCardEn;
    }

    /**
     * 设置creditCardEn属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditCardEn(String value) {
        this.creditCardEn = value;
    }

    /**
     * 获取creditCategoryList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfHotelCreditCategory }
     *     
     */
    public ArrayOfHotelCreditCategory getCreditCategoryList() {
        return creditCategoryList;
    }

    /**
     * 设置creditCategoryList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfHotelCreditCategory }
     *     
     */
    public void setCreditCategoryList(ArrayOfHotelCreditCategory value) {
        this.creditCategoryList = value;
    }

    /**
     * 获取currency属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * 设置currency属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrency(String value) {
        this.currency = value;
    }

    /**
     * 获取dateUpdated属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public DateTime getDateUpdated() {
        return dateUpdated;
    }

    /**
     * 设置dateUpdated属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateUpdated(DateTime value) {
        this.dateUpdated = value;
    }

    /**
     * 获取decorateDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public DateTime getDecorateDate() {
        return decorateDate;
    }

    /**
     * 设置decorateDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDecorateDate(DateTime value) {
        this.decorateDate = value;
    }

    /**
     * 获取description属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置description属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * 获取descriptionEN属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescriptionEN() {
        return descriptionEN;
    }

    /**
     * 设置descriptionEN属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescriptionEN(String value) {
        this.descriptionEN = value;
    }

    /**
     * 获取diningAmenities属性的值。
     * 
     * @return
     *     possible object is
     *     {@link HotelDiningAmenities }
     *     
     */
    public HotelDiningAmenities getDiningAmenities() {
        return diningAmenities;
    }

    /**
     * 设置diningAmenities属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link HotelDiningAmenities }
     *     
     */
    public void setDiningAmenities(HotelDiningAmenities value) {
        this.diningAmenities = value;
    }

    /**
     * 获取ebookingUse属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEbookingUse() {
        return ebookingUse;
    }

    /**
     * 设置ebookingUse属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEbookingUse(Integer value) {
        this.ebookingUse = value;
    }

    /**
     * 获取economic属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getEconomic() {
        return economic;
    }

    /**
     * 设置economic属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setEconomic(Short value) {
        this.economic = value;
    }

    /**
     * 获取fax属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFax() {
        return fax;
    }

    /**
     * 设置fax属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFax(String value) {
        this.fax = value;
    }

    /**
     * 获取featureInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link HotelfeatureInfo }
     *     
     */
    public HotelfeatureInfo getFeatureInfo() {
        return featureInfo;
    }

    /**
     * 设置featureInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link HotelfeatureInfo }
     *     
     */
    public void setFeatureInfo(HotelfeatureInfo value) {
        this.featureInfo = value;
    }

    /**
     * 获取generalAmenities属性的值。
     * 
     * @return
     *     possible object is
     *     {@link HotelGeneralAmenities }
     *     
     */
    public HotelGeneralAmenities getGeneralAmenities() {
        return generalAmenities;
    }

    /**
     * 设置generalAmenities属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link HotelGeneralAmenities }
     *     
     */
    public void setGeneralAmenities(HotelGeneralAmenities value) {
        this.generalAmenities = value;
    }

    /**
     * 获取geoId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeoId() {
        return geoId;
    }

    /**
     * 设置geoId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeoId(String value) {
        this.geoId = value;
    }

    /**
     * 获取hId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHId() {
        return hId;
    }

    /**
     * 设置hId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHId(Integer value) {
        this.hId = value;
    }

    /**
     * 获取hotelAmenities属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHotelAmenities() {
        return hotelAmenities;
    }

    /**
     * 设置hotelAmenities属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHotelAmenities(String value) {
        this.hotelAmenities = value;
    }

    /**
     * 获取hotelAmenitiesEn属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHotelAmenitiesEn() {
        return hotelAmenitiesEn;
    }

    /**
     * 设置hotelAmenitiesEn属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHotelAmenitiesEn(String value) {
        this.hotelAmenitiesEn = value;
    }

    /**
     * 获取hotelBrandID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHotelBrandID() {
        return hotelBrandID;
    }

    /**
     * 设置hotelBrandID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHotelBrandID(Integer value) {
        this.hotelBrandID = value;
    }

    /**
     * 获取hotelGroupID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getHotelGroupID() {
        return hotelGroupID;
    }

    /**
     * 设置hotelGroupID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setHotelGroupID(Short value) {
        this.hotelGroupID = value;
    }

    /**
     * 获取hotelId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHotelId() {
        return hotelId;
    }

    /**
     * 设置hotelId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHotelId(String value) {
        this.hotelId = value;
    }

    /**
     * 获取hotelLandMarksList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfHotelLandMark }
     *     
     */
    public ArrayOfHotelLandMark getHotelLandMarksList() {
        return hotelLandMarksList;
    }

    /**
     * 设置hotelLandMarksList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfHotelLandMark }
     *     
     */
    public void setHotelLandMarksList(ArrayOfHotelLandMark value) {
        this.hotelLandMarksList = value;
    }

    /**
     * 获取hotelName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHotelName() {
        return hotelName;
    }

    /**
     * 设置hotelName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHotelName(String value) {
        this.hotelName = value;
    }

    /**
     * 获取hotelNameEn属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHotelNameEn() {
        return hotelNameEn;
    }

    /**
     * 设置hotelNameEn属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHotelNameEn(String value) {
        this.hotelNameEn = value;
    }

    /**
     * 获取hotelSpecialInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHotelSpecialInfo() {
        return hotelSpecialInfo;
    }

    /**
     * 设置hotelSpecialInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHotelSpecialInfo(String value) {
        this.hotelSpecialInfo = value;
    }

    /**
     * 获取hotelSpecialInfoEndDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public DateTime getHotelSpecialInfoEndDate() {
        return hotelSpecialInfoEndDate;
    }

    /**
     * 设置hotelSpecialInfoEndDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHotelSpecialInfoEndDate(DateTime value) {
        this.hotelSpecialInfoEndDate = value;
    }

    /**
     * 获取hotelSpecialInfoStartDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public DateTime getHotelSpecialInfoStartDate() {
        return hotelSpecialInfoStartDate;
    }

    /**
     * 设置hotelSpecialInfoStartDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHotelSpecialInfoStartDate(DateTime value) {
        this.hotelSpecialInfoStartDate = value;
    }

    /**
     * 获取hotelUrl属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHotelUrl() {
        return hotelUrl;
    }

    /**
     * 设置hotelUrl属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHotelUrl(String value) {
        this.hotelUrl = value;
    }

    /**
     * 获取introEditorCN属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntroEditorCN() {
        return introEditorCN;
    }

    /**
     * 设置introEditorCN属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntroEditorCN(String value) {
        this.introEditorCN = value;
    }

    /**
     * 获取introEditorEN属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntroEditorEN() {
        return introEditorEN;
    }

    /**
     * 设置introEditorEN属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntroEditorEN(String value) {
        this.introEditorEN = value;
    }

    /**
     * 获取inventoryUseType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getInventoryUseType() {
        return inventoryUseType;
    }

    /**
     * 设置inventoryUseType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setInventoryUseType(Short value) {
        this.inventoryUseType = value;
    }

    /**
     * 获取isMultiSupply属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getIsMultiSupply() {
        return isMultiSupply;
    }

    /**
     * 设置isMultiSupply属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setIsMultiSupply(Short value) {
        this.isMultiSupply = value;
    }

    /**
     * 获取isReserve属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsReserve() {
        return isReserve;
    }

    /**
     * 设置isReserve属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsReserve(String value) {
        this.isReserve = value;
    }

    /**
     * 获取isShadow属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIsShadow() {
        return isShadow;
    }

    /**
     * 设置isShadow属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIsShadow(Integer value) {
        this.isShadow = value;
    }

    /**
     * 获取isShowOut属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsShowOut() {
        return isShowOut;
    }

    /**
     * 设置isShowOut属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsShowOut(Boolean value) {
        this.isShowOut = value;
    }

    /**
     * 获取latitude属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLatitude() {
        return latitude;
    }

    /**
     * 设置latitude属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLatitude(BigDecimal value) {
        this.latitude = value;
    }

    /**
     * 获取lobbyFax属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLobbyFax() {
        return lobbyFax;
    }

    /**
     * 设置lobbyFax属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLobbyFax(String value) {
        this.lobbyFax = value;
    }

    /**
     * 获取lobbyTel属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLobbyTel() {
        return lobbyTel;
    }

    /**
     * 设置lobbyTel属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLobbyTel(String value) {
        this.lobbyTel = value;
    }

    /**
     * 获取longitude属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLongitude() {
        return longitude;
    }

    /**
     * 设置longitude属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLongitude(BigDecimal value) {
        this.longitude = value;
    }

    /**
     * 获取meetings属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeetings() {
        return meetings;
    }

    /**
     * 设置meetings属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeetings(String value) {
        this.meetings = value;
    }

    /**
     * 获取meetingsEn属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeetingsEn() {
        return meetingsEn;
    }

    /**
     * 设置meetingsEn属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeetingsEn(String value) {
        this.meetingsEn = value;
    }

    /**
     * 获取notes属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotes() {
        return notes;
    }

    /**
     * 设置notes属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotes(String value) {
        this.notes = value;
    }

    /**
     * 获取opDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public DateTime getOpDate() {
        return opDate;
    }

    /**
     * 设置opDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpDate(DateTime value) {
        this.opDate = value;
    }

    /**
     * 获取openDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public DateTime getOpenDate() {
        return openDate;
    }

    /**
     * 设置openDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpenDate(DateTime value) {
        this.openDate = value;
    }

    /**
     * 获取payment属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayment() {
        return payment;
    }

    /**
     * 设置payment属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayment(String value) {
        this.payment = value;
    }

    /**
     * 获取phone属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置phone属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhone(String value) {
        this.phone = value;
    }

    /**
     * 获取photoUrl属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhotoUrl() {
        return photoUrl;
    }

    /**
     * 设置photoUrl属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhotoUrl(String value) {
        this.photoUrl = value;
    }

    /**
     * 获取postCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostCode() {
        return postCode;
    }

    /**
     * 设置postCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostCode(String value) {
        this.postCode = value;
    }

    /**
     * 获取propertyIntro属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPropertyIntro() {
        return propertyIntro;
    }

    /**
     * 设置propertyIntro属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPropertyIntro(String value) {
        this.propertyIntro = value;
    }

    /**
     * 获取propertyIntroEn属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPropertyIntroEn() {
        return propertyIntroEn;
    }

    /**
     * 设置propertyIntroEn属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPropertyIntroEn(String value) {
        this.propertyIntroEn = value;
    }

    /**
     * 获取propertyUrl属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPropertyUrl() {
        return propertyUrl;
    }

    /**
     * 设置propertyUrl属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPropertyUrl(String value) {
        this.propertyUrl = value;
    }

    /**
     * 获取province属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvince() {
        return province;
    }

    /**
     * 设置province属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvince(String value) {
        this.province = value;
    }

    /**
     * 获取provinceID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvinceID() {
        return provinceID;
    }

    /**
     * 设置provinceID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvinceID(String value) {
        this.provinceID = value;
    }

    /**
     * 获取realStar属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRealStar() {
        return realStar;
    }

    /**
     * 设置realStar属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRealStar(String value) {
        this.realStar = value;
    }

    /**
     * 获取recommondedHotelComment属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecommondedHotelComment() {
        return recommondedHotelComment;
    }

    /**
     * 设置recommondedHotelComment属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecommondedHotelComment(String value) {
        this.recommondedHotelComment = value;
    }

    /**
     * 获取recreationAmenities属性的值。
     * 
     * @return
     *     possible object is
     *     {@link HotelRecreationAmenities }
     *     
     */
    public HotelRecreationAmenities getRecreationAmenities() {
        return recreationAmenities;
    }

    /**
     * 设置recreationAmenities属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link HotelRecreationAmenities }
     *     
     */
    public void setRecreationAmenities(HotelRecreationAmenities value) {
        this.recreationAmenities = value;
    }

    /**
     * 获取relationHotelId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelationHotelId() {
        return relationHotelId;
    }

    /**
     * 设置relationHotelId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelationHotelId(String value) {
        this.relationHotelId = value;
    }

    /**
     * 获取relaxs属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelaxs() {
        return relaxs;
    }

    /**
     * 设置relaxs属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelaxs(String value) {
        this.relaxs = value;
    }

    /**
     * 获取relaxsEn属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelaxsEn() {
        return relaxsEn;
    }

    /**
     * 设置relaxsEn属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelaxsEn(String value) {
        this.relaxsEn = value;
    }

    /**
     * 获取restaurants属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRestaurants() {
        return restaurants;
    }

    /**
     * 设置restaurants属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRestaurants(String value) {
        this.restaurants = value;
    }

    /**
     * 获取restaurantsEn属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRestaurantsEn() {
        return restaurantsEn;
    }

    /**
     * 设置restaurantsEn属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRestaurantsEn(String value) {
        this.restaurantsEn = value;
    }

    /**
     * 获取roomAmenitier属性的值。
     * 
     * @return
     *     possible object is
     *     {@link HotelRoomAmenities }
     *     
     */
    public HotelRoomAmenities getRoomAmenitier() {
        return roomAmenitier;
    }

    /**
     * 设置roomAmenitier属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link HotelRoomAmenities }
     *     
     */
    public void setRoomAmenitier(HotelRoomAmenities value) {
        this.roomAmenitier = value;
    }

    /**
     * 获取roomAmenities属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomAmenities() {
        return roomAmenities;
    }

    /**
     * 设置roomAmenities属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomAmenities(String value) {
        this.roomAmenities = value;
    }

    /**
     * 获取roomAmenitiesEn属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomAmenitiesEn() {
        return roomAmenitiesEn;
    }

    /**
     * 设置roomAmenitiesEn属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomAmenitiesEn(String value) {
        this.roomAmenitiesEn = value;
    }

    /**
     * 获取secondName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondName() {
        return secondName;
    }

    /**
     * 设置secondName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondName(String value) {
        this.secondName = value;
    }

    /**
     * 获取secondNameEn属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondNameEn() {
        return secondNameEn;
    }

    /**
     * 设置secondNameEn属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondNameEn(String value) {
        this.secondNameEn = value;
    }

    /**
     * 获取shadowHotelId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShadowHotelId() {
        return shadowHotelId;
    }

    /**
     * 设置shadowHotelId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShadowHotelId(String value) {
        this.shadowHotelId = value;
    }

    /**
     * 获取simpleTraffic属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSimpleTraffic() {
        return simpleTraffic;
    }

    /**
     * 设置simpleTraffic属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSimpleTraffic(String value) {
        this.simpleTraffic = value;
    }

    /**
     * 获取simpleTrafficEn属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSimpleTrafficEn() {
        return simpleTrafficEn;
    }

    /**
     * 设置simpleTrafficEn属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSimpleTrafficEn(String value) {
        this.simpleTrafficEn = value;
    }

    /**
     * 获取star属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getStar() {
        return star;
    }

    /**
     * 设置star属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setStar(Short value) {
        this.star = value;
    }

    /**
     * 获取starOut属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getStarOut() {
        return starOut;
    }

    /**
     * 设置starOut属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setStarOut(Short value) {
        this.starOut = value;
    }

    /**
     * 获取surroundingAttractionsList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfHotelSurroundingAttractions }
     *     
     */
    public ArrayOfHotelSurroundingAttractions getSurroundingAttractionsList() {
        return surroundingAttractionsList;
    }

    /**
     * 设置surroundingAttractionsList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfHotelSurroundingAttractions }
     *     
     */
    public void setSurroundingAttractionsList(ArrayOfHotelSurroundingAttractions value) {
        this.surroundingAttractionsList = value;
    }

    /**
     * 获取surroundingCommercesList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfHotelTrafficAndAroundInformation }
     *     
     */
    public ArrayOfHotelTrafficAndAroundInformation getSurroundingCommercesList() {
        return surroundingCommercesList;
    }

    /**
     * 设置surroundingCommercesList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfHotelTrafficAndAroundInformation }
     *     
     */
    public void setSurroundingCommercesList(ArrayOfHotelTrafficAndAroundInformation value) {
        this.surroundingCommercesList = value;
    }

    /**
     * 获取surroundingRestaurantsList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfHotelAroundInformaiton }
     *     
     */
    public ArrayOfHotelAroundInformaiton getSurroundingRestaurantsList() {
        return surroundingRestaurantsList;
    }

    /**
     * 设置surroundingRestaurantsList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfHotelAroundInformaiton }
     *     
     */
    public void setSurroundingRestaurantsList(ArrayOfHotelAroundInformaiton value) {
        this.surroundingRestaurantsList = value;
    }

    /**
     * 获取surroundingShopsList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfHotelAroundInformaiton }
     *     
     */
    public ArrayOfHotelAroundInformaiton getSurroundingShopsList() {
        return surroundingShopsList;
    }

    /**
     * 设置surroundingShopsList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfHotelAroundInformaiton }
     *     
     */
    public void setSurroundingShopsList(ArrayOfHotelAroundInformaiton value) {
        this.surroundingShopsList = value;
    }

    /**
     * 获取trafficAndAroundInformations属性的值。
     * 
     * @return
     *     possible object is
     *     {@link HotelTrafficAndAroundInformations }
     *     
     */
    public HotelTrafficAndAroundInformations getTrafficAndAroundInformations() {
        return trafficAndAroundInformations;
    }

    /**
     * 设置trafficAndAroundInformations属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link HotelTrafficAndAroundInformations }
     *     
     */
    public void setTrafficAndAroundInformations(HotelTrafficAndAroundInformations value) {
        this.trafficAndAroundInformations = value;
    }

    /**
     * 获取virtualOut属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getVirtualOut() {
        return virtualOut;
    }

    /**
     * 设置virtualOut属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setVirtualOut(Integer value) {
        this.virtualOut = value;
    }

    /**
     * 获取weekEndEnd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getWeekEndEnd() {
        return weekEndEnd;
    }

    /**
     * 设置weekEndEnd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setWeekEndEnd(Short value) {
        this.weekEndEnd = value;
    }

    /**
     * 获取weekEndSpe属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getWeekEndSpe() {
        return weekEndSpe;
    }

    /**
     * 设置weekEndSpe属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setWeekEndSpe(Short value) {
        this.weekEndSpe = value;
    }

    /**
     * 获取weekEndStart属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getWeekEndStart() {
        return weekEndStart;
    }

    /**
     * 设置weekEndStart属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setWeekEndStart(Short value) {
        this.weekEndStart = value;
    }

}
