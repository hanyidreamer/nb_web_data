
package com.elong.nb.agent.ProductForPartnerServiceContract;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ArrayOfInventoryDayDetailInfoInt complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ArrayOfInventoryDayDetailInfoInt"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="InventoryDayDetailInfoInt" type="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model}InventoryDayDetailInfoInt" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfInventoryDayDetailInfoInt", namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model", propOrder = {
    "inventoryDayDetailInfoInt"
})
public class ArrayOfInventoryDayDetailInfoInt {

    @XmlElement(name = "InventoryDayDetailInfoInt", nillable = true)
    protected List<InventoryDayDetailInfoInt> inventoryDayDetailInfoInt;

    /**
     * Gets the value of the inventoryDayDetailInfoInt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inventoryDayDetailInfoInt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInventoryDayDetailInfoInt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InventoryDayDetailInfoInt }
     * 
     * 
     */
    public List<InventoryDayDetailInfoInt> getInventoryDayDetailInfoInt() {
        if (inventoryDayDetailInfoInt == null) {
            inventoryDayDetailInfoInt = new ArrayList<InventoryDayDetailInfoInt>();
        }
        return this.inventoryDayDetailInfoInt;
    }

}
