
package com.elong.nb.agent.ProductForSearchServiceForRealTimeCheck;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ServiceResponseBase complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ServiceResponseBase"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Result" type="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Framework}ResponseResult" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceResponseBase", namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Framework", propOrder = {
    "result"
})
@XmlSeeAlso({
    CheckInventoryAndPriceResponse.class,
    CheckReservationResponse.class,
    GetHotelOnlineSearchTypeResponse.class,
    GetHotelOrderCreationVerifyModeResponse.class,
    InventoryChangeForDCResponse.class,
    CheckInstantConfirmResponse.class,
    CheckInstantConfirm4NBResponse.class
})
public class ServiceResponseBase {

    @XmlElement(name = "Result", nillable = true)
    protected ResponseResult result;

    /**
     * 获取result属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ResponseResult }
     *     
     */
    public ResponseResult getResult() {
        return result;
    }

    /**
     * 设置result属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseResult }
     *     
     */
    public void setResult(ResponseResult value) {
        this.result = value;
    }

}
