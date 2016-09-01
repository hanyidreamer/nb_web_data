
package com.elong.nb.agent.NorthBoundForAPIService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.joda.time.DateTime;


/**
 * <p>PriceInfoChangeDataRequest complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="PriceInfoChangeDataRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.Domain.Hotel}Request"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BookingChannel" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="CityIDs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CustomerLevel" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="HotelIDs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LastChgId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="LastChgTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="MaxRecordCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="SellChannel" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="SettlementType" type="{http://schemas.datacontract.org/2004/07/Com.Elong.Utility.Hotel.Enum}EnumPayMentType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PriceInfoChangeDataRequest", namespace = "http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.Domain.Hotel.Message", propOrder = {
    "bookingChannel",
    "cityIDs",
    "customerLevel",
    "hotelIDs",
    "lastChgId",
    "lastChgTime",
    "maxRecordCount",
    "sellChannel",
    "settlementType"
})
public class PriceInfoChangeDataRequest
    extends Request
{

    @XmlElement(name = "BookingChannel")
    protected Integer bookingChannel;
    @XmlElement(name = "CityIDs", nillable = true)
    protected String cityIDs;
    @XmlElement(name = "CustomerLevel")
    protected Integer customerLevel;
    @XmlElement(name = "HotelIDs", nillable = true)
    protected String hotelIDs;
    @XmlElement(name = "LastChgId")
    protected Long lastChgId;
    @XmlElement(name = "LastChgTime", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected DateTime lastChgTime;
    @XmlElement(name = "MaxRecordCount")
    protected Integer maxRecordCount;
    @XmlElement(name = "SellChannel")
    protected Integer sellChannel;
    @XmlElement(name = "SettlementType")
    @XmlSchemaType(name = "string")
    protected EnumPayMentType settlementType;

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
     * 获取cityIDs属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCityIDs() {
        return cityIDs;
    }

    /**
     * 设置cityIDs属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCityIDs(String value) {
        this.cityIDs = value;
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
     * 获取hotelIDs属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHotelIDs() {
        return hotelIDs;
    }

    /**
     * 设置hotelIDs属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHotelIDs(String value) {
        this.hotelIDs = value;
    }

    /**
     * 获取lastChgId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLastChgId() {
        return lastChgId;
    }

    /**
     * 设置lastChgId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLastChgId(Long value) {
        this.lastChgId = value;
    }

    /**
     * 获取lastChgTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public DateTime getLastChgTime() {
        return lastChgTime;
    }

    /**
     * 设置lastChgTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastChgTime(DateTime value) {
        this.lastChgTime = value;
    }

    /**
     * 获取maxRecordCount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxRecordCount() {
        return maxRecordCount;
    }

    /**
     * 设置maxRecordCount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxRecordCount(Integer value) {
        this.maxRecordCount = value;
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
     *     {@link EnumPayMentType }
     *     
     */
    public EnumPayMentType getSettlementType() {
        return settlementType;
    }

    /**
     * 设置settlementType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link EnumPayMentType }
     *     
     */
    public void setSettlementType(EnumPayMentType value) {
        this.settlementType = value;
    }

}
