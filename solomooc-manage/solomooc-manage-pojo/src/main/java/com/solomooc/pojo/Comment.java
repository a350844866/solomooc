package com.solomooc.pojo;

import com.solomooc.common.po.BasePojo;

import java.util.Date;

public class Comment extends BasePojo{
    //评论ID
    private Long commentId;
    //用户ID
    private Long userId;
    //模块ID
    private Long moduleId;
    //评分
    private Double score;
    //评论内容
    private String detail;

    public Long getCommentId() {
        return commentId;
    }

    public void setCommentId(Long commentId) {
        this.commentId = commentId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getModuleId() {
        return moduleId;
    }

    public void setModuleId(Long moduleId) {
        this.moduleId = moduleId;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }
}