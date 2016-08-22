
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
 *         &lt;element name="GetAllPriceByHotelIdResult" type="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities}GetAllPriceByHotelIdResponse" minOccurs="0"/&gt;
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
    "getAllPriceByHotelIdResult"
})
@XmlRootElement(name = "GetAllPriceByHotelIdResponse")
public class GetAllPriceByHotelIdResponse {

    @XmlElement(name = "GetAllPriceByHotelIdResult", nillable = true)
    protected GetAllPriceByHotelIdResponse2 getAllPriceByHotelIdResult;

    /**
     * 获取getAllPriceByHotelIdResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link GetAllPriceByHotelIdResponse2 }
     *     
     */
    public GetAllPriceByHotelIdResponse2 getGetAllPriceByHotelIdResult() {
        return getAllPriceByHotelIdResult;
    }

    /**
     * 设置getAllPriceByHotelIdResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link GetAllPriceByHotelIdResponse2 }
     *     
     */
    public void setGetAllPriceByHotelIdResult(GetAllPriceByHotelIdResponse2 value) {
        this.getAllPriceByHotelIdResult = value;
    }

}
