
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
 *         &lt;element name="DeleteVouchPolicyByDateSpan4PartnerResult" type="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response.CreateRatePalnPolicy}DeleteVouchPolicyByDateSpan4PartnerResponse" minOccurs="0"/&gt;
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
    "deleteVouchPolicyByDateSpan4PartnerResult"
})
@XmlRootElement(name = "DeleteVouchPolicyByDateSpan4PartnerResponse")
public class DeleteVouchPolicyByDateSpan4PartnerResponse2 {

    @XmlElement(name = "DeleteVouchPolicyByDateSpan4PartnerResult", nillable = true)
    protected DeleteVouchPolicyByDateSpan4PartnerResponse deleteVouchPolicyByDateSpan4PartnerResult;

    /**
     * 获取deleteVouchPolicyByDateSpan4PartnerResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DeleteVouchPolicyByDateSpan4PartnerResponse }
     *     
     */
    public DeleteVouchPolicyByDateSpan4PartnerResponse getDeleteVouchPolicyByDateSpan4PartnerResult() {
        return deleteVouchPolicyByDateSpan4PartnerResult;
    }

    /**
     * 设置deleteVouchPolicyByDateSpan4PartnerResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DeleteVouchPolicyByDateSpan4PartnerResponse }
     *     
     */
    public void setDeleteVouchPolicyByDateSpan4PartnerResult(DeleteVouchPolicyByDateSpan4PartnerResponse value) {
        this.deleteVouchPolicyByDateSpan4PartnerResult = value;
    }

}
