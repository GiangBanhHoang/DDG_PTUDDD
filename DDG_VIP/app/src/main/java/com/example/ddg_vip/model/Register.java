package com.example.ddg_vip.model;

public class Register {
    private Integer registerId;
    private Integer timeReg;
    private String userId;
    private Integer courseId;

    public Register() {
    }

    public Register(Integer registerId, Integer timeReg, String userId, Integer courseId) {
        this.registerId = registerId;
        this.timeReg = timeReg;
        this.userId = userId;
        this.courseId = courseId;
    }

    public Integer getRegisterId() {
        return registerId;
    }

    public void setRegisterId(Integer registerId) {
        this.registerId = registerId;
    }

    public Integer getTimeReg() {
        return timeReg;
    }

    public void setTimeReg(Integer timeReg) {
        this.timeReg = timeReg;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }
}/* CREATE TABLE `register` (
        `registerId` int(11) NOT NULL,
        `timeReg` datetime NOT NULL,
        `userId` varchar(767) NOT NULL,
        `courseId` int(11) NOT NULL*/
