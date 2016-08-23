
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
 *         &lt;element name="GetInventoryChangeDetailAndInstantConfirmResult" type="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response.Inventory}GetInvChangeAndInstantConfirmResponse" minOccurs="0"/&gt;
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
    "getInventoryChangeDetailAndInstantConfirmResult"
})
@XmlRootElement(name = "GetInventoryChangeDetailAndInstantConfirmResponse")
public class GetInventoryChangeDetailAndInstantConfirmResponse {

    @XmlElement(name = "GetInventoryChangeDetailAndInstantConfirmResult", nillable = true)
    protected GetInvChangeAndInstantConfirmResponse getInventoryChangeDetailAndInstantConfirmResult;

    /**
     * 获取getInventoryChangeDetailAndInstantConfirmResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link GetInvChangeAndInstantConfirmResponse }
     *     
     */
    public GetInvChangeAndInstantConfirmResponse getGetInventoryChangeDetailAndInstantConfirmResult() {
        return getInventoryChangeDetailAndInstantConfirmResult;
    }

    /**
     * 设置getInventoryChangeDetailAndInstantConfirmResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link GetInvChangeAndInstantConfirmResponse }
     *     
     */
    public void setGetInventoryChangeDetailAndInstantConfirmResult(GetInvChangeAndInstantConfirmResponse value) {
        this.getInventoryChangeDetailAndInstantConfirmResult = value;
    }

}
