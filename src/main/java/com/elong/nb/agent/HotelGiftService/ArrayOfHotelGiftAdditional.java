
package com.elong.nb.agent.HotelGiftService;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ArrayOfHotelGiftAdditional complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ArrayOfHotelGiftAdditional">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HotelGiftAdditional" type="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model}HotelGiftAdditional" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHotelGiftAdditional", namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model", propOrder = {
    "hotelGiftAdditional"
})
public class ArrayOfHotelGiftAdditional {

    @XmlElement(name = "HotelGiftAdditional", nillable = true)
    protected List<HotelGiftAdditional> hotelGiftAdditional;

    /**
     * Gets the value of the hotelGiftAdditional property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hotelGiftAdditional property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHotelGiftAdditional().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HotelGiftAdditional }
     * 
     * 
     */
    public List<HotelGiftAdditional> getHotelGiftAdditional() {
        if (hotelGiftAdditional == null) {
            hotelGiftAdditional = new ArrayList<HotelGiftAdditional>();
        }
        return this.hotelGiftAdditional;
    }

}
