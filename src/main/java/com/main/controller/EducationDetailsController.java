package com.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.main.binding.EducationBinding;
import com.main.service.DcService;

@RestController
@CrossOrigin(origins = "http://localhost:5173/")
public class EducationDetailsController
{
	@Autowired
	public DcService deService;
	
	@PostMapping("/saveEducation")
	public ResponseEntity<Long> saveEducation(@RequestBody EducationBinding eduBinding){
		Long caseNum = deService.saveEducation(eduBinding);
		return new ResponseEntity<> (caseNum, HttpStatus.CREATED);
		
	}

}
