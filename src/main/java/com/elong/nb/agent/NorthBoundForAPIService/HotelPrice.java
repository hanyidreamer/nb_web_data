
package com.elong.nb.agent.NorthBoundForAPIService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>HotelPrice complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="HotelPrice"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AuditStatus" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="EnumPriceStatus" type="{http://schemas.datacontract.org/2004/07/Com.Elong.Utility.Hotel.Enum}EnumPriceStatus" minOccurs="0"/&gt;
 *         &lt;element name="HotelID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IsPriceSet" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="PriceDayList" type="{http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.Domain.Hotel}ArrayOfPriceDay" minOccurs="0"/&gt;
 *         &lt;element name="RatePlanID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RoomTypeID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="isEffective" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HotelPrice", namespace = "http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.Domain.Hotel", propOrder = {
    "auditStatus",
    "enumPriceStatus",
    "hotelID",
    "isPriceSet",
    "priceDayList",
    "ratePlanID",
    "roomTypeID",
    "isEffective"
})
public class HotelPrice {

    @XmlElement(name = "AuditStatus")
    protected Integer auditStatus;
    @XmlElement(name = "EnumPriceStatus")
    @XmlSchemaType(name = "string")
    protected EnumPriceStatus enumPriceStatus;
    @XmlElement(name = "HotelID", nillable = true)
    protected String hotelID;
    @XmlElement(name = "IsPriceSet")
    protected Integer isPriceSet;
    @XmlElement(name = "PriceDayList", nillable = true)
    protected ArrayOfPriceDay priceDayList;
    @XmlElement(name = "RatePlanID")
    protected Integer ratePlanID;
    @XmlElement(name = "RoomTypeID", nillable = true)
    protected String roomTypeID;
    protected Integer isEffective;

    /**
     * 获取auditStatus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAuditStatus() {
        return auditStatus;
    }

    /**
     * 设置auditStatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAuditStatus(Integer value) {
        this.auditStatus = value;
    }

    /**
     * 获取enumPriceStatus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link EnumPriceStatus }
     *     
     */
    public EnumPriceStatus getEnumPriceStatus() {
        return enumPriceStatus;
    }

    /**
     * 设置enumPriceStatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link EnumPriceStatus }
     *     
     */
    public void setEnumPriceStatus(EnumPriceStatus value) {
        this.enumPriceStatus = value;
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
     * 获取isPriceSet属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIsPriceSet() {
        return isPriceSet;
    }

    /**
     * 设置isPriceSet属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIsPriceSet(Integer value) {
        this.isPriceSet = value;
    }

    /**
     * 获取priceDayList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPriceDay }
     *     
     */
    public ArrayOfPriceDay getPriceDayList() {
        return priceDayList;
    }

    /**
     * 设置priceDayList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPriceDay }
     *     
     */
    public void setPriceDayList(ArrayOfPriceDay value) {
        this.priceDayList = value;
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
     * 获取isEffective属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIsEffective() {
        return isEffective;
    }

    /**
     * 设置isEffective属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIsEffective(Integer value) {
        this.isEffective = value;
    }

}
