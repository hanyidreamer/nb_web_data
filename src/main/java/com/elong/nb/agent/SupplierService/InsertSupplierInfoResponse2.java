
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
 *         &lt;element name="InsertSupplierInfoResult" type="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response}InsertSupplierInfoResponse" minOccurs="0"/>
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
    "insertSupplierInfoResult"
})
@XmlRootElement(name = "InsertSupplierInfoResponse")
public class InsertSupplierInfoResponse2 {

    @XmlElement(name = "InsertSupplierInfoResult", nillable = true)
    protected InsertSupplierInfoResponse insertSupplierInfoResult;

    /**
     * 获取insertSupplierInfoResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link InsertSupplierInfoResponse }
     *     
     */
    public InsertSupplierInfoResponse getInsertSupplierInfoResult() {
        return insertSupplierInfoResult;
    }

    /**
     * 设置insertSupplierInfoResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link InsertSupplierInfoResponse }
     *     
     */
    public void setInsertSupplierInfoResult(InsertSupplierInfoResponse value) {
        this.insertSupplierInfoResult = value;
    }

}
