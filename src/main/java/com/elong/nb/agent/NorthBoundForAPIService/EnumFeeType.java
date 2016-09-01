
package com.elong.nb.agent.NorthBoundForAPIService;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>EnumFeeType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="EnumFeeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="WeekendFee"/&gt;
 *     &lt;enumeration value="WeekdayFee"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EnumFeeType", namespace = "http://schemas.datacontract.org/2004/07/Com.Elong.Utility.Hotel.Enum")
@XmlEnum
public enum EnumFeeType {

    @XmlEnumValue("WeekendFee")
    WEEKEND_FEE("WeekendFee"),
    @XmlEnumValue("WeekdayFee")
    WEEKDAY_FEE("WeekdayFee");
    private final String value;

    EnumFeeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EnumFeeType fromValue(String v) {
        for (EnumFeeType c: EnumFeeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
