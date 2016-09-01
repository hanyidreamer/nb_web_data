
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
 *         &lt;element name="GetHotelAPIUsersByUserInfoResult" type="{http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.DataAccess.Hotel}HotelNorthBoundAPIUsers" minOccurs="0"/&gt;
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
    "getHotelAPIUsersByUserInfoResult"
})
@XmlRootElement(name = "GetHotelAPIUsersByUserInfoResponse")
public class GetHotelAPIUsersByUserInfoResponse {

    @XmlElement(name = "GetHotelAPIUsersByUserInfoResult", nillable = true)
    protected HotelNorthBoundAPIUsers getHotelAPIUsersByUserInfoResult;

    /**
     * 获取getHotelAPIUsersByUserInfoResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link HotelNorthBoundAPIUsers }
     *     
     */
    public HotelNorthBoundAPIUsers getGetHotelAPIUsersByUserInfoResult() {
        return getHotelAPIUsersByUserInfoResult;
    }

    /**
     * 设置getHotelAPIUsersByUserInfoResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link HotelNorthBoundAPIUsers }
     *     
     */
    public void setGetHotelAPIUsersByUserInfoResult(HotelNorthBoundAPIUsers value) {
        this.getHotelAPIUsersByUserInfoResult = value;
    }

}
