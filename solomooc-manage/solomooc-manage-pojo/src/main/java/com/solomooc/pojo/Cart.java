package com.solomooc.pojo;

import com.solomooc.common.po.BasePojo;

import java.util.Date;

public class Cart extends BasePojo{
    //购物车ID
    private Long cartId;
    //用户ID
    private Long userId;
    //模块ID
    private Long moduleId;
    //模块名称
    private String moduleName;
    //图片
    private String image;
    //价格
    private Double price;

    public Long getCartId() {
        return cartId;
    }

    public void setCartId(Long cartId) {
        this.cartId = cartId;
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

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
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
}