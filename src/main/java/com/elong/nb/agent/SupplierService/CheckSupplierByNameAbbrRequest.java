
package com.elong.nb.agent.SupplierService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>CheckSupplierByNameAbbrRequest complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="CheckSupplierByNameAbbrRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SupplierAbbr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SupplierName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CheckSupplierByNameAbbrRequest", namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Request", propOrder = {
    "supplierAbbr",
    "supplierName"
})
public class CheckSupplierByNameAbbrRequest {

    @XmlElement(name = "SupplierAbbr", nillable = true)
    protected String supplierAbbr;
    @XmlElement(name = "SupplierName", nillable = true)
    protected String supplierName;

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

}
