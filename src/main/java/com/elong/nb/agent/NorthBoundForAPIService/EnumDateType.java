
package com.elong.nb.agent.NorthBoundForAPIService;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>EnumDateType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="EnumDateType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="None"/&gt;
 *     &lt;enumeration value="CheckInDay"/&gt;
 *     &lt;enumeration value="StayDay"/&gt;
 *     &lt;enumeration value="BookDay"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EnumDateType", namespace = "http://schemas.datacontract.org/2004/07/Com.Elong.Utility.Hotel.Enum")
@XmlEnum
public enum EnumDateType {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("CheckInDay")
    CHECK_IN_DAY("CheckInDay"),
    @XmlEnumValue("StayDay")
    STAY_DAY("StayDay"),
    @XmlEnumValue("BookDay")
    BOOK_DAY("BookDay");
    private final String value;

    EnumDateType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EnumDateType fromValue(String v) {
        for (EnumDateType c: EnumDateType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
