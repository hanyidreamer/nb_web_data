
package com.elong.nb.agent.SupplierService;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>SettlementModle的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="SettlementModle">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NoSense"/>
 *     &lt;enumeration value="LeaveDay"/>
 *     &lt;enumeration value="CheckInDay"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SettlementModle", namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Enums")
@XmlEnum
public enum SettlementModle {

    @XmlEnumValue("NoSense")
    NO_SENSE("NoSense"),
    @XmlEnumValue("LeaveDay")
    LEAVE_DAY("LeaveDay"),
    @XmlEnumValue("CheckInDay")
    CHECK_IN_DAY("CheckInDay");
    private final String value;

    SettlementModle(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SettlementModle fromValue(String v) {
        for (SettlementModle c: SettlementModle.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
