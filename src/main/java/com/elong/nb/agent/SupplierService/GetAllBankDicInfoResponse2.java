
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
 *         &lt;element name="GetAllBankDicInfoResult" type="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response}GetAllBankDicInfoResponse" minOccurs="0"/>
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
    "getAllBankDicInfoResult"
})
@XmlRootElement(name = "GetAllBankDicInfoResponse")
public class GetAllBankDicInfoResponse2 {

    @XmlElement(name = "GetAllBankDicInfoResult", nillable = true)
    protected GetAllBankDicInfoResponse getAllBankDicInfoResult;

    /**
     * 获取getAllBankDicInfoResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link GetAllBankDicInfoResponse }
     *     
     */
    public GetAllBankDicInfoResponse getGetAllBankDicInfoResult() {
        return getAllBankDicInfoResult;
    }

    /**
     * 设置getAllBankDicInfoResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link GetAllBankDicInfoResponse }
     *     
     */
    public void setGetAllBankDicInfoResult(GetAllBankDicInfoResponse value) {
        this.getAllBankDicInfoResult = value;
    }

}
