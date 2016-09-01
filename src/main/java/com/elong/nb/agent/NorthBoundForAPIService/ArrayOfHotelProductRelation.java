
package com.elong.nb.agent.NorthBoundForAPIService;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ArrayOfHotelProductRelation complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ArrayOfHotelProductRelation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="HotelProductRelation" type="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Contract}HotelProductRelation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHotelProductRelation", namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Contract", propOrder = {
    "hotelProductRelation"
})
public class ArrayOfHotelProductRelation {

    @XmlElement(name = "HotelProductRelation", nillable = true)
    protected List<HotelProductRelation> hotelProductRelation;

    /**
     * Gets the value of the hotelProductRelation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hotelProductRelation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHotelProductRelation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HotelProductRelation }
     * 
     * 
     */
    public List<HotelProductRelation> getHotelProductRelation() {
        if (hotelProductRelation == null) {
            hotelProductRelation = new ArrayList<HotelProductRelation>();
        }
        return this.hotelProductRelation;
    }

}
