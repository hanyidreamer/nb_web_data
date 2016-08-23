
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
 *         &lt;element name="IsUseDcInvResult" type="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response.Product4Partners}IsUseDcInvResponse" minOccurs="0"/&gt;
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
    "isUseDcInvResult"
})
@XmlRootElement(name = "IsUseDcInvResponse")
public class IsUseDcInvResponse2 {

    @XmlElement(name = "IsUseDcInvResult", nillable = true)
    protected IsUseDcInvResponse isUseDcInvResult;

    /**
     * 获取isUseDcInvResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link IsUseDcInvResponse }
     *     
     */
    public IsUseDcInvResponse getIsUseDcInvResult() {
        return isUseDcInvResult;
    }

    /**
     * 设置isUseDcInvResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link IsUseDcInvResponse }
     *     
     */
    public void setIsUseDcInvResult(IsUseDcInvResponse value) {
        this.isUseDcInvResult = value;
    }

}
