package com.hexiaofei.sjzclient.service;

import com.hexiaofei.sjzclient.domain.LszTag;
import com.hexiaofei.sjzclient.domain.SjzEventAuthor;
import com.hexiaofei.sjzclient.domain.SjzEventIndex;
import com.hexiaofei.sjzclient.domain.SjzSpiderWebsite;
import com.hexiaofei.sjzclient.exception.PlatformException;
import com.hexiaofei.sjzclient.service.base.IBaseService;
import com.hexiaofei.sjzclient.vo.PageVo;
import com.lcyj.common.vo.lsz.LszTagVo;

import java.util.Map;


public interface ISjzEventIndexService extends IBaseService<SjzEventIndex> {

     int addEventIndexAndUser(SjzEventIndex sjzEventIndex, SjzSpiderWebsite sjzSpiderWebsite) throws PlatformException;

     /**
      * 添加事件
      * @param sjzEventIndex 事件索引
      * @param sjzSpiderWebsite 来源网站
      * @param sjzEventAuthor 作者信息
      * @return
      * @throws PlatformException
      */
     int addObject(SjzEventIndex sjzEventIndex, SjzSpiderWebsite sjzSpiderWebsite, SjzEventAuthor sjzEventAuthor)throws PlatformException;



     PageVo<SjzEventIndex> getPageVoObjectBySjzEventIndex(SjzEventIndex eventIndex, PageVo<SjzEventIndex> pageVo)throws PlatformException;

     /**
      * 通过 历史轴标签查询事件列表
      * @param eventIndex
      * @param lszTag
      * @param pageVo
      * @return
      * @throws PlatformException
      */
     PageVo<Map<String,Object>> getPageVoObjectBySjzEventIndex(SjzEventIndex eventIndex, LszTag lszTag, PageVo<Map<String,Object>> pageVo)throws PlatformException;

     /**
      * 分页查询事件列表
      * @param authorId  作者ID
      * @param eventIndex 事件索引
      * @param pageVo 分页
      * @return
      * @throws PlatformException
      */
     PageVo<SjzEventIndex> getPageVoObjectByAuthorId(Integer authorId,SjzEventIndex eventIndex, PageVo<SjzEventIndex> pageVo)throws PlatformException;
}
