
package com.elong.nb.agent.HotelGiftService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>NewHotelGiftDetail complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="NewHotelGiftDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GiftSubTypeList" type="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model}ArrayOfHotelGiftSubType" minOccurs="0"/>
 *         &lt;element name="GiftTypeList" type="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model}ArrayOfHotelGiftType" minOccurs="0"/>
 *         &lt;element name="HotelProductList" type="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model}ArrayOfHotelProduct4GiftDetail" minOccurs="0"/>
 *         &lt;element name="NewHotelGift" type="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model}NewHotelGiftModel" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NewHotelGiftDetail", namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model", propOrder = {
    "giftSubTypeList",
    "giftTypeList",
    "hotelProductList",
    "newHotelGift"
})
public class NewHotelGiftDetail {

    @XmlElement(name = "GiftSubTypeList", nillable = true)
    protected ArrayOfHotelGiftSubType giftSubTypeList;
    @XmlElement(name = "GiftTypeList", nillable = true)
    protected ArrayOfHotelGiftType giftTypeList;
    @XmlElement(name = "HotelProductList", nillable = true)
    protected ArrayOfHotelProduct4GiftDetail hotelProductList;
    @XmlElement(name = "NewHotelGift", nillable = true)
    protected NewHotelGiftModel newHotelGift;

    /**
     * 获取giftSubTypeList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfHotelGiftSubType }
     *     
     */
    public ArrayOfHotelGiftSubType getGiftSubTypeList() {
        return giftSubTypeList;
    }

    /**
     * 设置giftSubTypeList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfHotelGiftSubType }
     *     
     */
    public void setGiftSubTypeList(ArrayOfHotelGiftSubType value) {
        this.giftSubTypeList = value;
    }

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

    /**
     * 获取newHotelGift属性的值。
     * 
     * @return
     *     possible object is
     *     {@link NewHotelGiftModel }
     *     
     */
    public NewHotelGiftModel getNewHotelGift() {
        return newHotelGift;
    }

    /**
     * 设置newHotelGift属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link NewHotelGiftModel }
     *     
     */
    public void setNewHotelGift(NewHotelGiftModel value) {
        this.newHotelGift = value;
    }

}
