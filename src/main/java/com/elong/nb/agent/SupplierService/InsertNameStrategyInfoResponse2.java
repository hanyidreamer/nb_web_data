
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
 *         &lt;element name="InsertNameStrategyInfoResult" type="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response.Supplier}InsertNameStrategyInfoResponse" minOccurs="0"/>
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
    "insertNameStrategyInfoResult"
})
@XmlRootElement(name = "InsertNameStrategyInfoResponse")
public class InsertNameStrategyInfoResponse2 {

    @XmlElement(name = "InsertNameStrategyInfoResult", nillable = true)
    protected InsertNameStrategyInfoResponse insertNameStrategyInfoResult;

    /**
     * 获取insertNameStrategyInfoResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link InsertNameStrategyInfoResponse }
     *     
     */
    public InsertNameStrategyInfoResponse getInsertNameStrategyInfoResult() {
        return insertNameStrategyInfoResult;
    }

    /**
     * 设置insertNameStrategyInfoResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link InsertNameStrategyInfoResponse }
     *     
     */
    public void setInsertNameStrategyInfoResult(InsertNameStrategyInfoResponse value) {
        this.insertNameStrategyInfoResult = value;
    }

}
