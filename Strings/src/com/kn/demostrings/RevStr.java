package com.kn.demostrings;

public class RevStr
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String s="Hello Java";
		char[] ch =s.toCharArray();
		int right=ch.length-1;
		int left=0;
		while(left<right) {
			
		if(ch[left]!=' '&&ch[right]!=' ') 
		{
			char temp =ch[left];
			ch[left]=ch[right];
			ch[right]=temp;
			left++;
			right--;
			
		}
		else if(ch[left]==' ') 
		{
			left++;
		}
		else if(ch[right]==' ') 
		{
			right--;
		}
	}
	System.out.println(new String(ch));
}
}
