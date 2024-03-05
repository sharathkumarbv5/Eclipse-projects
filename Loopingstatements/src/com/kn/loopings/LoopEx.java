package com.kn.loopings;


public class LoopEx {

	public static void main(String[] args) {
		for(int i = 1; i <= 10; i++)
		{
			if(i==4) {
				return;
			}
			else {
				System.out.println(i);
			}
		}
	}

}
