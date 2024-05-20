package com.lcyj.sms.service.impl;

import com.lcyj.common.vo.PageVo;
import com.lcyj.sms.exception.PlatformException;
import com.lcyj.sms.model.SmsEmailServerConfig;
import com.lcyj.sms.service.SmsEmailServerConfigService;
import org.apache.ibatis.cursor.Cursor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class SmsEmailServerConfigServiceImpl implements SmsEmailServerConfigService {
    @Override
    public int addObject(SmsEmailServerConfig mob) throws PlatformException {
        return 0;
    }

    @Override
    public int deleteObjectById(int id) throws PlatformException {
        return 0;
    }

    @Override
    public int updateObject(SmsEmailServerConfig mob) throws PlatformException {
        return 0;
    }

    @Override
    public SmsEmailServerConfig getObjectById(int id) {
        return null;
    }

    @Override
    public PageVo<SmsEmailServerConfig> getPageVoObject(PageVo<SmsEmailServerConfig> pageVo) {
        return null;
    }

    @Override
    public PageVo<SmsEmailServerConfig> getPageVoByObject(PageVo<SmsEmailServerConfig> pageVo, SmsEmailServerConfig mob) {
        return null;
    }

    @Override
    public PageVo<SmsEmailServerConfig> getPageVoByMap(PageVo<SmsEmailServerConfig> pageVo, Map<String, Object> map) {
        return null;
    }

    @Override
    public List<SmsEmailServerConfig> getAllObject() {
        return null;
    }

    @Override
    public Cursor<SmsEmailServerConfig> getCursorByObject(SmsEmailServerConfig mob) {
        return null;
    }

    @Override
    public Cursor<SmsEmailServerConfig> getCursorByMap(Map<String, Object> map) {
        return null;
    }
}
