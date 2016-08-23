
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
 *         &lt;element name="EditRoomAmount4PartnersIntResult" type="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response.Product4Partners}EditRoomAmount4PartnersIntResponse" minOccurs="0"/&gt;
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
    "editRoomAmount4PartnersIntResult"
})
@XmlRootElement(name = "EditRoomAmount4PartnersIntResponse")
public class EditRoomAmount4PartnersIntResponse2 {

    @XmlElement(name = "EditRoomAmount4PartnersIntResult", nillable = true)
    protected EditRoomAmount4PartnersIntResponse editRoomAmount4PartnersIntResult;

    /**
     * 获取editRoomAmount4PartnersIntResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link EditRoomAmount4PartnersIntResponse }
     *     
     */
    public EditRoomAmount4PartnersIntResponse getEditRoomAmount4PartnersIntResult() {
        return editRoomAmount4PartnersIntResult;
    }

    /**
     * 设置editRoomAmount4PartnersIntResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link EditRoomAmount4PartnersIntResponse }
     *     
     */
    public void setEditRoomAmount4PartnersIntResult(EditRoomAmount4PartnersIntResponse value) {
        this.editRoomAmount4PartnersIntResult = value;
    }

}
