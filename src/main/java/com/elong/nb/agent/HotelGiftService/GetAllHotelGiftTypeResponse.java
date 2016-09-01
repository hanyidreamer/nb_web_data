
package com.elong.nb.agent.HotelGiftService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>GetAllHotelGiftTypeResponse complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="GetAllHotelGiftTypeResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Framework}ServiceResponseBase">
 *       &lt;sequence>
 *         &lt;element name="HotelGiftTypeList" type="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model}ArrayOfHotelGiftType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetAllHotelGiftTypeResponse", namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response.HotelGift", propOrder = {
    "hotelGiftTypeList"
})
public class GetAllHotelGiftTypeResponse
    extends ServiceResponseBase
{

    @XmlElement(name = "HotelGiftTypeList", nillable = true)
    protected ArrayOfHotelGiftType hotelGiftTypeList;

    /**
     * 获取hotelGiftTypeList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfHotelGiftType }
     *     
     */
    public ArrayOfHotelGiftType getHotelGiftTypeList() {
        return hotelGiftTypeList;
    }

    /**
     * 设置hotelGiftTypeList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfHotelGiftType }
     *     
     */
    public void setHotelGiftTypeList(ArrayOfHotelGiftType value) {
        this.hotelGiftTypeList = value;
    }

}
