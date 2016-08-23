
package com.elong.nb.agent.ProductForPartnerServiceContract;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>FreeSaleResponse complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="FreeSaleResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Framework}ServiceResponseBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FreeSaleList" type="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model.Inventory}ArrayOfFreeSaleInfo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FreeSaleResponse", namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response.Inventory", propOrder = {
    "freeSaleList"
})
public class FreeSaleResponse
    extends ServiceResponseBase
{

    @XmlElement(name = "FreeSaleList", nillable = true)
    protected ArrayOfFreeSaleInfo freeSaleList;

    /**
     * 获取freeSaleList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFreeSaleInfo }
     *     
     */
    public ArrayOfFreeSaleInfo getFreeSaleList() {
        return freeSaleList;
    }

    /**
     * 设置freeSaleList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFreeSaleInfo }
     *     
     */
    public void setFreeSaleList(ArrayOfFreeSaleInfo value) {
        this.freeSaleList = value;
    }

}
