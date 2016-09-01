
package com.elong.nb.agent.NorthBoundForAPIService;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ArrayOfDictionaryEntry complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDictionaryEntry"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DictionaryEntry" type="{http://schemas.datacontract.org/2004/07/System.Collections}DictionaryEntry" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDictionaryEntry", namespace = "http://schemas.datacontract.org/2004/07/System.Collections", propOrder = {
    "dictionaryEntry"
})
public class ArrayOfDictionaryEntry {

    @XmlElement(name = "DictionaryEntry")
    protected List<DictionaryEntry> dictionaryEntry;

    /**
     * Gets the value of the dictionaryEntry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dictionaryEntry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDictionaryEntry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DictionaryEntry }
     * 
     * 
     */
    public List<DictionaryEntry> getDictionaryEntry() {
        if (dictionaryEntry == null) {
            dictionaryEntry = new ArrayList<DictionaryEntry>();
        }
        return this.dictionaryEntry;
    }

}
