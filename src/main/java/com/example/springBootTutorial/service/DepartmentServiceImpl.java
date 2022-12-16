package com.example.springBootTutorial.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springBootTutorial.entity.Department;
import com.example.springBootTutorial.repository.DepartmentRepository;

@Service
public class DepartmentServiceImpl  implements DepartmentService{
	
	@Autowired
	private DepartmentRepository departmentRepository;

	@Override
	public Department saveDepartment(Department department) {
		// TODO Auto-generated method stub
		return departmentRepository.save(department);
	}

	@Override
	public List<Department> getDepartment() {
		// TODO Auto-generated method stub
		return departmentRepository.findAll();
	}

	@Override
	public Department getDeptById(Long DepartmentId) {
		// TODO Auto-generated method stub
		return departmentRepository.findById(DepartmentId).get();
	}

	@Override
	public void deleteDepartment(Long departmentId) {
		// TODO Auto-generated method stub
		 departmentRepository.deleteById(departmentId);
	}

	@Override
	public Department updateDepartment(Long departmentId, Department department) {
		// TODO Auto-generated method stub
		Department dept=departmentRepository.findById(departmentId).get();
		dept.setDepartmentName(department.getDepartmentName());
		dept.setDepartmentAddress(department.getDepartmentAddress());
		dept.setDepartmentCode(department.getDepartmentCode());
		return departmentRepository.save(dept);
	}

	@Override
	public Department fetchingDataByName(String departmentName) {
		
		return departmentRepository.findByDepartmentName(departmentName);
	}



}
