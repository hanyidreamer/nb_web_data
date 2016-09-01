
package com.elong.nb.agent.SupplierService;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>CurrencyType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="CurrencyType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NoSense"/>
 *     &lt;enumeration value="RMB"/>
 *     &lt;enumeration value="HKD"/>
 *     &lt;enumeration value="USD"/>
 *     &lt;enumeration value="MOP"/>
 *     &lt;enumeration value="SGD"/>
 *     &lt;enumeration value="TWD"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CurrencyType", namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Enums")
@XmlEnum
public enum CurrencyType {

    @XmlEnumValue("NoSense")
    NO_SENSE("NoSense"),
    RMB("RMB"),
    HKD("HKD"),
    USD("USD"),
    MOP("MOP"),
    SGD("SGD"),
    TWD("TWD");
    private final String value;

    CurrencyType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CurrencyType fromValue(String v) {
        for (CurrencyType c: CurrencyType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
