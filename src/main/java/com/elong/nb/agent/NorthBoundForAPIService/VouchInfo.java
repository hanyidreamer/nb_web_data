
package com.elong.nb.agent.NorthBoundForAPIService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.joda.time.DateTime;


/**
 * <p>VouchInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="VouchInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ArriveEndTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ArriveStartTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CNDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DateType" type="{http://schemas.datacontract.org/2004/07/Com.Elong.Utility.Hotel.Enum}EnumDateType" minOccurs="0"/&gt;
 *         &lt;element name="ENDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="IsArriveTimeVouch" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsRoomCountVouch" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsWeekEffective" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfint" minOccurs="0"/&gt;
 *         &lt;element name="LasrCannelTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="Mode" type="{http://schemas.datacontract.org/2004/07/Com.Elong.Utility.Hotel.Enum}EnumVouchWay" minOccurs="0"/&gt;
 *         &lt;element name="RatePlanID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RoomCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RuleDataDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="RuleDataInt" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RuleDataString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RuleValues" type="{http://schemas.datacontract.org/2004/07/System.Collections}ArrayOfDictionaryEntry" minOccurs="0"/&gt;
 *         &lt;element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="VouchChangeRule" type="{http://schemas.datacontract.org/2004/07/Com.Elong.Utility.Hotel.Enum}EnumVouchRule" minOccurs="0"/&gt;
 *         &lt;element name="VouchMoneyType" type="{http://schemas.datacontract.org/2004/07/Com.Elong.Utility.Hotel.Enum}EnumVouchMoneyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VouchInfo", namespace = "http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.Domain.Hotel.HotelProductUseBusiness", propOrder = {
    "arriveEndTime",
    "arriveStartTime",
    "cnDescription",
    "dateType",
    "enDescription",
    "endDate",
    "id",
    "isArriveTimeVouch",
    "isRoomCountVouch",
    "isWeekEffective",
    "lasrCannelTime",
    "mode",
    "ratePlanID",
    "roomCount",
    "ruleDataDateTime",
    "ruleDataInt",
    "ruleDataString",
    "ruleValues",
    "startDate",
    "vouchChangeRule",
    "vouchMoneyType"
})
public class VouchInfo {

    @XmlElement(name = "ArriveEndTime", nillable = true)
    protected String arriveEndTime;
    @XmlElement(name = "ArriveStartTime", nillable = true)
    protected String arriveStartTime;
    @XmlElement(name = "CNDescription", nillable = true)
    protected String cnDescription;
    @XmlElement(name = "DateType")
    @XmlSchemaType(name = "string")
    protected EnumDateType dateType;
    @XmlElement(name = "ENDescription", nillable = true)
    protected String enDescription;
    @XmlElement(name = "EndDate", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected DateTime endDate;
    @XmlElement(name = "ID")
    protected Integer id;
    @XmlElement(name = "IsArriveTimeVouch")
    protected Boolean isArriveTimeVouch;
    @XmlElement(name = "IsRoomCountVouch")
    protected Boolean isRoomCountVouch;
    @XmlElement(name = "IsWeekEffective", nillable = true)
    protected ArrayOfint isWeekEffective;
    @XmlElement(name = "LasrCannelTime", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected DateTime lasrCannelTime;
    @XmlElement(name = "Mode")
    @XmlSchemaType(name = "string")
    protected EnumVouchWay mode;
    @XmlElement(name = "RatePlanID")
    protected Integer ratePlanID;
    @XmlElement(name = "RoomCount")
    protected Integer roomCount;
    @XmlElement(name = "RuleDataDateTime", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected DateTime ruleDataDateTime;
    @XmlElement(name = "RuleDataInt")
    protected Integer ruleDataInt;
    @XmlElement(name = "RuleDataString", nillable = true)
    protected String ruleDataString;
    @XmlElement(name = "RuleValues", nillable = true)
    protected ArrayOfDictionaryEntry ruleValues;
    @XmlElement(name = "StartDate", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected DateTime startDate;
    @XmlElement(name = "VouchChangeRule")
    @XmlSchemaType(name = "string")
    protected EnumVouchRule vouchChangeRule;
    @XmlElement(name = "VouchMoneyType")
    @XmlSchemaType(name = "string")
    protected EnumVouchMoneyType vouchMoneyType;

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
     * 获取arriveStartTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArriveStartTime() {
        return arriveStartTime;
    }

    /**
     * 设置arriveStartTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArriveStartTime(String value) {
        this.arriveStartTime = value;
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
     * 获取enDescription属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getENDescription() {
        return enDescription;
    }

    /**
     * 设置enDescription属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setENDescription(String value) {
        this.enDescription = value;
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
     * 获取id属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getID() {
        return id;
    }

    /**
     * 设置id属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setID(Integer value) {
        this.id = value;
    }

    /**
     * 获取isArriveTimeVouch属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsArriveTimeVouch() {
        return isArriveTimeVouch;
    }

    /**
     * 设置isArriveTimeVouch属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsArriveTimeVouch(Boolean value) {
        this.isArriveTimeVouch = value;
    }

    /**
     * 获取isRoomCountVouch属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsRoomCountVouch() {
        return isRoomCountVouch;
    }

    /**
     * 设置isRoomCountVouch属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsRoomCountVouch(Boolean value) {
        this.isRoomCountVouch = value;
    }

    /**
     * 获取isWeekEffective属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfint }
     *     
     */
    public ArrayOfint getIsWeekEffective() {
        return isWeekEffective;
    }

    /**
     * 设置isWeekEffective属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfint }
     *     
     */
    public void setIsWeekEffective(ArrayOfint value) {
        this.isWeekEffective = value;
    }

    /**
     * 获取lasrCannelTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public DateTime getLasrCannelTime() {
        return lasrCannelTime;
    }

    /**
     * 设置lasrCannelTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLasrCannelTime(DateTime value) {
        this.lasrCannelTime = value;
    }

    /**
     * 获取mode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link EnumVouchWay }
     *     
     */
    public EnumVouchWay getMode() {
        return mode;
    }

    /**
     * 设置mode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link EnumVouchWay }
     *     
     */
    public void setMode(EnumVouchWay value) {
        this.mode = value;
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
     * 获取roomCount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRoomCount() {
        return roomCount;
    }

    /**
     * 设置roomCount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRoomCount(Integer value) {
        this.roomCount = value;
    }

    /**
     * 获取ruleDataDateTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public DateTime getRuleDataDateTime() {
        return ruleDataDateTime;
    }

    /**
     * 设置ruleDataDateTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRuleDataDateTime(DateTime value) {
        this.ruleDataDateTime = value;
    }

    /**
     * 获取ruleDataInt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRuleDataInt() {
        return ruleDataInt;
    }

    /**
     * 设置ruleDataInt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRuleDataInt(Integer value) {
        this.ruleDataInt = value;
    }

    /**
     * 获取ruleDataString属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRuleDataString() {
        return ruleDataString;
    }

    /**
     * 设置ruleDataString属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRuleDataString(String value) {
        this.ruleDataString = value;
    }

    /**
     * 获取ruleValues属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDictionaryEntry }
     *     
     */
    public ArrayOfDictionaryEntry getRuleValues() {
        return ruleValues;
    }

    /**
     * 设置ruleValues属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDictionaryEntry }
     *     
     */
    public void setRuleValues(ArrayOfDictionaryEntry value) {
        this.ruleValues = value;
    }

    /**
     * 获取startDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public DateTime getStartDate() {
        return startDate;
    }

    /**
     * 设置startDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartDate(DateTime value) {
        this.startDate = value;
    }

    /**
     * 获取vouchChangeRule属性的值。
     * 
     * @return
     *     possible object is
     *     {@link EnumVouchRule }
     *     
     */
    public EnumVouchRule getVouchChangeRule() {
        return vouchChangeRule;
    }

    /**
     * 设置vouchChangeRule属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link EnumVouchRule }
     *     
     */
    public void setVouchChangeRule(EnumVouchRule value) {
        this.vouchChangeRule = value;
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

}
