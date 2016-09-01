
package com.elong.nb.agent.NorthBoundForAPIService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>HotelBookingRule complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="HotelBookingRule"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.DataAccess.Hotel}BookingRuleBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RuleValues" type="{http://schemas.datacontract.org/2004/07/System.Collections}ArrayOfDictionaryEntry" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HotelBookingRule", namespace = "http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.Domain.Hotel.HotelProductUseBusiness", propOrder = {
    "ruleValues"
})
public class HotelBookingRule
    extends BookingRuleBase
{

    @XmlElement(name = "RuleValues", nillable = true)
    protected ArrayOfDictionaryEntry ruleValues;

    /**
     * 获取ruleValues属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDictionaryEntry }
     *     
     */
    public ArrayOfDictionaryEntry getRuleValues() {
        return ruleValues;
    }

    /**
     * 设置ruleValues属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDictionaryEntry }
     *     
     */
    public void setRuleValues(ArrayOfDictionaryEntry value) {
        this.ruleValues = value;
    }

}
