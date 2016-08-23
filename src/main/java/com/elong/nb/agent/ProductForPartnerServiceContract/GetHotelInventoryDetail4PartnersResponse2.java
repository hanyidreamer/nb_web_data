
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
 *         &lt;element name="GetHotelInventoryDetail4PartnersResult" type="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response.Product4Partners}GetHotelInventoryDetail4PartnersResponse" minOccurs="0"/&gt;
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
    "getHotelInventoryDetail4PartnersResult"
})
@XmlRootElement(name = "GetHotelInventoryDetail4PartnersResponse")
public class GetHotelInventoryDetail4PartnersResponse2 {

    @XmlElement(name = "GetHotelInventoryDetail4PartnersResult", nillable = true)
    protected GetHotelInventoryDetail4PartnersResponse getHotelInventoryDetail4PartnersResult;

    /**
     * 获取getHotelInventoryDetail4PartnersResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link GetHotelInventoryDetail4PartnersResponse }
     *     
     */
    public GetHotelInventoryDetail4PartnersResponse getGetHotelInventoryDetail4PartnersResult() {
        return getHotelInventoryDetail4PartnersResult;
    }

    /**
     * 设置getHotelInventoryDetail4PartnersResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link GetHotelInventoryDetail4PartnersResponse }
     *     
     */
    public void setGetHotelInventoryDetail4PartnersResult(GetHotelInventoryDetail4PartnersResponse value) {
        this.getHotelInventoryDetail4PartnersResult = value;
    }

}
