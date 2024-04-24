package com.boot.questionpro.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Timestamp;

@Entity
@Table(name = "qp_int_result")
@Getter
@Setter
@NoArgsConstructor
public class IntResult {

    @Id
    private Integer id;
    @Column(name = "resp_id")
    private Integer respId;
    @Column(name = "response_set_id")
    private Integer responseSetId;
    @Column(name = "a_id")
    private Integer aId;
    @Column(name = "a_val")
    private Integer aVal;
    @Column(name = "survey_id")
    private Integer surveyId;
    @Column(name = "q_id")
    private Integer qId;
    @Column(name = "source_answer_id")
    private Integer sourceAnswerId;
    private Timestamp t;

}
