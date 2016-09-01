
package com.elong.nb.agent.SupplierService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>GetNameStrategyInfoResponse complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="GetNameStrategyInfoResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Framework}ServiceResponseBase">
 *       &lt;sequence>
 *         &lt;element name="NameStrategyInfo" type="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model}NameStrategyInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetNameStrategyInfoResponse", namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response.Supplier", propOrder = {
    "nameStrategyInfo"
})
public class GetNameStrategyInfoResponse
    extends ServiceResponseBase
{

    @XmlElement(name = "NameStrategyInfo", nillable = true)
    protected NameStrategyInfo nameStrategyInfo;

    /**
     * 获取nameStrategyInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link NameStrategyInfo }
     *     
     */
    public NameStrategyInfo getNameStrategyInfo() {
        return nameStrategyInfo;
    }

    /**
     * 设置nameStrategyInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link NameStrategyInfo }
     *     
     */
    public void setNameStrategyInfo(NameStrategyInfo value) {
        this.nameStrategyInfo = value;
    }

}
