
package com.elong.nb.agent.ProductForNBServiceContract;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.joda.time.DateTime;


/**
 * <p>PriceInfoForPartner complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="PriceInfoForPartner"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AddBedPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="AllowAddBed" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="AuditStatus" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="BeginDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="CommissionCalculationType" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" minOccurs="0"/&gt;
 *         &lt;element name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="GenSaleCost" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="GenSalePrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="HotelID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IsEffective" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="IsPriceSet" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="MaxProfit" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="MinProfit" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="OperateIP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OperateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="Operator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PriceID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="RateCalculationModelType" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" minOccurs="0"/&gt;
 *         &lt;element name="RatePlanCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RatePlanID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RoomTypeID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="WeekdayCommissionCalculationValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="WeekdayNetRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="WeekendCommissionCalculationValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="WeekendNetRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="WeekendSaleCost" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="WeekendSalePrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PriceInfoForPartner", namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model", propOrder = {
    "addBedPrice",
    "allowAddBed",
    "auditStatus",
    "beginDate",
    "commissionCalculationType",
    "currencyCode",
    "endDate",
    "genSaleCost",
    "genSalePrice",
    "hotelID",
    "isEffective",
    "isPriceSet",
    "maxProfit",
    "minProfit",
    "operateIP",
    "operateTime",
    "operator",
    "priceID",
    "rateCalculationModelType",
    "ratePlanCode",
    "ratePlanID",
    "roomTypeID",
    "weekdayCommissionCalculationValue",
    "weekdayNetRate",
    "weekendCommissionCalculationValue",
    "weekendNetRate",
    "weekendSaleCost",
    "weekendSalePrice"
})
public class PriceInfoForPartner {

    @XmlElement(name = "AddBedPrice")
    protected BigDecimal addBedPrice;
    @XmlElement(name = "AllowAddBed")
    protected Short allowAddBed;
    @XmlElement(name = "AuditStatus")
    protected Short auditStatus;
    @XmlElement(name = "BeginDate", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected DateTime beginDate;
    @XmlElement(name = "CommissionCalculationType")
    @XmlSchemaType(name = "unsignedByte")
    protected Short commissionCalculationType;
    @XmlElement(name = "CurrencyCode", nillable = true)
    protected String currencyCode;
    @XmlElement(name = "EndDate", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected DateTime endDate;
    @XmlElement(name = "GenSaleCost")
    protected BigDecimal genSaleCost;
    @XmlElement(name = "GenSalePrice")
    protected BigDecimal genSalePrice;
    @XmlElement(name = "HotelID", nillable = true)
    protected String hotelID;
    @XmlElement(name = "IsEffective")
    protected Short isEffective;
    @XmlElement(name = "IsPriceSet")
    protected Short isPriceSet;
    @XmlElement(name = "MaxProfit")
    protected BigDecimal maxProfit;
    @XmlElement(name = "MinProfit")
    protected BigDecimal minProfit;
    @XmlElement(name = "OperateIP", nillable = true)
    protected String operateIP;
    @XmlElement(name = "OperateTime", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected DateTime operateTime;
    @XmlElement(name = "Operator", nillable = true)
    protected String operator;
    @XmlElement(name = "PriceID")
    protected Long priceID;
    @XmlElement(name = "RateCalculationModelType")
    @XmlSchemaType(name = "unsignedByte")
    protected Short rateCalculationModelType;
    @XmlElement(name = "RatePlanCode", nillable = true)
    protected String ratePlanCode;
    @XmlElement(name = "RatePlanID")
    protected Integer ratePlanID;
    @XmlElement(name = "RoomTypeID", nillable = true)
    protected String roomTypeID;
    @XmlElement(name = "WeekdayCommissionCalculationValue")
    protected BigDecimal weekdayCommissionCalculationValue;
    @XmlElement(name = "WeekdayNetRate")
    protected BigDecimal weekdayNetRate;
    @XmlElement(name = "WeekendCommissionCalculationValue")
    protected BigDecimal weekendCommissionCalculationValue;
    @XmlElement(name = "WeekendNetRate")
    protected BigDecimal weekendNetRate;
    @XmlElement(name = "WeekendSaleCost")
    protected BigDecimal weekendSaleCost;
    @XmlElement(name = "WeekendSalePrice")
    protected BigDecimal weekendSalePrice;

    /**
     * 获取addBedPrice属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAddBedPrice() {
        return addBedPrice;
    }

    /**
     * 设置addBedPrice属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAddBedPrice(BigDecimal value) {
        this.addBedPrice = value;
    }

    /**
     * 获取allowAddBed属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getAllowAddBed() {
        return allowAddBed;
    }

    /**
     * 设置allowAddBed属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setAllowAddBed(Short value) {
        this.allowAddBed = value;
    }

    /**
     * 获取auditStatus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getAuditStatus() {
        return auditStatus;
    }

    /**
     * 设置auditStatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setAuditStatus(Short value) {
        this.auditStatus = value;
    }

    /**
     * 获取beginDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public DateTime getBeginDate() {
        return beginDate;
    }

    /**
     * 设置beginDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeginDate(DateTime value) {
        this.beginDate = value;
    }

    /**
     * 获取commissionCalculationType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getCommissionCalculationType() {
        return commissionCalculationType;
    }

    /**
     * 设置commissionCalculationType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setCommissionCalculationType(Short value) {
        this.commissionCalculationType = value;
    }

    /**
     * 获取currencyCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * 设置currencyCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyCode(String value) {
        this.currencyCode = value;
    }

    /**
     * 获取endDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public DateTime getEndDate() {
        return endDate;
    }

    /**
     * 设置endDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndDate(DateTime value) {
        this.endDate = value;
    }

    /**
     * 获取genSaleCost属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getGenSaleCost() {
        return genSaleCost;
    }

    /**
     * 设置genSaleCost属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setGenSaleCost(BigDecimal value) {
        this.genSaleCost = value;
    }

    /**
     * 获取genSalePrice属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getGenSalePrice() {
        return genSalePrice;
    }

    /**
     * 设置genSalePrice属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setGenSalePrice(BigDecimal value) {
        this.genSalePrice = value;
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
     * 获取isEffective属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getIsEffective() {
        return isEffective;
    }

    /**
     * 设置isEffective属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setIsEffective(Short value) {
        this.isEffective = value;
    }

    /**
     * 获取isPriceSet属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getIsPriceSet() {
        return isPriceSet;
    }

    /**
     * 设置isPriceSet属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setIsPriceSet(Short value) {
        this.isPriceSet = value;
    }

    /**
     * 获取maxProfit属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaxProfit() {
        return maxProfit;
    }

    /**
     * 设置maxProfit属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaxProfit(BigDecimal value) {
        this.maxProfit = value;
    }

    /**
     * 获取minProfit属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinProfit() {
        return minProfit;
    }

    /**
     * 设置minProfit属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMinProfit(BigDecimal value) {
        this.minProfit = value;
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
     * 获取priceID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPriceID() {
        return priceID;
    }

    /**
     * 设置priceID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPriceID(Long value) {
        this.priceID = value;
    }

    /**
     * 获取rateCalculationModelType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getRateCalculationModelType() {
        return rateCalculationModelType;
    }

    /**
     * 设置rateCalculationModelType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setRateCalculationModelType(Short value) {
        this.rateCalculationModelType = value;
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
     * 获取roomTypeID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomTypeID() {
        return roomTypeID;
    }

    /**
     * 设置roomTypeID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomTypeID(String value) {
        this.roomTypeID = value;
    }

    /**
     * 获取weekdayCommissionCalculationValue属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWeekdayCommissionCalculationValue() {
        return weekdayCommissionCalculationValue;
    }

    /**
     * 设置weekdayCommissionCalculationValue属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWeekdayCommissionCalculationValue(BigDecimal value) {
        this.weekdayCommissionCalculationValue = value;
    }

    /**
     * 获取weekdayNetRate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWeekdayNetRate() {
        return weekdayNetRate;
    }

    /**
     * 设置weekdayNetRate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWeekdayNetRate(BigDecimal value) {
        this.weekdayNetRate = value;
    }

    /**
     * 获取weekendCommissionCalculationValue属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWeekendCommissionCalculationValue() {
        return weekendCommissionCalculationValue;
    }

    /**
     * 设置weekendCommissionCalculationValue属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWeekendCommissionCalculationValue(BigDecimal value) {
        this.weekendCommissionCalculationValue = value;
    }

    /**
     * 获取weekendNetRate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWeekendNetRate() {
        return weekendNetRate;
    }

    /**
     * 设置weekendNetRate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWeekendNetRate(BigDecimal value) {
        this.weekendNetRate = value;
    }

    /**
     * 获取weekendSaleCost属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWeekendSaleCost() {
        return weekendSaleCost;
    }

    /**
     * 设置weekendSaleCost属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWeekendSaleCost(BigDecimal value) {
        this.weekendSaleCost = value;
    }

    /**
     * 获取weekendSalePrice属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWeekendSalePrice() {
        return weekendSalePrice;
    }

    /**
     * 设置weekendSalePrice属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWeekendSalePrice(BigDecimal value) {
        this.weekendSalePrice = value;
    }

}
