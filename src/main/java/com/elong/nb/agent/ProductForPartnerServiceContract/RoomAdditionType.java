
package com.elong.nb.agent.ProductForPartnerServiceContract;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>RoomAdditionType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="RoomAdditionType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BedType"/&gt;
 *     &lt;enumeration value="FloorType"/&gt;
 *     &lt;enumeration value="InternetService"/&gt;
 *     &lt;enumeration value="InternetServiceType"/&gt;
 *     &lt;enumeration value="WindowType"/&gt;
 *     &lt;enumeration value="SmokingRoom"/&gt;
 *     &lt;enumeration value="BedNumbers"/&gt;
 *     &lt;enumeration value="PersonNumber"/&gt;
 *     &lt;enumeration value="Bathroom"/&gt;
 *     &lt;enumeration value="FaceDirection"/&gt;
 *     &lt;enumeration value="Scene"/&gt;
 *     &lt;enumeration value="Otherservice"/&gt;
 *     &lt;enumeration value="OpacHotel"/&gt;
 *     &lt;enumeration value="LobbyAndBedRoom"/&gt;
 *     &lt;enumeration value="EB_Room"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RoomAdditionType", namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Product.Entities.Enums")
@XmlEnum
public enum RoomAdditionType {

    @XmlEnumValue("BedType")
    BED_TYPE("BedType"),
    @XmlEnumValue("FloorType")
    FLOOR_TYPE("FloorType"),
    @XmlEnumValue("InternetService")
    INTERNET_SERVICE("InternetService"),
    @XmlEnumValue("InternetServiceType")
    INTERNET_SERVICE_TYPE("InternetServiceType"),
    @XmlEnumValue("WindowType")
    WINDOW_TYPE("WindowType"),
    @XmlEnumValue("SmokingRoom")
    SMOKING_ROOM("SmokingRoom"),
    @XmlEnumValue("BedNumbers")
    BED_NUMBERS("BedNumbers"),
    @XmlEnumValue("PersonNumber")
    PERSON_NUMBER("PersonNumber"),
    @XmlEnumValue("Bathroom")
    BATHROOM("Bathroom"),
    @XmlEnumValue("FaceDirection")
    FACE_DIRECTION("FaceDirection"),
    @XmlEnumValue("Scene")
    SCENE("Scene"),
    @XmlEnumValue("Otherservice")
    OTHERSERVICE("Otherservice"),
    @XmlEnumValue("OpacHotel")
    OPAC_HOTEL("OpacHotel"),
    @XmlEnumValue("LobbyAndBedRoom")
    LOBBY_AND_BED_ROOM("LobbyAndBedRoom"),
    @XmlEnumValue("EB_Room")
    EB_ROOM("EB_Room");
    private final String value;

    RoomAdditionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RoomAdditionType fromValue(String v) {
        for (RoomAdditionType c: RoomAdditionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
