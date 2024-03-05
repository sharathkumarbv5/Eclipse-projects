package com.kn.demostrings;

public class DS12 {          //comparetoIgnoreCase()           

	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = "Hello";
		System.out.println(s1.compareTo(s2));
		
	}

}



/*  equalsIgnoreCase()

String str1 = "Hello World";
String str2 = "hello world";
String str3 = "Hello World";
System.out.println(str1.equalsIgnoreCase(str2)); //true
System.out.println(str1.equalsIgnoreCase(str3)); //true
*/



/* split()
 
String str = "4552772889929862754";
String[]split = str.split("2");
for(int i = 0; i < split.length; i++) {
	System.out.println(split[i]);
}
*/


/* trim()
 
 
String str = "  Hello  ";
System.out.println(str);
String trim = str.trim();
System.out.println(trim);

*/

/* compareTo()

//case 1

		String s1 = "Hello";
		String s2 = "Hello";
		System.out.println(s1.compareTo(s2));
		
		//case 2
		
		String s3 = "Apple";
		String s4 = "Banana";
		System.out.println(s3.compareTo(s4));
		
		//case 3
		
		String s5 = "Orange";
		String s6 = "Apple";
		System.out.println(s5.compareTo(s6));
		*/