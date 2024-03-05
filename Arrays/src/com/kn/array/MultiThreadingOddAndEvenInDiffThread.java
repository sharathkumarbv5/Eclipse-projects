package com.kn.array;

public class MultiThreadingOddAndEvenInDiffThread {
private int max;
private Printer print;
private boolean isEvenNumber;
public MultiThreadingOddAndEvenInDiffThread(int max, Printer print, boolean isEvenNumber) {
	super();
	this.max = max;
	this.print = print;
	this.isEvenNumber = isEvenNumber;
}
public void run() {
	int number=isEvenNumber==true ? 2:1;
	while(number<=max) {
		if(isEvenNumber) {
			
		}
		else {
			print.printOdd(number);
		}
		number +=2;
	}
}

 


	}



