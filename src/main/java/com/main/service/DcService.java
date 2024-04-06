package com.main.service;

import java.util.Map;

import com.main.binding.ChildRequestBinding;
import com.main.binding.EducationBinding;
import com.main.binding.IncomeBinding;
import com.main.binding.PlanSelectionBinding;
import com.main.binding.Summary;

public interface DcService 
{
	public Long loadCaseNum(Integer appId);
	
	public Map<Integer, String> getPlanNames();
	
	public Long savePlanSelection (PlanSelectionBinding planSelectionBinding);
	
	public Long saveIncomeData(IncomeBinding incomeBinding);
	
	public Long saveEducation(EducationBinding endBinding);
	
	public Long saveChildrenData(ChildRequestBinding childRequestBinding);
	
	public Summary getSummary(Long CaseNum);


}
