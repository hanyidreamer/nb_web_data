
package com.elong.nb.agent.HotelGiftService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>SaveHotelGiftResponse complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SaveHotelGiftResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Framework}ServiceResponseBase">
 *       &lt;sequence>
 *         &lt;element name="GiftID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SHotelID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SaveHotelGiftResponse", namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response", propOrder = {
    "giftID",
    "sHotelID"
})
public class SaveHotelGiftResponse
    extends ServiceResponseBase
{

    @XmlElement(name = "GiftID")
    protected Integer giftID;
    @XmlElement(name = "SHotelID", nillable = true)
    protected String sHotelID;

    /**
     * 获取giftID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGiftID() {
        return giftID;
    }

    /**
     * 设置giftID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGiftID(Integer value) {
        this.giftID = value;
    }

    /**
     * 获取sHotelID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSHotelID() {
        return sHotelID;
    }

    /**
     * 设置sHotelID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSHotelID(String value) {
        this.sHotelID = value;
    }

}
