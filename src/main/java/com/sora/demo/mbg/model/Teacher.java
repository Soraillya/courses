package com.sora.demo.mbg.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value="com.sora.demo.mbg.model.Teacher")
public class Teacher {
    @ApiModelProperty(value="teacherId")
    private Integer teacherId;

    @ApiModelProperty(value="userId")
    private Integer userId;

    @ApiModelProperty(value="teacherName姓名")
    private String teacherName;

    @ApiModelProperty(value="teacherImage头像图片")
    private String teacherImage;

    @ApiModelProperty(value="teacherPhone手机号码")
    private String teacherPhone;

    @ApiModelProperty(value="teacherEmail邮箱地址")
    private String teacherEmail;

    @ApiModelProperty(value="teacherDescription个人描述")
    private String teacherDescription;

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName == null ? null : teacherName.trim();
    }

    public String getTeacherImage() {
        return teacherImage;
    }

    public void setTeacherImage(String teacherImage) {
        this.teacherImage = teacherImage == null ? null : teacherImage.trim();
    }

    public String getTeacherPhone() {
        return teacherPhone;
    }

    public void setTeacherPhone(String teacherPhone) {
        this.teacherPhone = teacherPhone == null ? null : teacherPhone.trim();
    }

    public String getTeacherEmail() {
        return teacherEmail;
    }

    public void setTeacherEmail(String teacherEmail) {
        this.teacherEmail = teacherEmail == null ? null : teacherEmail.trim();
    }

    public String getTeacherDescription() {
        return teacherDescription;
    }

    public void setTeacherDescription(String teacherDescription) {
        this.teacherDescription = teacherDescription == null ? null : teacherDescription.trim();
    }
}