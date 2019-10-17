package com.os.system.tools;

import java.io.Serializable;

public class LayuiResultMap<T> implements Serializable {
    private String msg;
    private  T data;
    private  int code;
    private  int count;
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
    public int getCode() {
        return code;
    }
    public void setCode(int code) {
        this.code = code;
    }
    public int getCount() {
        return count;
    }
    public void setCount(int count) {
        this.count = count;
    }
    public LayuiResultMap(String msg, T data, int code, int count) {
        this.msg = msg;
        this.data = data;
        this.code = code;
        this.count = count;
    }
    public LayuiResultMap() {
    }
}
