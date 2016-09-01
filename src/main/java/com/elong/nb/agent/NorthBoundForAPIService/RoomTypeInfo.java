
package com.elong.nb.agent.NorthBoundForAPIService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>RoomTypeInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="RoomTypeInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Contract}RoomTypeInfoBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BuyedRoomNumbers" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RoomAdditionList" type="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Contract}ArrayOfRoomAdditionDefine" minOccurs="0"/&gt;
 *         &lt;element name="RoomBookingRuleList" type="{http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.Domain.Hotel.HotelProductUseBusiness}ArrayOfHotelBookingRule" minOccurs="0"/&gt;
 *         &lt;element name="RoomNumbers" type="{http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.Domain.Hotel}RoomNumbers" minOccurs="0"/&gt;
 *         &lt;element name="RoomRate" type="{http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.Domain.Hotel}RoomRate" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoomTypeInfo", namespace = "http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.Domain.Hotel", propOrder = {
    "buyedRoomNumbers",
    "roomAdditionList",
    "roomBookingRuleList",
    "roomNumbers",
    "roomRate"
})
public class RoomTypeInfo
    extends RoomTypeInfoBase
{

    @XmlElement(name = "BuyedRoomNumbers")
    protected Integer buyedRoomNumbers;
    @XmlElement(name = "RoomAdditionList", nillable = true)
    protected ArrayOfRoomAdditionDefine roomAdditionList;
    @XmlElement(name = "RoomBookingRuleList", nillable = true)
    protected ArrayOfHotelBookingRule roomBookingRuleList;
    @XmlElement(name = "RoomNumbers", nillable = true)
    protected RoomNumbers roomNumbers;
    @XmlElement(name = "RoomRate", nillable = true)
    protected RoomRate roomRate;

    /**
     * 获取buyedRoomNumbers属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBuyedRoomNumbers() {
        return buyedRoomNumbers;
    }

    /**
     * 设置buyedRoomNumbers属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBuyedRoomNumbers(Integer value) {
        this.buyedRoomNumbers = value;
    }

    /**
     * 获取roomAdditionList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRoomAdditionDefine }
     *     
     */
    public ArrayOfRoomAdditionDefine getRoomAdditionList() {
        return roomAdditionList;
    }

    /**
     * 设置roomAdditionList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRoomAdditionDefine }
     *     
     */
    public void setRoomAdditionList(ArrayOfRoomAdditionDefine value) {
        this.roomAdditionList = value;
    }

    /**
     * 获取roomBookingRuleList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfHotelBookingRule }
     *     
     */
    public ArrayOfHotelBookingRule getRoomBookingRuleList() {
        return roomBookingRuleList;
    }

    /**
     * 设置roomBookingRuleList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfHotelBookingRule }
     *     
     */
    public void setRoomBookingRuleList(ArrayOfHotelBookingRule value) {
        this.roomBookingRuleList = value;
    }

    /**
     * 获取roomNumbers属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RoomNumbers }
     *     
     */
    public RoomNumbers getRoomNumbers() {
        return roomNumbers;
    }

    /**
     * 设置roomNumbers属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RoomNumbers }
     *     
     */
    public void setRoomNumbers(RoomNumbers value) {
        this.roomNumbers = value;
    }

    /**
     * 获取roomRate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RoomRate }
     *     
     */
    public RoomRate getRoomRate() {
        return roomRate;
    }

    /**
     * 设置roomRate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RoomRate }
     *     
     */
    public void setRoomRate(RoomRate value) {
        this.roomRate = value;
    }

}
