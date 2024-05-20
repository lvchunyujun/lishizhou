/**
 * 
 */
package com.lcyj.sms.service.message;

import com.lcyj.sms.exception.PlatformException;
import com.lcyj.sms.model.NotificationConfig;

import java.util.List;

/**
 * 系统用户公告配置服务接口
 */
public interface INotificationConfigService
{
	/**
	 * 添加一个提醒配置
	 *@param notificationConfig
	 *@return 
	 *
	 *@comment
	 */
	int addNotificationConfig(NotificationConfig notificationConfig);
	
	/**
	 * 根据userId删除一个提醒配置，其实只是清空这个用户的配置
	 *@param userId
	 *@return
	 *@throws PlatformException 
	 *
	 *@comment
	 */
	int delNotificationConfigByUserId(int userId) throws PlatformException;
	
	/**
	 * 通过userId获取提醒配置
	 *@param userId
	 *@return
	 *@throws PlatformException 
	 *
	 *@comment
	 */
	NotificationConfig getNotificationConfigByUserId(int userId) throws PlatformException;

	/**
	 * 更新提醒配置
	 * @param notificationConfig
	 * @return
	 */
	int updateNotificationConfig(NotificationConfig notificationConfig);
	
	/**
	 * 根据loanId获取投资人的提醒配置
	 * @param loanId
	 * @return
	 * 
	 */
	List<NotificationConfig> getInvestorNotificationConfigByLoanId(int loanId);
	
	/**
	 * 根据Id获取提醒配置的详情
	 * @param id
	 * @return
	 */
	NotificationConfig getNoticeDetailById(int id);
	/**
	 * 根据用户id获得消息设置
	 * @param userId
	 * @return
	 */
	String getMessageSetup(Integer userId);
	/**
	 * 根据用户id修改消息设置
	 * @param messageSetup 
	 * @param userId
	 * @return
	 */
	int saveMessageSetup(String messageSetup, Integer userId);
	
}
