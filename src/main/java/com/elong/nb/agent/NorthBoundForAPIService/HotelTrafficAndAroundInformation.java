
package com.elong.nb.agent.NorthBoundForAPIService;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>HotelTrafficAndAroundInformation complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="HotelTrafficAndAroundInformation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Distances" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Note" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TimeTaken" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="TransportFee" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="Transportations" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HotelTrafficAndAroundInformation", namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Contract", propOrder = {
    "distances",
    "name",
    "note",
    "timeTaken",
    "transportFee",
    "transportations"
})
public class HotelTrafficAndAroundInformation {

    @XmlElement(name = "Distances", nillable = true)
    protected String distances;
    @XmlElement(name = "Name", nillable = true)
    protected String name;
    @XmlElement(name = "Note", nillable = true)
    protected String note;
    @XmlElement(name = "TimeTaken")
    protected Integer timeTaken;
    @XmlElement(name = "TransportFee")
    protected BigDecimal transportFee;
    @XmlElement(name = "Transportations")
    protected Integer transportations;

    /**
     * 获取distances属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistances() {
        return distances;
    }

    /**
     * 设置distances属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistances(String value) {
        this.distances = value;
    }

    /**
     * 获取name属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * 设置name属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * 获取note属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNote() {
        return note;
    }

    /**
     * 设置note属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNote(String value) {
        this.note = value;
    }

    /**
     * 获取timeTaken属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTimeTaken() {
        return timeTaken;
    }

    /**
     * 设置timeTaken属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTimeTaken(Integer value) {
        this.timeTaken = value;
    }

    /**
     * 获取transportFee属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTransportFee() {
        return transportFee;
    }

    /**
     * 设置transportFee属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTransportFee(BigDecimal value) {
        this.transportFee = value;
    }

    /**
     * 获取transportations属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTransportations() {
        return transportations;
    }

    /**
     * 设置transportations属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTransportations(Integer value) {
        this.transportations = value;
    }

}
