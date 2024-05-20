package com.lcyj.sms.service.impl;

import com.lcyj.common.vo.PageVo;
import com.lcyj.sms.exception.PlatformException;
import com.lcyj.sms.model.SmsPlatformServerEmail;
import com.lcyj.sms.service.SmsPlatformServerEmailService;
import org.apache.ibatis.cursor.Cursor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class SmsPlatformServerEmailServiceImpl implements SmsPlatformServerEmailService {
    @Override
    public int addObject(SmsPlatformServerEmail mob) throws PlatformException {
        return 0;
    }

    @Override
    public int deleteObjectById(int id) throws PlatformException {
        return 0;
    }

    @Override
    public int updateObject(SmsPlatformServerEmail mob) throws PlatformException {
        return 0;
    }

    @Override
    public SmsPlatformServerEmail getObjectById(int id) {
        return null;
    }

    @Override
    public PageVo<SmsPlatformServerEmail> getPageVoObject(PageVo<SmsPlatformServerEmail> pageVo) {
        return null;
    }

    @Override
    public PageVo<SmsPlatformServerEmail> getPageVoByObject(PageVo<SmsPlatformServerEmail> pageVo, SmsPlatformServerEmail mob) {
        return null;
    }

    @Override
    public PageVo<SmsPlatformServerEmail> getPageVoByMap(PageVo<SmsPlatformServerEmail> pageVo, Map<String, Object> map) {
        return null;
    }

    @Override
    public List<SmsPlatformServerEmail> getAllObject() {
        return null;
    }

    @Override
    public Cursor<SmsPlatformServerEmail> getCursorByObject(SmsPlatformServerEmail mob) {
        return null;
    }

    @Override
    public Cursor<SmsPlatformServerEmail> getCursorByMap(Map<String, Object> map) {
        return null;
    }
}
