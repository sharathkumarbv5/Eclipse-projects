package com.kodnest.kkk;
import java.util.*;
import java.util.LinkedList;

import java.util.concurrent.CopyOnWriteArrayList;

public class failFastAndFailSafe {
	public static void main(String[] args) {
		CopyOnWriteArrayList ts=new CopyOnWriteArrayList();
		ts.add(10);
		ts.add(20);
		ts.add(30);
		ts.add(40);
		ts.add(50);	
		ts.add(60);	
//		for(int i=0;i<ts.size();i++) {
//		System.out.print(ts.get(i)+" ");
//		ts.add(45);


//		int i=0;
//		while( i<ts.size()) {
//		System.out.println(ts.get(i));
//		i++;
//		ts.add(45);
		
//		for(Object o:ts) {
//			System.out.println(o);
//			ts.add(45);
//		
//	}
		
	Iterator it=ts.iterator();	
	while(it.hasNext()) {
		System.out.println(it.next());
		ts.add(45);
	}
		System.out.println(ts);

}}
