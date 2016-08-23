
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
 *         &lt;element name="GetBuyedInventoryDetailofHotelResult" type="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response.Inventory}GetBuyedInventoryResponse" minOccurs="0"/&gt;
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
    "getBuyedInventoryDetailofHotelResult"
})
@XmlRootElement(name = "GetBuyedInventoryDetailofHotelResponse")
public class GetBuyedInventoryDetailofHotelResponse {

    @XmlElement(name = "GetBuyedInventoryDetailofHotelResult", nillable = true)
    protected GetBuyedInventoryResponse getBuyedInventoryDetailofHotelResult;

    /**
     * 获取getBuyedInventoryDetailofHotelResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link GetBuyedInventoryResponse }
     *     
     */
    public GetBuyedInventoryResponse getGetBuyedInventoryDetailofHotelResult() {
        return getBuyedInventoryDetailofHotelResult;
    }

    /**
     * 设置getBuyedInventoryDetailofHotelResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link GetBuyedInventoryResponse }
     *     
     */
    public void setGetBuyedInventoryDetailofHotelResult(GetBuyedInventoryResponse value) {
        this.getBuyedInventoryDetailofHotelResult = value;
    }

}
