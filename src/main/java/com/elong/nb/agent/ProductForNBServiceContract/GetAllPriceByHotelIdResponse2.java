
package com.elong.nb.agent.ProductForNBServiceContract;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>GetAllPriceByHotelIdResponse complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="GetAllPriceByHotelIdResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Framework}ServiceResponseBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PriceInfoList" type="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model}ArrayOfPriceInfoForPartner" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetAllPriceByHotelIdResponse", namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities", propOrder = {
    "priceInfoList"
})
public class GetAllPriceByHotelIdResponse2
    extends ServiceResponseBase
{

    @XmlElement(name = "PriceInfoList", nillable = true)
    protected ArrayOfPriceInfoForPartner priceInfoList;

    /**
     * 获取priceInfoList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPriceInfoForPartner }
     *     
     */
    public ArrayOfPriceInfoForPartner getPriceInfoList() {
        return priceInfoList;
    }

    /**
     * 设置priceInfoList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPriceInfoForPartner }
     *     
     */
    public void setPriceInfoList(ArrayOfPriceInfoForPartner value) {
        this.priceInfoList = value;
    }

}
