package com.xbd.common.utils;


/**
 * Created by zhaohong on 2017/9/19.
 */
public class Result<T> {

    private String code; // 结果编码(0:成功 其他:失败)

    private String msg; // 结果描述

    private T data; // 业务对象信息

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

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public static <T> Result<T> success(String msg) {
        Result<T> ret = new Result<T>();
        ret.setCode("0");
        ret.setMsg(msg);
        return ret;
    }
    public static <T> Result<T> success(String msg, T data) {
        Result<T> ret = new Result<T>();
        ret.setCode("0");
        ret.setMsg(msg);
        ret.setData(data);
        return ret;
    }
    public static  Result success() {
        Result ret = new Result();
        ret.setCode("0");
        return ret;
    }

    public static <T> Result<T> error(String code, String message) {
        Result<T> ret = new Result<T>();
        ret.setCode(code);
        ret.setMsg(message);
        return ret;
    }

    @Override
    public String toString() {
        return "Result{" +
                "code='" + code + '\'' +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }
}
