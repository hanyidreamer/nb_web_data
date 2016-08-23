
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
 *         &lt;element name="EditInventoryEndDate4PartnersResult" type="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response.Product4Partners}EditInventoryEndDate4PartnersResponse" minOccurs="0"/&gt;
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
    "editInventoryEndDate4PartnersResult"
})
@XmlRootElement(name = "EditInventoryEndDate4PartnersResponse")
public class EditInventoryEndDate4PartnersResponse2 {

    @XmlElement(name = "EditInventoryEndDate4PartnersResult", nillable = true)
    protected EditInventoryEndDate4PartnersResponse editInventoryEndDate4PartnersResult;

    /**
     * 获取editInventoryEndDate4PartnersResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link EditInventoryEndDate4PartnersResponse }
     *     
     */
    public EditInventoryEndDate4PartnersResponse getEditInventoryEndDate4PartnersResult() {
        return editInventoryEndDate4PartnersResult;
    }

    /**
     * 设置editInventoryEndDate4PartnersResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link EditInventoryEndDate4PartnersResponse }
     *     
     */
    public void setEditInventoryEndDate4PartnersResult(EditInventoryEndDate4PartnersResponse value) {
        this.editInventoryEndDate4PartnersResult = value;
    }

}
