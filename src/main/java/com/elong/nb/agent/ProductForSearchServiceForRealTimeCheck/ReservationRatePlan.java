
package com.elong.nb.agent.ProductForSearchServiceForRealTimeCheck;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ReservationRatePlan complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ReservationRatePlan"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PrepayPolicy" type="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model}ReservationPrepayPolicy" minOccurs="0"/&gt;
 *         &lt;element name="SettlementType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="VouchPolicy" type="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model}ReservationVouchPolicy" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReservationRatePlan", namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model", propOrder = {
    "prepayPolicy",
    "settlementType",
    "vouchPolicy"
})
public class ReservationRatePlan {

    @XmlElement(name = "PrepayPolicy", nillable = true)
    protected ReservationPrepayPolicy prepayPolicy;
    @XmlElement(name = "SettlementType")
    protected Integer settlementType;
    @XmlElement(name = "VouchPolicy", nillable = true)
    protected ReservationVouchPolicy vouchPolicy;

    /**
     * 获取prepayPolicy属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ReservationPrepayPolicy }
     *     
     */
    public ReservationPrepayPolicy getPrepayPolicy() {
        return prepayPolicy;
    }

    /**
     * 设置prepayPolicy属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ReservationPrepayPolicy }
     *     
     */
    public void setPrepayPolicy(ReservationPrepayPolicy value) {
        this.prepayPolicy = value;
    }

    /**
     * 获取settlementType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSettlementType() {
        return settlementType;
    }

    /**
     * 设置settlementType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSettlementType(Integer value) {
        this.settlementType = value;
    }

    /**
     * 获取vouchPolicy属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ReservationVouchPolicy }
     *     
     */
    public ReservationVouchPolicy getVouchPolicy() {
        return vouchPolicy;
    }

    /**
     * 设置vouchPolicy属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ReservationVouchPolicy }
     *     
     */
    public void setVouchPolicy(ReservationVouchPolicy value) {
        this.vouchPolicy = value;
    }

}
