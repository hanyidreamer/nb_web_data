
package com.elong.nb.agent.HotelGiftService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>SaveHotelGiftRequest complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SaveHotelGiftRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Request}ProductRequestBase">
 *       &lt;sequence>
 *         &lt;element name="model" type="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model}HotelGiftModel" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SaveHotelGiftRequest", namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Request", propOrder = {
    "model"
})
public class SaveHotelGiftRequest
    extends ProductRequestBase
{

    @XmlElement(nillable = true)
    protected HotelGiftModel model;

    /**
     * 获取model属性的值。
     * 
     * @return
     *     possible object is
     *     {@link HotelGiftModel }
     *     
     */
    public HotelGiftModel getModel() {
        return model;
    }

    /**
     * 设置model属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link HotelGiftModel }
     *     
     */
    public void setModel(HotelGiftModel value) {
        this.model = value;
    }

}
