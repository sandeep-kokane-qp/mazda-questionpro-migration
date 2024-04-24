package com.boot.autox.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tblComment")
@Getter
@Setter
@NoArgsConstructor
public class TblComment {

    @Id
    @Column(name = "CommentID")
    private Integer commentId;
    @Column(name = "Comment", length = 2000)
    private String comment;
}
