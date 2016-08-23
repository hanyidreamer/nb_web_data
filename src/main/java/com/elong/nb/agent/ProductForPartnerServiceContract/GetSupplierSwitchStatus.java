
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
 *         &lt;element name="req" type="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Request}GetSupplierSwitchStatusRequest" minOccurs="0"/&gt;
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
    "req"
})
@XmlRootElement(name = "GetSupplierSwitchStatus")
public class GetSupplierSwitchStatus {

    @XmlElement(nillable = true)
    protected GetSupplierSwitchStatusRequest req;

    /**
     * 获取req属性的值。
     * 
     * @return
     *     possible object is
     *     {@link GetSupplierSwitchStatusRequest }
     *     
     */
    public GetSupplierSwitchStatusRequest getReq() {
        return req;
    }

    /**
     * 设置req属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link GetSupplierSwitchStatusRequest }
     *     
     */
    public void setReq(GetSupplierSwitchStatusRequest value) {
        this.req = value;
    }

}
