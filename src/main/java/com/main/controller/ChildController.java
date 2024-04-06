package com.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.main.binding.ChildRequestBinding;
import com.main.binding.Summary;
import com.main.service.DcService;

@RestController
public class ChildController 
{

	@Autowired
	private DcService dcService;
	
	@PostMapping("/saveChildren")
	public ResponseEntity<Summary> saveChildren(@RequestBody ChildRequestBinding request){
		Long caseNum = dcService.saveChildrenData(request);
		Summary summary = dcService.getSummary(caseNum);
		return new ResponseEntity<> (summary, HttpStatus.CREATED);
	}

}
