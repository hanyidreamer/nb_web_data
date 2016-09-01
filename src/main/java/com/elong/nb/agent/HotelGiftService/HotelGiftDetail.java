
package com.elong.nb.agent.HotelGiftService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>HotelGiftDetail complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="HotelGiftDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GiftTypeList" type="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model}ArrayOfHotelGiftType" minOccurs="0"/>
 *         &lt;element name="HotelGift" type="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model}HotelGiftModel" minOccurs="0"/>
 *         &lt;element name="HotelProductList" type="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model}ArrayOfHotelProduct4GiftDetail" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HotelGiftDetail", namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model", propOrder = {
    "giftTypeList",
    "hotelGift",
    "hotelProductList"
})
public class HotelGiftDetail {

    @XmlElement(name = "GiftTypeList", nillable = true)
    protected ArrayOfHotelGiftType giftTypeList;
    @XmlElement(name = "HotelGift", nillable = true)
    protected HotelGiftModel hotelGift;
    @XmlElement(name = "HotelProductList", nillable = true)
    protected ArrayOfHotelProduct4GiftDetail hotelProductList;

    /**
     * 获取giftTypeList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfHotelGiftType }
     *     
     */
    public ArrayOfHotelGiftType getGiftTypeList() {
        return giftTypeList;
    }

    /**
     * 设置giftTypeList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfHotelGiftType }
     *     
     */
    public void setGiftTypeList(ArrayOfHotelGiftType value) {
        this.giftTypeList = value;
    }

    /**
     * 获取hotelGift属性的值。
     * 
     * @return
     *     possible object is
     *     {@link HotelGiftModel }
     *     
     */
    public HotelGiftModel getHotelGift() {
        return hotelGift;
    }

    /**
     * 设置hotelGift属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link HotelGiftModel }
     *     
     */
    public void setHotelGift(HotelGiftModel value) {
        this.hotelGift = value;
    }

    /**
     * 获取hotelProductList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfHotelProduct4GiftDetail }
     *     
     */
    public ArrayOfHotelProduct4GiftDetail getHotelProductList() {
        return hotelProductList;
    }

    /**
     * 设置hotelProductList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfHotelProduct4GiftDetail }
     *     
     */
    public void setHotelProductList(ArrayOfHotelProduct4GiftDetail value) {
        this.hotelProductList = value;
    }

}
