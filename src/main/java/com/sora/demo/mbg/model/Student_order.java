package com.sora.demo.mbg.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value="com.sora.demo.mbg.model.Student_order")
public class Student_order {
    @ApiModelProperty(value="studentOrderId")
    private Integer studentOrderId;

    @ApiModelProperty(value="studentId")
    private Integer studentId;

    @ApiModelProperty(value="courseId")
    private Integer courseId;

    @ApiModelProperty(value="totalClassHour已拥有总时长")
    private String totalClassHour;

    @ApiModelProperty(value="usedClassHour已使用时长")
    private String usedClassHour;

    public Integer getStudentOrderId() {
        return studentOrderId;
    }

    public void setStudentOrderId(Integer studentOrderId) {
        this.studentOrderId = studentOrderId;
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

    public String getTotalClassHour() {
        return totalClassHour;
    }

    public void setTotalClassHour(String totalClassHour) {
        this.totalClassHour = totalClassHour == null ? null : totalClassHour.trim();
    }

    public String getUsedClassHour() {
        return usedClassHour;
    }

    public void setUsedClassHour(String usedClassHour) {
        this.usedClassHour = usedClassHour == null ? null : usedClassHour.trim();
    }
}