package com.kongzj.common.web.security.oauth2;

import com.kongzj.common.web.security.UserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.provider.token.UserAuthenticationConverter;

/**
 * @author Sean Create At 2020/1/3
 */
@Configuration
@ConditionalOnClass(UserAuthenticationConverter.class)
public class UserAuthenticationConverterConfiguration {

    @Autowired(required = false)
    private UserDetailsService userDetailsService;

    @Bean
    public UserAuthenticationConverter userAuthenticationConverter() {
        UserAuthenticationConverterImpl converter = new UserAuthenticationConverterImpl();
        if (null != userDetailsService) {
            converter.setUserDetailsService(userDetailsService);
        }
        return converter;
    }

}
