
package com.elong.nb.agent.SupplierService;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ReceiveAccountType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="ReceiveAccountType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="Bank"/>
 *     &lt;enumeration value="TenPay"/>
 *     &lt;enumeration value="Alipay"/>
 *     &lt;enumeration value="ForeignCurrency"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ReceiveAccountType", namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Enums")
@XmlEnum
public enum ReceiveAccountType {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Bank")
    BANK("Bank"),
    @XmlEnumValue("TenPay")
    TEN_PAY("TenPay"),
    @XmlEnumValue("Alipay")
    ALIPAY("Alipay"),
    @XmlEnumValue("ForeignCurrency")
    FOREIGN_CURRENCY("ForeignCurrency");
    private final String value;

    ReceiveAccountType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ReceiveAccountType fromValue(String v) {
        for (ReceiveAccountType c: ReceiveAccountType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
