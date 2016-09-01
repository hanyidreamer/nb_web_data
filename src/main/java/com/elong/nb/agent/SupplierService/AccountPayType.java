
package com.elong.nb.agent.SupplierService;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>AccountPayType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="AccountPayType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="Company"/>
 *     &lt;enumeration value="Personal"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AccountPayType", namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Enums")
@XmlEnum
public enum AccountPayType {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Company")
    COMPANY("Company"),
    @XmlEnumValue("Personal")
    PERSONAL("Personal");
    private final String value;

    AccountPayType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AccountPayType fromValue(String v) {
        for (AccountPayType c: AccountPayType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
