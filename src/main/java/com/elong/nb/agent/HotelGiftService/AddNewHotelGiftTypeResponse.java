
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
 *         &lt;element name="AddNewHotelGiftTypeResult" type="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response.HotelGift}UpdateHotelGiftTypeResponse" minOccurs="0"/>
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
    "addNewHotelGiftTypeResult"
})
@XmlRootElement(name = "AddNewHotelGiftTypeResponse")
public class AddNewHotelGiftTypeResponse {

    @XmlElement(name = "AddNewHotelGiftTypeResult", nillable = true)
    protected UpdateHotelGiftTypeResponse addNewHotelGiftTypeResult;

    /**
     * 获取addNewHotelGiftTypeResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link UpdateHotelGiftTypeResponse }
     *     
     */
    public UpdateHotelGiftTypeResponse getAddNewHotelGiftTypeResult() {
        return addNewHotelGiftTypeResult;
    }

    /**
     * 设置addNewHotelGiftTypeResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateHotelGiftTypeResponse }
     *     
     */
    public void setAddNewHotelGiftTypeResult(UpdateHotelGiftTypeResponse value) {
        this.addNewHotelGiftTypeResult = value;
    }

}
