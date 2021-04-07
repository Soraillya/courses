package com.sora.demo.mbg.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

@ApiModel(value="com.sora.demo.mbg.model.Student")
public class Student {
    @ApiModelProperty(value="studentId")
    private Integer studentId;

    @ApiModelProperty(value="userId")
    private Integer userId;

    @ApiModelProperty(value="studentImage头像图片")
    private String studentImage;

    @ApiModelProperty(value="studentName真实姓名")
    private String studentName;

    @ApiModelProperty(value="studentGender性别：0->未知；1->男；2->女")
    private Integer studentGender;

    @ApiModelProperty(value="studentPhone手机号码")
    private String studentPhone;

    @ApiModelProperty(value="studentEmail邮箱")
    private String studentEmail;

    @ApiModelProperty(value="studentAccountBalance账户余额")
    private String studentAccountBalance;

    @ApiModelProperty(value="studentPaymentPassword支付密码")
    private String studentPaymentPassword;

    @ApiModelProperty(value="studentVipStatus会员状态：0->未开通；1->已开通")
    private Integer studentVipStatus;

    @ApiModelProperty(value="studentVipTime会员剩余时长")
    private Date studentVipTime;

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getStudentImage() {
        return studentImage;
    }

    public void setStudentImage(String studentImage) {
        this.studentImage = studentImage == null ? null : studentImage.trim();
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName == null ? null : studentName.trim();
    }

    public Integer getStudentGender() {
        return studentGender;
    }

    public void setStudentGender(Integer studentGender) {
        this.studentGender = studentGender;
    }

    public String getStudentPhone() {
        return studentPhone;
    }

    public void setStudentPhone(String studentPhone) {
        this.studentPhone = studentPhone == null ? null : studentPhone.trim();
    }

    public String getStudentEmail() {
        return studentEmail;
    }

    public void setStudentEmail(String studentEmail) {
        this.studentEmail = studentEmail == null ? null : studentEmail.trim();
    }

    public String getStudentAccountBalance() {
        return studentAccountBalance;
    }

    public void setStudentAccountBalance(String studentAccountBalance) {
        this.studentAccountBalance = studentAccountBalance == null ? null : studentAccountBalance.trim();
    }

    public String getStudentPaymentPassword() {
        return studentPaymentPassword;
    }

    public void setStudentPaymentPassword(String studentPaymentPassword) {
        this.studentPaymentPassword = studentPaymentPassword == null ? null : studentPaymentPassword.trim();
    }

    public Integer getStudentVipStatus() {
        return studentVipStatus;
    }

    public void setStudentVipStatus(Integer studentVipStatus) {
        this.studentVipStatus = studentVipStatus;
    }

    public Date getStudentVipTime() {
        return studentVipTime;
    }

    public void setStudentVipTime(Date studentVipTime) {
        this.studentVipTime = studentVipTime;
    }
}