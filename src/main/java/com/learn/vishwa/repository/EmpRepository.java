package com.learn.vishwa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.learn.vishwa.dto.EmpDto;
import com.learn.vishwa.dto.ResponseDto;
import com.learn.vishwa.entity.EmpEntity;

@Repository
public interface EmpRepository extends JpaRepository<EmpEntity, Long>{

	@Modifying
	@Query(nativeQuery = true , value = "update employee e set e.name=:name, e.email=:email,e.job_role=:jobRole,e.contact_number=:contactNumber where e.id=:id")
	public EmpEntity updateMyEntity(@Param("id") Long id,@Param("name") String name, @Param("email") String email, @Param("jobRole") String jobRole,@Param("contactNumber") String contactNumber);

}
