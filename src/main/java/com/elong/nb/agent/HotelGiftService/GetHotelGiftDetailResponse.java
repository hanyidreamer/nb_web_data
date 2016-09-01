
package com.elong.nb.agent.HotelGiftService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>GetHotelGiftDetailResponse complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="GetHotelGiftDetailResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Framework}ServiceResponseBase">
 *       &lt;sequence>
 *         &lt;element name="GiftDetailModel" type="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model}HotelGiftDetail" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetHotelGiftDetailResponse", namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response.HotelGift", propOrder = {
    "giftDetailModel"
})
public class GetHotelGiftDetailResponse
    extends ServiceResponseBase
{

    @XmlElement(name = "GiftDetailModel", nillable = true)
    protected HotelGiftDetail giftDetailModel;

    /**
     * 获取giftDetailModel属性的值。
     * 
     * @return
     *     possible object is
     *     {@link HotelGiftDetail }
     *     
     */
    public HotelGiftDetail getGiftDetailModel() {
        return giftDetailModel;
    }

    /**
     * 设置giftDetailModel属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link HotelGiftDetail }
     *     
     */
    public void setGiftDetailModel(HotelGiftDetail value) {
        this.giftDetailModel = value;
    }

}
