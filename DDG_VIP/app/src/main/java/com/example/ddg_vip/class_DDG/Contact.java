package com.example.ddg_vip.class_DDG;

import org.w3c.dom.Text;

import java.sql.Time;

public class Contact {
    private Integer contactId;
    private Integer AppUserId;
    private String HoTen;
    private Text email;
    private String SDT;
    private String title;
    private Text content;
    private Time time;

    public Contact() {
    }

    public Contact(Integer contactId, Integer appUserId,
                   String hoTen, Text email, String SDT,
                   String title, Text content, Time time) {
        this.contactId = contactId;
        AppUserId = appUserId;
        HoTen = hoTen;
        this.email = email;
        this.SDT = SDT;
        this.title = title;
        this.content = content;
        this.time = time;
    }

    public Integer getContactId() {
        return contactId;
    }

    public void setContactId(Integer contactId) {
        this.contactId = contactId;
    }

    public Integer getAppUserId() {
        return AppUserId;
    }

    public void setAppUserId(Integer appUserId) {
        AppUserId = appUserId;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String hoTen) {
        HoTen = hoTen;
    }

    public Text getEmail() {
        return email;
    }

    public void setEmail(Text email) {
        this.email = email;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Text getContent() {
        return content;
    }

    public void setContent(Text content) {
        this.content = content;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }
}/* CREATE TABLE `contact` (
        `contactId` int(11) NOT NULL,
        `AppUserId` varchar(767) DEFAULT NULL,
        `HoTen` varchar(100) DEFAULT NULL,
        `email` text NOT NULL,
        `SDT` varchar(11) NOT NULL,
        `title` varchar(500) NOT NULL,
        `content` text NOT NULL,
        `time` datetime NOT NULL DEFAULT '0001-01-01 00:00:00'*/
