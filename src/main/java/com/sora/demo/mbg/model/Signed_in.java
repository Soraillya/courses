package com.sora.demo.mbg.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

@ApiModel(value="com.sora.demo.mbg.model.Signed_in")
public class Signed_in {
    @ApiModelProperty(value="signedInId")
    private Integer signedInId;

    @ApiModelProperty(value="signInId")
    private Integer signInId;

    @ApiModelProperty(value="studentId")
    private String studentId;

    @ApiModelProperty(value="signedInTime签到时间")
    private Date signedInTime;

    @ApiModelProperty(value="signedInStatus签到状态，0->签到，1->已签到")
    private String signedInStatus;

    public Integer getSignedInId() {
        return signedInId;
    }

    public void setSignedInId(Integer signedInId) {
        this.signedInId = signedInId;
    }

    public Integer getSignInId() {
        return signInId;
    }

    public void setSignInId(Integer signInId) {
        this.signInId = signInId;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId == null ? null : studentId.trim();
    }

    public Date getSignedInTime() {
        return signedInTime;
    }

    public void setSignedInTime(Date signedInTime) {
        this.signedInTime = signedInTime;
    }

    public String getSignedInStatus() {
        return signedInStatus;
    }

    public void setSignedInStatus(String signedInStatus) {
        this.signedInStatus = signedInStatus == null ? null : signedInStatus.trim();
    }
}