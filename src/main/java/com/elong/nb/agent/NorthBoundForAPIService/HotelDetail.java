
package com.elong.nb.agent.NorthBoundForAPIService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>HotelDetail complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="HotelDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="HaveBookingProudct" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="HotelBaseInfo" type="{http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.Domain.Hotel}HotelInfo" minOccurs="0"/&gt;
 *         &lt;element name="HotelProductRelationList" type="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Contract}ArrayOfHotelProductRelation" minOccurs="0"/&gt;
 *         &lt;element name="HotelTagList" type="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Contract}ArrayOfHotelTag" minOccurs="0"/&gt;
 *         &lt;element name="RoomBaseInfos" type="{http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.Domain.Hotel}ArrayOfRoomTypeInfo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HotelDetail", namespace = "http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.Domain.Hotel", propOrder = {
    "haveBookingProudct",
    "hotelBaseInfo",
    "hotelProductRelationList",
    "hotelTagList",
    "roomBaseInfos"
})
public class HotelDetail {

    @XmlElement(name = "HaveBookingProudct")
    protected Boolean haveBookingProudct;
    @XmlElement(name = "HotelBaseInfo", nillable = true)
    protected HotelInfo hotelBaseInfo;
    @XmlElement(name = "HotelProductRelationList", nillable = true)
    protected ArrayOfHotelProductRelation hotelProductRelationList;
    @XmlElement(name = "HotelTagList", nillable = true)
    protected ArrayOfHotelTag hotelTagList;
    @XmlElement(name = "RoomBaseInfos", nillable = true)
    protected ArrayOfRoomTypeInfo roomBaseInfos;

    /**
     * 获取haveBookingProudct属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHaveBookingProudct() {
        return haveBookingProudct;
    }

    /**
     * 设置haveBookingProudct属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHaveBookingProudct(Boolean value) {
        this.haveBookingProudct = value;
    }

    /**
     * 获取hotelBaseInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link HotelInfo }
     *     
     */
    public HotelInfo getHotelBaseInfo() {
        return hotelBaseInfo;
    }

    /**
     * 设置hotelBaseInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link HotelInfo }
     *     
     */
    public void setHotelBaseInfo(HotelInfo value) {
        this.hotelBaseInfo = value;
    }

    /**
     * 获取hotelProductRelationList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfHotelProductRelation }
     *     
     */
    public ArrayOfHotelProductRelation getHotelProductRelationList() {
        return hotelProductRelationList;
    }

    /**
     * 设置hotelProductRelationList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfHotelProductRelation }
     *     
     */
    public void setHotelProductRelationList(ArrayOfHotelProductRelation value) {
        this.hotelProductRelationList = value;
    }

    /**
     * 获取hotelTagList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfHotelTag }
     *     
     */
    public ArrayOfHotelTag getHotelTagList() {
        return hotelTagList;
    }

    /**
     * 设置hotelTagList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfHotelTag }
     *     
     */
    public void setHotelTagList(ArrayOfHotelTag value) {
        this.hotelTagList = value;
    }

    /**
     * 获取roomBaseInfos属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRoomTypeInfo }
     *     
     */
    public ArrayOfRoomTypeInfo getRoomBaseInfos() {
        return roomBaseInfos;
    }

    /**
     * 设置roomBaseInfos属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRoomTypeInfo }
     *     
     */
    public void setRoomBaseInfos(ArrayOfRoomTypeInfo value) {
        this.roomBaseInfos = value;
    }

}
