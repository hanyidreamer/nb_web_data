
package com.elong.nb.agent.ProductForPartnerServiceContract;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ArrayOfKeyValueOfintArrayOfDateIntervalInventoryInfoyrFq0q_Sa complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ArrayOfKeyValueOfintArrayOfDateIntervalInventoryInfoyrFq0q_Sa"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="KeyValueOfintArrayOfDateIntervalInventoryInfoyrFq0q_Sa" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Key" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *                   &lt;element name="Value" type="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model.Inventory}ArrayOfDateIntervalInventoryInfo"/&gt;
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
@XmlType(name = "ArrayOfKeyValueOfintArrayOfDateIntervalInventoryInfoyrFq0q_Sa", namespace = "http://schemas.microsoft.com/2003/10/Serialization/Arrays", propOrder = {
    "keyValueOfintArrayOfDateIntervalInventoryInfoyrFq0QSa"
})
public class ArrayOfKeyValueOfintArrayOfDateIntervalInventoryInfoyrFq0QSa {

    @XmlElement(name = "KeyValueOfintArrayOfDateIntervalInventoryInfoyrFq0q_Sa")
    protected List<ArrayOfKeyValueOfintArrayOfDateIntervalInventoryInfoyrFq0QSa.KeyValueOfintArrayOfDateIntervalInventoryInfoyrFq0QSa> keyValueOfintArrayOfDateIntervalInventoryInfoyrFq0QSa;

    /**
     * Gets the value of the keyValueOfintArrayOfDateIntervalInventoryInfoyrFq0QSa property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the keyValueOfintArrayOfDateIntervalInventoryInfoyrFq0QSa property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKeyValueOfintArrayOfDateIntervalInventoryInfoyrFq0QSa().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfKeyValueOfintArrayOfDateIntervalInventoryInfoyrFq0QSa.KeyValueOfintArrayOfDateIntervalInventoryInfoyrFq0QSa }
     * 
     * 
     */
    public List<ArrayOfKeyValueOfintArrayOfDateIntervalInventoryInfoyrFq0QSa.KeyValueOfintArrayOfDateIntervalInventoryInfoyrFq0QSa> getKeyValueOfintArrayOfDateIntervalInventoryInfoyrFq0QSa() {
        if (keyValueOfintArrayOfDateIntervalInventoryInfoyrFq0QSa == null) {
            keyValueOfintArrayOfDateIntervalInventoryInfoyrFq0QSa = new ArrayList<ArrayOfKeyValueOfintArrayOfDateIntervalInventoryInfoyrFq0QSa.KeyValueOfintArrayOfDateIntervalInventoryInfoyrFq0QSa>();
        }
        return this.keyValueOfintArrayOfDateIntervalInventoryInfoyrFq0QSa;
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
     *         &lt;element name="Value" type="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model.Inventory}ArrayOfDateIntervalInventoryInfo"/&gt;
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
    public static class KeyValueOfintArrayOfDateIntervalInventoryInfoyrFq0QSa {

        @XmlElement(name = "Key", namespace = "http://schemas.microsoft.com/2003/10/Serialization/Arrays")
        protected int key;
        @XmlElement(name = "Value", namespace = "http://schemas.microsoft.com/2003/10/Serialization/Arrays", required = true, nillable = true)
        protected ArrayOfDateIntervalInventoryInfo value;

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
         *     {@link ArrayOfDateIntervalInventoryInfo }
         *     
         */
        public ArrayOfDateIntervalInventoryInfo getValue() {
            return value;
        }

        /**
         * 设置value属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link ArrayOfDateIntervalInventoryInfo }
         *     
         */
        public void setValue(ArrayOfDateIntervalInventoryInfo value) {
            this.value = value;
        }

    }

}
