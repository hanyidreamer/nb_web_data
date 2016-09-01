
package com.elong.nb.agent.HotelGiftService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>HotelGiftHisModel complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="HotelGiftHisModel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GiftHisID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="GiftModel" type="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model}HotelGiftModel" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HotelGiftHisModel", namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model", propOrder = {
    "giftHisID",
    "giftModel"
})
public class HotelGiftHisModel {

    @XmlElement(name = "GiftHisID")
    protected Integer giftHisID;
    @XmlElement(name = "GiftModel", nillable = true)
    protected HotelGiftModel giftModel;

    /**
     * 获取giftHisID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGiftHisID() {
        return giftHisID;
    }

    /**
     * 设置giftHisID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGiftHisID(Integer value) {
        this.giftHisID = value;
    }

    /**
     * 获取giftModel属性的值。
     * 
     * @return
     *     possible object is
     *     {@link HotelGiftModel }
     *     
     */
    public HotelGiftModel getGiftModel() {
        return giftModel;
    }

    /**
     * 设置giftModel属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link HotelGiftModel }
     *     
     */
    public void setGiftModel(HotelGiftModel value) {
        this.giftModel = value;
    }

}
