package com.ayris.beanes.init;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanInitConfig {

    @Bean(initMethod = "afterInit2", destroyMethod = "preDestroy2", name = "beanInit2")
    public BeanInit2 create() {
        return new BeanInit2();
    }
}

class BeanInit2 {
    private final Logger logger = LoggerFactory.getLogger(BeanInit2.class);

    public void afterInit2() {
        logger.info("{}initMethod,初始化后处理:{}", SymbolConstant.prefix_tag, this);
    }

    public void preDestroy2() {
        logger.info("{}destroyMethod,销毁前处理:{}", SymbolConstant.prefix_tag, this);
    }
}
