package cn.activity.service;

import java.util.List;

import cn.activity.bean.HotelApptInfoVo;
import cn.activity.bean.HotelInfoVo;
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
	
	
	/**
	 * 获取酒店分店信息
	 * @param agencyCode 组织机构代码或社会统一信用代码
	 * @throws Exception
	 */
	public BaseBean getHotelInfoByCode(String agencyCode) throws Exception;
	/**
	 * 酒店分店登录
	 * @param vo 酒店信息
	 * @param password 登录密码
	 * @param sourceOfCertification 请求来源
	 * @throws Exception
	 */
	public BaseBean loginViaHotel(HotelInfoVo vo, String password, String sourceOfCertification) throws Exception;
	/**
	 * 获取酒店配额信息
	 * @param apptDate 预约日期
	 * @param agencyCode 预约片区
	 * @param vo 酒店信息
	 * @param sourceOfCertification 请求来源
	 * @throws Exception
	 */
	public BaseBean getHotelQuotaInfo(String apptDate, String apptDistrict, HotelInfoVo vo, String sourceOfCertification) throws Exception;
	/**
	 * 酒店预约信息写入
	 * @param agencyCode 组织机构代码
	 * @param branchCode 分店编号
	 * @param apptInfoList 预约信息集合
	 * @throws Exception
	 */
	public BaseBean addHotelApptInfo(String agencyCode, String branchCode, List<HotelApptInfoVo> apptInfoList) throws Exception;
	/**
	 * 获取酒店预约信息列表
	 * @param vo 酒店信息
	 * @param apptDate 预约日期
	 * @throws Exception
	 */
	public BaseBean getHotelApptHistoryByDate(HotelInfoVo vo, String apptDate) throws Exception;
	/**
	 * 获取酒店预约信息根据查询类型
	 * @param apptInfo 预约信息
	 * @param hotelInfo 酒店信息
	 * @param queryType 查询类型 1:根据号牌号码查询，2:根据姓名查询，3:根据手机号码查询
	 * @throws Exception
	 */
	public BaseBean getHotelApptInfoByQueryType(HotelApptInfoVo apptInfo, HotelInfoVo hotelInfo, String queryType) throws Exception;
	/**
     * 取消酒店预约信息
     * @param apptId 预约编号
     * @param cancelReason 取消原因
	 * @param sourceOfCertification 获取来源
	 * @throws Exception
	 */
	public BaseBean cancelHotelApptInfo(String apptId, String cancelReason, String sourceOfCertification) throws Exception;
	/**
	 * 酒店预约信息详情
	 * @Description: TODO(酒店预约信息详情)
	 * @param apptId 预约编号
	 * @throws Exception
	 */
	public BaseBean getApptInfoDetailByApptId(String apptId) throws Exception;
	
}
