
package com.elong.nb.agent.SupplierService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>GetAllBankDicInfoResponse complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="GetAllBankDicInfoResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Framework}ServiceResponseBase">
 *       &lt;sequence>
 *         &lt;element name="DicList" type="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model}ArrayOfBankDicInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetAllBankDicInfoResponse", namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response", propOrder = {
    "dicList"
})
public class GetAllBankDicInfoResponse
    extends ServiceResponseBase
{

    @XmlElement(name = "DicList", nillable = true)
    protected ArrayOfBankDicInfo dicList;

    /**
     * 获取dicList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBankDicInfo }
     *     
     */
    public ArrayOfBankDicInfo getDicList() {
        return dicList;
    }

    /**
     * 设置dicList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBankDicInfo }
     *     
     */
    public void setDicList(ArrayOfBankDicInfo value) {
        this.dicList = value;
    }

}
