
package com.elong.nb.agent.NorthBoundForAPIService;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>EExclusive的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="EExclusive"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Inclusive"/&gt;
 *     &lt;enumeration value="Exclusive"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EExclusive", namespace = "http://schemas.datacontract.org/2004/07/Com.Elong.Utility.Hotel.Enum")
@XmlEnum
public enum EExclusive {

    @XmlEnumValue("Inclusive")
    INCLUSIVE("Inclusive"),
    @XmlEnumValue("Exclusive")
    EXCLUSIVE("Exclusive");
    private final String value;

    EExclusive(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EExclusive fromValue(String v) {
        for (EExclusive c: EExclusive.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
