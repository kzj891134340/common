package com.kongzj.common.web;

import com.kongzj.common.web.controller.ErrorControllerImpl;
import org.springframework.boot.autoconfigure.AutoConfigureBefore;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.web.ServerProperties;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;
import org.springframework.boot.web.servlet.error.ErrorAttributes;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author 田尘殇Sean(sean.snow @ live.com) createAt 2018/9/5
 */
@Configuration
@AutoConfigureBefore(ErrorMvcAutoConfiguration.class)
public class WebErrorConfiguration {

    @Bean
    @ConditionalOnMissingBean(value = ErrorController.class)
    public ErrorController errorController(ErrorAttributes errorAttributes, ServerProperties serverProperties) {
        return new ErrorControllerImpl(errorAttributes, serverProperties.getError());
    }

}
