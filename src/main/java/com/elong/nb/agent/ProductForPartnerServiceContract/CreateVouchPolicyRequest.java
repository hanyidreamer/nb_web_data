
package com.elong.nb.agent.ProductForPartnerServiceContract;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.joda.time.DateTime;


/**
 * <p>CreateVouchPolicyRequest complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="CreateVouchPolicyRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Request}CreateRatePalnPolicyBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ArriveEndTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ArriveStatTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DateType" type="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Enums}EnumDateType" minOccurs="0"/&gt;
 *         &lt;element name="HoursBeforeEarliest" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="HoursBeforeEarliest24" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="IsArriveTimeVouch" type="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Enums}EnumIsArriveTimeVouch" minOccurs="0"/&gt;
 *         &lt;element name="IsRoomCountVouch" type="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Enums}EnumIsRoomCountVouch" minOccurs="0"/&gt;
 *         &lt;element name="LatestDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="RoomMinCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="VouchMoneyType" type="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Enums}EnumVouchMoneyType" minOccurs="0"/&gt;
 *         &lt;element name="VouchRule" type="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Enums}EnumVouchRule" minOccurs="0"/&gt;
 *         &lt;element name="VouchWay" type="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Enums}EnumVouchWay" minOccurs="0"/&gt;
 *         &lt;element name="WeekDays" type="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Enums}WeekDays" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateVouchPolicyRequest", namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Request", propOrder = {
    "arriveEndTime",
    "arriveStatTime",
    "dateType",
    "hoursBeforeEarliest",
    "hoursBeforeEarliest24",
    "isArriveTimeVouch",
    "isRoomCountVouch",
    "latestDateTime",
    "roomMinCount",
    "vouchMoneyType",
    "vouchRule",
    "vouchWay",
    "weekDays"
})
public class CreateVouchPolicyRequest
    extends CreateRatePalnPolicyBase
{

    @XmlElement(name = "ArriveEndTime", nillable = true)
    protected String arriveEndTime;
    @XmlElement(name = "ArriveStatTime", nillable = true)
    protected String arriveStatTime;
    @XmlElement(name = "DateType")
    @XmlSchemaType(name = "string")
    protected EnumDateType dateType;
    @XmlElement(name = "HoursBeforeEarliest", nillable = true)
    protected Integer hoursBeforeEarliest;
    @XmlElement(name = "HoursBeforeEarliest24", nillable = true)
    protected Integer hoursBeforeEarliest24;
    @XmlElement(name = "IsArriveTimeVouch")
    @XmlSchemaType(name = "string")
    protected EnumIsArriveTimeVouch isArriveTimeVouch;
    @XmlElement(name = "IsRoomCountVouch")
    @XmlSchemaType(name = "string")
    protected EnumIsRoomCountVouch isRoomCountVouch;
    @XmlElement(name = "LatestDateTime", type = String.class, nillable = true)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected DateTime latestDateTime;
    @XmlElement(name = "RoomMinCount")
    protected Integer roomMinCount;
    @XmlElement(name = "VouchMoneyType")
    @XmlSchemaType(name = "string")
    protected EnumVouchMoneyType vouchMoneyType;
    @XmlElement(name = "VouchRule")
    @XmlSchemaType(name = "string")
    protected EnumVouchRule vouchRule;
    @XmlElement(name = "VouchWay")
    @XmlSchemaType(name = "string")
    protected EnumVouchWay vouchWay;
    @XmlList
    @XmlElement(name = "WeekDays")
    @XmlSchemaType(name = "anySimpleType")
    protected List<String> weekDays;

    /**
     * 获取arriveEndTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArriveEndTime() {
        return arriveEndTime;
    }

    /**
     * 设置arriveEndTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArriveEndTime(String value) {
        this.arriveEndTime = value;
    }

    /**
     * 获取arriveStatTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArriveStatTime() {
        return arriveStatTime;
    }

    /**
     * 设置arriveStatTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArriveStatTime(String value) {
        this.arriveStatTime = value;
    }

    /**
     * 获取dateType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link EnumDateType }
     *     
     */
    public EnumDateType getDateType() {
        return dateType;
    }

    /**
     * 设置dateType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link EnumDateType }
     *     
     */
    public void setDateType(EnumDateType value) {
        this.dateType = value;
    }

    /**
     * 获取hoursBeforeEarliest属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHoursBeforeEarliest() {
        return hoursBeforeEarliest;
    }

    /**
     * 设置hoursBeforeEarliest属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHoursBeforeEarliest(Integer value) {
        this.hoursBeforeEarliest = value;
    }

    /**
     * 获取hoursBeforeEarliest24属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHoursBeforeEarliest24() {
        return hoursBeforeEarliest24;
    }

    /**
     * 设置hoursBeforeEarliest24属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHoursBeforeEarliest24(Integer value) {
        this.hoursBeforeEarliest24 = value;
    }

    /**
     * 获取isArriveTimeVouch属性的值。
     * 
     * @return
     *     possible object is
     *     {@link EnumIsArriveTimeVouch }
     *     
     */
    public EnumIsArriveTimeVouch getIsArriveTimeVouch() {
        return isArriveTimeVouch;
    }

    /**
     * 设置isArriveTimeVouch属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link EnumIsArriveTimeVouch }
     *     
     */
    public void setIsArriveTimeVouch(EnumIsArriveTimeVouch value) {
        this.isArriveTimeVouch = value;
    }

    /**
     * 获取isRoomCountVouch属性的值。
     * 
     * @return
     *     possible object is
     *     {@link EnumIsRoomCountVouch }
     *     
     */
    public EnumIsRoomCountVouch getIsRoomCountVouch() {
        return isRoomCountVouch;
    }

    /**
     * 设置isRoomCountVouch属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link EnumIsRoomCountVouch }
     *     
     */
    public void setIsRoomCountVouch(EnumIsRoomCountVouch value) {
        this.isRoomCountVouch = value;
    }

    /**
     * 获取latestDateTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public DateTime getLatestDateTime() {
        return latestDateTime;
    }

    /**
     * 设置latestDateTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLatestDateTime(DateTime value) {
        this.latestDateTime = value;
    }

    /**
     * 获取roomMinCount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRoomMinCount() {
        return roomMinCount;
    }

    /**
     * 设置roomMinCount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRoomMinCount(Integer value) {
        this.roomMinCount = value;
    }

    /**
     * 获取vouchMoneyType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link EnumVouchMoneyType }
     *     
     */
    public EnumVouchMoneyType getVouchMoneyType() {
        return vouchMoneyType;
    }

    /**
     * 设置vouchMoneyType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link EnumVouchMoneyType }
     *     
     */
    public void setVouchMoneyType(EnumVouchMoneyType value) {
        this.vouchMoneyType = value;
    }

    /**
     * 获取vouchRule属性的值。
     * 
     * @return
     *     possible object is
     *     {@link EnumVouchRule }
     *     
     */
    public EnumVouchRule getVouchRule() {
        return vouchRule;
    }

    /**
     * 设置vouchRule属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link EnumVouchRule }
     *     
     */
    public void setVouchRule(EnumVouchRule value) {
        this.vouchRule = value;
    }

    /**
     * 获取vouchWay属性的值。
     * 
     * @return
     *     possible object is
     *     {@link EnumVouchWay }
     *     
     */
    public EnumVouchWay getVouchWay() {
        return vouchWay;
    }

    /**
     * 设置vouchWay属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link EnumVouchWay }
     *     
     */
    public void setVouchWay(EnumVouchWay value) {
        this.vouchWay = value;
    }

    /**
     * Gets the value of the weekDays property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the weekDays property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWeekDays().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getWeekDays() {
        if (weekDays == null) {
            weekDays = new ArrayList<String>();
        }
        return this.weekDays;
    }

}
