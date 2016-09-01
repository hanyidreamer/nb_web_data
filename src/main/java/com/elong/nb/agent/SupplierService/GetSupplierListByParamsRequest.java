
package com.elong.nb.agent.SupplierService;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>GetSupplierListByParamsRequest complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="GetSupplierListByParamsRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Request}ProductRequestBase">
 *       &lt;sequence>
 *         &lt;element name="BillType" type="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Enums}BillNoticeType" minOccurs="0"/>
 *         &lt;element name="CityID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InvoiceMode" type="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Enums}InvoiceMode" minOccurs="0"/>
 *         &lt;element name="PageIndex" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PageSize" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ProvinceID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SettlementType" type="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Enums}SettlementCycleEnum" minOccurs="0"/>
 *         &lt;element name="SupplierID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SupplierIDList" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfint" minOccurs="0"/>
 *         &lt;element name="SupplierName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetSupplierListByParamsRequest", namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Request", propOrder = {
    "billType",
    "cityID",
    "invoiceMode",
    "pageIndex",
    "pageSize",
    "provinceID",
    "settlementType",
    "supplierID",
    "supplierIDList",
    "supplierName"
})
public class GetSupplierListByParamsRequest
    extends ProductRequestBase
{

    @XmlList
    @XmlElement(name = "BillType")
    @XmlSchemaType(name = "anySimpleType")
    protected List<String> billType;
    @XmlElement(name = "CityID", nillable = true)
    protected String cityID;
    @XmlElement(name = "InvoiceMode")
    @XmlSchemaType(name = "string")
    protected InvoiceMode invoiceMode;
    @XmlElement(name = "PageIndex")
    protected Integer pageIndex;
    @XmlElement(name = "PageSize")
    protected Integer pageSize;
    @XmlElement(name = "ProvinceID", nillable = true)
    protected String provinceID;
    @XmlElement(name = "SettlementType")
    @XmlSchemaType(name = "string")
    protected SettlementCycleEnum settlementType;
    @XmlElement(name = "SupplierID", nillable = true)
    protected String supplierID;
    @XmlElement(name = "SupplierIDList", nillable = true)
    protected ArrayOfint supplierIDList;
    @XmlElement(name = "SupplierName", nillable = true)
    protected String supplierName;

    /**
     * Gets the value of the billType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the billType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBillType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getBillType() {
        if (billType == null) {
            billType = new ArrayList<String>();
        }
        return this.billType;
    }

    /**
     * 获取cityID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCityID() {
        return cityID;
    }

    /**
     * 设置cityID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCityID(String value) {
        this.cityID = value;
    }

    /**
     * 获取invoiceMode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link InvoiceMode }
     *     
     */
    public InvoiceMode getInvoiceMode() {
        return invoiceMode;
    }

    /**
     * 设置invoiceMode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceMode }
     *     
     */
    public void setInvoiceMode(InvoiceMode value) {
        this.invoiceMode = value;
    }

    /**
     * 获取pageIndex属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPageIndex() {
        return pageIndex;
    }

    /**
     * 设置pageIndex属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPageIndex(Integer value) {
        this.pageIndex = value;
    }

    /**
     * 获取pageSize属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * 设置pageSize属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPageSize(Integer value) {
        this.pageSize = value;
    }

    /**
     * 获取provinceID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvinceID() {
        return provinceID;
    }

    /**
     * 设置provinceID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvinceID(String value) {
        this.provinceID = value;
    }

    /**
     * 获取settlementType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SettlementCycleEnum }
     *     
     */
    public SettlementCycleEnum getSettlementType() {
        return settlementType;
    }

    /**
     * 设置settlementType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementCycleEnum }
     *     
     */
    public void setSettlementType(SettlementCycleEnum value) {
        this.settlementType = value;
    }

    /**
     * 获取supplierID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupplierID() {
        return supplierID;
    }

    /**
     * 设置supplierID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupplierID(String value) {
        this.supplierID = value;
    }

    /**
     * 获取supplierIDList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfint }
     *     
     */
    public ArrayOfint getSupplierIDList() {
        return supplierIDList;
    }

    /**
     * 设置supplierIDList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfint }
     *     
     */
    public void setSupplierIDList(ArrayOfint value) {
        this.supplierIDList = value;
    }

    /**
     * 获取supplierName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupplierName() {
        return supplierName;
    }

    /**
     * 设置supplierName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupplierName(String value) {
        this.supplierName = value;
    }

}
