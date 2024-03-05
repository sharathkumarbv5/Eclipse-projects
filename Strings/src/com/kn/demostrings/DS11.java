package com.kn.demostrings;

public class DS11 {  //contains()

	public static void main(String[] args) {
		String str = "Hello World!";
		System.out.println(str.contains("Hello")); //true
		System.out.println(str.contains(" ")); //true
		System.out.println(str.contains("1234"));//false
		
		}

}



/*toCharArray
 * 
 String str = "World!";
		char[]ch = str.toCharArray();
		for(int i = 0;i < ch.length; i++) {
			System.out.print(ch[i]+" ");     //output  W o r l d !
		} 
		*/

/*startsWith() endsWith()
 * 
 
 String str = "Hello World!";
		System.out.println(str.startsWith("Hello")); //true
		System.out.println(str.endsWith("World")); //false
		
	*/
