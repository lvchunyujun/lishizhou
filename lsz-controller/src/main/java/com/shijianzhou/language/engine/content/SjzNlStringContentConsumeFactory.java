package com.shijianzhou.language.engine.content;

public class SjzNlStringContentConsumeFactory implements SjzNlContentConsumeFactory {

    @Override
    public ISjzNlContentConsume getContentConsume() {
        return new SjzNlStringContentConsume();
    }

    @Override
    public ISjzNlContentConsume getContentCacheConsume() {
        return null;
    }
}
