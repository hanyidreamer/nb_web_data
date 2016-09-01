
package com.elong.nb.agent.HotelGiftService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>RatePlan4GiftDetail complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="RatePlan4GiftDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CNRatePlanName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ENRatePlanName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsGiftApplied2TheProduct" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="RatePlanID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RatePlan4GiftDetail", namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model", propOrder = {
    "cnRatePlanName",
    "enRatePlanName",
    "isGiftApplied2TheProduct",
    "ratePlanID"
})
public class RatePlan4GiftDetail {

    @XmlElement(name = "CNRatePlanName", nillable = true)
    protected String cnRatePlanName;
    @XmlElement(name = "ENRatePlanName", nillable = true)
    protected String enRatePlanName;
    @XmlElement(name = "IsGiftApplied2TheProduct")
    protected Boolean isGiftApplied2TheProduct;
    @XmlElement(name = "RatePlanID")
    protected Integer ratePlanID;

    /**
     * 获取cnRatePlanName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCNRatePlanName() {
        return cnRatePlanName;
    }

    /**
     * 设置cnRatePlanName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCNRatePlanName(String value) {
        this.cnRatePlanName = value;
    }

    /**
     * 获取enRatePlanName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getENRatePlanName() {
        return enRatePlanName;
    }

    /**
     * 设置enRatePlanName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setENRatePlanName(String value) {
        this.enRatePlanName = value;
    }

    /**
     * 获取isGiftApplied2TheProduct属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsGiftApplied2TheProduct() {
        return isGiftApplied2TheProduct;
    }

    /**
     * 设置isGiftApplied2TheProduct属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsGiftApplied2TheProduct(Boolean value) {
        this.isGiftApplied2TheProduct = value;
    }

    /**
     * 获取ratePlanID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRatePlanID() {
        return ratePlanID;
    }

    /**
     * 设置ratePlanID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRatePlanID(Integer value) {
        this.ratePlanID = value;
    }

}
