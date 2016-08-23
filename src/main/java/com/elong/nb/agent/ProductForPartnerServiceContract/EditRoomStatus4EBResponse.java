
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
 *         &lt;element name="EditRoomStatus4EBResult" type="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response.Product4Partners}EditRoomStatus4PartnersResponse" minOccurs="0"/&gt;
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
    "editRoomStatus4EBResult"
})
@XmlRootElement(name = "EditRoomStatus4EBResponse")
public class EditRoomStatus4EBResponse {

    @XmlElement(name = "EditRoomStatus4EBResult", nillable = true)
    protected EditRoomStatus4PartnersResponse editRoomStatus4EBResult;

    /**
     * 获取editRoomStatus4EBResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link EditRoomStatus4PartnersResponse }
     *     
     */
    public EditRoomStatus4PartnersResponse getEditRoomStatus4EBResult() {
        return editRoomStatus4EBResult;
    }

    /**
     * 设置editRoomStatus4EBResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link EditRoomStatus4PartnersResponse }
     *     
     */
    public void setEditRoomStatus4EBResult(EditRoomStatus4PartnersResponse value) {
        this.editRoomStatus4EBResult = value;
    }

}
