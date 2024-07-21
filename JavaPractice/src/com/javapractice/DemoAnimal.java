package com.javapractice;

public class DemoAnimal {

	public static void main(String[] args) {
		
		//declaration
		Animal an;
		an = new Animal();
		
		an.setName("Cat");
		an.setType_ani("Wild");
		an.setFood_habit("non-veg");
		
//		System.out.println(an.getName());
//		System.out.println(an.getType_ani());
//		System.out.println(an.getFood_habit());
		System.out.println(an);
	}

}

