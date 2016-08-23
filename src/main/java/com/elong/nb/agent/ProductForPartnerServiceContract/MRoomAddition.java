
package com.elong.nb.agent.ProductForPartnerServiceContract;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>MRoomAddition complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="MRoomAddition"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AdditionId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="AdditionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AdditionNameEn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AdditionType" type="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Enums}RoomAdditionType" minOccurs="0"/&gt;
 *         &lt;element name="IsSeleted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Notes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RoomTypeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RoomUniqueId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MRoomAddition", namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model", propOrder = {
    "additionId",
    "additionName",
    "additionNameEn",
    "additionType",
    "isSeleted",
    "notes",
    "roomTypeId",
    "roomUniqueId"
})
public class MRoomAddition {

    @XmlElement(name = "AdditionId")
    protected Long additionId;
    @XmlElement(name = "AdditionName", nillable = true)
    protected String additionName;
    @XmlElement(name = "AdditionNameEn", nillable = true)
    protected String additionNameEn;
    @XmlElement(name = "AdditionType")
    @XmlSchemaType(name = "string")
    protected RoomAdditionType additionType;
    @XmlElement(name = "IsSeleted")
    protected Boolean isSeleted;
    @XmlElement(name = "Notes", nillable = true)
    protected String notes;
    @XmlElement(name = "RoomTypeId", nillable = true)
    protected String roomTypeId;
    @XmlElement(name = "RoomUniqueId", nillable = true)
    protected String roomUniqueId;

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
     * 获取additionType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RoomAdditionType }
     *     
     */
    public RoomAdditionType getAdditionType() {
        return additionType;
    }

    /**
     * 设置additionType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RoomAdditionType }
     *     
     */
    public void setAdditionType(RoomAdditionType value) {
        this.additionType = value;
    }

    /**
     * 获取isSeleted属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsSeleted() {
        return isSeleted;
    }

    /**
     * 设置isSeleted属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsSeleted(Boolean value) {
        this.isSeleted = value;
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

}
