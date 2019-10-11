package com.oldmonk.cloud.result;


/**
 * 响应结果信息封装
 *
 * @author xujingyang
 * @date 2018/05/25
 */
public class ResultMsg {
    /**
     * 返回信息码
     */
    private String code = Result.SUCCESS.getCode();
    /**
     * 返回信息内容
     */
    private String msg = "请求成功";

    public ResultMsg() {
    }

    public ResultMsg(Result result) {
        this.code = result.getCode();
        this.msg = result.getMsg();
    }

    public ResultMsg(String code) {
        this.code = code;
        this.msg = "";
    }

    public ResultMsg(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setResult(Result result) {
        this.code = result.getCode();
        this.msg = result.getMsg();
    }

    public void setResult(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "ResultMsg{" +
                "code='" + code + '\'' +
                ", msg='" + msg + '\'' +
                '}';
    }


}
