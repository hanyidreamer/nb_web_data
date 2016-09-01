
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
 *         &lt;element name="GetPriceChangeDataResult" type="{http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.Domain.Hotel.Message}PriceInfoChangeDataResponse" minOccurs="0"/&gt;
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
    "getPriceChangeDataResult"
})
@XmlRootElement(name = "GetPriceChangeDataResponse")
public class GetPriceChangeDataResponse {

    @XmlElement(name = "GetPriceChangeDataResult", nillable = true)
    protected PriceInfoChangeDataResponse getPriceChangeDataResult;

    /**
     * 获取getPriceChangeDataResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PriceInfoChangeDataResponse }
     *     
     */
    public PriceInfoChangeDataResponse getGetPriceChangeDataResult() {
        return getPriceChangeDataResult;
    }

    /**
     * 设置getPriceChangeDataResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PriceInfoChangeDataResponse }
     *     
     */
    public void setGetPriceChangeDataResult(PriceInfoChangeDataResponse value) {
        this.getPriceChangeDataResult = value;
    }

}
