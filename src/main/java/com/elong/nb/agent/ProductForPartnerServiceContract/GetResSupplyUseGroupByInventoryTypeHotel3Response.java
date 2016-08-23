
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
 *         &lt;element name="GetResSupplyUseGroupByInventoryTypeHotel3Result" type="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response.Inventory}GetResSupplyUseGroupHotel3Response" minOccurs="0"/&gt;
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
    "getResSupplyUseGroupByInventoryTypeHotel3Result"
})
@XmlRootElement(name = "GetResSupplyUseGroupByInventoryTypeHotel3Response")
public class GetResSupplyUseGroupByInventoryTypeHotel3Response {

    @XmlElement(name = "GetResSupplyUseGroupByInventoryTypeHotel3Result", nillable = true)
    protected GetResSupplyUseGroupHotel3Response getResSupplyUseGroupByInventoryTypeHotel3Result;

    /**
     * 获取getResSupplyUseGroupByInventoryTypeHotel3Result属性的值。
     * 
     * @return
     *     possible object is
     *     {@link GetResSupplyUseGroupHotel3Response }
     *     
     */
    public GetResSupplyUseGroupHotel3Response getGetResSupplyUseGroupByInventoryTypeHotel3Result() {
        return getResSupplyUseGroupByInventoryTypeHotel3Result;
    }

    /**
     * 设置getResSupplyUseGroupByInventoryTypeHotel3Result属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link GetResSupplyUseGroupHotel3Response }
     *     
     */
    public void setGetResSupplyUseGroupByInventoryTypeHotel3Result(GetResSupplyUseGroupHotel3Response value) {
        this.getResSupplyUseGroupByInventoryTypeHotel3Result = value;
    }

}
