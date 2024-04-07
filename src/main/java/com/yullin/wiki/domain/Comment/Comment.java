package com.yullin.wiki.domain.Comment;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Date;

@Getter
@AllArgsConstructor
public class Comment {
    /**
     * @commentId : 댓글 식별자
     * @boardId : 게시물 식별자
     * @memberId : 댓글작성자 멤버 식별자
     * @reYn : 대댓글 여부
     * @comment : 댓글 내용
     * @likeCnt : 좋아요 수
     * @order : 댓글 순서
     * @createDt : 댓글 생성 시간
     * @lastUpdateDt : 댓글 최신 업데이트 시간
     */
    private int commentId;
    private int boardId;
    private String memberId;
    private int reYn;
    private String comment;
    private int likeCnt;
    private int order;
    private Date creatDt;
    private Date lastUpdateDt;
}
