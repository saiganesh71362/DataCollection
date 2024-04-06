package com.main.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.main.entity.IncomeEntity;

public interface IncomeRepository extends JpaRepository<IncomeEntity,Serializable>{

	public IncomeEntity findByCaseNum(Long caseNum);
}
