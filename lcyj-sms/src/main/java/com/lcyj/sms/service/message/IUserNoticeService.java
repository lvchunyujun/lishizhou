package com.lcyj.sms.service.message;

import com.lcyj.common.vo.PageVo;
import com.lcyj.sms.exception.PlatformException;
import com.lcyj.sms.model.UserNotice;

import java.util.List;

/**
 * @since v1.1
 * @history
 * @see
 */

/**
 * 用户站内公告服务接口
 */
public interface IUserNoticeService
{
	/**
	 * @param userNotice
	 * @return
	 * 
	 */
	int addNotice(UserNotice userNotice);
	
	/**
	 * 更新公告的标题和内容
	 * @param userNotice
	 * 
	 */
	void updateNotice(UserNotice userNotice) throws PlatformException;

	/**
	 * 取公告列表
	 * @param pageVo
	 * @return
	 * @throws PlatformException
	 */
	PageVo<UserNotice> getUserNoticeListByPage(PageVo<UserNotice> pageVo) throws PlatformException;

	/**
	 * 标记一条不显示一条公告
	 * 
	 * @param userNoticeId
	 * @return
	 */
	boolean markUserNoticeDisplay(int userNoticeId);

	/**
	 * 删除一个公告
	 * 
	 * @param userNoticeId
	 * @return
	 * @throws PlatformException
	 */
	int delUserNoticebyId(int userNoticeId) throws PlatformException;
    
	UserNotice getNoticeDetailById(int id) throws PlatformException;
	/**
	 * 获取指定条数的公告
	 * @param limit
	 * @return
	 */
	List<UserNotice> getUserNoticeByLimit(int limit);
}
