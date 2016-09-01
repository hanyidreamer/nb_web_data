
package com.elong.nb.agent.NorthBoundForAPIService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ReservationExtendInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ReservationExtendInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ParameterInt1" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ParameterInt2" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ParameterInt3" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ParameterString1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ParameterString2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ParameterString3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReservationExtendInfo", namespace = "http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.DataAccess.Hotel", propOrder = {
    "parameterInt1",
    "parameterInt2",
    "parameterInt3",
    "parameterString1",
    "parameterString2",
    "parameterString3"
})
public class ReservationExtendInfo {

    @XmlElement(name = "ParameterInt1")
    protected Integer parameterInt1;
    @XmlElement(name = "ParameterInt2")
    protected Integer parameterInt2;
    @XmlElement(name = "ParameterInt3")
    protected Integer parameterInt3;
    @XmlElement(name = "ParameterString1", nillable = true)
    protected String parameterString1;
    @XmlElement(name = "ParameterString2", nillable = true)
    protected String parameterString2;
    @XmlElement(name = "ParameterString3", nillable = true)
    protected String parameterString3;

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

}
