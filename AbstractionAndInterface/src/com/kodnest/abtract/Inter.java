package com.kodnest.abtract;

public interface Inter {
	void study();
	void play();
	void sleep();

	class MCAStudent implements Inter{

		@Override
		public void study() {

			System.out.println("studing");


		}

		@Override
		public void play() {


			System.out.println("playing");

		}

		@Override
		public void sleep() {

			System.out.println("sleeping");

		}

	}
	
		
	
}
