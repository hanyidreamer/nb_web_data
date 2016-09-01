
package com.elong.nb.agent.NorthBoundForAPIService;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>EHotelCostType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="EHotelCostType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="MoneyAmount"/&gt;
 *     &lt;enumeration value="RateOfMoneyAmount"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EHotelCostType", namespace = "http://schemas.datacontract.org/2004/07/Com.Elong.Utility.Hotel.Enum")
@XmlEnum
public enum EHotelCostType {

    @XmlEnumValue("MoneyAmount")
    MONEY_AMOUNT("MoneyAmount"),
    @XmlEnumValue("RateOfMoneyAmount")
    RATE_OF_MONEY_AMOUNT("RateOfMoneyAmount");
    private final String value;

    EHotelCostType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EHotelCostType fromValue(String v) {
        for (EHotelCostType c: EHotelCostType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
