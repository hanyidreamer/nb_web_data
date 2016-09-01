
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
 *         &lt;element name="resPara" type="{http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.DataAccess.Hotel.HotelProductUse}HotelRatePlanSearchFor114" minOccurs="0"/&gt;
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
    "resPara"
})
@XmlRootElement(name = "SearchHotelDetailListFor114")
public class SearchHotelDetailListFor114 {

    @XmlElement(nillable = true)
    protected HotelRatePlanSearchFor114 resPara;

    /**
     * 获取resPara属性的值。
     * 
     * @return
     *     possible object is
     *     {@link HotelRatePlanSearchFor114 }
     *     
     */
    public HotelRatePlanSearchFor114 getResPara() {
        return resPara;
    }

    /**
     * 设置resPara属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link HotelRatePlanSearchFor114 }
     *     
     */
    public void setResPara(HotelRatePlanSearchFor114 value) {
        this.resPara = value;
    }

}
