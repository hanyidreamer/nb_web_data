
package com.elong.nb.agent.NorthBoundForAPIService;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>EPromotionType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="EPromotionType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Coupon"/&gt;
 *     &lt;enumeration value="Point"/&gt;
 *     &lt;enumeration value="Discount"/&gt;
 *     &lt;enumeration value="Gift"/&gt;
 *     &lt;enumeration value="ReturnMoney"/&gt;
 *     &lt;enumeration value="S1"/&gt;
 *     &lt;enumeration value="S2"/&gt;
 *     &lt;enumeration value="DirectDiscount"/&gt;
 *     &lt;enumeration value="CashAccount"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EPromotionType", namespace = "http://schemas.datacontract.org/2004/07/Com.Elong.Utility.Hotel.Enum")
@XmlEnum
public enum EPromotionType {

    @XmlEnumValue("Coupon")
    COUPON("Coupon"),
    @XmlEnumValue("Point")
    POINT("Point"),
    @XmlEnumValue("Discount")
    DISCOUNT("Discount"),
    @XmlEnumValue("Gift")
    GIFT("Gift"),
    @XmlEnumValue("ReturnMoney")
    RETURN_MONEY("ReturnMoney"),
    @XmlEnumValue("S1")
    S_1("S1"),
    @XmlEnumValue("S2")
    S_2("S2"),
    @XmlEnumValue("DirectDiscount")
    DIRECT_DISCOUNT("DirectDiscount"),
    @XmlEnumValue("CashAccount")
    CASH_ACCOUNT("CashAccount");
    private final String value;

    EPromotionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EPromotionType fromValue(String v) {
        for (EPromotionType c: EPromotionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
