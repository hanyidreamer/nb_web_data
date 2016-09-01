
package com.elong.nb.agent.NorthBoundForAPIService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>GetMSRelationRequest complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="GetMSRelationRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.Domain.Hotel}Request"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MHotelID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SHotelID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetMSRelationRequest", namespace = "http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.Domain.Hotel.Message", propOrder = {
    "mHotelID",
    "sHotelID"
})
public class GetMSRelationRequest
    extends Request
{

    @XmlElement(name = "MHotelID", nillable = true)
    protected String mHotelID;
    @XmlElement(name = "SHotelID", nillable = true)
    protected String sHotelID;

    /**
     * 获取mHotelID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMHotelID() {
        return mHotelID;
    }

    /**
     * 设置mHotelID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMHotelID(String value) {
        this.mHotelID = value;
    }

    /**
     * 获取sHotelID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSHotelID() {
        return sHotelID;
    }

    /**
     * 设置sHotelID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSHotelID(String value) {
        this.sHotelID = value;
    }

}
