
package com.elong.nb.agent.ProductForPartnerServiceContract;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>GetInventoryChangeListResponse complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="GetInventoryChangeListResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Framework}ServiceResponseBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="InventoryChangeList" type="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model}ArrayOfInventoryChangeModel" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetInventoryChangeListResponse", namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response.Inventory", propOrder = {
    "inventoryChangeList"
})
public class GetInventoryChangeListResponse
    extends ServiceResponseBase
{

    @XmlElement(name = "InventoryChangeList", nillable = true)
    protected ArrayOfInventoryChangeModel inventoryChangeList;

    /**
     * 获取inventoryChangeList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInventoryChangeModel }
     *     
     */
    public ArrayOfInventoryChangeModel getInventoryChangeList() {
        return inventoryChangeList;
    }

    /**
     * 设置inventoryChangeList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInventoryChangeModel }
     *     
     */
    public void setInventoryChangeList(ArrayOfInventoryChangeModel value) {
        this.inventoryChangeList = value;
    }

}
