package com.kongzj.common.web.controller;

import com.kongzj.common.exception.ErrorCode;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * Rest Controller 控制器异常处理控制器
 *
 * @author kongzj createAt 2018/6/12
 */
@Slf4j
@Configuration
@ConditionalOnClass(BadCredentialsException.class)
@RestControllerAdvice
public class SecurityRestControllerExceptionHandlerController {

    @ExceptionHandler({BadCredentialsException.class})
    public Result badCredentialsException(BadCredentialsException e) {
        log.error("无效的授权信息: {}", e.getMessage(), e);
        return new Result(ErrorCode.UNAUTHORIZED.getCode(), e.getMessage(), null);
    }

}
