package com.elong.nb.model.rateplan;

import java.util.Date;

import com.elong.nb.model.bean.enums.EnumValueAddPriceOption;

public class BaseValueAddRule extends BaseRule {

	/// <summary>
    /// 业务代码
    /// </summary>
    private String TypeCode ;


    /// <summary>
    /// 是否包含在房费中
    /// </summary>

    private boolean IsInclude;

    /// <summary>
    /// 包含的份数
    /// </summary>

    private int Amount;

    /// <summary>
    /// 货币代码
    /// </summary>

    private String CurrencyCode;

    /// <summary>
    /// 单价默认选项(1-金额，2-比例)
    /// </summary>

    private EnumValueAddPriceOption PriceOption;

    /// <summary>
    /// 单价
    /// (视PriceOption表示金额或比例， 比例值保存的百分数，不是最终的小数， 例如 20%， 则该字段保存为20)
    /// </summary>

    private double Price;

    /// <summary>
    /// 是否单加
    /// </summary>

    private boolean IsExtAdd;

    /// <summary>
    /// 单加单价默认选项(1-金额，2-比例)
    /// </summary>

    private EnumValueAddPriceOption ExtOption;

    /// <summary>
    /// 单加单价
    /// (视 extOption 不同表示金额或比例值, 比例值保存的百分数，不是最终的小数， 例如 20%， 则该字段保存为20)
    /// </summary>

    private double ExtPrice;

    /// <summary>
    /// 特殊早餐-开始日期
    /// </summary>

    private Date StartDate;

    /// <summary>
    /// 特殊早餐-结束日期
    /// </summary>

    private Date EndDate;

    /// <summary>
    /// 特殊早餐-周有效设置
    /// </summary>

    private String WeekSet;

	public String getTypeCode() {
		return TypeCode;
	}

	public void setTypeCode(String typeCode) {
		TypeCode = typeCode;
	}

	public boolean isIsInclude() {
		return IsInclude;
	}

	public void setIsInclude(boolean isInclude) {
		IsInclude = isInclude;
	}

	public int getAmount() {
		return Amount;
	}

	public void setAmount(int amount) {
		Amount = amount;
	}

	public String getCurrencyCode() {
		return CurrencyCode;
	}

	public void setCurrencyCode(String currencyCode) {
		CurrencyCode = currencyCode;
	}

	public EnumValueAddPriceOption getPriceOption() {
		return PriceOption;
	}

	public void setPriceOption(EnumValueAddPriceOption priceOption) {
		PriceOption = priceOption;
		
		if (PriceOption == EnumValueAddPriceOption.None)
		    {
		        PriceOption = EnumValueAddPriceOption.Money;
		    }
	}

	public double getPrice() {
		return Price;
	}

	public void setPrice(double price) {
		Price = price;
	}

	public boolean isIsExtAdd() {
		return IsExtAdd;
	}

	public void setIsExtAdd(boolean isExtAdd) {
		IsExtAdd = isExtAdd;
	}

	public EnumValueAddPriceOption getExtOption() {
		return ExtOption;
	}

	public void setExtOption(EnumValueAddPriceOption extOption) {
		ExtOption = extOption;
		
		if (ExtOption == EnumValueAddPriceOption.None)
		  {
		    ExtOption = EnumValueAddPriceOption.Money;
		   }
		    
	}

	public double getExtPrice() {
		return ExtPrice;
	}

	public void setExtPrice(double extPrice) {
		ExtPrice = extPrice;
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

	public String getWeekSet() {
		return WeekSet;
	}

	public void setWeekSet(String weekSet) {
		WeekSet = weekSet;
	}

    
    //[OnSerializing]
    //private void OnSerializingMethod(StreamingContext context)
    //{
    //    if (ExtOption == EnumValueAddPriceOption.None)
    //    {
    //        ExtOption = EnumValueAddPriceOption.Money;
     //   }
     //   if (PriceOption == EnumValueAddPriceOption.None)
     //   {
      //      PriceOption = EnumValueAddPriceOption.Money;
      //  }
   // }
    
}
