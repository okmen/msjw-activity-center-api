package cn.activity.bean;

import java.io.Serializable;

public class ApptDistrictAndTimeVo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1434827974413730627L;

	private String apptDate;		//预约日期
	private String apptInterval;	//预约时间段
	private String apptDistrict;	//预约片区
	private String totalQuota;		//总预约配额
	private String leftQuota;		//可预约配额
	private String cch;				//场次号
	private String cxrq;			//出行日期
	
	
	public String getCch() {
		return cch;
	}
	public void setCch(String cch) {
		this.cch = cch;
	}
	public String getCxrq() {
		return cxrq;
	}
	public void setCxrq(String cxrq) {
		this.cxrq = cxrq;
	}
	public String getApptDate() {
		return apptDate;
	}
	public void setApptDate(String apptDate) {
		this.apptDate = apptDate;
	}
	public String getApptInterval() {
		return apptInterval;
	}
	public void setApptInterval(String apptInterval) {
		this.apptInterval = apptInterval;
	}
	public String getApptDistrict() {
		return apptDistrict;
	}
	public void setApptDistrict(String apptDistrict) {
		this.apptDistrict = apptDistrict;
	}
	public String getTotalQuota() {
		return totalQuota;
	}
	public void setTotalQuota(String totalQuota) {
		this.totalQuota = totalQuota;
	}
	public String getLeftQuota() {
		return leftQuota;
	}
	public void setLeftQuota(String leftQuota) {
		this.leftQuota = leftQuota;
	}
}
