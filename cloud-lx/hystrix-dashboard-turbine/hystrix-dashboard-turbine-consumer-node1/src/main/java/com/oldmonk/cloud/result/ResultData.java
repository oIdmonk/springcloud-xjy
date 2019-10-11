package com.oldmonk.cloud.result;

/**
 * 响应结果数据集封装
 *
 * @author xujingyang
 * @date 2018/05/25
 */
public class ResultData<T> extends ResultMsg {

    private T resultData;

    public ResultData() {
    }

    public ResultData(T resultData) {
        this.resultData = resultData;
    }

    public ResultData(Result msg) {
        super(msg);
    }

    public ResultData(String rspCode, String rspMsg) {
        super(rspCode, rspMsg);
    }

    public ResultData(String rspCode, String rspMsg, T resultData) {
        super(rspCode, rspMsg);
        this.resultData = resultData;
    }

    public ResultData(Result msg, T resultData) {
        super(msg);
        this.resultData = resultData;
    }

    public T getResultData() {
        return resultData;
    }

    public void setResultData(T resultData) {
        this.resultData = resultData;
    }

    @Override
    public String toString() {
        return "ResultData{" +
                "data=" + resultData +
                "} " + super.toString();
    }
}
