
package com.elong.nb.agent.ProductForPartnerServiceContract;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>SaveBedInfoRequest complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SaveBedInfoRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="bedList" type="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model}ArrayOfBedInfoEntity" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SaveBedInfoRequest", namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Request", propOrder = {
    "bedList"
})
public class SaveBedInfoRequest {

    @XmlElement(nillable = true)
    protected ArrayOfBedInfoEntity bedList;

    /**
     * 获取bedList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBedInfoEntity }
     *     
     */
    public ArrayOfBedInfoEntity getBedList() {
        return bedList;
    }

    /**
     * 设置bedList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBedInfoEntity }
     *     
     */
    public void setBedList(ArrayOfBedInfoEntity value) {
        this.bedList = value;
    }

}
