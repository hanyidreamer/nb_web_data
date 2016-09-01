
package com.elong.nb.agent.NorthBoundForAPIService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>CheckHotelProductStatusRequest complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="CheckHotelProductStatusRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.Domain.Hotel}Request"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CheckTargetType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RatePlanId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RoomTypeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SHotelId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CheckHotelProductStatusRequest", namespace = "http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.Domain.Hotel.Message.ProductUse", propOrder = {
    "checkTargetType",
    "ratePlanId",
    "roomTypeId",
    "sHotelId"
})
public class CheckHotelProductStatusRequest
    extends Request
{

    @XmlElement(name = "CheckTargetType")
    protected Integer checkTargetType;
    @XmlElement(name = "RatePlanId")
    protected Integer ratePlanId;
    @XmlElement(name = "RoomTypeId", nillable = true)
    protected String roomTypeId;
    @XmlElement(name = "SHotelId", nillable = true)
    protected String sHotelId;

    /**
     * 获取checkTargetType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCheckTargetType() {
        return checkTargetType;
    }

    /**
     * 设置checkTargetType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCheckTargetType(Integer value) {
        this.checkTargetType = value;
    }

    /**
     * 获取ratePlanId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRatePlanId() {
        return ratePlanId;
    }

    /**
     * 设置ratePlanId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRatePlanId(Integer value) {
        this.ratePlanId = value;
    }

    /**
     * 获取roomTypeId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomTypeId() {
        return roomTypeId;
    }

    /**
     * 设置roomTypeId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomTypeId(String value) {
        this.roomTypeId = value;
    }

    /**
     * 获取sHotelId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSHotelId() {
        return sHotelId;
    }

    /**
     * 设置sHotelId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSHotelId(String value) {
        this.sHotelId = value;
    }

}
