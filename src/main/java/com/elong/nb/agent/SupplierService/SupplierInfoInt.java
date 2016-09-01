
package com.elong.nb.agent.SupplierService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.joda.time.DateTime;


/**
 * <p>SupplierInfoInt complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SupplierInfoInt">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AccountPayeeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AccountPayeeNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AccountPayeeType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="BankAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BankCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BankCityID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BankCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BankCountryID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BankID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BankName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BankProvince" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BankProvinceID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BillType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CityID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CountryID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CountryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CurrencyTypeNum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="InvoiceAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InvoiceMode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="InvoiceTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LinkEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LinkFax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LinkMan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LinkPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NoticeMobilePhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OperateIP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OperateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Operator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PostLinkMan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PostlinkPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProvinceID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProvinceName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReceiveAccountType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SettlementBankType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SettlementModle" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SettlementType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SubBranch" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SupplierAbbr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SupplierId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SupplierName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SupplierStatus" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SwiftCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SupplierInfoInt", namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model", propOrder = {
    "accountPayeeName",
    "accountPayeeNumber",
    "accountPayeeType",
    "bankAddress",
    "bankCity",
    "bankCityID",
    "bankCountry",
    "bankCountryID",
    "bankID",
    "bankName",
    "bankProvince",
    "bankProvinceID",
    "billType",
    "cityID",
    "cityName",
    "countryID",
    "countryName",
    "currencyCode",
    "currencyTypeNum",
    "invoiceAddress",
    "invoiceMode",
    "invoiceTitle",
    "linkEmail",
    "linkFax",
    "linkMan",
    "linkPhone",
    "noticeMobilePhone",
    "operateIP",
    "operateTime",
    "operator",
    "postLinkMan",
    "postlinkPhone",
    "provinceID",
    "provinceName",
    "receiveAccountType",
    "settlementBankType",
    "settlementModle",
    "settlementType",
    "subBranch",
    "supplierAbbr",
    "supplierId",
    "supplierName",
    "supplierStatus",
    "swiftCode",
    "type"
})
public class SupplierInfoInt {

    @XmlElement(name = "AccountPayeeName", nillable = true)
    protected String accountPayeeName;
    @XmlElement(name = "AccountPayeeNumber", nillable = true)
    protected String accountPayeeNumber;
    @XmlElement(name = "AccountPayeeType")
    protected Integer accountPayeeType;
    @XmlElement(name = "BankAddress", nillable = true)
    protected String bankAddress;
    @XmlElement(name = "BankCity", nillable = true)
    protected String bankCity;
    @XmlElement(name = "BankCityID", nillable = true)
    protected String bankCityID;
    @XmlElement(name = "BankCountry", nillable = true)
    protected String bankCountry;
    @XmlElement(name = "BankCountryID", nillable = true)
    protected String bankCountryID;
    @XmlElement(name = "BankID", nillable = true)
    protected String bankID;
    @XmlElement(name = "BankName", nillable = true)
    protected String bankName;
    @XmlElement(name = "BankProvince", nillable = true)
    protected String bankProvince;
    @XmlElement(name = "BankProvinceID", nillable = true)
    protected String bankProvinceID;
    @XmlElement(name = "BillType")
    protected Integer billType;
    @XmlElement(name = "CityID", nillable = true)
    protected String cityID;
    @XmlElement(name = "CityName", nillable = true)
    protected String cityName;
    @XmlElement(name = "CountryID", nillable = true)
    protected String countryID;
    @XmlElement(name = "CountryName", nillable = true)
    protected String countryName;
    @XmlElement(name = "CurrencyCode", nillable = true)
    protected String currencyCode;
    @XmlElement(name = "CurrencyTypeNum")
    protected Integer currencyTypeNum;
    @XmlElement(name = "InvoiceAddress", nillable = true)
    protected String invoiceAddress;
    @XmlElement(name = "InvoiceMode")
    protected Integer invoiceMode;
    @XmlElement(name = "InvoiceTitle", nillable = true)
    protected String invoiceTitle;
    @XmlElement(name = "LinkEmail", nillable = true)
    protected String linkEmail;
    @XmlElement(name = "LinkFax", nillable = true)
    protected String linkFax;
    @XmlElement(name = "LinkMan", nillable = true)
    protected String linkMan;
    @XmlElement(name = "LinkPhone", nillable = true)
    protected String linkPhone;
    @XmlElement(name = "NoticeMobilePhone", nillable = true)
    protected String noticeMobilePhone;
    @XmlElement(name = "OperateIP", nillable = true)
    protected String operateIP;
    @XmlElement(name = "OperateTime", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected DateTime operateTime;
    @XmlElement(name = "Operator", nillable = true)
    protected String operator;
    @XmlElement(name = "PostLinkMan", nillable = true)
    protected String postLinkMan;
    @XmlElement(name = "PostlinkPhone", nillable = true)
    protected String postlinkPhone;
    @XmlElement(name = "ProvinceID", nillable = true)
    protected String provinceID;
    @XmlElement(name = "ProvinceName", nillable = true)
    protected String provinceName;
    @XmlElement(name = "ReceiveAccountType")
    protected Integer receiveAccountType;
    @XmlElement(name = "SettlementBankType")
    protected Integer settlementBankType;
    @XmlElement(name = "SettlementModle")
    protected Integer settlementModle;
    @XmlElement(name = "SettlementType")
    protected Integer settlementType;
    @XmlElement(name = "SubBranch", nillable = true)
    protected String subBranch;
    @XmlElement(name = "SupplierAbbr", nillable = true)
    protected String supplierAbbr;
    @XmlElement(name = "SupplierId", nillable = true)
    protected String supplierId;
    @XmlElement(name = "SupplierName", nillable = true)
    protected String supplierName;
    @XmlElement(name = "SupplierStatus")
    protected Integer supplierStatus;
    @XmlElement(name = "SwiftCode", nillable = true)
    protected String swiftCode;
    @XmlElement(name = "Type")
    protected Integer type;

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
     * 获取bankAddress属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankAddress() {
        return bankAddress;
    }

    /**
     * 设置bankAddress属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankAddress(String value) {
        this.bankAddress = value;
    }

    /**
     * 获取bankCity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankCity() {
        return bankCity;
    }

    /**
     * 设置bankCity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankCity(String value) {
        this.bankCity = value;
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
     * 获取bankCountry属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankCountry() {
        return bankCountry;
    }

    /**
     * 设置bankCountry属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankCountry(String value) {
        this.bankCountry = value;
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
     * 获取bankID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankID() {
        return bankID;
    }

    /**
     * 设置bankID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankID(String value) {
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
     * 获取bankProvince属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankProvince() {
        return bankProvince;
    }

    /**
     * 设置bankProvince属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankProvince(String value) {
        this.bankProvince = value;
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
     * 获取billType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBillType() {
        return billType;
    }

    /**
     * 设置billType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBillType(Integer value) {
        this.billType = value;
    }

    /**
     * 获取cityID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCityID() {
        return cityID;
    }

    /**
     * 设置cityID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCityID(String value) {
        this.cityID = value;
    }

    /**
     * 获取cityName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCityName() {
        return cityName;
    }

    /**
     * 设置cityName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCityName(String value) {
        this.cityName = value;
    }

    /**
     * 获取countryID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryID() {
        return countryID;
    }

    /**
     * 设置countryID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryID(String value) {
        this.countryID = value;
    }

    /**
     * 获取countryName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryName() {
        return countryName;
    }

    /**
     * 设置countryName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryName(String value) {
        this.countryName = value;
    }

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
     * 获取invoiceAddress属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceAddress() {
        return invoiceAddress;
    }

    /**
     * 设置invoiceAddress属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceAddress(String value) {
        this.invoiceAddress = value;
    }

    /**
     * 获取invoiceMode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getInvoiceMode() {
        return invoiceMode;
    }

    /**
     * 设置invoiceMode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setInvoiceMode(Integer value) {
        this.invoiceMode = value;
    }

    /**
     * 获取invoiceTitle属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceTitle() {
        return invoiceTitle;
    }

    /**
     * 设置invoiceTitle属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceTitle(String value) {
        this.invoiceTitle = value;
    }

    /**
     * 获取linkEmail属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinkEmail() {
        return linkEmail;
    }

    /**
     * 设置linkEmail属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinkEmail(String value) {
        this.linkEmail = value;
    }

    /**
     * 获取linkFax属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinkFax() {
        return linkFax;
    }

    /**
     * 设置linkFax属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinkFax(String value) {
        this.linkFax = value;
    }

    /**
     * 获取linkMan属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinkMan() {
        return linkMan;
    }

    /**
     * 设置linkMan属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinkMan(String value) {
        this.linkMan = value;
    }

    /**
     * 获取linkPhone属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinkPhone() {
        return linkPhone;
    }

    /**
     * 设置linkPhone属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinkPhone(String value) {
        this.linkPhone = value;
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
     * 获取operator属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperator() {
        return operator;
    }

    /**
     * 设置operator属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperator(String value) {
        this.operator = value;
    }

    /**
     * 获取postLinkMan属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostLinkMan() {
        return postLinkMan;
    }

    /**
     * 设置postLinkMan属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostLinkMan(String value) {
        this.postLinkMan = value;
    }

    /**
     * 获取postlinkPhone属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostlinkPhone() {
        return postlinkPhone;
    }

    /**
     * 设置postlinkPhone属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostlinkPhone(String value) {
        this.postlinkPhone = value;
    }

    /**
     * 获取provinceID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvinceID() {
        return provinceID;
    }

    /**
     * 设置provinceID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvinceID(String value) {
        this.provinceID = value;
    }

    /**
     * 获取provinceName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvinceName() {
        return provinceName;
    }

    /**
     * 设置provinceName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvinceName(String value) {
        this.provinceName = value;
    }

    /**
     * 获取receiveAccountType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getReceiveAccountType() {
        return receiveAccountType;
    }

    /**
     * 设置receiveAccountType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setReceiveAccountType(Integer value) {
        this.receiveAccountType = value;
    }

    /**
     * 获取settlementBankType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSettlementBankType() {
        return settlementBankType;
    }

    /**
     * 设置settlementBankType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSettlementBankType(Integer value) {
        this.settlementBankType = value;
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
     * 获取supplierAbbr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupplierAbbr() {
        return supplierAbbr;
    }

    /**
     * 设置supplierAbbr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupplierAbbr(String value) {
        this.supplierAbbr = value;
    }

    /**
     * 获取supplierId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupplierId() {
        return supplierId;
    }

    /**
     * 设置supplierId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupplierId(String value) {
        this.supplierId = value;
    }

    /**
     * 获取supplierName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupplierName() {
        return supplierName;
    }

    /**
     * 设置supplierName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupplierName(String value) {
        this.supplierName = value;
    }

    /**
     * 获取supplierStatus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSupplierStatus() {
        return supplierStatus;
    }

    /**
     * 设置supplierStatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSupplierStatus(Integer value) {
        this.supplierStatus = value;
    }

    /**
     * 获取swiftCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSwiftCode() {
        return swiftCode;
    }

    /**
     * 设置swiftCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSwiftCode(String value) {
        this.swiftCode = value;
    }

    /**
     * 获取type属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getType() {
        return type;
    }

    /**
     * 设置type属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setType(Integer value) {
        this.type = value;
    }

}
