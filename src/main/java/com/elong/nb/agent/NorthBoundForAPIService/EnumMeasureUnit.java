
package com.elong.nb.agent.NorthBoundForAPIService;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>EnumMeasureUnit的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="EnumMeasureUnit"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Money"/&gt;
 *     &lt;enumeration value="Scale"/&gt;
 *     &lt;enumeration value="FirstNightCost"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EnumMeasureUnit", namespace = "http://schemas.datacontract.org/2004/07/Com.Elong.Utility.Hotel.Enum")
@XmlEnum
public enum EnumMeasureUnit {

    @XmlEnumValue("Money")
    MONEY("Money"),
    @XmlEnumValue("Scale")
    SCALE("Scale"),
    @XmlEnumValue("FirstNightCost")
    FIRST_NIGHT_COST("FirstNightCost");
    private final String value;

    EnumMeasureUnit(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EnumMeasureUnit fromValue(String v) {
        for (EnumMeasureUnit c: EnumMeasureUnit.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
