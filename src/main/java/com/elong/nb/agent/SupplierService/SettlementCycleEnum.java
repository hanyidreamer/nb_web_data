
package com.elong.nb.agent.SupplierService;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>SettlementCycleEnum的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="SettlementCycleEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NoSense"/>
 *     &lt;enumeration value="DaySettle"/>
 *     &lt;enumeration value="WeekSettle"/>
 *     &lt;enumeration value="HalfMonthSettle"/>
 *     &lt;enumeration value="MonthSettle"/>
 *     &lt;enumeration value="PerOrderSettle"/>
 *     &lt;enumeration value="PerNightSettle"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SettlementCycleEnum", namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Enums")
@XmlEnum
public enum SettlementCycleEnum {

    @XmlEnumValue("NoSense")
    NO_SENSE("NoSense"),
    @XmlEnumValue("DaySettle")
    DAY_SETTLE("DaySettle"),
    @XmlEnumValue("WeekSettle")
    WEEK_SETTLE("WeekSettle"),
    @XmlEnumValue("HalfMonthSettle")
    HALF_MONTH_SETTLE("HalfMonthSettle"),
    @XmlEnumValue("MonthSettle")
    MONTH_SETTLE("MonthSettle"),
    @XmlEnumValue("PerOrderSettle")
    PER_ORDER_SETTLE("PerOrderSettle"),
    @XmlEnumValue("PerNightSettle")
    PER_NIGHT_SETTLE("PerNightSettle");
    private final String value;

    SettlementCycleEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SettlementCycleEnum fromValue(String v) {
        for (SettlementCycleEnum c: SettlementCycleEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
