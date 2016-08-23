
package com.elong.nb.agent.ProductForPartnerServiceContract;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>MRoomInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="MRoomInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Area" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FloorNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HotelID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IsAvailable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsDc" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Notes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NotesEN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RoomAddition" type="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model}ArrayOfMRoomAddition" minOccurs="0"/&gt;
 *         &lt;element name="RoomID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RoomName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RoomNameEn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RoomOrder" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RoomSeparateNums" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RoomTypeNum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RoomUniqueId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Time_switch" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MRoomInfo", namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model", propOrder = {
    "area",
    "floorNum",
    "hotelID",
    "isAvailable",
    "isDc",
    "notes",
    "notesEN",
    "roomAddition",
    "roomID",
    "roomName",
    "roomNameEn",
    "roomOrder",
    "roomSeparateNums",
    "roomTypeNum",
    "roomUniqueId",
    "timeSwitch"
})
public class MRoomInfo {

    @XmlElement(name = "Area", nillable = true)
    protected String area;
    @XmlElement(name = "FloorNum", nillable = true)
    protected String floorNum;
    @XmlElement(name = "HotelID", nillable = true)
    protected String hotelID;
    @XmlElement(name = "IsAvailable")
    protected Boolean isAvailable;
    @XmlElement(name = "IsDc")
    protected Boolean isDc;
    @XmlElement(name = "Notes", nillable = true)
    protected String notes;
    @XmlElement(name = "NotesEN", nillable = true)
    protected String notesEN;
    @XmlElement(name = "RoomAddition", nillable = true)
    protected ArrayOfMRoomAddition roomAddition;
    @XmlElement(name = "RoomID", nillable = true)
    protected String roomID;
    @XmlElement(name = "RoomName", nillable = true)
    protected String roomName;
    @XmlElement(name = "RoomNameEn", nillable = true)
    protected String roomNameEn;
    @XmlElement(name = "RoomOrder", nillable = true)
    protected String roomOrder;
    @XmlElement(name = "RoomSeparateNums")
    protected Integer roomSeparateNums;
    @XmlElement(name = "RoomTypeNum")
    protected Integer roomTypeNum;
    @XmlElement(name = "RoomUniqueId", nillable = true)
    protected String roomUniqueId;
    @XmlElement(name = "Time_switch")
    protected Boolean timeSwitch;

    /**
     * 获取area属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArea() {
        return area;
    }

    /**
     * 设置area属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArea(String value) {
        this.area = value;
    }

    /**
     * 获取floorNum属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFloorNum() {
        return floorNum;
    }

    /**
     * 设置floorNum属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFloorNum(String value) {
        this.floorNum = value;
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
     * 获取isAvailable属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsAvailable() {
        return isAvailable;
    }

    /**
     * 设置isAvailable属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsAvailable(Boolean value) {
        this.isAvailable = value;
    }

    /**
     * 获取isDc属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsDc() {
        return isDc;
    }

    /**
     * 设置isDc属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsDc(Boolean value) {
        this.isDc = value;
    }

    /**
     * 获取notes属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotes() {
        return notes;
    }

    /**
     * 设置notes属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotes(String value) {
        this.notes = value;
    }

    /**
     * 获取notesEN属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotesEN() {
        return notesEN;
    }

    /**
     * 设置notesEN属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotesEN(String value) {
        this.notesEN = value;
    }

    /**
     * 获取roomAddition属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMRoomAddition }
     *     
     */
    public ArrayOfMRoomAddition getRoomAddition() {
        return roomAddition;
    }

    /**
     * 设置roomAddition属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMRoomAddition }
     *     
     */
    public void setRoomAddition(ArrayOfMRoomAddition value) {
        this.roomAddition = value;
    }

    /**
     * 获取roomID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomID() {
        return roomID;
    }

    /**
     * 设置roomID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomID(String value) {
        this.roomID = value;
    }

    /**
     * 获取roomName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomName() {
        return roomName;
    }

    /**
     * 设置roomName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomName(String value) {
        this.roomName = value;
    }

    /**
     * 获取roomNameEn属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomNameEn() {
        return roomNameEn;
    }

    /**
     * 设置roomNameEn属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomNameEn(String value) {
        this.roomNameEn = value;
    }

    /**
     * 获取roomOrder属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomOrder() {
        return roomOrder;
    }

    /**
     * 设置roomOrder属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomOrder(String value) {
        this.roomOrder = value;
    }

    /**
     * 获取roomSeparateNums属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRoomSeparateNums() {
        return roomSeparateNums;
    }

    /**
     * 设置roomSeparateNums属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRoomSeparateNums(Integer value) {
        this.roomSeparateNums = value;
    }

    /**
     * 获取roomTypeNum属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRoomTypeNum() {
        return roomTypeNum;
    }

    /**
     * 设置roomTypeNum属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRoomTypeNum(Integer value) {
        this.roomTypeNum = value;
    }

    /**
     * 获取roomUniqueId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomUniqueId() {
        return roomUniqueId;
    }

    /**
     * 设置roomUniqueId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomUniqueId(String value) {
        this.roomUniqueId = value;
    }

    /**
     * 获取timeSwitch属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTimeSwitch() {
        return timeSwitch;
    }

    /**
     * 设置timeSwitch属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTimeSwitch(Boolean value) {
        this.timeSwitch = value;
    }

}
