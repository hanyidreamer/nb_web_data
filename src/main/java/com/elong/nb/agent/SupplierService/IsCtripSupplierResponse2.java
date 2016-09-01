
package com.elong.nb.agent.SupplierService;

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
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IsCtripSupplierResult" type="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response.Supplier}IsCtripSupplierResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "isCtripSupplierResult"
})
@XmlRootElement(name = "IsCtripSupplierResponse")
public class IsCtripSupplierResponse2 {

    @XmlElement(name = "IsCtripSupplierResult", nillable = true)
    protected IsCtripSupplierResponse isCtripSupplierResult;

    /**
     * 获取isCtripSupplierResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link IsCtripSupplierResponse }
     *     
     */
    public IsCtripSupplierResponse getIsCtripSupplierResult() {
        return isCtripSupplierResult;
    }

    /**
     * 设置isCtripSupplierResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link IsCtripSupplierResponse }
     *     
     */
    public void setIsCtripSupplierResult(IsCtripSupplierResponse value) {
        this.isCtripSupplierResult = value;
    }

}
