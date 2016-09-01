
package com.elong.nb.agent.NorthBoundForAPIService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>MarketingPromotion complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="MarketingPromotion"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ActionType" type="{http://schemas.datacontract.org/2004/07/Com.Elong.Utility.Hotel.Enum}EActionType" minOccurs="0"/&gt;
 *         &lt;element name="CostbyHotel" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HotelCostType" type="{http://schemas.datacontract.org/2004/07/Com.Elong.Utility.Hotel.Enum}EHotelCostType" minOccurs="0"/&gt;
 *         &lt;element name="OfferDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ProExclusive" type="{http://schemas.datacontract.org/2004/07/Com.Elong.Utility.Hotel.Enum}EExclusive" minOccurs="0"/&gt;
 *         &lt;element name="PromotionID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="PromotionType" type="{http://schemas.datacontract.org/2004/07/Com.Elong.Utility.Hotel.Enum}EPromotionType" minOccurs="0"/&gt;
 *         &lt;element name="ShortMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ShortMessageBig5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ShortMessageEN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Upperlimit" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MarketingPromotion", namespace = "http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.Domain.Hotel.Entity", propOrder = {
    "actionType",
    "costbyHotel",
    "description",
    "hotelCostType",
    "offerDesc",
    "proExclusive",
    "promotionID",
    "promotionType",
    "shortMessage",
    "shortMessageBig5",
    "shortMessageEN",
    "upperlimit"
})
public class MarketingPromotion {

    @XmlElement(name = "ActionType")
    @XmlSchemaType(name = "string")
    protected EActionType actionType;
    @XmlElement(name = "CostbyHotel")
    protected Float costbyHotel;
    @XmlElement(name = "Description", nillable = true)
    protected String description;
    @XmlElement(name = "HotelCostType")
    @XmlSchemaType(name = "string")
    protected EHotelCostType hotelCostType;
    @XmlElement(name = "OfferDesc", nillable = true)
    protected String offerDesc;
    @XmlElement(name = "ProExclusive")
    @XmlSchemaType(name = "string")
    protected EExclusive proExclusive;
    @XmlElement(name = "PromotionID")
    protected Long promotionID;
    @XmlElement(name = "PromotionType")
    @XmlSchemaType(name = "string")
    protected EPromotionType promotionType;
    @XmlElement(name = "ShortMessage", nillable = true)
    protected String shortMessage;
    @XmlElement(name = "ShortMessageBig5", nillable = true)
    protected String shortMessageBig5;
    @XmlElement(name = "ShortMessageEN", nillable = true)
    protected String shortMessageEN;
    @XmlElement(name = "Upperlimit")
    protected Float upperlimit;

    /**
     * 获取actionType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link EActionType }
     *     
     */
    public EActionType getActionType() {
        return actionType;
    }

    /**
     * 设置actionType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link EActionType }
     *     
     */
    public void setActionType(EActionType value) {
        this.actionType = value;
    }

    /**
     * 获取costbyHotel属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getCostbyHotel() {
        return costbyHotel;
    }

    /**
     * 设置costbyHotel属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setCostbyHotel(Float value) {
        this.costbyHotel = value;
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
     * 获取hotelCostType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link EHotelCostType }
     *     
     */
    public EHotelCostType getHotelCostType() {
        return hotelCostType;
    }

    /**
     * 设置hotelCostType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link EHotelCostType }
     *     
     */
    public void setHotelCostType(EHotelCostType value) {
        this.hotelCostType = value;
    }

    /**
     * 获取offerDesc属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfferDesc() {
        return offerDesc;
    }

    /**
     * 设置offerDesc属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfferDesc(String value) {
        this.offerDesc = value;
    }

    /**
     * 获取proExclusive属性的值。
     * 
     * @return
     *     possible object is
     *     {@link EExclusive }
     *     
     */
    public EExclusive getProExclusive() {
        return proExclusive;
    }

    /**
     * 设置proExclusive属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link EExclusive }
     *     
     */
    public void setProExclusive(EExclusive value) {
        this.proExclusive = value;
    }

    /**
     * 获取promotionID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPromotionID() {
        return promotionID;
    }

    /**
     * 设置promotionID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPromotionID(Long value) {
        this.promotionID = value;
    }

    /**
     * 获取promotionType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link EPromotionType }
     *     
     */
    public EPromotionType getPromotionType() {
        return promotionType;
    }

    /**
     * 设置promotionType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link EPromotionType }
     *     
     */
    public void setPromotionType(EPromotionType value) {
        this.promotionType = value;
    }

    /**
     * 获取shortMessage属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortMessage() {
        return shortMessage;
    }

    /**
     * 设置shortMessage属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortMessage(String value) {
        this.shortMessage = value;
    }

    /**
     * 获取shortMessageBig5属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortMessageBig5() {
        return shortMessageBig5;
    }

    /**
     * 设置shortMessageBig5属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortMessageBig5(String value) {
        this.shortMessageBig5 = value;
    }

    /**
     * 获取shortMessageEN属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortMessageEN() {
        return shortMessageEN;
    }

    /**
     * 设置shortMessageEN属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortMessageEN(String value) {
        this.shortMessageEN = value;
    }

    /**
     * 获取upperlimit属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getUpperlimit() {
        return upperlimit;
    }

    /**
     * 设置upperlimit属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setUpperlimit(Float value) {
        this.upperlimit = value;
    }

}
