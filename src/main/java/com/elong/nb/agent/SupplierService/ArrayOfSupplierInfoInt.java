
package com.elong.nb.agent.SupplierService;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ArrayOfSupplierInfoInt complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ArrayOfSupplierInfoInt">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SupplierInfoInt" type="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model}SupplierInfoInt" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfSupplierInfoInt", namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model", propOrder = {
    "supplierInfoInt"
})
public class ArrayOfSupplierInfoInt {

    @XmlElement(name = "SupplierInfoInt", nillable = true)
    protected List<SupplierInfoInt> supplierInfoInt;

    /**
     * Gets the value of the supplierInfoInt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the supplierInfoInt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSupplierInfoInt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupplierInfoInt }
     * 
     * 
     */
    public List<SupplierInfoInt> getSupplierInfoInt() {
        if (supplierInfoInt == null) {
            supplierInfoInt = new ArrayList<SupplierInfoInt>();
        }
        return this.supplierInfoInt;
    }

}
