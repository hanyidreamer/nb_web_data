
package com.elong.nb.agent.NorthBoundForAPIService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>HotelRatePlanSearchFor114 complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="HotelRatePlanSearchFor114"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BookingChannel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CardNo" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="CustomerLevel" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="HotelId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OrderId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="SellChannel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HotelRatePlanSearchFor114", namespace = "http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.DataAccess.Hotel.HotelProductUse", propOrder = {
    "bookingChannel",
    "cardNo",
    "customerLevel",
    "hotelId",
    "orderId",
    "sellChannel"
})
public class HotelRatePlanSearchFor114 {

    @XmlElement(name = "BookingChannel", nillable = true)
    protected String bookingChannel;
    @XmlElement(name = "CardNo")
    protected Long cardNo;
    @XmlElement(name = "CustomerLevel")
    protected Integer customerLevel;
    @XmlElement(name = "HotelId", nillable = true)
    protected String hotelId;
    @XmlElement(name = "OrderId")
    protected Integer orderId;
    @XmlElement(name = "SellChannel", nillable = true)
    protected String sellChannel;

    /**
     * 获取bookingChannel属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookingChannel() {
        return bookingChannel;
    }

    /**
     * 设置bookingChannel属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookingChannel(String value) {
        this.bookingChannel = value;
    }

    /**
     * 获取cardNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCardNo() {
        return cardNo;
    }

    /**
     * 设置cardNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCardNo(Long value) {
        this.cardNo = value;
    }

    /**
     * 获取customerLevel属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCustomerLevel() {
        return customerLevel;
    }

    /**
     * 设置customerLevel属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCustomerLevel(Integer value) {
        this.customerLevel = value;
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
     * 获取orderId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOrderId() {
        return orderId;
    }

    /**
     * 设置orderId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOrderId(Integer value) {
        this.orderId = value;
    }

    /**
     * 获取sellChannel属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSellChannel() {
        return sellChannel;
    }

    /**
     * 设置sellChannel属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSellChannel(String value) {
        this.sellChannel = value;
    }

}
