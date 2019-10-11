package com.oldmonk.cloud.config;

import com.netflix.hystrix.exception.HystrixRuntimeException;
import com.oldmonk.exception.ParameterException;
import com.oldmonk.exception.ServiceException;
import com.oldmonk.result.Result;
import com.oldmonk.result.ResultMsg;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.NoHandlerFoundException;

/**
 * @program: mpm-mpush
 * @description: 统一异常处理
 * @author: xujingyang
 * @create: 2019-01-15 18:45
 **/

@ControllerAdvice
public class ExceptionAdvice {

    /**
     * 业务层异常捕捉处理
     *
     * @param e
     * @return
     */
    @ResponseBody
    @ExceptionHandler(value = ServiceException.class)
    public ResultMsg errorHandler(ServiceException e) {
        return new ResultMsg(e.getCode(), e.getMessage());
    }

    /**
     * 参数异常捕捉处理
     *
     * @param e
     * @return
     */
    @ResponseBody
    @ExceptionHandler(value = ParameterException.class)
    public ResultMsg paramHandler(ParameterException e) {
        return new ResultMsg(e.getCode(), e.getMessage());
    }

    /**
     * 接口不存在异常捕捉处理
     *
     * @param e
     * @return
     */
    @ResponseBody
    @ExceptionHandler(value = NoHandlerFoundException.class)
    public ResultMsg noHandler(NoHandlerFoundException e) {
        return new ResultMsg(Result.NOINTERFACEEXCEPTIONMSG);
    }

    @ResponseBody
    @ExceptionHandler(value = HystrixRuntimeException.class)
    public ResultMsg hsHandler(HystrixRuntimeException e) {
        return new ResultMsg(Result.CHAOSHI);
    }


    /**
     * 全局异常捕捉处理
     *
     * @param e
     * @return
     */
    @ResponseBody
    @ExceptionHandler(value = Exception.class)
    public ResultMsg errorHandler(Exception e) {
        e.printStackTrace();
        String message = String.format("接口出现异常,请联系后台开发人员!【异常摘要：%s】", e.getMessage());
        return new ResultMsg(Result.ERROR.getCode(), message);
    }
}
