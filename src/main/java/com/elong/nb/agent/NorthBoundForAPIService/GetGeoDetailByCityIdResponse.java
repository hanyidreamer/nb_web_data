
package com.elong.nb.agent.NorthBoundForAPIService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GetGeoDetailByCityIdResult" type="{http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.DataAccess.Hotel}ArrayOfGeoDetail_Info" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getGeoDetailByCityIdResult"
})
@XmlRootElement(name = "GetGeoDetailByCityIdResponse")
public class GetGeoDetailByCityIdResponse {

    @XmlElement(name = "GetGeoDetailByCityIdResult", nillable = true)
    protected ArrayOfGeoDetailInfo getGeoDetailByCityIdResult;

    /**
     * 获取getGeoDetailByCityIdResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfGeoDetailInfo }
     *     
     */
    public ArrayOfGeoDetailInfo getGetGeoDetailByCityIdResult() {
        return getGeoDetailByCityIdResult;
    }

    /**
     * 设置getGeoDetailByCityIdResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfGeoDetailInfo }
     *     
     */
    public void setGetGeoDetailByCityIdResult(ArrayOfGeoDetailInfo value) {
        this.getGeoDetailByCityIdResult = value;
    }

}
