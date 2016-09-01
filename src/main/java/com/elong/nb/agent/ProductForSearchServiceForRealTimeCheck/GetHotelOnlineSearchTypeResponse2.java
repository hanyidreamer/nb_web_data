
package com.elong.nb.agent.ProductForSearchServiceForRealTimeCheck;

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
 *         &lt;element name="GetHotelOnlineSearchTypeResult" type="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response}GetHotelOnlineSearchTypeResponse" minOccurs="0"/&gt;
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
    "getHotelOnlineSearchTypeResult"
})
@XmlRootElement(name = "GetHotelOnlineSearchTypeResponse")
public class GetHotelOnlineSearchTypeResponse2 {

    @XmlElement(name = "GetHotelOnlineSearchTypeResult", nillable = true)
    protected GetHotelOnlineSearchTypeResponse getHotelOnlineSearchTypeResult;

    /**
     * 获取getHotelOnlineSearchTypeResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link GetHotelOnlineSearchTypeResponse }
     *     
     */
    public GetHotelOnlineSearchTypeResponse getGetHotelOnlineSearchTypeResult() {
        return getHotelOnlineSearchTypeResult;
    }

    /**
     * 设置getHotelOnlineSearchTypeResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link GetHotelOnlineSearchTypeResponse }
     *     
     */
    public void setGetHotelOnlineSearchTypeResult(GetHotelOnlineSearchTypeResponse value) {
        this.getHotelOnlineSearchTypeResult = value;
    }

}
