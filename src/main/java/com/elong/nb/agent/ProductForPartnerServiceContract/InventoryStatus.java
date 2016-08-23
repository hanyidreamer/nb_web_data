
package com.elong.nb.agent.ProductForPartnerServiceContract;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>InventoryStatus的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="InventoryStatus"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Open"/&gt;
 *     &lt;enumeration value="ManualClose"/&gt;
 *     &lt;enumeration value="SaleClose"/&gt;
 *     &lt;enumeration value="TimeOverClose"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "InventoryStatus", namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Enums.Inventory")
@XmlEnum
public enum InventoryStatus {

    @XmlEnumValue("Open")
    OPEN("Open"),
    @XmlEnumValue("ManualClose")
    MANUAL_CLOSE("ManualClose"),
    @XmlEnumValue("SaleClose")
    SALE_CLOSE("SaleClose"),
    @XmlEnumValue("TimeOverClose")
    TIME_OVER_CLOSE("TimeOverClose");
    private final String value;

    InventoryStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static InventoryStatus fromValue(String v) {
        for (InventoryStatus c: InventoryStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
