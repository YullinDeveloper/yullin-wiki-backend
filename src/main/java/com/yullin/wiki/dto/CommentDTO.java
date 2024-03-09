package com.yullin.wiki.dto;

import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class CommentDTO {

    private int commentId;
    private int boardId;
    private String memberId;
    private boolean reYn;
    private String comment;
    private int likesCnt;
    private int order;
    private Date createDt;
    private Date lastUpdateDt;

    public int getCommentId() {
        return commentId;
    }

    public void setCommentId(int commentId) {
        this.commentId = commentId;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public boolean isReYn() {
        return reYn;
    }

    public void setReYn(boolean reYn) {
        this.reYn = reYn;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public int getLikesCnt() {
        return likesCnt;
    }

    public void setLikesCnt(int likesCnt) {
        this.likesCnt = likesCnt;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public Date getCreateDt() {
        return createDt;
    }

    public void setCreateDt(Date createDt) {
        this.createDt = createDt;
    }

    public Date getLastUpdateDt() {
        return lastUpdateDt;
    }

    public void setLastUpdateDt(Date lastUpdateDt) {
        this.lastUpdateDt = lastUpdateDt;
    }

    @Override
    public String toString() {
        return "CommentDTO{" +
                "commentId=" + commentId +
                ", boardId=" + boardId +
                ", memberId='" + memberId + '\'' +
                ", reYn=" + reYn +
                ", comment='" + comment + '\'' +
                ", likesCnt=" + likesCnt +
                ", order=" + order +
                ", createDt=" + createDt +
                ", lastUpdateDt=" + lastUpdateDt +
                '}';
    }

}
