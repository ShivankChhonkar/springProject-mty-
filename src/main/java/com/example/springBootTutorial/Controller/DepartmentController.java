package com.example.springBootTutorial.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.springBootTutorial.entity.Department;
import com.example.springBootTutorial.service.DepartmentService;

@RestController
public class DepartmentController {
	
	@Autowired
	private DepartmentService departmentService;
	
	@PostMapping("/departments/")
	public Department saveDepartment(@RequestBody Department department) {
		return departmentService.saveDepartment(department);
	}
		
		
    @GetMapping("/departments/")
	public List<Department> getAllDepartment(){
		return departmentService.getDepartment();
    }
		
    @GetMapping("/departments/{department_id}")
    public Department getDeptById(@PathVariable("department_id") Long departmentId) {
    	return departmentService.getDeptById(departmentId);
    }
	 	
    
    @DeleteMapping("/departments/{department_id}")
    public void deleteDepartment(@PathVariable("department_id") Long departmentId) {
    	 departmentService.deleteDepartment(departmentId);
    	 
    }
    
    @PutMapping("/departments/{department_id}")
    public Department updateDepartment(@PathVariable("department_id") Long departmentId,  @RequestBody Department department) {
    	return departmentService.updateDepartment(departmentId,department);
    }
    
    @GetMapping("/departments/name/")
    public Department fetingDataByName(@RequestParam("departmentName") String departmentName) {
    	return departmentService.fetchingDataByName(departmentName);
    }
	
		
		
	}


