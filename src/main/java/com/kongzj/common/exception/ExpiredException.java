package com.kongzj.common.exception;

import java.io.Serializable;


public class ExpiredException extends ServiceException {

    private static final long serialVersionUID = 3590770639688528840L;

    public ExpiredException() {
        super();
    }

    public ExpiredException(String message) {
        super(message);
    }

    public ExpiredException(String message, Throwable cause) {
        super(message, cause);
    }

    public ExpiredException(Throwable cause) {
        super(cause);
    }

    @Override
    public Serializable getErrorCode() {
        return ErrorCode.EXPIRED_ERROR;
    }
}
