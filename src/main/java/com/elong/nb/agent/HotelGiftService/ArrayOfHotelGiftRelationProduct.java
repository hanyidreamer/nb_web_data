
package com.elong.nb.agent.HotelGiftService;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ArrayOfHotelGiftRelationProduct complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ArrayOfHotelGiftRelationProduct">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HotelGiftRelationProduct" type="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model}HotelGiftRelationProduct" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHotelGiftRelationProduct", namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model", propOrder = {
    "hotelGiftRelationProduct"
})
public class ArrayOfHotelGiftRelationProduct {

    @XmlElement(name = "HotelGiftRelationProduct", nillable = true)
    protected List<HotelGiftRelationProduct> hotelGiftRelationProduct;

    /**
     * Gets the value of the hotelGiftRelationProduct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hotelGiftRelationProduct property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHotelGiftRelationProduct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HotelGiftRelationProduct }
     * 
     * 
     */
    public List<HotelGiftRelationProduct> getHotelGiftRelationProduct() {
        if (hotelGiftRelationProduct == null) {
            hotelGiftRelationProduct = new ArrayList<HotelGiftRelationProduct>();
        }
        return this.hotelGiftRelationProduct;
    }

}
