package com.elong.nb.dao.adapter;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import org.apache.commons.httpclient.util.DateUtil;
import org.apache.commons.lang3.StringUtils;

import com.elong.hotel.goods.ds.thrift.MetaDRRInfo;
import com.elong.hotel.goods.ds.thrift.MetaPrePayInfo;
import com.elong.hotel.goods.ds.thrift.MetaVouchInfo;

public class DescriptionHelper {
	private static String getWeekSet(long timeSet){
		List<Integer> set=new LinkedList<Integer>();
		for(int i=1;i<=7;i++){
			if((timeSet&(long)Math.pow(2, i))==Math.pow(2, i)){
				set.add(i);
			}
		}
		return StringUtils.join(set,",");
	}
	/**
	 * 促销规则描述字段话术
	 * @param metaDRRInfo
	 * @param isCn
	 * @return
	 */
	public static String drrDescription(MetaDRRInfo metaDRRInfo,boolean isCn){
		StringBuilder res = new StringBuilder();
		switch(metaDRRInfo.getDrr_rule()){
			case 1:
				if(isCn){
					res.append("促销规则：");
					String dateType = "";
					if(metaDRRInfo.getDate_type() == 1){
						dateType = "入住日期";
					}
					else if(metaDRRInfo.getDate_type() == 2){
						dateType = "在店日期";
					}
					else if(metaDRRInfo.getDate_type() == 3){
						dateType = "预定日期";
					}
					res.append(dateType).append("在").append(DateUtil.formatDate(new Date(metaDRRInfo.getStart_date()),"yyyy.MM.dd")).append("-").append(DateUtil.formatDate(new Date(metaDRRInfo.getEnd_date()),"yyyy.MM.dd")).append(", ")
					.append("提前").append(metaDRRInfo.getRuleValues().get("DayNum")).append("天预订，每间晚优惠");
					if("1".equals(metaDRRInfo.getRuleValues().get("CashScale"))){
						res.append(metaDRRInfo.getRuleValues().get("DeductNum")).append("元");
					}
					else if("2".equals(metaDRRInfo.getRuleValues().get("CashScale"))){
						res.append(metaDRRInfo.getRuleValues().get("DeductNum")).append("%");
					}
				}
				else{
					if("1".equals(metaDRRInfo.getRuleValues().get("CashScale"))){
						res.append(" save ").append(metaDRRInfo.getRuleValues().get("DeductNum"));
					}
					else if("2".equals(metaDRRInfo.getRuleValues().get("CashScale"))){
						res.append(metaDRRInfo.getRuleValues().get("DeductNum")).append(" off");
					}
					res.append(", ").append(metaDRRInfo.getRuleValues().get("DayNum")).append("-day Advance Booking");
				}
				break;
			case 2:
				if(isCn){
					res.append("促销规则：");
					String dateType = "";
					if(metaDRRInfo.getDate_type() == 1){
						dateType = "入住日期";
					}
					else if(metaDRRInfo.getDate_type() == 2){
						dateType = "在店日期";
					}
					else if(metaDRRInfo.getDate_type() == 3){
						dateType = "预定日期";
					}
					res.append(dateType).append("在").append(DateUtil.formatDate(new Date(metaDRRInfo.getStart_date()),"yyyy.MM.dd")).append("-").append(DateUtil.formatDate(new Date(metaDRRInfo.getEnd_date()),"yyyy.MM.dd")).append(", ")
					.append("连住").append(metaDRRInfo.getRuleValues().get("CheckInNum")).append("晚起，每间晚优惠");
					if("1".equals(metaDRRInfo.getRuleValues().get("CashScale"))){
						res.append(metaDRRInfo.getRuleValues().get("DeductNum")).append("元");
					}
					else if("2".equals(metaDRRInfo.getRuleValues().get("CashScale"))){
						res.append(metaDRRInfo.getRuleValues().get("DeductNum")).append("%");
					}
				}
				else{
					if("1".equals(metaDRRInfo.getRuleValues().get("CashScale"))){
						res.append(" save ").append(metaDRRInfo.getRuleValues().get("DeductNum"));
					}
					else if("2".equals(metaDRRInfo.getRuleValues().get("CashScale"))){
						res.append(metaDRRInfo.getRuleValues().get("DeductNum")).append(" off");
					}
					res.append(", Minimum ").append(metaDRRInfo.getRuleValues().get("CheckInNum")).append("-night stay");
				}
				break;
			case 3:
				if(isCn){
					res.append("促销规则：");
					String dateType = "";
					if(metaDRRInfo.getDate_type() == 1){
						dateType = "入住日期";
					}
					else if(metaDRRInfo.getDate_type() == 2){
						dateType = "在店日期";
					}
					else if(metaDRRInfo.getDate_type() == 3){
						dateType = "预定日期";
					}
					res.append(dateType).append("在").append(DateUtil.formatDate(new Date(metaDRRInfo.getStart_date()),"yyyy.MM.dd")).append("-").append(DateUtil.formatDate(new Date(metaDRRInfo.getEnd_date()),"yyyy.MM.dd")).append(", ")
					.append("连住").append(metaDRRInfo.getRuleValues().get("CheckInNum")).append("晚起，最后").append(metaDRRInfo.getRuleValues().get("LastDayNum")).append("晚优惠");
					if("1".equals(metaDRRInfo.getRuleValues().get("CashScale"))){
						res.append(metaDRRInfo.getRuleValues().get("DeductNum")).append("元");
					}
					else if("2".equals(metaDRRInfo.getRuleValues().get("CashScale"))){
						res.append(metaDRRInfo.getRuleValues().get("DeductNum")).append("%");
					}
				}
				else{
					res.append("Minimum ").append(metaDRRInfo.getRuleValues().get("CheckInNum")).append("-night stay, ");
					if("1".equals(metaDRRInfo.getRuleValues().get("CashScale"))){
						res.append(" save ").append(metaDRRInfo.getRuleValues().get("DeductNum"));
					}
					else if("2".equals(metaDRRInfo.getRuleValues().get("CashScale"))){
						res.append(metaDRRInfo.getRuleValues().get("DeductNum")).append(" off");
					}
					res.append(" for the ").append("Last ").append(metaDRRInfo.getRuleValues().get("LastDayNum")).append("-night");
				}
				break;
			case 4:
				if(isCn){
					res.append("促销规则：");
					String dateType = "";
					if(metaDRRInfo.getDate_type() == 1){
						dateType = "入住日期";
					}
					else if(metaDRRInfo.getDate_type() == 2){
						dateType = "在店日期";
					}
					else if(metaDRRInfo.getDate_type() == 3){
						dateType = "预定日期";
					}
					res.append(dateType).append("在").append(DateUtil.formatDate(new Date(metaDRRInfo.getStart_date()),"yyyy.MM.dd")).append("-").append(DateUtil.formatDate(new Date(metaDRRInfo.getEnd_date()),"yyyy.MM.dd")).append(", ")
					.append("连住").append(metaDRRInfo.getRuleValues().get("CheckInNum")).append("晚起，第").append(metaDRRInfo.getRuleValues().get("WhichDayNum")).append("晚起优惠");
					if("1".equals(metaDRRInfo.getRuleValues().get("CashScale"))){
						res.append(metaDRRInfo.getRuleValues().get("DeductNum")).append("元");
					}
					else if("2".equals(metaDRRInfo.getRuleValues().get("CashScale"))){
						res.append(metaDRRInfo.getRuleValues().get("DeductNum")).append("%");
					}
				}
				else{
					res.append("Minimum ").append(metaDRRInfo.getRuleValues().get("CheckInNum")).append("-night stay, ");
					if("1".equals(metaDRRInfo.getRuleValues().get("CashScale"))){
						res.append(" save ").append(metaDRRInfo.getRuleValues().get("DeductNum"));
					}
					if("2".equals(metaDRRInfo.getRuleValues().get("CashScale"))){
						res.append(metaDRRInfo.getRuleValues().get("DeductNum")).append(" off");
					}
					String th = "";
					if("1".equals(metaDRRInfo.getRuleValues().get("WhichDayNum"))){
						th = "First";
					}
					else if("2".equals(metaDRRInfo.getRuleValues().get("WhichDayNum"))){
						th = "Second";						
					}
					else if("3".equals(metaDRRInfo.getRuleValues().get("WhichDayNum"))){
						th = "Third";
					}
					else if("4".equals(metaDRRInfo.getRuleValues().get("WhichDayNum"))){
						th = "Fourtch";
					}
					else if("5".equals(metaDRRInfo.getRuleValues().get("WhichDayNum"))){
						th = "Fifth";
					}
					res.append(th + " night");
				}
				break;
			case 5:
				if(isCn){
					res.append("促销规则：");
					String dateType = "";
					if(metaDRRInfo.getDate_type() == 1){
						dateType = "入住日期";
					}
					else if(metaDRRInfo.getDate_type() == 2){
						dateType = "在店日期";
					}
					else if(metaDRRInfo.getDate_type() == 3){
						dateType = "预定日期";
					}
					res.append(dateType).append("在").append(DateUtil.formatDate(new Date(metaDRRInfo.getStart_date()),"yyyy.MM.dd")).append("-").append(DateUtil.formatDate(new Date(metaDRRInfo.getEnd_date()),"yyyy.MM.dd")).append(", ")
					.append("每连住").append(metaDRRInfo.getRuleValues().get("EveryCheckInNum")).append("晚，最后").append(metaDRRInfo.getRuleValues().get("LastDayNum")).append("晚优惠");
					if("1".equals(metaDRRInfo.getRuleValues().get("CashScale"))){
						res.append(metaDRRInfo.getRuleValues().get("DeductNum")).append("元");
					}
					else if("2".equals(metaDRRInfo.getRuleValues().get("CashScale"))){
						res.append(metaDRRInfo.getRuleValues().get("DeductNum")).append("%");
					}
				}
				else{
					res.append("Stay Consecutive ").append(metaDRRInfo.getRuleValues().get("EveryCheckInNum")).append("-night, ");
					if("1".equals(metaDRRInfo.getRuleValues().get("CashScale"))){
						res.append(" save ").append(metaDRRInfo.getRuleValues().get("DeductNum"));
					}
					else if("2".equals(metaDRRInfo.getRuleValues().get("CashScale"))){
						res.append(metaDRRInfo.getRuleValues().get("DeductNum")).append(" off");
					}
					res.append(" for the ").append("Last ").append(metaDRRInfo.getRuleValues().get("LastDayNum")).append("-night");
				}
				break;
			case 6:
				if(isCn){
					res.append("促销规则：");
					String dateType = "";
					if(metaDRRInfo.getDate_type() == 1){
						dateType = "入住日期";
					}
					else if(metaDRRInfo.getDate_type() == 2){
						dateType = "在店日期";
					}
					else if(metaDRRInfo.getDate_type() == 3){
						dateType = "预定日期";
					}
					res.append(dateType).append("在").append(DateUtil.formatDate(new Date(metaDRRInfo.getStart_date()),"yyyy.MM.dd")).append("-").append(DateUtil.formatDate(new Date(metaDRRInfo.getEnd_date()),"yyyy.MM.dd")).append(", ")
					.append("在店日期包含").append(getWeekSet(metaDRRInfo.getIs_week_effective())).append("，按");
					if("1".equals(metaDRRInfo.getRuleValues().get("FeeType"))){
						res.append("周末价计算");
					}
					else if("2".equals(metaDRRInfo.getRuleValues().get("FeeType"))){
						res.append("平日价计算");
					}
				}
				else{
					if("1".equals(metaDRRInfo.getRuleValues().get("FeeType"))){
						res.append("weekend rate special");
					}
					else if("2".equals(metaDRRInfo.getRuleValues().get("FeeType"))){
						res.append("Special Promo");
					}
				}
				break;
			case 7:
				if(isCn){
					res.append("促销规则：");
					String dateType = "";
					if(metaDRRInfo.getDate_type() == 1){
						dateType = "入住日期";
					}
					else if(metaDRRInfo.getDate_type() == 2){
						dateType = "在店日期";
					}
					else if(metaDRRInfo.getDate_type() == 3){
						dateType = "预定日期";
					}
					res.append(dateType).append("在").append(DateUtil.formatDate(new Date(metaDRRInfo.getStart_date()),"yyyy.MM.dd")).append("-").append(DateUtil.formatDate(new Date(metaDRRInfo.getEnd_date()),"yyyy.MM.dd")).append(", ")
					.append("在店日期包含").append(getWeekSet(metaDRRInfo.getIs_week_effective())).append("，按");
					if("1".equals(metaDRRInfo.getRuleValues().get("FeeType"))){
						res.append("周末价计算");
					}
					else if("2".equals(metaDRRInfo.getRuleValues().get("FeeType"))){
						res.append("平日价计算");
					}
				}
				else{
					if("1".equals(metaDRRInfo.getRuleValues().get("FeeType"))){
						res.append("weekend rate special");
					}
					else if("2".equals(metaDRRInfo.getRuleValues().get("FeeType"))){
						res.append("Special Promo");
					}
				}
				break;
			default:
				break;
		}
	
		return res.toString();
	}
	/**
	 * 预付规则描述话术
	 * @param metaPrePayInfo
	 * @param isCn
	 * @return
	 */
	public static String prepayDescription(MetaPrePayInfo metaPrePayInfo,boolean isCn){
		StringBuilder res = new StringBuilder();
		switch(metaPrePayInfo.getPrepay_change_rule()){
			case 1:
				if(isCn){
					res.append("预付规则：在").append(DateUtil.formatDate(
							new Date(metaPrePayInfo.getStart_date()),
							"yyyy.MM.dd")).append(" 到").append(DateUtil.formatDate(
									new Date(metaPrePayInfo.getEnd_date()),
									"yyyy.MM.dd")).append("期间入住，需要提供信用卡预付全额房费。一经预订成功不可变更/取消。");
				}
				else{
					res.append(" Once the order has been submitted successfully,  it won't be possible to change or cancel it.");
				}
				break;
			case 2:
				if(isCn){
					res.append("预付规则：在").append(DateUtil.formatDate(
							new Date(metaPrePayInfo.getStart_date()),
							"yyyy.MM.dd")).append(" 到").append(DateUtil.formatDate(
									new Date(metaPrePayInfo.getEnd_date()),
									"yyyy.MM.dd")).append("期间入住");
					if(metaPrePayInfo.isCut_after_change_time()){
						res.append("，离到店日不足").append(metaPrePayInfo.getRule_values().get("HourNum")).append("小时取消将收取罚金");
						if("1".equals(metaPrePayInfo.getRule_values().get("CashScaleFirstAfter"))){
							res.append(metaPrePayInfo.getRule_values().get("DeductNumAfter")).append("元");
						}
						if("2".equals(metaPrePayInfo.getRule_values().get("CashScaleFirstAfter"))){
							res.append("全额房费的百分之").append(metaPrePayInfo.getRule_values().get("DeductNumAfter"));
						}
						if("3".equals(metaPrePayInfo.getRule_values().get("CashScaleFirstAfter"))){
							res.append("第一晚房费");
						}
					}
					res.append("，到店日不足").append(metaPrePayInfo.getRule_values().get("HourNum2")).append("小时之后无法取消。");
				}
				else{
					if(metaPrePayInfo.isCut_after_change_time()){
						res.append("Cancellations made within ").append(metaPrePayInfo.getRule_values().get("HourNum")).append(" hours before the check-in date are subject to penalty of ");
						if("1".equals(metaPrePayInfo.getRule_values().get("CashScaleFirstAfter"))){
							res.append(metaPrePayInfo.getRule_values().get("DeductNumAfter")).append("RMB");
						}
						if("2".equals(metaPrePayInfo.getRule_values().get("CashScaleFirstAfter"))){
							res.append(metaPrePayInfo.getRule_values().get("DeductNumAfter")).append("of total room rate.");
						}
						if("3".equals(metaPrePayInfo.getRule_values().get("CashScaleFirstAfter"))){
							res.append("the first night rate");
						}
					}
					res.append(" Within ").append(metaPrePayInfo.getRule_values().get("HourNum2")).append("hours before the check-in date , bookings will be non-refundable. ");
				}
				break;
			case 3:
				if(isCn){
					res.append("预付规则：在").append(DateUtil.formatDate(
							new Date(metaPrePayInfo.getStart_date()),
							"yyyy.MM.dd")).append(" 到").append(DateUtil.formatDate(
									new Date(metaPrePayInfo.getEnd_date()),
									"yyyy.MM.dd")).append("期间入住");
					if(metaPrePayInfo.isCut_after_change_time()){
						res.append("，在").append(metaPrePayInfo.getRule_values().get("DateNum")).append(" ").append(metaPrePayInfo.getRule_values().get("TimeNum")).append("之后").append(metaPrePayInfo.getRule_values().get("HourNum")).append("小时取消将收取罚金");
						if("1".equals(metaPrePayInfo.getRule_values().get("CashScaleFirstAfter"))){
							res.append(metaPrePayInfo.getRule_values().get("DeductNumAfter")).append("元");
						}
						if("2".equals(metaPrePayInfo.getRule_values().get("CashScaleFirstAfter"))){
							res.append("全额房费的百分之").append(metaPrePayInfo.getRule_values().get("DeductNumAfter"));
						}
						if("3".equals(metaPrePayInfo.getRule_values().get("CashScaleFirstAfter"))){
							res.append("第一晚房费");
						}
					}
					res.append("入住日之后无法取消。");
				}
				else{
					if(metaPrePayInfo.isCut_after_change_time()){
						res.append("Cancellations made within ").append(metaPrePayInfo.getRule_values().get("HourNum")).append(" between ").append(metaPrePayInfo.getRule_values().get("DateNum")).append(" ").append(metaPrePayInfo.getRule_values().get("TimeNum")).append(" and the check-in date are subject to penalty of ");
						if("1".equals(metaPrePayInfo.getRule_values().get("CashScaleFirstAfter"))){
							res.append(metaPrePayInfo.getRule_values().get("DeductNumAfter")).append("RMB");
						}
						if("2".equals(metaPrePayInfo.getRule_values().get("CashScaleFirstAfter"))){
							res.append(metaPrePayInfo.getRule_values().get("DeductNumAfter")).append("of total room rate.");
						}
						if("3".equals(metaPrePayInfo.getRule_values().get("CashScaleFirstAfter"))){
							res.append("the first night rate");
						}
					}
					res.append(" From the check-in date, bookings will be non-refundable. ");
				}
				break;
			default:
				break;
		}
		return res.toString();
	}
	/**
	 * 转换担保规则话术
	 * @param metaVouchInfo
	 * @param isCn
	 * @return
	 */
	public static String vouchInfoDescription(MetaVouchInfo metaVouchInfo,
			boolean isCn) {
		StringBuilder res = new StringBuilder();
		switch (metaVouchInfo.getVouch_change_rule()) {
		case 1:
			if (isCn) {
				res.append("担保条件：在")
						.append(DateUtil.formatDate(
								new Date(metaVouchInfo.getStart_date()),
								"yyyy.MM.dd"))
						.append("至")
						.append(DateUtil.formatDate(
								new Date(metaVouchInfo.getEndDate()),
								"yyyy.MM.dd"));
				if (metaVouchInfo.getDate_type() == 1) {
					res.append("入住");
				} else if (metaVouchInfo.getDate_type() == 2) {
					res.append("在店");
				}
				if (metaVouchInfo.isIs_arrive_time_vouch()
						&& metaVouchInfo.isIs_room_count_vouch()) {
					res.append(" 如果在")
							.append(metaVouchInfo.getArrive_start_time())
							.append("至")
							.append(metaVouchInfo.getArrive_end_time())
							.append("到店，或预订房量超过")
							.append(metaVouchInfo.getRoom_count())
							.append("间及以上");
				}
				if (metaVouchInfo.isIs_arrive_time_vouch()
						&& !metaVouchInfo.isIs_room_count_vouch()) {
					res.append(" 在")
							.append(metaVouchInfo.getArrive_start_time())
							.append("至" + metaVouchInfo.getArrive_end_time())
							.append("到店");
				}
				if (!metaVouchInfo.isIs_arrive_time_vouch()
						&& metaVouchInfo.isIs_room_count_vouch()) {
					res.append(" 如果预订房量超过")
							.append(metaVouchInfo.getRoom_count())
							.append("间及以上");
				}
				String vouchType = "";
				if (metaVouchInfo.getRule_values() != null
						&& metaVouchInfo.getRule_values().containsKey("Gage")) {
					if ("1".equals(metaVouchInfo.getRule_values().get("Gage"))) {
						vouchType = "信用卡";
					}
				}
				String vouchMoneyType = "";
				if (metaVouchInfo.getVouch_money_type() == 1) {
					vouchMoneyType = "第一晚房费";
				} else if (metaVouchInfo.getVouch_money_type() == 2) {
					vouchMoneyType = "全额房费";
				}
				res.append("，需要您提供").append(vouchType)
						.append("担保。预订后无法变更取消，如未入住，将扣除").append(vouchMoneyType)
						.append("作为违约金。");
			} else {
				String removeNextDayEndTime = metaVouchInfo
						.getArrive_end_time().replaceAll("次日", "");
				if (!metaVouchInfo.isIs_arrive_time_vouch()
						&& !metaVouchInfo.isIs_room_count_vouch()) {
					res.append("For Bookings with  check-in date between ")
							.append(DateUtil.formatDate(
									new Date(metaVouchInfo.getStart_date()),
									"yyyy.MM.dd"))
							.append(" and ")
							.append(DateUtil.formatDate(
									new Date(metaVouchInfo.getEndDate()),
									"yyyy.MM.dd")).append(", ");
				}
				if (metaVouchInfo.isIs_arrive_time_vouch()
						&& !metaVouchInfo.isIs_room_count_vouch()) {
					res.append("For Bookings with  check-in time between ")
							.append(metaVouchInfo.getArrive_start_time())
							.append(" and ").append(removeNextDayEndTime)
							.append(", ");
				}
				if (!metaVouchInfo.isIs_arrive_time_vouch()
						&& metaVouchInfo.isIs_room_count_vouch()) {
					res.append("For bookings with ")
							.append(metaVouchInfo.getRoom_count())
							.append("  rooms or above booked, ");
				}
				if (metaVouchInfo.isIs_arrive_time_vouch()
						&& metaVouchInfo.isIs_room_count_vouch()) {
					res.append("For bookings with ")
							.append(metaVouchInfo.getRoom_count())
							.append("  rooms or above booked, or check-in time between ")
							.append(metaVouchInfo.getArrive_start_time())
							.append(" and ").append(removeNextDayEndTime)
							.append(", ");
				}
				res.append("credit card information is required for guarantee. Once the booking is confirmed, it allows no cancellation or change.If you fail to check in, eLong is authorized to charge ");
				String vouchMoneyType = "";
				if (metaVouchInfo.getVouch_money_type() == 1) {
					vouchMoneyType = "first night room rate";
				} else if (metaVouchInfo.getVouch_money_type() == 2) {
					vouchMoneyType = "full room rate";
				}
				res.append(vouchMoneyType).append(" to your credit card.");
			}
			break;
		case 2:
			if (isCn) {
				res.append("担保条件：在")
						.append(DateUtil.formatDate(
								new Date(metaVouchInfo.getStart_date()),
								"yyyy.MM.dd"))
						.append("至")
						.append(DateUtil.formatDate(
								new Date(metaVouchInfo.getEndDate()),
								"yyyy.MM.dd"));
				if (metaVouchInfo.getDate_type() == 1) {
					res.append("入住");
				} else if (metaVouchInfo.getDate_type() == 2) {
					res.append("在店");
				}
				if (metaVouchInfo.isIs_arrive_time_vouch()
						&& metaVouchInfo.isIs_room_count_vouch()) {
					res.append(" 如果在")
							.append(metaVouchInfo.getArrive_start_time())
							.append("至")
							.append(metaVouchInfo.getArrive_end_time())
							.append("到店，或预订房量超过")
							.append(metaVouchInfo.getRoom_count())
							.append("间及以上");
				}
				if (metaVouchInfo.isIs_arrive_time_vouch()
						&& !metaVouchInfo.isIs_room_count_vouch()) {
					res.append(" 在")
							.append(metaVouchInfo.getArrive_start_time())
							.append("至" + metaVouchInfo.getArrive_end_time())
							.append("到店");
				}
				if (!metaVouchInfo.isIs_arrive_time_vouch()
						&& metaVouchInfo.isIs_room_count_vouch()) {
					res.append(" 如果预订房量超过")
							.append(metaVouchInfo.getRoom_count())
							.append("间及以上");
				}
				String vouchType = "";
				if (metaVouchInfo.getRule_values() != null
						&& metaVouchInfo.getRule_values().containsKey("Gage")) {
					if ("1".equals(metaVouchInfo.getRule_values().get("Gage"))) {
						vouchType = "信用卡";
					}
				}
				String vouchMoneyType = "";
				if (metaVouchInfo.getVouch_money_type() == 1) {
					vouchMoneyType = "第一晚房费";
				} else if (metaVouchInfo.getVouch_money_type() == 2) {
					vouchMoneyType = "全额房费";
				}
				res.append("，需要您提供").append(vouchType).append("担保。")
						.append("在")
						.append(metaVouchInfo.getRule_values().get("DayNum"))
						.append("日")
						.append(metaVouchInfo.getRule_values().get("TimeNum"))
						.append("点前可以变更取消，之后无法变更取消，").append("如未入住，将扣除")
						.append(vouchMoneyType).append("作为违约金。");
			} else {
				String removeNextDayEndTime = metaVouchInfo
						.getArrive_end_time().replaceAll("次日", "");
				if (!metaVouchInfo.isIs_arrive_time_vouch()
						&& !metaVouchInfo.isIs_room_count_vouch()) {
					res.append("For Bookings with  check-in date between ")
							.append(DateUtil.formatDate(
									new Date(metaVouchInfo.getStart_date()),
									"yyyy.MM.dd"))
							.append(" and ")
							.append(DateUtil.formatDate(
									new Date(metaVouchInfo.getEndDate()),
									"yyyy.MM.dd")).append(", ");
				}
				if (metaVouchInfo.isIs_arrive_time_vouch()
						&& !metaVouchInfo.isIs_room_count_vouch()) {
					res.append("For Bookings with  check-in time between ")
							.append(metaVouchInfo.getArrive_start_time())
							.append(" and ").append(removeNextDayEndTime)
							.append(", ");
				}
				if (!metaVouchInfo.isIs_arrive_time_vouch()
						&& metaVouchInfo.isIs_room_count_vouch()) {
					res.append("For bookings with ")
							.append(metaVouchInfo.getRoom_count())
							.append("  rooms or above booked, ");
				}
				if (metaVouchInfo.isIs_arrive_time_vouch()
						&& metaVouchInfo.isIs_room_count_vouch()) {
					res.append("For bookings with ")
							.append(metaVouchInfo.getRoom_count())
							.append("  rooms or above booked, or check-in time between ")
							.append(metaVouchInfo.getArrive_start_time())
							.append(" and ").append(removeNextDayEndTime)
							.append(", ");
				}
				res.append(
						"credit card information is required for guarantee. Once the booking is confirmed, free cancellation or change is allowed before ")
						.append(metaVouchInfo.getRule_values().get("TimeNum"))
						.append(", ")
						.append(metaVouchInfo.getRule_values().get("DayNum"))
						.append(".If you fail to check in, eLong is authorized to charge ");
				String vouchMoneyType = "";
				if (metaVouchInfo.getVouch_money_type() == 1) {
					vouchMoneyType = "first night room rate";
				} else if (metaVouchInfo.getVouch_money_type() == 2) {
					vouchMoneyType = "full room rate";
				}
				res.append(vouchMoneyType).append(" to your credit card.");
			}
			break;
		case 3:
			if (isCn) {
				res.append("担保条件：在")
						.append(DateUtil.formatDate(
								new Date(metaVouchInfo.getStart_date()),
								"yyyy.MM.dd"))
						.append("至")
						.append(DateUtil.formatDate(
								new Date(metaVouchInfo.getEndDate()),
								"yyyy.MM.dd"));
				if (metaVouchInfo.getDate_type() == 1) {
					res.append("入住");
				} else if (metaVouchInfo.getDate_type() == 2) {
					res.append("在店");
				}
				if (metaVouchInfo.isIs_arrive_time_vouch()
						&& metaVouchInfo.isIs_room_count_vouch()) {
					res.append(" 如果在")
							.append(metaVouchInfo.getArrive_start_time())
							.append("至")
							.append(metaVouchInfo.getArrive_end_time())
							.append("到店，或预订房量超过")
							.append(metaVouchInfo.getRoom_count()).append("间");
				}
				if (metaVouchInfo.isIs_arrive_time_vouch()
						&& !metaVouchInfo.isIs_room_count_vouch()) {
					res.append(" 在")
							.append(metaVouchInfo.getArrive_start_time())
							.append("至" + metaVouchInfo.getArrive_end_time())
							.append("到店");
				}
				if (!metaVouchInfo.isIs_arrive_time_vouch()
						&& metaVouchInfo.isIs_room_count_vouch()) {
					res.append(" 如果预订房量超过")
							.append(metaVouchInfo.getRoom_count())
							.append("间及以上");
				}
				String vouchType = "";
				if (metaVouchInfo.getRule_values() != null
						&& metaVouchInfo.getRule_values().containsKey("Gage")) {
					if ("1".equals(metaVouchInfo.getRule_values().get("Gage"))) {
						vouchType = "信用卡";
					}
				}
				String vouchMoneyType = "";
				if (metaVouchInfo.getVouch_money_type() == 1) {
					vouchMoneyType = "第一晚房费";
				} else if (metaVouchInfo.getVouch_money_type() == 2) {
					vouchMoneyType = "全额房费";
				}
				res.append("，需要您提供").append(vouchType).append("担保。")
						.append("客人最早到店")
						.append(metaVouchInfo.getRule_values().get("HourNum"))
						.append("小时前可以变更取消，之后无法变更取消，").append("如未入住，将扣除")
						.append(vouchMoneyType).append("作为违约金。");
			} else {
				String removeNextDayEndTime = metaVouchInfo
						.getArrive_end_time().replaceAll("次日", "");
				if (!metaVouchInfo.isIs_arrive_time_vouch()
						&& !metaVouchInfo.isIs_room_count_vouch()) {
					res.append("For Bookings with  check-in date between ")
							.append(DateUtil.formatDate(
									new Date(metaVouchInfo.getStart_date()),
									"yyyy.MM.dd"))
							.append(" and ")
							.append(DateUtil.formatDate(
									new Date(metaVouchInfo.getEndDate()),
									"yyyy.MM.dd")).append(", ");
				}
				if (metaVouchInfo.isIs_arrive_time_vouch()
						&& !metaVouchInfo.isIs_room_count_vouch()) {
					res.append("For Bookings with  check-in time between ")
							.append(metaVouchInfo.getArrive_start_time())
							.append(" and ").append(removeNextDayEndTime)
							.append(", ");
				}
				if (!metaVouchInfo.isIs_arrive_time_vouch()
						&& metaVouchInfo.isIs_room_count_vouch()) {
					res.append("For bookings with ")
							.append(metaVouchInfo.getRoom_count())
							.append("  rooms or above booked, ");
				}
				if (metaVouchInfo.isIs_arrive_time_vouch()
						&& metaVouchInfo.isIs_room_count_vouch()) {
					res.append("For bookings with ")
							.append(metaVouchInfo.getRoom_count())
							.append("  rooms or above booked, or check-in time between ")
							.append(metaVouchInfo.getArrive_start_time())
							.append(" and ").append(removeNextDayEndTime)
							.append(", ");
				}
				res.append(
						"credit card information is required for guarantee. Once the booking is confirmed, free cancellation or change is allowed until ")
						.append(metaVouchInfo.getRule_values().get("HourNum"))
						.append(" hours before your earliest arrival time")
						.append(", ")
						.append(metaVouchInfo.getRule_values().get("DayNum"))
						.append(".If you fail to check in, eLong is authorized to charge ");
				String vouchMoneyType = "";
				if (metaVouchInfo.getVouch_money_type() == 1) {
					vouchMoneyType = "first night room rate";
				} else if (metaVouchInfo.getVouch_money_type() == 2) {
					vouchMoneyType = "full room rate";
				}
				res.append(vouchMoneyType).append(" to your credit card.");
			}
			break;
		case 4:
			if (isCn) {
				res.append("担保条件：在")
						.append(DateUtil.formatDate(
								new Date(metaVouchInfo.getStart_date()),
								"yyyy.MM.dd"))
						.append("至")
						.append(DateUtil.formatDate(
								new Date(metaVouchInfo.getEndDate()),
								"yyyy.MM.dd"));
				if (metaVouchInfo.getDate_type() == 1) {
					res.append("入住");
				} else if (metaVouchInfo.getDate_type() == 2) {
					res.append("在店");
				}
				if (metaVouchInfo.isIs_arrive_time_vouch()
						&& metaVouchInfo.isIs_room_count_vouch()) {
					res.append(" 如果在")
							.append(metaVouchInfo.getArrive_start_time())
							.append("至")
							.append(metaVouchInfo.getArrive_end_time())
							.append("到店，或预订房量超过")
							.append(metaVouchInfo.getRoom_count())
							.append("间及以上");
				}
				if (metaVouchInfo.isIs_arrive_time_vouch()
						&& !metaVouchInfo.isIs_room_count_vouch()) {
					res.append(" 在")
							.append(metaVouchInfo.getArrive_start_time())
							.append("至" + metaVouchInfo.getArrive_end_time())
							.append("到店");
				}
				if (!metaVouchInfo.isIs_arrive_time_vouch()
						&& metaVouchInfo.isIs_room_count_vouch()) {
					res.append(" 如果预订房量超过")
							.append(metaVouchInfo.getRoom_count())
							.append("间及以上");
				}
				String vouchType = "";
				if (metaVouchInfo.getRule_values() != null
						&& metaVouchInfo.getRule_values().containsKey("Gage")) {
					if ("1".equals(metaVouchInfo.getRule_values().get("Gage"))) {
						vouchType = "信用卡";
					}
				}
				String vouchMoneyType = "";
				if (metaVouchInfo.getVouch_money_type() == 1) {
					vouchMoneyType = "第一晚房费";
				} else if (metaVouchInfo.getVouch_money_type() == 2) {
					vouchMoneyType = "全额房费";
				}
				res.append("，需要您提供").append(vouchType).append("担保。")
						.append("客人入住日")
						.append(metaVouchInfo.getRule_values().get("HourNum"))
						.append("小时前可以变更取消，之后无法变更取消，").append("如未入住，将扣除")
						.append(vouchMoneyType).append("作为违约金。");
			} else {
				String removeNextDayEndTime = metaVouchInfo
						.getArrive_end_time().replaceAll("次日", "");
				if (!metaVouchInfo.isIs_arrive_time_vouch()
						&& !metaVouchInfo.isIs_room_count_vouch()) {
					res.append("For Bookings with  check-in date between ")
							.append(DateUtil.formatDate(
									new Date(metaVouchInfo.getStart_date()),
									"yyyy.MM.dd"))
							.append(" and ")
							.append(DateUtil.formatDate(
									new Date(metaVouchInfo.getEndDate()),
									"yyyy.MM.dd")).append(", ");
				}
				if (metaVouchInfo.isIs_arrive_time_vouch()
						&& !metaVouchInfo.isIs_room_count_vouch()) {
					res.append("For Bookings with  check-in time between ")
							.append(metaVouchInfo.getArrive_start_time())
							.append(" and ").append(removeNextDayEndTime)
							.append(", ");
				}
				if (!metaVouchInfo.isIs_arrive_time_vouch()
						&& metaVouchInfo.isIs_room_count_vouch()) {
					res.append("For bookings with ")
							.append(metaVouchInfo.getRoom_count())
							.append("  rooms or above booked, ");
				}
				if (metaVouchInfo.isIs_arrive_time_vouch()
						&& metaVouchInfo.isIs_room_count_vouch()) {
					res.append("For bookings with ")
							.append(metaVouchInfo.getRoom_count())
							.append("  rooms or above booked, or check-in time between ")
							.append(metaVouchInfo.getArrive_start_time())
							.append(" and ").append(removeNextDayEndTime)
							.append(", ");
				}
				res.append(
						"credit card information is required for guarantee. Once the booking is confirmed, free cancellation or change is allowed until ")
						.append(metaVouchInfo.getRule_values().get("HourNum"))
						.append(" hours before your check-in date")
						.append(", ")
						.append(metaVouchInfo.getRule_values().get("DayNum"))
						.append(".If you fail to check in, eLong is authorized to charge ");
				String vouchMoneyType = "";
				if (metaVouchInfo.getVouch_money_type() == 1) {
					vouchMoneyType = "first night room rate";
				} else if (metaVouchInfo.getVouch_money_type() == 2) {
					vouchMoneyType = "full room rate";
				}
				res.append(vouchMoneyType).append(" to your credit card.");
			}
			break;
		default:
			break;
		}
		return res.toString();
	}
}
