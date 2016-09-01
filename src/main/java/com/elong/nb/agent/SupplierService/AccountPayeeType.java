
package com.elong.nb.agent.SupplierService;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>AccountPayeeType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="AccountPayeeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NoSense"/>
 *     &lt;enumeration value="Bank"/>
 *     &lt;enumeration value="Tenpay"/>
 *     &lt;enumeration value="Alipay"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AccountPayeeType", namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Enums")
@XmlEnum
public enum AccountPayeeType {

    @XmlEnumValue("NoSense")
    NO_SENSE("NoSense"),
    @XmlEnumValue("Bank")
    BANK("Bank"),
    @XmlEnumValue("Tenpay")
    TENPAY("Tenpay"),
    @XmlEnumValue("Alipay")
    ALIPAY("Alipay");
    private final String value;

    AccountPayeeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AccountPayeeType fromValue(String v) {
        for (AccountPayeeType c: AccountPayeeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
