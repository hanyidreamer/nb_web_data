
package com.elong.nb.agent.ProductForPartnerServiceContract;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>SaveBedInfoResponse complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SaveBedInfoResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Framework}ServiceResponseBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IsNeedAlert" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PageShowAlertInfoList" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SaveBedInfoResponse", namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response", propOrder = {
    "isNeedAlert",
    "pageShowAlertInfoList"
})
public class SaveBedInfoResponse
    extends ServiceResponseBase
{

    @XmlElement(name = "IsNeedAlert")
    protected Boolean isNeedAlert;
    @XmlElement(name = "PageShowAlertInfoList", nillable = true)
    protected ArrayOfstring pageShowAlertInfoList;

    /**
     * 获取isNeedAlert属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsNeedAlert() {
        return isNeedAlert;
    }

    /**
     * 设置isNeedAlert属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsNeedAlert(Boolean value) {
        this.isNeedAlert = value;
    }

    /**
     * 获取pageShowAlertInfoList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfstring }
     *     
     */
    public ArrayOfstring getPageShowAlertInfoList() {
        return pageShowAlertInfoList;
    }

    /**
     * 设置pageShowAlertInfoList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfstring }
     *     
     */
    public void setPageShowAlertInfoList(ArrayOfstring value) {
        this.pageShowAlertInfoList = value;
    }

}
