
package com.elong.nb.agent.NorthBoundForAPIService;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.joda.time.DateTime;


/**
 * <p>PriceDay complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="PriceDay"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AddBedPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="AvailableDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="BreakfastCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GenSaleCost" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="GenSalePrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="IsAddBed" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="IsHotelWeekEnd" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsPricePromotion" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Memo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PerBreakfastPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="PolicyID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="PriceID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RealCost" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="SaleCost" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="SalePrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="SalePriceWithDRR" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="ShowPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
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
@XmlType(name = "PriceDay", namespace = "http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.Domain.Hotel", propOrder = {
    "addBedPrice",
    "availableDate",
    "breakfastCount",
    "currency",
    "genSaleCost",
    "genSalePrice",
    "isAddBed",
    "isHotelWeekEnd",
    "isPricePromotion",
    "memo",
    "perBreakfastPrice",
    "policyID",
    "priceID",
    "realCost",
    "saleCost",
    "salePrice",
    "salePriceWithDRR",
    "showPrice",
    "weekendSaleCost",
    "weekendSalePrice"
})
public class PriceDay {

    @XmlElement(name = "AddBedPrice")
    protected BigDecimal addBedPrice;
    @XmlElement(name = "AvailableDate", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected DateTime availableDate;
    @XmlElement(name = "BreakfastCount")
    protected Integer breakfastCount;
    @XmlElement(name = "Currency", nillable = true)
    protected String currency;
    @XmlElement(name = "GenSaleCost")
    protected BigDecimal genSaleCost;
    @XmlElement(name = "GenSalePrice")
    protected BigDecimal genSalePrice;
    @XmlElement(name = "IsAddBed")
    protected Integer isAddBed;
    @XmlElement(name = "IsHotelWeekEnd")
    protected Boolean isHotelWeekEnd;
    @XmlElement(name = "IsPricePromotion")
    protected Boolean isPricePromotion;
    @XmlElement(name = "Memo", nillable = true)
    protected String memo;
    @XmlElement(name = "PerBreakfastPrice")
    protected BigDecimal perBreakfastPrice;
    @XmlElement(name = "PolicyID")
    protected Integer policyID;
    @XmlElement(name = "PriceID")
    protected Integer priceID;
    @XmlElement(name = "RealCost")
    protected BigDecimal realCost;
    @XmlElement(name = "SaleCost")
    protected BigDecimal saleCost;
    @XmlElement(name = "SalePrice")
    protected BigDecimal salePrice;
    @XmlElement(name = "SalePriceWithDRR")
    protected BigDecimal salePriceWithDRR;
    @XmlElement(name = "ShowPrice")
    protected BigDecimal showPrice;
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
     * 获取availableDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public DateTime getAvailableDate() {
        return availableDate;
    }

    /**
     * 设置availableDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAvailableDate(DateTime value) {
        this.availableDate = value;
    }

    /**
     * 获取breakfastCount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBreakfastCount() {
        return breakfastCount;
    }

    /**
     * 设置breakfastCount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBreakfastCount(Integer value) {
        this.breakfastCount = value;
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
     * 获取isAddBed属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIsAddBed() {
        return isAddBed;
    }

    /**
     * 设置isAddBed属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIsAddBed(Integer value) {
        this.isAddBed = value;
    }

    /**
     * 获取isHotelWeekEnd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsHotelWeekEnd() {
        return isHotelWeekEnd;
    }

    /**
     * 设置isHotelWeekEnd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsHotelWeekEnd(Boolean value) {
        this.isHotelWeekEnd = value;
    }

    /**
     * 获取isPricePromotion属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsPricePromotion() {
        return isPricePromotion;
    }

    /**
     * 设置isPricePromotion属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsPricePromotion(Boolean value) {
        this.isPricePromotion = value;
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
     * 获取perBreakfastPrice属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPerBreakfastPrice() {
        return perBreakfastPrice;
    }

    /**
     * 设置perBreakfastPrice属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPerBreakfastPrice(BigDecimal value) {
        this.perBreakfastPrice = value;
    }

    /**
     * 获取policyID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPolicyID() {
        return policyID;
    }

    /**
     * 设置policyID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPolicyID(Integer value) {
        this.policyID = value;
    }

    /**
     * 获取priceID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPriceID() {
        return priceID;
    }

    /**
     * 设置priceID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPriceID(Integer value) {
        this.priceID = value;
    }

    /**
     * 获取realCost属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRealCost() {
        return realCost;
    }

    /**
     * 设置realCost属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRealCost(BigDecimal value) {
        this.realCost = value;
    }

    /**
     * 获取saleCost属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSaleCost() {
        return saleCost;
    }

    /**
     * 设置saleCost属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSaleCost(BigDecimal value) {
        this.saleCost = value;
    }

    /**
     * 获取salePrice属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSalePrice() {
        return salePrice;
    }

    /**
     * 设置salePrice属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSalePrice(BigDecimal value) {
        this.salePrice = value;
    }

    /**
     * 获取salePriceWithDRR属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSalePriceWithDRR() {
        return salePriceWithDRR;
    }

    /**
     * 设置salePriceWithDRR属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSalePriceWithDRR(BigDecimal value) {
        this.salePriceWithDRR = value;
    }

    /**
     * 获取showPrice属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getShowPrice() {
        return showPrice;
    }

    /**
     * 设置showPrice属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setShowPrice(BigDecimal value) {
        this.showPrice = value;
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
