
package com.elong.nb.agent.ProductForSearchServiceForRealTimeCheck;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ArrayOfResourceInvAndInstantConfirmState complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ArrayOfResourceInvAndInstantConfirmState"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ResourceInvAndInstantConfirmState" type="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model.Inventory}ResourceInvAndInstantConfirmState" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfResourceInvAndInstantConfirmState", namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model.Inventory", propOrder = {
    "resourceInvAndInstantConfirmState"
})
public class ArrayOfResourceInvAndInstantConfirmState {

    @XmlElement(name = "ResourceInvAndInstantConfirmState", nillable = true)
    protected List<ResourceInvAndInstantConfirmState> resourceInvAndInstantConfirmState;

    /**
     * Gets the value of the resourceInvAndInstantConfirmState property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resourceInvAndInstantConfirmState property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResourceInvAndInstantConfirmState().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResourceInvAndInstantConfirmState }
     * 
     * 
     */
    public List<ResourceInvAndInstantConfirmState> getResourceInvAndInstantConfirmState() {
        if (resourceInvAndInstantConfirmState == null) {
            resourceInvAndInstantConfirmState = new ArrayList<ResourceInvAndInstantConfirmState>();
        }
        return this.resourceInvAndInstantConfirmState;
    }

}
