package com.yullin.wiki.common;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.yullin.wiki.common.status.ResponseStatus;
import lombok.Getter;

import static com.yullin.wiki.common.status.BaseExceptionResponseStatus.SUCCESS;

@Getter
@JsonPropertyOrder({"code", "status", "message", "result"})
public class BaseResponse<T> implements ResponseStatus {
    private final int code;
    private final int status;
    private final String message;
    private final T result;

    public BaseResponse(T result){
        this.code = SUCCESS.getCode();
        this.status = SUCCESS.getStatus();
        this.message = SUCCESS.getMessage();
        this.result = result;
    }


}
