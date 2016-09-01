
package com.elong.nb.agent.SupplierService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>DefaultResponseResult complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="DefaultResponseResult">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Framework}ServiceResponseBase">
 *       &lt;sequence>
 *         &lt;element name="IsExist" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MatrixTotalShardCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DefaultResponseResult", namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Response", propOrder = {
    "isExist",
    "matrixTotalShardCount"
})
public class DefaultResponseResult
    extends ServiceResponseBase
{

    @XmlElement(name = "IsExist")
    protected Boolean isExist;
    @XmlElement(name = "MatrixTotalShardCount")
    protected Integer matrixTotalShardCount;

    /**
     * 获取isExist属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsExist() {
        return isExist;
    }

    /**
     * 设置isExist属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsExist(Boolean value) {
        this.isExist = value;
    }

    /**
     * 获取matrixTotalShardCount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMatrixTotalShardCount() {
        return matrixTotalShardCount;
    }

    /**
     * 设置matrixTotalShardCount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMatrixTotalShardCount(Integer value) {
        this.matrixTotalShardCount = value;
    }

}
