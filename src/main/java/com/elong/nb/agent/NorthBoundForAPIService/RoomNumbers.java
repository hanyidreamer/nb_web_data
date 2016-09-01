
package com.elong.nb.agent.NorthBoundForAPIService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>RoomNumbers complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="RoomNumbers"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EnumRoomNumStatus" type="{http://schemas.datacontract.org/2004/07/Com.Elong.Utility.Hotel.Enum}EnumRoomNumStatus" minOccurs="0"/&gt;
 *         &lt;element name="HotelID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RoomNumList" type="{http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.Domain.Hotel}ArrayOfRoomNumDay" minOccurs="0"/&gt;
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
@XmlType(name = "RoomNumbers", namespace = "http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.Domain.Hotel", propOrder = {
    "enumRoomNumStatus",
    "hotelID",
    "roomNumList",
    "roomTypeID"
})
public class RoomNumbers {

    @XmlElement(name = "EnumRoomNumStatus")
    @XmlSchemaType(name = "string")
    protected EnumRoomNumStatus enumRoomNumStatus;
    @XmlElement(name = "HotelID", nillable = true)
    protected String hotelID;
    @XmlElement(name = "RoomNumList", nillable = true)
    protected ArrayOfRoomNumDay roomNumList;
    @XmlElement(name = "RoomTypeID", nillable = true)
    protected String roomTypeID;

    /**
     * 获取enumRoomNumStatus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link EnumRoomNumStatus }
     *     
     */
    public EnumRoomNumStatus getEnumRoomNumStatus() {
        return enumRoomNumStatus;
    }

    /**
     * 设置enumRoomNumStatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link EnumRoomNumStatus }
     *     
     */
    public void setEnumRoomNumStatus(EnumRoomNumStatus value) {
        this.enumRoomNumStatus = value;
    }

    /**
     * 获取hotelID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHotelID() {
        return hotelID;
    }

    /**
     * 设置hotelID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHotelID(String value) {
        this.hotelID = value;
    }

    /**
     * 获取roomNumList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRoomNumDay }
     *     
     */
    public ArrayOfRoomNumDay getRoomNumList() {
        return roomNumList;
    }

    /**
     * 设置roomNumList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRoomNumDay }
     *     
     */
    public void setRoomNumList(ArrayOfRoomNumDay value) {
        this.roomNumList = value;
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
