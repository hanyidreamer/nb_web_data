
package com.elong.nb.agent.NorthBoundForAPIService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.joda.time.DateTime;


/**
 * <p>HotelNorthBoundOrders complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="HotelNorthBoundOrders"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GUID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HotelOrderId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="OperateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="OrderFrom" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ParameterString1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ParameterString2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ParameterString3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ParameterInt1" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ParameterInt2" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ParameterInt3" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ServicePlace" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SourcePlace" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ServiceCenter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HotelNorthBoundOrders", namespace = "http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.DataAccess.Hotel", propOrder = {
    "guid",
    "hotelOrderId",
    "operateTime",
    "orderFrom",
    "parameterString1",
    "parameterString2",
    "parameterString3",
    "parameterInt1",
    "parameterInt2",
    "parameterInt3",
    "servicePlace",
    "sourcePlace",
    "serviceCenter"
})
public class HotelNorthBoundOrders {

    @XmlElement(name = "GUID", nillable = true)
    protected String guid;
    @XmlElement(name = "HotelOrderId")
    protected Integer hotelOrderId;
    @XmlElement(name = "OperateTime", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected DateTime operateTime;
    @XmlElement(name = "OrderFrom", nillable = true)
    protected Integer orderFrom;
    @XmlElement(name = "ParameterString1", nillable = true)
    protected String parameterString1;
    @XmlElement(name = "ParameterString2", nillable = true)
    protected String parameterString2;
    @XmlElement(name = "ParameterString3", nillable = true)
    protected String parameterString3;
    @XmlElement(name = "ParameterInt1", nillable = true)
    protected Integer parameterInt1;
    @XmlElement(name = "ParameterInt2", nillable = true)
    protected Integer parameterInt2;
    @XmlElement(name = "ParameterInt3", nillable = true)
    protected Integer parameterInt3;
    @XmlElement(name = "ServicePlace", nillable = true)
    protected String servicePlace;
    @XmlElement(name = "SourcePlace", nillable = true)
    protected String sourcePlace;
    @XmlElement(name = "ServiceCenter", nillable = true)
    protected String serviceCenter;

    /**
     * 获取guid属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGUID() {
        return guid;
    }

    /**
     * 设置guid属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGUID(String value) {
        this.guid = value;
    }

    /**
     * 获取hotelOrderId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHotelOrderId() {
        return hotelOrderId;
    }

    /**
     * 设置hotelOrderId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHotelOrderId(Integer value) {
        this.hotelOrderId = value;
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
     * 获取parameterString1属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParameterString1() {
        return parameterString1;
    }

    /**
     * 设置parameterString1属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParameterString1(String value) {
        this.parameterString1 = value;
    }

    /**
     * 获取parameterString2属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParameterString2() {
        return parameterString2;
    }

    /**
     * 设置parameterString2属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParameterString2(String value) {
        this.parameterString2 = value;
    }

    /**
     * 获取parameterString3属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParameterString3() {
        return parameterString3;
    }

    /**
     * 设置parameterString3属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParameterString3(String value) {
        this.parameterString3 = value;
    }

    /**
     * 获取parameterInt1属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getParameterInt1() {
        return parameterInt1;
    }

    /**
     * 设置parameterInt1属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setParameterInt1(Integer value) {
        this.parameterInt1 = value;
    }

    /**
     * 获取parameterInt2属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getParameterInt2() {
        return parameterInt2;
    }

    /**
     * 设置parameterInt2属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setParameterInt2(Integer value) {
        this.parameterInt2 = value;
    }

    /**
     * 获取parameterInt3属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getParameterInt3() {
        return parameterInt3;
    }

    /**
     * 设置parameterInt3属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setParameterInt3(Integer value) {
        this.parameterInt3 = value;
    }

    /**
     * 获取servicePlace属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServicePlace() {
        return servicePlace;
    }

    /**
     * 设置servicePlace属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServicePlace(String value) {
        this.servicePlace = value;
    }

    /**
     * 获取sourcePlace属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourcePlace() {
        return sourcePlace;
    }

    /**
     * 设置sourcePlace属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourcePlace(String value) {
        this.sourcePlace = value;
    }

    /**
     * 获取serviceCenter属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceCenter() {
        return serviceCenter;
    }

    /**
     * 设置serviceCenter属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceCenter(String value) {
        this.serviceCenter = value;
    }

}
