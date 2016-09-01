
package com.elong.nb.agent.SupplierService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>SupplierRMBBankInfoInt complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SupplierRMBBankInfoInt">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AccountPayType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="AccountPayeeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AccountPayeeNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AccountPayeeType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="AliyPayAccountName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AliyPayAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BankID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="BankName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Bank_CityID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Bank_CityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Bank_CountryID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Bank_CountryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Bank_ProvinceID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Bank_ProvinceName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NoticeMobilePhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SubBranch" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TenPayAccountName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TenPayAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SupplierRMBBankInfoInt", namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model", propOrder = {
    "accountPayType",
    "accountPayeeName",
    "accountPayeeNumber",
    "accountPayeeType",
    "aliyPayAccountName",
    "aliyPayAccountNumber",
    "bankID",
    "bankName",
    "bankCityID",
    "bankCityName",
    "bankCountryID",
    "bankCountryName",
    "bankProvinceID",
    "bankProvinceName",
    "noticeMobilePhone",
    "subBranch",
    "tenPayAccountName",
    "tenPayAccountNumber"
})
public class SupplierRMBBankInfoInt {

    @XmlElement(name = "AccountPayType")
    protected Integer accountPayType;
    @XmlElement(name = "AccountPayeeName", nillable = true)
    protected String accountPayeeName;
    @XmlElement(name = "AccountPayeeNumber", nillable = true)
    protected String accountPayeeNumber;
    @XmlElement(name = "AccountPayeeType")
    protected Integer accountPayeeType;
    @XmlElement(name = "AliyPayAccountName", nillable = true)
    protected String aliyPayAccountName;
    @XmlElement(name = "AliyPayAccountNumber", nillable = true)
    protected String aliyPayAccountNumber;
    @XmlElement(name = "BankID")
    protected Integer bankID;
    @XmlElement(name = "BankName", nillable = true)
    protected String bankName;
    @XmlElement(name = "Bank_CityID", nillable = true)
    protected String bankCityID;
    @XmlElement(name = "Bank_CityName", nillable = true)
    protected String bankCityName;
    @XmlElement(name = "Bank_CountryID", nillable = true)
    protected String bankCountryID;
    @XmlElement(name = "Bank_CountryName", nillable = true)
    protected String bankCountryName;
    @XmlElement(name = "Bank_ProvinceID", nillable = true)
    protected String bankProvinceID;
    @XmlElement(name = "Bank_ProvinceName", nillable = true)
    protected String bankProvinceName;
    @XmlElement(name = "NoticeMobilePhone", nillable = true)
    protected String noticeMobilePhone;
    @XmlElement(name = "SubBranch", nillable = true)
    protected String subBranch;
    @XmlElement(name = "TenPayAccountName", nillable = true)
    protected String tenPayAccountName;
    @XmlElement(name = "TenPayAccountNumber", nillable = true)
    protected String tenPayAccountNumber;

    /**
     * 获取accountPayType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAccountPayType() {
        return accountPayType;
    }

    /**
     * 设置accountPayType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAccountPayType(Integer value) {
        this.accountPayType = value;
    }

    /**
     * 获取accountPayeeName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountPayeeName() {
        return accountPayeeName;
    }

    /**
     * 设置accountPayeeName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountPayeeName(String value) {
        this.accountPayeeName = value;
    }

    /**
     * 获取accountPayeeNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountPayeeNumber() {
        return accountPayeeNumber;
    }

    /**
     * 设置accountPayeeNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountPayeeNumber(String value) {
        this.accountPayeeNumber = value;
    }

    /**
     * 获取accountPayeeType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAccountPayeeType() {
        return accountPayeeType;
    }

    /**
     * 设置accountPayeeType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAccountPayeeType(Integer value) {
        this.accountPayeeType = value;
    }

    /**
     * 获取aliyPayAccountName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAliyPayAccountName() {
        return aliyPayAccountName;
    }

    /**
     * 设置aliyPayAccountName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAliyPayAccountName(String value) {
        this.aliyPayAccountName = value;
    }

    /**
     * 获取aliyPayAccountNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAliyPayAccountNumber() {
        return aliyPayAccountNumber;
    }

    /**
     * 设置aliyPayAccountNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAliyPayAccountNumber(String value) {
        this.aliyPayAccountNumber = value;
    }

    /**
     * 获取bankID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBankID() {
        return bankID;
    }

    /**
     * 设置bankID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBankID(Integer value) {
        this.bankID = value;
    }

    /**
     * 获取bankName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankName() {
        return bankName;
    }

    /**
     * 设置bankName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankName(String value) {
        this.bankName = value;
    }

    /**
     * 获取bankCityID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankCityID() {
        return bankCityID;
    }

    /**
     * 设置bankCityID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankCityID(String value) {
        this.bankCityID = value;
    }

    /**
     * 获取bankCityName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankCityName() {
        return bankCityName;
    }

    /**
     * 设置bankCityName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankCityName(String value) {
        this.bankCityName = value;
    }

    /**
     * 获取bankCountryID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankCountryID() {
        return bankCountryID;
    }

    /**
     * 设置bankCountryID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankCountryID(String value) {
        this.bankCountryID = value;
    }

    /**
     * 获取bankCountryName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankCountryName() {
        return bankCountryName;
    }

    /**
     * 设置bankCountryName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankCountryName(String value) {
        this.bankCountryName = value;
    }

    /**
     * 获取bankProvinceID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankProvinceID() {
        return bankProvinceID;
    }

    /**
     * 设置bankProvinceID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankProvinceID(String value) {
        this.bankProvinceID = value;
    }

    /**
     * 获取bankProvinceName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankProvinceName() {
        return bankProvinceName;
    }

    /**
     * 设置bankProvinceName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankProvinceName(String value) {
        this.bankProvinceName = value;
    }

    /**
     * 获取noticeMobilePhone属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoticeMobilePhone() {
        return noticeMobilePhone;
    }

    /**
     * 设置noticeMobilePhone属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoticeMobilePhone(String value) {
        this.noticeMobilePhone = value;
    }

    /**
     * 获取subBranch属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubBranch() {
        return subBranch;
    }

    /**
     * 设置subBranch属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubBranch(String value) {
        this.subBranch = value;
    }

    /**
     * 获取tenPayAccountName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTenPayAccountName() {
        return tenPayAccountName;
    }

    /**
     * 设置tenPayAccountName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTenPayAccountName(String value) {
        this.tenPayAccountName = value;
    }

    /**
     * 获取tenPayAccountNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTenPayAccountNumber() {
        return tenPayAccountNumber;
    }

    /**
     * 设置tenPayAccountNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTenPayAccountNumber(String value) {
        this.tenPayAccountNumber = value;
    }

}
