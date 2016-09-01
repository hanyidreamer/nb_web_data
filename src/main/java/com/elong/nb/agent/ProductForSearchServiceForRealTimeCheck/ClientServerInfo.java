
package com.elong.nb.agent.ProductForSearchServiceForRealTimeCheck;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ClientServerInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ClientServerInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ApplicationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AssemblyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MachineIP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MachineName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MethodName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClientServerInfo", namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Framework", propOrder = {
    "applicationName",
    "assemblyName",
    "machineIP",
    "machineName",
    "methodName"
})
public class ClientServerInfo {

    @XmlElement(name = "ApplicationName", nillable = true)
    protected String applicationName;
    @XmlElement(name = "AssemblyName", nillable = true)
    protected String assemblyName;
    @XmlElement(name = "MachineIP", nillable = true)
    protected String machineIP;
    @XmlElement(name = "MachineName", nillable = true)
    protected String machineName;
    @XmlElement(name = "MethodName", nillable = true)
    protected String methodName;

    /**
     * 获取applicationName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicationName() {
        return applicationName;
    }

    /**
     * 设置applicationName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicationName(String value) {
        this.applicationName = value;
    }

    /**
     * 获取assemblyName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssemblyName() {
        return assemblyName;
    }

    /**
     * 设置assemblyName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssemblyName(String value) {
        this.assemblyName = value;
    }

    /**
     * 获取machineIP属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMachineIP() {
        return machineIP;
    }

    /**
     * 设置machineIP属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMachineIP(String value) {
        this.machineIP = value;
    }

    /**
     * 获取machineName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMachineName() {
        return machineName;
    }

    /**
     * 设置machineName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMachineName(String value) {
        this.machineName = value;
    }

    /**
     * 获取methodName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMethodName() {
        return methodName;
    }

    /**
     * 设置methodName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMethodName(String value) {
        this.methodName = value;
    }

}
