package com.ygrid.comtroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.ygrid.io.Logging;
import com.ygrid.model.Staff;
import com.ygrid.service.StaffService;

@RestController
@RequestMapping("/staff")
public class StaffController {
	
	@Autowired
	private StaffService staffService;
	
	public StaffController(StaffService staffService) {
		this.staffService = staffService;
	}
	
	// GET
	@GetMapping("/list")
	public List<Staff> getAllStaff(){
		return staffService.findAllStaff();
	}
	
	// POST
	@PostMapping(value="/add")
	public void addStaff(@RequestBody List<Staff> staff) {
		Staff s = new Staff();
		staffService.addStaff(staff);
	}

	// DELETE
	@DeleteMapping(value="/delete/{id}")
	public void deleteStaffById(@PathVariable("id")Integer id) {
		staffService.deleteStaffById(id);
	}
	
	// PUT
	@PutMapping(value="/update")
	public void updateStaffById(@RequestBody List<Staff> staff) {
		staffService.updateStaffById(staff);
	}

}
