
package com.elong.nb.agent.NorthBoundForAPIService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>RoomRate complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="RoomRate"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RatePlans" type="{http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.Domain.Hotel.Entity}ArrayOfRatePlanBaseInfo" minOccurs="0"/&gt;
 *         &lt;element name="RoomTypeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoomRate", namespace = "http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.Domain.Hotel", propOrder = {
    "ratePlans",
    "roomTypeId"
})
public class RoomRate {

    @XmlElement(name = "RatePlans", nillable = true)
    protected ArrayOfRatePlanBaseInfo ratePlans;
    @XmlElement(name = "RoomTypeId", nillable = true)
    protected String roomTypeId;

    /**
     * 获取ratePlans属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRatePlanBaseInfo }
     *     
     */
    public ArrayOfRatePlanBaseInfo getRatePlans() {
        return ratePlans;
    }

    /**
     * 设置ratePlans属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRatePlanBaseInfo }
     *     
     */
    public void setRatePlans(ArrayOfRatePlanBaseInfo value) {
        this.ratePlans = value;
    }

    /**
     * 获取roomTypeId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomTypeId() {
        return roomTypeId;
    }

    /**
     * 设置roomTypeId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomTypeId(String value) {
        this.roomTypeId = value;
    }

}
