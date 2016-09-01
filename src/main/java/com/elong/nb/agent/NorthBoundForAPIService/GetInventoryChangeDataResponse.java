
package com.elong.nb.agent.NorthBoundForAPIService;

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
 *         &lt;element name="GetInventoryChangeDataResult" type="{http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.Domain.Hotel.Message}InventoryChangeDataResponse" minOccurs="0"/&gt;
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
    "getInventoryChangeDataResult"
})
@XmlRootElement(name = "GetInventoryChangeDataResponse")
public class GetInventoryChangeDataResponse {

    @XmlElement(name = "GetInventoryChangeDataResult", nillable = true)
    protected InventoryChangeDataResponse getInventoryChangeDataResult;

    /**
     * 获取getInventoryChangeDataResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link InventoryChangeDataResponse }
     *     
     */
    public InventoryChangeDataResponse getGetInventoryChangeDataResult() {
        return getInventoryChangeDataResult;
    }

    /**
     * 设置getInventoryChangeDataResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link InventoryChangeDataResponse }
     *     
     */
    public void setGetInventoryChangeDataResult(InventoryChangeDataResponse value) {
        this.getInventoryChangeDataResult = value;
    }

}
