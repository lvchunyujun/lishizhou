package com.lcyj.sms.service.impl;

import com.lcyj.common.vo.PageVo;
import com.lcyj.sms.exception.PlatformException;
import com.lcyj.sms.model.SmsUserinfoBlacklists;
import com.lcyj.sms.service.SmsUserinfoBlacklistsService;
import org.apache.ibatis.cursor.Cursor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class SmsUserinfoBlacklistsServiceImpl implements SmsUserinfoBlacklistsService {
    @Override
    public int addObject(SmsUserinfoBlacklists mob) throws PlatformException {
        return 0;
    }

    @Override
    public int deleteObjectById(int id) throws PlatformException {
        return 0;
    }

    @Override
    public int updateObject(SmsUserinfoBlacklists mob) throws PlatformException {
        return 0;
    }

    @Override
    public SmsUserinfoBlacklists getObjectById(int id) {
        return null;
    }

    @Override
    public PageVo<SmsUserinfoBlacklists> getPageVoObject(PageVo<SmsUserinfoBlacklists> pageVo) {
        return null;
    }

    @Override
    public PageVo<SmsUserinfoBlacklists> getPageVoByObject(PageVo<SmsUserinfoBlacklists> pageVo, SmsUserinfoBlacklists mob) {
        return null;
    }

    @Override
    public PageVo<SmsUserinfoBlacklists> getPageVoByMap(PageVo<SmsUserinfoBlacklists> pageVo, Map<String, Object> map) {
        return null;
    }

    @Override
    public List<SmsUserinfoBlacklists> getAllObject() {
        return null;
    }

    @Override
    public Cursor<SmsUserinfoBlacklists> getCursorByObject(SmsUserinfoBlacklists mob) {
        return null;
    }

    @Override
    public Cursor<SmsUserinfoBlacklists> getCursorByMap(Map<String, Object> map) {
        return null;
    }
}
