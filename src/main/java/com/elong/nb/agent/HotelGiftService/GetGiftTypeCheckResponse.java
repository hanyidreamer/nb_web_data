
package com.elong.nb.agent.HotelGiftService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>GetGiftTypeCheckResponse complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="GetGiftTypeCheckResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Framework}ServiceResponseBase">
 *       &lt;sequence>
 *         &lt;element name="GiftTypeCheckDic" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfKeyValueOfstringArrayOfstringty7Ep6D1" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetGiftTypeCheckResponse", namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response.HotelGift", propOrder = {
    "giftTypeCheckDic"
})
public class GetGiftTypeCheckResponse
    extends ServiceResponseBase
{

    @XmlElement(name = "GiftTypeCheckDic", nillable = true)
    protected ArrayOfKeyValueOfstringArrayOfstringty7Ep6D1 giftTypeCheckDic;

    /**
     * 获取giftTypeCheckDic属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfKeyValueOfstringArrayOfstringty7Ep6D1 }
     *     
     */
    public ArrayOfKeyValueOfstringArrayOfstringty7Ep6D1 getGiftTypeCheckDic() {
        return giftTypeCheckDic;
    }

    /**
     * 设置giftTypeCheckDic属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfKeyValueOfstringArrayOfstringty7Ep6D1 }
     *     
     */
    public void setGiftTypeCheckDic(ArrayOfKeyValueOfstringArrayOfstringty7Ep6D1 value) {
        this.giftTypeCheckDic = value;
    }

}
