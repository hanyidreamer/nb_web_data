
package com.elong.nb.agent.NorthBoundForAPIService;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ArrayOfAddValueInfoSimple complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ArrayOfAddValueInfoSimple"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AddValueInfoSimple" type="{http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.DataAccess.Hotel}AddValueInfoSimple" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAddValueInfoSimple", namespace = "http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.DataAccess.Hotel", propOrder = {
    "addValueInfoSimple"
})
public class ArrayOfAddValueInfoSimple {

    @XmlElement(name = "AddValueInfoSimple", nillable = true)
    protected List<AddValueInfoSimple> addValueInfoSimple;

    /**
     * Gets the value of the addValueInfoSimple property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addValueInfoSimple property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddValueInfoSimple().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AddValueInfoSimple }
     * 
     * 
     */
    public List<AddValueInfoSimple> getAddValueInfoSimple() {
        if (addValueInfoSimple == null) {
            addValueInfoSimple = new ArrayList<AddValueInfoSimple>();
        }
        return this.addValueInfoSimple;
    }

}
