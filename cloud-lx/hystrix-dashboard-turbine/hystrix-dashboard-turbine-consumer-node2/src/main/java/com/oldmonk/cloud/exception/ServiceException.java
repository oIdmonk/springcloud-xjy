package com.oldmonk.cloud.exception;


import com.oldmonk.cloud.result.Result;

/**
 * 服务（业务）异常如“ 账号或密码错误 ”，业务上错误请抛此异常即可
 *
 * @author xujingyang
 * @date 2018/05/28
 */
public class ServiceException extends RuntimeException {

    private String code = Result.SERVICEERROR.getCode();

    public ServiceException() {
    }

    public ServiceException(String message) {
        super(message);
    }

    public ServiceException(String message, Throwable cause) {
        super(message, cause);
    }

    public ServiceException(Result result) {
        super(result.getMsg());
        this.code = result.getCode();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
