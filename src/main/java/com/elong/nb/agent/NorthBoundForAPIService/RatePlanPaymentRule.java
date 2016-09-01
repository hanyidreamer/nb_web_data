
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
 * <p>RatePlanPaymentRule complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="RatePlanPaymentRule"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CouponAmountLimit" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="LimitType" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="LimitValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="OperateIP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OperateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="OperatorName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PaymentRuleID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="PaymentType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RatePlanCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RatePlanID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RatePlanPaymentRule", namespace = "http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.Domain.Hotel", propOrder = {
    "couponAmountLimit",
    "limitType",
    "limitValue",
    "operateIP",
    "operateTime",
    "operatorName",
    "paymentRuleID",
    "paymentType",
    "ratePlanCode",
    "ratePlanID"
})
public class RatePlanPaymentRule {

    @XmlElement(name = "CouponAmountLimit", nillable = true)
    protected BigDecimal couponAmountLimit;
    @XmlElement(name = "LimitType", nillable = true)
    protected Short limitType;
    @XmlElement(name = "LimitValue", nillable = true)
    protected BigDecimal limitValue;
    @XmlElement(name = "OperateIP", nillable = true)
    protected String operateIP;
    @XmlElement(name = "OperateTime", type = String.class, nillable = true)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected DateTime operateTime;
    @XmlElement(name = "OperatorName", nillable = true)
    protected String operatorName;
    @XmlElement(name = "PaymentRuleID")
    protected Integer paymentRuleID;
    @XmlElement(name = "PaymentType", nillable = true)
    protected String paymentType;
    @XmlElement(name = "RatePlanCode", nillable = true)
    protected String ratePlanCode;
    @XmlElement(name = "RatePlanID")
    protected Integer ratePlanID;

    /**
     * 获取couponAmountLimit属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCouponAmountLimit() {
        return couponAmountLimit;
    }

    /**
     * 设置couponAmountLimit属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCouponAmountLimit(BigDecimal value) {
        this.couponAmountLimit = value;
    }

    /**
     * 获取limitType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getLimitType() {
        return limitType;
    }

    /**
     * 设置limitType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setLimitType(Short value) {
        this.limitType = value;
    }

    /**
     * 获取limitValue属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLimitValue() {
        return limitValue;
    }

    /**
     * 设置limitValue属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLimitValue(BigDecimal value) {
        this.limitValue = value;
    }

    /**
     * 获取operateIP属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperateIP() {
        return operateIP;
    }

    /**
     * 设置operateIP属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperateIP(String value) {
        this.operateIP = value;
    }

    /**
     * 获取operateTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public DateTime getOperateTime() {
        return operateTime;
    }

    /**
     * 设置operateTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperateTime(DateTime value) {
        this.operateTime = value;
    }

    /**
     * 获取operatorName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperatorName() {
        return operatorName;
    }

    /**
     * 设置operatorName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperatorName(String value) {
        this.operatorName = value;
    }

    /**
     * 获取paymentRuleID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPaymentRuleID() {
        return paymentRuleID;
    }

    /**
     * 设置paymentRuleID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPaymentRuleID(Integer value) {
        this.paymentRuleID = value;
    }

    /**
     * 获取paymentType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentType() {
        return paymentType;
    }

    /**
     * 设置paymentType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentType(String value) {
        this.paymentType = value;
    }

    /**
     * 获取ratePlanCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRatePlanCode() {
        return ratePlanCode;
    }

    /**
     * 设置ratePlanCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRatePlanCode(String value) {
        this.ratePlanCode = value;
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

}
