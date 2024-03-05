package com.kn.array;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FindnumofCharWordsLInesInTExtFile {
	public static void main(String[] args) {
		int charCount=0;
		int wordCount=0;
		int lineCount=0;
		try(
			BufferedReader reader=new 
			BufferedReader(new FileReader("file.text"));
		){
			String currentLine=reader.readLine();
			while(currentLine!=null) {
				lineCount++;
				String[] words=currentLine.length;
				wordCount=charCount+words.length();
				for(String word:words) {
					charCount=charCount+word.length;
					
				}
				currentLine=reader.readLine();
			}
			System.out.println("number of chars in file:"+charCount);
			System.out.println("number of words of in file"+wordCount);
	System.out.println("number of lnes in afile :"+lineCount);}
}
	catch(IOException e) {
	e.printStackTrace();
	}
}
