
package com.elong.nb.agent.ProductForPartnerServiceContract;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.joda.time.DateTime;


/**
 * <p>BatchEditInvAmountAndStatusForEBookingRequest complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="BatchEditInvAmountAndStatusForEBookingRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Request}ProductRequestBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AvailableDateBegin" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="AvailableDateEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="HotelId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OperateBedType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Operations" type="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model.Inventory}ArrayOfInventoryAmountAndStatusOperation" minOccurs="0"/&gt;
 *         &lt;element name="Remark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RoomTypeIdList" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BatchEditInvAmountAndStatusForEBookingRequest", namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Request", propOrder = {
    "availableDateBegin",
    "availableDateEnd",
    "hotelId",
    "operateBedType",
    "operations",
    "remark",
    "roomTypeIdList"
})
public class BatchEditInvAmountAndStatusForEBookingRequest
    extends ProductRequestBase
{

    @XmlElement(name = "AvailableDateBegin", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected DateTime availableDateBegin;
    @XmlElement(name = "AvailableDateEnd", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected DateTime availableDateEnd;
    @XmlElement(name = "HotelId", nillable = true)
    protected String hotelId;
    @XmlElement(name = "OperateBedType")
    protected Integer operateBedType;
    @XmlElement(name = "Operations", nillable = true)
    protected ArrayOfInventoryAmountAndStatusOperation operations;
    @XmlElement(name = "Remark", nillable = true)
    protected String remark;
    @XmlElement(name = "RoomTypeIdList", nillable = true)
    protected ArrayOfstring roomTypeIdList;

    /**
     * 获取availableDateBegin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public DateTime getAvailableDateBegin() {
        return availableDateBegin;
    }

    /**
     * 设置availableDateBegin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAvailableDateBegin(DateTime value) {
        this.availableDateBegin = value;
    }

    /**
     * 获取availableDateEnd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public DateTime getAvailableDateEnd() {
        return availableDateEnd;
    }

    /**
     * 设置availableDateEnd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAvailableDateEnd(DateTime value) {
        this.availableDateEnd = value;
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
     * 获取operateBedType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOperateBedType() {
        return operateBedType;
    }

    /**
     * 设置operateBedType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOperateBedType(Integer value) {
        this.operateBedType = value;
    }

    /**
     * 获取operations属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInventoryAmountAndStatusOperation }
     *     
     */
    public ArrayOfInventoryAmountAndStatusOperation getOperations() {
        return operations;
    }

    /**
     * 设置operations属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInventoryAmountAndStatusOperation }
     *     
     */
    public void setOperations(ArrayOfInventoryAmountAndStatusOperation value) {
        this.operations = value;
    }

    /**
     * 获取remark属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置remark属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemark(String value) {
        this.remark = value;
    }

    /**
     * 获取roomTypeIdList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfstring }
     *     
     */
    public ArrayOfstring getRoomTypeIdList() {
        return roomTypeIdList;
    }

    /**
     * 设置roomTypeIdList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfstring }
     *     
     */
    public void setRoomTypeIdList(ArrayOfstring value) {
        this.roomTypeIdList = value;
    }

}
