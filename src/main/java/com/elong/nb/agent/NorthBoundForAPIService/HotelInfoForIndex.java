
package com.elong.nb.agent.NorthBoundForAPIService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>HotelInfoForIndex complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="HotelInfoForIndex"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Addtime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Deltime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Hotel_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Hotel_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Hotel_name_en" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Isreserve" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Modifytime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HotelInfoForIndex", namespace = "http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.DataAccess.Hotel.Northbound", propOrder = {
    "addtime",
    "deltime",
    "hotelId",
    "hotelName",
    "hotelNameEn",
    "isreserve",
    "modifytime"
})
public class HotelInfoForIndex {

    @XmlElement(name = "Addtime", nillable = true)
    protected String addtime;
    @XmlElement(name = "Deltime", nillable = true)
    protected String deltime;
    @XmlElement(name = "Hotel_id", nillable = true)
    protected String hotelId;
    @XmlElement(name = "Hotel_name", nillable = true)
    protected String hotelName;
    @XmlElement(name = "Hotel_name_en", nillable = true)
    protected String hotelNameEn;
    @XmlElement(name = "Isreserve", nillable = true)
    protected String isreserve;
    @XmlElement(name = "Modifytime", nillable = true)
    protected String modifytime;

    /**
     * 获取addtime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtime() {
        return addtime;
    }

    /**
     * 设置addtime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddtime(String value) {
        this.addtime = value;
    }

    /**
     * 获取deltime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeltime() {
        return deltime;
    }

    /**
     * 设置deltime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeltime(String value) {
        this.deltime = value;
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
     * 获取hotelName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHotelName() {
        return hotelName;
    }

    /**
     * 设置hotelName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHotelName(String value) {
        this.hotelName = value;
    }

    /**
     * 获取hotelNameEn属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHotelNameEn() {
        return hotelNameEn;
    }

    /**
     * 设置hotelNameEn属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHotelNameEn(String value) {
        this.hotelNameEn = value;
    }

    /**
     * 获取isreserve属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsreserve() {
        return isreserve;
    }

    /**
     * 设置isreserve属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsreserve(String value) {
        this.isreserve = value;
    }

    /**
     * 获取modifytime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModifytime() {
        return modifytime;
    }

    /**
     * 设置modifytime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModifytime(String value) {
        this.modifytime = value;
    }

}
