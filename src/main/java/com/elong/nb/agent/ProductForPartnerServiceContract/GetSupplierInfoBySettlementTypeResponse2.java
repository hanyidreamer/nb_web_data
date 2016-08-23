
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
 *         &lt;element name="GetSupplierInfoBySettlementTypeResult" type="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities}GetSupplierInfoBySettlementTypeResponse" minOccurs="0"/&gt;
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
    "getSupplierInfoBySettlementTypeResult"
})
@XmlRootElement(name = "GetSupplierInfoBySettlementTypeResponse")
public class GetSupplierInfoBySettlementTypeResponse2 {

    @XmlElement(name = "GetSupplierInfoBySettlementTypeResult", nillable = true)
    protected GetSupplierInfoBySettlementTypeResponse getSupplierInfoBySettlementTypeResult;

    /**
     * 获取getSupplierInfoBySettlementTypeResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link GetSupplierInfoBySettlementTypeResponse }
     *     
     */
    public GetSupplierInfoBySettlementTypeResponse getGetSupplierInfoBySettlementTypeResult() {
        return getSupplierInfoBySettlementTypeResult;
    }

    /**
     * 设置getSupplierInfoBySettlementTypeResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link GetSupplierInfoBySettlementTypeResponse }
     *     
     */
    public void setGetSupplierInfoBySettlementTypeResult(GetSupplierInfoBySettlementTypeResponse value) {
        this.getSupplierInfoBySettlementTypeResult = value;
    }

}
