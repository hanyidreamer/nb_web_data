
package com.elong.nb.agent.ProductForPartnerServiceContract;

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
 *         &lt;element name="GetHotelSwitchStatusResult" type="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response}GetHotelSwitchStatusResponse" minOccurs="0"/&gt;
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
    "getHotelSwitchStatusResult"
})
@XmlRootElement(name = "GetHotelSwitchStatusResponse")
public class GetHotelSwitchStatusResponse2 {

    @XmlElement(name = "GetHotelSwitchStatusResult", nillable = true)
    protected GetHotelSwitchStatusResponse getHotelSwitchStatusResult;

    /**
     * 获取getHotelSwitchStatusResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link GetHotelSwitchStatusResponse }
     *     
     */
    public GetHotelSwitchStatusResponse getGetHotelSwitchStatusResult() {
        return getHotelSwitchStatusResult;
    }

    /**
     * 设置getHotelSwitchStatusResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link GetHotelSwitchStatusResponse }
     *     
     */
    public void setGetHotelSwitchStatusResult(GetHotelSwitchStatusResponse value) {
        this.getHotelSwitchStatusResult = value;
    }

}
