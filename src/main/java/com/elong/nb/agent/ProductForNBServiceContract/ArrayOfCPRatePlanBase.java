
package com.elong.nb.agent.ProductForNBServiceContract;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ArrayOfCP_RatePlanBase complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCP_RatePlanBase"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CP_RatePlanBase" type="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model}CP_RatePlanBase" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCP_RatePlanBase", namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model", propOrder = {
    "cpRatePlanBase"
})
public class ArrayOfCPRatePlanBase {

    @XmlElement(name = "CP_RatePlanBase", nillable = true)
    protected List<CPRatePlanBase> cpRatePlanBase;

    /**
     * Gets the value of the cpRatePlanBase property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cpRatePlanBase property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCPRatePlanBase().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CPRatePlanBase }
     * 
     * 
     */
    public List<CPRatePlanBase> getCPRatePlanBase() {
        if (cpRatePlanBase == null) {
            cpRatePlanBase = new ArrayList<CPRatePlanBase>();
        }
        return this.cpRatePlanBase;
    }

}
