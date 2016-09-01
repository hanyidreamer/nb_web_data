
package com.elong.nb.agent.HotelGiftService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>UpdateHotelGiftTypeResponse complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="UpdateHotelGiftTypeResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Framework}ServiceResponseBase">
 *       &lt;sequence>
 *         &lt;element name="GiftType" type="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model}HotelGiftType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateHotelGiftTypeResponse", namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response.HotelGift", propOrder = {
    "giftType"
})
public class UpdateHotelGiftTypeResponse
    extends ServiceResponseBase
{

    @XmlElement(name = "GiftType", nillable = true)
    protected HotelGiftType giftType;

    /**
     * 获取giftType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link HotelGiftType }
     *     
     */
    public HotelGiftType getGiftType() {
        return giftType;
    }

    /**
     * 设置giftType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link HotelGiftType }
     *     
     */
    public void setGiftType(HotelGiftType value) {
        this.giftType = value;
    }

}
