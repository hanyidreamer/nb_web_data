
package com.elong.nb.agent.ProductForSearchServiceForRealTimeCheck;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.joda.time.DateTime;


/**
 * <p>ReservationVouchPolicy complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ReservationVouchPolicy"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BeginTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="ChangeType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="DateType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="EndTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="IsArriveTimeVouch" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="IsRoomCountVouch" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="LastCancelTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="NeedBeforeCheckInTime" type="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model}VouchCancelNeedBeforeCheckInTimeRule" minOccurs="0"/&gt;
 *         &lt;element name="NeedCheckin24hour" type="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model}VouchCancelNeedCheckin24hourRule" minOccurs="0"/&gt;
 *         &lt;element name="OverArrivalTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OverRoomAmount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="VouchMoneyAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="VouchMoneyAmountRMB" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="VouchMoneyCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VouchMoneyType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="VouchType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="VouchWay" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReservationVouchPolicy", namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model", propOrder = {
    "beginTime",
    "changeType",
    "dateType",
    "endTime",
    "isArriveTimeVouch",
    "isRoomCountVouch",
    "lastCancelTime",
    "needBeforeCheckInTime",
    "needCheckin24Hour",
    "overArrivalTime",
    "overRoomAmount",
    "vouchMoneyAmount",
    "vouchMoneyAmountRMB",
    "vouchMoneyCurrency",
    "vouchMoneyType",
    "vouchType",
    "vouchWay"
})
public class ReservationVouchPolicy {

    @XmlElement(name = "BeginTime", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected DateTime beginTime;
    @XmlElement(name = "ChangeType")
    protected Integer changeType;
    @XmlElement(name = "DateType")
    protected Integer dateType;
    @XmlElement(name = "EndTime", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected DateTime endTime;
    @XmlElement(name = "IsArriveTimeVouch")
    protected Integer isArriveTimeVouch;
    @XmlElement(name = "IsRoomCountVouch")
    protected Integer isRoomCountVouch;
    @XmlElement(name = "LastCancelTime", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected DateTime lastCancelTime;
    @XmlElement(name = "NeedBeforeCheckInTime", nillable = true)
    protected VouchCancelNeedBeforeCheckInTimeRule needBeforeCheckInTime;
    @XmlElement(name = "NeedCheckin24hour", nillable = true)
    protected VouchCancelNeedCheckin24HourRule needCheckin24Hour;
    @XmlElement(name = "OverArrivalTime", nillable = true)
    protected String overArrivalTime;
    @XmlElement(name = "OverRoomAmount")
    protected Integer overRoomAmount;
    @XmlElement(name = "VouchMoneyAmount")
    protected BigDecimal vouchMoneyAmount;
    @XmlElement(name = "VouchMoneyAmountRMB")
    protected BigDecimal vouchMoneyAmountRMB;
    @XmlElement(name = "VouchMoneyCurrency", nillable = true)
    protected String vouchMoneyCurrency;
    @XmlElement(name = "VouchMoneyType")
    protected Integer vouchMoneyType;
    @XmlElement(name = "VouchType")
    protected Integer vouchType;
    @XmlElement(name = "VouchWay")
    protected Integer vouchWay;

    /**
     * 获取beginTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public DateTime getBeginTime() {
        return beginTime;
    }

    /**
     * 设置beginTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeginTime(DateTime value) {
        this.beginTime = value;
    }

    /**
     * 获取changeType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getChangeType() {
        return changeType;
    }

    /**
     * 设置changeType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setChangeType(Integer value) {
        this.changeType = value;
    }

    /**
     * 获取dateType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDateType() {
        return dateType;
    }

    /**
     * 设置dateType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDateType(Integer value) {
        this.dateType = value;
    }

    /**
     * 获取endTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public DateTime getEndTime() {
        return endTime;
    }

    /**
     * 设置endTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndTime(DateTime value) {
        this.endTime = value;
    }

    /**
     * 获取isArriveTimeVouch属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIsArriveTimeVouch() {
        return isArriveTimeVouch;
    }

    /**
     * 设置isArriveTimeVouch属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIsArriveTimeVouch(Integer value) {
        this.isArriveTimeVouch = value;
    }

    /**
     * 获取isRoomCountVouch属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIsRoomCountVouch() {
        return isRoomCountVouch;
    }

    /**
     * 设置isRoomCountVouch属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIsRoomCountVouch(Integer value) {
        this.isRoomCountVouch = value;
    }

    /**
     * 获取lastCancelTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public DateTime getLastCancelTime() {
        return lastCancelTime;
    }

    /**
     * 设置lastCancelTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastCancelTime(DateTime value) {
        this.lastCancelTime = value;
    }

    /**
     * 获取needBeforeCheckInTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link VouchCancelNeedBeforeCheckInTimeRule }
     *     
     */
    public VouchCancelNeedBeforeCheckInTimeRule getNeedBeforeCheckInTime() {
        return needBeforeCheckInTime;
    }

    /**
     * 设置needBeforeCheckInTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link VouchCancelNeedBeforeCheckInTimeRule }
     *     
     */
    public void setNeedBeforeCheckInTime(VouchCancelNeedBeforeCheckInTimeRule value) {
        this.needBeforeCheckInTime = value;
    }

    /**
     * 获取needCheckin24Hour属性的值。
     * 
     * @return
     *     possible object is
     *     {@link VouchCancelNeedCheckin24HourRule }
     *     
     */
    public VouchCancelNeedCheckin24HourRule getNeedCheckin24Hour() {
        return needCheckin24Hour;
    }

    /**
     * 设置needCheckin24Hour属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link VouchCancelNeedCheckin24HourRule }
     *     
     */
    public void setNeedCheckin24Hour(VouchCancelNeedCheckin24HourRule value) {
        this.needCheckin24Hour = value;
    }

    /**
     * 获取overArrivalTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOverArrivalTime() {
        return overArrivalTime;
    }

    /**
     * 设置overArrivalTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOverArrivalTime(String value) {
        this.overArrivalTime = value;
    }

    /**
     * 获取overRoomAmount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOverRoomAmount() {
        return overRoomAmount;
    }

    /**
     * 设置overRoomAmount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOverRoomAmount(Integer value) {
        this.overRoomAmount = value;
    }

    /**
     * 获取vouchMoneyAmount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVouchMoneyAmount() {
        return vouchMoneyAmount;
    }

    /**
     * 设置vouchMoneyAmount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVouchMoneyAmount(BigDecimal value) {
        this.vouchMoneyAmount = value;
    }

    /**
     * 获取vouchMoneyAmountRMB属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVouchMoneyAmountRMB() {
        return vouchMoneyAmountRMB;
    }

    /**
     * 设置vouchMoneyAmountRMB属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVouchMoneyAmountRMB(BigDecimal value) {
        this.vouchMoneyAmountRMB = value;
    }

    /**
     * 获取vouchMoneyCurrency属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVouchMoneyCurrency() {
        return vouchMoneyCurrency;
    }

    /**
     * 设置vouchMoneyCurrency属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVouchMoneyCurrency(String value) {
        this.vouchMoneyCurrency = value;
    }

    /**
     * 获取vouchMoneyType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getVouchMoneyType() {
        return vouchMoneyType;
    }

    /**
     * 设置vouchMoneyType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setVouchMoneyType(Integer value) {
        this.vouchMoneyType = value;
    }

    /**
     * 获取vouchType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getVouchType() {
        return vouchType;
    }

    /**
     * 设置vouchType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setVouchType(Integer value) {
        this.vouchType = value;
    }

    /**
     * 获取vouchWay属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getVouchWay() {
        return vouchWay;
    }

    /**
     * 设置vouchWay属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setVouchWay(Integer value) {
        this.vouchWay = value;
    }

}
