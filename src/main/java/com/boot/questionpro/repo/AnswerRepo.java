package com.boot.questionpro.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boot.questionpro.entity.Answer;

public interface AnswerRepo extends JpaRepository<Answer, Long>{

}
