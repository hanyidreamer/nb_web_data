
package com.elong.nb.agent.ProductForPartnerServiceContract;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ArrayOfKeyValueOfintInvAmountAndStatusResult4OneInvType8x1z9B1i complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ArrayOfKeyValueOfintInvAmountAndStatusResult4OneInvType8x1z9B1i"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="KeyValueOfintInvAmountAndStatusResult4OneInvType8x1z9B1i" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Key" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *                   &lt;element name="Value" type="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response.Product4Partners}InvAmountAndStatusResult4OneInvType"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfKeyValueOfintInvAmountAndStatusResult4OneInvType8x1z9B1i", namespace = "http://schemas.microsoft.com/2003/10/Serialization/Arrays", propOrder = {
    "keyValueOfintInvAmountAndStatusResult4OneInvType8X1Z9B1I"
})
public class ArrayOfKeyValueOfintInvAmountAndStatusResult4OneInvType8X1Z9B1I {

    @XmlElement(name = "KeyValueOfintInvAmountAndStatusResult4OneInvType8x1z9B1i")
    protected List<ArrayOfKeyValueOfintInvAmountAndStatusResult4OneInvType8X1Z9B1I.KeyValueOfintInvAmountAndStatusResult4OneInvType8X1Z9B1I> keyValueOfintInvAmountAndStatusResult4OneInvType8X1Z9B1I;

    /**
     * Gets the value of the keyValueOfintInvAmountAndStatusResult4OneInvType8X1Z9B1I property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the keyValueOfintInvAmountAndStatusResult4OneInvType8X1Z9B1I property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKeyValueOfintInvAmountAndStatusResult4OneInvType8X1Z9B1I().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfKeyValueOfintInvAmountAndStatusResult4OneInvType8X1Z9B1I.KeyValueOfintInvAmountAndStatusResult4OneInvType8X1Z9B1I }
     * 
     * 
     */
    public List<ArrayOfKeyValueOfintInvAmountAndStatusResult4OneInvType8X1Z9B1I.KeyValueOfintInvAmountAndStatusResult4OneInvType8X1Z9B1I> getKeyValueOfintInvAmountAndStatusResult4OneInvType8X1Z9B1I() {
        if (keyValueOfintInvAmountAndStatusResult4OneInvType8X1Z9B1I == null) {
            keyValueOfintInvAmountAndStatusResult4OneInvType8X1Z9B1I = new ArrayList<ArrayOfKeyValueOfintInvAmountAndStatusResult4OneInvType8X1Z9B1I.KeyValueOfintInvAmountAndStatusResult4OneInvType8X1Z9B1I>();
        }
        return this.keyValueOfintInvAmountAndStatusResult4OneInvType8X1Z9B1I;
    }


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
     *         &lt;element name="Key" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
     *         &lt;element name="Value" type="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response.Product4Partners}InvAmountAndStatusResult4OneInvType"/&gt;
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
        "key",
        "value"
    })
    public static class KeyValueOfintInvAmountAndStatusResult4OneInvType8X1Z9B1I {

        @XmlElement(name = "Key", namespace = "http://schemas.microsoft.com/2003/10/Serialization/Arrays")
        protected int key;
        @XmlElement(name = "Value", namespace = "http://schemas.microsoft.com/2003/10/Serialization/Arrays", required = true, nillable = true)
        protected InvAmountAndStatusResult4OneInvType value;

        /**
         * 获取key属性的值。
         * 
         */
        public int getKey() {
            return key;
        }

        /**
         * 设置key属性的值。
         * 
         */
        public void setKey(int value) {
            this.key = value;
        }

        /**
         * 获取value属性的值。
         * 
         * @return
         *     possible object is
         *     {@link InvAmountAndStatusResult4OneInvType }
         *     
         */
        public InvAmountAndStatusResult4OneInvType getValue() {
            return value;
        }

        /**
         * 设置value属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link InvAmountAndStatusResult4OneInvType }
         *     
         */
        public void setValue(InvAmountAndStatusResult4OneInvType value) {
            this.value = value;
        }

    }

}
