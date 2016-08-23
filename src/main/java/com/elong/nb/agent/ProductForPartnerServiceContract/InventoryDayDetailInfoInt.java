
package com.elong.nb.agent.ProductForPartnerServiceContract;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>InventoryDayDetailInfoInt complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="InventoryDayDetailInfoInt"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="InventoryDetailList" type="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model}ArrayOfResourceInventoryDetailInt" minOccurs="0"/&gt;
 *         &lt;element name="RoomTypeID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InventoryDayDetailInfoInt", namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model", propOrder = {
    "inventoryDetailList",
    "roomTypeID"
})
public class InventoryDayDetailInfoInt {

    @XmlElement(name = "InventoryDetailList", nillable = true)
    protected ArrayOfResourceInventoryDetailInt inventoryDetailList;
    @XmlElement(name = "RoomTypeID", nillable = true)
    protected String roomTypeID;

    /**
     * 获取inventoryDetailList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfResourceInventoryDetailInt }
     *     
     */
    public ArrayOfResourceInventoryDetailInt getInventoryDetailList() {
        return inventoryDetailList;
    }

    /**
     * 设置inventoryDetailList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfResourceInventoryDetailInt }
     *     
     */
    public void setInventoryDetailList(ArrayOfResourceInventoryDetailInt value) {
        this.inventoryDetailList = value;
    }

    /**
     * 获取roomTypeID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomTypeID() {
        return roomTypeID;
    }

    /**
     * 设置roomTypeID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomTypeID(String value) {
        this.roomTypeID = value;
    }

}
