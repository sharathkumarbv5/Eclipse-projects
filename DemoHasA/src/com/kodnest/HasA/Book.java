package com.kodnest.HasA;

public class Book {
	Page page;
public Book(String content) {
	this.page=new Page(content);
}
void readPage() {
	System.out.println("reading the msg");
}
}
