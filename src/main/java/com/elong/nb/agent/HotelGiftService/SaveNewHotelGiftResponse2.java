
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
 *         &lt;element name="SaveNewHotelGiftResult" type="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response}SaveNewHotelGiftResponse" minOccurs="0"/>
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
    "saveNewHotelGiftResult"
})
@XmlRootElement(name = "SaveNewHotelGiftResponse")
public class SaveNewHotelGiftResponse2 {

    @XmlElement(name = "SaveNewHotelGiftResult", nillable = true)
    protected SaveNewHotelGiftResponse saveNewHotelGiftResult;

    /**
     * 获取saveNewHotelGiftResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SaveNewHotelGiftResponse }
     *     
     */
    public SaveNewHotelGiftResponse getSaveNewHotelGiftResult() {
        return saveNewHotelGiftResult;
    }

    /**
     * 设置saveNewHotelGiftResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SaveNewHotelGiftResponse }
     *     
     */
    public void setSaveNewHotelGiftResult(SaveNewHotelGiftResponse value) {
        this.saveNewHotelGiftResult = value;
    }

}
