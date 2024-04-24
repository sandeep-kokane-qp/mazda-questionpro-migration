package com.boot.questionpro.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boot.questionpro.entity.PanelMember;

public interface PanelMemberRepo extends JpaRepository<PanelMember, Long>{

}
