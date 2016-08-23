
package com.elong.nb.agent.ProductForPartnerServiceContract;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>EnumVouchRule的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="EnumVouchRule"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="VouchNoChange"/&gt;
 *     &lt;enumeration value="VouchNeedSomeDay"/&gt;
 *     &lt;enumeration value="VouchNeedCheckinTime"/&gt;
 *     &lt;enumeration value="VouchNeedCheckin24hour"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EnumVouchRule", namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Enums")
@XmlEnum
public enum EnumVouchRule {

    @XmlEnumValue("VouchNoChange")
    VOUCH_NO_CHANGE("VouchNoChange"),
    @XmlEnumValue("VouchNeedSomeDay")
    VOUCH_NEED_SOME_DAY("VouchNeedSomeDay"),
    @XmlEnumValue("VouchNeedCheckinTime")
    VOUCH_NEED_CHECKIN_TIME("VouchNeedCheckinTime"),
    @XmlEnumValue("VouchNeedCheckin24hour")
    VOUCH_NEED_CHECKIN_24_HOUR("VouchNeedCheckin24hour");
    private final String value;

    EnumVouchRule(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EnumVouchRule fromValue(String v) {
        for (EnumVouchRule c: EnumVouchRule.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
