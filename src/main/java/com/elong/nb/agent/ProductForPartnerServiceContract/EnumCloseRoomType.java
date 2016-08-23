
package com.elong.nb.agent.ProductForPartnerServiceContract;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>EnumCloseRoomType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="EnumCloseRoomType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="None"/&gt;
 *     &lt;enumeration value="Ebooking_RejectReserve"/&gt;
 *     &lt;enumeration value="Ebooking_MaintainRoom"/&gt;
 *     &lt;enumeration value="PMS"/&gt;
 *     &lt;enumeration value="MIS_PSG"/&gt;
 *     &lt;enumeration value="MIS_OPCenter"/&gt;
 *     &lt;enumeration value="MIS_RC"/&gt;
 *     &lt;enumeration value="SellOut_CreateOrder"/&gt;
 *     &lt;enumeration value="SellOut_UpdateOrder"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EnumCloseRoomType", namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Enums.Inventory")
@XmlEnum
public enum EnumCloseRoomType {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Ebooking_RejectReserve")
    EBOOKING_REJECT_RESERVE("Ebooking_RejectReserve"),
    @XmlEnumValue("Ebooking_MaintainRoom")
    EBOOKING_MAINTAIN_ROOM("Ebooking_MaintainRoom"),
    PMS("PMS"),
    MIS_PSG("MIS_PSG"),
    @XmlEnumValue("MIS_OPCenter")
    MIS_OP_CENTER("MIS_OPCenter"),
    MIS_RC("MIS_RC"),
    @XmlEnumValue("SellOut_CreateOrder")
    SELL_OUT_CREATE_ORDER("SellOut_CreateOrder"),
    @XmlEnumValue("SellOut_UpdateOrder")
    SELL_OUT_UPDATE_ORDER("SellOut_UpdateOrder");
    private final String value;

    EnumCloseRoomType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EnumCloseRoomType fromValue(String v) {
        for (EnumCloseRoomType c: EnumCloseRoomType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
