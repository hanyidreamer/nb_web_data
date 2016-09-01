
package com.elong.nb.agent.HotelGiftService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.joda.time.DateTime;


/**
 * <p>HotelGiftType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="HotelGiftType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BitNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="OperateIP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OperateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Operator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TypeID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TypeNameCN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TypeNameEN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HotelGiftType", namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model", propOrder = {
    "bitNumber",
    "operateIP",
    "operateTime",
    "operator",
    "status",
    "typeID",
    "typeNameCN",
    "typeNameEN"
})
public class HotelGiftType {

    @XmlElement(name = "BitNumber")
    protected Integer bitNumber;
    @XmlElement(name = "OperateIP", nillable = true)
    protected String operateIP;
    @XmlElement(name = "OperateTime", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected DateTime operateTime;
    @XmlElement(name = "Operator", nillable = true)
    protected String operator;
    @XmlElement(name = "Status")
    protected Integer status;
    @XmlElement(name = "TypeID")
    protected Integer typeID;
    @XmlElement(name = "TypeNameCN", nillable = true)
    protected String typeNameCN;
    @XmlElement(name = "TypeNameEN", nillable = true)
    protected String typeNameEN;

    /**
     * 获取bitNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBitNumber() {
        return bitNumber;
    }

    /**
     * 设置bitNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBitNumber(Integer value) {
        this.bitNumber = value;
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
     * 获取typeID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTypeID() {
        return typeID;
    }

    /**
     * 设置typeID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTypeID(Integer value) {
        this.typeID = value;
    }

    /**
     * 获取typeNameCN属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeNameCN() {
        return typeNameCN;
    }

    /**
     * 设置typeNameCN属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeNameCN(String value) {
        this.typeNameCN = value;
    }

    /**
     * 获取typeNameEN属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeNameEN() {
        return typeNameEN;
    }

    /**
     * 设置typeNameEN属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeNameEN(String value) {
        this.typeNameEN = value;
    }

}
