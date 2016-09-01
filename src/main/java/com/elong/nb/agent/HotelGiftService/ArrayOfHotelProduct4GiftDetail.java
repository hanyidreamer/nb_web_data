
package com.elong.nb.agent.HotelGiftService;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ArrayOfHotelProduct4GiftDetail complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ArrayOfHotelProduct4GiftDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HotelProduct4GiftDetail" type="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model}HotelProduct4GiftDetail" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHotelProduct4GiftDetail", namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model", propOrder = {
    "hotelProduct4GiftDetail"
})
public class ArrayOfHotelProduct4GiftDetail {

    @XmlElement(name = "HotelProduct4GiftDetail", nillable = true)
    protected List<HotelProduct4GiftDetail> hotelProduct4GiftDetail;

    /**
     * Gets the value of the hotelProduct4GiftDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hotelProduct4GiftDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHotelProduct4GiftDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HotelProduct4GiftDetail }
     * 
     * 
     */
    public List<HotelProduct4GiftDetail> getHotelProduct4GiftDetail() {
        if (hotelProduct4GiftDetail == null) {
            hotelProduct4GiftDetail = new ArrayList<HotelProduct4GiftDetail>();
        }
        return this.hotelProduct4GiftDetail;
    }

}
