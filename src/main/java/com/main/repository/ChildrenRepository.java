package com.main.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.main.entity.ChildrenEntity;

public interface ChildrenRepository  extends JpaRepository<ChildrenEntity, Serializable>
{
 
	 public   List<ChildrenEntity> findByCaseNum(Long caseNum);
	
}
