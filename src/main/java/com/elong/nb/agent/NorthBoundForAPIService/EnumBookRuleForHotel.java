
package com.elong.nb.agent.NorthBoundForAPIService;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>EnumBookRuleForHotel的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="EnumBookRuleForHotel"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NoneRule"/&gt;
 *     &lt;enumeration value="NeedNationality"/&gt;
 *     &lt;enumeration value="PerRoomPerName"/&gt;
 *     &lt;enumeration value="ForeignerNeedEnName"/&gt;
 *     &lt;enumeration value="RejectCheckinTime"/&gt;
 *     &lt;enumeration value="NeedPhoneNo"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EnumBookRuleForHotel", namespace = "http://schemas.datacontract.org/2004/07/Com.Elong.Utility.Hotel.Enum")
@XmlEnum
public enum EnumBookRuleForHotel {

    @XmlEnumValue("NoneRule")
    NONE_RULE("NoneRule"),
    @XmlEnumValue("NeedNationality")
    NEED_NATIONALITY("NeedNationality"),
    @XmlEnumValue("PerRoomPerName")
    PER_ROOM_PER_NAME("PerRoomPerName"),
    @XmlEnumValue("ForeignerNeedEnName")
    FOREIGNER_NEED_EN_NAME("ForeignerNeedEnName"),
    @XmlEnumValue("RejectCheckinTime")
    REJECT_CHECKIN_TIME("RejectCheckinTime"),
    @XmlEnumValue("NeedPhoneNo")
    NEED_PHONE_NO("NeedPhoneNo");
    private final String value;

    EnumBookRuleForHotel(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EnumBookRuleForHotel fromValue(String v) {
        for (EnumBookRuleForHotel c: EnumBookRuleForHotel.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
