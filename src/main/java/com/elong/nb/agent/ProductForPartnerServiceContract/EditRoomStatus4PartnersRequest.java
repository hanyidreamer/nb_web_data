
package com.elong.nb.agent.ProductForPartnerServiceContract;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.joda.time.DateTime;


/**
 * <p>EditRoomStatus4PartnersRequest complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="EditRoomStatus4PartnersRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ArriveDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="CloseRoomType" type="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Enums.Inventory}EnumCloseRoomType" minOccurs="0"/&gt;
 *         &lt;element name="HotelID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="InventoryType" type="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Enums.Inventory}InventoryType" minOccurs="0"/&gt;
 *         &lt;element name="LeaveDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="OperateComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OperateIP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OperateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="OperationType" type="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Enums.Inventory}InventoryStatus" minOccurs="0"/&gt;
 *         &lt;element name="Operator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OverTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="roomTypeList" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EditRoomStatus4PartnersRequest", namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Request.Product4Partners", propOrder = {
    "arriveDate",
    "closeRoomType",
    "hotelID",
    "inventoryType",
    "leaveDate",
    "operateComments",
    "operateIP",
    "operateTime",
    "operationType",
    "operator",
    "overTime",
    "roomTypeList"
})
public class EditRoomStatus4PartnersRequest {

    @XmlElement(name = "ArriveDate", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected DateTime arriveDate;
    @XmlElement(name = "CloseRoomType")
    @XmlSchemaType(name = "string")
    protected EnumCloseRoomType closeRoomType;
    @XmlElement(name = "HotelID", nillable = true)
    protected String hotelID;
    @XmlElement(name = "InventoryType")
    @XmlSchemaType(name = "string")
    protected InventoryType inventoryType;
    @XmlElement(name = "LeaveDate", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected DateTime leaveDate;
    @XmlElement(name = "OperateComments", nillable = true)
    protected String operateComments;
    @XmlElement(name = "OperateIP", nillable = true)
    protected String operateIP;
    @XmlElement(name = "OperateTime", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected DateTime operateTime;
    @XmlElement(name = "OperationType")
    @XmlSchemaType(name = "string")
    protected InventoryStatus operationType;
    @XmlElement(name = "Operator", nillable = true)
    protected String operator;
    @XmlElement(name = "OverTime", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected DateTime overTime;
    @XmlElement(nillable = true)
    protected ArrayOfstring roomTypeList;

    /**
     * 获取arriveDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public DateTime getArriveDate() {
        return arriveDate;
    }

    /**
     * 设置arriveDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArriveDate(DateTime value) {
        this.arriveDate = value;
    }

    /**
     * 获取closeRoomType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link EnumCloseRoomType }
     *     
     */
    public EnumCloseRoomType getCloseRoomType() {
        return closeRoomType;
    }

    /**
     * 设置closeRoomType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link EnumCloseRoomType }
     *     
     */
    public void setCloseRoomType(EnumCloseRoomType value) {
        this.closeRoomType = value;
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
     * 获取inventoryType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link InventoryType }
     *     
     */
    public InventoryType getInventoryType() {
        return inventoryType;
    }

    /**
     * 设置inventoryType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link InventoryType }
     *     
     */
    public void setInventoryType(InventoryType value) {
        this.inventoryType = value;
    }

    /**
     * 获取leaveDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public DateTime getLeaveDate() {
        return leaveDate;
    }

    /**
     * 设置leaveDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLeaveDate(DateTime value) {
        this.leaveDate = value;
    }

    /**
     * 获取operateComments属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperateComments() {
        return operateComments;
    }

    /**
     * 设置operateComments属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperateComments(String value) {
        this.operateComments = value;
    }

    /**
     * 获取operateIP属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperateIP() {
        return operateIP;
    }

    /**
     * 设置operateIP属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperateIP(String value) {
        this.operateIP = value;
    }

    /**
     * 获取operateTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public DateTime getOperateTime() {
        return operateTime;
    }

    /**
     * 设置operateTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperateTime(DateTime value) {
        this.operateTime = value;
    }

    /**
     * 获取operationType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link InventoryStatus }
     *     
     */
    public InventoryStatus getOperationType() {
        return operationType;
    }

    /**
     * 设置operationType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link InventoryStatus }
     *     
     */
    public void setOperationType(InventoryStatus value) {
        this.operationType = value;
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
     * 获取overTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public DateTime getOverTime() {
        return overTime;
    }

    /**
     * 设置overTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOverTime(DateTime value) {
        this.overTime = value;
    }

    /**
     * 获取roomTypeList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfstring }
     *     
     */
    public ArrayOfstring getRoomTypeList() {
        return roomTypeList;
    }

    /**
     * 设置roomTypeList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfstring }
     *     
     */
    public void setRoomTypeList(ArrayOfstring value) {
        this.roomTypeList = value;
    }

}
