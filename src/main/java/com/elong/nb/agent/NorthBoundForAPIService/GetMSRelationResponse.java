
package com.elong.nb.agent.NorthBoundForAPIService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>GetMSRelationResponse complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="GetMSRelationResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.Domain.Hotel}Response"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="relations" type="{http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.Domain.Hotel.HotelProductUseBusiness}ArrayOfM_SRelation" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetMSRelationResponse", namespace = "http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.Domain.Hotel.Message", propOrder = {
    "relations"
})
public class GetMSRelationResponse
    extends Response
{

    @XmlElement(nillable = true)
    protected ArrayOfMSRelation relations;

    /**
     * 获取relations属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMSRelation }
     *     
     */
    public ArrayOfMSRelation getRelations() {
        return relations;
    }

    /**
     * 设置relations属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMSRelation }
     *     
     */
    public void setRelations(ArrayOfMSRelation value) {
        this.relations = value;
    }

}
