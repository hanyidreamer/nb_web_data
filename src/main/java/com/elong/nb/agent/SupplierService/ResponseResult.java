
package com.elong.nb.agent.SupplierService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ResponseResult complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ResponseResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ApplicationServerIP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ErrorMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ResponseCode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="UsedMillionSecond" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseResult", namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Framework", propOrder = {
    "applicationServerIP",
    "errorMessage",
    "responseCode",
    "usedMillionSecond"
})
public class ResponseResult {

    @XmlElement(name = "ApplicationServerIP", nillable = true)
    protected String applicationServerIP;
    @XmlElement(name = "ErrorMessage", nillable = true)
    protected String errorMessage;
    @XmlElement(name = "ResponseCode")
    protected Integer responseCode;
    @XmlElement(name = "UsedMillionSecond")
    protected Double usedMillionSecond;

    /**
     * 获取applicationServerIP属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicationServerIP() {
        return applicationServerIP;
    }

    /**
     * 设置applicationServerIP属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicationServerIP(String value) {
        this.applicationServerIP = value;
    }

    /**
     * 获取errorMessage属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * 设置errorMessage属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorMessage(String value) {
        this.errorMessage = value;
    }

    /**
     * 获取responseCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getResponseCode() {
        return responseCode;
    }

    /**
     * 设置responseCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setResponseCode(Integer value) {
        this.responseCode = value;
    }

    /**
     * 获取usedMillionSecond属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getUsedMillionSecond() {
        return usedMillionSecond;
    }

    /**
     * 设置usedMillionSecond属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setUsedMillionSecond(Double value) {
        this.usedMillionSecond = value;
    }

}
