package com.learn.vishwa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.learn.vishwa.entity.Address;
import com.learn.vishwa.entity.EmpEntity;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long>{

}
