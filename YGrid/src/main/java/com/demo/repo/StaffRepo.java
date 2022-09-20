package com.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.demo.model.Staff;

@Repository
public interface StaffRepo extends 	JpaRepository<Staff, Integer>{

	
}


