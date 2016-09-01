
package com.elong.nb.agent.HotelGiftService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.joda.time.DateTime;


/**
 * <p>HotelGiftModel complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="HotelGiftModel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GiftContentCn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GiftContentEn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GiftID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="GiftInfoPreviewString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GiftTypes" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="IsAllProductRelated" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="OperateIP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OperateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Operator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RelationDateList" type="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model}ArrayOfHotelGiftRelationDate" minOccurs="0"/>
 *         &lt;element name="RelationProductList" type="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model}ArrayOfHotelGiftRelationProduct" minOccurs="0"/>
 *         &lt;element name="SHotelID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="WayOfGiving" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="WayOfGivingOtherCn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WayOfGivingOtherEn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HotelGiftModel", namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model", propOrder = {
    "giftContentCn",
    "giftContentEn",
    "giftID",
    "giftInfoPreviewString",
    "giftTypes",
    "isAllProductRelated",
    "operateIP",
    "operateTime",
    "operator",
    "relationDateList",
    "relationProductList",
    "sHotelID",
    "status",
    "wayOfGiving",
    "wayOfGivingOtherCn",
    "wayOfGivingOtherEn"
})
public class HotelGiftModel {

    @XmlElement(name = "GiftContentCn", nillable = true)
    protected String giftContentCn;
    @XmlElement(name = "GiftContentEn", nillable = true)
    protected String giftContentEn;
    @XmlElement(name = "GiftID")
    protected Integer giftID;
    @XmlElement(name = "GiftInfoPreviewString", nillable = true)
    protected String giftInfoPreviewString;
    @XmlElement(name = "GiftTypes")
    protected Long giftTypes;
    @XmlElement(name = "IsAllProductRelated")
    protected Boolean isAllProductRelated;
    @XmlElement(name = "OperateIP", nillable = true)
    protected String operateIP;
    @XmlElement(name = "OperateTime", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected DateTime operateTime;
    @XmlElement(name = "Operator", nillable = true)
    protected String operator;
    @XmlElement(name = "RelationDateList", nillable = true)
    protected ArrayOfHotelGiftRelationDate relationDateList;
    @XmlElement(name = "RelationProductList", nillable = true)
    protected ArrayOfHotelGiftRelationProduct relationProductList;
    @XmlElement(name = "SHotelID", nillable = true)
    protected String sHotelID;
    @XmlElement(name = "Status")
    protected Integer status;
    @XmlElement(name = "WayOfGiving")
    protected Integer wayOfGiving;
    @XmlElement(name = "WayOfGivingOtherCn", nillable = true)
    protected String wayOfGivingOtherCn;
    @XmlElement(name = "WayOfGivingOtherEn", nillable = true)
    protected String wayOfGivingOtherEn;

    /**
     * 获取giftContentCn属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGiftContentCn() {
        return giftContentCn;
    }

    /**
     * 设置giftContentCn属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGiftContentCn(String value) {
        this.giftContentCn = value;
    }

    /**
     * 获取giftContentEn属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGiftContentEn() {
        return giftContentEn;
    }

    /**
     * 设置giftContentEn属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGiftContentEn(String value) {
        this.giftContentEn = value;
    }

    /**
     * 获取giftID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGiftID() {
        return giftID;
    }

    /**
     * 设置giftID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGiftID(Integer value) {
        this.giftID = value;
    }

    /**
     * 获取giftInfoPreviewString属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGiftInfoPreviewString() {
        return giftInfoPreviewString;
    }

    /**
     * 设置giftInfoPreviewString属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGiftInfoPreviewString(String value) {
        this.giftInfoPreviewString = value;
    }

    /**
     * 获取giftTypes属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getGiftTypes() {
        return giftTypes;
    }

    /**
     * 设置giftTypes属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setGiftTypes(Long value) {
        this.giftTypes = value;
    }

    /**
     * 获取isAllProductRelated属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsAllProductRelated() {
        return isAllProductRelated;
    }

    /**
     * 设置isAllProductRelated属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsAllProductRelated(Boolean value) {
        this.isAllProductRelated = value;
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
     * 获取relationDateList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfHotelGiftRelationDate }
     *     
     */
    public ArrayOfHotelGiftRelationDate getRelationDateList() {
        return relationDateList;
    }

    /**
     * 设置relationDateList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfHotelGiftRelationDate }
     *     
     */
    public void setRelationDateList(ArrayOfHotelGiftRelationDate value) {
        this.relationDateList = value;
    }

    /**
     * 获取relationProductList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfHotelGiftRelationProduct }
     *     
     */
    public ArrayOfHotelGiftRelationProduct getRelationProductList() {
        return relationProductList;
    }

    /**
     * 设置relationProductList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfHotelGiftRelationProduct }
     *     
     */
    public void setRelationProductList(ArrayOfHotelGiftRelationProduct value) {
        this.relationProductList = value;
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

    /**
     * 获取status属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置status属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStatus(Integer value) {
        this.status = value;
    }

    /**
     * 获取wayOfGiving属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getWayOfGiving() {
        return wayOfGiving;
    }

    /**
     * 设置wayOfGiving属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setWayOfGiving(Integer value) {
        this.wayOfGiving = value;
    }

    /**
     * 获取wayOfGivingOtherCn属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWayOfGivingOtherCn() {
        return wayOfGivingOtherCn;
    }

    /**
     * 设置wayOfGivingOtherCn属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWayOfGivingOtherCn(String value) {
        this.wayOfGivingOtherCn = value;
    }

    /**
     * 获取wayOfGivingOtherEn属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWayOfGivingOtherEn() {
        return wayOfGivingOtherEn;
    }

    /**
     * 设置wayOfGivingOtherEn属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWayOfGivingOtherEn(String value) {
        this.wayOfGivingOtherEn = value;
    }

}
