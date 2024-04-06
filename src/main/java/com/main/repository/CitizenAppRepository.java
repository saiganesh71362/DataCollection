package com.main.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.main.entity.CitizenAppEntity;

public interface CitizenAppRepository extends JpaRepository<CitizenAppEntity, Serializable> {

}
