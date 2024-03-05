package com.kodnest.entity;

import java.util.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
//import javax.persistence.OneToMany;
//import javax.persistence.OneToOne;

@Entity
public class Customer {
	@Id
	int cid;
	String cname;
	@ManyToMany
	List<Customer>	customer;
	public Customer() {
		super();
	}
	public Customer(int cid, String cname, List<Customer> customer) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.customer = customer;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public List<Customer> getCustomer() {
		return customer;
	}
	public void setCustomer(List<Customer> customer) {
		this.customer = customer;
	}
	
	
	
//	public Customer() {
//		super();
//	}
//	public Customer(int cid, String cname, ArrayList<Product> product) {
//		super();
//		this.cid = cid;
//		this.cname = cname;
//		this.product = product;
//	}
//	public int getCid() {
//		return cid;
//	}
//	public void setCid(int cid) {
//		this.cid = cid;
//	}
//	public String getCname() {
//		return cname;
//	}
//	public void setCname(String cname) {
//		this.cname = cname;
//	}
//	public ArrayList<Product> getProduct() {
//		return product;
//	}
//	public void setProduct(ArrayList<Product> product) {
//		this.product = product;
//	}
//	
//	public Customer(int i, String string, ArrayList<Product> al) {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//	public Customer(int cid, String cname, Customer customer) {
//		super();
//		this.cid = cid;
//		this.cname = cname;
//		this.customer = customer;
//	}
//	public int getCid() {
//		return cid;
//	}
//	public void setCid(int cid) {
//		this.cid = cid;
//	}
//	public String getCname() {
//		return cname;
//	}
//	public void setCname(String cname) {
//		this.cname = cname;
//	}
//	public Customer getCustomer() {
//		return customer;
//	}
//	public void setCustomer(Customer customer) {
//		this.customer = customer;
//	}
//	
	
//	List<Product> product;
//	public Customer() {
//		super();
//	}
//	public Customer(int cid, String cname, List<Product> product) {
//		super();
//		this.cid = cid;
//		this.cname = cname;
//		this.product = product;
//	}
//	public int getCid() {
//		return cid;
//	}
//	public void setCid(int cid) {
//		this.cid = cid;
//	}
//	public String getCname() {
//		return cname;
//	}
//	public void setCname(String cname) {
//		this.cname = cname;
//	}
//	public List<Product> getProduct() {
//		return product;
//	}
//	public void setProduct(List<Product> product) {
//		this.product = product;
//	}
//	
	
	
//	public Customer() {
//		super();
//	}
//	public Customer(int cid, String cname, Product prodect) {
//		super();
//		this.cid = cid;
//		this.cname = cname;
//		this.prodect = prodect;
//	}
//	public int getCid() {
//		return cid;
//	}
//	public void setCid(int cid) {
//		this.cid = cid;
//	}
//	public String getCname() {
//		return cname;
//	}
//	public void setCname(String cname) {
//		this.cname = cname;
//	}
//	public Product getProdect() {
//		return prodect;
//	}
//	public void setProdect(Product prodect) {
//		this.prodect = prodect;
//	}
	
	
	
}
