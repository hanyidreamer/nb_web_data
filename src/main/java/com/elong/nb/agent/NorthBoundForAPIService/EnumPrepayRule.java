
package com.elong.nb.agent.NorthBoundForAPIService;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>EnumPrepayRule的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="EnumPrepayRule"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="PrepayNoChange"/&gt;
 *     &lt;enumeration value="PrepayNeedSomeDay"/&gt;
 *     &lt;enumeration value="PrepayNeedOneTime"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EnumPrepayRule", namespace = "http://schemas.datacontract.org/2004/07/Com.Elong.Utility.Hotel.Enum")
@XmlEnum
public enum EnumPrepayRule {

    @XmlEnumValue("PrepayNoChange")
    PREPAY_NO_CHANGE("PrepayNoChange"),
    @XmlEnumValue("PrepayNeedSomeDay")
    PREPAY_NEED_SOME_DAY("PrepayNeedSomeDay"),
    @XmlEnumValue("PrepayNeedOneTime")
    PREPAY_NEED_ONE_TIME("PrepayNeedOneTime");
    private final String value;

    EnumPrepayRule(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EnumPrepayRule fromValue(String v) {
        for (EnumPrepayRule c: EnumPrepayRule.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
