
package com.elong.nb.agent.ProductForPartnerServiceContract;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ServiceResponseBase complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ServiceResponseBase"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Result" type="{http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Framework}ResponseResult" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceResponseBase", namespace = "http://schemas.datacontract.org/2004/07/com.eLong.Hotel.Framework", propOrder = {
    "result"
})
@XmlSeeAlso({
    GetInventoryChangeDetailResponse.class,
    GetInventoryChangeListResponse.class,
    GetInventoryChangeMinIDResponse.class,
    GetInvChangeAndInstantConfirmResponse.class,
    FreeSaleResponse.class,
    GetInventoryRoomStatusResponse.class,
    GetResSupplyUseGroupHotel3Response.class,
    GetBuyedInventoryResponse.class,
    CreateRatePalnPolicyResponse.class,
    DeleteVouchPolicyByDateSpan4PartnerResponse.class,
    DeletePrepayPolicyByDateSpan4PartnerResponse.class,
    GetBedInfoToOtherSysResponse.class,
    IsUseDcInvResponse.class,
    EditInvStatus4DCResponse.class,
    IsDCRoomBackupResponse.class,
    EditRoomAmount4PartnersResponse.class,
    EditRoomStatus4PartnersResponse.class,
    BatchEditInvAmountAndStatusForEBookingResponse.class,
    EditInventoryEndDate4PartnersResponse.class,
    GetHotelInventoryDetail4PartnersResponse.class,
    GetHotelInventoryDetail4PartnersIntResponse.class,
    GetEbookingRoomNumHisHotel3Response.class,
    GetSupplierInfoBySettlementTypeResponse.class,
    HotelResourceInventoryStateInfoProcResponse.class,
    SaveBedInfoResponse.class,
    GetSupplierSwitchStatusResponse.class,
    GetHotelSwitchStatusResponse.class,
    AddMHotelInfoResponse.class,
    CreateShotelForPartnerResponse.class,
    CheckMHotelNameResponse.class,
    GetSupplierInfoResponse.class,
    SaveRoomOverSaleInventory4PartnerResponse.class,
    BatchReplaceInventory4PartnerResponse.class,
    GetRoomTypeByShotelIdResponse.class
})
public class ServiceResponseBase {

    @XmlElement(name = "Result", nillable = true)
    protected ResponseResult result;

    /**
     * 获取result属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ResponseResult }
     *     
     */
    public ResponseResult getResult() {
        return result;
    }

    /**
     * 设置result属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseResult }
     *     
     */
    public void setResult(ResponseResult value) {
        this.result = value;
    }

}
