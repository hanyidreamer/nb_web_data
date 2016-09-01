
package com.elong.nb.agent.SupplierService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>SupplierInvoiceInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SupplierInvoiceInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InvoiceAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InvoiceLevel" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="InvoiceMode" type="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Enums}InvoiceMode" minOccurs="0"/>
 *         &lt;element name="InvoiceTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InvoiceType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="LicensePicture" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PostLinkMan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PostlinkPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShotelAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TaxRegistCertificate" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TaxpayerNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TaxpayerProvePicture" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SupplierInvoiceInfo", namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model", propOrder = {
    "invoiceAddress",
    "invoiceLevel",
    "invoiceMode",
    "invoiceTitle",
    "invoiceType",
    "licensePicture",
    "postLinkMan",
    "postlinkPhone",
    "shotelAddress",
    "taxRegistCertificate",
    "taxpayerNum",
    "taxpayerProvePicture"
})
public class SupplierInvoiceInfo {

    @XmlElement(name = "InvoiceAddress", nillable = true)
    protected String invoiceAddress;
    @XmlElement(name = "InvoiceLevel")
    protected Integer invoiceLevel;
    @XmlElement(name = "InvoiceMode")
    @XmlSchemaType(name = "string")
    protected InvoiceMode invoiceMode;
    @XmlElement(name = "InvoiceTitle", nillable = true)
    protected String invoiceTitle;
    @XmlElement(name = "InvoiceType")
    protected Integer invoiceType;
    @XmlElement(name = "LicensePicture", nillable = true)
    protected Integer licensePicture;
    @XmlElement(name = "PostLinkMan", nillable = true)
    protected String postLinkMan;
    @XmlElement(name = "PostlinkPhone", nillable = true)
    protected String postlinkPhone;
    @XmlElement(name = "ShotelAddress", nillable = true)
    protected String shotelAddress;
    @XmlElement(name = "TaxRegistCertificate", nillable = true)
    protected Integer taxRegistCertificate;
    @XmlElement(name = "TaxpayerNum", nillable = true)
    protected String taxpayerNum;
    @XmlElement(name = "TaxpayerProvePicture", nillable = true)
    protected Integer taxpayerProvePicture;

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
     * 获取invoiceLevel属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getInvoiceLevel() {
        return invoiceLevel;
    }

    /**
     * 设置invoiceLevel属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setInvoiceLevel(Integer value) {
        this.invoiceLevel = value;
    }

    /**
     * 获取invoiceMode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link InvoiceMode }
     *     
     */
    public InvoiceMode getInvoiceMode() {
        return invoiceMode;
    }

    /**
     * 设置invoiceMode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceMode }
     *     
     */
    public void setInvoiceMode(InvoiceMode value) {
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
     * 获取invoiceType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getInvoiceType() {
        return invoiceType;
    }

    /**
     * 设置invoiceType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setInvoiceType(Integer value) {
        this.invoiceType = value;
    }

    /**
     * 获取licensePicture属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLicensePicture() {
        return licensePicture;
    }

    /**
     * 设置licensePicture属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLicensePicture(Integer value) {
        this.licensePicture = value;
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
     * 获取shotelAddress属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShotelAddress() {
        return shotelAddress;
    }

    /**
     * 设置shotelAddress属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShotelAddress(String value) {
        this.shotelAddress = value;
    }

    /**
     * 获取taxRegistCertificate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTaxRegistCertificate() {
        return taxRegistCertificate;
    }

    /**
     * 设置taxRegistCertificate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTaxRegistCertificate(Integer value) {
        this.taxRegistCertificate = value;
    }

    /**
     * 获取taxpayerNum属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxpayerNum() {
        return taxpayerNum;
    }

    /**
     * 设置taxpayerNum属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxpayerNum(String value) {
        this.taxpayerNum = value;
    }

    /**
     * 获取taxpayerProvePicture属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTaxpayerProvePicture() {
        return taxpayerProvePicture;
    }

    /**
     * 设置taxpayerProvePicture属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTaxpayerProvePicture(Integer value) {
        this.taxpayerProvePicture = value;
    }

}
