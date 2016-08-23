
package com.elong.nb.agent.ProductForPartnerServiceContract;

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
 *         &lt;element name="EditInvStatus4DCResult" type="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response.Product4Partners}EditInvStatus4DCResponse" minOccurs="0"/&gt;
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
    "editInvStatus4DCResult"
})
@XmlRootElement(name = "EditInvStatus4DCResponse")
public class EditInvStatus4DCResponse2 {

    @XmlElement(name = "EditInvStatus4DCResult", nillable = true)
    protected EditInvStatus4DCResponse editInvStatus4DCResult;

    /**
     * 获取editInvStatus4DCResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link EditInvStatus4DCResponse }
     *     
     */
    public EditInvStatus4DCResponse getEditInvStatus4DCResult() {
        return editInvStatus4DCResult;
    }

    /**
     * 设置editInvStatus4DCResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link EditInvStatus4DCResponse }
     *     
     */
    public void setEditInvStatus4DCResult(EditInvStatus4DCResponse value) {
        this.editInvStatus4DCResult = value;
    }

}
