
package com.elong.nb.agent.HotelGiftService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>GetHotelGiftHisListResponse complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="GetHotelGiftHisListResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Framework}ServiceResponseBase">
 *       &lt;sequence>
 *         &lt;element name="HotelGiftHisList" type="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model}ArrayOfHotelGiftHisModel" minOccurs="0"/>
 *         &lt;element name="PageNum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TotalPage" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetHotelGiftHisListResponse", namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response.HotelGift", propOrder = {
    "hotelGiftHisList",
    "pageNum",
    "totalPage"
})
public class GetHotelGiftHisListResponse
    extends ServiceResponseBase
{

    @XmlElement(name = "HotelGiftHisList", nillable = true)
    protected ArrayOfHotelGiftHisModel hotelGiftHisList;
    @XmlElement(name = "PageNum")
    protected Integer pageNum;
    @XmlElement(name = "TotalPage")
    protected Integer totalPage;

    /**
     * 获取hotelGiftHisList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfHotelGiftHisModel }
     *     
     */
    public ArrayOfHotelGiftHisModel getHotelGiftHisList() {
        return hotelGiftHisList;
    }

    /**
     * 设置hotelGiftHisList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfHotelGiftHisModel }
     *     
     */
    public void setHotelGiftHisList(ArrayOfHotelGiftHisModel value) {
        this.hotelGiftHisList = value;
    }

    /**
     * 获取pageNum属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPageNum() {
        return pageNum;
    }

    /**
     * 设置pageNum属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPageNum(Integer value) {
        this.pageNum = value;
    }

    /**
     * 获取totalPage属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalPage() {
        return totalPage;
    }

    /**
     * 设置totalPage属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalPage(Integer value) {
        this.totalPage = value;
    }

}
