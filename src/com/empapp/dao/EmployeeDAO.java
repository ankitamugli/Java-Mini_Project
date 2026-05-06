package com.empapp.dao;

import java.util.List;

import com.empapp.dto.Employee;

public interface EmployeeDAO {
  void addEmployee(Employee e);
  
  Employee findBYId(Integer id);
  
  List<Employee> findAll();
  
  Employee findByMailPassward(String mail,String passward);
  
  void updateEmployee(Employee e);
  
  void deleteEmployee(Integer id);
	
}
