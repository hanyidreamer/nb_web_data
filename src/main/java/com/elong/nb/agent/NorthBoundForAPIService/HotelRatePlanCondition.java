
package com.elong.nb.agent.NorthBoundForAPIService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.joda.time.DateTime;


/**
 * <p>HotelRatePlanCondition complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="HotelRatePlanCondition"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BookingChannel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BookingDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="BuyedHotel" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="CardNo" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="CheckInDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="CheckOutDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="CustomerLevel" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="DataConnectionStr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GuestType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HotelId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IsNoLimitProductSearch" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsSearchStaticContext" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="IsSimpleVersionForWebsite" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsUseRoomTypeID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Language" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OrderId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="PriceModel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PriceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ProductType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PromotionChannelCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ProxyID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RoomTypeID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SellChannel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SettlementType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HotelRatePlanCondition", namespace = "http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.DataAccess.Hotel.HotelProductUse", propOrder = {
    "bookingChannel",
    "bookingDate",
    "buyedHotel",
    "cardNo",
    "checkInDate",
    "checkOutDate",
    "customerLevel",
    "dataConnectionStr",
    "guestType",
    "hotelId",
    "isNoLimitProductSearch",
    "isSearchStaticContext",
    "isSimpleVersionForWebsite",
    "isUseRoomTypeID",
    "language",
    "orderId",
    "priceModel",
    "priceType",
    "productType",
    "promotionChannelCode",
    "proxyID",
    "roomTypeID",
    "sellChannel",
    "settlementType"
})
public class HotelRatePlanCondition {

    @XmlElement(name = "BookingChannel", nillable = true)
    protected String bookingChannel;
    @XmlElement(name = "BookingDate", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected DateTime bookingDate;
    @XmlElement(name = "BuyedHotel")
    protected Integer buyedHotel;
    @XmlElement(name = "CardNo")
    protected Long cardNo;
    @XmlElement(name = "CheckInDate", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected DateTime checkInDate;
    @XmlElement(name = "CheckOutDate", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected DateTime checkOutDate;
    @XmlElement(name = "CustomerLevel")
    protected Integer customerLevel;
    @XmlElement(name = "DataConnectionStr", nillable = true)
    protected String dataConnectionStr;
    @XmlElement(name = "GuestType", nillable = true)
    protected String guestType;
    @XmlElement(name = "HotelId", nillable = true)
    protected String hotelId;
    @XmlElement(name = "IsNoLimitProductSearch")
    protected Boolean isNoLimitProductSearch;
    @XmlElement(name = "IsSearchStaticContext")
    protected Integer isSearchStaticContext;
    @XmlElement(name = "IsSimpleVersionForWebsite")
    protected Boolean isSimpleVersionForWebsite;
    @XmlElement(name = "IsUseRoomTypeID")
    protected Integer isUseRoomTypeID;
    @XmlElement(name = "Language", nillable = true)
    protected String language;
    @XmlElement(name = "OrderId")
    protected Integer orderId;
    @XmlElement(name = "PriceModel", nillable = true)
    protected String priceModel;
    @XmlElement(name = "PriceType", nillable = true)
    protected String priceType;
    @XmlElement(name = "ProductType", nillable = true)
    protected String productType;
    @XmlElement(name = "PromotionChannelCode", nillable = true)
    protected String promotionChannelCode;
    @XmlElement(name = "ProxyID", nillable = true)
    protected String proxyID;
    @XmlElement(name = "RoomTypeID", nillable = true)
    protected String roomTypeID;
    @XmlElement(name = "SellChannel", nillable = true)
    protected String sellChannel;
    @XmlElement(name = "SettlementType", nillable = true)
    protected String settlementType;

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
     * 获取bookingDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public DateTime getBookingDate() {
        return bookingDate;
    }

    /**
     * 设置bookingDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookingDate(DateTime value) {
        this.bookingDate = value;
    }

    /**
     * 获取buyedHotel属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBuyedHotel() {
        return buyedHotel;
    }

    /**
     * 设置buyedHotel属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBuyedHotel(Integer value) {
        this.buyedHotel = value;
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
     * 获取checkInDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public DateTime getCheckInDate() {
        return checkInDate;
    }

    /**
     * 设置checkInDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckInDate(DateTime value) {
        this.checkInDate = value;
    }

    /**
     * 获取checkOutDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public DateTime getCheckOutDate() {
        return checkOutDate;
    }

    /**
     * 设置checkOutDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckOutDate(DateTime value) {
        this.checkOutDate = value;
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
     * 获取dataConnectionStr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataConnectionStr() {
        return dataConnectionStr;
    }

    /**
     * 设置dataConnectionStr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataConnectionStr(String value) {
        this.dataConnectionStr = value;
    }

    /**
     * 获取guestType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuestType() {
        return guestType;
    }

    /**
     * 设置guestType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuestType(String value) {
        this.guestType = value;
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
     * 获取isNoLimitProductSearch属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsNoLimitProductSearch() {
        return isNoLimitProductSearch;
    }

    /**
     * 设置isNoLimitProductSearch属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsNoLimitProductSearch(Boolean value) {
        this.isNoLimitProductSearch = value;
    }

    /**
     * 获取isSearchStaticContext属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIsSearchStaticContext() {
        return isSearchStaticContext;
    }

    /**
     * 设置isSearchStaticContext属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIsSearchStaticContext(Integer value) {
        this.isSearchStaticContext = value;
    }

    /**
     * 获取isSimpleVersionForWebsite属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsSimpleVersionForWebsite() {
        return isSimpleVersionForWebsite;
    }

    /**
     * 设置isSimpleVersionForWebsite属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsSimpleVersionForWebsite(Boolean value) {
        this.isSimpleVersionForWebsite = value;
    }

    /**
     * 获取isUseRoomTypeID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIsUseRoomTypeID() {
        return isUseRoomTypeID;
    }

    /**
     * 设置isUseRoomTypeID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIsUseRoomTypeID(Integer value) {
        this.isUseRoomTypeID = value;
    }

    /**
     * 获取language属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * 设置language属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
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
     * 获取priceModel属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriceModel() {
        return priceModel;
    }

    /**
     * 设置priceModel属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriceModel(String value) {
        this.priceModel = value;
    }

    /**
     * 获取priceType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriceType() {
        return priceType;
    }

    /**
     * 设置priceType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriceType(String value) {
        this.priceType = value;
    }

    /**
     * 获取productType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductType() {
        return productType;
    }

    /**
     * 设置productType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductType(String value) {
        this.productType = value;
    }

    /**
     * 获取promotionChannelCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromotionChannelCode() {
        return promotionChannelCode;
    }

    /**
     * 设置promotionChannelCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromotionChannelCode(String value) {
        this.promotionChannelCode = value;
    }

    /**
     * 获取proxyID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProxyID() {
        return proxyID;
    }

    /**
     * 设置proxyID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProxyID(String value) {
        this.proxyID = value;
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

    /**
     * 获取settlementType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSettlementType() {
        return settlementType;
    }

    /**
     * 设置settlementType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSettlementType(String value) {
        this.settlementType = value;
    }

}
