
package com.elong.nb.agent.ProductForSearchServiceForRealTimeCheck;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>PrepayCancelNeedOneTimeRule complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="PrepayCancelNeedOneTimeRule"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Hour" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Hour2" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PrepayCancelNeedOneTimeRule", namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model", propOrder = {
    "hour",
    "hour2"
})
public class PrepayCancelNeedOneTimeRule {

    @XmlElement(name = "Hour")
    protected Integer hour;
    @XmlElement(name = "Hour2")
    protected Integer hour2;

    /**
     * 获取hour属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHour() {
        return hour;
    }

    /**
     * 设置hour属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHour(Integer value) {
        this.hour = value;
    }

    /**
     * 获取hour2属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHour2() {
        return hour2;
    }

    /**
     * 设置hour2属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHour2(Integer value) {
        this.hour2 = value;
    }

}
