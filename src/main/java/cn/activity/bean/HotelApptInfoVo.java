package cn.activity.bean;

import java.io.Serializable;

/**
 * 酒店预约信息
 * @author Mbenben
 *
 */
public class HotelApptInfoVo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4809080380535337464L;
	
	private String identityCard;	//身份证号码
	private String apptName;		//预约人姓名
	private String plateNo;			//车牌号码
	private String plateType;		//车牌种类
	private String mobilePhone;		//手机号码
	private String apptInterval;	//预约时间段	1-0点到12点,2-12点到24点
	private String apptDate;		//预约日期
	private String apptDistrict;	//预约片区		1-梅沙片区,2-大鹏片区
	
	public String getIdentityCard() {
		return identityCard;
	}
	public void setIdentityCard(String identityCard) {
		this.identityCard = identityCard;
	}
	public String getApptName() {
		return apptName;
	}
	public void setApptName(String apptName) {
		this.apptName = apptName;
	}
	public String getApptInterval() {
		return apptInterval;
	}
	public void setApptInterval(String apptInterval) {
		this.apptInterval = apptInterval;
	}
	public String getApptDate() {
		return apptDate;
	}
	public void setApptDate(String apptDate) {
		this.apptDate = apptDate;
	}
	public String getApptDistrict() {
		return apptDistrict;
	}
	public void setApptDistrict(String apptDistrict) {
		this.apptDistrict = apptDistrict;
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
	public String getMobilePhone() {
		return mobilePhone;
	}
	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}
}
