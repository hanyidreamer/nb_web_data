package com.elong.nb.model.rateplan;

import java.util.Date;

import com.elong.nb.model.bean.enums.EnumBookingRule;
import com.elong.nb.model.bean.enums.EnumDateType;

public class BaseBookingRule extends BaseRule {

	/// <summary>
    /// 规则类型
    /// </summary>
    private EnumBookingRule TypeCode ;


    /// <summary>
    /// 关联房型编码
    /// </summary>
    private String RoomTypeIds ;



    /// <summary>
    /// 日期类型
    /// </summary>
    private EnumDateType DateType ;

    /// <summary>
    /// 开始日期
    /// </summary>
    private Date StartDate ;

    /// <summary>
    /// 结束日期
    /// </summary>
    private Date EndDate ;

    /// <summary>
    /// 每天开始时间
    /// </summary>

    private String  StartHour ;
     


    /// <summary>
    /// 每天结束时间
    /// </summary>

    private String  EndHour ;



    public EnumBookingRule getTypeCode() {
		return TypeCode;
	}



	public void setTypeCode(EnumBookingRule typeCode) {
		TypeCode = typeCode;
	}



	public String getRoomTypeIds() {
		return RoomTypeIds;
	}



	public void setRoomTypeIds(String roomTypeIds) {
		RoomTypeIds = roomTypeIds;
	}



	public EnumDateType getDateType() {
		return DateType;
	}



	public void setDateType(EnumDateType dateType) {
		DateType = dateType;
	}



	public Date getStartDate() {
		return StartDate;
	}



	public void setStartDate(Date startDate) {
		StartDate = startDate;
	}



	public Date getEndDate() {
		return EndDate;
	}



	public void setEndDate(Date endDate) {
		EndDate = endDate;
	}



	public String getStartHour() {
		return StartHour;
	}



	public void setStartHour(String startHour) {
		StartHour = startHour;
	}



	public String getEndHour() {
		return EndHour;
	}



	public void setEndHour(String endHour) {
		EndHour = endHour;
	}



	public String BuildDescription(boolean isCN)
    {
        StringBuilder sb = new StringBuilder();
        
        switch (this.TypeCode.getValue())
        {
            case 0:
               
                break;
            case 1:
                if (isCN)
                {
                    sb.append("酒店要求客人务必提供国籍 ");
                }
                else
                {
                    sb.append("Traveler’s nationality is necessary for this booking");
                }
                break;
            case 2:
                if (isCN)
                {
                    sb.append("酒店要求每个房间至少提供一名入住客人的姓名");
                }
                else
                {
                    sb.append("Please provide at least 1 guest name for each room booked");
                }
                break;
            case 3:
                if (isCN)
                {
                    sb.append("酒店要求外宾务必留英文拼写");
                }
                else
                {
                    sb.append("For traveler without Chinese ID card, please enter the name in English");
                }
                break;
            case 4:
                if (isCN)
                {
                    sb.append(this.StartHour+"点到"+this.EndHour+"点酒店不接受预订 ");
                }
                else
                {
                    sb.append("The hotel doesn’t provide check-in service between "+this.StartHour+" and "+this.EndHour);
                }
                break;
            case 5:
                if (isCN)
                {
                    sb.append("酒店要求客人务必提供手机号");
                }
                else
                {
                    sb.append("Traveler’s mobile number is necessary for this booking");
                }
                break;
            default:
                break;
        }

        return sb.toString();
    }
}

