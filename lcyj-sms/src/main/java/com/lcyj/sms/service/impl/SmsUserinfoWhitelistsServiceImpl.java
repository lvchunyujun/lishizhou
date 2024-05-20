package com.lcyj.sms.service.impl;

import com.lcyj.common.vo.PageVo;
import com.lcyj.sms.exception.PlatformException;
import com.lcyj.sms.model.SmsUserinfoWhitelists;
import com.lcyj.sms.service.SmsUserinfoWhitelistsService;
import org.apache.ibatis.cursor.Cursor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class SmsUserinfoWhitelistsServiceImpl implements SmsUserinfoWhitelistsService {
    @Override
    public int addObject(SmsUserinfoWhitelists mob) throws PlatformException {
        return 0;
    }

    @Override
    public int deleteObjectById(int id) throws PlatformException {
        return 0;
    }

    @Override
    public int updateObject(SmsUserinfoWhitelists mob) throws PlatformException {
        return 0;
    }

    @Override
    public SmsUserinfoWhitelists getObjectById(int id) {
        return null;
    }

    @Override
    public PageVo<SmsUserinfoWhitelists> getPageVoObject(PageVo<SmsUserinfoWhitelists> pageVo) {
        return null;
    }

    @Override
    public PageVo<SmsUserinfoWhitelists> getPageVoByObject(PageVo<SmsUserinfoWhitelists> pageVo, SmsUserinfoWhitelists mob) {
        return null;
    }

    @Override
    public PageVo<SmsUserinfoWhitelists> getPageVoByMap(PageVo<SmsUserinfoWhitelists> pageVo, Map<String, Object> map) {
        return null;
    }

    @Override
    public List<SmsUserinfoWhitelists> getAllObject() {
        return null;
    }

    @Override
    public Cursor<SmsUserinfoWhitelists> getCursorByObject(SmsUserinfoWhitelists mob) {
        return null;
    }

    @Override
    public Cursor<SmsUserinfoWhitelists> getCursorByMap(Map<String, Object> map) {
        return null;
    }
}
