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
@Table(name = "qp_text_result")
@Getter
@Setter
@NoArgsConstructor
public class TextResult {

    @Id
    private Integer id;
    @Column(name = "resp_id")
    private Integer respId;
    @Column(name = "response_set_id")
    private Integer responseSetId;
    @Column(name = "a_id")
    private Integer aId;
    @Column(name = "a_val")
    private String aVal;
    @Column(name = "q_id")
    private Integer qId;
    @Column(name = "survey_id")
    private Integer surveyId;
    @Column(name = "classification_id")
    private Integer classificationId;
    @Column(name = "source_answer_id")
    private Integer sourceAnswerId;
    private Timestamp t;
    @Column(name = "sentiment_score")
    private Integer sentimentScore;
    @Column(name = "api_sentiment_score")
    private Float apiSentimentScore;
    @Column(name = "api_sentiment_uuid")
    private Integer apiSentimentUUID;
    @Column(name = "api_sentiment_status")
    private Integer apiSentimentStatus;

}
