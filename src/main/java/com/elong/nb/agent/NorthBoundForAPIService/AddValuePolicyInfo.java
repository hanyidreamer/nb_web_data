
package com.elong.nb.agent.NorthBoundForAPIService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.joda.time.DateTime;


/**
 * <p>AddValuePolicyInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="AddValuePolicyInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AddValueID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="CNDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DateType" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="ENGDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="IsAdd" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="IsCustomerVisible" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="IsInclude" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="IsWeekEffective" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfchar" minOccurs="0"/&gt;
 *         &lt;element name="Memo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PolicyID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="PolicyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PolicyNameEn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Price" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="PriceDefaultOption" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RatePlanID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Share" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="SinglePrice" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="SinglePriceDefaultOption" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="SubPolicy" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="operInfo" type="{http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.DataAccess.Hotel}OperateTimeInfo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddValuePolicyInfo", namespace = "http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.Domain.Hotel.HotelProductUseBusiness", propOrder = {
    "addValueID",
    "cnDescription",
    "currencyCode",
    "dateType",
    "engDescription",
    "endDate",
    "isAdd",
    "isCustomerVisible",
    "isInclude",
    "isWeekEffective",
    "memo",
    "policyID",
    "policyName",
    "policyNameEn",
    "price",
    "priceDefaultOption",
    "ratePlanID",
    "share",
    "singlePrice",
    "singlePriceDefaultOption",
    "startDate",
    "status",
    "subPolicy",
    "operInfo"
})
public class AddValuePolicyInfo {

    @XmlElement(name = "AddValueID")
    protected Integer addValueID;
    @XmlElement(name = "CNDescription", nillable = true)
    protected String cnDescription;
    @XmlElement(name = "CurrencyCode", nillable = true)
    protected String currencyCode;
    @XmlElement(name = "DateType", nillable = true)
    protected Short dateType;
    @XmlElement(name = "ENGDescription", nillable = true)
    protected String engDescription;
    @XmlElement(name = "EndDate", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected DateTime endDate;
    @XmlElement(name = "IsAdd")
    protected Integer isAdd;
    @XmlElement(name = "IsCustomerVisible", nillable = true)
    protected Short isCustomerVisible;
    @XmlElement(name = "IsInclude")
    protected Integer isInclude;
    @XmlElement(name = "IsWeekEffective", nillable = true)
    protected ArrayOfchar isWeekEffective;
    @XmlElement(name = "Memo", nillable = true)
    protected String memo;
    @XmlElement(name = "PolicyID")
    protected Integer policyID;
    @XmlElement(name = "PolicyName", nillable = true)
    protected String policyName;
    @XmlElement(name = "PolicyNameEn", nillable = true)
    protected String policyNameEn;
    @XmlElement(name = "Price")
    protected Double price;
    @XmlElement(name = "PriceDefaultOption")
    protected Integer priceDefaultOption;
    @XmlElement(name = "RatePlanID")
    protected Integer ratePlanID;
    @XmlElement(name = "Share")
    protected Integer share;
    @XmlElement(name = "SinglePrice")
    protected Double singlePrice;
    @XmlElement(name = "SinglePriceDefaultOption")
    protected Integer singlePriceDefaultOption;
    @XmlElement(name = "StartDate", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected DateTime startDate;
    @XmlElement(name = "Status")
    protected Integer status;
    @XmlElement(name = "SubPolicy")
    protected Short subPolicy;
    @XmlElement(nillable = true)
    protected OperateTimeInfo operInfo;

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
     * 获取cnDescription属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCNDescription() {
        return cnDescription;
    }

    /**
     * 设置cnDescription属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCNDescription(String value) {
        this.cnDescription = value;
    }

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
     * 获取dateType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getDateType() {
        return dateType;
    }

    /**
     * 设置dateType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setDateType(Short value) {
        this.dateType = value;
    }

    /**
     * 获取engDescription属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getENGDescription() {
        return engDescription;
    }

    /**
     * 设置engDescription属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setENGDescription(String value) {
        this.engDescription = value;
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

    /**
     * 获取isAdd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIsAdd() {
        return isAdd;
    }

    /**
     * 设置isAdd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIsAdd(Integer value) {
        this.isAdd = value;
    }

    /**
     * 获取isCustomerVisible属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getIsCustomerVisible() {
        return isCustomerVisible;
    }

    /**
     * 设置isCustomerVisible属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setIsCustomerVisible(Short value) {
        this.isCustomerVisible = value;
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
     * 获取isWeekEffective属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfchar }
     *     
     */
    public ArrayOfchar getIsWeekEffective() {
        return isWeekEffective;
    }

    /**
     * 设置isWeekEffective属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfchar }
     *     
     */
    public void setIsWeekEffective(ArrayOfchar value) {
        this.isWeekEffective = value;
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
     * 获取policyID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPolicyID() {
        return policyID;
    }

    /**
     * 设置policyID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPolicyID(Integer value) {
        this.policyID = value;
    }

    /**
     * 获取policyName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolicyName() {
        return policyName;
    }

    /**
     * 设置policyName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolicyName(String value) {
        this.policyName = value;
    }

    /**
     * 获取policyNameEn属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolicyNameEn() {
        return policyNameEn;
    }

    /**
     * 设置policyNameEn属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolicyNameEn(String value) {
        this.policyNameEn = value;
    }

    /**
     * 获取price属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPrice() {
        return price;
    }

    /**
     * 设置price属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPrice(Double value) {
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
     * 获取ratePlanID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRatePlanID() {
        return ratePlanID;
    }

    /**
     * 设置ratePlanID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRatePlanID(Integer value) {
        this.ratePlanID = value;
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
     *     {@link Double }
     *     
     */
    public Double getSinglePrice() {
        return singlePrice;
    }

    /**
     * 设置singlePrice属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSinglePrice(Double value) {
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

    /**
     * 获取startDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public DateTime getStartDate() {
        return startDate;
    }

    /**
     * 设置startDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartDate(DateTime value) {
        this.startDate = value;
    }

    /**
     * 获取status属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置status属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStatus(Integer value) {
        this.status = value;
    }

    /**
     * 获取subPolicy属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getSubPolicy() {
        return subPolicy;
    }

    /**
     * 设置subPolicy属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setSubPolicy(Short value) {
        this.subPolicy = value;
    }

    /**
     * 获取operInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link OperateTimeInfo }
     *     
     */
    public OperateTimeInfo getOperInfo() {
        return operInfo;
    }

    /**
     * 设置operInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link OperateTimeInfo }
     *     
     */
    public void setOperInfo(OperateTimeInfo value) {
        this.operInfo = value;
    }

}
