
package com.elong.nb.agent.NorthBoundForAPIService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CheckHotelProductStatusResult" type="{http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.Domain.Hotel.Message.ProductUse}CheckHotelProductStatusResponse" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "checkHotelProductStatusResult"
})
@XmlRootElement(name = "CheckHotelProductStatusResponse")
public class CheckHotelProductStatusResponse2 {

    @XmlElement(name = "CheckHotelProductStatusResult", nillable = true)
    protected CheckHotelProductStatusResponse checkHotelProductStatusResult;

    /**
     * 获取checkHotelProductStatusResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CheckHotelProductStatusResponse }
     *     
     */
    public CheckHotelProductStatusResponse getCheckHotelProductStatusResult() {
        return checkHotelProductStatusResult;
    }

    /**
     * 设置checkHotelProductStatusResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CheckHotelProductStatusResponse }
     *     
     */
    public void setCheckHotelProductStatusResult(CheckHotelProductStatusResponse value) {
        this.checkHotelProductStatusResult = value;
    }

}
