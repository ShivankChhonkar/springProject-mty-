package com.example.springBootTutorial.service;

import java.util.List;

import com.example.springBootTutorial.entity.Department;

public interface DepartmentService {

	 public Department saveDepartment(Department department);
	 public List<Department> getDepartment();
	public Department getDeptById(Long DepartmentId);
	public void deleteDepartment(Long departmentId);
	public Department updateDepartment(Long departmentId, Department department);
	public Department fetchingDataByName(String departmentName);

}
