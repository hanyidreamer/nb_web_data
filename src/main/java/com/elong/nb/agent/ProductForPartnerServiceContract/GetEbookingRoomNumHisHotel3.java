
package com.elong.nb.agent.ProductForPartnerServiceContract;

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
 *         &lt;element name="request" type="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Request.Product4Partners}GetEbookingRoomNumHisHotel3Request" minOccurs="0"/&gt;
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
    "request"
})
@XmlRootElement(name = "GetEbookingRoomNumHisHotel3")
public class GetEbookingRoomNumHisHotel3 {

    @XmlElement(nillable = true)
    protected GetEbookingRoomNumHisHotel3Request request;

    /**
     * 获取request属性的值。
     * 
     * @return
     *     possible object is
     *     {@link GetEbookingRoomNumHisHotel3Request }
     *     
     */
    public GetEbookingRoomNumHisHotel3Request getRequest() {
        return request;
    }

    /**
     * 设置request属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link GetEbookingRoomNumHisHotel3Request }
     *     
     */
    public void setRequest(GetEbookingRoomNumHisHotel3Request value) {
        this.request = value;
    }

}
