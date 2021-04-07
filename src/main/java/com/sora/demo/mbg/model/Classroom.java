package com.sora.demo.mbg.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value="com.sora.demo.mbg.model.Classroom")
public class Classroom {
    @ApiModelProperty(value="classroomId")
    private Integer classroomId;

    @ApiModelProperty(value="classroomName")
    private String classroomName;

    @ApiModelProperty(value="classroomNumberLimit人数限制")
    private Integer classroomNumberLimit;

    public Integer getClassroomId() {
        return classroomId;
    }

    public void setClassroomId(Integer classroomId) {
        this.classroomId = classroomId;
    }

    public String getClassroomName() {
        return classroomName;
    }

    public void setClassroomName(String classroomName) {
        this.classroomName = classroomName == null ? null : classroomName.trim();
    }

    public Integer getClassroomNumberLimit() {
        return classroomNumberLimit;
    }

    public void setClassroomNumberLimit(Integer classroomNumberLimit) {
        this.classroomNumberLimit = classroomNumberLimit;
    }
}