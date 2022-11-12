package com.example.ddg_vip.class_DDG;

import org.w3c.dom.Text;

public class Course {
    private Integer courseId;
    private String courseName;
    private String discription;
    private Integer price;
    private Integer originalPrice;
    private Text imgCourse;
    private String totalTime;
    private Integer rating;
    private Integer totalStudent;
    private Integer topicId;
    private Integer discountId;

    public Course() {
    }

    public Course(Integer courseId, String courseName,
                  String discription, Integer price, Integer originalPrice,
                  Text imgCourse, String totalTime, Integer rating,
                  Integer totalStudent, Integer topicId, Integer discountId) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.discription = discription;
        this.price = price;
        this.originalPrice = originalPrice;
        this.imgCourse = imgCourse;
        this.totalTime = totalTime;
        this.rating = rating;
        this.totalStudent = totalStudent;
        this.topicId = topicId;
        this.discountId = discountId;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(Integer originalPrice) {
        this.originalPrice = originalPrice;
    }

    public Text getImgCourse() {
        return imgCourse;
    }

    public void setImgCourse(Text imgCourse) {
        this.imgCourse = imgCourse;
    }

    public String getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(String totalTime) {
        this.totalTime = totalTime;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public Integer getTotalStudent() {
        return totalStudent;
    }

    public void setTotalStudent(Integer totalStudent) {
        this.totalStudent = totalStudent;
    }

    public Integer getTopicId() {
        return topicId;
    }

    public void setTopicId(Integer topicId) {
        this.topicId = topicId;
    }

    public Integer getDiscountId() {
        return discountId;
    }

    public void setDiscountId(Integer discountId) {
        this.discountId = discountId;
    }
}/*CREATE TABLE `course` (
        `courseId` int(11) NOT NULL,
        `courseName` varchar(50) NOT NULL,
        `discription` varchar(1000) NOT NULL,
        `price` int(11) NOT NULL DEFAULT 0,
        `originalPrice` int(11) NOT NULL,
        `imgCourse` text NOT NULL,
        `totalTime` varchar(100) NOT NULL,
        `rating` int(11) NOT NULL,
        `totalStudent` int(11) NOT NULL,
        `topicId` int(11) NOT NULL,
        `discountId` int(11) NOT NULL*/