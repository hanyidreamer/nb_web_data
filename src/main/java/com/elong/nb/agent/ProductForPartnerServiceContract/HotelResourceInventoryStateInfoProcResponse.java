
package com.elong.nb.agent.ProductForPartnerServiceContract;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>HotelResourceInventoryStateInfoProcResponse complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="HotelResourceInventoryStateInfoProcResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Framework}ServiceResponseBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ResultList" type="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model.HotelProduct}ArrayOfHotelResourceInventoryStateInfoProc" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HotelResourceInventoryStateInfoProcResponse", namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response.HotelProduct", propOrder = {
    "resultList"
})
public class HotelResourceInventoryStateInfoProcResponse
    extends ServiceResponseBase
{

    @XmlElement(name = "ResultList", nillable = true)
    protected ArrayOfHotelResourceInventoryStateInfoProc resultList;

    /**
     * 获取resultList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfHotelResourceInventoryStateInfoProc }
     *     
     */
    public ArrayOfHotelResourceInventoryStateInfoProc getResultList() {
        return resultList;
    }

    /**
     * 设置resultList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfHotelResourceInventoryStateInfoProc }
     *     
     */
    public void setResultList(ArrayOfHotelResourceInventoryStateInfoProc value) {
        this.resultList = value;
    }

}
