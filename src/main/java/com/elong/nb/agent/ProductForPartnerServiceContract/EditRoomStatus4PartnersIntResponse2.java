
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
 *         &lt;element name="EditRoomStatus4PartnersIntResult" type="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response.Product4Partners}EditRoomStatus4PartnersIntResponse" minOccurs="0"/&gt;
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
    "editRoomStatus4PartnersIntResult"
})
@XmlRootElement(name = "EditRoomStatus4PartnersIntResponse")
public class EditRoomStatus4PartnersIntResponse2 {

    @XmlElement(name = "EditRoomStatus4PartnersIntResult", nillable = true)
    protected EditRoomStatus4PartnersIntResponse editRoomStatus4PartnersIntResult;

    /**
     * 获取editRoomStatus4PartnersIntResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link EditRoomStatus4PartnersIntResponse }
     *     
     */
    public EditRoomStatus4PartnersIntResponse getEditRoomStatus4PartnersIntResult() {
        return editRoomStatus4PartnersIntResult;
    }

    /**
     * 设置editRoomStatus4PartnersIntResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link EditRoomStatus4PartnersIntResponse }
     *     
     */
    public void setEditRoomStatus4PartnersIntResult(EditRoomStatus4PartnersIntResponse value) {
        this.editRoomStatus4PartnersIntResult = value;
    }

}
