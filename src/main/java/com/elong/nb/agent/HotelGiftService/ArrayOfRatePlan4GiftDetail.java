
package com.elong.nb.agent.HotelGiftService;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ArrayOfRatePlan4GiftDetail complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ArrayOfRatePlan4GiftDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RatePlan4GiftDetail" type="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model}RatePlan4GiftDetail" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfRatePlan4GiftDetail", namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model", propOrder = {
    "ratePlan4GiftDetail"
})
public class ArrayOfRatePlan4GiftDetail {

    @XmlElement(name = "RatePlan4GiftDetail", nillable = true)
    protected List<RatePlan4GiftDetail> ratePlan4GiftDetail;

    /**
     * Gets the value of the ratePlan4GiftDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ratePlan4GiftDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRatePlan4GiftDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RatePlan4GiftDetail }
     * 
     * 
     */
    public List<RatePlan4GiftDetail> getRatePlan4GiftDetail() {
        if (ratePlan4GiftDetail == null) {
            ratePlan4GiftDetail = new ArrayList<RatePlan4GiftDetail>();
        }
        return this.ratePlan4GiftDetail;
    }

}
