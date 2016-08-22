
package com.elong.nb.agent.ProductForNBServiceContract;

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
 *         &lt;element name="GetRatePlanBaseInfoResult" type="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response}GetRatePlanBaseInfoResponse" minOccurs="0"/&gt;
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
    "getRatePlanBaseInfoResult"
})
@XmlRootElement(name = "GetRatePlanBaseInfoResponse")
public class GetRatePlanBaseInfoResponse {

    @XmlElement(name = "GetRatePlanBaseInfoResult", nillable = true)
    protected GetRatePlanBaseInfoResponse2 getRatePlanBaseInfoResult;

    /**
     * 获取getRatePlanBaseInfoResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link GetRatePlanBaseInfoResponse2 }
     *     
     */
    public GetRatePlanBaseInfoResponse2 getGetRatePlanBaseInfoResult() {
        return getRatePlanBaseInfoResult;
    }

    /**
     * 设置getRatePlanBaseInfoResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link GetRatePlanBaseInfoResponse2 }
     *     
     */
    public void setGetRatePlanBaseInfoResult(GetRatePlanBaseInfoResponse2 value) {
        this.getRatePlanBaseInfoResult = value;
    }

}
