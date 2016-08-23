
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
 *         &lt;element name="IsDCRoomBackupResult" type="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response.Product4Partners}IsDCRoomBackupResponse" minOccurs="0"/&gt;
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
    "isDCRoomBackupResult"
})
@XmlRootElement(name = "IsDCRoomBackupResponse")
public class IsDCRoomBackupResponse2 {

    @XmlElement(name = "IsDCRoomBackupResult", nillable = true)
    protected IsDCRoomBackupResponse isDCRoomBackupResult;

    /**
     * 获取isDCRoomBackupResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link IsDCRoomBackupResponse }
     *     
     */
    public IsDCRoomBackupResponse getIsDCRoomBackupResult() {
        return isDCRoomBackupResult;
    }

    /**
     * 设置isDCRoomBackupResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link IsDCRoomBackupResponse }
     *     
     */
    public void setIsDCRoomBackupResult(IsDCRoomBackupResponse value) {
        this.isDCRoomBackupResult = value;
    }

}
