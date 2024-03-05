package com.kodnest.bean;

import java.util.*;

public class Employee {
	ArrayList<String> technologies;
	HashSet<String> project;
	HashMap<Integer,String> organisation;
	public Employee() {
		super();
	}
	public Employee(ArrayList<String> technologies, HashSet<String> project, HashMap<Integer, String> organisation) {
		super();
		this.technologies = technologies;
		this.project = project;
		this.organisation = organisation;
	}
	public ArrayList<String> getTechnologies() {
		return technologies;
	}
	public void setTechnologies(ArrayList<String> technologies) {
		this.technologies = technologies;
	}
	public HashSet<String> getProject() {
		return project;
	}
	public void setProject(HashSet<String> project) {
		this.project = project;
	}
	public HashMap<Integer, String> getOrganisation() {
		return organisation;
	}
	public void setOrganisation(HashMap<Integer, String> organisation) {
		this.organisation = organisation;
	}
	@Override
	public String toString() {
		return "Employee [technologies=" + technologies + ", project=" + project + ", organisation=" + organisation
				+ "]";
	}




}
