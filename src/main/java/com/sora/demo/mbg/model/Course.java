package com.sora.demo.mbg.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.Date;

@ApiModel(value="com.sora.demo.mbg.model.Course")
public class Course {
    @ApiModelProperty(value="courseId")
    private Integer courseId;

    @ApiModelProperty(value="teacherId")
    private String teacherId;

    @ApiModelProperty(value="classroomId教室")
    private String classroomId;

    @ApiModelProperty(value="courseName课程名称")
    private String courseName;

    @ApiModelProperty(value="courseImage图片")
    private String courseImage;

    @ApiModelProperty(value="courseStartDate开课日期")
    private Date courseStartDate;

    @ApiModelProperty(value="courseTerm总学时")
    private Integer courseTerm;

    @ApiModelProperty(value="courseNumberLimit人数限制")
    private String courseNumberLimit;

    @ApiModelProperty(value="coursePrice原价格")
    private BigDecimal coursePrice;

    @ApiModelProperty(value="courseVipPrice会员优惠价格")
    private BigDecimal courseVipPrice;

    @ApiModelProperty(value="courseStatus课程出售状态，0->暂停出售，1->出售中")
    private Integer courseStatus;

    @ApiModelProperty(value="courseDescription描述")
    private String courseDescription;

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId == null ? null : teacherId.trim();
    }

    public String getClassroomId() {
        return classroomId;
    }

    public void setClassroomId(String classroomId) {
        this.classroomId = classroomId == null ? null : classroomId.trim();
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName == null ? null : courseName.trim();
    }

    public String getCourseImage() {
        return courseImage;
    }

    public void setCourseImage(String courseImage) {
        this.courseImage = courseImage == null ? null : courseImage.trim();
    }

    public Date getCourseStartDate() {
        return courseStartDate;
    }

    public void setCourseStartDate(Date courseStartDate) {
        this.courseStartDate = courseStartDate;
    }

    public Integer getCourseTerm() {
        return courseTerm;
    }

    public void setCourseTerm(Integer courseTerm) {
        this.courseTerm = courseTerm;
    }

    public String getCourseNumberLimit() {
        return courseNumberLimit;
    }

    public void setCourseNumberLimit(String courseNumberLimit) {
        this.courseNumberLimit = courseNumberLimit == null ? null : courseNumberLimit.trim();
    }

    public BigDecimal getCoursePrice() {
        return coursePrice;
    }

    public void setCoursePrice(BigDecimal coursePrice) {
        this.coursePrice = coursePrice;
    }

    public BigDecimal getCourseVipPrice() {
        return courseVipPrice;
    }

    public void setCourseVipPrice(BigDecimal courseVipPrice) {
        this.courseVipPrice = courseVipPrice;
    }

    public Integer getCourseStatus() {
        return courseStatus;
    }

    public void setCourseStatus(Integer courseStatus) {
        this.courseStatus = courseStatus;
    }

    public String getCourseDescription() {
        return courseDescription;
    }

    public void setCourseDescription(String courseDescription) {
        this.courseDescription = courseDescription == null ? null : courseDescription.trim();
    }
}