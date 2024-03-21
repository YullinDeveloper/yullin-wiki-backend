package com.yullin.wiki.domain.Member;


import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Date;

@Getter
@AllArgsConstructor
public class Member {
    /**
     * @memberId: 멤버 식별자
     * @passwd: 비밀번호 (암호화 필요)
     * @gender: 성별
     * @birthDt: 생년월일
     * @yullinYn: 열린교회 교인 여부
     * @memeberType: 멤버 타입 (관리자, 일반 유저)
     * @joinDt: 멤버 회원가입 시간
     * @lastUpdateDt: 멤버 정보 최신 업데이트 시간
     */
    private String memberId;
    private String passwd;
    private char gender;
    private Date birthDt;
    private int yullinYn;
    private String memberType;
    private Date joinDt;
    private Date lastUpdateDt;

}
