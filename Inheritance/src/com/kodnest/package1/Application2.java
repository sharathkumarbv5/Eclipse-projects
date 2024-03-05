package com.kodnest.package1;

public class Application2 {
	public static void main(String[] args) {
		Bot bot=new Bot();
		TrianerBot trainerbot =new TrianerBot();
		StudentBot studentbot=new StudentBot();
		System.out.println(trainerbot.model);
		trainerbot.teaching();
		System.out.println(trainerbot.price);
		trainerbot.read();
		System.out.println(studentbot.id);
		studentbot.applySkillsSet();
		System.out.println(studentbot.model);
		studentbot.teaching();
		
	}

}
