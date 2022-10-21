package com.example.ddg_vip.model;

public class Room {
    private Integer Id;
    private String Name;
    private Integer AppUserId;

    public Room() {
    }

    public Room(Integer id, String name, Integer appUserId) {
        Id = id;
        Name = name;
        AppUserId = appUserId;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Integer getAppUserId() {
        return AppUserId;
    }

    public void setAppUserId(Integer appUserId) {
        AppUserId = appUserId;
    }
}/*CREATE TABLE `rooms` (
        `Id` int(11) NOT NULL,
        `Name` varchar(100) NOT NULL,
        `AppUserId` varchar(767) NOT NULL*/
