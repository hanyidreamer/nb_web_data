
package com.elong.nb.agent.NorthBoundForAPIService;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>EnumRuleTarget的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="EnumRuleTarget"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Hotel"/&gt;
 *     &lt;enumeration value="Customer"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EnumRuleTarget", namespace = "http://schemas.datacontract.org/2004/07/Com.Elong.Utility.Hotel.Enum")
@XmlEnum
public enum EnumRuleTarget {

    @XmlEnumValue("Hotel")
    HOTEL("Hotel"),
    @XmlEnumValue("Customer")
    CUSTOMER("Customer");
    private final String value;

    EnumRuleTarget(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EnumRuleTarget fromValue(String v) {
        for (EnumRuleTarget c: EnumRuleTarget.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
