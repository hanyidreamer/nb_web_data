
package com.elong.nb.agent.ProductForPartnerServiceContract;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>InventoryType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="InventoryType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="OverSale"/&gt;
 *     &lt;enumeration value="Add"/&gt;
 *     &lt;enumeration value="Contract"/&gt;
 *     &lt;enumeration value="Buyout"/&gt;
 *     &lt;enumeration value="DCOverSale"/&gt;
 *     &lt;enumeration value="DCAdd"/&gt;
 *     &lt;enumeration value="DCContract"/&gt;
 *     &lt;enumeration value="DCBuyout"/&gt;
 *     &lt;enumeration value="NoDeclare"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "InventoryType", namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Enums.Inventory")
@XmlEnum
public enum InventoryType {

    @XmlEnumValue("OverSale")
    OVER_SALE("OverSale"),
    @XmlEnumValue("Add")
    ADD("Add"),
    @XmlEnumValue("Contract")
    CONTRACT("Contract"),
    @XmlEnumValue("Buyout")
    BUYOUT("Buyout"),
    @XmlEnumValue("DCOverSale")
    DC_OVER_SALE("DCOverSale"),
    @XmlEnumValue("DCAdd")
    DC_ADD("DCAdd"),
    @XmlEnumValue("DCContract")
    DC_CONTRACT("DCContract"),
    @XmlEnumValue("DCBuyout")
    DC_BUYOUT("DCBuyout"),
    @XmlEnumValue("NoDeclare")
    NO_DECLARE("NoDeclare");
    private final String value;

    InventoryType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static InventoryType fromValue(String v) {
        for (InventoryType c: InventoryType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
