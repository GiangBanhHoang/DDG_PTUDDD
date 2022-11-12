package com.example.ddg_vip.class_DDG;

import org.w3c.dom.Text;

public class Lesson {
      private Integer lessonId;
      private String title;
      private Text description;
      private String content;
      private Text link;
      private String captionLink;
      private Integer courseId;

    public Lesson() {
    }

    public Lesson(Integer lessonId, String title,
                  Text description, String content, Text link,
                  String captionLink, Integer courseId) {
        this.lessonId = lessonId;
        this.title = title;
        this.description = description;
        this.content = content;
        this.link = link;
        this.captionLink = captionLink;
        this.courseId = courseId;
    }

    public Integer getLessonId() {
        return lessonId;
    }

    public void setLessonId(Integer lessonId) {
        this.lessonId = lessonId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Text getDescription() {
        return description;
    }

    public void setDescription(Text description) {
        this.description = description;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Text getLink() {
        return link;
    }

    public void setLink(Text link) {
        this.link = link;
    }

    public String getCaptionLink() {
        return captionLink;
    }

    public void setCaptionLink(String captionLink) {
        this.captionLink = captionLink;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }
}/*CREATE TABLE `lesson` (
        `lessonId` int(11) NOT NULL,
        `title` varchar(200) NOT NULL,
        `description` text NOT NULL,
        `content` varchar(1000) NOT NULL,
        `link` text NOT NULL,
        `captionLink` varchar(500) NOT NULL,
        `courseId` int(11) NOT NULL*/
