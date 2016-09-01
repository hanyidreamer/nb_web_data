
package com.elong.nb.agent.ProductForSearchServiceForRealTimeCheck;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.joda.time.DateTime;


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="invAndInstantConfirmList" type="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model.Inventory}ArrayOfResourceInvAndInstantConfirmState" minOccurs="0"/&gt;
 *         &lt;element name="hotelId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="roomTypeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="beginDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "invAndInstantConfirmList",
    "hotelId",
    "roomTypeId",
    "beginDate",
    "endDate"
})
@XmlRootElement(name = "CheckInstantConfirm4NB")
public class CheckInstantConfirm4NB {

    @XmlElement(nillable = true)
    protected ArrayOfResourceInvAndInstantConfirmState invAndInstantConfirmList;
    @XmlElement(nillable = true)
    protected String hotelId;
    @XmlElement(nillable = true)
    protected String roomTypeId;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected DateTime beginDate;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected DateTime endDate;

    /**
     * 获取invAndInstantConfirmList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfResourceInvAndInstantConfirmState }
     *     
     */
    public ArrayOfResourceInvAndInstantConfirmState getInvAndInstantConfirmList() {
        return invAndInstantConfirmList;
    }

    /**
     * 设置invAndInstantConfirmList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfResourceInvAndInstantConfirmState }
     *     
     */
    public void setInvAndInstantConfirmList(ArrayOfResourceInvAndInstantConfirmState value) {
        this.invAndInstantConfirmList = value;
    }

    /**
     * 获取hotelId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHotelId() {
        return hotelId;
    }

    /**
     * 设置hotelId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHotelId(String value) {
        this.hotelId = value;
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
     * 获取beginDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public DateTime getBeginDate() {
        return beginDate;
    }

    /**
     * 设置beginDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeginDate(DateTime value) {
        this.beginDate = value;
    }

    /**
     * 获取endDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public DateTime getEndDate() {
        return endDate;
    }

    /**
     * 设置endDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndDate(DateTime value) {
        this.endDate = value;
    }

}
