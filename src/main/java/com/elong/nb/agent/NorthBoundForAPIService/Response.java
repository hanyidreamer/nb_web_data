
package com.elong.nb.agent.NorthBoundForAPIService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Response complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="Response"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EnumResponseCode" type="{http://schemas.datacontract.org/2004/07/Com.Elong.Utility.Hotel.Enum}EnumResponseCode" minOccurs="0"/&gt;
 *         &lt;element name="ResponseMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ErrorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Response", namespace = "http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.Domain.Hotel", propOrder = {
    "enumResponseCode",
    "responseMessage",
    "errorCode"
})
@XmlSeeAlso({
    CheckHotelProductStatusResponse.class,
    RackRateChangeDataResponse.class,
    GetMSRelationResponse.class,
    InventoryChangeDataResponse.class,
    PriceInfoChangeDataResponse.class,
    ReserveChangeDataResponse.class
})
public class Response {

    @XmlElement(name = "EnumResponseCode")
    @XmlSchemaType(name = "string")
    protected EnumResponseCode enumResponseCode;
    @XmlElement(name = "ResponseMessage", nillable = true)
    protected String responseMessage;
    @XmlElement(name = "ErrorCode", nillable = true)
    protected String errorCode;

    /**
     * 获取enumResponseCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link EnumResponseCode }
     *     
     */
    public EnumResponseCode getEnumResponseCode() {
        return enumResponseCode;
    }

    /**
     * 设置enumResponseCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link EnumResponseCode }
     *     
     */
    public void setEnumResponseCode(EnumResponseCode value) {
        this.enumResponseCode = value;
    }

    /**
     * 获取responseMessage属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponseMessage() {
        return responseMessage;
    }

    /**
     * 设置responseMessage属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponseMessage(String value) {
        this.responseMessage = value;
    }

    /**
     * 获取errorCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorCode() {
        return errorCode;
    }

    /**
     * 设置errorCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorCode(String value) {
        this.errorCode = value;
    }

}
