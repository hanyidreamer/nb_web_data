
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
 *         &lt;element name="BatchReplaceInventory4PartnerResult" type="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response}BatchReplaceInventory4PartnerResponse" minOccurs="0"/&gt;
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
    "batchReplaceInventory4PartnerResult"
})
@XmlRootElement(name = "BatchReplaceInventory4PartnerResponse")
public class BatchReplaceInventory4PartnerResponse2 {

    @XmlElement(name = "BatchReplaceInventory4PartnerResult", nillable = true)
    protected BatchReplaceInventory4PartnerResponse batchReplaceInventory4PartnerResult;

    /**
     * 获取batchReplaceInventory4PartnerResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BatchReplaceInventory4PartnerResponse }
     *     
     */
    public BatchReplaceInventory4PartnerResponse getBatchReplaceInventory4PartnerResult() {
        return batchReplaceInventory4PartnerResult;
    }

    /**
     * 设置batchReplaceInventory4PartnerResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BatchReplaceInventory4PartnerResponse }
     *     
     */
    public void setBatchReplaceInventory4PartnerResult(BatchReplaceInventory4PartnerResponse value) {
        this.batchReplaceInventory4PartnerResult = value;
    }

}
