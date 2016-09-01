
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
 *         &lt;element name="GetHotelInfoIndexResult" type="{http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.DataAccess.Hotel.Northbound}ArrayOfHotelInfoForIndex" minOccurs="0"/&gt;
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
    "getHotelInfoIndexResult"
})
@XmlRootElement(name = "GetHotelInfoIndexResponse")
public class GetHotelInfoIndexResponse {

    @XmlElement(name = "GetHotelInfoIndexResult", nillable = true)
    protected ArrayOfHotelInfoForIndex getHotelInfoIndexResult;

    /**
     * 获取getHotelInfoIndexResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfHotelInfoForIndex }
     *     
     */
    public ArrayOfHotelInfoForIndex getGetHotelInfoIndexResult() {
        return getHotelInfoIndexResult;
    }

    /**
     * 设置getHotelInfoIndexResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfHotelInfoForIndex }
     *     
     */
    public void setGetHotelInfoIndexResult(ArrayOfHotelInfoForIndex value) {
        this.getHotelInfoIndexResult = value;
    }

}
