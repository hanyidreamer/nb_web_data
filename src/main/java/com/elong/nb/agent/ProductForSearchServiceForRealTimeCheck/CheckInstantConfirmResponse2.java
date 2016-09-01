
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
 *         &lt;element name="CheckInstantConfirmResult" type="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response}CheckInstantConfirmResponse" minOccurs="0"/&gt;
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
    "checkInstantConfirmResult"
})
@XmlRootElement(name = "CheckInstantConfirmResponse")
public class CheckInstantConfirmResponse2 {

    @XmlElement(name = "CheckInstantConfirmResult", nillable = true)
    protected CheckInstantConfirmResponse checkInstantConfirmResult;

    /**
     * 获取checkInstantConfirmResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CheckInstantConfirmResponse }
     *     
     */
    public CheckInstantConfirmResponse getCheckInstantConfirmResult() {
        return checkInstantConfirmResult;
    }

    /**
     * 设置checkInstantConfirmResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CheckInstantConfirmResponse }
     *     
     */
    public void setCheckInstantConfirmResult(CheckInstantConfirmResponse value) {
        this.checkInstantConfirmResult = value;
    }

}
