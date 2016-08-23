
package com.elong.nb.agent.ProductForPartnerServiceContract;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>CreatePerpayPolicyRequest complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="CreatePerpayPolicyRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Request}CreateRatePalnPolicyBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ChangeRuleForCustomer" type="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model}CP_PerpayPolicyInfo.ChangeRule" minOccurs="0"/&gt;
 *         &lt;element name="ChangeRuleForHotel" type="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model}CP_PerpayPolicyInfo.ChangeRule" minOccurs="0"/&gt;
 *         &lt;element name="DateType" type="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Enums}EnumDateType" minOccurs="0"/&gt;
 *         &lt;element name="WeekDays" type="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Enums}WeekDays" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreatePerpayPolicyRequest", namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Request", propOrder = {
    "changeRuleForCustomer",
    "changeRuleForHotel",
    "dateType",
    "weekDays"
})
public class CreatePerpayPolicyRequest
    extends CreateRatePalnPolicyBase
{

    @XmlElement(name = "ChangeRuleForCustomer", nillable = true)
    protected CPPerpayPolicyInfoChangeRule changeRuleForCustomer;
    @XmlElement(name = "ChangeRuleForHotel", nillable = true)
    protected CPPerpayPolicyInfoChangeRule changeRuleForHotel;
    @XmlElement(name = "DateType")
    @XmlSchemaType(name = "string")
    protected EnumDateType dateType;
    @XmlList
    @XmlElement(name = "WeekDays")
    @XmlSchemaType(name = "anySimpleType")
    protected List<String> weekDays;

    /**
     * 获取changeRuleForCustomer属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CPPerpayPolicyInfoChangeRule }
     *     
     */
    public CPPerpayPolicyInfoChangeRule getChangeRuleForCustomer() {
        return changeRuleForCustomer;
    }

    /**
     * 设置changeRuleForCustomer属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CPPerpayPolicyInfoChangeRule }
     *     
     */
    public void setChangeRuleForCustomer(CPPerpayPolicyInfoChangeRule value) {
        this.changeRuleForCustomer = value;
    }

    /**
     * 获取changeRuleForHotel属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CPPerpayPolicyInfoChangeRule }
     *     
     */
    public CPPerpayPolicyInfoChangeRule getChangeRuleForHotel() {
        return changeRuleForHotel;
    }

    /**
     * 设置changeRuleForHotel属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CPPerpayPolicyInfoChangeRule }
     *     
     */
    public void setChangeRuleForHotel(CPPerpayPolicyInfoChangeRule value) {
        this.changeRuleForHotel = value;
    }

    /**
     * 获取dateType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link EnumDateType }
     *     
     */
    public EnumDateType getDateType() {
        return dateType;
    }

    /**
     * 设置dateType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link EnumDateType }
     *     
     */
    public void setDateType(EnumDateType value) {
        this.dateType = value;
    }

    /**
     * Gets the value of the weekDays property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the weekDays property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWeekDays().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getWeekDays() {
        if (weekDays == null) {
            weekDays = new ArrayList<String>();
        }
        return this.weekDays;
    }

}
