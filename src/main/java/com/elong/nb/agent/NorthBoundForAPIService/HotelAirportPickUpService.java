
package com.elong.nb.agent.NorthBoundForAPIService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.joda.time.DateTime;


/**
 * <p>HotelAirportPickUpService complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="HotelAirportPickUpService"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AirportName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AirportNameEn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Driver" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DriverEn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="EndTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="FreePickUpServiceNotes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FreePickUpServiceNotesEn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HotelID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ServiceProvidingDepartment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ServiceProvidingDepartmentContact" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ServiceProvidingDepartmentEn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="StartTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="VehicleType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VehicleTypeEn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HotelAirportPickUpService", namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Contract", propOrder = {
    "airportName",
    "airportNameEn",
    "driver",
    "driverEn",
    "endDate",
    "endTime",
    "freePickUpServiceNotes",
    "freePickUpServiceNotesEn",
    "hotelID",
    "serviceProvidingDepartment",
    "serviceProvidingDepartmentContact",
    "serviceProvidingDepartmentEn",
    "startDate",
    "startTime",
    "vehicleType",
    "vehicleTypeEn"
})
public class HotelAirportPickUpService {

    @XmlElement(name = "AirportName", nillable = true)
    protected String airportName;
    @XmlElement(name = "AirportNameEn", nillable = true)
    protected String airportNameEn;
    @XmlElement(name = "Driver", nillable = true)
    protected String driver;
    @XmlElement(name = "DriverEn", nillable = true)
    protected String driverEn;
    @XmlElement(name = "EndDate", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected DateTime endDate;
    @XmlElement(name = "EndTime", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected DateTime endTime;
    @XmlElement(name = "FreePickUpServiceNotes", nillable = true)
    protected String freePickUpServiceNotes;
    @XmlElement(name = "FreePickUpServiceNotesEn", nillable = true)
    protected String freePickUpServiceNotesEn;
    @XmlElement(name = "HotelID", nillable = true)
    protected String hotelID;
    @XmlElement(name = "ServiceProvidingDepartment", nillable = true)
    protected String serviceProvidingDepartment;
    @XmlElement(name = "ServiceProvidingDepartmentContact", nillable = true)
    protected String serviceProvidingDepartmentContact;
    @XmlElement(name = "ServiceProvidingDepartmentEn", nillable = true)
    protected String serviceProvidingDepartmentEn;
    @XmlElement(name = "StartDate", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected DateTime startDate;
    @XmlElement(name = "StartTime", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected DateTime startTime;
    @XmlElement(name = "VehicleType", nillable = true)
    protected String vehicleType;
    @XmlElement(name = "VehicleTypeEn", nillable = true)
    protected String vehicleTypeEn;

    /**
     * 获取airportName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirportName() {
        return airportName;
    }

    /**
     * 设置airportName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirportName(String value) {
        this.airportName = value;
    }

    /**
     * 获取airportNameEn属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirportNameEn() {
        return airportNameEn;
    }

    /**
     * 设置airportNameEn属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirportNameEn(String value) {
        this.airportNameEn = value;
    }

    /**
     * 获取driver属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDriver() {
        return driver;
    }

    /**
     * 设置driver属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDriver(String value) {
        this.driver = value;
    }

    /**
     * 获取driverEn属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDriverEn() {
        return driverEn;
    }

    /**
     * 设置driverEn属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDriverEn(String value) {
        this.driverEn = value;
    }

    /**
     * 获取endDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public DateTime getEndDate() {
        return endDate;
    }

    /**
     * 设置endDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndDate(DateTime value) {
        this.endDate = value;
    }

    /**
     * 获取endTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public DateTime getEndTime() {
        return endTime;
    }

    /**
     * 设置endTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndTime(DateTime value) {
        this.endTime = value;
    }

    /**
     * 获取freePickUpServiceNotes属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFreePickUpServiceNotes() {
        return freePickUpServiceNotes;
    }

    /**
     * 设置freePickUpServiceNotes属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFreePickUpServiceNotes(String value) {
        this.freePickUpServiceNotes = value;
    }

    /**
     * 获取freePickUpServiceNotesEn属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFreePickUpServiceNotesEn() {
        return freePickUpServiceNotesEn;
    }

    /**
     * 设置freePickUpServiceNotesEn属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFreePickUpServiceNotesEn(String value) {
        this.freePickUpServiceNotesEn = value;
    }

    /**
     * 获取hotelID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHotelID() {
        return hotelID;
    }

    /**
     * 设置hotelID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHotelID(String value) {
        this.hotelID = value;
    }

    /**
     * 获取serviceProvidingDepartment属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceProvidingDepartment() {
        return serviceProvidingDepartment;
    }

    /**
     * 设置serviceProvidingDepartment属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceProvidingDepartment(String value) {
        this.serviceProvidingDepartment = value;
    }

    /**
     * 获取serviceProvidingDepartmentContact属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceProvidingDepartmentContact() {
        return serviceProvidingDepartmentContact;
    }

    /**
     * 设置serviceProvidingDepartmentContact属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceProvidingDepartmentContact(String value) {
        this.serviceProvidingDepartmentContact = value;
    }

    /**
     * 获取serviceProvidingDepartmentEn属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceProvidingDepartmentEn() {
        return serviceProvidingDepartmentEn;
    }

    /**
     * 设置serviceProvidingDepartmentEn属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceProvidingDepartmentEn(String value) {
        this.serviceProvidingDepartmentEn = value;
    }

    /**
     * 获取startDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public DateTime getStartDate() {
        return startDate;
    }

    /**
     * 设置startDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartDate(DateTime value) {
        this.startDate = value;
    }

    /**
     * 获取startTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public DateTime getStartTime() {
        return startTime;
    }

    /**
     * 设置startTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartTime(DateTime value) {
        this.startTime = value;
    }

    /**
     * 获取vehicleType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehicleType() {
        return vehicleType;
    }

    /**
     * 设置vehicleType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehicleType(String value) {
        this.vehicleType = value;
    }

    /**
     * 获取vehicleTypeEn属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehicleTypeEn() {
        return vehicleTypeEn;
    }

    /**
     * 设置vehicleTypeEn属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehicleTypeEn(String value) {
        this.vehicleTypeEn = value;
    }

}
