
package com.elong.nb.agent.SupplierService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>InsertNameStrategyInfoRequest complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="InsertNameStrategyInfoRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Request}ProductRequestBase">
 *       &lt;sequence>
 *         &lt;element name="NameStrategyInfo" type="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model}NameStrategyInfo" minOccurs="0"/>
 *         &lt;element name="SupplierId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InsertNameStrategyInfoRequest", namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Request.Supplier", propOrder = {
    "nameStrategyInfo",
    "supplierId"
})
public class InsertNameStrategyInfoRequest
    extends ProductRequestBase
{

    @XmlElement(name = "NameStrategyInfo", nillable = true)
    protected NameStrategyInfo nameStrategyInfo;
    @XmlElement(name = "SupplierId")
    protected Integer supplierId;

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

    /**
     * 获取supplierId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSupplierId() {
        return supplierId;
    }

    /**
     * 设置supplierId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSupplierId(Integer value) {
        this.supplierId = value;
    }

}
