
package com.elong.nb.agent.ProductForSearchServiceForRealTimeCheck;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>OnlineSearchType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="OnlineSearchType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Elong"/&gt;
 *     &lt;enumeration value="Ean"/&gt;
 *     &lt;enumeration value="Marriott"/&gt;
 *     &lt;enumeration value="OnlineCheckWhenCompletingOrder"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OnlineSearchType", namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Enums")
@XmlEnum
public enum OnlineSearchType {

    @XmlEnumValue("Elong")
    ELONG("Elong"),
    @XmlEnumValue("Ean")
    EAN("Ean"),
    @XmlEnumValue("Marriott")
    MARRIOTT("Marriott"),
    @XmlEnumValue("OnlineCheckWhenCompletingOrder")
    ONLINE_CHECK_WHEN_COMPLETING_ORDER("OnlineCheckWhenCompletingOrder");
    private final String value;

    OnlineSearchType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OnlineSearchType fromValue(String v) {
        for (OnlineSearchType c: OnlineSearchType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
