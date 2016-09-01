
package com.elong.nb.agent.ProductForSearchServiceForRealTimeCheck;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.joda.time.DateTime;


/**
 * <p>CheckDetail complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="CheckDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="InventoryAvailable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="NewCostPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="NewPriceWithDrr" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="NewSalePrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="OldPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="PriceChange" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CheckDetail", namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model", propOrder = {
    "currencyCode",
    "date",
    "inventoryAvailable",
    "newCostPrice",
    "newPriceWithDrr",
    "newSalePrice",
    "oldPrice",
    "priceChange"
})
public class CheckDetail {

    @XmlElement(name = "CurrencyCode", nillable = true)
    protected String currencyCode;
    @XmlElement(name = "Date", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected DateTime date;
    @XmlElement(name = "InventoryAvailable")
    protected Boolean inventoryAvailable;
    @XmlElement(name = "NewCostPrice")
    protected BigDecimal newCostPrice;
    @XmlElement(name = "NewPriceWithDrr")
    protected BigDecimal newPriceWithDrr;
    @XmlElement(name = "NewSalePrice")
    protected BigDecimal newSalePrice;
    @XmlElement(name = "OldPrice")
    protected BigDecimal oldPrice;
    @XmlElement(name = "PriceChange")
    protected Boolean priceChange;

    /**
     * 获取currencyCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * 设置currencyCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyCode(String value) {
        this.currencyCode = value;
    }

    /**
     * 获取date属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public DateTime getDate() {
        return date;
    }

    /**
     * 设置date属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDate(DateTime value) {
        this.date = value;
    }

    /**
     * 获取inventoryAvailable属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInventoryAvailable() {
        return inventoryAvailable;
    }

    /**
     * 设置inventoryAvailable属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInventoryAvailable(Boolean value) {
        this.inventoryAvailable = value;
    }

    /**
     * 获取newCostPrice属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNewCostPrice() {
        return newCostPrice;
    }

    /**
     * 设置newCostPrice属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNewCostPrice(BigDecimal value) {
        this.newCostPrice = value;
    }

    /**
     * 获取newPriceWithDrr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNewPriceWithDrr() {
        return newPriceWithDrr;
    }

    /**
     * 设置newPriceWithDrr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNewPriceWithDrr(BigDecimal value) {
        this.newPriceWithDrr = value;
    }

    /**
     * 获取newSalePrice属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNewSalePrice() {
        return newSalePrice;
    }

    /**
     * 设置newSalePrice属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNewSalePrice(BigDecimal value) {
        this.newSalePrice = value;
    }

    /**
     * 获取oldPrice属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOldPrice() {
        return oldPrice;
    }

    /**
     * 设置oldPrice属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOldPrice(BigDecimal value) {
        this.oldPrice = value;
    }

    /**
     * 获取priceChange属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPriceChange() {
        return priceChange;
    }

    /**
     * 设置priceChange属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPriceChange(Boolean value) {
        this.priceChange = value;
    }

}
