
package com.elong.nb.agent.HotelGiftService;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>HotelGiftDateTypeEnum的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="HotelGiftDateTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CheckinDate"/>
 *     &lt;enumeration value="BookingDate"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "HotelGiftDateTypeEnum", namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Enums")
@XmlEnum
public enum HotelGiftDateTypeEnum {

    @XmlEnumValue("CheckinDate")
    CHECKIN_DATE("CheckinDate"),
    @XmlEnumValue("BookingDate")
    BOOKING_DATE("BookingDate");
    private final String value;

    HotelGiftDateTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HotelGiftDateTypeEnum fromValue(String v) {
        for (HotelGiftDateTypeEnum c: HotelGiftDateTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
