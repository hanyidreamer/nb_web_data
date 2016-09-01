
package com.elong.nb.agent.NorthBoundForAPIService;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ERoomAdditionsType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="ERoomAdditionsType"&gt;
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
 *     &lt;enumeration value="OpaqueHotel"/&gt;
 *     &lt;enumeration value="LobbyAndBedRoom"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ERoomAdditionsType", namespace = "http://schemas.datacontract.org/2004/07/Com.Elong.Utility.Hotel.Enum")
@XmlEnum
public enum ERoomAdditionsType {

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
    @XmlEnumValue("OpaqueHotel")
    OPAQUE_HOTEL("OpaqueHotel"),
    @XmlEnumValue("LobbyAndBedRoom")
    LOBBY_AND_BED_ROOM("LobbyAndBedRoom");
    private final String value;

    ERoomAdditionsType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ERoomAdditionsType fromValue(String v) {
        for (ERoomAdditionsType c: ERoomAdditionsType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
