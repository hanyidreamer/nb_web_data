
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
 * <p>RackRateChangeRecord complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="RackRateChangeRecord"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.DataAccess.Hotel}RecordBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ChangeID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="DataType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="InsertTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="PriceID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="HotelID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RoomTypeID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BeginDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="EndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="RackRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="IsEffective" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="OperateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RackRateChangeRecord", namespace = "http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.DataAccess.Hotel", propOrder = {
    "changeID",
    "dataType",
    "insertTime",
    "priceID",
    "hotelID",
    "roomTypeID",
    "beginDate",
    "endDate",
    "rackRate",
    "isEffective",
    "operateTime",
    "currencyCode"
})
public class RackRateChangeRecord
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
    @XmlElement(name = "PriceID")
    protected Integer priceID;
    @XmlElement(name = "HotelID", nillable = true)
    protected String hotelID;
    @XmlElement(name = "RoomTypeID", nillable = true)
    protected String roomTypeID;
    @XmlElement(name = "BeginDate", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected DateTime beginDate;
    @XmlElement(name = "EndDate", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected DateTime endDate;
    @XmlElement(name = "RackRate")
    protected BigDecimal rackRate;
    @XmlElement(name = "IsEffective")
    protected Integer isEffective;
    @XmlElement(name = "OperateTime", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected DateTime operateTime;
    @XmlElement(name = "CurrencyCode", nillable = true)
    protected String currencyCode;

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
     * 获取priceID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPriceID() {
        return priceID;
    }

    /**
     * 设置priceID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPriceID(Integer value) {
        this.priceID = value;
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
     * 获取beginDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public DateTime getBeginDate() {
        return beginDate;
    }

    /**
     * 设置beginDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeginDate(DateTime value) {
        this.beginDate = value;
    }

    /**
     * 获取endDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public DateTime getEndDate() {
        return endDate;
    }

    /**
     * 设置endDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndDate(DateTime value) {
        this.endDate = value;
    }

    /**
     * 获取rackRate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRackRate() {
        return rackRate;
    }

    /**
     * 设置rackRate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRackRate(BigDecimal value) {
        this.rackRate = value;
    }

    /**
     * 获取isEffective属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIsEffective() {
        return isEffective;
    }

    /**
     * 设置isEffective属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIsEffective(Integer value) {
        this.isEffective = value;
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

}
