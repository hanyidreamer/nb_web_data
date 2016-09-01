
package com.elong.nb.agent.SupplierService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>SupplierSettlementInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SupplierSettlementInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CurrencyType" type="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Enums}CurrencyType" minOccurs="0"/>
 *         &lt;element name="CurrencyTypeNum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SettlementModle" type="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Enums}SettlementModle" minOccurs="0"/>
 *         &lt;element name="SettlementType" type="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Enums}SettlementCycleEnum" minOccurs="0"/>
 *         &lt;element name="SupplierForeignCurrencyBankInfo" type="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model}SupplierForeignCurrencyBankInfo" minOccurs="0"/>
 *         &lt;element name="SupplierRMBBankInfo" type="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model}SupplierRMBBankInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SupplierSettlementInfo", namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model", propOrder = {
    "currencyCode",
    "currencyType",
    "currencyTypeNum",
    "settlementModle",
    "settlementType",
    "supplierForeignCurrencyBankInfo",
    "supplierRMBBankInfo"
})
public class SupplierSettlementInfo {

    @XmlElement(name = "CurrencyCode", nillable = true)
    protected String currencyCode;
    @XmlElement(name = "CurrencyType")
    @XmlSchemaType(name = "string")
    protected CurrencyType currencyType;
    @XmlElement(name = "CurrencyTypeNum")
    protected Integer currencyTypeNum;
    @XmlElement(name = "SettlementModle")
    @XmlSchemaType(name = "string")
    protected SettlementModle settlementModle;
    @XmlElement(name = "SettlementType")
    @XmlSchemaType(name = "string")
    protected SettlementCycleEnum settlementType;
    @XmlElement(name = "SupplierForeignCurrencyBankInfo", nillable = true)
    protected SupplierForeignCurrencyBankInfo supplierForeignCurrencyBankInfo;
    @XmlElement(name = "SupplierRMBBankInfo", nillable = true)
    protected SupplierRMBBankInfo supplierRMBBankInfo;

    /**
     * 获取currencyCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * 设置currencyCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyCode(String value) {
        this.currencyCode = value;
    }

    /**
     * 获取currencyType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CurrencyType }
     *     
     */
    public CurrencyType getCurrencyType() {
        return currencyType;
    }

    /**
     * 设置currencyType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyType }
     *     
     */
    public void setCurrencyType(CurrencyType value) {
        this.currencyType = value;
    }

    /**
     * 获取currencyTypeNum属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCurrencyTypeNum() {
        return currencyTypeNum;
    }

    /**
     * 设置currencyTypeNum属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCurrencyTypeNum(Integer value) {
        this.currencyTypeNum = value;
    }

    /**
     * 获取settlementModle属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SettlementModle }
     *     
     */
    public SettlementModle getSettlementModle() {
        return settlementModle;
    }

    /**
     * 设置settlementModle属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementModle }
     *     
     */
    public void setSettlementModle(SettlementModle value) {
        this.settlementModle = value;
    }

    /**
     * 获取settlementType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SettlementCycleEnum }
     *     
     */
    public SettlementCycleEnum getSettlementType() {
        return settlementType;
    }

    /**
     * 设置settlementType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementCycleEnum }
     *     
     */
    public void setSettlementType(SettlementCycleEnum value) {
        this.settlementType = value;
    }

    /**
     * 获取supplierForeignCurrencyBankInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SupplierForeignCurrencyBankInfo }
     *     
     */
    public SupplierForeignCurrencyBankInfo getSupplierForeignCurrencyBankInfo() {
        return supplierForeignCurrencyBankInfo;
    }

    /**
     * 设置supplierForeignCurrencyBankInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SupplierForeignCurrencyBankInfo }
     *     
     */
    public void setSupplierForeignCurrencyBankInfo(SupplierForeignCurrencyBankInfo value) {
        this.supplierForeignCurrencyBankInfo = value;
    }

    /**
     * 获取supplierRMBBankInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SupplierRMBBankInfo }
     *     
     */
    public SupplierRMBBankInfo getSupplierRMBBankInfo() {
        return supplierRMBBankInfo;
    }

    /**
     * 设置supplierRMBBankInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SupplierRMBBankInfo }
     *     
     */
    public void setSupplierRMBBankInfo(SupplierRMBBankInfo value) {
        this.supplierRMBBankInfo = value;
    }

}
