package com.lcyj.sms.service.impl;

import com.lcyj.common.vo.PageVo;
import com.lcyj.sms.exception.PlatformException;
import com.lcyj.sms.model.SmsPlatformServer;
import com.lcyj.sms.service.SmsPlatformServerService;
import org.apache.ibatis.cursor.Cursor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class SmsPlatformServerServiceImpl implements SmsPlatformServerService {
    @Override
    public int addObject(SmsPlatformServer mob) throws PlatformException {
        return 0;
    }

    @Override
    public int deleteObjectById(int id) throws PlatformException {
        return 0;
    }

    @Override
    public int updateObject(SmsPlatformServer mob) throws PlatformException {
        return 0;
    }

    @Override
    public SmsPlatformServer getObjectById(int id) {
        return null;
    }

    @Override
    public PageVo<SmsPlatformServer> getPageVoObject(PageVo<SmsPlatformServer> pageVo) {
        return null;
    }

    @Override
    public PageVo<SmsPlatformServer> getPageVoByObject(PageVo<SmsPlatformServer> pageVo, SmsPlatformServer mob) {
        return null;
    }

    @Override
    public PageVo<SmsPlatformServer> getPageVoByMap(PageVo<SmsPlatformServer> pageVo, Map<String, Object> map) {
        return null;
    }

    @Override
    public List<SmsPlatformServer> getAllObject() {
        return null;
    }

    @Override
    public Cursor<SmsPlatformServer> getCursorByObject(SmsPlatformServer mob) {
        return null;
    }

    @Override
    public Cursor<SmsPlatformServer> getCursorByMap(Map<String, Object> map) {
        return null;
    }
}
