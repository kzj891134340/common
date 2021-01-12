package com.kongzj.common.exception;

import java.io.Serializable;

/**
 * @author kongzj （891134340@qq.com） createAt 2018/7/2
 */
public class SignatureException extends ServiceException {

    private static final long serialVersionUID = -2693525780077183404L;

    public SignatureException() {
        super();
    }

    public SignatureException(String message) {
        super(message);
    }

    public SignatureException(String message, Throwable cause) {
        super(message, cause);
    }

    public SignatureException(Throwable cause) {
        super(cause);
    }

    @Override
    public Serializable getErrorCode() {
        return ErrorCode.SIGNATURE_INVALID;
    }

}
