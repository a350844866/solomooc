package com.solomooc.pojo;

import com.solomooc.common.po.BasePojo;

import java.util.Date;
//视频类别
public class VideoClass extends BasePojo{
    //视频类别ID
    private Long classId;

    //类别名称
    private String className;


    public Long getClassId() {
        return classId;
    }

    public void setClassId(Long classId) {
        this.classId = classId;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className == null ? null : className.trim();
    }

}