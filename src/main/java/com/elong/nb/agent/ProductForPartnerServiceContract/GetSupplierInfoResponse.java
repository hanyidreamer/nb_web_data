
package com.elong.nb.agent.ProductForPartnerServiceContract;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>GetSupplierInfoResponse complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="GetSupplierInfoResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Framework}ServiceResponseBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SupplierList" type="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model}ArrayOfSupplierInfo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetSupplierInfoResponse", namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response", propOrder = {
    "supplierList"
})
public class GetSupplierInfoResponse
    extends ServiceResponseBase
{

    @XmlElement(name = "SupplierList", nillable = true)
    protected ArrayOfSupplierInfo supplierList;

    /**
     * 获取supplierList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSupplierInfo }
     *     
     */
    public ArrayOfSupplierInfo getSupplierList() {
        return supplierList;
    }

    /**
     * 设置supplierList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSupplierInfo }
     *     
     */
    public void setSupplierList(ArrayOfSupplierInfo value) {
        this.supplierList = value;
    }

}
