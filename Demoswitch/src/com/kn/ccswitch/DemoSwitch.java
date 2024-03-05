package com.kn.ccswitch;

import java.util.Scanner;

public class DemoSwitch {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("User! Please enter the Day No ");
		char day_no = scan.next().charAt(0);
		switch(day_no) {
		case 'a':
			System.out.println("Sunday");
			break;
			
		case 'b':
			System.out.println("Monday");
			break;
			
		case 'c':
			System.out.println("Tuesday");
			break;
		
		case 'd':
			System.out.println("Wednesday");
			break;
			
		case 'e':
			System.out.println("Thursday");
			break;
			
		case 'f':
			System.out.println("Friday");
			break;
			
		case 'g':
			System.out.println("Saturday");
			break;
			
		default:
			System.out.println("Invalid Day");
		}
		scan.close();
	}
}
