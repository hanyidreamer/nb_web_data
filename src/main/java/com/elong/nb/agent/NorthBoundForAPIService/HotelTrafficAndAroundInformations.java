
package com.elong.nb.agent.NorthBoundForAPIService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>HotelTrafficAndAroundInformations complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="HotelTrafficAndAroundInformations"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Overview" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TrafficAndAroundInformationList" type="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Contract}ArrayOfHotelTrafficAndAroundInformation" minOccurs="0"/&gt;
 *         &lt;element name="TrafficGuide" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HotelTrafficAndAroundInformations", namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Contract", propOrder = {
    "overview",
    "trafficAndAroundInformationList",
    "trafficGuide"
})
public class HotelTrafficAndAroundInformations {

    @XmlElement(name = "Overview", nillable = true)
    protected String overview;
    @XmlElement(name = "TrafficAndAroundInformationList", nillable = true)
    protected ArrayOfHotelTrafficAndAroundInformation trafficAndAroundInformationList;
    @XmlElement(name = "TrafficGuide", nillable = true)
    protected String trafficGuide;

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

    /**
     * 获取trafficAndAroundInformationList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfHotelTrafficAndAroundInformation }
     *     
     */
    public ArrayOfHotelTrafficAndAroundInformation getTrafficAndAroundInformationList() {
        return trafficAndAroundInformationList;
    }

    /**
     * 设置trafficAndAroundInformationList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfHotelTrafficAndAroundInformation }
     *     
     */
    public void setTrafficAndAroundInformationList(ArrayOfHotelTrafficAndAroundInformation value) {
        this.trafficAndAroundInformationList = value;
    }

    /**
     * 获取trafficGuide属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrafficGuide() {
        return trafficGuide;
    }

    /**
     * 设置trafficGuide属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrafficGuide(String value) {
        this.trafficGuide = value;
    }

}
