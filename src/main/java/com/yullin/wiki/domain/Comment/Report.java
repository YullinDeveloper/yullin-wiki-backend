package com.yullin.wiki.domain.Comment;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Date;

@Getter
@AllArgsConstructor
public class Report {
    /**
     * @reportId: 신고 식별자
     * @memberId: 피신고 멤버 식별자
     * @commentId: 피신고 댓글 식별자
     * @reason: 신고사유
     * @status: 신고 처리 상태
     * @creatDt: 신고 시작 시간
     * @lastUpdateDt: 신고 최고 최신 업데이트 시간
     */
    private int reportId;
    private String memberId;
    private int commentId;
    private String reason;
    private String status;
    private Date createDt;
    private Date lastUpdateDt;
}
