
package com.elong.nb.agent.NorthBoundForAPIService;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>EnumPriceStatus的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="EnumPriceStatus"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="EveryDay"/&gt;
 *     &lt;enumeration value="Partial"/&gt;
 *     &lt;enumeration value="None"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EnumPriceStatus", namespace = "http://schemas.datacontract.org/2004/07/Com.Elong.Utility.Hotel.Enum")
@XmlEnum
public enum EnumPriceStatus {

    @XmlEnumValue("EveryDay")
    EVERY_DAY("EveryDay"),
    @XmlEnumValue("Partial")
    PARTIAL("Partial"),
    @XmlEnumValue("None")
    NONE("None");
    private final String value;

    EnumPriceStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EnumPriceStatus fromValue(String v) {
        for (EnumPriceStatus c: EnumPriceStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
