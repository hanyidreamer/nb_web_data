
package com.elong.nb.agent.ProductForSearchServiceForRealTimeCheck;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.joda.time.DateTime;


/**
 * <p>CheckReservationRequest complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="CheckReservationRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Request}ProductRequestBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ArriveDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="ArriveEarlyTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="ArriveLaterTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="BookingTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GuestCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="LeaveDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="PriceList" type="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model}ArrayOfPriceDaySimple" minOccurs="0"/&gt;
 *         &lt;element name="ProductCheckType" type="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Enums}ProductCheckType" minOccurs="0"/&gt;
 *         &lt;element name="RatePlanID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RequestFrom" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RoomCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RoomTypeID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SHotelID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CheckReservationRequest", namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Request", propOrder = {
    "arriveDate",
    "arriveEarlyTime",
    "arriveLaterTime",
    "bookingTime",
    "currencyCode",
    "guestCount",
    "leaveDate",
    "priceList",
    "productCheckType",
    "ratePlanID",
    "requestFrom",
    "roomCount",
    "roomTypeID",
    "sHotelID"
})
public class CheckReservationRequest
    extends ProductRequestBase
{

    @XmlElement(name = "ArriveDate", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected DateTime arriveDate;
    @XmlElement(name = "ArriveEarlyTime", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected DateTime arriveEarlyTime;
    @XmlElement(name = "ArriveLaterTime", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected DateTime arriveLaterTime;
    @XmlElement(name = "BookingTime", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected DateTime bookingTime;
    @XmlElement(name = "CurrencyCode", nillable = true)
    protected String currencyCode;
    @XmlElement(name = "GuestCount")
    protected Integer guestCount;
    @XmlElement(name = "LeaveDate", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected DateTime leaveDate;
    @XmlElement(name = "PriceList", nillable = true)
    protected ArrayOfPriceDaySimple priceList;
    @XmlList
    @XmlElement(name = "ProductCheckType")
    @XmlSchemaType(name = "anySimpleType")
    protected List<String> productCheckType;
    @XmlElement(name = "RatePlanID")
    protected Integer ratePlanID;
    @XmlElement(name = "RequestFrom")
    protected Integer requestFrom;
    @XmlElement(name = "RoomCount")
    protected Integer roomCount;
    @XmlElement(name = "RoomTypeID", nillable = true)
    protected String roomTypeID;
    @XmlElement(name = "SHotelID", nillable = true)
    protected String sHotelID;

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
     * 获取arriveEarlyTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public DateTime getArriveEarlyTime() {
        return arriveEarlyTime;
    }

    /**
     * 设置arriveEarlyTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArriveEarlyTime(DateTime value) {
        this.arriveEarlyTime = value;
    }

    /**
     * 获取arriveLaterTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public DateTime getArriveLaterTime() {
        return arriveLaterTime;
    }

    /**
     * 设置arriveLaterTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArriveLaterTime(DateTime value) {
        this.arriveLaterTime = value;
    }

    /**
     * 获取bookingTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public DateTime getBookingTime() {
        return bookingTime;
    }

    /**
     * 设置bookingTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookingTime(DateTime value) {
        this.bookingTime = value;
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
     * 获取guestCount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGuestCount() {
        return guestCount;
    }

    /**
     * 设置guestCount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGuestCount(Integer value) {
        this.guestCount = value;
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
     * 获取priceList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPriceDaySimple }
     *     
     */
    public ArrayOfPriceDaySimple getPriceList() {
        return priceList;
    }

    /**
     * 设置priceList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPriceDaySimple }
     *     
     */
    public void setPriceList(ArrayOfPriceDaySimple value) {
        this.priceList = value;
    }

    /**
     * Gets the value of the productCheckType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productCheckType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductCheckType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getProductCheckType() {
        if (productCheckType == null) {
            productCheckType = new ArrayList<String>();
        }
        return this.productCheckType;
    }

    /**
     * 获取ratePlanID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRatePlanID() {
        return ratePlanID;
    }

    /**
     * 设置ratePlanID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRatePlanID(Integer value) {
        this.ratePlanID = value;
    }

    /**
     * 获取requestFrom属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRequestFrom() {
        return requestFrom;
    }

    /**
     * 设置requestFrom属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRequestFrom(Integer value) {
        this.requestFrom = value;
    }

    /**
     * 获取roomCount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRoomCount() {
        return roomCount;
    }

    /**
     * 设置roomCount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRoomCount(Integer value) {
        this.roomCount = value;
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

    /**
     * 获取sHotelID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSHotelID() {
        return sHotelID;
    }

    /**
     * 设置sHotelID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSHotelID(String value) {
        this.sHotelID = value;
    }

}
