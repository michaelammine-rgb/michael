package com.student.studyexpensetracker.model;
import java.time.LocalDate;
public class StudySession {
 private String Subject;
 private String topic;
 private double hours;
 private LocalDate date;
public StudySession(String subject, String topic,double hours, LocalDate date) {
   this.Subject=subject;
   this.topic= topic;
   this. hours =hours;
   this.date=date;
 }

    public String getSubject() {
        return Subject;
    }

    public String getTopic() {
        return topic;
    }

    public double getHours() {
        return hours;
    }

    public LocalDate getDate() {
        return date;
    }

}
