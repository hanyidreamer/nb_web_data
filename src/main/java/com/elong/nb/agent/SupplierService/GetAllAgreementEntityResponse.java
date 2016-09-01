
package com.elong.nb.agent.SupplierService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>GetAllAgreementEntityResponse complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="GetAllAgreementEntityResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Framework}ServiceResponseBase">
 *       &lt;sequence>
 *         &lt;element name="entityList" type="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model}ArrayOfAgreementEntityInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetAllAgreementEntityResponse", namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response", propOrder = {
    "entityList"
})
public class GetAllAgreementEntityResponse
    extends ServiceResponseBase
{

    @XmlElement(nillable = true)
    protected ArrayOfAgreementEntityInfo entityList;

    /**
     * 获取entityList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAgreementEntityInfo }
     *     
     */
    public ArrayOfAgreementEntityInfo getEntityList() {
        return entityList;
    }

    /**
     * 设置entityList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAgreementEntityInfo }
     *     
     */
    public void setEntityList(ArrayOfAgreementEntityInfo value) {
        this.entityList = value;
    }

}
