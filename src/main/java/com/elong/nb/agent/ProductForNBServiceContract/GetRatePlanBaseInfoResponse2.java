
package com.elong.nb.agent.ProductForNBServiceContract;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>GetRatePlanBaseInfoResponse complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="GetRatePlanBaseInfoResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Framework}ServiceResponseBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RatePlanBaseInfo" type="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model}CP_RatePlanBase" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetRatePlanBaseInfoResponse", namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response", propOrder = {
    "ratePlanBaseInfo"
})
public class GetRatePlanBaseInfoResponse2
    extends ServiceResponseBase
{

    @XmlElement(name = "RatePlanBaseInfo", nillable = true)
    protected CPRatePlanBase ratePlanBaseInfo;

    /**
     * 获取ratePlanBaseInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CPRatePlanBase }
     *     
     */
    public CPRatePlanBase getRatePlanBaseInfo() {
        return ratePlanBaseInfo;
    }

    /**
     * 设置ratePlanBaseInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CPRatePlanBase }
     *     
     */
    public void setRatePlanBaseInfo(CPRatePlanBase value) {
        this.ratePlanBaseInfo = value;
    }

}
