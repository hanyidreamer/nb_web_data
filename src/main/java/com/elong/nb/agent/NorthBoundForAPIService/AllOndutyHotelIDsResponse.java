
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
 *         &lt;element name="AllOndutyHotelIDsResult" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/&gt;
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
    "allOndutyHotelIDsResult"
})
@XmlRootElement(name = "AllOndutyHotelIDsResponse")
public class AllOndutyHotelIDsResponse {

    @XmlElement(name = "AllOndutyHotelIDsResult", nillable = true)
    protected ArrayOfstring allOndutyHotelIDsResult;

    /**
     * 获取allOndutyHotelIDsResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfstring }
     *     
     */
    public ArrayOfstring getAllOndutyHotelIDsResult() {
        return allOndutyHotelIDsResult;
    }

    /**
     * 设置allOndutyHotelIDsResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfstring }
     *     
     */
    public void setAllOndutyHotelIDsResult(ArrayOfstring value) {
        this.allOndutyHotelIDsResult = value;
    }

}
