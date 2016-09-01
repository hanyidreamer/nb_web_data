
package com.elong.nb.agent.HotelGiftService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>GetHotelGiftListResponse complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="GetHotelGiftListResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Framework}ServiceResponseBase">
 *       &lt;sequence>
 *         &lt;element name="HotelGiftList" type="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model}ArrayOfHotelGiftModel" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetHotelGiftListResponse", namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response.HotelGift", propOrder = {
    "hotelGiftList"
})
public class GetHotelGiftListResponse
    extends ServiceResponseBase
{

    @XmlElement(name = "HotelGiftList", nillable = true)
    protected ArrayOfHotelGiftModel hotelGiftList;

    /**
     * 获取hotelGiftList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfHotelGiftModel }
     *     
     */
    public ArrayOfHotelGiftModel getHotelGiftList() {
        return hotelGiftList;
    }

    /**
     * 设置hotelGiftList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfHotelGiftModel }
     *     
     */
    public void setHotelGiftList(ArrayOfHotelGiftModel value) {
        this.hotelGiftList = value;
    }

}
