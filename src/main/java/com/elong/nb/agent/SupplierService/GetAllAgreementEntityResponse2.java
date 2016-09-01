
package com.elong.nb.agent.SupplierService;

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
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GetAllAgreementEntityResult" type="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response}GetAllAgreementEntityResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getAllAgreementEntityResult"
})
@XmlRootElement(name = "GetAllAgreementEntityResponse")
public class GetAllAgreementEntityResponse2 {

    @XmlElement(name = "GetAllAgreementEntityResult", nillable = true)
    protected GetAllAgreementEntityResponse getAllAgreementEntityResult;

    /**
     * 获取getAllAgreementEntityResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link GetAllAgreementEntityResponse }
     *     
     */
    public GetAllAgreementEntityResponse getGetAllAgreementEntityResult() {
        return getAllAgreementEntityResult;
    }

    /**
     * 设置getAllAgreementEntityResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link GetAllAgreementEntityResponse }
     *     
     */
    public void setGetAllAgreementEntityResult(GetAllAgreementEntityResponse value) {
        this.getAllAgreementEntityResult = value;
    }

}
