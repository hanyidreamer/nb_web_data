
package com.elong.nb.agent.NorthBoundForAPIService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.joda.time.DateTime;


/**
 * <p>RoomTypeInfoBase complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="RoomTypeInfoBase"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Area" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Available" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" minOccurs="0"/&gt;
 *         &lt;element name="AvailableName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Floor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HotelId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IsOntimeConfirmRoom" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="OpDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="OpIp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Operator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OtherNotes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OtherNotesEn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RoomLines" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" minOccurs="0"/&gt;
 *         &lt;element name="RoomSeparateNums" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RoomTypeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RoomTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RoomTypeNameEn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RoomTypeNum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RoomUniqueId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="iProductType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoomTypeInfoBase", namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Contract", propOrder = {
    "area",
    "available",
    "availableName",
    "floor",
    "hotelId",
    "isOntimeConfirmRoom",
    "opDate",
    "opIp",
    "operator",
    "otherNotes",
    "otherNotesEn",
    "rId",
    "roomLines",
    "roomSeparateNums",
    "roomTypeId",
    "roomTypeName",
    "roomTypeNameEn",
    "roomTypeNum",
    "roomUniqueId",
    "iProductType"
})
@XmlSeeAlso({
    RoomTypeInfo.class
})
public class RoomTypeInfoBase {

    @XmlElement(name = "Area", nillable = true)
    protected String area;
    @XmlElement(name = "Available")
    @XmlSchemaType(name = "unsignedByte")
    protected Short available;
    @XmlElement(name = "AvailableName", nillable = true)
    protected String availableName;
    @XmlElement(name = "Floor", nillable = true)
    protected String floor;
    @XmlElement(name = "HotelId", nillable = true)
    protected String hotelId;
    @XmlElement(name = "IsOntimeConfirmRoom")
    protected Integer isOntimeConfirmRoom;
    @XmlElement(name = "OpDate", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected DateTime opDate;
    @XmlElement(name = "OpIp", nillable = true)
    protected String opIp;
    @XmlElement(name = "Operator", nillable = true)
    protected String operator;
    @XmlElement(name = "OtherNotes", nillable = true)
    protected String otherNotes;
    @XmlElement(name = "OtherNotesEn", nillable = true)
    protected String otherNotesEn;
    @XmlElement(name = "RId")
    protected Integer rId;
    @XmlElement(name = "RoomLines")
    @XmlSchemaType(name = "unsignedByte")
    protected Short roomLines;
    @XmlElement(name = "RoomSeparateNums")
    protected Integer roomSeparateNums;
    @XmlElement(name = "RoomTypeId", nillable = true)
    protected String roomTypeId;
    @XmlElement(name = "RoomTypeName", nillable = true)
    protected String roomTypeName;
    @XmlElement(name = "RoomTypeNameEn", nillable = true)
    protected String roomTypeNameEn;
    @XmlElement(name = "RoomTypeNum")
    protected Integer roomTypeNum;
    @XmlElement(name = "RoomUniqueId", nillable = true)
    protected String roomUniqueId;
    protected Integer iProductType;

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
     * 获取available属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getAvailable() {
        return available;
    }

    /**
     * 设置available属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setAvailable(Short value) {
        this.available = value;
    }

    /**
     * 获取availableName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAvailableName() {
        return availableName;
    }

    /**
     * 设置availableName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAvailableName(String value) {
        this.availableName = value;
    }

    /**
     * 获取floor属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFloor() {
        return floor;
    }

    /**
     * 设置floor属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFloor(String value) {
        this.floor = value;
    }

    /**
     * 获取hotelId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHotelId() {
        return hotelId;
    }

    /**
     * 设置hotelId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHotelId(String value) {
        this.hotelId = value;
    }

    /**
     * 获取isOntimeConfirmRoom属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIsOntimeConfirmRoom() {
        return isOntimeConfirmRoom;
    }

    /**
     * 设置isOntimeConfirmRoom属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIsOntimeConfirmRoom(Integer value) {
        this.isOntimeConfirmRoom = value;
    }

    /**
     * 获取opDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public DateTime getOpDate() {
        return opDate;
    }

    /**
     * 设置opDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpDate(DateTime value) {
        this.opDate = value;
    }

    /**
     * 获取opIp属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpIp() {
        return opIp;
    }

    /**
     * 设置opIp属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpIp(String value) {
        this.opIp = value;
    }

    /**
     * 获取operator属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperator() {
        return operator;
    }

    /**
     * 设置operator属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperator(String value) {
        this.operator = value;
    }

    /**
     * 获取otherNotes属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherNotes() {
        return otherNotes;
    }

    /**
     * 设置otherNotes属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherNotes(String value) {
        this.otherNotes = value;
    }

    /**
     * 获取otherNotesEn属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherNotesEn() {
        return otherNotesEn;
    }

    /**
     * 设置otherNotesEn属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherNotesEn(String value) {
        this.otherNotesEn = value;
    }

    /**
     * 获取rId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRId() {
        return rId;
    }

    /**
     * 设置rId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRId(Integer value) {
        this.rId = value;
    }

    /**
     * 获取roomLines属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getRoomLines() {
        return roomLines;
    }

    /**
     * 设置roomLines属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setRoomLines(Short value) {
        this.roomLines = value;
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

    /**
     * 获取roomTypeName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomTypeName() {
        return roomTypeName;
    }

    /**
     * 设置roomTypeName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomTypeName(String value) {
        this.roomTypeName = value;
    }

    /**
     * 获取roomTypeNameEn属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomTypeNameEn() {
        return roomTypeNameEn;
    }

    /**
     * 设置roomTypeNameEn属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomTypeNameEn(String value) {
        this.roomTypeNameEn = value;
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
     * 获取iProductType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIProductType() {
        return iProductType;
    }

    /**
     * 设置iProductType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIProductType(Integer value) {
        this.iProductType = value;
    }

}
