
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
 *         &lt;element name="resPara" type="{http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.DataAccess.Hotel.HotelProductUse}HotelRatePlanCondition" minOccurs="0"/&gt;
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
@XmlRootElement(name = "SearchHotelRatePlanList")
public class SearchHotelRatePlanList {

    @XmlElement(nillable = true)
    protected HotelRatePlanCondition resPara;

    /**
     * 获取resPara属性的值。
     * 
     * @return
     *     possible object is
     *     {@link HotelRatePlanCondition }
     *     
     */
    public HotelRatePlanCondition getResPara() {
        return resPara;
    }

    /**
     * 设置resPara属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link HotelRatePlanCondition }
     *     
     */
    public void setResPara(HotelRatePlanCondition value) {
        this.resPara = value;
    }

}
