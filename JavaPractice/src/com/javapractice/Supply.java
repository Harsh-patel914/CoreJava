package com.javapractice;
import java.util.Scanner;

public class Supply {
	
	    // Data members
	    private int Code;
	    private String FoodName;
	    private String Sticker;
	    private String FoodType;

	    // Constructor
	    public Supply() {
	        // Initialize variables
	        Code = 0;
	        FoodName = "";
	        Sticker = "";
	        FoodType = "";
	    }

	    // Member function to assign FoodType based on Sticker
	    public void GetType() {
	        switch (Sticker.toLowerCase()) {
	            case "green":
	                FoodType = "Vegetarian";
	                break;
	            case "yellow":
	                FoodType = "Contains Egg";
	                break;
	            case "red":
	                FoodType = "Non Vegetarian";
	                break;
	            default:
	                FoodType = "Unknown";
	                break;
	        }
	    }

	    // Function to input values for Code, FoodName, Sticker and call GetType()
	    public void FoodIn() {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter Code: ");
	        Code = scanner.nextInt();
	        scanner.nextLine(); // Consume newline left-over

	        System.out.print("Enter Food Name: ");
	        FoodName = scanner.nextLine();

	        System.out.print("Enter Sticker (Green/Yellow/Red): ");
	        Sticker = scanner.nextLine();

	        // Call GetType to assign FoodType
	        GetType();
	    }

	    // Function to display content of all data members
	    public void FoodOut() {
	        System.out.println("\nSupply Details:");
	        System.out.println("Code: " + Code);
	        System.out.println("Food Name: " + FoodName);
	        System.out.println("Sticker: " + Sticker);
	        System.out.println("Food Type: " + FoodType);
	    }

	    // Main method to test the class
	    public static void main(String[] args) {
	        Supply supply = new Supply();
	        supply.FoodIn(); // Input values
	        supply.FoodOut(); // Output values
	    }
	}

