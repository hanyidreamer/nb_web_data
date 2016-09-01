
package com.elong.nb.agent.NorthBoundForAPIService;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>EnumCutType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="EnumCutType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Money"/&gt;
 *     &lt;enumeration value="Percent"/&gt;
 *     &lt;enumeration value="FristNight"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EnumCutType", namespace = "http://schemas.datacontract.org/2004/07/Com.Elong.Utility.Hotel.Enum")
@XmlEnum
public enum EnumCutType {

    @XmlEnumValue("Money")
    MONEY("Money"),
    @XmlEnumValue("Percent")
    PERCENT("Percent"),
    @XmlEnumValue("FristNight")
    FRIST_NIGHT("FristNight");
    private final String value;

    EnumCutType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EnumCutType fromValue(String v) {
        for (EnumCutType c: EnumCutType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
