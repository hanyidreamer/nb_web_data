
package com.elong.nb.agent.ProductForPartnerServiceContract;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>GetSupplierInfoBySettlementTypeRequest complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="GetSupplierInfoBySettlementTypeRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SupplierSettlementType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetSupplierInfoBySettlementTypeRequest", namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities", propOrder = {
    "supplierSettlementType"
})
public class GetSupplierInfoBySettlementTypeRequest {

    @XmlElement(name = "SupplierSettlementType")
    protected Integer supplierSettlementType;

    /**
     * 获取supplierSettlementType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSupplierSettlementType() {
        return supplierSettlementType;
    }

    /**
     * 设置supplierSettlementType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSupplierSettlementType(Integer value) {
        this.supplierSettlementType = value;
    }

}
