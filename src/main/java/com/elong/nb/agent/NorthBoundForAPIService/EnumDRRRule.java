
package com.elong.nb.agent.NorthBoundForAPIService;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>EnumDRRRule的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="EnumDRRRule"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="None"/&gt;
 *     &lt;enumeration value="DRRBookAhead"/&gt;
 *     &lt;enumeration value="DRRStayPerRoomPerNight"/&gt;
 *     &lt;enumeration value="DRRStayLastNight"/&gt;
 *     &lt;enumeration value="DRRStayTheNightAndAfter"/&gt;
 *     &lt;enumeration value="DRRStayPerLastNight"/&gt;
 *     &lt;enumeration value="DRRStayWeekDay"/&gt;
 *     &lt;enumeration value="DRRCheckInWeekDay"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EnumDRRRule", namespace = "http://schemas.datacontract.org/2004/07/Com.Elong.Utility.Hotel.Enum")
@XmlEnum
public enum EnumDRRRule {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("DRRBookAhead")
    DRR_BOOK_AHEAD("DRRBookAhead"),
    @XmlEnumValue("DRRStayPerRoomPerNight")
    DRR_STAY_PER_ROOM_PER_NIGHT("DRRStayPerRoomPerNight"),
    @XmlEnumValue("DRRStayLastNight")
    DRR_STAY_LAST_NIGHT("DRRStayLastNight"),
    @XmlEnumValue("DRRStayTheNightAndAfter")
    DRR_STAY_THE_NIGHT_AND_AFTER("DRRStayTheNightAndAfter"),
    @XmlEnumValue("DRRStayPerLastNight")
    DRR_STAY_PER_LAST_NIGHT("DRRStayPerLastNight"),
    @XmlEnumValue("DRRStayWeekDay")
    DRR_STAY_WEEK_DAY("DRRStayWeekDay"),
    @XmlEnumValue("DRRCheckInWeekDay")
    DRR_CHECK_IN_WEEK_DAY("DRRCheckInWeekDay");
    private final String value;

    EnumDRRRule(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EnumDRRRule fromValue(String v) {
        for (EnumDRRRule c: EnumDRRRule.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
