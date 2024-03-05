package com.kodnest.abtract; 
abstract class vehicle{
	public void start() {
		System.out.println("vehicle has started");
	}
	public void stop() {
		System.out.println("vechile has stopped");
	}
	public abstract void refuel();
}
class ElectricCar extends vehicle{
	
	public void refuel() {
		System.out.println("charging with petrol");
		
		
	}
	
	
}


