
package com.elong.nb.agent.NorthBoundForAPIService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.joda.time.DateTime;


/**
 * <p>RatePlanForRoomtype complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="RatePlanForRoomtype"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BookingChannel" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="BusinessModer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CNDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CNRatePlanName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CustomerLevel" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="DateType" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="ENGDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ENGRatePlanName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EndTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="HotelID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="InventoryLimit" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="IsLimitTimeSale" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="MaxAdvanceBookingDays" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="MaxStayDays" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Memo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MinAdvanceBookingDays" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="MinCheckinRooms" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="MinStayDays" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="NameIsCustomerVisible" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="PriceModel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PriceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ProductType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RatePlanCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RatePlanID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RatePlanRoomTypeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RatePlanTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SellChannel" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="SettlementType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="StartTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RatePlanForRoomtype", namespace = "http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.DataAccess.Hotel", propOrder = {
    "bookingChannel",
    "businessModer",
    "cnDescription",
    "cnRatePlanName",
    "customerLevel",
    "dateType",
    "engDescription",
    "engRatePlanName",
    "endTime",
    "hotelID",
    "inventoryLimit",
    "isLimitTimeSale",
    "maxAdvanceBookingDays",
    "maxStayDays",
    "memo",
    "minAdvanceBookingDays",
    "minCheckinRooms",
    "minStayDays",
    "nameIsCustomerVisible",
    "priceModel",
    "priceType",
    "productType",
    "ratePlanCode",
    "ratePlanID",
    "ratePlanRoomTypeId",
    "ratePlanTypeCode",
    "sellChannel",
    "settlementType",
    "startTime",
    "status"
})
@XmlSeeAlso({
    RatePlanBaseInfo.class
})
public class RatePlanForRoomtype {

    @XmlElement(name = "BookingChannel")
    protected Integer bookingChannel;
    @XmlElement(name = "BusinessModer", nillable = true)
    protected String businessModer;
    @XmlElement(name = "CNDescription", nillable = true)
    protected String cnDescription;
    @XmlElement(name = "CNRatePlanName", nillable = true)
    protected String cnRatePlanName;
    @XmlElement(name = "CustomerLevel")
    protected Integer customerLevel;
    @XmlElement(name = "DateType")
    protected Short dateType;
    @XmlElement(name = "ENGDescription", nillable = true)
    protected String engDescription;
    @XmlElement(name = "ENGRatePlanName", nillable = true)
    protected String engRatePlanName;
    @XmlElement(name = "EndTime", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected DateTime endTime;
    @XmlElement(name = "HotelID", nillable = true)
    protected String hotelID;
    @XmlElement(name = "InventoryLimit")
    protected Integer inventoryLimit;
    @XmlElement(name = "IsLimitTimeSale")
    protected Short isLimitTimeSale;
    @XmlElement(name = "MaxAdvanceBookingDays")
    protected Integer maxAdvanceBookingDays;
    @XmlElement(name = "MaxStayDays")
    protected Integer maxStayDays;
    @XmlElement(name = "Memo", nillable = true)
    protected String memo;
    @XmlElement(name = "MinAdvanceBookingDays")
    protected Integer minAdvanceBookingDays;
    @XmlElement(name = "MinCheckinRooms")
    protected Integer minCheckinRooms;
    @XmlElement(name = "MinStayDays")
    protected Integer minStayDays;
    @XmlElement(name = "NameIsCustomerVisible")
    protected Short nameIsCustomerVisible;
    @XmlElement(name = "PriceModel", nillable = true)
    protected String priceModel;
    @XmlElement(name = "PriceType", nillable = true)
    protected String priceType;
    @XmlElement(name = "ProductType", nillable = true)
    protected String productType;
    @XmlElement(name = "RatePlanCode", nillable = true)
    protected String ratePlanCode;
    @XmlElement(name = "RatePlanID")
    protected Integer ratePlanID;
    @XmlElement(name = "RatePlanRoomTypeId", nillable = true)
    protected String ratePlanRoomTypeId;
    @XmlElement(name = "RatePlanTypeCode", nillable = true)
    protected String ratePlanTypeCode;
    @XmlElement(name = "SellChannel")
    protected Integer sellChannel;
    @XmlElement(name = "SettlementType", nillable = true)
    protected String settlementType;
    @XmlElement(name = "StartTime", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected DateTime startTime;
    @XmlElement(name = "Status")
    protected Short status;

    /**
     * 获取bookingChannel属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBookingChannel() {
        return bookingChannel;
    }

    /**
     * 设置bookingChannel属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBookingChannel(Integer value) {
        this.bookingChannel = value;
    }

    /**
     * 获取businessModer属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessModer() {
        return businessModer;
    }

    /**
     * 设置businessModer属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessModer(String value) {
        this.businessModer = value;
    }

    /**
     * 获取cnDescription属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCNDescription() {
        return cnDescription;
    }

    /**
     * 设置cnDescription属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCNDescription(String value) {
        this.cnDescription = value;
    }

    /**
     * 获取cnRatePlanName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCNRatePlanName() {
        return cnRatePlanName;
    }

    /**
     * 设置cnRatePlanName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCNRatePlanName(String value) {
        this.cnRatePlanName = value;
    }

    /**
     * 获取customerLevel属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCustomerLevel() {
        return customerLevel;
    }

    /**
     * 设置customerLevel属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCustomerLevel(Integer value) {
        this.customerLevel = value;
    }

    /**
     * 获取dateType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getDateType() {
        return dateType;
    }

    /**
     * 设置dateType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setDateType(Short value) {
        this.dateType = value;
    }

    /**
     * 获取engDescription属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getENGDescription() {
        return engDescription;
    }

    /**
     * 设置engDescription属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setENGDescription(String value) {
        this.engDescription = value;
    }

    /**
     * 获取engRatePlanName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getENGRatePlanName() {
        return engRatePlanName;
    }

    /**
     * 设置engRatePlanName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setENGRatePlanName(String value) {
        this.engRatePlanName = value;
    }

    /**
     * 获取endTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public DateTime getEndTime() {
        return endTime;
    }

    /**
     * 设置endTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndTime(DateTime value) {
        this.endTime = value;
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
     * 获取inventoryLimit属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getInventoryLimit() {
        return inventoryLimit;
    }

    /**
     * 设置inventoryLimit属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setInventoryLimit(Integer value) {
        this.inventoryLimit = value;
    }

    /**
     * 获取isLimitTimeSale属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getIsLimitTimeSale() {
        return isLimitTimeSale;
    }

    /**
     * 设置isLimitTimeSale属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setIsLimitTimeSale(Short value) {
        this.isLimitTimeSale = value;
    }

    /**
     * 获取maxAdvanceBookingDays属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxAdvanceBookingDays() {
        return maxAdvanceBookingDays;
    }

    /**
     * 设置maxAdvanceBookingDays属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxAdvanceBookingDays(Integer value) {
        this.maxAdvanceBookingDays = value;
    }

    /**
     * 获取maxStayDays属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxStayDays() {
        return maxStayDays;
    }

    /**
     * 设置maxStayDays属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxStayDays(Integer value) {
        this.maxStayDays = value;
    }

    /**
     * 获取memo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemo() {
        return memo;
    }

    /**
     * 设置memo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMemo(String value) {
        this.memo = value;
    }

    /**
     * 获取minAdvanceBookingDays属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMinAdvanceBookingDays() {
        return minAdvanceBookingDays;
    }

    /**
     * 设置minAdvanceBookingDays属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMinAdvanceBookingDays(Integer value) {
        this.minAdvanceBookingDays = value;
    }

    /**
     * 获取minCheckinRooms属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMinCheckinRooms() {
        return minCheckinRooms;
    }

    /**
     * 设置minCheckinRooms属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMinCheckinRooms(Integer value) {
        this.minCheckinRooms = value;
    }

    /**
     * 获取minStayDays属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMinStayDays() {
        return minStayDays;
    }

    /**
     * 设置minStayDays属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMinStayDays(Integer value) {
        this.minStayDays = value;
    }

    /**
     * 获取nameIsCustomerVisible属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getNameIsCustomerVisible() {
        return nameIsCustomerVisible;
    }

    /**
     * 设置nameIsCustomerVisible属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setNameIsCustomerVisible(Short value) {
        this.nameIsCustomerVisible = value;
    }

    /**
     * 获取priceModel属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriceModel() {
        return priceModel;
    }

    /**
     * 设置priceModel属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriceModel(String value) {
        this.priceModel = value;
    }

    /**
     * 获取priceType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriceType() {
        return priceType;
    }

    /**
     * 设置priceType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriceType(String value) {
        this.priceType = value;
    }

    /**
     * 获取productType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductType() {
        return productType;
    }

    /**
     * 设置productType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductType(String value) {
        this.productType = value;
    }

    /**
     * 获取ratePlanCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRatePlanCode() {
        return ratePlanCode;
    }

    /**
     * 设置ratePlanCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRatePlanCode(String value) {
        this.ratePlanCode = value;
    }

    /**
     * 获取ratePlanID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRatePlanID() {
        return ratePlanID;
    }

    /**
     * 设置ratePlanID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRatePlanID(Integer value) {
        this.ratePlanID = value;
    }

    /**
     * 获取ratePlanRoomTypeId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRatePlanRoomTypeId() {
        return ratePlanRoomTypeId;
    }

    /**
     * 设置ratePlanRoomTypeId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRatePlanRoomTypeId(String value) {
        this.ratePlanRoomTypeId = value;
    }

    /**
     * 获取ratePlanTypeCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRatePlanTypeCode() {
        return ratePlanTypeCode;
    }

    /**
     * 设置ratePlanTypeCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRatePlanTypeCode(String value) {
        this.ratePlanTypeCode = value;
    }

    /**
     * 获取sellChannel属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSellChannel() {
        return sellChannel;
    }

    /**
     * 设置sellChannel属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSellChannel(Integer value) {
        this.sellChannel = value;
    }

    /**
     * 获取settlementType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSettlementType() {
        return settlementType;
    }

    /**
     * 设置settlementType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSettlementType(String value) {
        this.settlementType = value;
    }

    /**
     * 获取startTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public DateTime getStartTime() {
        return startTime;
    }

    /**
     * 设置startTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartTime(DateTime value) {
        this.startTime = value;
    }

    /**
     * 获取status属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getStatus() {
        return status;
    }

    /**
     * 设置status属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setStatus(Short value) {
        this.status = value;
    }

}
