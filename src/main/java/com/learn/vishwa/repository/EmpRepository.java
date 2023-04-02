package com.learn.vishwa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.learn.vishwa.dto.EmpDto;
import com.learn.vishwa.dto.ResponseDto;
import com.learn.vishwa.entity.Address;
import com.learn.vishwa.entity.EmpEntity;
import com.learn.vishwa.entity.Role;

@Repository
public interface EmpRepository extends JpaRepository<EmpEntity, Long>{

	
	@Modifying
	@Query(nativeQuery = true , value = "update employee e set e.first_name=:firstName,e.emp_salary=:empSalary, e.last_name=:lastName,e.emp_role=:empRole,e.address=:address where e.id=:id")
	public EmpEntity updateMyEntity(@Param("id") Long id,@Param("firstName") String firstName, @Param("lastName") String lastName, @Param("empRole") Role empRole, @Param("empSalary") String empSalary,@Param("address") Address address);

	
}
