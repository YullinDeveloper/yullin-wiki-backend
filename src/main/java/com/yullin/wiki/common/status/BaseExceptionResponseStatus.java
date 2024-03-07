package com.yullin.wiki.common.status;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

@Getter
@RequiredArgsConstructor
public enum BaseExceptionResponseStatus implements BaseResponseStatus {

    //  1000: 요청 성공
    SUCCESS(1000, HttpStatus.OK.value(),"요청에 성공하였습니다.");

    // 2000: Request 오류 (Bad Request)

    // 3000: Database, Server 오류 (INTERNAL_SERVER_ERROR)

    // 4000: Authorization 오류

    //

    private final int code;
    private final int status;
    private final String message;

}
