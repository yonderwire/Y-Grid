package com.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.demo.model.Staff;
import com.demo.repo.StaffRepo;

@Service
public class StaffService{
	
	private StaffRepo staffRepo;
		
	public StaffService(StaffRepo staffRepo) {
		this.staffRepo = staffRepo;
	}
		
	public List<Staff> findAllStaff(){
		System.out.println(staffRepo.findAll());
		return staffRepo.findAll();
	}
	public void addStaff(List<Staff> staff) {
		staffRepo.saveAll(staff);
	}
	public void deleteStaffById(int id) {
		if (staffRepo.existsById(id)) {
		    staffRepo.deleteById(id);
		}
	}
	public void updateStaffById(List<Staff> staff) {
			staffRepo.saveAll(staff);
	}
	
}

