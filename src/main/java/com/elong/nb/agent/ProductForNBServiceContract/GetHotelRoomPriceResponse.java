
package com.elong.nb.agent.ProductForNBServiceContract;

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
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GetHotelRoomPriceResult" type="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities}GetHotelRoomPriceResponse" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getHotelRoomPriceResult"
})
@XmlRootElement(name = "GetHotelRoomPriceResponse")
public class GetHotelRoomPriceResponse {

    @XmlElement(name = "GetHotelRoomPriceResult", nillable = true)
    protected GetHotelRoomPriceResponse2 getHotelRoomPriceResult;

    /**
     * 获取getHotelRoomPriceResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link GetHotelRoomPriceResponse2 }
     *     
     */
    public GetHotelRoomPriceResponse2 getGetHotelRoomPriceResult() {
        return getHotelRoomPriceResult;
    }

    /**
     * 设置getHotelRoomPriceResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link GetHotelRoomPriceResponse2 }
     *     
     */
    public void setGetHotelRoomPriceResult(GetHotelRoomPriceResponse2 value) {
        this.getHotelRoomPriceResult = value;
    }

}
