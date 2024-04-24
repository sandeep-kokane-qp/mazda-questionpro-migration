package com.boot.questionpro.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.List;

@Entity
@Table(name = "qp_question")
@Getter
@Setter
@NoArgsConstructor
public class Question {

    @Id
    private Integer id;
    private Integer surveyId;
    private String qText;
    private String code;

    @OneToMany(mappedBy = "q_id", fetch = FetchType.EAGER)
    private List<Answer> answersList = new LinkedList<>();

}
