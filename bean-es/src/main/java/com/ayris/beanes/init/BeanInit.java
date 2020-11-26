package com.ayris.beanes.init;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("beanInit1")
public class BeanInit implements InitializingBean, DisposableBean {
    private static final Logger logger = LoggerFactory.getLogger(BeanInit.class);

    @PostConstruct
    public void afterInit() {
        logger.info("{}PostConstruct注解，初始化后处理:{}", SymbolConstant.prefix_tag, this);
    }

    @PreDestroy
    public void preDestroy() {
        logger.info("{}PreDestroy注解，销毁前处理:{}", SymbolConstant.prefix_tag, this);
    }

    @Override
    public void afterPropertiesSet() {
        logger.info("{}InitializingBean接口，初始化后处理:{}", SymbolConstant.prefix_tag, this);
    }

    @Override
    public void destroy() {
        logger.info("{}DisposableBean接口，销毁前处理:{}", SymbolConstant.prefix_tag, this);
    }
}
