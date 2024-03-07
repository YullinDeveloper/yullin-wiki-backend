package com.yullin.wiki.common;

import com.yullin.wiki.common.status.BaseResponseStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;

@AllArgsConstructor
@Getter
public class BaseErrorResponse implements BaseResponseStatus {
    private final int code;
    private final int status;
    private final String message;
    private final LocalDateTime timestamp;

    public BaseErrorResponse(BaseResponseStatus status){
        this.code = status.getCode();
        this.status = status.getStatus();
        this.message = status.getMessage();
        this.timestamp = LocalDateTime.now();
    }
    public BaseErrorResponse(BaseResponseStatus status, String message){
        this.code = status.getCode();
        this.status = status.getStatus();
        this.message = message;
        this.timestamp = LocalDateTime.now();
    }

}
