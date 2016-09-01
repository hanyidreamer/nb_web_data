
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
 *         &lt;element name="GetNewHotelIdsResult" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/&gt;
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
    "getNewHotelIdsResult"
})
@XmlRootElement(name = "GetNewHotelIdsResponse")
public class GetNewHotelIdsResponse {

    @XmlElement(name = "GetNewHotelIdsResult", nillable = true)
    protected ArrayOfstring getNewHotelIdsResult;

    /**
     * 获取getNewHotelIdsResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfstring }
     *     
     */
    public ArrayOfstring getGetNewHotelIdsResult() {
        return getNewHotelIdsResult;
    }

    /**
     * 设置getNewHotelIdsResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfstring }
     *     
     */
    public void setGetNewHotelIdsResult(ArrayOfstring value) {
        this.getNewHotelIdsResult = value;
    }

}
