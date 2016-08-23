
package com.elong.nb.agent.ProductForPartnerServiceContract;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>GetRoomTypeByShotelIdResponse complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="GetRoomTypeByShotelIdResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Framework}ServiceResponseBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="listRoomInfo" type="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model}ArrayOfMRoomInfo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetRoomTypeByShotelIdResponse", namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response", propOrder = {
    "listRoomInfo"
})
public class GetRoomTypeByShotelIdResponse
    extends ServiceResponseBase
{

    @XmlElement(nillable = true)
    protected ArrayOfMRoomInfo listRoomInfo;

    /**
     * 获取listRoomInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMRoomInfo }
     *     
     */
    public ArrayOfMRoomInfo getListRoomInfo() {
        return listRoomInfo;
    }

    /**
     * 设置listRoomInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMRoomInfo }
     *     
     */
    public void setListRoomInfo(ArrayOfMRoomInfo value) {
        this.listRoomInfo = value;
    }

}
