
package com.elong.nb.agent.NorthBoundForAPIService;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ArrayOfHotelNorthBoundAPIUsers complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ArrayOfHotelNorthBoundAPIUsers"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="HotelNorthBoundAPIUsers" type="{http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.DataAccess.Hotel}HotelNorthBoundAPIUsers" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHotelNorthBoundAPIUsers", namespace = "http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.DataAccess.Hotel", propOrder = {
    "hotelNorthBoundAPIUsers"
})
public class ArrayOfHotelNorthBoundAPIUsers {

    @XmlElement(name = "HotelNorthBoundAPIUsers", nillable = true)
    protected List<HotelNorthBoundAPIUsers> hotelNorthBoundAPIUsers;

    /**
     * Gets the value of the hotelNorthBoundAPIUsers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hotelNorthBoundAPIUsers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHotelNorthBoundAPIUsers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HotelNorthBoundAPIUsers }
     * 
     * 
     */
    public List<HotelNorthBoundAPIUsers> getHotelNorthBoundAPIUsers() {
        if (hotelNorthBoundAPIUsers == null) {
            hotelNorthBoundAPIUsers = new ArrayList<HotelNorthBoundAPIUsers>();
        }
        return this.hotelNorthBoundAPIUsers;
    }

}
