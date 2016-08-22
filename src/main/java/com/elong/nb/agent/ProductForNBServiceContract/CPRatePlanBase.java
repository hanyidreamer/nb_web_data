
package com.elong.nb.agent.ProductForNBServiceContract;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.Duration;
import org.joda.time.DateTime;


/**
 * <p>CP_RatePlanBase complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="CP_RatePlanBase"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BookingChannel" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfint" minOccurs="0"/&gt;
 *         &lt;element name="BusinessModer" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfint" minOccurs="0"/&gt;
 *         &lt;element name="CNDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CNRatePlanName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CustomerLevel" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfint" minOccurs="0"/&gt;
 *         &lt;element name="DateType" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="ENGDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ENGRatePlanName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EndTime" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="IsLimitTimeSale" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="MaxAdvanceBookingDays" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="MaxStayDays" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Memo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MinAdvanceBookingDays" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="MinCheckinRooms" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="MinStayDays" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="OperateIP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OperateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="Operator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PriceModel" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="PriceType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ProductType" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfint" minOccurs="0"/&gt;
 *         &lt;element name="RatePlanCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RatePlanID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RatePlanTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RawBookingChannel" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RawBusinessModer" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RawCustomerLevel" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RawProductType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RawSellChannel" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="SHotelID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SellChannel" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfint" minOccurs="0"/&gt;
 *         &lt;element name="SettlementType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="StartTime" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
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
@XmlType(name = "CP_RatePlanBase", namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model", propOrder = {
    "bookingChannel",
    "businessModer",
    "cnDescription",
    "cnRatePlanName",
    "customerLevel",
    "dateType",
    "engDescription",
    "engRatePlanName",
    "endTime",
    "isLimitTimeSale",
    "maxAdvanceBookingDays",
    "maxStayDays",
    "memo",
    "minAdvanceBookingDays",
    "minCheckinRooms",
    "minStayDays",
    "operateIP",
    "operateTime",
    "operator",
    "priceModel",
    "priceType",
    "productType",
    "ratePlanCode",
    "ratePlanID",
    "ratePlanTypeCode",
    "rawBookingChannel",
    "rawBusinessModer",
    "rawCustomerLevel",
    "rawProductType",
    "rawSellChannel",
    "sHotelID",
    "sellChannel",
    "settlementType",
    "startTime",
    "status"
})
public class CPRatePlanBase {

    @XmlElement(name = "BookingChannel", nillable = true)
    protected ArrayOfint bookingChannel;
    @XmlElement(name = "BusinessModer", nillable = true)
    protected ArrayOfint businessModer;
    @XmlElement(name = "CNDescription", nillable = true)
    protected String cnDescription;
    @XmlElement(name = "CNRatePlanName", nillable = true)
    protected String cnRatePlanName;
    @XmlElement(name = "CustomerLevel", nillable = true)
    protected ArrayOfint customerLevel;
    @XmlElement(name = "DateType")
    protected Short dateType;
    @XmlElement(name = "ENGDescription", nillable = true)
    protected String engDescription;
    @XmlElement(name = "ENGRatePlanName", nillable = true)
    protected String engRatePlanName;
    @XmlElement(name = "EndTime")
    protected Duration endTime;
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
    @XmlElement(name = "OperateIP", nillable = true)
    protected String operateIP;
    @XmlElement(name = "OperateTime", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected DateTime operateTime;
    @XmlElement(name = "Operator", nillable = true)
    protected String operator;
    @XmlElement(name = "PriceModel")
    protected Integer priceModel;
    @XmlElement(name = "PriceType")
    protected Integer priceType;
    @XmlElement(name = "ProductType", nillable = true)
    protected ArrayOfint productType;
    @XmlElement(name = "RatePlanCode", nillable = true)
    protected String ratePlanCode;
    @XmlElement(name = "RatePlanID")
    protected Integer ratePlanID;
    @XmlElement(name = "RatePlanTypeCode", nillable = true)
    protected String ratePlanTypeCode;
    @XmlElement(name = "RawBookingChannel")
    protected Integer rawBookingChannel;
    @XmlElement(name = "RawBusinessModer")
    protected Integer rawBusinessModer;
    @XmlElement(name = "RawCustomerLevel")
    protected Integer rawCustomerLevel;
    @XmlElement(name = "RawProductType")
    protected Integer rawProductType;
    @XmlElement(name = "RawSellChannel")
    protected Integer rawSellChannel;
    @XmlElement(name = "SHotelID", nillable = true)
    protected String sHotelID;
    @XmlElement(name = "SellChannel", nillable = true)
    protected ArrayOfint sellChannel;
    @XmlElement(name = "SettlementType")
    protected Integer settlementType;
    @XmlElement(name = "StartTime")
    protected Duration startTime;
    @XmlElement(name = "Status")
    protected Short status;

    /**
     * 获取bookingChannel属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfint }
     *     
     */
    public ArrayOfint getBookingChannel() {
        return bookingChannel;
    }

    /**
     * 设置bookingChannel属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfint }
     *     
     */
    public void setBookingChannel(ArrayOfint value) {
        this.bookingChannel = value;
    }

    /**
     * 获取businessModer属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfint }
     *     
     */
    public ArrayOfint getBusinessModer() {
        return businessModer;
    }

    /**
     * 设置businessModer属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfint }
     *     
     */
    public void setBusinessModer(ArrayOfint value) {
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
     *     {@link ArrayOfint }
     *     
     */
    public ArrayOfint getCustomerLevel() {
        return customerLevel;
    }

    /**
     * 设置customerLevel属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfint }
     *     
     */
    public void setCustomerLevel(ArrayOfint value) {
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
     *     {@link Duration }
     *     
     */
    public Duration getEndTime() {
        return endTime;
    }

    /**
     * 设置endTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setEndTime(Duration value) {
        this.endTime = value;
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
     * 获取operateIP属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperateIP() {
        return operateIP;
    }

    /**
     * 设置operateIP属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperateIP(String value) {
        this.operateIP = value;
    }

    /**
     * 获取operateTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public DateTime getOperateTime() {
        return operateTime;
    }

    /**
     * 设置operateTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperateTime(DateTime value) {
        this.operateTime = value;
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
     * 获取priceModel属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPriceModel() {
        return priceModel;
    }

    /**
     * 设置priceModel属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPriceModel(Integer value) {
        this.priceModel = value;
    }

    /**
     * 获取priceType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPriceType() {
        return priceType;
    }

    /**
     * 设置priceType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPriceType(Integer value) {
        this.priceType = value;
    }

    /**
     * 获取productType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfint }
     *     
     */
    public ArrayOfint getProductType() {
        return productType;
    }

    /**
     * 设置productType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfint }
     *     
     */
    public void setProductType(ArrayOfint value) {
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
     * 获取rawBookingChannel属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRawBookingChannel() {
        return rawBookingChannel;
    }

    /**
     * 设置rawBookingChannel属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRawBookingChannel(Integer value) {
        this.rawBookingChannel = value;
    }

    /**
     * 获取rawBusinessModer属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRawBusinessModer() {
        return rawBusinessModer;
    }

    /**
     * 设置rawBusinessModer属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRawBusinessModer(Integer value) {
        this.rawBusinessModer = value;
    }

    /**
     * 获取rawCustomerLevel属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRawCustomerLevel() {
        return rawCustomerLevel;
    }

    /**
     * 设置rawCustomerLevel属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRawCustomerLevel(Integer value) {
        this.rawCustomerLevel = value;
    }

    /**
     * 获取rawProductType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRawProductType() {
        return rawProductType;
    }

    /**
     * 设置rawProductType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRawProductType(Integer value) {
        this.rawProductType = value;
    }

    /**
     * 获取rawSellChannel属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRawSellChannel() {
        return rawSellChannel;
    }

    /**
     * 设置rawSellChannel属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRawSellChannel(Integer value) {
        this.rawSellChannel = value;
    }

    /**
     * 获取sHotelID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSHotelID() {
        return sHotelID;
    }

    /**
     * 设置sHotelID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSHotelID(String value) {
        this.sHotelID = value;
    }

    /**
     * 获取sellChannel属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfint }
     *     
     */
    public ArrayOfint getSellChannel() {
        return sellChannel;
    }

    /**
     * 设置sellChannel属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfint }
     *     
     */
    public void setSellChannel(ArrayOfint value) {
        this.sellChannel = value;
    }

    /**
     * 获取settlementType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSettlementType() {
        return settlementType;
    }

    /**
     * 设置settlementType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSettlementType(Integer value) {
        this.settlementType = value;
    }

    /**
     * 获取startTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getStartTime() {
        return startTime;
    }

    /**
     * 设置startTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setStartTime(Duration value) {
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
