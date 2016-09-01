
package com.elong.nb.agent.HotelGiftService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>GetNewHotelGiftDetailResponse complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="GetNewHotelGiftDetailResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Framework}ServiceResponseBase">
 *       &lt;sequence>
 *         &lt;element name="NewGiftDetailModel" type="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model}NewHotelGiftDetail" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetNewHotelGiftDetailResponse", namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response.HotelGift", propOrder = {
    "newGiftDetailModel"
})
public class GetNewHotelGiftDetailResponse
    extends ServiceResponseBase
{

    @XmlElement(name = "NewGiftDetailModel", nillable = true)
    protected NewHotelGiftDetail newGiftDetailModel;

    /**
     * 获取newGiftDetailModel属性的值。
     * 
     * @return
     *     possible object is
     *     {@link NewHotelGiftDetail }
     *     
     */
    public NewHotelGiftDetail getNewGiftDetailModel() {
        return newGiftDetailModel;
    }

    /**
     * 设置newGiftDetailModel属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link NewHotelGiftDetail }
     *     
     */
    public void setNewGiftDetailModel(NewHotelGiftDetail value) {
        this.newGiftDetailModel = value;
    }

}
