package com.elong.nb.model.effectivestatuscheck;

public class EffectiveStatus {

	/// <summary>
    /// 0 :服务 1：暂停  2：删除
    /// </summary>
    private int mhotelStatus;
    /// <summary>
    /// 0 ：无效  1：有效
    /// </summary>
    private int mroomStatus;
    /// <summary>
    /// 0 ：无效  1：有效
    /// </summary>
    private int ratePlanStaus;
    /// <summary>
    /// 0 :服务 1：暂停  2：删除
    /// </summary>
    private int shotelStatus;
    /// <summary>
    ///  0 ：无效  1：有效
    /// </summary>
    private int sroomStatus;
    /// <summary>
    /// 0 非  1：是
    /// </summary>
    private int sroomRatePlanRelation;
	public int getMhotelStatus() {
		return mhotelStatus;
	}
	public void setMhotelStatus(int mhotelStatus) {
		this.mhotelStatus = mhotelStatus;
	}
	public int getMroomStatus() {
		return mroomStatus;
	}
	public void setMroomStatus(int mroomStatus) {
		this.mroomStatus = mroomStatus;
	}
	public int getRatePlanStaus() {
		return ratePlanStaus;
	}
	public void setRatePlanStaus(int ratePlanStaus) {
		this.ratePlanStaus = ratePlanStaus;
	}
	public int getShotelStatus() {
		return shotelStatus;
	}
	public void setShotelStatus(int shotelStatus) {
		this.shotelStatus = shotelStatus;
	}
	public int getSroomStatus() {
		return sroomStatus;
	}
	public void setSroomStatus(int sroomStatus) {
		this.sroomStatus = sroomStatus;
	}
	public int getSroomRatePlanRelation() {
		return sroomRatePlanRelation;
	}
	public void setSroomRatePlanRelation(int sroomRatePlanRelation) {
		this.sroomRatePlanRelation = sroomRatePlanRelation;
	}

    

}
