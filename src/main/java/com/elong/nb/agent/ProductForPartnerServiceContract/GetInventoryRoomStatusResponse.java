
package com.elong.nb.agent.ProductForPartnerServiceContract;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>GetInventoryRoomStatusResponse complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="GetInventoryRoomStatusResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Framework}ServiceResponseBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="roomStatusList" type="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model.Inventory}ArrayOfGetHotelInventoryRoomStatus4Backend" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetInventoryRoomStatusResponse", namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response.Inventory", propOrder = {
    "roomStatusList"
})
public class GetInventoryRoomStatusResponse
    extends ServiceResponseBase
{

    @XmlElement(nillable = true)
    protected ArrayOfGetHotelInventoryRoomStatus4Backend roomStatusList;

    /**
     * 获取roomStatusList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfGetHotelInventoryRoomStatus4Backend }
     *     
     */
    public ArrayOfGetHotelInventoryRoomStatus4Backend getRoomStatusList() {
        return roomStatusList;
    }

    /**
     * 设置roomStatusList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfGetHotelInventoryRoomStatus4Backend }
     *     
     */
    public void setRoomStatusList(ArrayOfGetHotelInventoryRoomStatus4Backend value) {
        this.roomStatusList = value;
    }

}
