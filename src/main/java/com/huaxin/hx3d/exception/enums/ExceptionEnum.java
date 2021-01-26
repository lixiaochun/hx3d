package com.huaxin.hx3d.exception.enums;

import com.huaxin.hx3d.exception.BaseExceptionInfoInterface;

/**
 * @author ：diaoby
 * @date ：Created in 2021/1/16 8:26
 * @description：异常接口枚举
 * @modified By：
 */
public enum ExceptionEnum implements BaseExceptionInfoInterface{
    // 数据操作错误定义
    SUCCESS("200", "成功!"),
    BODY_NOT_MATCH("400","请求的数据格式不符!"),
    SIGNATURE_NOT_MATCH("401","请求的数字签名不匹配!"),
    NOT_FOUND("404", "未找到该资源!"),
    INTERNAL_SERVER_ERROR("500", "服务器内部错误!"),
    SERVER_BUSY("503","服务器正忙，请稍后再试!");

    /**
     *
     * @param resultCode 错误码
     * @param resultMsg 错误描述
     */
    ExceptionEnum(String resultCode, String resultMsg) {
        this.resultCode = resultCode;
        this.resultMsg = resultMsg;
    }

    /** 错误码 */
    private String resultCode;

    /** 错误描述 */
    private String resultMsg;
    /**
     *
     */
    @Override
    public String getResultCode() {
        return resultCode;
    }

    /**
     *
     * @return
     */
    @Override
    public String getResultMsg() {
        return resultMsg;
    }
}
