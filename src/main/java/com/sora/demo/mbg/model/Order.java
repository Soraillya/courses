package com.sora.demo.mbg.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

@ApiModel(value="com.sora.demo.mbg.model.Order")
public class Order {
    @ApiModelProperty(value="orderId")
    private Integer orderId;

    @ApiModelProperty(value="studentId")
    private Integer studentId;

    @ApiModelProperty(value="courseId")
    private Integer courseId;

    @ApiModelProperty(value="orderClassHour所购买课程的课时")
    private String orderClassHour;

    @ApiModelProperty(value="orderAmount交易金额")
    private String orderAmount;

    @ApiModelProperty(value="orderTime下单时间")
    private Date orderTime;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public String getOrderClassHour() {
        return orderClassHour;
    }

    public void setOrderClassHour(String orderClassHour) {
        this.orderClassHour = orderClassHour == null ? null : orderClassHour.trim();
    }

    public String getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(String orderAmount) {
        this.orderAmount = orderAmount == null ? null : orderAmount.trim();
    }

    public Date getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }
}