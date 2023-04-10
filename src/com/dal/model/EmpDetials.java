package com.dal.model;

import java.io.Serializable;
import java.util.Comparator;

//POJO -= Plain Old Java Object
public class EmpDetials implements Serializable,Comparable<EmpDetials>{

	private int eid;
	private String ename;

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + "]";
	}

	@Override
	public int compareTo(EmpDetials e) {
		
		return this.eid - e.eid;
	
	}
	
	public static Comparator<EmpDetials> NameComparator = new Comparator<EmpDetials>() {

		@Override
		public int compare(EmpDetials e1, EmpDetials e2) {
			//return e1.getEid() -e2.getEid();
			return e1.getEname().compareTo(e2.getEname());
		}
	
	
	};

}

















