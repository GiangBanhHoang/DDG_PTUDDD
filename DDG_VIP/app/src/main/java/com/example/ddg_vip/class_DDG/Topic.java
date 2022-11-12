package com.example.ddg_vip.class_DDG;

public class Topic {
    private Integer topicId;
    private String topicName;

    public Topic() {
    }

    public Topic(Integer topicId, String topicName) {
        this.topicId = topicId;
        this.topicName = topicName;
    }

    public Integer getTopicId() {
        return topicId;
    }

    public void setTopicId(Integer topicId) {
        this.topicId = topicId;
    }

    public String getTopicName() {
        return topicName;
    }

    public void setTopicName(String topicName) {
        this.topicName = topicName;
    }
}/* CREATE TABLE `topic` (
        `topicId` int(11) NOT NULL,
        `topicName` varchar(50) NOT NULL*/
