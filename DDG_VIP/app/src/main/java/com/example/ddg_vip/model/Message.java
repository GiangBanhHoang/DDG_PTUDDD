package com.example.ddg_vip.model;

import java.util.Date;

public class Message {
    private Integer Id;
    private String Content;
    private Date Timestamp;
    private Integer ToRoomId;
    private Integer AppUserId;

    public Message() {
    }

    public Message(Integer id, String content, Date timestamp, Integer toRoomId, Integer appUserId) {
        Id = id;
        Content = content;
        Timestamp = timestamp;
        ToRoomId = toRoomId;
        AppUserId = appUserId;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }

    public Date getTimestamp() {
        return Timestamp;
    }

    public void setTimestamp(Date timestamp) {
        Timestamp = timestamp;
    }

    public Integer getToRoomId() {
        return ToRoomId;
    }

    public void setToRoomId(Integer toRoomId) {
        ToRoomId = toRoomId;
    }

    public Integer getAppUserId() {
        return AppUserId;
    }

    public void setAppUserId(Integer appUserId) {
        AppUserId = appUserId;
    }
}/*CREATE TABLE `messages` (
        `Id` int(11) NOT NULL,
        `Content` varchar(500) NOT NULL,
        `Timestamp` datetime NOT NULL,
        `ToRoomId` int(11) NOT NULL,
        `AppUserId` varchar(767) NOT NULL*/
