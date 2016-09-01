
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
 *         &lt;element name="GetGiftTypeCheckResult" type="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response.HotelGift}GetGiftTypeCheckResponse" minOccurs="0"/>
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
    "getGiftTypeCheckResult"
})
@XmlRootElement(name = "GetGiftTypeCheckResponse")
public class GetGiftTypeCheckResponse2 {

    @XmlElement(name = "GetGiftTypeCheckResult", nillable = true)
    protected GetGiftTypeCheckResponse getGiftTypeCheckResult;

    /**
     * 获取getGiftTypeCheckResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link GetGiftTypeCheckResponse }
     *     
     */
    public GetGiftTypeCheckResponse getGetGiftTypeCheckResult() {
        return getGiftTypeCheckResult;
    }

    /**
     * 设置getGiftTypeCheckResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link GetGiftTypeCheckResponse }
     *     
     */
    public void setGetGiftTypeCheckResult(GetGiftTypeCheckResponse value) {
        this.getGiftTypeCheckResult = value;
    }

}
