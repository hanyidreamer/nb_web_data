
package com.elong.nb.agent.NorthBoundForAPIService;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ArrayOfGeoDetail_Info complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ArrayOfGeoDetail_Info"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GeoDetail_Info" type="{http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.DataAccess.Hotel}GeoDetail_Info" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfGeoDetail_Info", namespace = "http://schemas.datacontract.org/2004/07/Com.Elong.BusinessService.DataAccess.Hotel", propOrder = {
    "geoDetailInfo"
})
public class ArrayOfGeoDetailInfo {

    @XmlElement(name = "GeoDetail_Info", nillable = true)
    protected List<GeoDetailInfo> geoDetailInfo;

    /**
     * Gets the value of the geoDetailInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the geoDetailInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGeoDetailInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GeoDetailInfo }
     * 
     * 
     */
    public List<GeoDetailInfo> getGeoDetailInfo() {
        if (geoDetailInfo == null) {
            geoDetailInfo = new ArrayList<GeoDetailInfo>();
        }
        return this.geoDetailInfo;
    }

}
