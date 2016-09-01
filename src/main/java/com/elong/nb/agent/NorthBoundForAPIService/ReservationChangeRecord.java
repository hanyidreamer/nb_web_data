
package com.elong.nb.agent.NorthBoundForAPIService;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.joda.time.DateTime;


/**
 * <p>ReservationChangeRecord complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ReservationChangeRecord"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.DataAccess.Hotel}RecordBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ChangeID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="DataType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="InsertTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="ReserNo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ReserStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HotelId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RoomTypeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RatePlanId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ArriveData" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="LeaveData" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="NumRoom" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="SumPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PaymentTypeCode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="GuestName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Contacter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Fax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ExtendInfo" type="{http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.DataAccess.Hotel}ReservationExtendInfo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReservationChangeRecord", namespace = "http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.DataAccess.Hotel", propOrder = {
    "changeID",
    "dataType",
    "insertTime",
    "reserNo",
    "reserStatus",
    "hotelId",
    "roomTypeId",
    "ratePlanId",
    "arriveData",
    "leaveData",
    "numRoom",
    "sumPrice",
    "currencyCode",
    "paymentTypeCode",
    "guestName",
    "contacter",
    "phone",
    "email",
    "fax",
    "extendInfo"
})
public class ReservationChangeRecord
    extends RecordBase
{

    @XmlElement(name = "ChangeID")
    protected Long changeID;
    @XmlElement(name = "DataType")
    protected Integer dataType;
    @XmlElement(name = "InsertTime", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected DateTime insertTime;
    @XmlElement(name = "ReserNo")
    protected Integer reserNo;
    @XmlElement(name = "ReserStatus", nillable = true)
    protected String reserStatus;
    @XmlElement(name = "HotelId", nillable = true)
    protected String hotelId;
    @XmlElement(name = "RoomTypeId", nillable = true)
    protected String roomTypeId;
    @XmlElement(name = "RatePlanId")
    protected Integer ratePlanId;
    @XmlElement(name = "ArriveData", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected DateTime arriveData;
    @XmlElement(name = "LeaveData", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected DateTime leaveData;
    @XmlElement(name = "NumRoom")
    protected Integer numRoom;
    @XmlElement(name = "SumPrice")
    protected BigDecimal sumPrice;
    @XmlElement(name = "CurrencyCode", nillable = true)
    protected String currencyCode;
    @XmlElement(name = "PaymentTypeCode")
    protected Integer paymentTypeCode;
    @XmlElement(name = "GuestName", nillable = true)
    protected String guestName;
    @XmlElement(name = "Contacter", nillable = true)
    protected String contacter;
    @XmlElement(name = "Phone", nillable = true)
    protected String phone;
    @XmlElement(name = "Email", nillable = true)
    protected String email;
    @XmlElement(name = "Fax", nillable = true)
    protected String fax;
    @XmlElement(name = "ExtendInfo", nillable = true)
    protected ReservationExtendInfo extendInfo;

    /**
     * 获取changeID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getChangeID() {
        return changeID;
    }

    /**
     * 设置changeID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setChangeID(Long value) {
        this.changeID = value;
    }

    /**
     * 获取dataType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDataType() {
        return dataType;
    }

    /**
     * 设置dataType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDataType(Integer value) {
        this.dataType = value;
    }

    /**
     * 获取insertTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public DateTime getInsertTime() {
        return insertTime;
    }

    /**
     * 设置insertTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsertTime(DateTime value) {
        this.insertTime = value;
    }

    /**
     * 获取reserNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getReserNo() {
        return reserNo;
    }

    /**
     * 设置reserNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setReserNo(Integer value) {
        this.reserNo = value;
    }

    /**
     * 获取reserStatus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReserStatus() {
        return reserStatus;
    }

    /**
     * 设置reserStatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReserStatus(String value) {
        this.reserStatus = value;
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
     * 获取ratePlanId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRatePlanId() {
        return ratePlanId;
    }

    /**
     * 设置ratePlanId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRatePlanId(Integer value) {
        this.ratePlanId = value;
    }

    /**
     * 获取arriveData属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public DateTime getArriveData() {
        return arriveData;
    }

    /**
     * 设置arriveData属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArriveData(DateTime value) {
        this.arriveData = value;
    }

    /**
     * 获取leaveData属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public DateTime getLeaveData() {
        return leaveData;
    }

    /**
     * 设置leaveData属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLeaveData(DateTime value) {
        this.leaveData = value;
    }

    /**
     * 获取numRoom属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumRoom() {
        return numRoom;
    }

    /**
     * 设置numRoom属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumRoom(Integer value) {
        this.numRoom = value;
    }

    /**
     * 获取sumPrice属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSumPrice() {
        return sumPrice;
    }

    /**
     * 设置sumPrice属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSumPrice(BigDecimal value) {
        this.sumPrice = value;
    }

    /**
     * 获取currencyCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * 设置currencyCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyCode(String value) {
        this.currencyCode = value;
    }

    /**
     * 获取paymentTypeCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPaymentTypeCode() {
        return paymentTypeCode;
    }

    /**
     * 设置paymentTypeCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPaymentTypeCode(Integer value) {
        this.paymentTypeCode = value;
    }

    /**
     * 获取guestName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuestName() {
        return guestName;
    }

    /**
     * 设置guestName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuestName(String value) {
        this.guestName = value;
    }

    /**
     * 获取contacter属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContacter() {
        return contacter;
    }

    /**
     * 设置contacter属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContacter(String value) {
        this.contacter = value;
    }

    /**
     * 获取phone属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置phone属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhone(String value) {
        this.phone = value;
    }

    /**
     * 获取email属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置email属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * 获取fax属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFax() {
        return fax;
    }

    /**
     * 设置fax属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFax(String value) {
        this.fax = value;
    }

    /**
     * 获取extendInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ReservationExtendInfo }
     *     
     */
    public ReservationExtendInfo getExtendInfo() {
        return extendInfo;
    }

    /**
     * 设置extendInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ReservationExtendInfo }
     *     
     */
    public void setExtendInfo(ReservationExtendInfo value) {
        this.extendInfo = value;
    }

}
