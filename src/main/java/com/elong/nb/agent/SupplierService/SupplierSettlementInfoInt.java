
package com.elong.nb.agent.SupplierService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>SupplierSettlementInfoInt complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SupplierSettlementInfoInt">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CurrencyType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SettlementModle" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SettlementType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SupplierForeignCurrencyBankInfo" type="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model}SupplierForeignCurrencyBankInfo" minOccurs="0"/>
 *         &lt;element name="SupplierRMBBankInfo" type="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model}SupplierRMBBankInfoInt" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SupplierSettlementInfoInt", namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model", propOrder = {
    "currencyCode",
    "currencyType",
    "settlementModle",
    "settlementType",
    "supplierForeignCurrencyBankInfo",
    "supplierRMBBankInfo"
})
public class SupplierSettlementInfoInt {

    @XmlElement(name = "CurrencyCode", nillable = true)
    protected String currencyCode;
    @XmlElement(name = "CurrencyType")
    protected Integer currencyType;
    @XmlElement(name = "SettlementModle")
    protected Integer settlementModle;
    @XmlElement(name = "SettlementType")
    protected Integer settlementType;
    @XmlElement(name = "SupplierForeignCurrencyBankInfo", nillable = true)
    protected SupplierForeignCurrencyBankInfo supplierForeignCurrencyBankInfo;
    @XmlElement(name = "SupplierRMBBankInfo", nillable = true)
    protected SupplierRMBBankInfoInt supplierRMBBankInfo;

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
     *     {@link Integer }
     *     
     */
    public Integer getCurrencyType() {
        return currencyType;
    }

    /**
     * 设置currencyType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCurrencyType(Integer value) {
        this.currencyType = value;
    }

    /**
     * 获取settlementModle属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSettlementModle() {
        return settlementModle;
    }

    /**
     * 设置settlementModle属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSettlementModle(Integer value) {
        this.settlementModle = value;
    }

    /**
     * 获取settlementType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSettlementType() {
        return settlementType;
    }

    /**
     * 设置settlementType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSettlementType(Integer value) {
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
     *     {@link SupplierRMBBankInfoInt }
     *     
     */
    public SupplierRMBBankInfoInt getSupplierRMBBankInfo() {
        return supplierRMBBankInfo;
    }

    /**
     * 设置supplierRMBBankInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SupplierRMBBankInfoInt }
     *     
     */
    public void setSupplierRMBBankInfo(SupplierRMBBankInfoInt value) {
        this.supplierRMBBankInfo = value;
    }

}
