
package com.elong.nb.agent.SupplierService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>SupplierInvoiceInfoInt complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SupplierInvoiceInfoInt">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InvoiceAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InvoiceMode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="InvoiceTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PostLinkMan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PostlinkPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SupplierInvoiceInfoInt", namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model", propOrder = {
    "invoiceAddress",
    "invoiceMode",
    "invoiceTitle",
    "postLinkMan",
    "postlinkPhone"
})
public class SupplierInvoiceInfoInt {

    @XmlElement(name = "InvoiceAddress", nillable = true)
    protected String invoiceAddress;
    @XmlElement(name = "InvoiceMode")
    protected Integer invoiceMode;
    @XmlElement(name = "InvoiceTitle", nillable = true)
    protected String invoiceTitle;
    @XmlElement(name = "PostLinkMan", nillable = true)
    protected String postLinkMan;
    @XmlElement(name = "PostlinkPhone", nillable = true)
    protected String postlinkPhone;

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

}
