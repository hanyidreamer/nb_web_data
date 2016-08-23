
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
 *         &lt;element name="CreateShotelForPartnerResult" type="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response}CreateShotelForPartnerResponse" minOccurs="0"/&gt;
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
    "createShotelForPartnerResult"
})
@XmlRootElement(name = "CreateShotelForPartnerResponse")
public class CreateShotelForPartnerResponse2 {

    @XmlElement(name = "CreateShotelForPartnerResult", nillable = true)
    protected CreateShotelForPartnerResponse createShotelForPartnerResult;

    /**
     * 获取createShotelForPartnerResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CreateShotelForPartnerResponse }
     *     
     */
    public CreateShotelForPartnerResponse getCreateShotelForPartnerResult() {
        return createShotelForPartnerResult;
    }

    /**
     * 设置createShotelForPartnerResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CreateShotelForPartnerResponse }
     *     
     */
    public void setCreateShotelForPartnerResult(CreateShotelForPartnerResponse value) {
        this.createShotelForPartnerResult = value;
    }

}
