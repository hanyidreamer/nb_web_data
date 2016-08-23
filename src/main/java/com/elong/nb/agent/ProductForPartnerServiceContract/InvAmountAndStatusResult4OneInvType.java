
package com.elong.nb.agent.ProductForPartnerServiceContract;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>InvAmountAndStatusResult4OneInvType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="InvAmountAndStatusResult4OneInvType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OriginOperation4OneInvType" type="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model.Inventory}InventoryAmountAndStatusOperation" minOccurs="0"/&gt;
 *         &lt;element name="ResultElements4OneInvType" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfKeyValueOfintInvAmountAndStatusResultElement8x1z9B1i" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvAmountAndStatusResult4OneInvType", namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response.Product4Partners", propOrder = {
    "originOperation4OneInvType",
    "resultElements4OneInvType"
})
public class InvAmountAndStatusResult4OneInvType {

    @XmlElement(name = "OriginOperation4OneInvType", nillable = true)
    protected InventoryAmountAndStatusOperation originOperation4OneInvType;
    @XmlElement(name = "ResultElements4OneInvType", nillable = true)
    protected ArrayOfKeyValueOfintInvAmountAndStatusResultElement8X1Z9B1I resultElements4OneInvType;

    /**
     * 获取originOperation4OneInvType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link InventoryAmountAndStatusOperation }
     *     
     */
    public InventoryAmountAndStatusOperation getOriginOperation4OneInvType() {
        return originOperation4OneInvType;
    }

    /**
     * 设置originOperation4OneInvType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link InventoryAmountAndStatusOperation }
     *     
     */
    public void setOriginOperation4OneInvType(InventoryAmountAndStatusOperation value) {
        this.originOperation4OneInvType = value;
    }

    /**
     * 获取resultElements4OneInvType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfKeyValueOfintInvAmountAndStatusResultElement8X1Z9B1I }
     *     
     */
    public ArrayOfKeyValueOfintInvAmountAndStatusResultElement8X1Z9B1I getResultElements4OneInvType() {
        return resultElements4OneInvType;
    }

    /**
     * 设置resultElements4OneInvType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfKeyValueOfintInvAmountAndStatusResultElement8X1Z9B1I }
     *     
     */
    public void setResultElements4OneInvType(ArrayOfKeyValueOfintInvAmountAndStatusResultElement8X1Z9B1I value) {
        this.resultElements4OneInvType = value;
    }

}
