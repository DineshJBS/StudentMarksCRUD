package com.school.SchoolManagement.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="mark")
public class Mark {

    @Id
    @GeneratedValue
    private int id;
    private String subject;
    private int mark;

    public Mark(int id, String subject, int mark) {
        this.id = id;
        this.subject = subject;
        this.mark = mark;
    }
    public Mark(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }
}
