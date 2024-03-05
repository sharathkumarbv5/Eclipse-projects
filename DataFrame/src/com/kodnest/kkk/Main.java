package com.kodnest.kkk;
import java.util.LinkedList;

public class Main {
	public static void main(String[] args) {
		LinkedList ts=new LinkedList();
		ts.add(10);
		ts.add(20);
		ts.add(30);
		ts.add(40);
		ts.add(50);	
		ts.add(50);	
		System.out.println(ts.size());
		//using Forloop
		//for(int i=0;i<5;i++) {
		//	System.out.print(ts.get(i)+" ");
		//}
		//using Whileloop
		//int i=0;
		//while(i<5) {
		//System.out.println(ts.get(i)+" ");
		//i++;
		//}
		//using Dowhile
		//		int i=0;
		//		do {
		//			
		//			System.out.print(ts.get(i)+" ");
		//			i++;
		//		}while(i<ts.size());
		//for-each
		//		int a[]= {1,2,3,4};
		//		
		//		for(Object i:ts) {
		//			System.out.print(i+" ");
		//		}
		//Iterator
		//Iterator it=ts.iterator();
		//while(it.hasNext()) {
		//	System.out.print(it.next()+" ");
		//}
		//collection's
//		System.out.println(ts);
//		Collections.sort(ts);	
//		System.out.println(ts);
		
		
	}
}
