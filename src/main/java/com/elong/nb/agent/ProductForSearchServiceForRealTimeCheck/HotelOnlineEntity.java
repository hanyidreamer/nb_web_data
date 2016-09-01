
package com.elong.nb.agent.ProductForSearchServiceForRealTimeCheck;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>HotelOnlineEntity complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="HotelOnlineEntity"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="HotelID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HotelName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IsReserve" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OnlineSearchType" type="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Enums}OnlineSearchType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HotelOnlineEntity", namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model", propOrder = {
    "hotelID",
    "hotelName",
    "isReserve",
    "onlineSearchType"
})
public class HotelOnlineEntity {

    @XmlElement(name = "HotelID", nillable = true)
    protected String hotelID;
    @XmlElement(name = "HotelName", nillable = true)
    protected String hotelName;
    @XmlElement(name = "IsReserve", nillable = true)
    protected String isReserve;
    @XmlElement(name = "OnlineSearchType")
    @XmlSchemaType(name = "string")
    protected OnlineSearchType onlineSearchType;

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
     * 获取isReserve属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsReserve() {
        return isReserve;
    }

    /**
     * 设置isReserve属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsReserve(String value) {
        this.isReserve = value;
    }

    /**
     * 获取onlineSearchType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link OnlineSearchType }
     *     
     */
    public OnlineSearchType getOnlineSearchType() {
        return onlineSearchType;
    }

    /**
     * 设置onlineSearchType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link OnlineSearchType }
     *     
     */
    public void setOnlineSearchType(OnlineSearchType value) {
        this.onlineSearchType = value;
    }

}
