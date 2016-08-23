
package com.elong.nb.agent.ProductForPartnerServiceContract;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>AuthorizationType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="AuthorizationType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ECM"/&gt;
 *     &lt;enumeration value="AuthorizationFirst"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AuthorizationType", namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Enums")
@XmlEnum
public enum AuthorizationType {

    ECM("ECM"),
    @XmlEnumValue("AuthorizationFirst")
    AUTHORIZATION_FIRST("AuthorizationFirst");
    private final String value;

    AuthorizationType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AuthorizationType fromValue(String v) {
        for (AuthorizationType c: AuthorizationType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
