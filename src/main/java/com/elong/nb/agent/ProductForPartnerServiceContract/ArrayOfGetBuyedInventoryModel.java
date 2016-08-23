
package com.elong.nb.agent.ProductForPartnerServiceContract;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ArrayOfGetBuyedInventoryModel complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ArrayOfGetBuyedInventoryModel"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GetBuyedInventoryModel" type="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model.Inventory}GetBuyedInventoryModel" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfGetBuyedInventoryModel", namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model.Inventory", propOrder = {
    "getBuyedInventoryModel"
})
public class ArrayOfGetBuyedInventoryModel {

    @XmlElement(name = "GetBuyedInventoryModel", nillable = true)
    protected List<GetBuyedInventoryModel> getBuyedInventoryModel;

    /**
     * Gets the value of the getBuyedInventoryModel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the getBuyedInventoryModel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGetBuyedInventoryModel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GetBuyedInventoryModel }
     * 
     * 
     */
    public List<GetBuyedInventoryModel> getGetBuyedInventoryModel() {
        if (getBuyedInventoryModel == null) {
            getBuyedInventoryModel = new ArrayList<GetBuyedInventoryModel>();
        }
        return this.getBuyedInventoryModel;
    }

}
