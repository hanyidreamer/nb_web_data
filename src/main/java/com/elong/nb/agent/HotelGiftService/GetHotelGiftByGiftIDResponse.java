
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
 *         &lt;element name="GetHotelGiftByGiftIDResult" type="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response.HotelGift}GetHotelGiftDetailResponse" minOccurs="0"/>
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
    "getHotelGiftByGiftIDResult"
})
@XmlRootElement(name = "GetHotelGiftByGiftIDResponse")
public class GetHotelGiftByGiftIDResponse {

    @XmlElement(name = "GetHotelGiftByGiftIDResult", nillable = true)
    protected GetHotelGiftDetailResponse getHotelGiftByGiftIDResult;

    /**
     * 获取getHotelGiftByGiftIDResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link GetHotelGiftDetailResponse }
     *     
     */
    public GetHotelGiftDetailResponse getGetHotelGiftByGiftIDResult() {
        return getHotelGiftByGiftIDResult;
    }

    /**
     * 设置getHotelGiftByGiftIDResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link GetHotelGiftDetailResponse }
     *     
     */
    public void setGetHotelGiftByGiftIDResult(GetHotelGiftDetailResponse value) {
        this.getHotelGiftByGiftIDResult = value;
    }

}
