package com.hexiaofei.provider0.service.impl;

import com.hexiaofei.provider0.dao.mapper.LszTagMapper;
import com.hexiaofei.provider0.domain.LszTag;
import com.hexiaofei.provider0.exception.PlatformException;
import com.hexiaofei.provider0.service.ILszTagService;
import com.hexiaofei.provider0.vo.PageVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author lcyj
 * @date 2020-11-28 15:16
 * @since
 */
@Service
public class LszTagServiceImpl implements ILszTagService {

    @Autowired
    private LszTagMapper lszTagMapper;

    @Override
    public LszTag getLszTag(LszTag lszTag) {
        return lszTagMapper.selectByLszTag(lszTag);
    }

    @Override
    public int addObject(LszTag mob) throws PlatformException {
        return lszTagMapper.insert(mob);
    }

    @Override
    public int deleteObjectById(int id) throws PlatformException {
        return lszTagMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int updateObject(LszTag mob) throws PlatformException {
        return 0;
    }

    @Override
    public LszTag getObjectById(int id) throws PlatformException {
        return null;
    }

    @Override
    public PageVo<LszTag> getPageVoObject(PageVo<LszTag> pageVo) throws PlatformException {
        return null;
    }

    @Override
    public List<LszTag> getAllObject() throws PlatformException {
        return null;
    }
}
