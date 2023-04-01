package com.learn.vishwa.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learn.vishwa.constants.ApiMessages;
import com.learn.vishwa.dto.EmpDto;
import com.learn.vishwa.dto.ResponseDto;
import com.learn.vishwa.entity.EmpEntity;
import com.learn.vishwa.repository.EmpRepository;


@Service
public class EmpService {

	@Autowired
	private EmpRepository employeeRepository;
	
	public ResponseDto saveEmployee(EmpEntity employee) {
		try {
		EmpEntity list = employeeRepository.save(employee);
		return new ResponseDto(ApiMessages.ERROR_CODE_201,ApiMessages.INSERT_201_MSG);
		}catch(Exception e) {
			return new ResponseDto(ApiMessages.ERROR_CODE_500, ApiMessages.INSERT_500_MSG);
		}
	}

	public ResponseDto updateEmployee(EmpDto employee) {
		
		try {
			EmpEntity update = employeeRepository.updateMyEntity(employee.getId(),employee.getName(),employee.getEmail(),employee.getJobRole(),employee.getContactNumber());
			return new ResponseDto(ApiMessages.ERROR_CODE_201,ApiMessages.INSERT_201_MSG );
		}catch(Exception e) {
			return new ResponseDto(ApiMessages.ERROR_CODE_500, ApiMessages.INSERT_500_MSG);
		}
	}
	public Object getEmployee() {
		try {
		List<EmpEntity> list = employeeRepository.findAll();
		return list;
		}catch (Exception e) {
			return new ResponseDto(ApiMessages.ERROR_CODE_500, ApiMessages.SELECT_500_MSG);
		}
		
	}
	
	public Object getById(Long id) {
		try {
			Optional<EmpEntity> findById = employeeRepository.findById(id);
			EmpEntity employee2 = findById.get();	 
			return employee2;
		}catch(Exception e) {
			return new ResponseDto(ApiMessages.ERROR_CODE_500, ApiMessages.SELECT_500_MSG);
		}
	}

	public ResponseDto deleteById(Long id) {
		try {
			employeeRepository.deleteById(id);
		return new ResponseDto(ApiMessages.ERROR_CODE_201,ApiMessages.INSERT_201_MSG);
		}catch(Exception e) {
			return new ResponseDto(ApiMessages.ERROR_CODE_500, ApiMessages.DELETE_500_MSG);
		}
	}
}
