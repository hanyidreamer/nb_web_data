
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
 *         &lt;element name="GetInventoryChangeListResult" type="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response.Inventory}GetInventoryChangeListResponse" minOccurs="0"/&gt;
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
    "getInventoryChangeListResult"
})
@XmlRootElement(name = "GetInventoryChangeListResponse")
public class GetInventoryChangeListResponse2 {

    @XmlElement(name = "GetInventoryChangeListResult", nillable = true)
    protected GetInventoryChangeListResponse getInventoryChangeListResult;

    /**
     * 获取getInventoryChangeListResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link GetInventoryChangeListResponse }
     *     
     */
    public GetInventoryChangeListResponse getGetInventoryChangeListResult() {
        return getInventoryChangeListResult;
    }

    /**
     * 设置getInventoryChangeListResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link GetInventoryChangeListResponse }
     *     
     */
    public void setGetInventoryChangeListResult(GetInventoryChangeListResponse value) {
        this.getInventoryChangeListResult = value;
    }

}
