package com.id.cap.skillgrid.dto;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Calendar;

@Table(name = "user_answers")
@Data
@Entity
public class Answer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "answer_id",unique=true, nullable = false)
    private Long answerId;
    @Column(name="matricule")
    private String matricule;
    @Column(name="domain")
    private String domain;
    @Column(name="skill")
    private String skill;
    @Column(name="grade")
    private int grade;
    @Column(name="answer_datetime")
    private String answerDateTime;
    @Column(name="suggested")
    private int suggested;

    public Answer(String matricule, String domain, String skill, int grade, int suggested) {
        this.matricule = matricule;
        this.domain = domain;
        this.skill = skill;
        this.grade = grade;
        this.answerDateTime=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(Calendar.getInstance().getTime());
        this.suggested = suggested;
    }
}
