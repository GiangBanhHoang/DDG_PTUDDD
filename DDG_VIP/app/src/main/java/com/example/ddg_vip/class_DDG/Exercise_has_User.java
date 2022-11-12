package com.example.ddg_vip.class_DDG;

import org.w3c.dom.Text;

import java.util.Date;

public class Exercise_has_User {
    private Integer exerciseId;
    private Integer userId;
    private Text content;
    private String status;
    private Date submit;
    private Float scores;

    public Exercise_has_User() {
    }

    public Exercise_has_User(Integer exerciseId, Integer userId, Text content, String status, Date submit, Float scores) {
        this.exerciseId = exerciseId;
        this.userId = userId;
        this.content = content;
        this.status = status;
        this.submit = submit;
        this.scores = scores;
    }

    public Integer getExerciseId() {
        return exerciseId;
    }

    public void setExerciseId(Integer exerciseId) {
        this.exerciseId = exerciseId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Text getContent() {
        return content;
    }

    public void setContent(Text content) {
        this.content = content;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getSubmit() {
        return submit;
    }

    public void setSubmit(Date submit) {
        this.submit = submit;
    }

    public Float getScores() {
        return scores;
    }

    public void setScores(Float scores) {
        this.scores = scores;
    }
}
/*  CREATE TABLE `exerciseinuser` (
        `exerciseId` int(11) NOT NULL,
        `userId` varchar(767) NOT NULL,
        `content` text NOT NULL,
        `status` varchar(100) NOT NULL DEFAULT 'Chưa chấm điểm',
        `submit` datetime NOT NULL,
        `scores` float NOT NULL*/