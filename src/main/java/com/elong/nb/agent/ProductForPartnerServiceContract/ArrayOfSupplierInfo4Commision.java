
package com.elong.nb.agent.ProductForPartnerServiceContract;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ArrayOfSupplierInfo4Commision complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ArrayOfSupplierInfo4Commision"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SupplierInfo4Commision" type="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities}SupplierInfo4Commision" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfSupplierInfo4Commision", namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities", propOrder = {
    "supplierInfo4Commision"
})
public class ArrayOfSupplierInfo4Commision {

    @XmlElement(name = "SupplierInfo4Commision", nillable = true)
    protected List<SupplierInfo4Commision> supplierInfo4Commision;

    /**
     * Gets the value of the supplierInfo4Commision property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the supplierInfo4Commision property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSupplierInfo4Commision().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupplierInfo4Commision }
     * 
     * 
     */
    public List<SupplierInfo4Commision> getSupplierInfo4Commision() {
        if (supplierInfo4Commision == null) {
            supplierInfo4Commision = new ArrayList<SupplierInfo4Commision>();
        }
        return this.supplierInfo4Commision;
    }

}
