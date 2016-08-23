
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
 *         &lt;element name="GetHotelInventorySumRoomToProcUseV1Result" type="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response.HotelProduct}HotelResourceInventoryStateInfoProcResponse" minOccurs="0"/&gt;
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
    "getHotelInventorySumRoomToProcUseV1Result"
})
@XmlRootElement(name = "GetHotelInventorySumRoomToProcUseV1Response")
public class GetHotelInventorySumRoomToProcUseV1Response {

    @XmlElement(name = "GetHotelInventorySumRoomToProcUseV1Result", nillable = true)
    protected HotelResourceInventoryStateInfoProcResponse getHotelInventorySumRoomToProcUseV1Result;

    /**
     * 获取getHotelInventorySumRoomToProcUseV1Result属性的值。
     * 
     * @return
     *     possible object is
     *     {@link HotelResourceInventoryStateInfoProcResponse }
     *     
     */
    public HotelResourceInventoryStateInfoProcResponse getGetHotelInventorySumRoomToProcUseV1Result() {
        return getHotelInventorySumRoomToProcUseV1Result;
    }

    /**
     * 设置getHotelInventorySumRoomToProcUseV1Result属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link HotelResourceInventoryStateInfoProcResponse }
     *     
     */
    public void setGetHotelInventorySumRoomToProcUseV1Result(HotelResourceInventoryStateInfoProcResponse value) {
        this.getHotelInventorySumRoomToProcUseV1Result = value;
    }

}
