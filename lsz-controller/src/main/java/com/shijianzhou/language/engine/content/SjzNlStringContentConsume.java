package com.shijianzhou.language.engine.content;

import com.hexiaofei.provider0.common.consts.SjzSystemConsts;
import com.hexiaofei.provider0.domain.SjzEventIndex;
import com.hexiaofei.provider0.domain.SjzEventIndexTemp;
import com.hexiaofei.provider0.exception.PlatformException;
import com.hexiaofei.provider0.service.SjzEventIndexService;
import com.hexiaofei.provider0.service.SjzEventIndexTempService;
import com.shijianzhou.language.common.consts.RelatePatternUnitUseStatusEnuma;
import com.shijianzhou.language.domain.SjzNlRelatePatternUnit;
import com.shijianzhou.language.engine.parse.JsoupDocumentParser;
import com.shijianzhou.language.engine.parse.ParserFactory;
import com.shijianzhou.language.service.SjzNlRelatePatternUnitService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;



public class SjzNlStringContentConsume implements ISjzNlContentConsume<String> {

    private final static Logger LOGGER = LoggerFactory.getLogger(SjzNlStringContentConsume.class);

    @Autowired
    private SjzNlRelatePatternUnitService sjzNlRelatePatternUnitService;

    @Autowired
    private SjzEventIndexTempService sjzEventIndexTempService;

    @Autowired
    private SjzEventIndexService sjzEventIndexService;

    /**
     * //  1. 获取关联模板匹配名称
     * //  2. 判断关联模板使用状态
     * //  3. 根据模板名称返回匹配单元列表；
     * //  4. 根据匹配单元做匹配
     * //  5. 符合条件的记录到 缓存表+事件表， 不符合条件的只记录 缓存表
     *
     * @param textStr 待处理的目标文本字符串
     */
    @Override
    public void doProcess(String textStr) {


    }





}
