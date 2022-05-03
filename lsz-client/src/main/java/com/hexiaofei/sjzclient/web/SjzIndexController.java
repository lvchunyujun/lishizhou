package com.hexiaofei.sjzclient.web;

import com.hexiaofei.sjzclient.common.EnumSjzEventState;
import com.hexiaofei.sjzclient.domain.LszTag;
import com.hexiaofei.sjzclient.domain.SjzEventIndex;
import com.hexiaofei.sjzclient.service.ISjzEventIndexService;
import com.hexiaofei.sjzclient.vo.PageVo;
import com.lcyj.common.vo.event.SjzEventIndexVo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Map;

@Controller
public class SjzIndexController {

    public static Logger logger = LoggerFactory.getLogger(SjzIndexController.class);

    private final static String STATIC_BASE_URL = "index";
    private final static int CURRENT_PAGE = 1;
    private final static int PAGE_SIZE = 10;

    @Autowired
    private ISjzEventIndexService sjzEventIndexService;

    @RequestMapping(value={"","/index"})
    public ModelAndView index(SjzEventIndexVo sjzEventIndexVo, Integer currentPage, Integer pageSize){
        ModelAndView modelAndView = new ModelAndView("index");
        PageVo<Map<String,Object>> pageVo = new PageVo<Map<String,Object>>();
        if(currentPage != null && currentPage > 0){
            pageVo.setCurrentPage(currentPage);
        }else{
            pageVo.setCurrentPage(1);
        }
        if(pageSize != null && pageSize > 0){
            pageVo.setPageSize(pageSize);
        }else{
            pageVo.setPageSize(10);
        }

        try {
            // 已经发布状态的列表
            SjzEventIndex sjzEventIndex = new SjzEventIndex();
            LszTag lszTag = new LszTag();
            lszTag.setWordMetaCode(sjzEventIndexVo.getWordMetaCode());

            sjzEventIndex.setEventState(EnumSjzEventState.RELEASE.getStatus());

            pageVo = sjzEventIndexService.getPageVoObjectBySjzEventIndex(sjzEventIndex,lszTag,pageVo);

            List<Map<String,Object>> list = pageVo.getVoList();

            for(Map map : list){
                String eventContent = (String)map.get("eventContent");

                if(map.get("wordMetaZh") !=null && map.get("wordMetaCode") != null){
                    String wordMetaZh = (String)map.get("wordMetaZh");
                    Integer wordMetaCode = (Integer)map.get("wordMetaCode");

                    StringBuilder targetStr = new StringBuilder();
                    targetStr.append("<a ");
                    targetStr.append("wordMetaCode=");
                    targetStr.append(wordMetaCode);
                    targetStr.append(" wordMetaZh=");
                    targetStr.append(wordMetaZh);
                    targetStr.append(" >");
                    targetStr.append(wordMetaZh);
                    targetStr.append("</a>");
                    eventContent = eventContent.replace(wordMetaZh,targetStr.toString());
                    map.put("eventContent",eventContent);
                }
            }

            modelAndView.addObject("eil",pageVo.getVoList());
            modelAndView.addObject("pages",pageVo.getPageIndex().getPages());
            modelAndView.addObject("currentPage",pageVo);
            modelAndView.addObject("pageCount",pageVo.getPageCount());
            modelAndView.addObject("pageVo",pageVo);
            modelAndView.addObject("wordMetaCode",sjzEventIndexVo.getWordMetaCode());
            modelAndView.addObject("wordMetaZh",sjzEventIndexVo.getWordMetaZh());
        } catch (Exception e) {
            logger.error("查询异常！",e);
        }

        return modelAndView;
    }

    @ResponseBody
    @RequestMapping(value="/eventIndex/list/{currentPage}_{pageSize}",method = RequestMethod.GET)
    public String getEventIndex(@PathVariable(value="currentPage") Integer currentPage, @PathVariable(value="pageSize") Integer pageSize){


        return null;
    }
}
