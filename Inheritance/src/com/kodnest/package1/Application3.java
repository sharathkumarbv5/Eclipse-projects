package com.kodnest.package1;

public class Application3 {
	public static void main(String[] args) {
		
	
	TrainerBot1 Train = new TrainerBot1();
	Train.read();
	Train.write();
	Train.teach();
	StudentBot1 student=new StudentBot1();
	
	student.read();
	student.write();
	student.apply();
}
}
