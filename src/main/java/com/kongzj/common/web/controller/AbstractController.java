package com.kongzj.common.web.controller;


import com.kongzj.common.exception.ErrorCode;

/**
 * @author kongzj （891134340@qq.com） createAt 2016/12/26
 */
public class AbstractController {

    protected Result success() {
        return success(null);
    }

    protected Result success(Object payload) {
        return Result.create(ErrorCode.SUCCESS, ErrorCode.SUCCESS.getMessage(), payload);
    }

    protected Result success(Object payload, String describe) {
        return Result.create(ErrorCode.SUCCESS, describe, payload);
    }

}
