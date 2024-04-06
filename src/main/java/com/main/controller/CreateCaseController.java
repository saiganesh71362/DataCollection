package com.main.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.main.binding.CreateCaseResponse;
import com.main.service.DcService;

@RestController
public class CreateCaseController 
{
	@Autowired
	private DcService deService;
	@GetMapping("/case/{appId}")
	public ResponseEntity<Long> createCaseNum(@PathVariable Integer appId){
		Long caseNum = deService.loadCaseNum(appId);
		Map<Integer, String> planMap = deService.getPlanNames();
		
		CreateCaseResponse response = new CreateCaseResponse();
		response.setCaseNum(caseNum);
		response.setPlanNames(planMap);
		return new ResponseEntity<> (caseNum, HttpStatus.CREATED);
	}

}
