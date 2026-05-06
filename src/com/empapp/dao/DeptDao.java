package com.empapp.dao;

import java.util.List;

import com.empapp.dto.Dept;

public interface DeptDao {
	void addDept(Dept t);
	
	Dept findById(int i);
	
	List<Dept> findAll();
	
	void updateDept(Dept d);
	
	void deleteDept(Integer dno);

}

