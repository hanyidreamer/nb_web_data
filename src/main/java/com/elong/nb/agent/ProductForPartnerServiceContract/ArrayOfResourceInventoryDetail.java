
package com.elong.nb.agent.ProductForPartnerServiceContract;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ArrayOfResourceInventoryDetail complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ArrayOfResourceInventoryDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ResourceInventoryDetail" type="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model.Product4Partners}ResourceInventoryDetail" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfResourceInventoryDetail", namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model.Product4Partners", propOrder = {
    "resourceInventoryDetail"
})
public class ArrayOfResourceInventoryDetail {

    @XmlElement(name = "ResourceInventoryDetail", nillable = true)
    protected List<ResourceInventoryDetail> resourceInventoryDetail;

    /**
     * Gets the value of the resourceInventoryDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resourceInventoryDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResourceInventoryDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResourceInventoryDetail }
     * 
     * 
     */
    public List<ResourceInventoryDetail> getResourceInventoryDetail() {
        if (resourceInventoryDetail == null) {
            resourceInventoryDetail = new ArrayList<ResourceInventoryDetail>();
        }
        return this.resourceInventoryDetail;
    }

}
