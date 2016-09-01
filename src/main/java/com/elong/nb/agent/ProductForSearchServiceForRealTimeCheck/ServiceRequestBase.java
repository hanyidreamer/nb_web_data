
package com.elong.nb.agent.ProductForSearchServiceForRealTimeCheck;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ServiceRequestBase complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ServiceRequestBase"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ClientSystem" type="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Framework}ClientServerInfo" minOccurs="0"/&gt;
 *         &lt;element name="Operator" type="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Framework}ClientOperatorInfo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceRequestBase", namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Framework", propOrder = {
    "clientSystem",
    "operator"
})
@XmlSeeAlso({
    GetHotelOrderCreationVerifyModeRequest.class
})
public class ServiceRequestBase {

    @XmlElement(name = "ClientSystem", nillable = true)
    protected ClientServerInfo clientSystem;
    @XmlElement(name = "Operator", nillable = true)
    protected ClientOperatorInfo operator;

    /**
     * 获取clientSystem属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ClientServerInfo }
     *     
     */
    public ClientServerInfo getClientSystem() {
        return clientSystem;
    }

    /**
     * 设置clientSystem属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ClientServerInfo }
     *     
     */
    public void setClientSystem(ClientServerInfo value) {
        this.clientSystem = value;
    }

    /**
     * 获取operator属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ClientOperatorInfo }
     *     
     */
    public ClientOperatorInfo getOperator() {
        return operator;
    }

    /**
     * 设置operator属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ClientOperatorInfo }
     *     
     */
    public void setOperator(ClientOperatorInfo value) {
        this.operator = value;
    }

}
