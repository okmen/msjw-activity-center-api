package cn.activity.service;

import cn.activity.bean.NormalApptInfoVo;
import cn.sdk.bean.BaseBean;

public interface IActivityService {

	/**
	 * 获取预约场次信息
	 * @param sourceOfCertification 获取来源
	 * @throws Exception 
	 */
	public BaseBean getNormalApptDate(String sourceOfCertification) throws Exception;
	/**
	 * 获取指定场次个人配额信息
	 * @param sourceOfCertification 获取来源
	 * @throws Exception
	 */
	public BaseBean getQuotaInfoByApptDate(String apptDate, String apptDistrict, String sourceOfCertification) throws Exception;
	/**
	 * 个人预约信息写入
	 * @param info 个人预约信息
	 * @param sourceOfCertification 获取来源
	 * @param openid 微信公众号唯一标识
	 * @throws Exception
	 */
	public BaseBean addNormalApptInfo(NormalApptInfoVo info, String sourceOfCertification, String openid) throws Exception;
	/**
     * 取消个人预约信息
     * @param apptId 预约编号
     * @param cancelReason 取消原因
	 * @param sourceOfCertification 获取来源
	 * @throws Exception 
	 */
	public BaseBean cancelNormalApptInfo(String apptId, String cancelReason, String sourceOfCertification) throws Exception;
	/**
     * 查询个人预约信息
     * @param plateNo	号牌号码
     * @param plateType 号牌种类
     * @param vinLastFour 车架后4位
     * @param mobilePhone 手机号码
     * @param sourceOfCertification 查询来源
     */
	public BaseBean getApptHistoryRecord(String plateNo, String plateType, String vinLastFour, String mobilePhone, String sourceOfCertification) throws Exception;
	/**
	 * 临时个人预约信息写入
	 * @param info 个人预约信息
	 * @param sourceOfCertification 获取来源
	 * @param openid 微信公众号唯一标识
	 * @throws Exception
	 */
	public BaseBean addTempApptInfo(NormalApptInfoVo info, String sourceOfCertification, String openid) throws Exception;

}
