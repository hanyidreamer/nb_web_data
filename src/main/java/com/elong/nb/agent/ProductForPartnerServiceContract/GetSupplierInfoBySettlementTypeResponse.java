
package com.elong.nb.agent.ProductForPartnerServiceContract;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>GetSupplierInfoBySettlementTypeResponse complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="GetSupplierInfoBySettlementTypeResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Framework}ServiceResponseBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SupplierInfo4CommisionList" type="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities}ArrayOfSupplierInfo4Commision" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetSupplierInfoBySettlementTypeResponse", namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities", propOrder = {
    "supplierInfo4CommisionList"
})
public class GetSupplierInfoBySettlementTypeResponse
    extends ServiceResponseBase
{

    @XmlElement(name = "SupplierInfo4CommisionList", nillable = true)
    protected ArrayOfSupplierInfo4Commision supplierInfo4CommisionList;

    /**
     * 获取supplierInfo4CommisionList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSupplierInfo4Commision }
     *     
     */
    public ArrayOfSupplierInfo4Commision getSupplierInfo4CommisionList() {
        return supplierInfo4CommisionList;
    }

    /**
     * 设置supplierInfo4CommisionList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSupplierInfo4Commision }
     *     
     */
    public void setSupplierInfo4CommisionList(ArrayOfSupplierInfo4Commision value) {
        this.supplierInfo4CommisionList = value;
    }

}
