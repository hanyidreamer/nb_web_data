
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
 *         &lt;element name="ReserNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReserType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "reserNo",
    "reserType"
})
@XmlRootElement(name = "GetRelatedReserve")
public class GetRelatedReserve {

    @XmlElement(name = "ReserNo", nillable = true)
    protected String reserNo;
    @XmlElement(name = "ReserType", nillable = true)
    protected String reserType;

    /**
     * 获取reserNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReserNo() {
        return reserNo;
    }

    /**
     * 设置reserNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReserNo(String value) {
        this.reserNo = value;
    }

    /**
     * 获取reserType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReserType() {
        return reserType;
    }

    /**
     * 设置reserType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReserType(String value) {
        this.reserType = value;
    }

}
