package com.yullin.wiki.domain.Board;

import lombok.AllArgsConstructor;
import lombok.Getter;
import java.util.Date;

@Getter
@AllArgsConstructor
public class Board {
    /**
     * @boardId: 게시물의 식별자
     * @title: 게시물의 제목 (default : 제목 없음)
     * @category: 게시물의 항목 (ex : 공간, 섬김, 열청 등)
     * @tag: 작성자가 추가 할 수 있는 해시 태그
     * @commentCnt: 게시물에 달린 댓글 수(대 댓글 포함)
     * @status: 게시물의 상태 (게시, 임시)
     * @createDt: 게시물 생성 시간
     * @lastUpdateDt: 게시물 최신 업데이트 시간
     */
    private int boardID;
    private String title;
    private String category;
    private String tag;
    private int commentCnt;
    private int status;
    private Date createDt;
    private Date lastUpdateDt;

}
