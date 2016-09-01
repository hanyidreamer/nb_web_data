
package com.elong.nb.agent.HotelGiftService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UpdateHotelGiftTypeResult" type="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response.HotelGift}UpdateHotelGiftTypeResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "updateHotelGiftTypeResult"
})
@XmlRootElement(name = "UpdateHotelGiftTypeResponse")
public class UpdateHotelGiftTypeResponse2 {

    @XmlElement(name = "UpdateHotelGiftTypeResult", nillable = true)
    protected UpdateHotelGiftTypeResponse updateHotelGiftTypeResult;

    /**
     * 获取updateHotelGiftTypeResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link UpdateHotelGiftTypeResponse }
     *     
     */
    public UpdateHotelGiftTypeResponse getUpdateHotelGiftTypeResult() {
        return updateHotelGiftTypeResult;
    }

    /**
     * 设置updateHotelGiftTypeResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateHotelGiftTypeResponse }
     *     
     */
    public void setUpdateHotelGiftTypeResult(UpdateHotelGiftTypeResponse value) {
        this.updateHotelGiftTypeResult = value;
    }

}
