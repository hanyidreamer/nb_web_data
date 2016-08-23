
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
 *         &lt;element name="GetEbookingRoomNumHisHotel3Result" type="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response.Product4Partners}GetEbookingRoomNumHisHotel3Response" minOccurs="0"/&gt;
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
    "getEbookingRoomNumHisHotel3Result"
})
@XmlRootElement(name = "GetEbookingRoomNumHisHotel3Response")
public class GetEbookingRoomNumHisHotel3Response2 {

    @XmlElement(name = "GetEbookingRoomNumHisHotel3Result", nillable = true)
    protected GetEbookingRoomNumHisHotel3Response getEbookingRoomNumHisHotel3Result;

    /**
     * 获取getEbookingRoomNumHisHotel3Result属性的值。
     * 
     * @return
     *     possible object is
     *     {@link GetEbookingRoomNumHisHotel3Response }
     *     
     */
    public GetEbookingRoomNumHisHotel3Response getGetEbookingRoomNumHisHotel3Result() {
        return getEbookingRoomNumHisHotel3Result;
    }

    /**
     * 设置getEbookingRoomNumHisHotel3Result属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link GetEbookingRoomNumHisHotel3Response }
     *     
     */
    public void setGetEbookingRoomNumHisHotel3Result(GetEbookingRoomNumHisHotel3Response value) {
        this.getEbookingRoomNumHisHotel3Result = value;
    }

}
