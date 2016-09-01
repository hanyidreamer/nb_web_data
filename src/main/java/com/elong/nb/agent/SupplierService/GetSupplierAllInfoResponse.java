
package com.elong.nb.agent.SupplierService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>GetSupplierAllInfoResponse complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="GetSupplierAllInfoResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Framework}ServiceResponseBase">
 *       &lt;sequence>
 *         &lt;element name="HotelList" type="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model}ArrayOfHotelInfoDB" minOccurs="0"/>
 *         &lt;element name="SupplierInfo" type="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model}NewSupplierInfo" minOccurs="0"/>
 *         &lt;element name="TotalCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="supplierList" type="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model}ArrayOfNewSupplierInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetSupplierAllInfoResponse", namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response", propOrder = {
    "hotelList",
    "supplierInfo",
    "totalCount",
    "supplierList"
})
public class GetSupplierAllInfoResponse
    extends ServiceResponseBase
{

    @XmlElement(name = "HotelList", nillable = true)
    protected ArrayOfHotelInfoDB hotelList;
    @XmlElement(name = "SupplierInfo", nillable = true)
    protected NewSupplierInfo supplierInfo;
    @XmlElement(name = "TotalCount")
    protected Integer totalCount;
    @XmlElement(nillable = true)
    protected ArrayOfNewSupplierInfo supplierList;

    /**
     * 获取hotelList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfHotelInfoDB }
     *     
     */
    public ArrayOfHotelInfoDB getHotelList() {
        return hotelList;
    }

    /**
     * 设置hotelList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfHotelInfoDB }
     *     
     */
    public void setHotelList(ArrayOfHotelInfoDB value) {
        this.hotelList = value;
    }

    /**
     * 获取supplierInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link NewSupplierInfo }
     *     
     */
    public NewSupplierInfo getSupplierInfo() {
        return supplierInfo;
    }

    /**
     * 设置supplierInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link NewSupplierInfo }
     *     
     */
    public void setSupplierInfo(NewSupplierInfo value) {
        this.supplierInfo = value;
    }

    /**
     * 获取totalCount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    /**
     * 设置totalCount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalCount(Integer value) {
        this.totalCount = value;
    }

    /**
     * 获取supplierList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfNewSupplierInfo }
     *     
     */
    public ArrayOfNewSupplierInfo getSupplierList() {
        return supplierList;
    }

    /**
     * 设置supplierList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfNewSupplierInfo }
     *     
     */
    public void setSupplierList(ArrayOfNewSupplierInfo value) {
        this.supplierList = value;
    }

}
