package com.boot.questionpro.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boot.questionpro.entity.CXTransaction;

public interface CXTransactionRepo extends JpaRepository<CXTransaction, Long>{

}
