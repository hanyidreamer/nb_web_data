
package com.elong.nb.agent.NorthBoundForAPIService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>HotelfeatureInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="HotelfeatureInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DrivingGuide" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DrivingGuideEn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HotelID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LocationHighlights" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LocationHighlightsEn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Overview" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OverviewEn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PropertyAmenitiesHightlights" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PropertyAmenitiesHightlightsEn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PropertyOtherHightlights" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PropertyOtherHightlightsEn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HotelfeatureInfo", namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Contract", propOrder = {
    "drivingGuide",
    "drivingGuideEn",
    "hotelID",
    "locationHighlights",
    "locationHighlightsEn",
    "overview",
    "overviewEn",
    "propertyAmenitiesHightlights",
    "propertyAmenitiesHightlightsEn",
    "propertyOtherHightlights",
    "propertyOtherHightlightsEn"
})
public class HotelfeatureInfo {

    @XmlElement(name = "DrivingGuide", nillable = true)
    protected String drivingGuide;
    @XmlElement(name = "DrivingGuideEn", nillable = true)
    protected String drivingGuideEn;
    @XmlElement(name = "HotelID", nillable = true)
    protected String hotelID;
    @XmlElement(name = "LocationHighlights", nillable = true)
    protected String locationHighlights;
    @XmlElement(name = "LocationHighlightsEn", nillable = true)
    protected String locationHighlightsEn;
    @XmlElement(name = "Overview", nillable = true)
    protected String overview;
    @XmlElement(name = "OverviewEn", nillable = true)
    protected String overviewEn;
    @XmlElement(name = "PropertyAmenitiesHightlights", nillable = true)
    protected String propertyAmenitiesHightlights;
    @XmlElement(name = "PropertyAmenitiesHightlightsEn", nillable = true)
    protected String propertyAmenitiesHightlightsEn;
    @XmlElement(name = "PropertyOtherHightlights", nillable = true)
    protected String propertyOtherHightlights;
    @XmlElement(name = "PropertyOtherHightlightsEn", nillable = true)
    protected String propertyOtherHightlightsEn;

    /**
     * 获取drivingGuide属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDrivingGuide() {
        return drivingGuide;
    }

    /**
     * 设置drivingGuide属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDrivingGuide(String value) {
        this.drivingGuide = value;
    }

    /**
     * 获取drivingGuideEn属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDrivingGuideEn() {
        return drivingGuideEn;
    }

    /**
     * 设置drivingGuideEn属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDrivingGuideEn(String value) {
        this.drivingGuideEn = value;
    }

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
     * 获取locationHighlights属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationHighlights() {
        return locationHighlights;
    }

    /**
     * 设置locationHighlights属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationHighlights(String value) {
        this.locationHighlights = value;
    }

    /**
     * 获取locationHighlightsEn属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationHighlightsEn() {
        return locationHighlightsEn;
    }

    /**
     * 设置locationHighlightsEn属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationHighlightsEn(String value) {
        this.locationHighlightsEn = value;
    }

    /**
     * 获取overview属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOverview() {
        return overview;
    }

    /**
     * 设置overview属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOverview(String value) {
        this.overview = value;
    }

    /**
     * 获取overviewEn属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOverviewEn() {
        return overviewEn;
    }

    /**
     * 设置overviewEn属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOverviewEn(String value) {
        this.overviewEn = value;
    }

    /**
     * 获取propertyAmenitiesHightlights属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPropertyAmenitiesHightlights() {
        return propertyAmenitiesHightlights;
    }

    /**
     * 设置propertyAmenitiesHightlights属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPropertyAmenitiesHightlights(String value) {
        this.propertyAmenitiesHightlights = value;
    }

    /**
     * 获取propertyAmenitiesHightlightsEn属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPropertyAmenitiesHightlightsEn() {
        return propertyAmenitiesHightlightsEn;
    }

    /**
     * 设置propertyAmenitiesHightlightsEn属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPropertyAmenitiesHightlightsEn(String value) {
        this.propertyAmenitiesHightlightsEn = value;
    }

    /**
     * 获取propertyOtherHightlights属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPropertyOtherHightlights() {
        return propertyOtherHightlights;
    }

    /**
     * 设置propertyOtherHightlights属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPropertyOtherHightlights(String value) {
        this.propertyOtherHightlights = value;
    }

    /**
     * 获取propertyOtherHightlightsEn属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPropertyOtherHightlightsEn() {
        return propertyOtherHightlightsEn;
    }

    /**
     * 设置propertyOtherHightlightsEn属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPropertyOtherHightlightsEn(String value) {
        this.propertyOtherHightlightsEn = value;
    }

}
