
package com.elong.nb.agent.ProductForPartnerServiceContract;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>BatchEditInvAmountAndStatusForEBookingResponse complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="BatchEditInvAmountAndStatusForEBookingResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Framework}ServiceResponseBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="InvAmountAndStatusResults" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfKeyValueOfintInvAmountAndStatusResult4OneInvType8x1z9B1i" minOccurs="0"/&gt;
 *         &lt;element name="OperateBedTypeResult" type="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response.Product4Partners}OperateBedTypeResult" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BatchEditInvAmountAndStatusForEBookingResponse", namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response.Product4Partners", propOrder = {
    "invAmountAndStatusResults",
    "operateBedTypeResult"
})
public class BatchEditInvAmountAndStatusForEBookingResponse
    extends ServiceResponseBase
{

    @XmlElement(name = "InvAmountAndStatusResults", nillable = true)
    protected ArrayOfKeyValueOfintInvAmountAndStatusResult4OneInvType8X1Z9B1I invAmountAndStatusResults;
    @XmlElement(name = "OperateBedTypeResult", nillable = true)
    protected OperateBedTypeResult operateBedTypeResult;

    /**
     * 获取invAmountAndStatusResults属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfKeyValueOfintInvAmountAndStatusResult4OneInvType8X1Z9B1I }
     *     
     */
    public ArrayOfKeyValueOfintInvAmountAndStatusResult4OneInvType8X1Z9B1I getInvAmountAndStatusResults() {
        return invAmountAndStatusResults;
    }

    /**
     * 设置invAmountAndStatusResults属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfKeyValueOfintInvAmountAndStatusResult4OneInvType8X1Z9B1I }
     *     
     */
    public void setInvAmountAndStatusResults(ArrayOfKeyValueOfintInvAmountAndStatusResult4OneInvType8X1Z9B1I value) {
        this.invAmountAndStatusResults = value;
    }

    /**
     * 获取operateBedTypeResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link OperateBedTypeResult }
     *     
     */
    public OperateBedTypeResult getOperateBedTypeResult() {
        return operateBedTypeResult;
    }

    /**
     * 设置operateBedTypeResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link OperateBedTypeResult }
     *     
     */
    public void setOperateBedTypeResult(OperateBedTypeResult value) {
        this.operateBedTypeResult = value;
    }

}
