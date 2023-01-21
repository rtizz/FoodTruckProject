package com.skilldistillery.foodtruck.app;

import java.util.Scanner;

import com.skilldistillery.foodtruck.entities.Foodtruck;

public class FoodTruckApp {

	// User will input and rate a list of food trucks, then view the average rating
	// and the highest-rated truck
	// DOES NOT PASS IN ID VALUE FOR FOODTRUCK
	private Foodtruck[] foodtrucksArray = new Foodtruck[5];
	private Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		FoodTruckApp ftApp = new FoodTruckApp();

		boolean isTrue = true;

		ftApp.populateFTArray();
		while (isTrue) {
		isTrue = ftApp.menuList();
	
		}


	}

	/*
	 * 1. Take in text and assign to private vars and place those in Array 2. DO NOT
	 * TAKE IN THE TRUCK ID. For loop potentially to add that to each new truck.
	 * ******3. Selecting quit FOR FOOD TRUCK NAME, the input ends and continues
	 * program****** (Switch?) 4. After quit, the user is prompted with a menu they
	 * can choose from. (SwitchVVV)
	 */
	// a. List all existing food trucks.
	// TODO Make ALL actual trucks print. NO NULL
	//
	// b. see the average rating for food truck - cannot be length, needs to see 2
	// total if only 2 and 3 if only
	// c. Display the highest-rated food truck
	// d. Quit the program

	// We want the first prompt to loop (to 5) until someone enters "quit" (While
	// loop with a break).

	// we want the second menu to persist until they select quit and end the
	// program.

//	1. Take in a single object's variables and assign them to an array. 
	//
	// for loop takes in parameters

//Instantiate food truck array here
	// loopVVV
	// TODO Prompt user to input the name, foodtype, and rating for UP TO 5 food
	// trucks.

	// makes new inputs to assign to Foodtruck ctor.
	public void populateFTArray() {

		// for loop
		
		for (int truckLoops = 0; truckLoops < 5; truckLoops++) {
			String truckName;
			String foodType;
			int rating;
			System.out.println("Please enter the name of a foodtruck");
			truckName = scan.nextLine();
			if (truckName.equalsIgnoreCase("quit")) {
				break;
			} else {
				System.out.println("Please enter the food truck cuisine");
				foodType = scan.nextLine();
				System.out.println("Please enter a rating from 0(Worst) - 10 (Amazing)");
				rating = scan.nextInt();
				scan.nextLine();
				foodtrucksArray[truckLoops] = new Foodtruck(truckName, foodType, rating);
			}
		}
	}
		



	public boolean menuList() {
		System.out.println("Please select the options below by entering the respective number");
		System.out.println();
		System.out.println(
				" 1. List all food trucks. \n 2. See average rating of food trucks. \n 3. Display highest-rated food truck. \n 4. Quit the program. ");

		int numSelect = scan.nextInt();

		switch (numSelect) {
		case 1:
			System.out.println("Foodtrucks: ");
			for (int i = 0; i < foodtrucksArray.length; i++) {
				if (foodtrucksArray[i] != null) {
					System.out.println(foodtrucksArray[i]);
					
				}
			}
//			System.out.println("...Returning to menu...");
//			menuList();
			break;
		case 2:
			int counter = 0;
			int total = 0;
			for (int numbOfTrucks = 0; numbOfTrucks < foodtrucksArray.length; numbOfTrucks ++) {
				if (foodtrucksArray[numbOfTrucks] != null) {
					total += foodtrucksArray[numbOfTrucks].getRating();
					counter++;
				} 
				
			}
			double average = total / counter;
			System.out.println("The average foodtruck rating was: " + average);
			break;
		case 3:
//			System.out.println("The highest rated foodtruck was: " /* + method to display highest */);
//			String highestRated ;
//			int highestRatedNum = 0;
//			int newNum = 0;
//			for(int numbOfTrucks = 0; numbOfTrucks < foodtrucksArray.length; numbOfTrucks ++) {
//				if (foodtrucksArray[numbOfTrucks] != null) {
//					if (foodtrucksArray[numbOfTrucks].getRating() > highestRatedNum) {
//						highestRatedNum = foodtrucksArray[numbOfTrucks].getRating();
//						highestRated = foodtrucksArray.
//						System.out.println(highestRated);
//					}
//				}
//			}
			break;
		case 4:
			System.out.println("Exiting");
			// isTrue = false;
			return false;
		default:
			System.err.println("Invalid Entry: Please select 1-4");
			break;

		}
		return true;
	}

}
