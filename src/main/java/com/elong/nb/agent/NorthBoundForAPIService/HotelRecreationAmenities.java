
package com.elong.nb.agent.NorthBoundForAPIService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>HotelRecreationAmenities complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="HotelRecreationAmenities"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AmenitySimpleList" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/&gt;
 *         &lt;element name="Overview" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HotelRecreationAmenities", namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Contract", propOrder = {
    "amenitySimpleList",
    "overview"
})
public class HotelRecreationAmenities {

    @XmlElement(name = "AmenitySimpleList", nillable = true)
    protected ArrayOfstring amenitySimpleList;
    @XmlElement(name = "Overview", nillable = true)
    protected String overview;

    /**
     * 获取amenitySimpleList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfstring }
     *     
     */
    public ArrayOfstring getAmenitySimpleList() {
        return amenitySimpleList;
    }

    /**
     * 设置amenitySimpleList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfstring }
     *     
     */
    public void setAmenitySimpleList(ArrayOfstring value) {
        this.amenitySimpleList = value;
    }

    /**
     * 获取overview属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOverview() {
        return overview;
    }

    /**
     * 设置overview属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOverview(String value) {
        this.overview = value;
    }

}
