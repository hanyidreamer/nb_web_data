
package com.elong.nb.agent.NorthBoundForAPIService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Request complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="Request"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ClientSystemInfo" type="{http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.Domain.Hotel}ClientSystemInfo" minOccurs="0"/&gt;
 *         &lt;element name="OperateTimeInfo" type="{http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.DataAccess.Hotel}OperateTimeInfo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Request", namespace = "http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.Domain.Hotel", propOrder = {
    "clientSystemInfo",
    "operateTimeInfo"
})
@XmlSeeAlso({
    CheckHotelProductStatusRequest.class,
    RackRateChangeDataRequest.class,
    GetMSRelationRequest.class,
    InventoryChangeDataRequest.class,
    PriceInfoChangeDataRequest.class,
    ReserveChangeDataRequest.class
})
public class Request {

    @XmlElement(name = "ClientSystemInfo", nillable = true)
    protected ClientSystemInfo clientSystemInfo;
    @XmlElement(name = "OperateTimeInfo", nillable = true)
    protected OperateTimeInfo operateTimeInfo;

    /**
     * 获取clientSystemInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ClientSystemInfo }
     *     
     */
    public ClientSystemInfo getClientSystemInfo() {
        return clientSystemInfo;
    }

    /**
     * 设置clientSystemInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ClientSystemInfo }
     *     
     */
    public void setClientSystemInfo(ClientSystemInfo value) {
        this.clientSystemInfo = value;
    }

    /**
     * 获取operateTimeInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link OperateTimeInfo }
     *     
     */
    public OperateTimeInfo getOperateTimeInfo() {
        return operateTimeInfo;
    }

    /**
     * 设置operateTimeInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link OperateTimeInfo }
     *     
     */
    public void setOperateTimeInfo(OperateTimeInfo value) {
        this.operateTimeInfo = value;
    }

}
