
package com.elong.nb.agent.ProductForNBServiceContract;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>GetRatePlanBaseListResponse complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="GetRatePlanBaseListResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Framework}ServiceResponseBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RatePlanBaseList" type="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model}ArrayOfCP_RatePlanBase" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetRatePlanBaseListResponse", namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response", propOrder = {
    "ratePlanBaseList"
})
public class GetRatePlanBaseListResponse2
    extends ServiceResponseBase
{

    @XmlElement(name = "RatePlanBaseList", nillable = true)
    protected ArrayOfCPRatePlanBase ratePlanBaseList;

    /**
     * 获取ratePlanBaseList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCPRatePlanBase }
     *     
     */
    public ArrayOfCPRatePlanBase getRatePlanBaseList() {
        return ratePlanBaseList;
    }

    /**
     * 设置ratePlanBaseList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCPRatePlanBase }
     *     
     */
    public void setRatePlanBaseList(ArrayOfCPRatePlanBase value) {
        this.ratePlanBaseList = value;
    }

}
