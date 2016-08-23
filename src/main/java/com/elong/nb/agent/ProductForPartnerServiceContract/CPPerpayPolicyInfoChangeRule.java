
package com.elong.nb.agent.ProductForPartnerServiceContract;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.joda.time.DateTime;


/**
 * <p>CP_PerpayPolicyInfo.ChangeRule complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="CP_PerpayPolicyInfo.ChangeRule"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CutTypeAfter" type="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Enums}EnumCutType" minOccurs="0"/&gt;
 *         &lt;element name="CutTypeBefore" type="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Enums}EnumCutType" minOccurs="0"/&gt;
 *         &lt;element name="DateTimeBefore" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="DeductNumAfter" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="DeductNumBefore" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="HourNum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="HourNum2" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="IsDeductFeesAfter" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsDeductFeesBefore" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PrepayRule" type="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Enums}EnumPrepayRule" minOccurs="0"/&gt;
 *         &lt;element name="RuleTarget" type="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Enums}EnumRuleTarget" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CP_PerpayPolicyInfo.ChangeRule", namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model", propOrder = {
    "cutTypeAfter",
    "cutTypeBefore",
    "dateTimeBefore",
    "deductNumAfter",
    "deductNumBefore",
    "hourNum",
    "hourNum2",
    "isDeductFeesAfter",
    "isDeductFeesBefore",
    "prepayRule",
    "ruleTarget"
})
public class CPPerpayPolicyInfoChangeRule {

    @XmlElement(name = "CutTypeAfter", nillable = true)
    @XmlSchemaType(name = "string")
    protected EnumCutType cutTypeAfter;
    @XmlElement(name = "CutTypeBefore", nillable = true)
    @XmlSchemaType(name = "string")
    protected EnumCutType cutTypeBefore;
    @XmlElement(name = "DateTimeBefore", type = String.class, nillable = true)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected DateTime dateTimeBefore;
    @XmlElement(name = "DeductNumAfter", nillable = true)
    protected BigDecimal deductNumAfter;
    @XmlElement(name = "DeductNumBefore", nillable = true)
    protected BigDecimal deductNumBefore;
    @XmlElement(name = "HourNum")
    protected Integer hourNum;
    @XmlElement(name = "HourNum2")
    protected Integer hourNum2;
    @XmlElement(name = "IsDeductFeesAfter")
    protected Boolean isDeductFeesAfter;
    @XmlElement(name = "IsDeductFeesBefore")
    protected Boolean isDeductFeesBefore;
    @XmlElement(name = "PrepayRule")
    @XmlSchemaType(name = "string")
    protected EnumPrepayRule prepayRule;
    @XmlElement(name = "RuleTarget")
    @XmlSchemaType(name = "string")
    protected EnumRuleTarget ruleTarget;

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
     * 获取cutTypeBefore属性的值。
     * 
     * @return
     *     possible object is
     *     {@link EnumCutType }
     *     
     */
    public EnumCutType getCutTypeBefore() {
        return cutTypeBefore;
    }

    /**
     * 设置cutTypeBefore属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link EnumCutType }
     *     
     */
    public void setCutTypeBefore(EnumCutType value) {
        this.cutTypeBefore = value;
    }

    /**
     * 获取dateTimeBefore属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public DateTime getDateTimeBefore() {
        return dateTimeBefore;
    }

    /**
     * 设置dateTimeBefore属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateTimeBefore(DateTime value) {
        this.dateTimeBefore = value;
    }

    /**
     * 获取deductNumAfter属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDeductNumAfter() {
        return deductNumAfter;
    }

    /**
     * 设置deductNumAfter属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDeductNumAfter(BigDecimal value) {
        this.deductNumAfter = value;
    }

    /**
     * 获取deductNumBefore属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDeductNumBefore() {
        return deductNumBefore;
    }

    /**
     * 设置deductNumBefore属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDeductNumBefore(BigDecimal value) {
        this.deductNumBefore = value;
    }

    /**
     * 获取hourNum属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHourNum() {
        return hourNum;
    }

    /**
     * 设置hourNum属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHourNum(Integer value) {
        this.hourNum = value;
    }

    /**
     * 获取hourNum2属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHourNum2() {
        return hourNum2;
    }

    /**
     * 设置hourNum2属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHourNum2(Integer value) {
        this.hourNum2 = value;
    }

    /**
     * 获取isDeductFeesAfter属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsDeductFeesAfter() {
        return isDeductFeesAfter;
    }

    /**
     * 设置isDeductFeesAfter属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsDeductFeesAfter(Boolean value) {
        this.isDeductFeesAfter = value;
    }

    /**
     * 获取isDeductFeesBefore属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsDeductFeesBefore() {
        return isDeductFeesBefore;
    }

    /**
     * 设置isDeductFeesBefore属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsDeductFeesBefore(Boolean value) {
        this.isDeductFeesBefore = value;
    }

    /**
     * 获取prepayRule属性的值。
     * 
     * @return
     *     possible object is
     *     {@link EnumPrepayRule }
     *     
     */
    public EnumPrepayRule getPrepayRule() {
        return prepayRule;
    }

    /**
     * 设置prepayRule属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link EnumPrepayRule }
     *     
     */
    public void setPrepayRule(EnumPrepayRule value) {
        this.prepayRule = value;
    }

    /**
     * 获取ruleTarget属性的值。
     * 
     * @return
     *     possible object is
     *     {@link EnumRuleTarget }
     *     
     */
    public EnumRuleTarget getRuleTarget() {
        return ruleTarget;
    }

    /**
     * 设置ruleTarget属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link EnumRuleTarget }
     *     
     */
    public void setRuleTarget(EnumRuleTarget value) {
        this.ruleTarget = value;
    }

}
