package com.pan.entity;

/**
 * 返回对象
 * @author tangpan
 */
public class ResultEntity {

    /* 编码 */
    private int code;
    /* 消息 */
    private String message;

    public ResultEntity() {
    }

    public ResultEntity(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
