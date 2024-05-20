package com.lcyj.sms.service.message;


import com.lcyj.common.vo.PageVo;
import com.lcyj.sms.exception.PlatformException;
import com.lcyj.sms.model.InnerMailWithBLOBs;

import java.util.HashMap;

/**
 * 站内信服务接口
 *
 */
public interface IInnerMailService
{
    
    /**
     * 增加一条站内信
     * @param innerMail
     * @return
     */
    int addInnerMail(InnerMailWithBLOBs innerMail);

    /**
     * 取站内信列表
     * @param pageVo
     * @param userId
     * @return
     * @throws PlatformException
     */
    PageVo<InnerMailWithBLOBs> getInnerMailListByPage(PageVo<InnerMailWithBLOBs> pageVo, int userId) throws PlatformException;
    
    /**
     * 标记一条站内信为已读
     * @param innerMailId
     * @return
     */
    boolean markInnerMailReaded(int innerMailId);

    /**
     * 获取未读站内信数量
     *@param userId
     *@return 
     *
     *@comment
     */
    int  getUnreadInnerMailCount(int userId);
    
    /**
     * 发送一条站内信
     * @param userId
     * @param content
     * @return
     */
    void  sendInnerMail(int userId, String content, int messageType);

    /**
     * 根据id取一条站内信的详细信息
     * @param innerMailId
     * @return
     *
     */
    InnerMailWithBLOBs getInnerMailById(int innerMailId);
    /**
     * 更具用户ID获取一条站内信
     * @param userId
     * @param innerMailId
     * @return
     */
    InnerMailWithBLOBs getInnerMailByUserId(int userId, int innerMailId);
    
    /**
     * 根据id删除一条站内信
     * @param innerMailId
     * @return
     * 
     */
    int delInnerMailById(int innerMailId);
    
    /**
     * 标记一个站内信是否是小红旗状态
     * @param innerMailId
     * @param isFlagged true表示标记此站内信为小红旗状态；false表示标记此站内信为<b>非小红旗</b>状态
     * 
     */
    void markInnerMailFlag(int innerMailId, boolean isFlagged);
    
    /**
     * 查询站内消息按时间排序
     * @param pageVo
     * @param userId
     */
    PageVo<HashMap<String, Object>> queryInnerMailList(PageVo<HashMap<String, Object>> pageVo, int userId) throws Exception;
    /**
     * 标记一条数据为未读
     * @param innerMailId
     * @return
     * @throws Exception
     */
	boolean markInnerMailNoReaded(int innerMailId)throws Exception;
}
