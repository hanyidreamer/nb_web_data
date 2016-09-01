
package com.elong.nb.agent.SupplierService;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>SettlementBankType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="SettlementBankType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Nosense"/>
 *     &lt;enumeration value="Company"/>
 *     &lt;enumeration value="Personal"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SettlementBankType", namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Enums")
@XmlEnum
public enum SettlementBankType {

    @XmlEnumValue("Nosense")
    NOSENSE("Nosense"),
    @XmlEnumValue("Company")
    COMPANY("Company"),
    @XmlEnumValue("Personal")
    PERSONAL("Personal");
    private final String value;

    SettlementBankType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SettlementBankType fromValue(String v) {
        for (SettlementBankType c: SettlementBankType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
