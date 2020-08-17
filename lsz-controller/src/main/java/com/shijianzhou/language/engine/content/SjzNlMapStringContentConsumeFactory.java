package com.shijianzhou.language.engine.content;

import com.hexiaofei.provider0.common.SpringContextUtil;
import org.springframework.context.annotation.Bean;

public class SjzNlMapStringContentConsumeFactory implements SjzNlContentConsumeFactory {

    @Bean
    public ISjzNlContentConsume getContentConsume() {
        return SpringContextUtil.getBean("sjzNlMapStringContentConsume");
    }

    @Bean
    public ISjzNlContentConsume getContentCacheConsume() {
        return SpringContextUtil.getBean("sjzNlMapStringContentCacheConsume");
    }
 
}
