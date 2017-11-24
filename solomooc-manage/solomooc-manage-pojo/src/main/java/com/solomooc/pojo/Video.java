package com.solomooc.pojo;

import com.solomooc.common.po.BasePojo;

import java.util.Date;

public class Video extends BasePojo{
    //视频ID
    private Long videoId;
    //视频名称
    private String videoName;
    //视频标题
    private String title;
    //视频模块
    private Long moduleId;
    //视频状态
    private Integer videoStatus;
    //视频连接
    private String url;

    public Long getVideoId() {
        return videoId;
    }

    public void setVideoId(Long videoId) {
        this.videoId = videoId;
    }

    public String getVideoName() {
        return videoName;
    }

    public void setVideoName(String videoName) {
        this.videoName = videoName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getModuleId() {
        return moduleId;
    }

    public void setModuleId(Long moduleId) {
        this.moduleId = moduleId;
    }

    public Integer getVideoStatus() {
        return videoStatus;
    }

    public void setVideoStatus(Integer videoStatus) {
        this.videoStatus = videoStatus;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}