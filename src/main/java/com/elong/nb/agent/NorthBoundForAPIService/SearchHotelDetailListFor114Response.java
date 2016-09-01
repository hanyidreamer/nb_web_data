
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
 *         &lt;element name="SearchHotelDetailListFor114Result" type="{http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.Domain.Hotel}ArrayOfHotelDetail" minOccurs="0"/&gt;
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
    "searchHotelDetailListFor114Result"
})
@XmlRootElement(name = "SearchHotelDetailListFor114Response")
public class SearchHotelDetailListFor114Response {

    @XmlElement(name = "SearchHotelDetailListFor114Result", nillable = true)
    protected ArrayOfHotelDetail searchHotelDetailListFor114Result;

    /**
     * 获取searchHotelDetailListFor114Result属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfHotelDetail }
     *     
     */
    public ArrayOfHotelDetail getSearchHotelDetailListFor114Result() {
        return searchHotelDetailListFor114Result;
    }

    /**
     * 设置searchHotelDetailListFor114Result属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfHotelDetail }
     *     
     */
    public void setSearchHotelDetailListFor114Result(ArrayOfHotelDetail value) {
        this.searchHotelDetailListFor114Result = value;
    }

}
