
package com.elong.nb.agent.SupplierService;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>InvoiceMode的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="InvoiceMode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NoSense"/>
 *     &lt;enumeration value="Elong"/>
 *     &lt;enumeration value="Hotel"/>
 *     &lt;enumeration value="ElongAfter"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "InvoiceMode", namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Enums")
@XmlEnum
public enum InvoiceMode {

    @XmlEnumValue("NoSense")
    NO_SENSE("NoSense"),
    @XmlEnumValue("Elong")
    ELONG("Elong"),
    @XmlEnumValue("Hotel")
    HOTEL("Hotel"),
    @XmlEnumValue("ElongAfter")
    ELONG_AFTER("ElongAfter");
    private final String value;

    InvoiceMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static InvoiceMode fromValue(String v) {
        for (InvoiceMode c: InvoiceMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
