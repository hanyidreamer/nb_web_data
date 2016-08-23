
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
 *         &lt;element name="EditRoomStatus4PartnersResult" type="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response.Product4Partners}EditRoomStatus4PartnersResponse" minOccurs="0"/&gt;
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
    "editRoomStatus4PartnersResult"
})
@XmlRootElement(name = "EditRoomStatus4PartnersResponse")
public class EditRoomStatus4PartnersResponse2 {

    @XmlElement(name = "EditRoomStatus4PartnersResult", nillable = true)
    protected EditRoomStatus4PartnersResponse editRoomStatus4PartnersResult;

    /**
     * 获取editRoomStatus4PartnersResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link EditRoomStatus4PartnersResponse }
     *     
     */
    public EditRoomStatus4PartnersResponse getEditRoomStatus4PartnersResult() {
        return editRoomStatus4PartnersResult;
    }

    /**
     * 设置editRoomStatus4PartnersResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link EditRoomStatus4PartnersResponse }
     *     
     */
    public void setEditRoomStatus4PartnersResult(EditRoomStatus4PartnersResponse value) {
        this.editRoomStatus4PartnersResult = value;
    }

}
