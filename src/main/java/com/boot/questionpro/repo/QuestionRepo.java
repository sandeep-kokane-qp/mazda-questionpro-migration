package com.boot.questionpro.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boot.questionpro.entity.Question;

public interface QuestionRepo extends JpaRepository<Question, Long>{

}
