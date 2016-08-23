
package com.elong.nb.agent.ProductForPartnerServiceContract;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ArrayOfKeyValueOfstringBedInfoForDayw_SkfccAu complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ArrayOfKeyValueOfstringBedInfoForDayw_SkfccAu"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="KeyValueOfstringBedInfoForDayw_SkfccAu" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Key" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="Value" type="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model.Room}BedInfoForDay"/&gt;
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
@XmlType(name = "ArrayOfKeyValueOfstringBedInfoForDayw_SkfccAu", namespace = "http://schemas.microsoft.com/2003/10/Serialization/Arrays", propOrder = {
    "keyValueOfstringBedInfoForDaywSkfccAu"
})
public class ArrayOfKeyValueOfstringBedInfoForDaywSkfccAu {

    @XmlElement(name = "KeyValueOfstringBedInfoForDayw_SkfccAu")
    protected List<ArrayOfKeyValueOfstringBedInfoForDaywSkfccAu.KeyValueOfstringBedInfoForDaywSkfccAu> keyValueOfstringBedInfoForDaywSkfccAu;

    /**
     * Gets the value of the keyValueOfstringBedInfoForDaywSkfccAu property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the keyValueOfstringBedInfoForDaywSkfccAu property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKeyValueOfstringBedInfoForDaywSkfccAu().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfKeyValueOfstringBedInfoForDaywSkfccAu.KeyValueOfstringBedInfoForDaywSkfccAu }
     * 
     * 
     */
    public List<ArrayOfKeyValueOfstringBedInfoForDaywSkfccAu.KeyValueOfstringBedInfoForDaywSkfccAu> getKeyValueOfstringBedInfoForDaywSkfccAu() {
        if (keyValueOfstringBedInfoForDaywSkfccAu == null) {
            keyValueOfstringBedInfoForDaywSkfccAu = new ArrayList<ArrayOfKeyValueOfstringBedInfoForDaywSkfccAu.KeyValueOfstringBedInfoForDaywSkfccAu>();
        }
        return this.keyValueOfstringBedInfoForDaywSkfccAu;
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
     *         &lt;element name="Key" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="Value" type="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Model.Room}BedInfoForDay"/&gt;
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
    public static class KeyValueOfstringBedInfoForDaywSkfccAu {

        @XmlElement(name = "Key", namespace = "http://schemas.microsoft.com/2003/10/Serialization/Arrays", required = true, nillable = true)
        protected String key;
        @XmlElement(name = "Value", namespace = "http://schemas.microsoft.com/2003/10/Serialization/Arrays", required = true, nillable = true)
        protected BedInfoForDay value;

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
         *     {@link BedInfoForDay }
         *     
         */
        public BedInfoForDay getValue() {
            return value;
        }

        /**
         * 设置value属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BedInfoForDay }
         *     
         */
        public void setValue(BedInfoForDay value) {
            this.value = value;
        }

    }

}
