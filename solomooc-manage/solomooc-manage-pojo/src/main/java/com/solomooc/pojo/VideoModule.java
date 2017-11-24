package com.solomooc.pojo;

import com.solomooc.common.po.BasePojo;

import java.util.Date;
//视频模块
public class VideoModule extends BasePojo{
    //模块ID
    private Long moduleId;
    //模块名称
    private String moduleName;
    //视频类别ID
    private  Long classId;
    //图片
    private String image;
    //价格
    private Double price;
    //评分
    private Double score;
    //购买人数
    private Integer buyed;
    //赚取金额 通过这个统计这个模块买了多少钱 包括原价或者秒杀价
    private Double earn;
    //模块状态 0正常 1禁用 更新 2删除
    private Integer moduleStatus;
    //热度
    private Integer heat;
    //模块简介
    private String intro;

    public Long getModuleId() {
        return moduleId;
    }

    public void setModuleId(Long moduleId) {
        this.moduleId = moduleId;
    }

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public Long getClassId() {
        return classId;
    }

    public void setClassId(Long classId) {
        this.classId = classId;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public Integer getBuyed() {
        return buyed;
    }

    public void setBuyed(Integer buyed) {
        this.buyed = buyed;
    }

    public Double getEarn() {
        return earn;
    }

    public void setEarn(Double earn) {
        this.earn = earn;
    }

    public Integer getModuleStatus() {
        return moduleStatus;
    }

    public void setModuleStatus(Integer moduleStatus) {
        this.moduleStatus = moduleStatus;
    }

    public Integer getHeat() {
        return heat;
    }

    public void setHeat(Integer heat) {
        this.heat = heat;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }
}