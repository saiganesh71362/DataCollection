package com.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.main.binding.PlanSelectionBinding;
import com.main.service.DcService;

@RestController
@CrossOrigin(origins = "http://localhost:5173/")
public class PlanSelectionController
{
	@Autowired
	private DcService dcService;
	
	@PostMapping("/planSelection")
	public ResponseEntity<Long> selectPlan(@RequestBody PlanSelectionBinding planSelectionBinding){
		Long caseNum = dcService.savePlanSelection(planSelectionBinding);
		return new ResponseEntity<> (caseNum, HttpStatus.CREATED);
		
	}


}
