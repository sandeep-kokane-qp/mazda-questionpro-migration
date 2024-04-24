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
@Table(name = "tblInterviewResult")
@Getter
@Setter
@NoArgsConstructor
public class TblInterviewResult {

    @Id
    @Column(name = "ResultID")
    private Integer resultId;
    @Column(name = "InterviewID")
    private Integer interviewId;
    @Column(name = "TempSpecificQueID")
    private Integer tempSpecificQueId;
    @Column(name = "AnswerID")
    private Integer answerId;
    @Column(name = "CommentID")
    private Integer commentId;
    @Column(name = "CreatedDTim")
    private LocalDateTime createdDTim;

}
