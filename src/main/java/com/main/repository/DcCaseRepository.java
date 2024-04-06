package com.main.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.main.entity.DcCaseEntity;

public interface DcCaseRepository  extends JpaRepository<DcCaseEntity, Serializable> {

}
