
package com.elong.nb.agent.HotelGiftService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ServiceResponseBase complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ServiceResponseBase">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Result" type="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Framework}ResponseResult" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceResponseBase", namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Framework", propOrder = {
    "result"
})
@XmlSeeAlso({
    SaveNewHotelGiftResponse.class,
    SaveHotelGiftResponse.class,
    GetTwoHotelGiftTypeResponse.class,
    GetNewHotelGiftDetailResponse.class,
    GetHotelGiftListResponse.class,
    GetAllHotelGiftTypeResponse.class,
    GetHotelGiftDetailResponse.class,
    GetGiftInfoPreviewResponse.class,
    UpdateHotelGiftTypeResponse.class,
    GetHotelGiftHisListResponse.class,
    GetGiftTypeCheckResponse.class
})
public class ServiceResponseBase {

    @XmlElement(name = "Result", nillable = true)
    protected ResponseResult result;

    /**
     * 获取result属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ResponseResult }
     *     
     */
    public ResponseResult getResult() {
        return result;
    }

    /**
     * 设置result属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseResult }
     *     
     */
    public void setResult(ResponseResult value) {
        this.result = value;
    }

}
