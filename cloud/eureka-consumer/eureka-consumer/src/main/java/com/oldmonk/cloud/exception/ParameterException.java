package com.oldmonk.cloud.exception;


import com.oldmonk.cloud.result.Result;

/**
 * 参数异常，例如参数长度不符合，结合validation
 *
 * @author xujingyang
 * @date 2018/07/9
 */
public class ParameterException extends RuntimeException {

    private String code = Result.PARANERROE.getCode();

    public ParameterException() {
    }

    public ParameterException(String message) {
        super(message);
    }

    public ParameterException(String message, Throwable cause) {
        super(message, cause);
    }

    public ParameterException(Result result) {
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
