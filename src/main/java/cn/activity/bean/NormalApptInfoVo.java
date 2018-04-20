package cn.activity.bean;

import java.io.Serializable;

/**
 * 个人预约信息
 * @author Mbenben
 *
 */
public class NormalApptInfoVo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1824804787116682727L;
	
	private String plateNo;			//车牌号码
	private String plateType;		//车牌种类
	private String vehicleType;		//车辆类型
	private String vinLastFour;		//车架号后4位
	private String mobilePhone;		//手机号码
	private String apptInterval;	//预约时间段	1-0点到12点,2-12点到24点
	private String apptDate;		//预约日期
	private String apptDistrict;	//预约片区		1-梅沙片区,2-大鹏片区
	private String cch;//场次号
	private String cfdd;//出发地点
	private String shi;		//市
	private String qu;	//区
	private String luduan;//路段
	private String jiedao;//街道
	
	
	public String getCch() {
		return cch;
	}
	public void setCch(String cch) {
		this.cch = cch;
	}
	public String getCfdd() {
		return cfdd;
	}
	public void setCfdd(String cfdd) {
		this.cfdd = cfdd;
	}
	public String getShi() {
		return shi;
	}
	public void setShi(String shi) {
		this.shi = shi;
	}
	public String getQu() {
		return qu;
	}
	public void setQu(String qu) {
		this.qu = qu;
	}
	public String getLuduan() {
		return luduan;
	}
	public void setLuduan(String luduan) {
		this.luduan = luduan;
	}
	public String getJiedao() {
		return jiedao;
	}
	public void setJiedao(String jiedao) {
		this.jiedao = jiedao;
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
	public String getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}
	public String getVinLastFour() {
		return vinLastFour;
	}
	public void setVinLastFour(String vinLastFour) {
		this.vinLastFour = vinLastFour;
	}
	public String getMobilePhone() {
		return mobilePhone;
	}
	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}
}
