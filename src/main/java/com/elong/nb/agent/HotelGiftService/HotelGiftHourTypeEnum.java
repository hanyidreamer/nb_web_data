
package com.elong.nb.agent.HotelGiftService;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>HotelGiftHourTypeEnum的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="HotelGiftHourTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Hours24"/>
 *     &lt;enumeration value="XHourBefore"/>
 *     &lt;enumeration value="XHourAfter"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "HotelGiftHourTypeEnum", namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Enums")
@XmlEnum
public enum HotelGiftHourTypeEnum {

    @XmlEnumValue("Hours24")
    HOURS_24("Hours24"),
    @XmlEnumValue("XHourBefore")
    X_HOUR_BEFORE("XHourBefore"),
    @XmlEnumValue("XHourAfter")
    X_HOUR_AFTER("XHourAfter");
    private final String value;

    HotelGiftHourTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HotelGiftHourTypeEnum fromValue(String v) {
        for (HotelGiftHourTypeEnum c: HotelGiftHourTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
