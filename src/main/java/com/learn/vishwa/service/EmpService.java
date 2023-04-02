package com.learn.vishwa.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learn.vishwa.constants.ApiMessages;
import com.learn.vishwa.dto.EmpDto;
import com.learn.vishwa.dto.ResponseDto;
import com.learn.vishwa.entity.Address;
import com.learn.vishwa.entity.EmpEntity;
import com.learn.vishwa.entity.Role;
import com.learn.vishwa.repository.AddressRepository;
import com.learn.vishwa.repository.EmpRepository;
import com.learn.vishwa.repository.JobRoleRepository;


@Service
public class EmpService {

	@Autowired
	private EmpRepository employeeRepository;
	
	@Autowired
	private AddressRepository address;
	
	@Autowired
	private JobRoleRepository role;
	
	public ResponseDto saveEmployee(EmpEntity employee) {
		try {
			List<Address> saveAll = address.saveAll(employee.getAddress());
			Role save2 = role.save(employee.getEmpRole());
			EmpEntity save = employeeRepository.save(employee);
//		EmpEntity list = employeeRepository.saveEmp(employee.getId(),employee.getFirstName(),employee.getLastName(),employee.getEmpRole().getId(),employee.getEmpSalary(),employee.getAddress().getId());
		return new ResponseDto(ApiMessages.ERROR_CODE_201,ApiMessages.INSERT_201_MSG);
		}catch(Exception e) {
			return new ResponseDto(ApiMessages.ERROR_CODE_500, ApiMessages.INSERT_500_MSG);
		}
	}

	public ResponseDto updateEmployee(EmpDto employee) {
		
		try {
			EmpEntity update = employeeRepository.updateMyEntity(employee.getId(),employee.getFirstName(),employee.getLastName(),employee.getEmpRole(),employee.getEmpSalary(),employee.getAddress());
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
