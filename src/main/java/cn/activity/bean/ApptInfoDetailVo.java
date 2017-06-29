package cn.activity.bean;

import java.io.Serializable;

/**
 * 预约信息详情
 * @author Mbenben
 *
 */
public class ApptInfoDetailVo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7239723267413173932L;
	
	private String apptId;			//预约ID
	private String plateNo;         //号牌号码
	private String plateType;       //号牌种类
	private String apptName;        //姓名
	private String mobilePhone;     //手机号码
	private String apptDistrict;    //预约片区 1-梅沙片区
	private String apptDate;        //预约日期
	private String apptInterval;    //预约时间段 1-0点-12点、2-12点-24点
	private String apptStatus;      //预约状态
	
	private String totalQuota;		//总预约配额
	private String leftQuota;		//可预约配额
	
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
	public String getApptId() {
		return apptId;
	}
	public void setApptId(String apptId) {
		this.apptId = apptId;
	}
	public String getPlateNo() {
		return plateNo;
	}
	public void setPlateNo(String plateNo) {
		this.plateNo = plateNo;
	}
	public String getPlateType() {
		return plateType;
	}
	public void setPlateType(String plateType) {
		this.plateType = plateType;
	}
	public String getApptName() {
		return apptName;
	}
	public void setApptName(String apptName) {
		this.apptName = apptName;
	}
	public String getMobilePhone() {
		return mobilePhone;
	}
	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}
	public String getApptDistrict() {
		return apptDistrict;
	}
	public void setApptDistrict(String apptDistrict) {
		this.apptDistrict = apptDistrict;
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
	public String getApptStatus() {
		return apptStatus;
	}
	public void setApptStatus(String apptStatus) {
		this.apptStatus = apptStatus;
	}
}
