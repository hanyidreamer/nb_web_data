
package com.elong.nb.agent.NorthBoundForAPIService;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ArrayOfRatePlanPaymentRule complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ArrayOfRatePlanPaymentRule"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RatePlanPaymentRule" type="{http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.Domain.Hotel}RatePlanPaymentRule" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfRatePlanPaymentRule", namespace = "http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.Domain.Hotel", propOrder = {
    "ratePlanPaymentRule"
})
public class ArrayOfRatePlanPaymentRule {

    @XmlElement(name = "RatePlanPaymentRule", nillable = true)
    protected List<RatePlanPaymentRule> ratePlanPaymentRule;

    /**
     * Gets the value of the ratePlanPaymentRule property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ratePlanPaymentRule property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRatePlanPaymentRule().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RatePlanPaymentRule }
     * 
     * 
     */
    public List<RatePlanPaymentRule> getRatePlanPaymentRule() {
        if (ratePlanPaymentRule == null) {
            ratePlanPaymentRule = new ArrayList<RatePlanPaymentRule>();
        }
        return this.ratePlanPaymentRule;
    }

}
