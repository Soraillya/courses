package com.sora.demo.mbg.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

@ApiModel(value="com.sora.demo.mbg.model.Comment")
public class Comment {
    @ApiModelProperty(value="commentId")
    private Integer commentId;

    @ApiModelProperty(value="studentId")
    private Integer studentId;

    @ApiModelProperty(value="courseId")
    private Integer courseId;

    @ApiModelProperty(value="commentContent评论内容")
    private String commentContent;

    @ApiModelProperty(value="commentStar星级评价，1星-2星-3星-4星-5星")
    private Integer commentStar;

    @ApiModelProperty(value="commentTime评论时间")
    private Date commentTime;

    public Integer getCommentId() {
        return commentId;
    }

    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
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

    public String getCommentContent() {
        return commentContent;
    }

    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent == null ? null : commentContent.trim();
    }

    public Integer getCommentStar() {
        return commentStar;
    }

    public void setCommentStar(Integer commentStar) {
        this.commentStar = commentStar;
    }

    public Date getCommentTime() {
        return commentTime;
    }

    public void setCommentTime(Date commentTime) {
        this.commentTime = commentTime;
    }
}