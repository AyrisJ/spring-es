package com.ayris.beanes.init;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class BeanAware implements ApplicationContextAware {

    private final Logger logger = LoggerFactory.getLogger(BeanAware.class);

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        BeanInit beanInit = (BeanInit) applicationContext.getBean("beanInit1");
        logger.info("{}Bean name:beanInit1,instance:{}", SymbolConstant.prefix_tag, beanInit);
    }
}
