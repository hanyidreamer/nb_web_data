
package com.elong.nb.agent.ProductForPartnerServiceContract;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.joda.time.DateTime;


/**
 * <p>SHotelInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SHotelInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AdditionalStatus" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="Audit" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" minOccurs="0"/&gt;
 *         &lt;element name="BankInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Cess" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="CityID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Contacter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Fax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HelpfulTips" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HelpfulTipsEn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HelpfulTips_EndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="HelpfulTips_StartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="HotelID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HotelName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="InventoryUseType" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="IsCPO" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsKA" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsReserve" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IsSendVouchFax" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Nightconfirm" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" minOccurs="0"/&gt;
 *         &lt;element name="Notes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Notes1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Notes2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Notes2EndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="Notes2StartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="Notes3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Notes3EndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="Notes3StartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="NotesEndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="NotesStartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="OnlineSearchType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="OperateAt" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="Operator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OrderCreationVerifyMode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="PauseReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RoomContacter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Status_ConfirmDC" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Status_ConfirmEB" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Status_ConfirmECM" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Status_ConfirmSMS" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Status_NoConfirm" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Status_OrderConfirmEB" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Status_PointsAfterLeave" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Status_PointsOperatePrepay" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Status_PointsPerMonth" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Status_PointsPrePay" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Status_PointsSpecialCost" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SupplierAbbr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SupplierID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SupplierName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="WeekEndEnd" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="WeekEndStart" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="adminMisName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="adminName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SHotelInfo", namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model", propOrder = {
    "additionalStatus",
    "audit",
    "bankInfo",
    "cess",
    "cityID",
    "contacter",
    "fax",
    "helpfulTips",
    "helpfulTipsEn",
    "helpfulTipsEndDate",
    "helpfulTipsStartDate",
    "hotelID",
    "hotelName",
    "inventoryUseType",
    "isCPO",
    "isKA",
    "isReserve",
    "isSendVouchFax",
    "nightconfirm",
    "notes",
    "notes1",
    "notes2",
    "notes2EndDate",
    "notes2StartDate",
    "notes3",
    "notes3EndDate",
    "notes3StartDate",
    "notesEndDate",
    "notesStartDate",
    "onlineSearchType",
    "operateAt",
    "operator",
    "orderCreationVerifyMode",
    "pauseReason",
    "phone",
    "roomContacter",
    "statusConfirmDC",
    "statusConfirmEB",
    "statusConfirmECM",
    "statusConfirmSMS",
    "statusNoConfirm",
    "statusOrderConfirmEB",
    "statusPointsAfterLeave",
    "statusPointsOperatePrepay",
    "statusPointsPerMonth",
    "statusPointsPrePay",
    "statusPointsSpecialCost",
    "supplierAbbr",
    "supplierID",
    "supplierName",
    "weekEndEnd",
    "weekEndStart",
    "adminMisName",
    "adminName"
})
public class SHotelInfo {

    @XmlElement(name = "AdditionalStatus")
    protected Long additionalStatus;
    @XmlElement(name = "Audit")
    @XmlSchemaType(name = "unsignedByte")
    protected Short audit;
    @XmlElement(name = "BankInfo", nillable = true)
    protected String bankInfo;
    @XmlElement(name = "Cess")
    protected BigDecimal cess;
    @XmlElement(name = "CityID", nillable = true)
    protected String cityID;
    @XmlElement(name = "Contacter", nillable = true)
    protected String contacter;
    @XmlElement(name = "Fax", nillable = true)
    protected String fax;
    @XmlElement(name = "HelpfulTips", nillable = true)
    protected String helpfulTips;
    @XmlElement(name = "HelpfulTipsEn", nillable = true)
    protected String helpfulTipsEn;
    @XmlElement(name = "HelpfulTips_EndDate", type = String.class, nillable = true)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected DateTime helpfulTipsEndDate;
    @XmlElement(name = "HelpfulTips_StartDate", type = String.class, nillable = true)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected DateTime helpfulTipsStartDate;
    @XmlElement(name = "HotelID", nillable = true)
    protected String hotelID;
    @XmlElement(name = "HotelName", nillable = true)
    protected String hotelName;
    @XmlElement(name = "InventoryUseType")
    protected Short inventoryUseType;
    @XmlElement(name = "IsCPO")
    protected Boolean isCPO;
    @XmlElement(name = "IsKA")
    protected Boolean isKA;
    @XmlElement(name = "IsReserve", nillable = true)
    protected String isReserve;
    @XmlElement(name = "IsSendVouchFax")
    protected Integer isSendVouchFax;
    @XmlElement(name = "Nightconfirm")
    @XmlSchemaType(name = "unsignedByte")
    protected Short nightconfirm;
    @XmlElement(name = "Notes", nillable = true)
    protected String notes;
    @XmlElement(name = "Notes1", nillable = true)
    protected String notes1;
    @XmlElement(name = "Notes2", nillable = true)
    protected String notes2;
    @XmlElement(name = "Notes2EndDate", type = String.class, nillable = true)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected DateTime notes2EndDate;
    @XmlElement(name = "Notes2StartDate", type = String.class, nillable = true)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected DateTime notes2StartDate;
    @XmlElement(name = "Notes3", nillable = true)
    protected String notes3;
    @XmlElement(name = "Notes3EndDate", type = String.class, nillable = true)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected DateTime notes3EndDate;
    @XmlElement(name = "Notes3StartDate", type = String.class, nillable = true)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected DateTime notes3StartDate;
    @XmlElement(name = "NotesEndDate", type = String.class, nillable = true)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected DateTime notesEndDate;
    @XmlElement(name = "NotesStartDate", type = String.class, nillable = true)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected DateTime notesStartDate;
    @XmlElement(name = "OnlineSearchType")
    protected Integer onlineSearchType;
    @XmlElement(name = "OperateAt", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected DateTime operateAt;
    @XmlElement(name = "Operator", nillable = true)
    protected String operator;
    @XmlElement(name = "OrderCreationVerifyMode")
    protected Integer orderCreationVerifyMode;
    @XmlElement(name = "PauseReason", nillable = true)
    protected String pauseReason;
    @XmlElement(name = "Phone", nillable = true)
    protected String phone;
    @XmlElement(name = "RoomContacter", nillable = true)
    protected String roomContacter;
    @XmlElement(name = "Status_ConfirmDC")
    protected Boolean statusConfirmDC;
    @XmlElement(name = "Status_ConfirmEB")
    protected Boolean statusConfirmEB;
    @XmlElement(name = "Status_ConfirmECM")
    protected Boolean statusConfirmECM;
    @XmlElement(name = "Status_ConfirmSMS")
    protected Boolean statusConfirmSMS;
    @XmlElement(name = "Status_NoConfirm")
    protected Boolean statusNoConfirm;
    @XmlElement(name = "Status_OrderConfirmEB")
    protected Boolean statusOrderConfirmEB;
    @XmlElement(name = "Status_PointsAfterLeave")
    protected Boolean statusPointsAfterLeave;
    @XmlElement(name = "Status_PointsOperatePrepay")
    protected Boolean statusPointsOperatePrepay;
    @XmlElement(name = "Status_PointsPerMonth")
    protected Boolean statusPointsPerMonth;
    @XmlElement(name = "Status_PointsPrePay")
    protected Boolean statusPointsPrePay;
    @XmlElement(name = "Status_PointsSpecialCost")
    protected Boolean statusPointsSpecialCost;
    @XmlElement(name = "SupplierAbbr", nillable = true)
    protected String supplierAbbr;
    @XmlElement(name = "SupplierID", nillable = true)
    protected String supplierID;
    @XmlElement(name = "SupplierName", nillable = true)
    protected String supplierName;
    @XmlElement(name = "WeekEndEnd")
    protected Short weekEndEnd;
    @XmlElement(name = "WeekEndStart")
    protected Short weekEndStart;
    @XmlElement(nillable = true)
    protected String adminMisName;
    @XmlElement(nillable = true)
    protected String adminName;

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
     * 获取cityID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCityID() {
        return cityID;
    }

    /**
     * 设置cityID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCityID(String value) {
        this.cityID = value;
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
     * 获取helpfulTips属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHelpfulTips() {
        return helpfulTips;
    }

    /**
     * 设置helpfulTips属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHelpfulTips(String value) {
        this.helpfulTips = value;
    }

    /**
     * 获取helpfulTipsEn属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHelpfulTipsEn() {
        return helpfulTipsEn;
    }

    /**
     * 设置helpfulTipsEn属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHelpfulTipsEn(String value) {
        this.helpfulTipsEn = value;
    }

    /**
     * 获取helpfulTipsEndDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public DateTime getHelpfulTipsEndDate() {
        return helpfulTipsEndDate;
    }

    /**
     * 设置helpfulTipsEndDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHelpfulTipsEndDate(DateTime value) {
        this.helpfulTipsEndDate = value;
    }

    /**
     * 获取helpfulTipsStartDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public DateTime getHelpfulTipsStartDate() {
        return helpfulTipsStartDate;
    }

    /**
     * 设置helpfulTipsStartDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHelpfulTipsStartDate(DateTime value) {
        this.helpfulTipsStartDate = value;
    }

    /**
     * 获取hotelID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHotelID() {
        return hotelID;
    }

    /**
     * 设置hotelID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHotelID(String value) {
        this.hotelID = value;
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
     * 获取isCPO属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsCPO() {
        return isCPO;
    }

    /**
     * 设置isCPO属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsCPO(Boolean value) {
        this.isCPO = value;
    }

    /**
     * 获取isKA属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsKA() {
        return isKA;
    }

    /**
     * 设置isKA属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsKA(Boolean value) {
        this.isKA = value;
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
     * 获取nightconfirm属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getNightconfirm() {
        return nightconfirm;
    }

    /**
     * 设置nightconfirm属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setNightconfirm(Short value) {
        this.nightconfirm = value;
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
     * 获取notes1属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotes1() {
        return notes1;
    }

    /**
     * 设置notes1属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotes1(String value) {
        this.notes1 = value;
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
     * 获取notes2EndDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public DateTime getNotes2EndDate() {
        return notes2EndDate;
    }

    /**
     * 设置notes2EndDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotes2EndDate(DateTime value) {
        this.notes2EndDate = value;
    }

    /**
     * 获取notes2StartDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public DateTime getNotes2StartDate() {
        return notes2StartDate;
    }

    /**
     * 设置notes2StartDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotes2StartDate(DateTime value) {
        this.notes2StartDate = value;
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
     * 获取notes3EndDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public DateTime getNotes3EndDate() {
        return notes3EndDate;
    }

    /**
     * 设置notes3EndDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotes3EndDate(DateTime value) {
        this.notes3EndDate = value;
    }

    /**
     * 获取notes3StartDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public DateTime getNotes3StartDate() {
        return notes3StartDate;
    }

    /**
     * 设置notes3StartDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotes3StartDate(DateTime value) {
        this.notes3StartDate = value;
    }

    /**
     * 获取notesEndDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public DateTime getNotesEndDate() {
        return notesEndDate;
    }

    /**
     * 设置notesEndDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotesEndDate(DateTime value) {
        this.notesEndDate = value;
    }

    /**
     * 获取notesStartDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public DateTime getNotesStartDate() {
        return notesStartDate;
    }

    /**
     * 设置notesStartDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotesStartDate(DateTime value) {
        this.notesStartDate = value;
    }

    /**
     * 获取onlineSearchType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOnlineSearchType() {
        return onlineSearchType;
    }

    /**
     * 设置onlineSearchType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOnlineSearchType(Integer value) {
        this.onlineSearchType = value;
    }

    /**
     * 获取operateAt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public DateTime getOperateAt() {
        return operateAt;
    }

    /**
     * 设置operateAt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperateAt(DateTime value) {
        this.operateAt = value;
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
     * 获取orderCreationVerifyMode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOrderCreationVerifyMode() {
        return orderCreationVerifyMode;
    }

    /**
     * 设置orderCreationVerifyMode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOrderCreationVerifyMode(Integer value) {
        this.orderCreationVerifyMode = value;
    }

    /**
     * 获取pauseReason属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPauseReason() {
        return pauseReason;
    }

    /**
     * 设置pauseReason属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPauseReason(String value) {
        this.pauseReason = value;
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
     * 获取roomContacter属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomContacter() {
        return roomContacter;
    }

    /**
     * 设置roomContacter属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomContacter(String value) {
        this.roomContacter = value;
    }

    /**
     * 获取statusConfirmDC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStatusConfirmDC() {
        return statusConfirmDC;
    }

    /**
     * 设置statusConfirmDC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStatusConfirmDC(Boolean value) {
        this.statusConfirmDC = value;
    }

    /**
     * 获取statusConfirmEB属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStatusConfirmEB() {
        return statusConfirmEB;
    }

    /**
     * 设置statusConfirmEB属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStatusConfirmEB(Boolean value) {
        this.statusConfirmEB = value;
    }

    /**
     * 获取statusConfirmECM属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStatusConfirmECM() {
        return statusConfirmECM;
    }

    /**
     * 设置statusConfirmECM属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStatusConfirmECM(Boolean value) {
        this.statusConfirmECM = value;
    }

    /**
     * 获取statusConfirmSMS属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStatusConfirmSMS() {
        return statusConfirmSMS;
    }

    /**
     * 设置statusConfirmSMS属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStatusConfirmSMS(Boolean value) {
        this.statusConfirmSMS = value;
    }

    /**
     * 获取statusNoConfirm属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStatusNoConfirm() {
        return statusNoConfirm;
    }

    /**
     * 设置statusNoConfirm属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStatusNoConfirm(Boolean value) {
        this.statusNoConfirm = value;
    }

    /**
     * 获取statusOrderConfirmEB属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStatusOrderConfirmEB() {
        return statusOrderConfirmEB;
    }

    /**
     * 设置statusOrderConfirmEB属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStatusOrderConfirmEB(Boolean value) {
        this.statusOrderConfirmEB = value;
    }

    /**
     * 获取statusPointsAfterLeave属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStatusPointsAfterLeave() {
        return statusPointsAfterLeave;
    }

    /**
     * 设置statusPointsAfterLeave属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStatusPointsAfterLeave(Boolean value) {
        this.statusPointsAfterLeave = value;
    }

    /**
     * 获取statusPointsOperatePrepay属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStatusPointsOperatePrepay() {
        return statusPointsOperatePrepay;
    }

    /**
     * 设置statusPointsOperatePrepay属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStatusPointsOperatePrepay(Boolean value) {
        this.statusPointsOperatePrepay = value;
    }

    /**
     * 获取statusPointsPerMonth属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStatusPointsPerMonth() {
        return statusPointsPerMonth;
    }

    /**
     * 设置statusPointsPerMonth属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStatusPointsPerMonth(Boolean value) {
        this.statusPointsPerMonth = value;
    }

    /**
     * 获取statusPointsPrePay属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStatusPointsPrePay() {
        return statusPointsPrePay;
    }

    /**
     * 设置statusPointsPrePay属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStatusPointsPrePay(Boolean value) {
        this.statusPointsPrePay = value;
    }

    /**
     * 获取statusPointsSpecialCost属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStatusPointsSpecialCost() {
        return statusPointsSpecialCost;
    }

    /**
     * 设置statusPointsSpecialCost属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStatusPointsSpecialCost(Boolean value) {
        this.statusPointsSpecialCost = value;
    }

    /**
     * 获取supplierAbbr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupplierAbbr() {
        return supplierAbbr;
    }

    /**
     * 设置supplierAbbr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupplierAbbr(String value) {
        this.supplierAbbr = value;
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
     * 获取supplierName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupplierName() {
        return supplierName;
    }

    /**
     * 设置supplierName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupplierName(String value) {
        this.supplierName = value;
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

    /**
     * 获取adminMisName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdminMisName() {
        return adminMisName;
    }

    /**
     * 设置adminMisName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdminMisName(String value) {
        this.adminMisName = value;
    }

    /**
     * 获取adminName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdminName() {
        return adminName;
    }

    /**
     * 设置adminName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdminName(String value) {
        this.adminName = value;
    }

}
