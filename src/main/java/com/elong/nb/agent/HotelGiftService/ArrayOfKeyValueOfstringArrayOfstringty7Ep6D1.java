
package com.elong.nb.agent.HotelGiftService;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ArrayOfKeyValueOfstringArrayOfstringty7Ep6D1 complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ArrayOfKeyValueOfstringArrayOfstringty7Ep6D1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="KeyValueOfstringArrayOfstringty7Ep6D1" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Key" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Value" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfKeyValueOfstringArrayOfstringty7Ep6D1", namespace = "http://schemas.microsoft.com/2003/10/Serialization/Arrays", propOrder = {
    "keyValueOfstringArrayOfstringty7Ep6D1"
})
public class ArrayOfKeyValueOfstringArrayOfstringty7Ep6D1 {

    @XmlElement(name = "KeyValueOfstringArrayOfstringty7Ep6D1")
    protected List<ArrayOfKeyValueOfstringArrayOfstringty7Ep6D1 .KeyValueOfstringArrayOfstringty7Ep6D1> keyValueOfstringArrayOfstringty7Ep6D1;

    /**
     * Gets the value of the keyValueOfstringArrayOfstringty7Ep6D1 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the keyValueOfstringArrayOfstringty7Ep6D1 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKeyValueOfstringArrayOfstringty7Ep6D1().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfKeyValueOfstringArrayOfstringty7Ep6D1 .KeyValueOfstringArrayOfstringty7Ep6D1 }
     * 
     * 
     */
    public List<ArrayOfKeyValueOfstringArrayOfstringty7Ep6D1 .KeyValueOfstringArrayOfstringty7Ep6D1> getKeyValueOfstringArrayOfstringty7Ep6D1() {
        if (keyValueOfstringArrayOfstringty7Ep6D1 == null) {
            keyValueOfstringArrayOfstringty7Ep6D1 = new ArrayList<ArrayOfKeyValueOfstringArrayOfstringty7Ep6D1 .KeyValueOfstringArrayOfstringty7Ep6D1>();
        }
        return this.keyValueOfstringArrayOfstringty7Ep6D1;
    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Key" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Value" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "key",
        "value"
    })
    public static class KeyValueOfstringArrayOfstringty7Ep6D1 {

        @XmlElement(name = "Key", namespace = "http://schemas.microsoft.com/2003/10/Serialization/Arrays", required = true, nillable = true)
        protected String key;
        @XmlElement(name = "Value", namespace = "http://schemas.microsoft.com/2003/10/Serialization/Arrays", required = true, nillable = true)
        protected ArrayOfstring value;

        /**
         * 获取key属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getKey() {
            return key;
        }

        /**
         * 设置key属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setKey(String value) {
            this.key = value;
        }

        /**
         * 获取value属性的值。
         * 
         * @return
         *     possible object is
         *     {@link ArrayOfstring }
         *     
         */
        public ArrayOfstring getValue() {
            return value;
        }

        /**
         * 设置value属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link ArrayOfstring }
         *     
         */
        public void setValue(ArrayOfstring value) {
            this.value = value;
        }

    }

}
