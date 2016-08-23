
package com.elong.nb.agent.ProductForPartnerServiceContract;

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
 *         &lt;element name="EditRoomAmount4PartnersResult" type="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response.Product4Partners}EditRoomAmount4PartnersResponse" minOccurs="0"/&gt;
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
    "editRoomAmount4PartnersResult"
})
@XmlRootElement(name = "EditRoomAmount4PartnersResponse")
public class EditRoomAmount4PartnersResponse2 {

    @XmlElement(name = "EditRoomAmount4PartnersResult", nillable = true)
    protected EditRoomAmount4PartnersResponse editRoomAmount4PartnersResult;

    /**
     * 获取editRoomAmount4PartnersResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link EditRoomAmount4PartnersResponse }
     *     
     */
    public EditRoomAmount4PartnersResponse getEditRoomAmount4PartnersResult() {
        return editRoomAmount4PartnersResult;
    }

    /**
     * 设置editRoomAmount4PartnersResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link EditRoomAmount4PartnersResponse }
     *     
     */
    public void setEditRoomAmount4PartnersResult(EditRoomAmount4PartnersResponse value) {
        this.editRoomAmount4PartnersResult = value;
    }

}
