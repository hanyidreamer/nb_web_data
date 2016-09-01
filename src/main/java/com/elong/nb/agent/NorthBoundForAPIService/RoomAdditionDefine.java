
package com.elong.nb.agent.NorthBoundForAPIService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>RoomAdditionDefine complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="RoomAdditionDefine"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AdditionId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="AdditionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AdditionNameEn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EAdditionType" type="{http://schemas.datacontract.org/2004/07/Com.Elong.Utility.Hotel.Enum}ERoomAdditionsType" minOccurs="0"/&gt;
 *         &lt;element name="HotelId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="InfoType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Notes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "RoomAdditionDefine", namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Contract", propOrder = {
    "additionId",
    "additionName",
    "additionNameEn",
    "eAdditionType",
    "hotelId",
    "infoType",
    "notes",
    "roomTypeId"
})
public class RoomAdditionDefine {

    @XmlElement(name = "AdditionId")
    protected Long additionId;
    @XmlElement(name = "AdditionName", nillable = true)
    protected String additionName;
    @XmlElement(name = "AdditionNameEn", nillable = true)
    protected String additionNameEn;
    @XmlElement(name = "EAdditionType")
    @XmlSchemaType(name = "string")
    protected ERoomAdditionsType eAdditionType;
    @XmlElement(name = "HotelId", nillable = true)
    protected String hotelId;
    @XmlElement(name = "InfoType")
    protected Integer infoType;
    @XmlElement(name = "Notes", nillable = true)
    protected String notes;
    @XmlElement(name = "RoomTypeId", nillable = true)
    protected String roomTypeId;

    /**
     * 获取additionId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAdditionId() {
        return additionId;
    }

    /**
     * 设置additionId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAdditionId(Long value) {
        this.additionId = value;
    }

    /**
     * 获取additionName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionName() {
        return additionName;
    }

    /**
     * 设置additionName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionName(String value) {
        this.additionName = value;
    }

    /**
     * 获取additionNameEn属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionNameEn() {
        return additionNameEn;
    }

    /**
     * 设置additionNameEn属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionNameEn(String value) {
        this.additionNameEn = value;
    }

    /**
     * 获取eAdditionType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ERoomAdditionsType }
     *     
     */
    public ERoomAdditionsType getEAdditionType() {
        return eAdditionType;
    }

    /**
     * 设置eAdditionType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ERoomAdditionsType }
     *     
     */
    public void setEAdditionType(ERoomAdditionsType value) {
        this.eAdditionType = value;
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
     * 获取infoType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getInfoType() {
        return infoType;
    }

    /**
     * 设置infoType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setInfoType(Integer value) {
        this.infoType = value;
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
