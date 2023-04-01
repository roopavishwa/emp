package com.learn.vishwa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.learn.vishwa.constants.AppConstants;
import com.learn.vishwa.dto.ResponseDto;
import com.learn.vishwa.entity.EmpEntity;
import com.learn.vishwa.service.EmpService;

@RestController
@RequestMapping(value = AppConstants.EMPLOYEE_CONTROLLER)
public class EmpController {

	@Autowired
	private EmpService employeeService;
	
	@PostMapping(value = AppConstants.SAVE_EMPLOYEE)
	public ResponseDto save(@RequestBody EmpEntity employee)	{
		ResponseDto saveEmployee = employeeService.saveEmployee(employee);
		return saveEmployee;
	}
	
	@PostMapping(value = AppConstants.UPDATE_EMPLOYEE)
	public ResponseDto update(@RequestBody EmpEntity employee)	{
		ResponseDto saveEmployee = employeeService.saveEmployee(employee);
		return saveEmployee;
	}
	
	@GetMapping(value = AppConstants.GET_EMPLOYEE)
	public @ResponseBody Object getEmployee(){
		return employeeService.getEmployee();
	}
	
	@GetMapping(value = AppConstants.GET_EMPLOYEE_BY_ID)
	public Object getEmployeeById(@PathVariable("id") Long id) {
		return employeeService.getById(id);
	}
	
	@GetMapping(value = AppConstants.DELETE_EMPLOYEE_BY_ID)
	public ResponseDto delete(@PathVariable("id") Long id) {
		return employeeService.deleteById(id);
	}
}
