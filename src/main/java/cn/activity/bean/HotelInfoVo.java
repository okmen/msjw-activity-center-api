package cn.activity.bean;

import java.io.Serializable;

/**
 * 酒店信息
 * @author Mbenben
 *
 */
public class HotelInfoVo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3088751115852919321L;
	
	private String agencyCode;		//机构代码
	private String branchCode;		//分店编号
	private String hotelName;		//酒店名称
	private String branchName;		//分店名称
	
	public String getAgencyCode() {
		return agencyCode;
	}
	public void setAgencyCode(String agencyCode) {
		this.agencyCode = agencyCode;
	}
	public String getBranchCode() {
		return branchCode;
	}
	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
	}
	public String getHotelName() {
		return hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	public String getBranchName() {
		return branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

}
