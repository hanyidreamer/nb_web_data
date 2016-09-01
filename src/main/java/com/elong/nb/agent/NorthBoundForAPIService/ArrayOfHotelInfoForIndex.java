
package com.elong.nb.agent.NorthBoundForAPIService;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ArrayOfHotelInfoForIndex complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ArrayOfHotelInfoForIndex"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="HotelInfoForIndex" type="{http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.DataAccess.Hotel.Northbound}HotelInfoForIndex" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHotelInfoForIndex", namespace = "http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.DataAccess.Hotel.Northbound", propOrder = {
    "hotelInfoForIndex"
})
public class ArrayOfHotelInfoForIndex {

    @XmlElement(name = "HotelInfoForIndex", nillable = true)
    protected List<HotelInfoForIndex> hotelInfoForIndex;

    /**
     * Gets the value of the hotelInfoForIndex property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hotelInfoForIndex property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHotelInfoForIndex().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HotelInfoForIndex }
     * 
     * 
     */
    public List<HotelInfoForIndex> getHotelInfoForIndex() {
        if (hotelInfoForIndex == null) {
            hotelInfoForIndex = new ArrayList<HotelInfoForIndex>();
        }
        return this.hotelInfoForIndex;
    }

}
