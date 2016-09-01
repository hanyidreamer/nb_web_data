
package com.elong.nb.agent.NorthBoundForAPIService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>CheckHotelProductStatusResponse complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="CheckHotelProductStatusResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.Domain.Hotel}Response"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CheckResultCode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="CheckResultMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CheckHotelProductStatusResponse", namespace = "http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.Domain.Hotel.Message.ProductUse", propOrder = {
    "checkResultCode",
    "checkResultMessage"
})
public class CheckHotelProductStatusResponse
    extends Response
{

    @XmlElement(name = "CheckResultCode")
    protected Integer checkResultCode;
    @XmlElement(name = "CheckResultMessage", nillable = true)
    protected String checkResultMessage;

    /**
     * 获取checkResultCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCheckResultCode() {
        return checkResultCode;
    }

    /**
     * 设置checkResultCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCheckResultCode(Integer value) {
        this.checkResultCode = value;
    }

    /**
     * 获取checkResultMessage属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckResultMessage() {
        return checkResultMessage;
    }

    /**
     * 设置checkResultMessage属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckResultMessage(String value) {
        this.checkResultMessage = value;
    }

}
