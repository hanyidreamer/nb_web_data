
package com.elong.nb.agent.ProductForPartnerServiceContract;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>CreateShotelForPartnerRequest complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="CreateShotelForPartnerRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MHotelID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OperatorIP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OperatorName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OtaType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="SHotelInfo" type="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model}SHotelInfo" minOccurs="0"/&gt;
 *         &lt;element name="SourceFrom" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="SupplierID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateShotelForPartnerRequest", namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Request", propOrder = {
    "mHotelID",
    "operatorIP",
    "operatorName",
    "otaType",
    "sHotelInfo",
    "sourceFrom",
    "supplierID"
})
public class CreateShotelForPartnerRequest {

    @XmlElement(name = "MHotelID", nillable = true)
    protected String mHotelID;
    @XmlElement(name = "OperatorIP", nillable = true)
    protected String operatorIP;
    @XmlElement(name = "OperatorName", nillable = true)
    protected String operatorName;
    @XmlElement(name = "OtaType")
    protected Integer otaType;
    @XmlElement(name = "SHotelInfo", nillable = true)
    protected SHotelInfo sHotelInfo;
    @XmlElement(name = "SourceFrom")
    protected Integer sourceFrom;
    @XmlElement(name = "SupplierID")
    protected Integer supplierID;

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
     * 获取operatorIP属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperatorIP() {
        return operatorIP;
    }

    /**
     * 设置operatorIP属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperatorIP(String value) {
        this.operatorIP = value;
    }

    /**
     * 获取operatorName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperatorName() {
        return operatorName;
    }

    /**
     * 设置operatorName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperatorName(String value) {
        this.operatorName = value;
    }

    /**
     * 获取otaType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOtaType() {
        return otaType;
    }

    /**
     * 设置otaType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOtaType(Integer value) {
        this.otaType = value;
    }

    /**
     * 获取sHotelInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SHotelInfo }
     *     
     */
    public SHotelInfo getSHotelInfo() {
        return sHotelInfo;
    }

    /**
     * 设置sHotelInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SHotelInfo }
     *     
     */
    public void setSHotelInfo(SHotelInfo value) {
        this.sHotelInfo = value;
    }

    /**
     * 获取sourceFrom属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSourceFrom() {
        return sourceFrom;
    }

    /**
     * 设置sourceFrom属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSourceFrom(Integer value) {
        this.sourceFrom = value;
    }

    /**
     * 获取supplierID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSupplierID() {
        return supplierID;
    }

    /**
     * 设置supplierID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSupplierID(Integer value) {
        this.supplierID = value;
    }

}
