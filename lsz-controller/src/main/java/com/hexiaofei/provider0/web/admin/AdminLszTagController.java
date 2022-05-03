package com.hexiaofei.provider0.web.admin;

import com.hexiaofei.provider0.common.consts.SjzEventStateEnum;
import com.hexiaofei.provider0.domain.LszTag;
import com.hexiaofei.provider0.domain.SjzEventIndex;
import com.hexiaofei.provider0.exception.PlatformException;
import com.hexiaofei.provider0.service.ILszTagService;
import com.hexiaofei.provider0.service.SjzEventIndexService;
import com.hexiaofei.provider0.vo.PageVo;
import com.hexiaofei.provider0.vo.SjzEventIndexVo;
import com.hexiaofei.provider0.web.BaseController;
import com.hexiaofei.provider0.web.SjzEventIndexController;
import com.lcyj.common.consts.TagTypeEnum;
import com.lcyj.common.utils.DateUtils;
import com.lcyj.common.vo.lsz.LszTagVo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.net.URL;
import java.util.Date;

@Controller
public class AdminLszTagController extends AdminBaseController implements BaseController<LszTag> {

    public static Logger LOGGER = LoggerFactory.getLogger(AdminLszTagController.class);

    @Autowired
    public SjzEventIndexService sjzEventIndexService;

    @Autowired
    public ILszTagService lszTagService;

    private final static String STATIC_BASE_URL = "/lszTag";


    @Override
    public String index() {
        return null;
    }

    @Override
    public String toAdd() {
        return null;
    }

    @Override
    public String add(LszTag lszTag) {
        return null;
    }

    @Override
    public ModelAndView toUpdate(Integer id) {
        return null;
    }

    @Override
    public ModelAndView update(LszTag lszTag) {
        return null;
    }

    @RequestMapping(STATIC_BASE_URL+"/getLszTag")
    @ResponseBody
    public LszTag getLszTag(LszTagVo lszTagVo){

        LszTag lszTag = new LszTag();
        lszTag.setRecordId(lszTagVo.getRecordId());
        lszTag.setTagType(lszTagVo.getTagType());
        lszTag = lszTagService.getLszTag(lszTag);

        return lszTag;
    }

    @Override
    public String list(LszTag lszTag, int currentPage, int pageSize) {
        return null;
    }

    @Override
    public String delete(Integer id) {
        return null;
    }
}
