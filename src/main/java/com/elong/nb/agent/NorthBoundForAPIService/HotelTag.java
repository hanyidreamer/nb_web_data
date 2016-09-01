
package com.elong.nb.agent.NorthBoundForAPIService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>HotelTag complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="HotelTag"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="_x003C_TagID_x003E_k__BackingField" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="_x003C_TagName_x003E_k__BackingField" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HotelTag", namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Contract", propOrder = {
    "x003CTagIDX003EKBackingField",
    "x003CTagNameX003EKBackingField"
})
public class HotelTag {

    @XmlElement(name = "_x003C_TagID_x003E_k__BackingField")
    protected int x003CTagIDX003EKBackingField;
    @XmlElement(name = "_x003C_TagName_x003E_k__BackingField", required = true, nillable = true)
    protected String x003CTagNameX003EKBackingField;

    /**
     * 获取x003CTagIDX003EKBackingField属性的值。
     * 
     */
    public int getX003CTagIDX003EKBackingField() {
        return x003CTagIDX003EKBackingField;
    }

    /**
     * 设置x003CTagIDX003EKBackingField属性的值。
     * 
     */
    public void setX003CTagIDX003EKBackingField(int value) {
        this.x003CTagIDX003EKBackingField = value;
    }

    /**
     * 获取x003CTagNameX003EKBackingField属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getX003CTagNameX003EKBackingField() {
        return x003CTagNameX003EKBackingField;
    }

    /**
     * 设置x003CTagNameX003EKBackingField属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setX003CTagNameX003EKBackingField(String value) {
        this.x003CTagNameX003EKBackingField = value;
    }

}
