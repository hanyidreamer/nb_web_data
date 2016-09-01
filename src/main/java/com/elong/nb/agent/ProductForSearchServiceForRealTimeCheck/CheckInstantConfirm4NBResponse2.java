
package com.elong.nb.agent.ProductForSearchServiceForRealTimeCheck;

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
 *         &lt;element name="CheckInstantConfirm4NBResult" type="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response}CheckInstantConfirm4NBResponse" minOccurs="0"/&gt;
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
    "checkInstantConfirm4NBResult"
})
@XmlRootElement(name = "CheckInstantConfirm4NBResponse")
public class CheckInstantConfirm4NBResponse2 {

    @XmlElement(name = "CheckInstantConfirm4NBResult", nillable = true)
    protected CheckInstantConfirm4NBResponse checkInstantConfirm4NBResult;

    /**
     * 获取checkInstantConfirm4NBResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CheckInstantConfirm4NBResponse }
     *     
     */
    public CheckInstantConfirm4NBResponse getCheckInstantConfirm4NBResult() {
        return checkInstantConfirm4NBResult;
    }

    /**
     * 设置checkInstantConfirm4NBResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CheckInstantConfirm4NBResponse }
     *     
     */
    public void setCheckInstantConfirm4NBResult(CheckInstantConfirm4NBResponse value) {
        this.checkInstantConfirm4NBResult = value;
    }

}
