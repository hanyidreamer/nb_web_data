
package com.elong.nb.agent.ProductForNBServiceContract;

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
 *         &lt;element name="SetB2BSellChannelResult" type="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response}SetB2BSellChannelResponse" minOccurs="0"/&gt;
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
    "setB2BSellChannelResult"
})
@XmlRootElement(name = "SetB2BSellChannelResponse")
public class SetB2BSellChannelResponse {

    @XmlElement(name = "SetB2BSellChannelResult", nillable = true)
    protected SetB2BSellChannelResponse2 setB2BSellChannelResult;

    /**
     * 获取setB2BSellChannelResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SetB2BSellChannelResponse2 }
     *     
     */
    public SetB2BSellChannelResponse2 getSetB2BSellChannelResult() {
        return setB2BSellChannelResult;
    }

    /**
     * 设置setB2BSellChannelResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SetB2BSellChannelResponse2 }
     *     
     */
    public void setSetB2BSellChannelResult(SetB2BSellChannelResponse2 value) {
        this.setB2BSellChannelResult = value;
    }

}
