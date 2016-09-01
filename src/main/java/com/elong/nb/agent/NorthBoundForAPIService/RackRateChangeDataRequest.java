
package com.elong.nb.agent.NorthBoundForAPIService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.joda.time.DateTime;


/**
 * <p>RackRateChangeDataRequest complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="RackRateChangeDataRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.Domain.Hotel}Request"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CityIDs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HotelIDs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LastChgId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="LastChgTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="MaxRecordCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RackRateChangeDataRequest", namespace = "http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.Domain.Hotel.Message", propOrder = {
    "cityIDs",
    "hotelIDs",
    "lastChgId",
    "lastChgTime",
    "maxRecordCount"
})
public class RackRateChangeDataRequest
    extends Request
{

    @XmlElement(name = "CityIDs", nillable = true)
    protected String cityIDs;
    @XmlElement(name = "HotelIDs", nillable = true)
    protected String hotelIDs;
    @XmlElement(name = "LastChgId")
    protected Long lastChgId;
    @XmlElement(name = "LastChgTime", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected DateTime lastChgTime;
    @XmlElement(name = "MaxRecordCount")
    protected Integer maxRecordCount;

    /**
     * 获取cityIDs属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCityIDs() {
        return cityIDs;
    }

    /**
     * 设置cityIDs属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCityIDs(String value) {
        this.cityIDs = value;
    }

    /**
     * 获取hotelIDs属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHotelIDs() {
        return hotelIDs;
    }

    /**
     * 设置hotelIDs属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHotelIDs(String value) {
        this.hotelIDs = value;
    }

    /**
     * 获取lastChgId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLastChgId() {
        return lastChgId;
    }

    /**
     * 设置lastChgId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLastChgId(Long value) {
        this.lastChgId = value;
    }

    /**
     * 获取lastChgTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public DateTime getLastChgTime() {
        return lastChgTime;
    }

    /**
     * 设置lastChgTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastChgTime(DateTime value) {
        this.lastChgTime = value;
    }

    /**
     * 获取maxRecordCount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxRecordCount() {
        return maxRecordCount;
    }

    /**
     * 设置maxRecordCount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxRecordCount(Integer value) {
        this.maxRecordCount = value;
    }

}
