
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
 *         &lt;element name="GetHotelInventorySumRoomToProcUseV3Result" type="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response.HotelProduct}HotelResourceInventoryStateInfoProcResponse" minOccurs="0"/&gt;
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
    "getHotelInventorySumRoomToProcUseV3Result"
})
@XmlRootElement(name = "GetHotelInventorySumRoomToProcUseV3Response")
public class GetHotelInventorySumRoomToProcUseV3Response {

    @XmlElement(name = "GetHotelInventorySumRoomToProcUseV3Result", nillable = true)
    protected HotelResourceInventoryStateInfoProcResponse getHotelInventorySumRoomToProcUseV3Result;

    /**
     * 获取getHotelInventorySumRoomToProcUseV3Result属性的值。
     * 
     * @return
     *     possible object is
     *     {@link HotelResourceInventoryStateInfoProcResponse }
     *     
     */
    public HotelResourceInventoryStateInfoProcResponse getGetHotelInventorySumRoomToProcUseV3Result() {
        return getHotelInventorySumRoomToProcUseV3Result;
    }

    /**
     * 设置getHotelInventorySumRoomToProcUseV3Result属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link HotelResourceInventoryStateInfoProcResponse }
     *     
     */
    public void setGetHotelInventorySumRoomToProcUseV3Result(HotelResourceInventoryStateInfoProcResponse value) {
        this.getHotelInventorySumRoomToProcUseV3Result = value;
    }

}
