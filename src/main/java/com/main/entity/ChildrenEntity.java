package com.main.entity;

import java.time.LocalDate;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class ChildrenEntity
{
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer childId;
	
	private String childName;
	
	private Integer childAge;
	
	private Long ssn;
	
	private Long caseNum;
	
	// Audit Columns
	
	@CreationTimestamp
	@Column(updatable = false)
	private LocalDate CreatedDate;
	@UpdateTimestamp
	@Column(insertable = false)
	private LocalDate UpdatedDate;
	private String CreatedBy;
	private String UpdatedBy;
	

}
