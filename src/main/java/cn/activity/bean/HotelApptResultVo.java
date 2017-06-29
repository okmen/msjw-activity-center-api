package cn.activity.bean;

import java.io.Serializable;

public class HotelApptResultVo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6074595150986870291L;

	private String plateNo;		//号牌号码
	private String plateType;	//号牌种类
	private String result;		//预约结果	0-失败，1-成功
	private String desc;		//结果描述
	private String apptId;		//预约ID
	
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
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getApptId() {
		return apptId;
	}
	public void setApptId(String apptId) {
		this.apptId = apptId;
	}
}
