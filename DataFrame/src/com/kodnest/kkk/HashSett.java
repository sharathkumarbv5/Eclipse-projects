package com.kodnest.kkk;

import java.util.HashSet;
import java.util.TreeSet;

public class HashSett {

	public static void main(String[] args) {
		HashSet ts=new HashSet();
		ts.add(10);
		ts.add(1);
		ts.add(20);
		ts.add("sharu");
		ts.add('a');
		ts.add(null);
		System.out.println(ts);
//		for(int i=0; i<ts.size();i++) {
//			System.out.print(ts.get(i)+" ");
//		}
//		for(Object i:ts) {
//						System.out.print(i+" ");
//					}	
//	Iterator it=ts.iterator();
//		while(it.hasNext()) {
//			System.out.print(it.next()+" ");
//		}

	}

}
