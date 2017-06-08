package cn.activity.bean;

import java.io.Serializable;

public class ApptHistoryRecordVo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7559815409243989091L;

	private String apptId;			//预约编号
	private String apptDistrict;	//预约片区
	private String apptDate;		//预约日期
	private String apptInterval;	//预约时间段
	private String apptStatus;		//预约状态
	
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
	
}
