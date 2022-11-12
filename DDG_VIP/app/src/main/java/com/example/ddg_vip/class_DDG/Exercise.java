package com.example.ddg_vip.class_DDG;

import java.util.Date;

public class Exercise {
    private Integer exerciseId;
    private String exerciseName;
    private String content;
    private String input;
    private String output;
    private Date deadline;
    private Integer lessonId;
    private Integer userId;

    public Exercise() {
    }

    public Exercise(Integer exerciseId, String exerciseName,
                    String content, String input, String output,
                    Date deadline, Integer lessonId, Integer userId) {
        this.exerciseId = exerciseId;
        this.exerciseName = exerciseName;
        this.content = content;
        this.input = input;
        this.output = output;
        this.deadline = deadline;
        this.lessonId = lessonId;
        this.userId = userId;
    }

    public Integer getExerciseId() {
        return exerciseId;
    }

    public void setExerciseId(Integer exerciseId) {
        this.exerciseId = exerciseId;
    }

    public String getExerciseName() {
        return exerciseName;
    }

    public void setExerciseName(String exerciseName) {
        this.exerciseName = exerciseName;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public String getOutput() {
        return output;
    }

    public void setOutput(String output) {
        this.output = output;
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    public Integer getLessonId() {
        return lessonId;
    }

    public void setLessonId(Integer lessonId) {
        this.lessonId = lessonId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}
/*CREATE TABLE `exercise` (
        `exerciseId` int(11) NOT NULL,
        `exerciseName` varchar(500) NOT NULL,
        `content` varchar(1000) NOT NULL,
        `input` varchar(500) NOT NULL,
        `output` varchar(500) NOT NULL,
        `deadline` date NOT NULL,
        `lessonId` int(11) NOT NULL,
        `userId` varchar(767) NOT NULL*/
