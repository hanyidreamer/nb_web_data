
package com.elong.nb.agent.NorthBoundForAPIService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>M_SRelation complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="M_SRelation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MHotelID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SHotelID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SSupplierID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="SSupplierType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "M_SRelation", namespace = "http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.Domain.Hotel.HotelProductUseBusiness", propOrder = {
    "mHotelID",
    "mStatus",
    "sHotelID",
    "sStatus",
    "sSupplierID",
    "sSupplierType"
})
public class MSRelation {

    @XmlElement(name = "MHotelID", nillable = true)
    protected String mHotelID;
    @XmlElement(name = "MStatus", nillable = true)
    protected String mStatus;
    @XmlElement(name = "SHotelID", nillable = true)
    protected String sHotelID;
    @XmlElement(name = "SStatus", nillable = true)
    protected String sStatus;
    @XmlElement(name = "SSupplierID")
    protected Integer sSupplierID;
    @XmlElement(name = "SSupplierType", nillable = true)
    protected String sSupplierType;

    /**
     * 获取mHotelID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMHotelID() {
        return mHotelID;
    }

    /**
     * 设置mHotelID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMHotelID(String value) {
        this.mHotelID = value;
    }

    /**
     * 获取mStatus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMStatus() {
        return mStatus;
    }

    /**
     * 设置mStatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMStatus(String value) {
        this.mStatus = value;
    }

    /**
     * 获取sHotelID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSHotelID() {
        return sHotelID;
    }

    /**
     * 设置sHotelID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSHotelID(String value) {
        this.sHotelID = value;
    }

    /**
     * 获取sStatus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSStatus() {
        return sStatus;
    }

    /**
     * 设置sStatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSStatus(String value) {
        this.sStatus = value;
    }

    /**
     * 获取sSupplierID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSSupplierID() {
        return sSupplierID;
    }

    /**
     * 设置sSupplierID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSSupplierID(Integer value) {
        this.sSupplierID = value;
    }

    /**
     * 获取sSupplierType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSSupplierType() {
        return sSupplierType;
    }

    /**
     * 设置sSupplierType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSSupplierType(String value) {
        this.sSupplierType = value;
    }

}
