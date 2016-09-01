
package com.elong.nb.agent.SupplierService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>SupplierForeignCurrencyBankInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SupplierForeignCurrencyBankInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BankSwiftCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ForeignBankAccountName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ForeignBankAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ForeignBankAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ForeignBankName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SupplierForeignCurrencyBankInfo", namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model", propOrder = {
    "bankSwiftCode",
    "foreignBankAccountName",
    "foreignBankAccountNumber",
    "foreignBankAddress",
    "foreignBankName"
})
public class SupplierForeignCurrencyBankInfo {

    @XmlElement(name = "BankSwiftCode", nillable = true)
    protected String bankSwiftCode;
    @XmlElement(name = "ForeignBankAccountName", nillable = true)
    protected String foreignBankAccountName;
    @XmlElement(name = "ForeignBankAccountNumber", nillable = true)
    protected String foreignBankAccountNumber;
    @XmlElement(name = "ForeignBankAddress", nillable = true)
    protected String foreignBankAddress;
    @XmlElement(name = "ForeignBankName", nillable = true)
    protected String foreignBankName;

    /**
     * 获取bankSwiftCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankSwiftCode() {
        return bankSwiftCode;
    }

    /**
     * 设置bankSwiftCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankSwiftCode(String value) {
        this.bankSwiftCode = value;
    }

    /**
     * 获取foreignBankAccountName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForeignBankAccountName() {
        return foreignBankAccountName;
    }

    /**
     * 设置foreignBankAccountName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForeignBankAccountName(String value) {
        this.foreignBankAccountName = value;
    }

    /**
     * 获取foreignBankAccountNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForeignBankAccountNumber() {
        return foreignBankAccountNumber;
    }

    /**
     * 设置foreignBankAccountNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForeignBankAccountNumber(String value) {
        this.foreignBankAccountNumber = value;
    }

    /**
     * 获取foreignBankAddress属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForeignBankAddress() {
        return foreignBankAddress;
    }

    /**
     * 设置foreignBankAddress属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForeignBankAddress(String value) {
        this.foreignBankAddress = value;
    }

    /**
     * 获取foreignBankName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForeignBankName() {
        return foreignBankName;
    }

    /**
     * 设置foreignBankName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForeignBankName(String value) {
        this.foreignBankName = value;
    }

}
