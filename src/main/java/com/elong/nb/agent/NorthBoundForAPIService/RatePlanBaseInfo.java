
package com.elong.nb.agent.NorthBoundForAPIService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>RatePlanBaseInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="RatePlanBaseInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.DataAccess.Hotel}RatePlanForRoomtype"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AddValueDayInfoList" type="{http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.Domain.Hotel.HotelProductUseBusiness}ArrayOfAddValueDayInfo" minOccurs="0"/&gt;
 *         &lt;element name="AddValuePolicyList" type="{http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.Domain.Hotel.HotelProductUseBusiness}ArrayOfAddValuePolicyInfo" minOccurs="0"/&gt;
 *         &lt;element name="IsSpecialBreakfast" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MarketingPromotionList" type="{http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.Domain.Hotel.Entity}ArrayOfMarketingPromotion" minOccurs="0"/&gt;
 *         &lt;element name="RatePlanBookingChannel" type="{http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.Domain.Hotel.Entity}ArrayOfBookingChannel" minOccurs="0"/&gt;
 *         &lt;element name="RatePlanDRRList" type="{http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.Domain.Hotel.HotelProductUseBusiness}ArrayOfDRRInfo" minOccurs="0"/&gt;
 *         &lt;element name="RatePlanPrePayRuleList" type="{http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.Domain.Hotel.HotelProductUseBusiness}ArrayOfPrePayInfo" minOccurs="0"/&gt;
 *         &lt;element name="RatePlanPriceInfo" type="{http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.Domain.Hotel}HotelPrice" minOccurs="0"/&gt;
 *         &lt;element name="RatePlanSellChannel" type="{http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.Domain.Hotel.Entity}ArrayOfSellChannel" minOccurs="0"/&gt;
 *         &lt;element name="RatePlanSettlement" type="{http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.Domain.Hotel}ArrayOfRatePlanPaymentRule" minOccurs="0"/&gt;
 *         &lt;element name="RatePlanVouchRuleList" type="{http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.Domain.Hotel.HotelProductUseBusiness}ArrayOfVouchInfo" minOccurs="0"/&gt;
 *         &lt;element name="RateplanRelationAddValue" type="{http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.DataAccess.Hotel}ArrayOfAddValueInfoSimple" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RatePlanBaseInfo", namespace = "http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.Domain.Hotel.Entity", propOrder = {
    "addValueDayInfoList",
    "addValuePolicyList",
    "isSpecialBreakfast",
    "marketingPromotionList",
    "ratePlanBookingChannel",
    "ratePlanDRRList",
    "ratePlanPrePayRuleList",
    "ratePlanPriceInfo",
    "ratePlanSellChannel",
    "ratePlanSettlement",
    "ratePlanVouchRuleList",
    "rateplanRelationAddValue"
})
public class RatePlanBaseInfo
    extends RatePlanForRoomtype
{

    @XmlElement(name = "AddValueDayInfoList", nillable = true)
    protected ArrayOfAddValueDayInfo addValueDayInfoList;
    @XmlElement(name = "AddValuePolicyList", nillable = true)
    protected ArrayOfAddValuePolicyInfo addValuePolicyList;
    @XmlElement(name = "IsSpecialBreakfast")
    protected Boolean isSpecialBreakfast;
    @XmlElement(name = "MarketingPromotionList", nillable = true)
    protected ArrayOfMarketingPromotion marketingPromotionList;
    @XmlElement(name = "RatePlanBookingChannel", nillable = true)
    protected ArrayOfBookingChannel ratePlanBookingChannel;
    @XmlElement(name = "RatePlanDRRList", nillable = true)
    protected ArrayOfDRRInfo ratePlanDRRList;
    @XmlElement(name = "RatePlanPrePayRuleList", nillable = true)
    protected ArrayOfPrePayInfo ratePlanPrePayRuleList;
    @XmlElement(name = "RatePlanPriceInfo", nillable = true)
    protected HotelPrice ratePlanPriceInfo;
    @XmlElement(name = "RatePlanSellChannel", nillable = true)
    protected ArrayOfSellChannel ratePlanSellChannel;
    @XmlElement(name = "RatePlanSettlement", nillable = true)
    protected ArrayOfRatePlanPaymentRule ratePlanSettlement;
    @XmlElement(name = "RatePlanVouchRuleList", nillable = true)
    protected ArrayOfVouchInfo ratePlanVouchRuleList;
    @XmlElement(name = "RateplanRelationAddValue", nillable = true)
    protected ArrayOfAddValueInfoSimple rateplanRelationAddValue;

    /**
     * 获取addValueDayInfoList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAddValueDayInfo }
     *     
     */
    public ArrayOfAddValueDayInfo getAddValueDayInfoList() {
        return addValueDayInfoList;
    }

    /**
     * 设置addValueDayInfoList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAddValueDayInfo }
     *     
     */
    public void setAddValueDayInfoList(ArrayOfAddValueDayInfo value) {
        this.addValueDayInfoList = value;
    }

    /**
     * 获取addValuePolicyList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAddValuePolicyInfo }
     *     
     */
    public ArrayOfAddValuePolicyInfo getAddValuePolicyList() {
        return addValuePolicyList;
    }

    /**
     * 设置addValuePolicyList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAddValuePolicyInfo }
     *     
     */
    public void setAddValuePolicyList(ArrayOfAddValuePolicyInfo value) {
        this.addValuePolicyList = value;
    }

    /**
     * 获取isSpecialBreakfast属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsSpecialBreakfast() {
        return isSpecialBreakfast;
    }

    /**
     * 设置isSpecialBreakfast属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsSpecialBreakfast(Boolean value) {
        this.isSpecialBreakfast = value;
    }

    /**
     * 获取marketingPromotionList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMarketingPromotion }
     *     
     */
    public ArrayOfMarketingPromotion getMarketingPromotionList() {
        return marketingPromotionList;
    }

    /**
     * 设置marketingPromotionList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMarketingPromotion }
     *     
     */
    public void setMarketingPromotionList(ArrayOfMarketingPromotion value) {
        this.marketingPromotionList = value;
    }

    /**
     * 获取ratePlanBookingChannel属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBookingChannel }
     *     
     */
    public ArrayOfBookingChannel getRatePlanBookingChannel() {
        return ratePlanBookingChannel;
    }

    /**
     * 设置ratePlanBookingChannel属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBookingChannel }
     *     
     */
    public void setRatePlanBookingChannel(ArrayOfBookingChannel value) {
        this.ratePlanBookingChannel = value;
    }

    /**
     * 获取ratePlanDRRList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDRRInfo }
     *     
     */
    public ArrayOfDRRInfo getRatePlanDRRList() {
        return ratePlanDRRList;
    }

    /**
     * 设置ratePlanDRRList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDRRInfo }
     *     
     */
    public void setRatePlanDRRList(ArrayOfDRRInfo value) {
        this.ratePlanDRRList = value;
    }

    /**
     * 获取ratePlanPrePayRuleList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPrePayInfo }
     *     
     */
    public ArrayOfPrePayInfo getRatePlanPrePayRuleList() {
        return ratePlanPrePayRuleList;
    }

    /**
     * 设置ratePlanPrePayRuleList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPrePayInfo }
     *     
     */
    public void setRatePlanPrePayRuleList(ArrayOfPrePayInfo value) {
        this.ratePlanPrePayRuleList = value;
    }

    /**
     * 获取ratePlanPriceInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link HotelPrice }
     *     
     */
    public HotelPrice getRatePlanPriceInfo() {
        return ratePlanPriceInfo;
    }

    /**
     * 设置ratePlanPriceInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link HotelPrice }
     *     
     */
    public void setRatePlanPriceInfo(HotelPrice value) {
        this.ratePlanPriceInfo = value;
    }

    /**
     * 获取ratePlanSellChannel属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSellChannel }
     *     
     */
    public ArrayOfSellChannel getRatePlanSellChannel() {
        return ratePlanSellChannel;
    }

    /**
     * 设置ratePlanSellChannel属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSellChannel }
     *     
     */
    public void setRatePlanSellChannel(ArrayOfSellChannel value) {
        this.ratePlanSellChannel = value;
    }

    /**
     * 获取ratePlanSettlement属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRatePlanPaymentRule }
     *     
     */
    public ArrayOfRatePlanPaymentRule getRatePlanSettlement() {
        return ratePlanSettlement;
    }

    /**
     * 设置ratePlanSettlement属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRatePlanPaymentRule }
     *     
     */
    public void setRatePlanSettlement(ArrayOfRatePlanPaymentRule value) {
        this.ratePlanSettlement = value;
    }

    /**
     * 获取ratePlanVouchRuleList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfVouchInfo }
     *     
     */
    public ArrayOfVouchInfo getRatePlanVouchRuleList() {
        return ratePlanVouchRuleList;
    }

    /**
     * 设置ratePlanVouchRuleList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfVouchInfo }
     *     
     */
    public void setRatePlanVouchRuleList(ArrayOfVouchInfo value) {
        this.ratePlanVouchRuleList = value;
    }

    /**
     * 获取rateplanRelationAddValue属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAddValueInfoSimple }
     *     
     */
    public ArrayOfAddValueInfoSimple getRateplanRelationAddValue() {
        return rateplanRelationAddValue;
    }

    /**
     * 设置rateplanRelationAddValue属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAddValueInfoSimple }
     *     
     */
    public void setRateplanRelationAddValue(ArrayOfAddValueInfoSimple value) {
        this.rateplanRelationAddValue = value;
    }

}
