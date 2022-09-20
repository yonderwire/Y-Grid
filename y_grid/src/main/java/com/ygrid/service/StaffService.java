package com.ygrid.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ygrid.io.Logging;
import com.ygrid.model.Staff;
import com.ygrid.repo.StaffRepo;

@Service
public class StaffService {

	@Autowired
	private StaffRepo staffRepo;
	
	@Autowired
	public StaffService(StaffRepo staffRepo) {
		this.staffRepo = staffRepo;
	}
		
	public List<Staff> findAllStaff(){
		Logging.LogIt("info", "Service: "+ staffRepo.findAll() + " ");
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
