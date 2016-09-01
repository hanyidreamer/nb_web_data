
package com.elong.nb.agent.NorthBoundForAPIService;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ArrayOfPrePayInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ArrayOfPrePayInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PrePayInfo" type="{http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.Domain.Hotel.HotelProductUseBusiness}PrePayInfo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPrePayInfo", namespace = "http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.Domain.Hotel.HotelProductUseBusiness", propOrder = {
    "prePayInfo"
})
public class ArrayOfPrePayInfo {

    @XmlElement(name = "PrePayInfo", nillable = true)
    protected List<PrePayInfo> prePayInfo;

    /**
     * Gets the value of the prePayInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the prePayInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrePayInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PrePayInfo }
     * 
     * 
     */
    public List<PrePayInfo> getPrePayInfo() {
        if (prePayInfo == null) {
            prePayInfo = new ArrayList<PrePayInfo>();
        }
        return this.prePayInfo;
    }

}
