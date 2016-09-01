
package com.elong.nb.agent.HotelGiftService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.joda.time.DateTime;


/**
 * <p>HotelGiftRelationDate complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="HotelGiftRelationDate">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BeginDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="BitSum4Week" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="DateType" type="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Enums}HotelGiftDateTypeEnum" minOccurs="0"/>
 *         &lt;element name="EndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="GiftID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="HourNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="HourType" type="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Enums}HotelGiftHourTypeEnum" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HotelGiftRelationDate", namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model", propOrder = {
    "beginDate",
    "bitSum4Week",
    "dateType",
    "endDate",
    "giftID",
    "hourNumber",
    "hourType"
})
public class HotelGiftRelationDate {

    @XmlElement(name = "BeginDate", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected DateTime beginDate;
    @XmlElement(name = "BitSum4Week")
    protected Integer bitSum4Week;
    @XmlElement(name = "DateType")
    @XmlSchemaType(name = "string")
    protected HotelGiftDateTypeEnum dateType;
    @XmlElement(name = "EndDate", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected DateTime endDate;
    @XmlElement(name = "GiftID")
    protected Integer giftID;
    @XmlElement(name = "HourNumber")
    protected Integer hourNumber;
    @XmlElement(name = "HourType")
    @XmlSchemaType(name = "string")
    protected HotelGiftHourTypeEnum hourType;

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
     * 获取bitSum4Week属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBitSum4Week() {
        return bitSum4Week;
    }

    /**
     * 设置bitSum4Week属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBitSum4Week(Integer value) {
        this.bitSum4Week = value;
    }

    /**
     * 获取dateType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link HotelGiftDateTypeEnum }
     *     
     */
    public HotelGiftDateTypeEnum getDateType() {
        return dateType;
    }

    /**
     * 设置dateType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link HotelGiftDateTypeEnum }
     *     
     */
    public void setDateType(HotelGiftDateTypeEnum value) {
        this.dateType = value;
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
     * 获取giftID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGiftID() {
        return giftID;
    }

    /**
     * 设置giftID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGiftID(Integer value) {
        this.giftID = value;
    }

    /**
     * 获取hourNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHourNumber() {
        return hourNumber;
    }

    /**
     * 设置hourNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHourNumber(Integer value) {
        this.hourNumber = value;
    }

    /**
     * 获取hourType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link HotelGiftHourTypeEnum }
     *     
     */
    public HotelGiftHourTypeEnum getHourType() {
        return hourType;
    }

    /**
     * 设置hourType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link HotelGiftHourTypeEnum }
     *     
     */
    public void setHourType(HotelGiftHourTypeEnum value) {
        this.hourType = value;
    }

}
