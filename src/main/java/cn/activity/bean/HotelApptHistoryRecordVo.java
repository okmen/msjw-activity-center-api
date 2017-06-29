package cn.activity.bean;

import java.io.Serializable;

/**
 * 酒店预约查询信息
 * @author Mbenben
 *
 */
public class HotelApptHistoryRecordVo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7397424985351717949L;

	private String apptId;			//预约编号
	private String apptDistrict;	//预约片区
	private String apptDate;		//预约日期
	private String apptInterval;	//预约时间段
	private String apptStatus;		//预约状态
	private String plateNo;			//号牌号码
	private String apptName;		//姓名
	private String mobilePhone;		//手机号码
	
	public String getApptId() {
		return apptId;
	}
	public void setApptId(String apptId) {
		this.apptId = apptId;
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
	public String getPlateNo() {
		return plateNo;
	}
	public void setPlateNo(String plateNo) {
		this.plateNo = plateNo;
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
}
