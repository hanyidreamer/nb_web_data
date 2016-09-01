
package com.elong.nb.agent.NorthBoundForAPIService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="HotelNorthBoundAPIUserId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "hotelNorthBoundAPIUserId"
})
@XmlRootElement(name = "GetHotelAPIUsersByID")
public class GetHotelAPIUsersByID {

    @XmlElement(name = "HotelNorthBoundAPIUserId")
    protected Integer hotelNorthBoundAPIUserId;

    /**
     * 获取hotelNorthBoundAPIUserId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHotelNorthBoundAPIUserId() {
        return hotelNorthBoundAPIUserId;
    }

    /**
     * 设置hotelNorthBoundAPIUserId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHotelNorthBoundAPIUserId(Integer value) {
        this.hotelNorthBoundAPIUserId = value;
    }

}
