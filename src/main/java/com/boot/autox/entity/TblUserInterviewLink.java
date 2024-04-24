package com.boot.autox.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "tblUserInterviewLink")
@Getter
@Setter
@NoArgsConstructor
public class TblUserInterviewLink {

    @Id
    @Column(name = "InterviewID")
    private Integer interviewId;
    @Column(name = "SurvTempID")
    private Integer survTempId;
    @Column(name = "SurveyTemplateDetailID")
    private Integer surveyTemplateDetailsId;
    @Column(name = "SentDTim")
    private LocalDateTime sentDTim;
    @Column(name = "FirstResponseDTim")
    private LocalDateTime firstResponseDTim;
    @Column(name = "SubmitDTim")
    private LocalDateTime submitDTim;
    @Column(name = "StatusID")
    private Integer statusId;
    @Column(name = "RankName")
    private String rankName;
    @Column(name = "CreationDT")
    private LocalDateTime creationDT;
    @Column(name = "IsTestInterview")
    private Integer isTestInterview;
    @Column(name = "ModifyDate")
    private LocalDateTime modifyDate;

}
