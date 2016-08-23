
package com.elong.nb.agent.ProductForPartnerServiceContract;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>GetInventoryChangeDetailResponse complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="GetInventoryChangeDetailResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Framework}ServiceResponseBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ResourceInventoryStateList" type="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model.Inventory}ArrayOfResourceInventoryState" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetInventoryChangeDetailResponse", namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response.Inventory", propOrder = {
    "resourceInventoryStateList"
})
public class GetInventoryChangeDetailResponse
    extends ServiceResponseBase
{

    @XmlElement(name = "ResourceInventoryStateList", nillable = true)
    protected ArrayOfResourceInventoryState resourceInventoryStateList;

    /**
     * 获取resourceInventoryStateList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfResourceInventoryState }
     *     
     */
    public ArrayOfResourceInventoryState getResourceInventoryStateList() {
        return resourceInventoryStateList;
    }

    /**
     * 设置resourceInventoryStateList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfResourceInventoryState }
     *     
     */
    public void setResourceInventoryStateList(ArrayOfResourceInventoryState value) {
        this.resourceInventoryStateList = value;
    }

}
