package com.shijianzhou.language.engine.content;

import org.springframework.context.annotation.Bean;

public interface SjzNlContentConsumeFactory {

    /**
     *
     */
    ISjzNlContentConsume getContentConsume();

    ISjzNlContentConsume getContentCacheConsume();
}
