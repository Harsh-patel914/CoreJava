package com.javapractice;

public class DemoVehicle {

	public static void main(String[] args) {
		Vehicle v = new Vehicle();
		v.setCompany("Tata");
		v.setColor("Gray");
		v.setFueltype("Petrol");
		
//		System.out.println(v.getCompany());
//		System.out.println(v.getColor());
//		System.out.println(v.getFueltype());
		System.out.println(v);
	}
}
