
package com.elong.nb.agent.ProductForPartnerServiceContract;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ArrayOfGetEbookingRoomNumModel complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ArrayOfGetEbookingRoomNumModel"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GetEbookingRoomNumModel" type="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model}GetEbookingRoomNumModel" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfGetEbookingRoomNumModel", namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model", propOrder = {
    "getEbookingRoomNumModel"
})
public class ArrayOfGetEbookingRoomNumModel {

    @XmlElement(name = "GetEbookingRoomNumModel", nillable = true)
    protected List<GetEbookingRoomNumModel> getEbookingRoomNumModel;

    /**
     * Gets the value of the getEbookingRoomNumModel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the getEbookingRoomNumModel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGetEbookingRoomNumModel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GetEbookingRoomNumModel }
     * 
     * 
     */
    public List<GetEbookingRoomNumModel> getGetEbookingRoomNumModel() {
        if (getEbookingRoomNumModel == null) {
            getEbookingRoomNumModel = new ArrayList<GetEbookingRoomNumModel>();
        }
        return this.getEbookingRoomNumModel;
    }

}
