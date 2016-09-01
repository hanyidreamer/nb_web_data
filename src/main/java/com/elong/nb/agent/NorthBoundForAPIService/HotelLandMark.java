
package com.elong.nb.agent.NorthBoundForAPIService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>HotelLandMark complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="HotelLandMark"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="HotelID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LandMarkID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LandMarkName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LandMarkNameEn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HotelLandMark", namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Contract", propOrder = {
    "hotelID",
    "landMarkID",
    "landMarkName",
    "landMarkNameEn"
})
public class HotelLandMark {

    @XmlElement(name = "HotelID", nillable = true)
    protected String hotelID;
    @XmlElement(name = "LandMarkID", nillable = true)
    protected String landMarkID;
    @XmlElement(name = "LandMarkName", nillable = true)
    protected String landMarkName;
    @XmlElement(name = "LandMarkNameEn", nillable = true)
    protected String landMarkNameEn;

    /**
     * 获取hotelID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHotelID() {
        return hotelID;
    }

    /**
     * 设置hotelID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHotelID(String value) {
        this.hotelID = value;
    }

    /**
     * 获取landMarkID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLandMarkID() {
        return landMarkID;
    }

    /**
     * 设置landMarkID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLandMarkID(String value) {
        this.landMarkID = value;
    }

    /**
     * 获取landMarkName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLandMarkName() {
        return landMarkName;
    }

    /**
     * 设置landMarkName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLandMarkName(String value) {
        this.landMarkName = value;
    }

    /**
     * 获取landMarkNameEn属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLandMarkNameEn() {
        return landMarkNameEn;
    }

    /**
     * 设置landMarkNameEn属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLandMarkNameEn(String value) {
        this.landMarkNameEn = value;
    }

}
