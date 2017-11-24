package com.solomooc.pojo;

import com.solomooc.common.po.BasePojo;

import java.util.Date;

public class Study extends BasePojo{
    //学习ID
    private Long studyId;
    //用户ID
    private Long userId;
    //模块ID
    private Long moduleId;
    //视频ID
    private Long videoId;

    public Long getStudyId() {
        return studyId;
    }

    public void setStudyId(Long studyId) {
        this.studyId = studyId;
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

    public Long getVideoId() {
        return videoId;
    }

    public void setVideoId(Long videoId) {
        this.videoId = videoId;
    }
}