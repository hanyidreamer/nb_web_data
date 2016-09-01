
package com.elong.nb.agent.NorthBoundForAPIService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.joda.time.DateTime;


/**
 * <p>HotelActivity complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="HotelActivity"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ACEndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="ACStartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="ACTivityEN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ActivetyId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Activity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ActivityUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HotelID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MemberOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OrderID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ShowOnWeb" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HotelActivity", namespace = "http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.Domain.Hotel", propOrder = {
    "acEndDate",
    "acStartDate",
    "acTivityEN",
    "activetyId",
    "activity",
    "activityUrl",
    "hotelID",
    "memberOnly",
    "orderID",
    "showOnWeb"
})
public class HotelActivity {

    @XmlElement(name = "ACEndDate", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected DateTime acEndDate;
    @XmlElement(name = "ACStartDate", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected DateTime acStartDate;
    @XmlElement(name = "ACTivityEN", nillable = true)
    protected String acTivityEN;
    @XmlElement(name = "ActivetyId")
    protected Integer activetyId;
    @XmlElement(name = "Activity", nillable = true)
    protected String activity;
    @XmlElement(name = "ActivityUrl", nillable = true)
    protected String activityUrl;
    @XmlElement(name = "HotelID", nillable = true)
    protected String hotelID;
    @XmlElement(name = "MemberOnly")
    protected Boolean memberOnly;
    @XmlElement(name = "OrderID")
    protected Integer orderID;
    @XmlElement(name = "ShowOnWeb")
    protected Boolean showOnWeb;

    /**
     * 获取acEndDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public DateTime getACEndDate() {
        return acEndDate;
    }

    /**
     * 设置acEndDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACEndDate(DateTime value) {
        this.acEndDate = value;
    }

    /**
     * 获取acStartDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public DateTime getACStartDate() {
        return acStartDate;
    }

    /**
     * 设置acStartDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACStartDate(DateTime value) {
        this.acStartDate = value;
    }

    /**
     * 获取acTivityEN属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACTivityEN() {
        return acTivityEN;
    }

    /**
     * 设置acTivityEN属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACTivityEN(String value) {
        this.acTivityEN = value;
    }

    /**
     * 获取activetyId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getActivetyId() {
        return activetyId;
    }

    /**
     * 设置activetyId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setActivetyId(Integer value) {
        this.activetyId = value;
    }

    /**
     * 获取activity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActivity() {
        return activity;
    }

    /**
     * 设置activity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivity(String value) {
        this.activity = value;
    }

    /**
     * 获取activityUrl属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActivityUrl() {
        return activityUrl;
    }

    /**
     * 设置activityUrl属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivityUrl(String value) {
        this.activityUrl = value;
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
     * 获取memberOnly属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMemberOnly() {
        return memberOnly;
    }

    /**
     * 设置memberOnly属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMemberOnly(Boolean value) {
        this.memberOnly = value;
    }

    /**
     * 获取orderID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOrderID() {
        return orderID;
    }

    /**
     * 设置orderID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOrderID(Integer value) {
        this.orderID = value;
    }

    /**
     * 获取showOnWeb属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowOnWeb() {
        return showOnWeb;
    }

    /**
     * 设置showOnWeb属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowOnWeb(Boolean value) {
        this.showOnWeb = value;
    }

}
