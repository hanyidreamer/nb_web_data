
package com.elong.nb.agent.HotelGiftService;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ArrayOfHotelGiftHisModel complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ArrayOfHotelGiftHisModel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HotelGiftHisModel" type="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model}HotelGiftHisModel" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHotelGiftHisModel", namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model", propOrder = {
    "hotelGiftHisModel"
})
public class ArrayOfHotelGiftHisModel {

    @XmlElement(name = "HotelGiftHisModel", nillable = true)
    protected List<HotelGiftHisModel> hotelGiftHisModel;

    /**
     * Gets the value of the hotelGiftHisModel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hotelGiftHisModel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHotelGiftHisModel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HotelGiftHisModel }
     * 
     * 
     */
    public List<HotelGiftHisModel> getHotelGiftHisModel() {
        if (hotelGiftHisModel == null) {
            hotelGiftHisModel = new ArrayList<HotelGiftHisModel>();
        }
        return this.hotelGiftHisModel;
    }

}
