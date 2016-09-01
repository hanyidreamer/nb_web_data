
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
 * <p>DRRInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="DRRInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CNDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CNName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CheckInOrBookingDay" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ContinuingStayIn" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="DRRID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="DRRRule" type="{http://schemas.datacontract.org/2004/07/Com.Elong.Utility.Hotel.Enum}EnumDRRRule" minOccurs="0"/&gt;
 *         &lt;element name="DateType" type="{http://schemas.datacontract.org/2004/07/Com.Elong.Utility.Hotel.Enum}EnumDateType" minOccurs="0"/&gt;
 *         &lt;element name="ENDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ENName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="FeeType" type="{http://schemas.datacontract.org/2004/07/Com.Elong.Utility.Hotel.Enum}EnumFeeType" minOccurs="0"/&gt;
 *         &lt;element name="IndexOfStayIn" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="IsUseDrr" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsWeekEffective" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfint" minOccurs="0"/&gt;
 *         &lt;element name="MoneyOrPercent" type="{http://schemas.datacontract.org/2004/07/Com.Elong.Utility.Hotel.Enum}EnumMeasureUnit" minOccurs="0"/&gt;
 *         &lt;element name="MoneyOrPercentValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="RoomTypeIds" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RuleValues" type="{http://schemas.datacontract.org/2004/07/System.Collections}ArrayOfDictionaryEntry" minOccurs="0"/&gt;
 *         &lt;element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DRRInfo", namespace = "http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.Domain.Hotel.HotelProductUseBusiness", propOrder = {
    "cnDescription",
    "cnName",
    "checkInOrBookingDay",
    "continuingStayIn",
    "drrid",
    "drrRule",
    "dateType",
    "enDescription",
    "enName",
    "endDate",
    "feeType",
    "indexOfStayIn",
    "isUseDrr",
    "isWeekEffective",
    "moneyOrPercent",
    "moneyOrPercentValue",
    "roomTypeIds",
    "ruleValues",
    "startDate"
})
public class DRRInfo {

    @XmlElement(name = "CNDescription", nillable = true)
    protected String cnDescription;
    @XmlElement(name = "CNName", nillable = true)
    protected String cnName;
    @XmlElement(name = "CheckInOrBookingDay")
    protected Integer checkInOrBookingDay;
    @XmlElement(name = "ContinuingStayIn")
    protected Integer continuingStayIn;
    @XmlElement(name = "DRRID")
    protected Integer drrid;
    @XmlElement(name = "DRRRule")
    @XmlSchemaType(name = "string")
    protected EnumDRRRule drrRule;
    @XmlElement(name = "DateType")
    @XmlSchemaType(name = "string")
    protected EnumDateType dateType;
    @XmlElement(name = "ENDescription", nillable = true)
    protected String enDescription;
    @XmlElement(name = "ENName", nillable = true)
    protected String enName;
    @XmlElement(name = "EndDate", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected DateTime endDate;
    @XmlElement(name = "FeeType")
    @XmlSchemaType(name = "string")
    protected EnumFeeType feeType;
    @XmlElement(name = "IndexOfStayIn")
    protected Integer indexOfStayIn;
    @XmlElement(name = "IsUseDrr")
    protected Boolean isUseDrr;
    @XmlElement(name = "IsWeekEffective", nillable = true)
    protected ArrayOfint isWeekEffective;
    @XmlElement(name = "MoneyOrPercent")
    @XmlSchemaType(name = "string")
    protected EnumMeasureUnit moneyOrPercent;
    @XmlElement(name = "MoneyOrPercentValue")
    protected BigDecimal moneyOrPercentValue;
    @XmlElement(name = "RoomTypeIds", nillable = true)
    protected String roomTypeIds;
    @XmlElement(name = "RuleValues", nillable = true)
    protected ArrayOfDictionaryEntry ruleValues;
    @XmlElement(name = "StartDate", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected DateTime startDate;

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
     * 获取cnName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCNName() {
        return cnName;
    }

    /**
     * 设置cnName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCNName(String value) {
        this.cnName = value;
    }

    /**
     * 获取checkInOrBookingDay属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCheckInOrBookingDay() {
        return checkInOrBookingDay;
    }

    /**
     * 设置checkInOrBookingDay属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCheckInOrBookingDay(Integer value) {
        this.checkInOrBookingDay = value;
    }

    /**
     * 获取continuingStayIn属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getContinuingStayIn() {
        return continuingStayIn;
    }

    /**
     * 设置continuingStayIn属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setContinuingStayIn(Integer value) {
        this.continuingStayIn = value;
    }

    /**
     * 获取drrid属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDRRID() {
        return drrid;
    }

    /**
     * 设置drrid属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDRRID(Integer value) {
        this.drrid = value;
    }

    /**
     * 获取drrRule属性的值。
     * 
     * @return
     *     possible object is
     *     {@link EnumDRRRule }
     *     
     */
    public EnumDRRRule getDRRRule() {
        return drrRule;
    }

    /**
     * 设置drrRule属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link EnumDRRRule }
     *     
     */
    public void setDRRRule(EnumDRRRule value) {
        this.drrRule = value;
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
     * 获取enName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getENName() {
        return enName;
    }

    /**
     * 设置enName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setENName(String value) {
        this.enName = value;
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
     * 获取feeType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link EnumFeeType }
     *     
     */
    public EnumFeeType getFeeType() {
        return feeType;
    }

    /**
     * 设置feeType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link EnumFeeType }
     *     
     */
    public void setFeeType(EnumFeeType value) {
        this.feeType = value;
    }

    /**
     * 获取indexOfStayIn属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIndexOfStayIn() {
        return indexOfStayIn;
    }

    /**
     * 设置indexOfStayIn属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIndexOfStayIn(Integer value) {
        this.indexOfStayIn = value;
    }

    /**
     * 获取isUseDrr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsUseDrr() {
        return isUseDrr;
    }

    /**
     * 设置isUseDrr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsUseDrr(Boolean value) {
        this.isUseDrr = value;
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
     * 获取moneyOrPercent属性的值。
     * 
     * @return
     *     possible object is
     *     {@link EnumMeasureUnit }
     *     
     */
    public EnumMeasureUnit getMoneyOrPercent() {
        return moneyOrPercent;
    }

    /**
     * 设置moneyOrPercent属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link EnumMeasureUnit }
     *     
     */
    public void setMoneyOrPercent(EnumMeasureUnit value) {
        this.moneyOrPercent = value;
    }

    /**
     * 获取moneyOrPercentValue属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMoneyOrPercentValue() {
        return moneyOrPercentValue;
    }

    /**
     * 设置moneyOrPercentValue属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMoneyOrPercentValue(BigDecimal value) {
        this.moneyOrPercentValue = value;
    }

    /**
     * 获取roomTypeIds属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomTypeIds() {
        return roomTypeIds;
    }

    /**
     * 设置roomTypeIds属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomTypeIds(String value) {
        this.roomTypeIds = value;
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

}
