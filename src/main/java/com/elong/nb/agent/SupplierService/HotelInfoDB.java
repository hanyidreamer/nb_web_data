
package com.elong.nb.agent.SupplierService;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.joda.time.DateTime;


/**
 * <p>HotelInfoDB complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="HotelInfoDB">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AdditionalEndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="AdditionalStartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Additional_status" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="Admin_area" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AgreementEntityID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Area_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Audit" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" minOccurs="0"/>
 *         &lt;element name="Audit_g" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="AuditingType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="AuthorizeType" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="Bank_info" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Breakfast" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="C_contacter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="C_fax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="C_phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Cess" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="City_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Commend" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Commendhotel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Contacter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CorpGroupID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Credit" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="Credit_card" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Credit_card_en" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Credit_card_vouch_room_num" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" minOccurs="0"/>
 *         &lt;element name="Credit_card_vouch_time" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Credit_card_vouch_week" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="Decorate_date" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Double_credit" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" minOccurs="0"/>
 *         &lt;element name="Eat_both_price" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Eat_cn_price" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Eat_west_price" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Ebooking_e" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Ebooking_s" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Fax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Feature_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Finance_contacter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Finance_fax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Finance_op_date" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Finance_operator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Finance_phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Group_id" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" minOccurs="0"/>
 *         &lt;element name="HotelBrandID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Hotel_Unique_ID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Hotel_address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Hotel_address_en" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Hotel_amenities" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Hotel_amenities_en" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Hotel_apartment" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="Hotel_economic" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="Hotel_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Hotel_id_b" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Hotel_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Hotel_name_en" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Hotel_type" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="Hotelrec_notes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Intro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Intro_en" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Intro_k" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Intro_k_en" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InventoryUseType" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="IsMultiSupply" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="IsSendVouchFax" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Isreserve" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Isshadow" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Lobby_fax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Meeting" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Meeting_en" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Meeting_size_a" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Meeting_size_b" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Notes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Notes2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Notes3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Notes3_limit" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Notes3_op_date" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Notes3_operator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Objective" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Objective_month" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Op_date" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Open_date" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Operator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Order_id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Order_id_out" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Postcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Present_content" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Present_content_en" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Present_end_date" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Present_start_date" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Price_admin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Province_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Realstar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Relax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Relax_en" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Restaurant" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Restaurant_en" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Room_amenities" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Room_amenities_en" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Room_contact" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Second_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Second_name_en" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Services" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Services_en" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShadowHotelid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Show_logo" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Show_pic" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Star" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="Star_out" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="SubcityID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Sum_night" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SupplierID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Team_no" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" minOccurs="0"/>
 *         &lt;element name="Team_no_g" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Traffic" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Traffic_en" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Week_e" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" minOccurs="0"/>
 *         &lt;element name="Week_s" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" minOccurs="0"/>
 *         &lt;element name="Weekend_end" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="Weekend_spe" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" minOccurs="0"/>
 *         &lt;element name="Weekend_start" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HotelInfoDB", namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model", propOrder = {
    "additionalEndDate",
    "additionalStartDate",
    "additionalStatus",
    "adminArea",
    "agreementEntityID",
    "areaId",
    "audit",
    "auditG",
    "auditingType",
    "authorizeType",
    "bankInfo",
    "breakfast",
    "cContacter",
    "cFax",
    "cPhone",
    "cess",
    "cityId",
    "commend",
    "commendhotel",
    "contacter",
    "corpGroupID",
    "credit",
    "creditCard",
    "creditCardEn",
    "creditCardVouchRoomNum",
    "creditCardVouchTime",
    "creditCardVouchWeek",
    "decorateDate",
    "doubleCredit",
    "eatBothPrice",
    "eatCnPrice",
    "eatWestPrice",
    "ebookingE",
    "ebookingS",
    "email",
    "fax",
    "featureId",
    "financeContacter",
    "financeFax",
    "financeOpDate",
    "financeOperator",
    "financePhone",
    "groupId",
    "hotelBrandID",
    "hotelUniqueID",
    "hotelAddress",
    "hotelAddressEn",
    "hotelAmenities",
    "hotelAmenitiesEn",
    "hotelApartment",
    "hotelEconomic",
    "hotelId",
    "hotelIdB",
    "hotelName",
    "hotelNameEn",
    "hotelType",
    "hotelrecNotes",
    "id",
    "intro",
    "introEn",
    "introK",
    "introKEn",
    "inventoryUseType",
    "isMultiSupply",
    "isSendVouchFax",
    "isreserve",
    "isshadow",
    "lobbyFax",
    "meeting",
    "meetingEn",
    "meetingSizeA",
    "meetingSizeB",
    "notes",
    "notes2",
    "notes3",
    "notes3Limit",
    "notes3OpDate",
    "notes3Operator",
    "objective",
    "objectiveMonth",
    "opDate",
    "openDate",
    "operator",
    "orderId",
    "orderIdOut",
    "phone",
    "postcode",
    "presentContent",
    "presentContentEn",
    "presentEndDate",
    "presentStartDate",
    "priceAdmin",
    "provinceId",
    "realstar",
    "relax",
    "relaxEn",
    "restaurant",
    "restaurantEn",
    "roomAmenities",
    "roomAmenitiesEn",
    "roomContact",
    "secondName",
    "secondNameEn",
    "services",
    "servicesEn",
    "shadowHotelid",
    "showLogo",
    "showPic",
    "star",
    "starOut",
    "subcityID",
    "sumNight",
    "supplierID",
    "teamNo",
    "teamNoG",
    "traffic",
    "trafficEn",
    "url",
    "weekE",
    "weekS",
    "weekendEnd",
    "weekendSpe",
    "weekendStart"
})
public class HotelInfoDB {

    @XmlElement(name = "AdditionalEndDate", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected DateTime additionalEndDate;
    @XmlElement(name = "AdditionalStartDate", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected DateTime additionalStartDate;
    @XmlElement(name = "Additional_status")
    protected Long additionalStatus;
    @XmlElement(name = "Admin_area", nillable = true)
    protected String adminArea;
    @XmlElement(name = "AgreementEntityID")
    protected Integer agreementEntityID;
    @XmlElement(name = "Area_id", nillable = true)
    protected String areaId;
    @XmlElement(name = "Audit")
    @XmlSchemaType(name = "unsignedByte")
    protected Short audit;
    @XmlElement(name = "Audit_g")
    protected Integer auditG;
    @XmlElement(name = "AuditingType")
    protected Integer auditingType;
    @XmlElement(name = "AuthorizeType")
    protected Short authorizeType;
    @XmlElement(name = "Bank_info", nillable = true)
    protected String bankInfo;
    @XmlElement(name = "Breakfast", nillable = true)
    protected String breakfast;
    @XmlElement(name = "C_contacter", nillable = true)
    protected String cContacter;
    @XmlElement(name = "C_fax", nillable = true)
    protected String cFax;
    @XmlElement(name = "C_phone", nillable = true)
    protected String cPhone;
    @XmlElement(name = "Cess")
    protected BigDecimal cess;
    @XmlElement(name = "City_id", nillable = true)
    protected String cityId;
    @XmlElement(name = "Commend", nillable = true)
    protected String commend;
    @XmlElement(name = "Commendhotel", nillable = true)
    protected String commendhotel;
    @XmlElement(name = "Contacter", nillable = true)
    protected String contacter;
    @XmlElement(name = "CorpGroupID")
    protected Integer corpGroupID;
    @XmlElement(name = "Credit")
    protected Short credit;
    @XmlElement(name = "Credit_card", nillable = true)
    protected String creditCard;
    @XmlElement(name = "Credit_card_en", nillable = true)
    protected String creditCardEn;
    @XmlElement(name = "Credit_card_vouch_room_num")
    @XmlSchemaType(name = "unsignedByte")
    protected Short creditCardVouchRoomNum;
    @XmlElement(name = "Credit_card_vouch_time", nillable = true)
    protected String creditCardVouchTime;
    @XmlElement(name = "Credit_card_vouch_week")
    protected Short creditCardVouchWeek;
    @XmlElement(name = "Decorate_date", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected DateTime decorateDate;
    @XmlElement(name = "Double_credit")
    @XmlSchemaType(name = "unsignedByte")
    protected Short doubleCredit;
    @XmlElement(name = "Eat_both_price")
    protected BigDecimal eatBothPrice;
    @XmlElement(name = "Eat_cn_price")
    protected BigDecimal eatCnPrice;
    @XmlElement(name = "Eat_west_price")
    protected BigDecimal eatWestPrice;
    @XmlElement(name = "Ebooking_e", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected DateTime ebookingE;
    @XmlElement(name = "Ebooking_s", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected DateTime ebookingS;
    @XmlElement(name = "Email", nillable = true)
    protected String email;
    @XmlElement(name = "Fax", nillable = true)
    protected String fax;
    @XmlElement(name = "Feature_id", nillable = true)
    protected String featureId;
    @XmlElement(name = "Finance_contacter", nillable = true)
    protected String financeContacter;
    @XmlElement(name = "Finance_fax", nillable = true)
    protected String financeFax;
    @XmlElement(name = "Finance_op_date", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected DateTime financeOpDate;
    @XmlElement(name = "Finance_operator", nillable = true)
    protected String financeOperator;
    @XmlElement(name = "Finance_phone", nillable = true)
    protected String financePhone;
    @XmlElement(name = "Group_id")
    @XmlSchemaType(name = "unsignedByte")
    protected Short groupId;
    @XmlElement(name = "HotelBrandID")
    protected Integer hotelBrandID;
    @XmlElement(name = "Hotel_Unique_ID")
    protected Integer hotelUniqueID;
    @XmlElement(name = "Hotel_address", nillable = true)
    protected String hotelAddress;
    @XmlElement(name = "Hotel_address_en", nillable = true)
    protected String hotelAddressEn;
    @XmlElement(name = "Hotel_amenities", nillable = true)
    protected String hotelAmenities;
    @XmlElement(name = "Hotel_amenities_en", nillable = true)
    protected String hotelAmenitiesEn;
    @XmlElement(name = "Hotel_apartment")
    protected Short hotelApartment;
    @XmlElement(name = "Hotel_economic")
    protected Short hotelEconomic;
    @XmlElement(name = "Hotel_id", nillable = true)
    protected String hotelId;
    @XmlElement(name = "Hotel_id_b", nillable = true)
    protected String hotelIdB;
    @XmlElement(name = "Hotel_name", nillable = true)
    protected String hotelName;
    @XmlElement(name = "Hotel_name_en", nillable = true)
    protected String hotelNameEn;
    @XmlElement(name = "Hotel_type")
    protected Short hotelType;
    @XmlElement(name = "Hotelrec_notes", nillable = true)
    protected String hotelrecNotes;
    @XmlElement(name = "Id")
    protected Integer id;
    @XmlElement(name = "Intro", nillable = true)
    protected String intro;
    @XmlElement(name = "Intro_en", nillable = true)
    protected String introEn;
    @XmlElement(name = "Intro_k", nillable = true)
    protected String introK;
    @XmlElement(name = "Intro_k_en", nillable = true)
    protected String introKEn;
    @XmlElement(name = "InventoryUseType")
    protected Short inventoryUseType;
    @XmlElement(name = "IsMultiSupply")
    protected Short isMultiSupply;
    @XmlElement(name = "IsSendVouchFax")
    protected Integer isSendVouchFax;
    @XmlElement(name = "Isreserve", nillable = true)
    protected String isreserve;
    @XmlElement(name = "Isshadow")
    protected Integer isshadow;
    @XmlElement(name = "Lobby_fax", nillable = true)
    protected String lobbyFax;
    @XmlElement(name = "Meeting", nillable = true)
    protected String meeting;
    @XmlElement(name = "Meeting_en", nillable = true)
    protected String meetingEn;
    @XmlElement(name = "Meeting_size_a")
    protected Integer meetingSizeA;
    @XmlElement(name = "Meeting_size_b")
    protected Integer meetingSizeB;
    @XmlElement(name = "Notes", nillable = true)
    protected String notes;
    @XmlElement(name = "Notes2", nillable = true)
    protected String notes2;
    @XmlElement(name = "Notes3", nillable = true)
    protected String notes3;
    @XmlElement(name = "Notes3_limit", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected DateTime notes3Limit;
    @XmlElement(name = "Notes3_op_date", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected DateTime notes3OpDate;
    @XmlElement(name = "Notes3_operator", nillable = true)
    protected String notes3Operator;
    @XmlElement(name = "Objective")
    protected Integer objective;
    @XmlElement(name = "Objective_month", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected DateTime objectiveMonth;
    @XmlElement(name = "Op_date", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected DateTime opDate;
    @XmlElement(name = "Open_date", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected DateTime openDate;
    @XmlElement(name = "Operator", nillable = true)
    protected String operator;
    @XmlElement(name = "Order_id")
    protected Integer orderId;
    @XmlElement(name = "Order_id_out")
    protected Integer orderIdOut;
    @XmlElement(name = "Phone", nillable = true)
    protected String phone;
    @XmlElement(name = "Postcode", nillable = true)
    protected String postcode;
    @XmlElement(name = "Present_content", nillable = true)
    protected String presentContent;
    @XmlElement(name = "Present_content_en", nillable = true)
    protected String presentContentEn;
    @XmlElement(name = "Present_end_date", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected DateTime presentEndDate;
    @XmlElement(name = "Present_start_date", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected DateTime presentStartDate;
    @XmlElement(name = "Price_admin", nillable = true)
    protected String priceAdmin;
    @XmlElement(name = "Province_id", nillable = true)
    protected String provinceId;
    @XmlElement(name = "Realstar", nillable = true)
    protected String realstar;
    @XmlElement(name = "Relax", nillable = true)
    protected String relax;
    @XmlElement(name = "Relax_en", nillable = true)
    protected String relaxEn;
    @XmlElement(name = "Restaurant", nillable = true)
    protected String restaurant;
    @XmlElement(name = "Restaurant_en", nillable = true)
    protected String restaurantEn;
    @XmlElement(name = "Room_amenities", nillable = true)
    protected String roomAmenities;
    @XmlElement(name = "Room_amenities_en", nillable = true)
    protected String roomAmenitiesEn;
    @XmlElement(name = "Room_contact", nillable = true)
    protected String roomContact;
    @XmlElement(name = "Second_name", nillable = true)
    protected String secondName;
    @XmlElement(name = "Second_name_en", nillable = true)
    protected String secondNameEn;
    @XmlElement(name = "Services", nillable = true)
    protected String services;
    @XmlElement(name = "Services_en", nillable = true)
    protected String servicesEn;
    @XmlElement(name = "ShadowHotelid", nillable = true)
    protected String shadowHotelid;
    @XmlElement(name = "Show_logo")
    protected Boolean showLogo;
    @XmlElement(name = "Show_pic")
    protected Boolean showPic;
    @XmlElement(name = "Star")
    protected Short star;
    @XmlElement(name = "Star_out")
    protected Short starOut;
    @XmlElement(name = "SubcityID", nillable = true)
    protected String subcityID;
    @XmlElement(name = "Sum_night")
    protected Integer sumNight;
    @XmlElement(name = "SupplierID", nillable = true)
    protected String supplierID;
    @XmlElement(name = "Team_no")
    @XmlSchemaType(name = "unsignedByte")
    protected Short teamNo;
    @XmlElement(name = "Team_no_g")
    protected Integer teamNoG;
    @XmlElement(name = "Traffic", nillable = true)
    protected String traffic;
    @XmlElement(name = "Traffic_en", nillable = true)
    protected String trafficEn;
    @XmlElement(name = "Url", nillable = true)
    protected String url;
    @XmlElement(name = "Week_e")
    @XmlSchemaType(name = "unsignedByte")
    protected Short weekE;
    @XmlElement(name = "Week_s")
    @XmlSchemaType(name = "unsignedByte")
    protected Short weekS;
    @XmlElement(name = "Weekend_end")
    protected Short weekendEnd;
    @XmlElement(name = "Weekend_spe")
    @XmlSchemaType(name = "unsignedByte")
    protected Short weekendSpe;
    @XmlElement(name = "Weekend_start")
    protected Short weekendStart;

    /**
     * 获取additionalEndDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public DateTime getAdditionalEndDate() {
        return additionalEndDate;
    }

    /**
     * 设置additionalEndDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalEndDate(DateTime value) {
        this.additionalEndDate = value;
    }

    /**
     * 获取additionalStartDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public DateTime getAdditionalStartDate() {
        return additionalStartDate;
    }

    /**
     * 设置additionalStartDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalStartDate(DateTime value) {
        this.additionalStartDate = value;
    }

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
     * 获取adminArea属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdminArea() {
        return adminArea;
    }

    /**
     * 设置adminArea属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdminArea(String value) {
        this.adminArea = value;
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
     * 获取auditG属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAuditG() {
        return auditG;
    }

    /**
     * 设置auditG属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAuditG(Integer value) {
        this.auditG = value;
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
     *     {@link Short }
     *     
     */
    public Short getAuthorizeType() {
        return authorizeType;
    }

    /**
     * 设置authorizeType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setAuthorizeType(Short value) {
        this.authorizeType = value;
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
     * 获取breakfast属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBreakfast() {
        return breakfast;
    }

    /**
     * 设置breakfast属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBreakfast(String value) {
        this.breakfast = value;
    }

    /**
     * 获取cContacter属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCContacter() {
        return cContacter;
    }

    /**
     * 设置cContacter属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCContacter(String value) {
        this.cContacter = value;
    }

    /**
     * 获取cFax属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCFax() {
        return cFax;
    }

    /**
     * 设置cFax属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCFax(String value) {
        this.cFax = value;
    }

    /**
     * 获取cPhone属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCPhone() {
        return cPhone;
    }

    /**
     * 设置cPhone属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCPhone(String value) {
        this.cPhone = value;
    }

    /**
     * 获取cess属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCess() {
        return cess;
    }

    /**
     * 设置cess属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCess(BigDecimal value) {
        this.cess = value;
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
     * 获取commend属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommend() {
        return commend;
    }

    /**
     * 设置commend属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommend(String value) {
        this.commend = value;
    }

    /**
     * 获取commendhotel属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommendhotel() {
        return commendhotel;
    }

    /**
     * 设置commendhotel属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommendhotel(String value) {
        this.commendhotel = value;
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
     * 获取creditCardVouchRoomNum属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getCreditCardVouchRoomNum() {
        return creditCardVouchRoomNum;
    }

    /**
     * 设置creditCardVouchRoomNum属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setCreditCardVouchRoomNum(Short value) {
        this.creditCardVouchRoomNum = value;
    }

    /**
     * 获取creditCardVouchTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditCardVouchTime() {
        return creditCardVouchTime;
    }

    /**
     * 设置creditCardVouchTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditCardVouchTime(String value) {
        this.creditCardVouchTime = value;
    }

    /**
     * 获取creditCardVouchWeek属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getCreditCardVouchWeek() {
        return creditCardVouchWeek;
    }

    /**
     * 设置creditCardVouchWeek属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setCreditCardVouchWeek(Short value) {
        this.creditCardVouchWeek = value;
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
     * 获取doubleCredit属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getDoubleCredit() {
        return doubleCredit;
    }

    /**
     * 设置doubleCredit属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setDoubleCredit(Short value) {
        this.doubleCredit = value;
    }

    /**
     * 获取eatBothPrice属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEatBothPrice() {
        return eatBothPrice;
    }

    /**
     * 设置eatBothPrice属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEatBothPrice(BigDecimal value) {
        this.eatBothPrice = value;
    }

    /**
     * 获取eatCnPrice属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEatCnPrice() {
        return eatCnPrice;
    }

    /**
     * 设置eatCnPrice属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEatCnPrice(BigDecimal value) {
        this.eatCnPrice = value;
    }

    /**
     * 获取eatWestPrice属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEatWestPrice() {
        return eatWestPrice;
    }

    /**
     * 设置eatWestPrice属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEatWestPrice(BigDecimal value) {
        this.eatWestPrice = value;
    }

    /**
     * 获取ebookingE属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public DateTime getEbookingE() {
        return ebookingE;
    }

    /**
     * 设置ebookingE属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEbookingE(DateTime value) {
        this.ebookingE = value;
    }

    /**
     * 获取ebookingS属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public DateTime getEbookingS() {
        return ebookingS;
    }

    /**
     * 设置ebookingS属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEbookingS(DateTime value) {
        this.ebookingS = value;
    }

    /**
     * 获取email属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置email属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
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
     * 获取featureId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeatureId() {
        return featureId;
    }

    /**
     * 设置featureId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeatureId(String value) {
        this.featureId = value;
    }

    /**
     * 获取financeContacter属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFinanceContacter() {
        return financeContacter;
    }

    /**
     * 设置financeContacter属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFinanceContacter(String value) {
        this.financeContacter = value;
    }

    /**
     * 获取financeFax属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFinanceFax() {
        return financeFax;
    }

    /**
     * 设置financeFax属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFinanceFax(String value) {
        this.financeFax = value;
    }

    /**
     * 获取financeOpDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public DateTime getFinanceOpDate() {
        return financeOpDate;
    }

    /**
     * 设置financeOpDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFinanceOpDate(DateTime value) {
        this.financeOpDate = value;
    }

    /**
     * 获取financeOperator属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFinanceOperator() {
        return financeOperator;
    }

    /**
     * 设置financeOperator属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFinanceOperator(String value) {
        this.financeOperator = value;
    }

    /**
     * 获取financePhone属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFinancePhone() {
        return financePhone;
    }

    /**
     * 设置financePhone属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFinancePhone(String value) {
        this.financePhone = value;
    }

    /**
     * 获取groupId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getGroupId() {
        return groupId;
    }

    /**
     * 设置groupId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setGroupId(Short value) {
        this.groupId = value;
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
     * 获取hotelUniqueID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHotelUniqueID() {
        return hotelUniqueID;
    }

    /**
     * 设置hotelUniqueID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHotelUniqueID(Integer value) {
        this.hotelUniqueID = value;
    }

    /**
     * 获取hotelAddress属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHotelAddress() {
        return hotelAddress;
    }

    /**
     * 设置hotelAddress属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHotelAddress(String value) {
        this.hotelAddress = value;
    }

    /**
     * 获取hotelAddressEn属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHotelAddressEn() {
        return hotelAddressEn;
    }

    /**
     * 设置hotelAddressEn属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHotelAddressEn(String value) {
        this.hotelAddressEn = value;
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
     * 获取hotelApartment属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getHotelApartment() {
        return hotelApartment;
    }

    /**
     * 设置hotelApartment属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setHotelApartment(Short value) {
        this.hotelApartment = value;
    }

    /**
     * 获取hotelEconomic属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getHotelEconomic() {
        return hotelEconomic;
    }

    /**
     * 设置hotelEconomic属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setHotelEconomic(Short value) {
        this.hotelEconomic = value;
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
     * 获取hotelIdB属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHotelIdB() {
        return hotelIdB;
    }

    /**
     * 设置hotelIdB属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHotelIdB(String value) {
        this.hotelIdB = value;
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
     * 获取hotelType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getHotelType() {
        return hotelType;
    }

    /**
     * 设置hotelType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setHotelType(Short value) {
        this.hotelType = value;
    }

    /**
     * 获取hotelrecNotes属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHotelrecNotes() {
        return hotelrecNotes;
    }

    /**
     * 设置hotelrecNotes属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHotelrecNotes(String value) {
        this.hotelrecNotes = value;
    }

    /**
     * 获取id属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置id属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setId(Integer value) {
        this.id = value;
    }

    /**
     * 获取intro属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntro() {
        return intro;
    }

    /**
     * 设置intro属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntro(String value) {
        this.intro = value;
    }

    /**
     * 获取introEn属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntroEn() {
        return introEn;
    }

    /**
     * 设置introEn属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntroEn(String value) {
        this.introEn = value;
    }

    /**
     * 获取introK属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntroK() {
        return introK;
    }

    /**
     * 设置introK属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntroK(String value) {
        this.introK = value;
    }

    /**
     * 获取introKEn属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntroKEn() {
        return introKEn;
    }

    /**
     * 设置introKEn属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntroKEn(String value) {
        this.introKEn = value;
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
     * 获取isSendVouchFax属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIsSendVouchFax() {
        return isSendVouchFax;
    }

    /**
     * 设置isSendVouchFax属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIsSendVouchFax(Integer value) {
        this.isSendVouchFax = value;
    }

    /**
     * 获取isreserve属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsreserve() {
        return isreserve;
    }

    /**
     * 设置isreserve属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsreserve(String value) {
        this.isreserve = value;
    }

    /**
     * 获取isshadow属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIsshadow() {
        return isshadow;
    }

    /**
     * 设置isshadow属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIsshadow(Integer value) {
        this.isshadow = value;
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
     * 获取meeting属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeeting() {
        return meeting;
    }

    /**
     * 设置meeting属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeeting(String value) {
        this.meeting = value;
    }

    /**
     * 获取meetingEn属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeetingEn() {
        return meetingEn;
    }

    /**
     * 设置meetingEn属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeetingEn(String value) {
        this.meetingEn = value;
    }

    /**
     * 获取meetingSizeA属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMeetingSizeA() {
        return meetingSizeA;
    }

    /**
     * 设置meetingSizeA属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMeetingSizeA(Integer value) {
        this.meetingSizeA = value;
    }

    /**
     * 获取meetingSizeB属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMeetingSizeB() {
        return meetingSizeB;
    }

    /**
     * 设置meetingSizeB属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMeetingSizeB(Integer value) {
        this.meetingSizeB = value;
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
     * 获取notes2属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotes2() {
        return notes2;
    }

    /**
     * 设置notes2属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotes2(String value) {
        this.notes2 = value;
    }

    /**
     * 获取notes3属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotes3() {
        return notes3;
    }

    /**
     * 设置notes3属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotes3(String value) {
        this.notes3 = value;
    }

    /**
     * 获取notes3Limit属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public DateTime getNotes3Limit() {
        return notes3Limit;
    }

    /**
     * 设置notes3Limit属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotes3Limit(DateTime value) {
        this.notes3Limit = value;
    }

    /**
     * 获取notes3OpDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public DateTime getNotes3OpDate() {
        return notes3OpDate;
    }

    /**
     * 设置notes3OpDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotes3OpDate(DateTime value) {
        this.notes3OpDate = value;
    }

    /**
     * 获取notes3Operator属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotes3Operator() {
        return notes3Operator;
    }

    /**
     * 设置notes3Operator属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotes3Operator(String value) {
        this.notes3Operator = value;
    }

    /**
     * 获取objective属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getObjective() {
        return objective;
    }

    /**
     * 设置objective属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setObjective(Integer value) {
        this.objective = value;
    }

    /**
     * 获取objectiveMonth属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public DateTime getObjectiveMonth() {
        return objectiveMonth;
    }

    /**
     * 设置objectiveMonth属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectiveMonth(DateTime value) {
        this.objectiveMonth = value;
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
     * 获取operator属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperator() {
        return operator;
    }

    /**
     * 设置operator属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperator(String value) {
        this.operator = value;
    }

    /**
     * 获取orderId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOrderId() {
        return orderId;
    }

    /**
     * 设置orderId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOrderId(Integer value) {
        this.orderId = value;
    }

    /**
     * 获取orderIdOut属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOrderIdOut() {
        return orderIdOut;
    }

    /**
     * 设置orderIdOut属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOrderIdOut(Integer value) {
        this.orderIdOut = value;
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
     * 获取postcode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostcode() {
        return postcode;
    }

    /**
     * 设置postcode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostcode(String value) {
        this.postcode = value;
    }

    /**
     * 获取presentContent属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPresentContent() {
        return presentContent;
    }

    /**
     * 设置presentContent属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPresentContent(String value) {
        this.presentContent = value;
    }

    /**
     * 获取presentContentEn属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPresentContentEn() {
        return presentContentEn;
    }

    /**
     * 设置presentContentEn属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPresentContentEn(String value) {
        this.presentContentEn = value;
    }

    /**
     * 获取presentEndDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public DateTime getPresentEndDate() {
        return presentEndDate;
    }

    /**
     * 设置presentEndDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPresentEndDate(DateTime value) {
        this.presentEndDate = value;
    }

    /**
     * 获取presentStartDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public DateTime getPresentStartDate() {
        return presentStartDate;
    }

    /**
     * 设置presentStartDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPresentStartDate(DateTime value) {
        this.presentStartDate = value;
    }

    /**
     * 获取priceAdmin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriceAdmin() {
        return priceAdmin;
    }

    /**
     * 设置priceAdmin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriceAdmin(String value) {
        this.priceAdmin = value;
    }

    /**
     * 获取provinceId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvinceId() {
        return provinceId;
    }

    /**
     * 设置provinceId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvinceId(String value) {
        this.provinceId = value;
    }

    /**
     * 获取realstar属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRealstar() {
        return realstar;
    }

    /**
     * 设置realstar属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRealstar(String value) {
        this.realstar = value;
    }

    /**
     * 获取relax属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelax() {
        return relax;
    }

    /**
     * 设置relax属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelax(String value) {
        this.relax = value;
    }

    /**
     * 获取relaxEn属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelaxEn() {
        return relaxEn;
    }

    /**
     * 设置relaxEn属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelaxEn(String value) {
        this.relaxEn = value;
    }

    /**
     * 获取restaurant属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRestaurant() {
        return restaurant;
    }

    /**
     * 设置restaurant属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRestaurant(String value) {
        this.restaurant = value;
    }

    /**
     * 获取restaurantEn属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRestaurantEn() {
        return restaurantEn;
    }

    /**
     * 设置restaurantEn属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRestaurantEn(String value) {
        this.restaurantEn = value;
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
     * 获取roomContact属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomContact() {
        return roomContact;
    }

    /**
     * 设置roomContact属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomContact(String value) {
        this.roomContact = value;
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
     * 获取services属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServices() {
        return services;
    }

    /**
     * 设置services属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServices(String value) {
        this.services = value;
    }

    /**
     * 获取servicesEn属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServicesEn() {
        return servicesEn;
    }

    /**
     * 设置servicesEn属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServicesEn(String value) {
        this.servicesEn = value;
    }

    /**
     * 获取shadowHotelid属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShadowHotelid() {
        return shadowHotelid;
    }

    /**
     * 设置shadowHotelid属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShadowHotelid(String value) {
        this.shadowHotelid = value;
    }

    /**
     * 获取showLogo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowLogo() {
        return showLogo;
    }

    /**
     * 设置showLogo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowLogo(Boolean value) {
        this.showLogo = value;
    }

    /**
     * 获取showPic属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowPic() {
        return showPic;
    }

    /**
     * 设置showPic属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowPic(Boolean value) {
        this.showPic = value;
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
     * 获取subcityID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubcityID() {
        return subcityID;
    }

    /**
     * 设置subcityID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubcityID(String value) {
        this.subcityID = value;
    }

    /**
     * 获取sumNight属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSumNight() {
        return sumNight;
    }

    /**
     * 设置sumNight属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSumNight(Integer value) {
        this.sumNight = value;
    }

    /**
     * 获取supplierID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupplierID() {
        return supplierID;
    }

    /**
     * 设置supplierID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupplierID(String value) {
        this.supplierID = value;
    }

    /**
     * 获取teamNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getTeamNo() {
        return teamNo;
    }

    /**
     * 设置teamNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setTeamNo(Short value) {
        this.teamNo = value;
    }

    /**
     * 获取teamNoG属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTeamNoG() {
        return teamNoG;
    }

    /**
     * 设置teamNoG属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTeamNoG(Integer value) {
        this.teamNoG = value;
    }

    /**
     * 获取traffic属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTraffic() {
        return traffic;
    }

    /**
     * 设置traffic属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTraffic(String value) {
        this.traffic = value;
    }

    /**
     * 获取trafficEn属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrafficEn() {
        return trafficEn;
    }

    /**
     * 设置trafficEn属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrafficEn(String value) {
        this.trafficEn = value;
    }

    /**
     * 获取url属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrl() {
        return url;
    }

    /**
     * 设置url属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrl(String value) {
        this.url = value;
    }

    /**
     * 获取weekE属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getWeekE() {
        return weekE;
    }

    /**
     * 设置weekE属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setWeekE(Short value) {
        this.weekE = value;
    }

    /**
     * 获取weekS属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getWeekS() {
        return weekS;
    }

    /**
     * 设置weekS属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setWeekS(Short value) {
        this.weekS = value;
    }

    /**
     * 获取weekendEnd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getWeekendEnd() {
        return weekendEnd;
    }

    /**
     * 设置weekendEnd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setWeekendEnd(Short value) {
        this.weekendEnd = value;
    }

    /**
     * 获取weekendSpe属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getWeekendSpe() {
        return weekendSpe;
    }

    /**
     * 设置weekendSpe属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setWeekendSpe(Short value) {
        this.weekendSpe = value;
    }

    /**
     * 获取weekendStart属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getWeekendStart() {
        return weekendStart;
    }

    /**
     * 设置weekendStart属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setWeekendStart(Short value) {
        this.weekendStart = value;
    }

}
