
package com.elong.nb.agent.ProductForSearchServiceForRealTimeCheck;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>InventoryAndPriceCheckResult的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="InventoryAndPriceCheckResult"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Available"/&gt;
 *     &lt;enumeration value="InventoryClose"/&gt;
 *     &lt;enumeration value="PriceChanged"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "InventoryAndPriceCheckResult", namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Enums")
@XmlEnum
public enum InventoryAndPriceCheckResult {

    @XmlEnumValue("Available")
    AVAILABLE("Available"),
    @XmlEnumValue("InventoryClose")
    INVENTORY_CLOSE("InventoryClose"),
    @XmlEnumValue("PriceChanged")
    PRICE_CHANGED("PriceChanged");
    private final String value;

    InventoryAndPriceCheckResult(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static InventoryAndPriceCheckResult fromValue(String v) {
        for (InventoryAndPriceCheckResult c: InventoryAndPriceCheckResult.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
