
package com.elong.nb.agent.ProductForPartnerServiceContract;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>GetEbookingRoomNumHisHotel3Response complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="GetEbookingRoomNumHisHotel3Response"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Framework}ServiceResponseBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="HisResultList" type="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model}ArrayOfGetEbookingRoomNumModel" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetEbookingRoomNumHisHotel3Response", namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response.Product4Partners", propOrder = {
    "hisResultList"
})
public class GetEbookingRoomNumHisHotel3Response
    extends ServiceResponseBase
{

    @XmlElement(name = "HisResultList", nillable = true)
    protected ArrayOfGetEbookingRoomNumModel hisResultList;

    /**
     * 获取hisResultList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfGetEbookingRoomNumModel }
     *     
     */
    public ArrayOfGetEbookingRoomNumModel getHisResultList() {
        return hisResultList;
    }

    /**
     * 设置hisResultList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfGetEbookingRoomNumModel }
     *     
     */
    public void setHisResultList(ArrayOfGetEbookingRoomNumModel value) {
        this.hisResultList = value;
    }

}
