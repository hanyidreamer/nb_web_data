
package com.elong.nb.agent.NorthBoundForAPIService;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ArrayOfSellChannel complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ArrayOfSellChannel"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SellChannel" type="{http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.Domain.Hotel.Entity}SellChannel" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfSellChannel", namespace = "http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.Domain.Hotel.Entity", propOrder = {
    "sellChannel"
})
public class ArrayOfSellChannel {

    @XmlElement(name = "SellChannel", nillable = true)
    protected List<SellChannel> sellChannel;

    /**
     * Gets the value of the sellChannel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sellChannel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSellChannel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SellChannel }
     * 
     * 
     */
    public List<SellChannel> getSellChannel() {
        if (sellChannel == null) {
            sellChannel = new ArrayList<SellChannel>();
        }
        return this.sellChannel;
    }

}
