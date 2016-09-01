
package com.elong.nb.agent.HotelGiftService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>HotelProduct4GiftDetail complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="HotelProduct4GiftDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HotelID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsGiftApplied2AllProducts" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="RatePlanList" type="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model}ArrayOfRatePlan4GiftDetail" minOccurs="0"/>
 *         &lt;element name="RoomTypeID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RoomTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HotelProduct4GiftDetail", namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model", propOrder = {
    "hotelID",
    "isGiftApplied2AllProducts",
    "ratePlanList",
    "roomTypeID",
    "roomTypeName"
})
public class HotelProduct4GiftDetail {

    @XmlElement(name = "HotelID", nillable = true)
    protected String hotelID;
    @XmlElement(name = "IsGiftApplied2AllProducts")
    protected Boolean isGiftApplied2AllProducts;
    @XmlElement(name = "RatePlanList", nillable = true)
    protected ArrayOfRatePlan4GiftDetail ratePlanList;
    @XmlElement(name = "RoomTypeID", nillable = true)
    protected String roomTypeID;
    @XmlElement(name = "RoomTypeName", nillable = true)
    protected String roomTypeName;

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
     * 获取isGiftApplied2AllProducts属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsGiftApplied2AllProducts() {
        return isGiftApplied2AllProducts;
    }

    /**
     * 设置isGiftApplied2AllProducts属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsGiftApplied2AllProducts(Boolean value) {
        this.isGiftApplied2AllProducts = value;
    }

    /**
     * 获取ratePlanList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRatePlan4GiftDetail }
     *     
     */
    public ArrayOfRatePlan4GiftDetail getRatePlanList() {
        return ratePlanList;
    }

    /**
     * 设置ratePlanList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRatePlan4GiftDetail }
     *     
     */
    public void setRatePlanList(ArrayOfRatePlan4GiftDetail value) {
        this.ratePlanList = value;
    }

    /**
     * 获取roomTypeID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomTypeID() {
        return roomTypeID;
    }

    /**
     * 设置roomTypeID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomTypeID(String value) {
        this.roomTypeID = value;
    }

    /**
     * 获取roomTypeName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomTypeName() {
        return roomTypeName;
    }

    /**
     * 设置roomTypeName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomTypeName(String value) {
        this.roomTypeName = value;
    }

}
