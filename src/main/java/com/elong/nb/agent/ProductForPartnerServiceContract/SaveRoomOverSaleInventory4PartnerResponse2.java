
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
 *         &lt;element name="SaveRoomOverSaleInventory4PartnerResult" type="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response}SaveRoomOverSaleInventory4PartnerResponse" minOccurs="0"/&gt;
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
    "saveRoomOverSaleInventory4PartnerResult"
})
@XmlRootElement(name = "SaveRoomOverSaleInventory4PartnerResponse")
public class SaveRoomOverSaleInventory4PartnerResponse2 {

    @XmlElement(name = "SaveRoomOverSaleInventory4PartnerResult", nillable = true)
    protected SaveRoomOverSaleInventory4PartnerResponse saveRoomOverSaleInventory4PartnerResult;

    /**
     * 获取saveRoomOverSaleInventory4PartnerResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SaveRoomOverSaleInventory4PartnerResponse }
     *     
     */
    public SaveRoomOverSaleInventory4PartnerResponse getSaveRoomOverSaleInventory4PartnerResult() {
        return saveRoomOverSaleInventory4PartnerResult;
    }

    /**
     * 设置saveRoomOverSaleInventory4PartnerResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SaveRoomOverSaleInventory4PartnerResponse }
     *     
     */
    public void setSaveRoomOverSaleInventory4PartnerResult(SaveRoomOverSaleInventory4PartnerResponse value) {
        this.saveRoomOverSaleInventory4PartnerResult = value;
    }

}
