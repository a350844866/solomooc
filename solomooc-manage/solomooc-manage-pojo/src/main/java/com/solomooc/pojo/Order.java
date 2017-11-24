package com.solomooc.pojo;

import com.solomooc.common.po.BasePojo;

import java.util.Date;

public class Order extends BasePojo{
    //订单ID
    private Long orderId;
    //实付金额
    private Double payment;
    //支付状态 0易宝支付
    private Integer payType;
    //订单状态
    private Integer orderStatus;
    //交易结束时间
    private Date endTime;
    //用户ID
    private Long userId;

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Double getPayment() {
        return payment;
    }

    public void setPayment(Double payment) {
        this.payment = payment;
    }

    public Integer getPayType() {
        return payType;
    }

    public void setPayType(Integer payType) {
        this.payType = payType;
    }

    public Integer getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}