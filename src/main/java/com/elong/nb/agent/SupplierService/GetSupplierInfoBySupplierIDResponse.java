
package com.elong.nb.agent.SupplierService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>GetSupplierInfoBySupplierIDResponse complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="GetSupplierInfoBySupplierIDResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Framework}ServiceResponseBase">
 *       &lt;sequence>
 *         &lt;element name="SupplierBaseInfo" type="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model}SupplierBaseInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetSupplierInfoBySupplierIDResponse", namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response", propOrder = {
    "supplierBaseInfo"
})
public class GetSupplierInfoBySupplierIDResponse
    extends ServiceResponseBase
{

    @XmlElement(name = "SupplierBaseInfo", nillable = true)
    protected SupplierBaseInfo supplierBaseInfo;

    /**
     * 获取supplierBaseInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SupplierBaseInfo }
     *     
     */
    public SupplierBaseInfo getSupplierBaseInfo() {
        return supplierBaseInfo;
    }

    /**
     * 设置supplierBaseInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SupplierBaseInfo }
     *     
     */
    public void setSupplierBaseInfo(SupplierBaseInfo value) {
        this.supplierBaseInfo = value;
    }

}
