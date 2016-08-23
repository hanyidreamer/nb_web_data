
package com.elong.nb.agent.ProductForPartnerServiceContract;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>GetResSupplyUseGroupHotel3Response complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="GetResSupplyUseGroupHotel3Response"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Framework}ServiceResponseBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="resultList" type="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model.Product4Partners}ArrayOfResourceInventoryDetail" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetResSupplyUseGroupHotel3Response", namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response.Inventory", propOrder = {
    "resultList"
})
public class GetResSupplyUseGroupHotel3Response
    extends ServiceResponseBase
{

    @XmlElement(nillable = true)
    protected ArrayOfResourceInventoryDetail resultList;

    /**
     * 获取resultList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfResourceInventoryDetail }
     *     
     */
    public ArrayOfResourceInventoryDetail getResultList() {
        return resultList;
    }

    /**
     * 设置resultList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfResourceInventoryDetail }
     *     
     */
    public void setResultList(ArrayOfResourceInventoryDetail value) {
        this.resultList = value;
    }

}
