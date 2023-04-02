package com.learn.vishwa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.learn.vishwa.entity.EmpEntity;
import com.learn.vishwa.entity.Role;

@Repository
public interface JobRoleRepository extends JpaRepository<Role, Long>{

}
