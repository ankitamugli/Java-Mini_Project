package com.empapp.dao.impl;

import java.sql.Connection;
import java.util.List;

import com.empapp.dao.DeptDao;
import com.empapp.dto.Dept;
import com.empapp.utility.Connector;

public class DeptDaoimpl implements DeptDao {
	private Connection con;

	public DeptDaoimpl() {
		this.con = Connector.requestConnection();
	}

	@Override
	public void addDept(Dept t) {
		// TODO Auto-generated method stub

	}

	public Dept findById(Dept d) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Dept> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateDept(Dept d) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteDept(Integer dno) {
		// TODO Auto-generated method stub

	}

	@Override
	public Dept findById(int i) {
		// TODO Auto-generated method stub
		return null;
	}

}
