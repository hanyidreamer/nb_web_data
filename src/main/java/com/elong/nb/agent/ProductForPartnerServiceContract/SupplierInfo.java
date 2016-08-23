
package com.elong.nb.agent.ProductForPartnerServiceContract;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>SupplierInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SupplierInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AuthorizationType" type="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Enums}AuthorizationType" minOccurs="0"/&gt;
 *         &lt;element name="Contacter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ContacterPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HotelId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SupplierFullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SupplierId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SupplierName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SupplierStatus" type="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Enums}SupplierStatus" minOccurs="0"/&gt;
 *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SupplierInfo", namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model", propOrder = {
    "authorizationType",
    "contacter",
    "contacterPhone",
    "hotelId",
    "supplierFullName",
    "supplierId",
    "supplierName",
    "supplierStatus",
    "type"
})
public class SupplierInfo {

    @XmlElement(name = "AuthorizationType")
    @XmlSchemaType(name = "string")
    protected AuthorizationType authorizationType;
    @XmlElement(name = "Contacter", nillable = true)
    protected String contacter;
    @XmlElement(name = "ContacterPhone", nillable = true)
    protected String contacterPhone;
    @XmlElement(name = "HotelId", nillable = true)
    protected String hotelId;
    @XmlElement(name = "SupplierFullName", nillable = true)
    protected String supplierFullName;
    @XmlElement(name = "SupplierId", nillable = true)
    protected String supplierId;
    @XmlElement(name = "SupplierName", nillable = true)
    protected String supplierName;
    @XmlElement(name = "SupplierStatus")
    @XmlSchemaType(name = "string")
    protected SupplierStatus supplierStatus;
    @XmlElement(name = "Type")
    protected Integer type;

    /**
     * 获取authorizationType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AuthorizationType }
     *     
     */
    public AuthorizationType getAuthorizationType() {
        return authorizationType;
    }

    /**
     * 设置authorizationType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AuthorizationType }
     *     
     */
    public void setAuthorizationType(AuthorizationType value) {
        this.authorizationType = value;
    }

    /**
     * 获取contacter属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContacter() {
        return contacter;
    }

    /**
     * 设置contacter属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContacter(String value) {
        this.contacter = value;
    }

    /**
     * 获取contacterPhone属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContacterPhone() {
        return contacterPhone;
    }

    /**
     * 设置contacterPhone属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContacterPhone(String value) {
        this.contacterPhone = value;
    }

    /**
     * 获取hotelId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHotelId() {
        return hotelId;
    }

    /**
     * 设置hotelId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHotelId(String value) {
        this.hotelId = value;
    }

    /**
     * 获取supplierFullName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupplierFullName() {
        return supplierFullName;
    }

    /**
     * 设置supplierFullName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupplierFullName(String value) {
        this.supplierFullName = value;
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
