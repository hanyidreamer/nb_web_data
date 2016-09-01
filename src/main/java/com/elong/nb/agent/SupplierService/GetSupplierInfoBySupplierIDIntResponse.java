
package com.elong.nb.agent.SupplierService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>GetSupplierInfoBySupplierIDIntResponse complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="GetSupplierInfoBySupplierIDIntResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Framework}ServiceResponseBase">
 *       &lt;sequence>
 *         &lt;element name="SupplierBaseInfo" type="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model}SupplierBaseInfoInt" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetSupplierInfoBySupplierIDIntResponse", namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response", propOrder = {
    "supplierBaseInfo"
})
public class GetSupplierInfoBySupplierIDIntResponse
    extends ServiceResponseBase
{

    @XmlElement(name = "SupplierBaseInfo", nillable = true)
    protected SupplierBaseInfoInt supplierBaseInfo;

    /**
     * 获取supplierBaseInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SupplierBaseInfoInt }
     *     
     */
    public SupplierBaseInfoInt getSupplierBaseInfo() {
        return supplierBaseInfo;
    }

    /**
     * 设置supplierBaseInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SupplierBaseInfoInt }
     *     
     */
    public void setSupplierBaseInfo(SupplierBaseInfoInt value) {
        this.supplierBaseInfo = value;
    }

}
