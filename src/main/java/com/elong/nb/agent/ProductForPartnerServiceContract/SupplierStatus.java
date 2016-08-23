
package com.elong.nb.agent.ProductForPartnerServiceContract;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>SupplierStatus的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="SupplierStatus"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Abandon"/&gt;
 *     &lt;enumeration value="Active"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SupplierStatus", namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Enums")
@XmlEnum
public enum SupplierStatus {

    @XmlEnumValue("Abandon")
    ABANDON("Abandon"),
    @XmlEnumValue("Active")
    ACTIVE("Active");
    private final String value;

    SupplierStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SupplierStatus fromValue(String v) {
        for (SupplierStatus c: SupplierStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
