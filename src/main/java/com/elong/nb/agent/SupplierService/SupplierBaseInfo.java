
package com.elong.nb.agent.SupplierService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.joda.time.DateTime;


/**
 * <p>SupplierBaseInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SupplierBaseInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AgreementEntityID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="BillType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="BillType_Ebooking" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="BillType_Fax" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="BillType_Mail" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ChannelType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CityID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CooperationType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CountryID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CountryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsIndependentOperating" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="LinkEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LinkFax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LinkMan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LinkPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NameStrategyInfo" type="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model}NameStrategyInfo" minOccurs="0"/>
 *         &lt;element name="OperateIP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OperateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Operator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProvinceID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProvinceName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShotelID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SupplierAbbr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SupplierAlias" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SupplierId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SupplierInvoiceInfo" type="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model}SupplierInvoiceInfo" minOccurs="0"/>
 *         &lt;element name="SupplierName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SupplierSettlementInfo" type="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model}SupplierSettlementInfo" minOccurs="0"/>
 *         &lt;element name="SupplierStatus" type="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Enums}SupplierStatus" minOccurs="0"/>
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
@XmlType(name = "SupplierBaseInfo", namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model", propOrder = {
    "agreementEntityID",
    "billType",
    "billTypeEbooking",
    "billTypeFax",
    "billTypeMail",
    "channelType",
    "cityID",
    "cityName",
    "cooperationType",
    "countryID",
    "countryName",
    "isIndependentOperating",
    "linkEmail",
    "linkFax",
    "linkMan",
    "linkPhone",
    "nameStrategyInfo",
    "operateIP",
    "operateTime",
    "operator",
    "provinceID",
    "provinceName",
    "shotelID",
    "supplierAbbr",
    "supplierAlias",
    "supplierId",
    "supplierInvoiceInfo",
    "supplierName",
    "supplierSettlementInfo",
    "supplierStatus",
    "type"
})
public class SupplierBaseInfo {

    @XmlElement(name = "AgreementEntityID")
    protected Integer agreementEntityID;
    @XmlElement(name = "BillType")
    protected Integer billType;
    @XmlElement(name = "BillType_Ebooking")
    protected Boolean billTypeEbooking;
    @XmlElement(name = "BillType_Fax")
    protected Boolean billTypeFax;
    @XmlElement(name = "BillType_Mail")
    protected Boolean billTypeMail;
    @XmlElement(name = "ChannelType")
    protected Integer channelType;
    @XmlElement(name = "CityID", nillable = true)
    protected String cityID;
    @XmlElement(name = "CityName", nillable = true)
    protected String cityName;
    @XmlElement(name = "CooperationType")
    protected Integer cooperationType;
    @XmlElement(name = "CountryID", nillable = true)
    protected String countryID;
    @XmlElement(name = "CountryName", nillable = true)
    protected String countryName;
    @XmlElement(name = "IsIndependentOperating")
    protected Boolean isIndependentOperating;
    @XmlElement(name = "LinkEmail", nillable = true)
    protected String linkEmail;
    @XmlElement(name = "LinkFax", nillable = true)
    protected String linkFax;
    @XmlElement(name = "LinkMan", nillable = true)
    protected String linkMan;
    @XmlElement(name = "LinkPhone", nillable = true)
    protected String linkPhone;
    @XmlElement(name = "NameStrategyInfo", nillable = true)
    protected NameStrategyInfo nameStrategyInfo;
    @XmlElement(name = "OperateIP", nillable = true)
    protected String operateIP;
    @XmlElement(name = "OperateTime", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected DateTime operateTime;
    @XmlElement(name = "Operator", nillable = true)
    protected String operator;
    @XmlElement(name = "ProvinceID", nillable = true)
    protected String provinceID;
    @XmlElement(name = "ProvinceName", nillable = true)
    protected String provinceName;
    @XmlElement(name = "ShotelID", nillable = true)
    protected String shotelID;
    @XmlElement(name = "SupplierAbbr", nillable = true)
    protected String supplierAbbr;
    @XmlElement(name = "SupplierAlias", nillable = true)
    protected String supplierAlias;
    @XmlElement(name = "SupplierId")
    protected Integer supplierId;
    @XmlElement(name = "SupplierInvoiceInfo", nillable = true)
    protected SupplierInvoiceInfo supplierInvoiceInfo;
    @XmlElement(name = "SupplierName", nillable = true)
    protected String supplierName;
    @XmlElement(name = "SupplierSettlementInfo", nillable = true)
    protected SupplierSettlementInfo supplierSettlementInfo;
    @XmlElement(name = "SupplierStatus")
    @XmlSchemaType(name = "string")
    protected SupplierStatus supplierStatus;
    @XmlElement(name = "Type")
    protected Integer type;

    /**
     * 获取agreementEntityID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAgreementEntityID() {
        return agreementEntityID;
    }

    /**
     * 设置agreementEntityID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAgreementEntityID(Integer value) {
        this.agreementEntityID = value;
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
     * 获取billTypeEbooking属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBillTypeEbooking() {
        return billTypeEbooking;
    }

    /**
     * 设置billTypeEbooking属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBillTypeEbooking(Boolean value) {
        this.billTypeEbooking = value;
    }

    /**
     * 获取billTypeFax属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBillTypeFax() {
        return billTypeFax;
    }

    /**
     * 设置billTypeFax属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBillTypeFax(Boolean value) {
        this.billTypeFax = value;
    }

    /**
     * 获取billTypeMail属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBillTypeMail() {
        return billTypeMail;
    }

    /**
     * 设置billTypeMail属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBillTypeMail(Boolean value) {
        this.billTypeMail = value;
    }

    /**
     * 获取channelType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getChannelType() {
        return channelType;
    }

    /**
     * 设置channelType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setChannelType(Integer value) {
        this.channelType = value;
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
     * 获取cooperationType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCooperationType() {
        return cooperationType;
    }

    /**
     * 设置cooperationType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCooperationType(Integer value) {
        this.cooperationType = value;
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
     * 获取isIndependentOperating属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsIndependentOperating() {
        return isIndependentOperating;
    }

    /**
     * 设置isIndependentOperating属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsIndependentOperating(Boolean value) {
        this.isIndependentOperating = value;
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
     * 获取nameStrategyInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link NameStrategyInfo }
     *     
     */
    public NameStrategyInfo getNameStrategyInfo() {
        return nameStrategyInfo;
    }

    /**
     * 设置nameStrategyInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link NameStrategyInfo }
     *     
     */
    public void setNameStrategyInfo(NameStrategyInfo value) {
        this.nameStrategyInfo = value;
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
     * 获取shotelID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShotelID() {
        return shotelID;
    }

    /**
     * 设置shotelID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShotelID(String value) {
        this.shotelID = value;
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
     * 获取supplierAlias属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupplierAlias() {
        return supplierAlias;
    }

    /**
     * 设置supplierAlias属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupplierAlias(String value) {
        this.supplierAlias = value;
    }

    /**
     * 获取supplierId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSupplierId() {
        return supplierId;
    }

    /**
     * 设置supplierId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSupplierId(Integer value) {
        this.supplierId = value;
    }

    /**
     * 获取supplierInvoiceInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SupplierInvoiceInfo }
     *     
     */
    public SupplierInvoiceInfo getSupplierInvoiceInfo() {
        return supplierInvoiceInfo;
    }

    /**
     * 设置supplierInvoiceInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SupplierInvoiceInfo }
     *     
     */
    public void setSupplierInvoiceInfo(SupplierInvoiceInfo value) {
        this.supplierInvoiceInfo = value;
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
     * 获取supplierSettlementInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SupplierSettlementInfo }
     *     
     */
    public SupplierSettlementInfo getSupplierSettlementInfo() {
        return supplierSettlementInfo;
    }

    /**
     * 设置supplierSettlementInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SupplierSettlementInfo }
     *     
     */
    public void setSupplierSettlementInfo(SupplierSettlementInfo value) {
        this.supplierSettlementInfo = value;
    }

    /**
     * 获取supplierStatus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SupplierStatus }
     *     
     */
    public SupplierStatus getSupplierStatus() {
        return supplierStatus;
    }

    /**
     * 设置supplierStatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SupplierStatus }
     *     
     */
    public void setSupplierStatus(SupplierStatus value) {
        this.supplierStatus = value;
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
