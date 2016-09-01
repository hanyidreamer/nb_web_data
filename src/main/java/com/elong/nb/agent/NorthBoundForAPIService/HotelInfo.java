
package com.elong.nb.agent.NorthBoundForAPIService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>HotelInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="HotelInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Contract}HotelContent"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="HotelActivityList" type="{http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.Domain.Hotel}ArrayOfHotelActivity" minOccurs="0"/&gt;
 *         &lt;element name="HotelBookingRuleList" type="{http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.Domain.Hotel.HotelProductUseBusiness}ArrayOfHotelBookingRule" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HotelInfo", namespace = "http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.Domain.Hotel", propOrder = {
    "hotelActivityList",
    "hotelBookingRuleList"
})
public class HotelInfo
    extends HotelContent
{

    @XmlElement(name = "HotelActivityList", nillable = true)
    protected ArrayOfHotelActivity hotelActivityList;
    @XmlElement(name = "HotelBookingRuleList", nillable = true)
    protected ArrayOfHotelBookingRule hotelBookingRuleList;

    /**
     * 获取hotelActivityList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfHotelActivity }
     *     
     */
    public ArrayOfHotelActivity getHotelActivityList() {
        return hotelActivityList;
    }

    /**
     * 设置hotelActivityList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfHotelActivity }
     *     
     */
    public void setHotelActivityList(ArrayOfHotelActivity value) {
        this.hotelActivityList = value;
    }

    /**
     * 获取hotelBookingRuleList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfHotelBookingRule }
     *     
     */
    public ArrayOfHotelBookingRule getHotelBookingRuleList() {
        return hotelBookingRuleList;
    }

    /**
     * 设置hotelBookingRuleList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfHotelBookingRule }
     *     
     */
    public void setHotelBookingRuleList(ArrayOfHotelBookingRule value) {
        this.hotelBookingRuleList = value;
    }

}
