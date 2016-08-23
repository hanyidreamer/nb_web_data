
package com.elong.nb.agent.ProductForPartnerServiceContract;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ArrayOfGetHotelInventoryRoomStatus4Backend complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ArrayOfGetHotelInventoryRoomStatus4Backend"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GetHotelInventoryRoomStatus4Backend" type="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model.Inventory}GetHotelInventoryRoomStatus4Backend" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfGetHotelInventoryRoomStatus4Backend", namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model.Inventory", propOrder = {
    "getHotelInventoryRoomStatus4Backend"
})
public class ArrayOfGetHotelInventoryRoomStatus4Backend {

    @XmlElement(name = "GetHotelInventoryRoomStatus4Backend", nillable = true)
    protected List<GetHotelInventoryRoomStatus4Backend> getHotelInventoryRoomStatus4Backend;

    /**
     * Gets the value of the getHotelInventoryRoomStatus4Backend property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the getHotelInventoryRoomStatus4Backend property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGetHotelInventoryRoomStatus4Backend().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GetHotelInventoryRoomStatus4Backend }
     * 
     * 
     */
    public List<GetHotelInventoryRoomStatus4Backend> getGetHotelInventoryRoomStatus4Backend() {
        if (getHotelInventoryRoomStatus4Backend == null) {
            getHotelInventoryRoomStatus4Backend = new ArrayList<GetHotelInventoryRoomStatus4Backend>();
        }
        return this.getHotelInventoryRoomStatus4Backend;
    }

}
