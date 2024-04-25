package com.main.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.main.entity.CitizenApiEntity;

public interface CitizenApiRepository extends JpaRepository<CitizenApiEntity, Serializable> {

}
