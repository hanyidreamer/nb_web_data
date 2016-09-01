
package com.elong.nb.agent.NorthBoundForAPIService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>HotelAmenity complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="HotelAmenity"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AmenityDetail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AmenityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HotelAmenity", namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Contract", propOrder = {
    "amenityDetail",
    "amenityName"
})
public class HotelAmenity {

    @XmlElement(name = "AmenityDetail", nillable = true)
    protected String amenityDetail;
    @XmlElement(name = "AmenityName", nillable = true)
    protected String amenityName;

    /**
     * 获取amenityDetail属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmenityDetail() {
        return amenityDetail;
    }

    /**
     * 设置amenityDetail属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmenityDetail(String value) {
        this.amenityDetail = value;
    }

    /**
     * 获取amenityName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmenityName() {
        return amenityName;
    }

    /**
     * 设置amenityName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmenityName(String value) {
        this.amenityName = value;
    }

}
