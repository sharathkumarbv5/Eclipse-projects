package com.kodnest.entity;
import java.util.ArrayList;
//import java.util.List;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
//import javax.persistence.ManyToOne;
//import javax.persistence.OneToMany;
//import javax.persistence.OneToOne;

@Entity
public class Product {
	@Id
	int Pid;
	String Pname;
	@ManyToMany
	List<Product> product;
	public Product() {
		super();
	}
	public Product(int pid, String pname, List<Product> product) {
		super();
		Pid = pid;
		Pname = pname;
		this.product = product;
	}
	public int getPid() {
		return Pid;
	}
	public void setPid(int pid) {
		Pid = pid;
	}
	public String getPname() {
		return Pname;
	}
	public void setPname(String pname) {
		Pname = pname;
	}
	public List<Product> getProduct() {
		return product;
	}
	public void setProduct(List<Product> product) {
		this.product = product;
	}
	

//	public Product() {
//		super();
//	}
//	public Product(int pid, String pname, ArrayList<Customer> customer) {
//		super();
//		Pid = pid;
//		Pname = pname;
//		this.customer = customer;
//	}
//	public int getPid() {
//		return Pid;
//	}
//	public void setPid(int pid) {
//		Pid = pid;
//	}
//	public String getPname() {
//		return Pname;
//	}
//	public void setPname(String pname) {
//		Pname = pname;
//	}
//	public ArrayList<Customer> getCustomer() {
//		return customer;
//	}
//	public void setCustomer(ArrayList<Customer> customer) {
//		this.customer = customer;
//	}
//	
//	public Product() {
//		super();
//	}
//	public Product(int pid, String pname, List<Product> product) {
//		super();
//		Pid = pid;
//		Pname = pname;
//		this.product = product;
//	}
//	public int getPid() {
//		return Pid;
//	}
//	public void setPid(int pid) {
//		Pid = pid;
//	}
//	public String getPname() {
//		return Pname;
//	}
//	public void setPname(String pname) {
//		Pname = pname;
//	}
//	public List<Product> getProduct() {
//		return product;
//	}
//	public void setProduct(List<Product> product) {
//		this.product = product;
//	}
//
//	
//	public Product() {
//		super();
//	}
//	public Product(int pid, String pname, Customer customer) {
//		super();
//		Pid = pid;
//		Pname = pname;
//		this.customer = customer;
//	}
//	public int getPid() {
//		return Pid;
//	}
//	public void setPid(int pid) {
//		Pid = pid;
//	}
//	public String getPname() {
//		return Pname;
//	}
//	public void setPname(String pname) {
//		Pname = pname;
//	}
//	public Customer getCustomer() {
//		return customer;
//	}
//	public void setCustomer(Customer customer) {
//		this.customer = customer;
//	}
//	
//	
//	
////	public Product() {
////		super();
////	}
////	public Product(int pid, String pname) {
////		super();
////		this.Pid = pid;
////		Pname = pname;
////	}
////	public int getPid() {
////		return Pid;
////	}
////	public void setPid(int pid) {
////		this.Pid = pid;
////	}
////	public String getPname() {
////		return Pname;
////	}
////	public void setPname(String pname) {
////		Pname = pname;
////	}
//	
//	


}
