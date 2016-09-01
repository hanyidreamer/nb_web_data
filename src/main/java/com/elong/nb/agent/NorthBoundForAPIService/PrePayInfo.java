
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
 * <p>PrePayInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="PrePayInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CNDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CutAfterChangeTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CutBeforChangeTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CutNumAfter" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="CutNumBefor" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="CutTypeAfter" type="{http://schemas.datacontract.org/2004/07/Com.Elong.Utility.Hotel.Enum}EnumCutType" minOccurs="0"/&gt;
 *         &lt;element name="CutTypeBefor" type="{http://schemas.datacontract.org/2004/07/Com.Elong.Utility.Hotel.Enum}EnumCutType" minOccurs="0"/&gt;
 *         &lt;element name="DateType" type="{http://schemas.datacontract.org/2004/07/Com.Elong.Utility.Hotel.Enum}EnumDateType" minOccurs="0"/&gt;
 *         &lt;element name="ENDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="IsWeekEffective" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfint" minOccurs="0"/&gt;
 *         &lt;element name="LasrCannelTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="PrepayChangeRule" type="{http://schemas.datacontract.org/2004/07/Com.Elong.Utility.Hotel.Enum}EnumPrepayRule" minOccurs="0"/&gt;
 *         &lt;element name="RatePlanID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RuleDataDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="RuleDataInt" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RuleDataSecondInt" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RuleDataString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RuleValues" type="{http://schemas.datacontract.org/2004/07/System.Collections}ArrayOfDictionaryEntry" minOccurs="0"/&gt;
 *         &lt;element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="Target" type="{http://schemas.datacontract.org/2004/07/Com.Elong.Utility.Hotel.Enum}EnumRuleTarget" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PrePayInfo", namespace = "http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.Domain.Hotel.HotelProductUseBusiness", propOrder = {
    "cnDescription",
    "cutAfterChangeTime",
    "cutBeforChangeTime",
    "cutNumAfter",
    "cutNumBefor",
    "cutTypeAfter",
    "cutTypeBefor",
    "dateType",
    "enDescription",
    "endDate",
    "id",
    "isWeekEffective",
    "lasrCannelTime",
    "prepayChangeRule",
    "ratePlanID",
    "ruleDataDateTime",
    "ruleDataInt",
    "ruleDataSecondInt",
    "ruleDataString",
    "ruleValues",
    "startDate",
    "target"
})
public class PrePayInfo {

    @XmlElement(name = "CNDescription", nillable = true)
    protected String cnDescription;
    @XmlElement(name = "CutAfterChangeTime")
    protected Boolean cutAfterChangeTime;
    @XmlElement(name = "CutBeforChangeTime")
    protected Boolean cutBeforChangeTime;
    @XmlElement(name = "CutNumAfter")
    protected BigDecimal cutNumAfter;
    @XmlElement(name = "CutNumBefor")
    protected BigDecimal cutNumBefor;
    @XmlElement(name = "CutTypeAfter")
    @XmlSchemaType(name = "string")
    protected EnumCutType cutTypeAfter;
    @XmlElement(name = "CutTypeBefor")
    @XmlSchemaType(name = "string")
    protected EnumCutType cutTypeBefor;
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
    @XmlElement(name = "IsWeekEffective", nillable = true)
    protected ArrayOfint isWeekEffective;
    @XmlElement(name = "LasrCannelTime", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected DateTime lasrCannelTime;
    @XmlElement(name = "PrepayChangeRule")
    @XmlSchemaType(name = "string")
    protected EnumPrepayRule prepayChangeRule;
    @XmlElement(name = "RatePlanID")
    protected Integer ratePlanID;
    @XmlElement(name = "RuleDataDateTime", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected DateTime ruleDataDateTime;
    @XmlElement(name = "RuleDataInt")
    protected Integer ruleDataInt;
    @XmlElement(name = "RuleDataSecondInt")
    protected Integer ruleDataSecondInt;
    @XmlElement(name = "RuleDataString", nillable = true)
    protected String ruleDataString;
    @XmlElement(name = "RuleValues", nillable = true)
    protected ArrayOfDictionaryEntry ruleValues;
    @XmlElement(name = "StartDate", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected DateTime startDate;
    @XmlElement(name = "Target")
    @XmlSchemaType(name = "string")
    protected EnumRuleTarget target;

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
     * 获取cutAfterChangeTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCutAfterChangeTime() {
        return cutAfterChangeTime;
    }

    /**
     * 设置cutAfterChangeTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCutAfterChangeTime(Boolean value) {
        this.cutAfterChangeTime = value;
    }

    /**
     * 获取cutBeforChangeTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCutBeforChangeTime() {
        return cutBeforChangeTime;
    }

    /**
     * 设置cutBeforChangeTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCutBeforChangeTime(Boolean value) {
        this.cutBeforChangeTime = value;
    }

    /**
     * 获取cutNumAfter属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCutNumAfter() {
        return cutNumAfter;
    }

    /**
     * 设置cutNumAfter属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCutNumAfter(BigDecimal value) {
        this.cutNumAfter = value;
    }

    /**
     * 获取cutNumBefor属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCutNumBefor() {
        return cutNumBefor;
    }

    /**
     * 设置cutNumBefor属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCutNumBefor(BigDecimal value) {
        this.cutNumBefor = value;
    }

    /**
     * 获取cutTypeAfter属性的值。
     * 
     * @return
     *     possible object is
     *     {@link EnumCutType }
     *     
     */
    public EnumCutType getCutTypeAfter() {
        return cutTypeAfter;
    }

    /**
     * 设置cutTypeAfter属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link EnumCutType }
     *     
     */
    public void setCutTypeAfter(EnumCutType value) {
        this.cutTypeAfter = value;
    }

    /**
     * 获取cutTypeBefor属性的值。
     * 
     * @return
     *     possible object is
     *     {@link EnumCutType }
     *     
     */
    public EnumCutType getCutTypeBefor() {
        return cutTypeBefor;
    }

    /**
     * 设置cutTypeBefor属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link EnumCutType }
     *     
     */
    public void setCutTypeBefor(EnumCutType value) {
        this.cutTypeBefor = value;
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
     * 获取prepayChangeRule属性的值。
     * 
     * @return
     *     possible object is
     *     {@link EnumPrepayRule }
     *     
     */
    public EnumPrepayRule getPrepayChangeRule() {
        return prepayChangeRule;
    }

    /**
     * 设置prepayChangeRule属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link EnumPrepayRule }
     *     
     */
    public void setPrepayChangeRule(EnumPrepayRule value) {
        this.prepayChangeRule = value;
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
     * 获取ruleDataSecondInt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRuleDataSecondInt() {
        return ruleDataSecondInt;
    }

    /**
     * 设置ruleDataSecondInt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRuleDataSecondInt(Integer value) {
        this.ruleDataSecondInt = value;
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
     * 获取target属性的值。
     * 
     * @return
     *     possible object is
     *     {@link EnumRuleTarget }
     *     
     */
    public EnumRuleTarget getTarget() {
        return target;
    }

    /**
     * 设置target属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link EnumRuleTarget }
     *     
     */
    public void setTarget(EnumRuleTarget value) {
        this.target = value;
    }

}
