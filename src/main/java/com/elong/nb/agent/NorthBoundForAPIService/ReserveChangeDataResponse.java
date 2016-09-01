
package com.elong.nb.agent.NorthBoundForAPIService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ReserveChangeDataResponse complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ReserveChangeDataResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.Domain.Hotel}Response"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Records" type="{http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.DataAccess.Hotel}ArrayOfReservationChangeRecord" minOccurs="0"/&gt;
 *         &lt;element name="SumCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReserveChangeDataResponse", namespace = "http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.Domain.Hotel.Message", propOrder = {
    "records",
    "sumCount"
})
public class ReserveChangeDataResponse
    extends Response
{

    @XmlElement(name = "Records", nillable = true)
    protected ArrayOfReservationChangeRecord records;
    @XmlElement(name = "SumCount")
    protected Integer sumCount;

    /**
     * 获取records属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfReservationChangeRecord }
     *     
     */
    public ArrayOfReservationChangeRecord getRecords() {
        return records;
    }

    /**
     * 设置records属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfReservationChangeRecord }
     *     
     */
    public void setRecords(ArrayOfReservationChangeRecord value) {
        this.records = value;
    }

    /**
     * 获取sumCount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSumCount() {
        return sumCount;
    }

    /**
     * 设置sumCount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSumCount(Integer value) {
        this.sumCount = value;
    }

}
