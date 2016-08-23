
package com.elong.nb.agent.ProductForPartnerServiceContract;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>GetBedInfoToOtherSysResponse complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="GetBedInfoToOtherSysResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Framework}ServiceResponseBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BedList" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfKeyValueOfstringBedInfoForDayw_SkfccAu" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetBedInfoToOtherSysResponse", namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response.Product4Partners", propOrder = {
    "bedList"
})
public class GetBedInfoToOtherSysResponse
    extends ServiceResponseBase
{

    @XmlElement(name = "BedList", nillable = true)
    protected ArrayOfKeyValueOfstringBedInfoForDaywSkfccAu bedList;

    /**
     * 获取bedList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfKeyValueOfstringBedInfoForDaywSkfccAu }
     *     
     */
    public ArrayOfKeyValueOfstringBedInfoForDaywSkfccAu getBedList() {
        return bedList;
    }

    /**
     * 设置bedList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfKeyValueOfstringBedInfoForDaywSkfccAu }
     *     
     */
    public void setBedList(ArrayOfKeyValueOfstringBedInfoForDaywSkfccAu value) {
        this.bedList = value;
    }

}
