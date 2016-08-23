
package com.elong.nb.agent.ProductForPartnerServiceContract;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>GetInvChangeAndInstantConfirmResponse complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="GetInvChangeAndInstantConfirmResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Framework}ServiceResponseBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ResourceInvAndInstantConfirmStateList" type="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model.Inventory}ArrayOfResourceInvAndInstantConfirmState" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetInvChangeAndInstantConfirmResponse", namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response.Inventory", propOrder = {
    "resourceInvAndInstantConfirmStateList"
})
public class GetInvChangeAndInstantConfirmResponse
    extends ServiceResponseBase
{

    @XmlElement(name = "ResourceInvAndInstantConfirmStateList", nillable = true)
    protected ArrayOfResourceInvAndInstantConfirmState resourceInvAndInstantConfirmStateList;

    /**
     * 获取resourceInvAndInstantConfirmStateList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfResourceInvAndInstantConfirmState }
     *     
     */
    public ArrayOfResourceInvAndInstantConfirmState getResourceInvAndInstantConfirmStateList() {
        return resourceInvAndInstantConfirmStateList;
    }

    /**
     * 设置resourceInvAndInstantConfirmStateList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfResourceInvAndInstantConfirmState }
     *     
     */
    public void setResourceInvAndInstantConfirmStateList(ArrayOfResourceInvAndInstantConfirmState value) {
        this.resourceInvAndInstantConfirmStateList = value;
    }

}
