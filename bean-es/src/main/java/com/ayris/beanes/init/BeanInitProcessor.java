package com.ayris.beanes.init;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class BeanInitProcessor implements BeanPostProcessor {

    private final Logger logger = LoggerFactory.getLogger(BeanInitProcessor.class);

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if ("beanInit1".equals(beanName) || "beanInit2".equals(beanName)) {
            logger.info("{}BeanPostProcessor-postProcessBeforeInitialization:{}", SymbolConstant.prefix_tag, beanName);

        }
        return null;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if ("beanInit2".equals(beanName)) {
            logger.info("{}BeanPostProcessor-postProcessAfterInitialization:{}", SymbolConstant.prefix_tag, beanName);

        }
        return null;
    }
}
