package com.dal.dao;

import com.dal.model.EmpDetials;

public interface EmployeeDao {
	
	public void insertEmployee(EmpDetials emp);
	public void showEmployee();
	public void updateEmployee(EmpDetials emp);
	public void deleteEmployee(int eid);

}