
package com.elong.nb.agent.ProductForSearchServiceForRealTimeCheck;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>GetHotelOnlineSearchTypeResponse complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="GetHotelOnlineSearchTypeResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Framework}ServiceResponseBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ResultEntity" type="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model}HotelOnlineEntity" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetHotelOnlineSearchTypeResponse", namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response", propOrder = {
    "resultEntity"
})
public class GetHotelOnlineSearchTypeResponse
    extends ServiceResponseBase
{

    @XmlElement(name = "ResultEntity", nillable = true)
    protected HotelOnlineEntity resultEntity;

    /**
     * 获取resultEntity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link HotelOnlineEntity }
     *     
     */
    public HotelOnlineEntity getResultEntity() {
        return resultEntity;
    }

    /**
     * 设置resultEntity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link HotelOnlineEntity }
     *     
     */
    public void setResultEntity(HotelOnlineEntity value) {
        this.resultEntity = value;
    }

}
