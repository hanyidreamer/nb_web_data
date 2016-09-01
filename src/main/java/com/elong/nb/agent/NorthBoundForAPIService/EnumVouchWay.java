
package com.elong.nb.agent.NorthBoundForAPIService;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>EnumVouchWay的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="EnumVouchWay"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CreditCard"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EnumVouchWay", namespace = "http://schemas.datacontract.org/2004/07/Com.Elong.Utility.Hotel.Enum")
@XmlEnum
public enum EnumVouchWay {

    @XmlEnumValue("CreditCard")
    CREDIT_CARD("CreditCard");
    private final String value;

    EnumVouchWay(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EnumVouchWay fromValue(String v) {
        for (EnumVouchWay c: EnumVouchWay.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
