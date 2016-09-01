
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
 *         &lt;element name="GetReserveChangeDataResult" type="{http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.Domain.Hotel.Message}ReserveChangeDataResponse" minOccurs="0"/&gt;
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
    "getReserveChangeDataResult"
})
@XmlRootElement(name = "GetReserveChangeDataResponse")
public class GetReserveChangeDataResponse {

    @XmlElement(name = "GetReserveChangeDataResult", nillable = true)
    protected ReserveChangeDataResponse getReserveChangeDataResult;

    /**
     * 获取getReserveChangeDataResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ReserveChangeDataResponse }
     *     
     */
    public ReserveChangeDataResponse getGetReserveChangeDataResult() {
        return getReserveChangeDataResult;
    }

    /**
     * 设置getReserveChangeDataResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ReserveChangeDataResponse }
     *     
     */
    public void setGetReserveChangeDataResult(ReserveChangeDataResponse value) {
        this.getReserveChangeDataResult = value;
    }

}
