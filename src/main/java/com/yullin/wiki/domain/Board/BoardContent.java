package com.yullin.wiki.domain.Board;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Date;

@Getter
@AllArgsConstructor
public class BoardContent {
    /**
     * @contentId; 소제목 (heading) 별 게시글 식별자
     * @boradId: 게시물 식별자
     * @headingTitle: 소제목
     * @headingType: 소제목 타입(ex h1, h2, h3)
     * @content: 게시글 내용
     * @order: 게시글 의 순서
     * @createDt: 게시글 생성 시간
     * @lastUpdateDt: 게시글 최신 업데이트 시간
     */
    private int contentId;
    private int boardId;
    private String headingTitle;
    private int headingType;
    private String content;
    private int order;
    private Date createDt;
    private Date lastUpdateDt;
}
