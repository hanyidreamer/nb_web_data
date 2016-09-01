
package com.elong.nb.agent.ProductForSearchServiceForRealTimeCheck;

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
 *         &lt;element name="InventoryChangeForDCResult" type="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response}InventoryChangeForDCResponse" minOccurs="0"/&gt;
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
    "inventoryChangeForDCResult"
})
@XmlRootElement(name = "InventoryChangeForDCResponse")
public class InventoryChangeForDCResponse2 {

    @XmlElement(name = "InventoryChangeForDCResult", nillable = true)
    protected InventoryChangeForDCResponse inventoryChangeForDCResult;

    /**
     * 获取inventoryChangeForDCResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link InventoryChangeForDCResponse }
     *     
     */
    public InventoryChangeForDCResponse getInventoryChangeForDCResult() {
        return inventoryChangeForDCResult;
    }

    /**
     * 设置inventoryChangeForDCResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link InventoryChangeForDCResponse }
     *     
     */
    public void setInventoryChangeForDCResult(InventoryChangeForDCResponse value) {
        this.inventoryChangeForDCResult = value;
    }

}
