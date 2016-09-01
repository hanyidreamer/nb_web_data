
package com.elong.nb.agent.NorthBoundForAPIService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="getHotelInventoryStateByHotelIDResult" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
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
    "getHotelInventoryStateByHotelIDResult"
})
@XmlRootElement(name = "getHotelInventoryStateByHotelIDResponse")
public class GetHotelInventoryStateByHotelIDResponse {

    protected Integer getHotelInventoryStateByHotelIDResult;

    /**
     * 获取getHotelInventoryStateByHotelIDResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGetHotelInventoryStateByHotelIDResult() {
        return getHotelInventoryStateByHotelIDResult;
    }

    /**
     * 设置getHotelInventoryStateByHotelIDResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGetHotelInventoryStateByHotelIDResult(Integer value) {
        this.getHotelInventoryStateByHotelIDResult = value;
    }

}
