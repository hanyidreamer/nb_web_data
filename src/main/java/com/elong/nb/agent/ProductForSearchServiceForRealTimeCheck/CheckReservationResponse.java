
package com.elong.nb.agent.ProductForSearchServiceForRealTimeCheck;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>CheckReservationResponse complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="CheckReservationResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Framework}ServiceResponseBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CheckDetails" type="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model}ArrayOfCheckDetail" minOccurs="0"/&gt;
 *         &lt;element name="CheckResult" type="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Enums}InventoryAndPriceCheckResult" minOccurs="0"/&gt;
 *         &lt;element name="IsImmediate" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="OTAType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RatePlanInfo" type="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model}ReservationRatePlan" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CheckReservationResponse", namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response", propOrder = {
    "checkDetails",
    "checkResult",
    "isImmediate",
    "otaType",
    "ratePlanInfo"
})
public class CheckReservationResponse
    extends ServiceResponseBase
{

    @XmlElement(name = "CheckDetails", nillable = true)
    protected ArrayOfCheckDetail checkDetails;
    @XmlElement(name = "CheckResult")
    @XmlSchemaType(name = "string")
    protected InventoryAndPriceCheckResult checkResult;
    @XmlElement(name = "IsImmediate")
    protected Integer isImmediate;
    @XmlElement(name = "OTAType")
    protected Integer otaType;
    @XmlElement(name = "RatePlanInfo", nillable = true)
    protected ReservationRatePlan ratePlanInfo;

    /**
     * 获取checkDetails属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCheckDetail }
     *     
     */
    public ArrayOfCheckDetail getCheckDetails() {
        return checkDetails;
    }

    /**
     * 设置checkDetails属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCheckDetail }
     *     
     */
    public void setCheckDetails(ArrayOfCheckDetail value) {
        this.checkDetails = value;
    }

    /**
     * 获取checkResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link InventoryAndPriceCheckResult }
     *     
     */
    public InventoryAndPriceCheckResult getCheckResult() {
        return checkResult;
    }

    /**
     * 设置checkResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link InventoryAndPriceCheckResult }
     *     
     */
    public void setCheckResult(InventoryAndPriceCheckResult value) {
        this.checkResult = value;
    }

    /**
     * 获取isImmediate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIsImmediate() {
        return isImmediate;
    }

    /**
     * 设置isImmediate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIsImmediate(Integer value) {
        this.isImmediate = value;
    }

    /**
     * 获取otaType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOTAType() {
        return otaType;
    }

    /**
     * 设置otaType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOTAType(Integer value) {
        this.otaType = value;
    }

    /**
     * 获取ratePlanInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ReservationRatePlan }
     *     
     */
    public ReservationRatePlan getRatePlanInfo() {
        return ratePlanInfo;
    }

    /**
     * 设置ratePlanInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ReservationRatePlan }
     *     
     */
    public void setRatePlanInfo(ReservationRatePlan value) {
        this.ratePlanInfo = value;
    }

}
