package com.kodnest.bean;

import java.util.*;

public class Employee {
	//	ArrayList<String> technologies;
	//HashSet<String> Project;
	HashMap<Integer,String> organisation;

	public Employee() {
		super();
	}

	public Employee(HashMap<Integer, String> organisation) {
		super();
		this.organisation = organisation;
	}

	public HashMap<Integer, String> getOrganisation() {
		return organisation;
	}

	public void setOrganisation(HashMap<Integer, String> organisation) {
		this.organisation = organisation;
	}

	@Override
	public String toString() {
		return "Employee [organisation=" + organisation + "]";
	}

	









}
