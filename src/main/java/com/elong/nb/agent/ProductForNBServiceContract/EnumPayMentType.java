
package com.elong.nb.agent.ProductForNBServiceContract;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>EnumPayMentType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="EnumPayMentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="PayToHotelByCustomerSelf"/&gt;
 *     &lt;enumeration value="PrePay"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EnumPayMentType", namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Enums")
@XmlEnum
public enum EnumPayMentType {

    @XmlEnumValue("PayToHotelByCustomerSelf")
    PAY_TO_HOTEL_BY_CUSTOMER_SELF("PayToHotelByCustomerSelf"),
    @XmlEnumValue("PrePay")
    PRE_PAY("PrePay");
    private final String value;

    EnumPayMentType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EnumPayMentType fromValue(String v) {
        for (EnumPayMentType c: EnumPayMentType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
