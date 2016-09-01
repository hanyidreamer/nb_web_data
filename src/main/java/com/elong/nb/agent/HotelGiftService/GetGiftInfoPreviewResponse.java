
package com.elong.nb.agent.HotelGiftService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>GetGiftInfoPreviewResponse complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="GetGiftInfoPreviewResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Framework}ServiceResponseBase">
 *       &lt;sequence>
 *         &lt;element name="PreviewString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetGiftInfoPreviewResponse", namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response.HotelGift", propOrder = {
    "previewString"
})
public class GetGiftInfoPreviewResponse
    extends ServiceResponseBase
{

    @XmlElement(name = "PreviewString", nillable = true)
    protected String previewString;

    /**
     * 获取previewString属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreviewString() {
        return previewString;
    }

    /**
     * 设置previewString属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreviewString(String value) {
        this.previewString = value;
    }

}
