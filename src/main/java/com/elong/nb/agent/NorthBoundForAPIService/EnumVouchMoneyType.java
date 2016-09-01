
package com.elong.nb.agent.NorthBoundForAPIService;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>EnumVouchMoneyType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="EnumVouchMoneyType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="FirstNightCost"/&gt;
 *     &lt;enumeration value="FullNightCost"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EnumVouchMoneyType", namespace = "http://schemas.datacontract.org/2004/07/Com.Elong.Utility.Hotel.Enum")
@XmlEnum
public enum EnumVouchMoneyType {

    @XmlEnumValue("FirstNightCost")
    FIRST_NIGHT_COST("FirstNightCost"),
    @XmlEnumValue("FullNightCost")
    FULL_NIGHT_COST("FullNightCost");
    private final String value;

    EnumVouchMoneyType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EnumVouchMoneyType fromValue(String v) {
        for (EnumVouchMoneyType c: EnumVouchMoneyType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
