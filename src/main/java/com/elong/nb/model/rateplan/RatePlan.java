package com.elong.nb.model.rateplan;

import java.util.List;

import com.elong.nb.model.bean.enums.EnumGuestTypeCode;
import com.google.gson.annotations.Since;

public class RatePlan extends BaseRatePlan {

	/// <summary>
    /// 对应的酒店编码
    /// </summary>
    private String HotelCode;


    /// <summary>
    /// 关联的房型编码
    /// </summary>
    private String RoomTypeIds ;

    /// <summary>
    /// From v1.01
    /// 1=统一价；2=内宾价；3=外宾价；4=港澳台客人价；5=日本客人价
    /// </summary>
    @Since(1.01)
    private EnumGuestTypeCode CustomerType ;

    /// <summary>
    /// From v1.01
    /// 产品特性类型
    /// 3---限时抢购
    /// 4---钟点房
    /// 5---手机专享
    /// </summary>
    @Since(1.01)
    private String ProductTypes;

    /// <summary>
    /// From v1.01
    /// 是否是今日特价(尾房) 
    /// </summary>
    @Since(1.01)
    private boolean IsLimitTimeSale;

    /// <summary>
    /// 每天预定开始时间(默认值：00:00)
    /// </summary>
    private String StartTime;

    /// <summary>
    /// 每天预定结束时间(默认值:23:59)
    /// </summary>
    private String EndTime;


    /// <summary>
    /// 最少提前预定小时数(默认值：0)
    /// </summary>
    private int MinAdvHours ;


    /// <summary>
    /// 最多提前预定小时数(默认值：2160)
    /// </summary>
    private int MaxAdvHours;


    /// <summary>
    /// 担保规则
    /// </summary>
    private List<com.elong.nb.model.bean.base.BaseGuaranteeRule> GuaranteeRules;

    /// <summary>
    /// 预付规则
    /// </summary>
    private List<com.elong.nb.model.bean.base.BasePrepayRule> PrepayRules;

    /// <summary>
    /// 促销
    /// </summary>
    //public List<BasePromotionRule> Promotions { get; set; }

    /// <summary>
    /// 增值服务
    /// </summary>
    private List<com.elong.nb.model.bean.base.BaseValueAddRule> ValueAdds;

    /// <summary>
    /// 促销规则
    /// </summary>
    private List<com.elong.nb.model.bean.base.BaseDrrRule> DrrRules;

    /// <summary>
    /// 返现或立减
    /// </summary>
    private Coupon Coupon ;


    /// <summary>
    /// 礼包信息 V1.01生效,
    /// V1.11废除
    /// </summary>
    @Since(1.01)
    private List<GiftForRP> Gifts;


    /// <summary>
    /// 预订渠道:1---Online, 2---Offline, 3---Mobile
    /// </summary>
    @Since(1.20)
    private String BookingChannels;

    /// <summary>
    /// 可卖的会员等级集合0:非会员 1:普通会员 2:贵宾会员 3:龙萃会员 4:钻石龙萃
    /// </summary>
    @Since(1.25)
    private int[] CustomerLevel;
    /// <summary>
    /// CooperationType=1为直签，2为非直签，0为未知
    /// </summary>
    @Since(1.27)
    private int CooperationType ;
    
    
	public String getHotelCode() {
		return HotelCode;
	}
	public void setHotelCode(String hotelCode) {
		HotelCode = hotelCode;
	}
	public String getRoomTypeIds() {
		return RoomTypeIds;
	}
	public void setRoomTypeIds(String roomTypeIds) {
		RoomTypeIds = roomTypeIds;
	}
	public EnumGuestTypeCode getCustomerType() {
		return CustomerType;
	}
	public void setCustomerType(EnumGuestTypeCode customerType) {
		CustomerType = customerType;
	}
	public String getProductTypes() {
		return ProductTypes;
	}
	public void setProductTypes(String productTypes) {
		ProductTypes = productTypes;
	}
	public boolean isIsLimitTimeSale() {
		return IsLimitTimeSale;
	}
	public void setIsLimitTimeSale(boolean isLimitTimeSale) {
		IsLimitTimeSale = isLimitTimeSale;
	}
	public String getStartTime() {
		return StartTime;
	}
	public void setStartTime(String startTime) {
		StartTime = startTime;
	}
	public String getEndTime() {
		return EndTime;
	}
	public void setEndTime(String endTime) {
		EndTime = endTime;
	}
	public int getMinAdvHours() {
		return MinAdvHours;
	}
	public void setMinAdvHours(int minAdvHours) {
		MinAdvHours = minAdvHours;
	}
	public int getMaxAdvHours() {
		return MaxAdvHours;
	}
	public void setMaxAdvHours(int maxAdvHours) {
		MaxAdvHours = maxAdvHours;
	}
	public List<com.elong.nb.model.bean.base.BaseGuaranteeRule> getGuaranteeRules() {
		return GuaranteeRules;
	}
	public void setGuaranteeRules(List<com.elong.nb.model.bean.base.BaseGuaranteeRule> guaranteeRules) {
		GuaranteeRules = guaranteeRules;
	}
	public List<com.elong.nb.model.bean.base.BasePrepayRule> getPrepayRules() {
		return PrepayRules;
	}
	public void setPrepayRules(List<com.elong.nb.model.bean.base.BasePrepayRule> prepayRules) {
		PrepayRules = prepayRules;
	}
	public List<com.elong.nb.model.bean.base.BaseValueAddRule> getValueAdds() {
		return ValueAdds;
	}
	public void setValueAdds(List<com.elong.nb.model.bean.base.BaseValueAddRule> valueAdds) {
		ValueAdds = valueAdds;
	}
	public List<com.elong.nb.model.bean.base.BaseDrrRule> getDrrRules() {
		return DrrRules;
	}
	public void setDrrRules(List<com.elong.nb.model.bean.base.BaseDrrRule> drrRules) {
		DrrRules = drrRules;
	}
	public Coupon getCoupon() {
		return Coupon;
	}
	public void setCoupon(Coupon coupon) {
		Coupon = coupon;
	}
	public List<GiftForRP> getGifts() {
		return Gifts;
	}
	public void setGifts(List<GiftForRP> gifts) {
		Gifts = gifts;
	}
	public String getBookingChannels() {
		return BookingChannels;
	}
	public void setBookingChannels(String bookingChannels) {
		BookingChannels = bookingChannels;
	}
	public int[] getCustomerLevel() {
		return CustomerLevel;
	}
	public void setCustomerLevel(int[] customerLevel) {
		CustomerLevel = customerLevel;
	}
	public int getCooperationType() {
		return CooperationType;
	}
	public void setCooperationType(int cooperationType) {
		CooperationType = cooperationType;
	}

    
    /*
    [OnSerializing]
    private void OnSerializingMethod(StreamingContext context)
    {
        if (ApiContext.Current.Version < 1.01)
        {
            this.Gifts = null;
            this.CustomerType = null;
            this.ProductTypes = null;
            this.IsLimitTimeSale = null;
        }

        //V1.11废除
        if (ApiContext.Current.Version >= 1.11)
        {
            this.Gifts = null;
        }

        if (ApiContext.Current.Version < 1.20)
        {
            this.BookingChannels = null;
        }
        if (ApiContext.Current.Version < 1.25)
        {
            this.CustomerLevel = null;
        }
        if (ApiContext.Current.Version < 1.27) 
        {
            this.CooperationType = null;
        }
    }
    */
    
}
