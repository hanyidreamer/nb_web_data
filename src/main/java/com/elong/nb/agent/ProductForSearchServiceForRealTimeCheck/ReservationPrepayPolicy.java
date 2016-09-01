
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
 * <p>ReservationPrepayPolicy complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ReservationPrepayPolicy"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BeginTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="ChangeType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="CutCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CutType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="CutValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="CutValueRMB" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="DateType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="EndTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="LastCancelTimeWithFees" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="LastCancelTimeWithoutFees" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="NeedOneTime" type="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model}PrepayCancelNeedOneTimeRule" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReservationPrepayPolicy", namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model", propOrder = {
    "beginTime",
    "changeType",
    "cutCurrency",
    "cutType",
    "cutValue",
    "cutValueRMB",
    "dateType",
    "endTime",
    "lastCancelTimeWithFees",
    "lastCancelTimeWithoutFees",
    "needOneTime"
})
public class ReservationPrepayPolicy {

    @XmlElement(name = "BeginTime", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected DateTime beginTime;
    @XmlElement(name = "ChangeType")
    protected Integer changeType;
    @XmlElement(name = "CutCurrency", nillable = true)
    protected String cutCurrency;
    @XmlElement(name = "CutType")
    protected Integer cutType;
    @XmlElement(name = "CutValue")
    protected BigDecimal cutValue;
    @XmlElement(name = "CutValueRMB")
    protected BigDecimal cutValueRMB;
    @XmlElement(name = "DateType")
    protected Integer dateType;
    @XmlElement(name = "EndTime", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected DateTime endTime;
    @XmlElement(name = "LastCancelTimeWithFees", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected DateTime lastCancelTimeWithFees;
    @XmlElement(name = "LastCancelTimeWithoutFees", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected DateTime lastCancelTimeWithoutFees;
    @XmlElement(name = "NeedOneTime", nillable = true)
    protected PrepayCancelNeedOneTimeRule needOneTime;

    /**
     * 获取beginTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public DateTime getBeginTime() {
        return beginTime;
    }

    /**
     * 设置beginTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeginTime(DateTime value) {
        this.beginTime = value;
    }

    /**
     * 获取changeType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getChangeType() {
        return changeType;
    }

    /**
     * 设置changeType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setChangeType(Integer value) {
        this.changeType = value;
    }

    /**
     * 获取cutCurrency属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCutCurrency() {
        return cutCurrency;
    }

    /**
     * 设置cutCurrency属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCutCurrency(String value) {
        this.cutCurrency = value;
    }

    /**
     * 获取cutType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCutType() {
        return cutType;
    }

    /**
     * 设置cutType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCutType(Integer value) {
        this.cutType = value;
    }

    /**
     * 获取cutValue属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCutValue() {
        return cutValue;
    }

    /**
     * 设置cutValue属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCutValue(BigDecimal value) {
        this.cutValue = value;
    }

    /**
     * 获取cutValueRMB属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCutValueRMB() {
        return cutValueRMB;
    }

    /**
     * 设置cutValueRMB属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCutValueRMB(BigDecimal value) {
        this.cutValueRMB = value;
    }

    /**
     * 获取dateType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDateType() {
        return dateType;
    }

    /**
     * 设置dateType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDateType(Integer value) {
        this.dateType = value;
    }

    /**
     * 获取endTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public DateTime getEndTime() {
        return endTime;
    }

    /**
     * 设置endTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndTime(DateTime value) {
        this.endTime = value;
    }

    /**
     * 获取lastCancelTimeWithFees属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public DateTime getLastCancelTimeWithFees() {
        return lastCancelTimeWithFees;
    }

    /**
     * 设置lastCancelTimeWithFees属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastCancelTimeWithFees(DateTime value) {
        this.lastCancelTimeWithFees = value;
    }

    /**
     * 获取lastCancelTimeWithoutFees属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public DateTime getLastCancelTimeWithoutFees() {
        return lastCancelTimeWithoutFees;
    }

    /**
     * 设置lastCancelTimeWithoutFees属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastCancelTimeWithoutFees(DateTime value) {
        this.lastCancelTimeWithoutFees = value;
    }

    /**
     * 获取needOneTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PrepayCancelNeedOneTimeRule }
     *     
     */
    public PrepayCancelNeedOneTimeRule getNeedOneTime() {
        return needOneTime;
    }

    /**
     * 设置needOneTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PrepayCancelNeedOneTimeRule }
     *     
     */
    public void setNeedOneTime(PrepayCancelNeedOneTimeRule value) {
        this.needOneTime = value;
    }

}
