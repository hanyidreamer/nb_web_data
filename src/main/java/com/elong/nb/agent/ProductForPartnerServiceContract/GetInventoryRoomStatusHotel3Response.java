
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
 *         &lt;element name="GetInventoryRoomStatusHotel3Result" type="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response.Inventory}GetInventoryRoomStatusResponse" minOccurs="0"/&gt;
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
    "getInventoryRoomStatusHotel3Result"
})
@XmlRootElement(name = "GetInventoryRoomStatusHotel3Response")
public class GetInventoryRoomStatusHotel3Response {

    @XmlElement(name = "GetInventoryRoomStatusHotel3Result", nillable = true)
    protected GetInventoryRoomStatusResponse getInventoryRoomStatusHotel3Result;

    /**
     * 获取getInventoryRoomStatusHotel3Result属性的值。
     * 
     * @return
     *     possible object is
     *     {@link GetInventoryRoomStatusResponse }
     *     
     */
    public GetInventoryRoomStatusResponse getGetInventoryRoomStatusHotel3Result() {
        return getInventoryRoomStatusHotel3Result;
    }

    /**
     * 设置getInventoryRoomStatusHotel3Result属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link GetInventoryRoomStatusResponse }
     *     
     */
    public void setGetInventoryRoomStatusHotel3Result(GetInventoryRoomStatusResponse value) {
        this.getInventoryRoomStatusHotel3Result = value;
    }

}
