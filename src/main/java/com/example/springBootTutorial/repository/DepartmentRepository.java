package com.example.springBootTutorial.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springBootTutorial.entity.Department;

@Repository
public interface DepartmentRepository  extends JpaRepository<Department,Long>{
	public Department findByDepartmentName(String departmentName);

}
