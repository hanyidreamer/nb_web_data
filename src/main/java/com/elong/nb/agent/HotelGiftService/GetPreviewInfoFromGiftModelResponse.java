
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
 *         &lt;element name="GetPreviewInfoFromGiftModelResult" type="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response.HotelGift}GetGiftInfoPreviewResponse" minOccurs="0"/>
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
    "getPreviewInfoFromGiftModelResult"
})
@XmlRootElement(name = "GetPreviewInfoFromGiftModelResponse")
public class GetPreviewInfoFromGiftModelResponse {

    @XmlElement(name = "GetPreviewInfoFromGiftModelResult", nillable = true)
    protected GetGiftInfoPreviewResponse getPreviewInfoFromGiftModelResult;

    /**
     * 获取getPreviewInfoFromGiftModelResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link GetGiftInfoPreviewResponse }
     *     
     */
    public GetGiftInfoPreviewResponse getGetPreviewInfoFromGiftModelResult() {
        return getPreviewInfoFromGiftModelResult;
    }

    /**
     * 设置getPreviewInfoFromGiftModelResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link GetGiftInfoPreviewResponse }
     *     
     */
    public void setGetPreviewInfoFromGiftModelResult(GetGiftInfoPreviewResponse value) {
        this.getPreviewInfoFromGiftModelResult = value;
    }

}
