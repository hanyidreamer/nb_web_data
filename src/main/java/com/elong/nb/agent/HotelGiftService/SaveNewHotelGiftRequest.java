
package com.elong.nb.agent.HotelGiftService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>SaveNewHotelGiftRequest complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SaveNewHotelGiftRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Request}ProductRequestBase">
 *       &lt;sequence>
 *         &lt;element name="model" type="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model}NewHotelGiftModel" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SaveNewHotelGiftRequest", namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Request", propOrder = {
    "model"
})
public class SaveNewHotelGiftRequest
    extends ProductRequestBase
{

    @XmlElement(nillable = true)
    protected NewHotelGiftModel model;

    /**
     * 获取model属性的值。
     * 
     * @return
     *     possible object is
     *     {@link NewHotelGiftModel }
     *     
     */
    public NewHotelGiftModel getModel() {
        return model;
    }

    /**
     * 设置model属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link NewHotelGiftModel }
     *     
     */
    public void setModel(NewHotelGiftModel value) {
        this.model = value;
    }

}
