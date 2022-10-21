package com.example.ddg_vip.model;

public class Comment {
    private Integer CmtId;
    private Integer UserId;
    private Integer CourseId;
    private String Content;
    private Float Evaluate;

    public Comment() {
    }

    public Comment(Integer cmtId, Integer userId, Integer courseId, String content, Float evaluate) {
        CmtId = cmtId;
        UserId = userId;
        CourseId = courseId;
        Content = content;
        Evaluate = evaluate;
    }


    public Integer getCmtId() {
        return CmtId;
    }

    public void setCmtId(Integer cmtId) {
        CmtId = cmtId;
    }

    public Integer getUserId() {
        return UserId;
    }

    public void setUserId(Integer userId) {
        UserId = userId;
    }

    public Integer getCourseId() {
        return CourseId;
    }

    public void setCourseId(Integer courseId) {
        CourseId = courseId;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }

    public Float getEvaluate() {
        return Evaluate;
    }

    public void setEvaluate(Float evaluate) {
        Evaluate = evaluate;
    }
}
/* CREATE TABLE `comment` (
        `cmtId` int(11) NOT NULL,
        `userId` varchar(767) NOT NULL,
        `courseId` int(11) NOT NULL,
        `content` varchar(1000) NOT NULL,
        `evaluate` float NOT NULL*/