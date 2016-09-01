
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
 *         &lt;element name="CheckInventoryAndPriceResult" type="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response}CheckInventoryAndPriceResponse" minOccurs="0"/&gt;
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
    "checkInventoryAndPriceResult"
})
@XmlRootElement(name = "CheckInventoryAndPriceResponse")
public class CheckInventoryAndPriceResponse2 {

    @XmlElement(name = "CheckInventoryAndPriceResult", nillable = true)
    protected CheckInventoryAndPriceResponse checkInventoryAndPriceResult;

    /**
     * 获取checkInventoryAndPriceResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CheckInventoryAndPriceResponse }
     *     
     */
    public CheckInventoryAndPriceResponse getCheckInventoryAndPriceResult() {
        return checkInventoryAndPriceResult;
    }

    /**
     * 设置checkInventoryAndPriceResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CheckInventoryAndPriceResponse }
     *     
     */
    public void setCheckInventoryAndPriceResult(CheckInventoryAndPriceResponse value) {
        this.checkInventoryAndPriceResult = value;
    }

}
