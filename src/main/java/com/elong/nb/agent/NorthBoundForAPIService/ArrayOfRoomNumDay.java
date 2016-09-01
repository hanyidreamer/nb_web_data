
package com.elong.nb.agent.NorthBoundForAPIService;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ArrayOfRoomNumDay complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ArrayOfRoomNumDay"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RoomNumDay" type="{http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.Domain.Hotel}RoomNumDay" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfRoomNumDay", namespace = "http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.Domain.Hotel", propOrder = {
    "roomNumDay"
})
public class ArrayOfRoomNumDay {

    @XmlElement(name = "RoomNumDay", nillable = true)
    protected List<RoomNumDay> roomNumDay;

    /**
     * Gets the value of the roomNumDay property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the roomNumDay property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRoomNumDay().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RoomNumDay }
     * 
     * 
     */
    public List<RoomNumDay> getRoomNumDay() {
        if (roomNumDay == null) {
            roomNumDay = new ArrayList<RoomNumDay>();
        }
        return this.roomNumDay;
    }

}
