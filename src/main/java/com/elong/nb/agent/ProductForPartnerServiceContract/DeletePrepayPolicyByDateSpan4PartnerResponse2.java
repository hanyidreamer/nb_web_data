
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
 *         &lt;element name="DeletePrepayPolicyByDateSpan4PartnerResult" type="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response.CreateRatePalnPolicy}DeletePrepayPolicyByDateSpan4PartnerResponse" minOccurs="0"/&gt;
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
    "deletePrepayPolicyByDateSpan4PartnerResult"
})
@XmlRootElement(name = "DeletePrepayPolicyByDateSpan4PartnerResponse")
public class DeletePrepayPolicyByDateSpan4PartnerResponse2 {

    @XmlElement(name = "DeletePrepayPolicyByDateSpan4PartnerResult", nillable = true)
    protected DeletePrepayPolicyByDateSpan4PartnerResponse deletePrepayPolicyByDateSpan4PartnerResult;

    /**
     * 获取deletePrepayPolicyByDateSpan4PartnerResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DeletePrepayPolicyByDateSpan4PartnerResponse }
     *     
     */
    public DeletePrepayPolicyByDateSpan4PartnerResponse getDeletePrepayPolicyByDateSpan4PartnerResult() {
        return deletePrepayPolicyByDateSpan4PartnerResult;
    }

    /**
     * 设置deletePrepayPolicyByDateSpan4PartnerResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DeletePrepayPolicyByDateSpan4PartnerResponse }
     *     
     */
    public void setDeletePrepayPolicyByDateSpan4PartnerResult(DeletePrepayPolicyByDateSpan4PartnerResponse value) {
        this.deletePrepayPolicyByDateSpan4PartnerResult = value;
    }

}
