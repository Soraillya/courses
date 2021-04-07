package com.sora.demo.mbg.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

@ApiModel(value="com.sora.demo.mbg.model.Sign_in")
public class Sign_in {
    @ApiModelProperty(value="signInId")
    private Integer signInId;

    @ApiModelProperty(value="courseId")
    private Integer courseId;

    @ApiModelProperty(value="teacherId")
    private Integer teacherId;

    @ApiModelProperty(value="classroomId")
    private Integer classroomId;

    @ApiModelProperty(value="classHourCost课时消耗")
    private Integer classHourCost;

    @ApiModelProperty(value="startTime签到开始时间")
    private Date startTime;

    @ApiModelProperty(value="finishTime签到结束时间")
    private Date finishTime;

    public Integer getSignInId() {
        return signInId;
    }

    public void setSignInId(Integer signInId) {
        this.signInId = signInId;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    public Integer getClassroomId() {
        return classroomId;
    }

    public void setClassroomId(Integer classroomId) {
        this.classroomId = classroomId;
    }

    public Integer getClassHourCost() {
        return classHourCost;
    }

    public void setClassHourCost(Integer classHourCost) {
        this.classHourCost = classHourCost;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(Date finishTime) {
        this.finishTime = finishTime;
    }
}