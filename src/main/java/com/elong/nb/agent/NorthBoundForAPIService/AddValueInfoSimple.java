
package com.elong.nb.agent.NorthBoundForAPIService;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>AddValueInfoSimple complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="AddValueInfoSimple"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AddValueCNName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AddValueENGName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AddValueID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="BusinessCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IsAdd" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsForbidden" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="IsInclude" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Memo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Price" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="PriceDefaultOption" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Share" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="SinglePrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="SinglePriceDefaultOption" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddValueInfoSimple", namespace = "http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.DataAccess.Hotel", propOrder = {
    "addValueCNName",
    "addValueENGName",
    "addValueID",
    "businessCode",
    "isAdd",
    "isForbidden",
    "isInclude",
    "memo",
    "price",
    "priceDefaultOption",
    "share",
    "singlePrice",
    "singlePriceDefaultOption"
})
public class AddValueInfoSimple {

    @XmlElement(name = "AddValueCNName", nillable = true)
    protected String addValueCNName;
    @XmlElement(name = "AddValueENGName", nillable = true)
    protected String addValueENGName;
    @XmlElement(name = "AddValueID")
    protected Integer addValueID;
    @XmlElement(name = "BusinessCode", nillable = true)
    protected String businessCode;
    @XmlElement(name = "IsAdd")
    protected Boolean isAdd;
    @XmlElement(name = "IsForbidden")
    protected Integer isForbidden;
    @XmlElement(name = "IsInclude")
    protected Integer isInclude;
    @XmlElement(name = "Memo", nillable = true)
    protected String memo;
    @XmlElement(name = "Price")
    protected BigDecimal price;
    @XmlElement(name = "PriceDefaultOption")
    protected Integer priceDefaultOption;
    @XmlElement(name = "Share")
    protected Integer share;
    @XmlElement(name = "SinglePrice")
    protected BigDecimal singlePrice;
    @XmlElement(name = "SinglePriceDefaultOption")
    protected Integer singlePriceDefaultOption;

    /**
     * 获取addValueCNName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddValueCNName() {
        return addValueCNName;
    }

    /**
     * 设置addValueCNName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddValueCNName(String value) {
        this.addValueCNName = value;
    }

    /**
     * 获取addValueENGName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddValueENGName() {
        return addValueENGName;
    }

    /**
     * 设置addValueENGName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddValueENGName(String value) {
        this.addValueENGName = value;
    }

    /**
     * 获取addValueID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAddValueID() {
        return addValueID;
    }

    /**
     * 设置addValueID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAddValueID(Integer value) {
        this.addValueID = value;
    }

    /**
     * 获取businessCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessCode() {
        return businessCode;
    }

    /**
     * 设置businessCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessCode(String value) {
        this.businessCode = value;
    }

    /**
     * 获取isAdd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsAdd() {
        return isAdd;
    }

    /**
     * 设置isAdd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsAdd(Boolean value) {
        this.isAdd = value;
    }

    /**
     * 获取isForbidden属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIsForbidden() {
        return isForbidden;
    }

    /**
     * 设置isForbidden属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIsForbidden(Integer value) {
        this.isForbidden = value;
    }

    /**
     * 获取isInclude属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIsInclude() {
        return isInclude;
    }

    /**
     * 设置isInclude属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIsInclude(Integer value) {
        this.isInclude = value;
    }

    /**
     * 获取memo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemo() {
        return memo;
    }

    /**
     * 设置memo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMemo(String value) {
        this.memo = value;
    }

    /**
     * 获取price属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * 设置price属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPrice(BigDecimal value) {
        this.price = value;
    }

    /**
     * 获取priceDefaultOption属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPriceDefaultOption() {
        return priceDefaultOption;
    }

    /**
     * 设置priceDefaultOption属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPriceDefaultOption(Integer value) {
        this.priceDefaultOption = value;
    }

    /**
     * 获取share属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getShare() {
        return share;
    }

    /**
     * 设置share属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setShare(Integer value) {
        this.share = value;
    }

    /**
     * 获取singlePrice属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSinglePrice() {
        return singlePrice;
    }

    /**
     * 设置singlePrice属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSinglePrice(BigDecimal value) {
        this.singlePrice = value;
    }

    /**
     * 获取singlePriceDefaultOption属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSinglePriceDefaultOption() {
        return singlePriceDefaultOption;
    }

    /**
     * 设置singlePriceDefaultOption属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSinglePriceDefaultOption(Integer value) {
        this.singlePriceDefaultOption = value;
    }

}
