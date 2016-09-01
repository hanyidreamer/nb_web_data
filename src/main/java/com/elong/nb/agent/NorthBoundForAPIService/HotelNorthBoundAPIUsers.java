
package com.elong.nb.agent.NorthBoundForAPIService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.joda.time.DateTime;


/**
 * <p>HotelNorthBoundAPIUsers complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="HotelNorthBoundAPIUsers"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="HotelNorthBoundAPIUserId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="UserName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ProxyId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DefaultCardNo" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="OrderFrom" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="GuaranteeFlag" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="CancelDeadLineBeffer" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ContactFlag" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="InstantConfirmationFlag" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ChannelConfirmationFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ContactPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ContactEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ContactFax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LastLoginTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="LoginToken" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/&gt;
 *         &lt;element name="LoginTokenExpiredTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="Operator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OperatorIp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OperatorTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="IsDisabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AllowsInputCardNo" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Note" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ContactMobile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PrivilegesValue" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="AllowedIP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HotelNorthBoundAPIUsers", namespace = "http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.DataAccess.Hotel", propOrder = {
    "hotelNorthBoundAPIUserId",
    "userName",
    "password",
    "proxyId",
    "defaultCardNo",
    "orderFrom",
    "guaranteeFlag",
    "cancelDeadLineBeffer",
    "contactFlag",
    "instantConfirmationFlag",
    "channelConfirmationFlag",
    "contactPhone",
    "contactEmail",
    "contactFax",
    "lastLoginTime",
    "loginToken",
    "loginTokenExpiredTime",
    "operator",
    "operatorIp",
    "operatorTime",
    "isDisabled",
    "allowsInputCardNo",
    "note",
    "contactMobile",
    "privilegesValue",
    "allowedIP"
})
public class HotelNorthBoundAPIUsers {

    @XmlElement(name = "HotelNorthBoundAPIUserId")
    protected Integer hotelNorthBoundAPIUserId;
    @XmlElement(name = "UserName", nillable = true)
    protected String userName;
    @XmlElement(name = "Password", nillable = true)
    protected String password;
    @XmlElement(name = "ProxyId", nillable = true)
    protected String proxyId;
    @XmlElement(name = "DefaultCardNo", nillable = true)
    protected Long defaultCardNo;
    @XmlElement(name = "OrderFrom")
    protected Integer orderFrom;
    @XmlElement(name = "GuaranteeFlag")
    protected Integer guaranteeFlag;
    @XmlElement(name = "CancelDeadLineBeffer")
    protected Integer cancelDeadLineBeffer;
    @XmlElement(name = "ContactFlag")
    protected Integer contactFlag;
    @XmlElement(name = "InstantConfirmationFlag")
    protected Integer instantConfirmationFlag;
    @XmlElement(name = "ChannelConfirmationFlag", nillable = true)
    protected String channelConfirmationFlag;
    @XmlElement(name = "ContactPhone", nillable = true)
    protected String contactPhone;
    @XmlElement(name = "ContactEmail", nillable = true)
    protected String contactEmail;
    @XmlElement(name = "ContactFax", nillable = true)
    protected String contactFax;
    @XmlElement(name = "LastLoginTime", type = String.class, nillable = true)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected DateTime lastLoginTime;
    @XmlElement(name = "LoginToken", nillable = true)
    protected String loginToken;
    @XmlElement(name = "LoginTokenExpiredTime", type = String.class, nillable = true)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected DateTime loginTokenExpiredTime;
    @XmlElement(name = "Operator", nillable = true)
    protected String operator;
    @XmlElement(name = "OperatorIp", nillable = true)
    protected String operatorIp;
    @XmlElement(name = "OperatorTime", type = String.class, nillable = true)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected DateTime operatorTime;
    @XmlElement(name = "IsDisabled")
    protected Boolean isDisabled;
    @XmlElement(name = "AllowsInputCardNo")
    protected Boolean allowsInputCardNo;
    @XmlElement(name = "Note", nillable = true)
    protected String note;
    @XmlElement(name = "ContactMobile", nillable = true)
    protected String contactMobile;
    @XmlElement(name = "PrivilegesValue", nillable = true)
    protected Integer privilegesValue;
    @XmlElement(name = "AllowedIP", nillable = true)
    protected String allowedIP;

    /**
     * 获取hotelNorthBoundAPIUserId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHotelNorthBoundAPIUserId() {
        return hotelNorthBoundAPIUserId;
    }

    /**
     * 设置hotelNorthBoundAPIUserId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHotelNorthBoundAPIUserId(Integer value) {
        this.hotelNorthBoundAPIUserId = value;
    }

    /**
     * 获取userName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置userName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserName(String value) {
        this.userName = value;
    }

    /**
     * 获取password属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置password属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * 获取proxyId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProxyId() {
        return proxyId;
    }

    /**
     * 设置proxyId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProxyId(String value) {
        this.proxyId = value;
    }

    /**
     * 获取defaultCardNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDefaultCardNo() {
        return defaultCardNo;
    }

    /**
     * 设置defaultCardNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDefaultCardNo(Long value) {
        this.defaultCardNo = value;
    }

    /**
     * 获取orderFrom属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOrderFrom() {
        return orderFrom;
    }

    /**
     * 设置orderFrom属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOrderFrom(Integer value) {
        this.orderFrom = value;
    }

    /**
     * 获取guaranteeFlag属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGuaranteeFlag() {
        return guaranteeFlag;
    }

    /**
     * 设置guaranteeFlag属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGuaranteeFlag(Integer value) {
        this.guaranteeFlag = value;
    }

    /**
     * 获取cancelDeadLineBeffer属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCancelDeadLineBeffer() {
        return cancelDeadLineBeffer;
    }

    /**
     * 设置cancelDeadLineBeffer属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCancelDeadLineBeffer(Integer value) {
        this.cancelDeadLineBeffer = value;
    }

    /**
     * 获取contactFlag属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getContactFlag() {
        return contactFlag;
    }

    /**
     * 设置contactFlag属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setContactFlag(Integer value) {
        this.contactFlag = value;
    }

    /**
     * 获取instantConfirmationFlag属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getInstantConfirmationFlag() {
        return instantConfirmationFlag;
    }

    /**
     * 设置instantConfirmationFlag属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setInstantConfirmationFlag(Integer value) {
        this.instantConfirmationFlag = value;
    }

    /**
     * 获取channelConfirmationFlag属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChannelConfirmationFlag() {
        return channelConfirmationFlag;
    }

    /**
     * 设置channelConfirmationFlag属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChannelConfirmationFlag(String value) {
        this.channelConfirmationFlag = value;
    }

    /**
     * 获取contactPhone属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactPhone() {
        return contactPhone;
    }

    /**
     * 设置contactPhone属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactPhone(String value) {
        this.contactPhone = value;
    }

    /**
     * 获取contactEmail属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactEmail() {
        return contactEmail;
    }

    /**
     * 设置contactEmail属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactEmail(String value) {
        this.contactEmail = value;
    }

    /**
     * 获取contactFax属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactFax() {
        return contactFax;
    }

    /**
     * 设置contactFax属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactFax(String value) {
        this.contactFax = value;
    }

    /**
     * 获取lastLoginTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public DateTime getLastLoginTime() {
        return lastLoginTime;
    }

    /**
     * 设置lastLoginTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastLoginTime(DateTime value) {
        this.lastLoginTime = value;
    }

    /**
     * 获取loginToken属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoginToken() {
        return loginToken;
    }

    /**
     * 设置loginToken属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoginToken(String value) {
        this.loginToken = value;
    }

    /**
     * 获取loginTokenExpiredTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public DateTime getLoginTokenExpiredTime() {
        return loginTokenExpiredTime;
    }

    /**
     * 设置loginTokenExpiredTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoginTokenExpiredTime(DateTime value) {
        this.loginTokenExpiredTime = value;
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
     * 获取operatorIp属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperatorIp() {
        return operatorIp;
    }

    /**
     * 设置operatorIp属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperatorIp(String value) {
        this.operatorIp = value;
    }

    /**
     * 获取operatorTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public DateTime getOperatorTime() {
        return operatorTime;
    }

    /**
     * 设置operatorTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperatorTime(DateTime value) {
        this.operatorTime = value;
    }

    /**
     * 获取isDisabled属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsDisabled() {
        return isDisabled;
    }

    /**
     * 设置isDisabled属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsDisabled(Boolean value) {
        this.isDisabled = value;
    }

    /**
     * 获取allowsInputCardNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowsInputCardNo() {
        return allowsInputCardNo;
    }

    /**
     * 设置allowsInputCardNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowsInputCardNo(Boolean value) {
        this.allowsInputCardNo = value;
    }

    /**
     * 获取note属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNote() {
        return note;
    }

    /**
     * 设置note属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNote(String value) {
        this.note = value;
    }

    /**
     * 获取contactMobile属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactMobile() {
        return contactMobile;
    }

    /**
     * 设置contactMobile属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactMobile(String value) {
        this.contactMobile = value;
    }

    /**
     * 获取privilegesValue属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPrivilegesValue() {
        return privilegesValue;
    }

    /**
     * 设置privilegesValue属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPrivilegesValue(Integer value) {
        this.privilegesValue = value;
    }

    /**
     * 获取allowedIP属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllowedIP() {
        return allowedIP;
    }

    /**
     * 设置allowedIP属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllowedIP(String value) {
        this.allowedIP = value;
    }

}
