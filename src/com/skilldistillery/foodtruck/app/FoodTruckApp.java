package com.skilldistillery.foodtruck.app;

import java.text.DecimalFormat;
import java.util.Scanner;

import com.skilldistillery.foodtruck.entities.Foodtruck;

public class FoodTruckApp {


	private Foodtruck[] foodtrucksArray = new Foodtruck[5];
	private Scanner scan = new Scanner(System.in);
//main method
	public static void main(String[] args) {
		FoodTruckApp ftApp = new FoodTruckApp();

		boolean isTrue = true;

		ftApp.populateFTArray(); //once complete: automatically starts the while loop for the main menu
		while (isTrue) {
		isTrue = ftApp.menuList();	
		}


	}
	
// Prompts user and allows input to variables for Foodtruck Ctor
	public void populateFTArray() {

		// for loop
		
		for (int truckLoops = 0; truckLoops < 5; truckLoops++) {
			String truckName;
			String foodType;
			int rating;
			System.out.println("Please enter the name of a foodtruck");
			truckName = scan.nextLine();
//During this prompt only user can enter 'quit' for next menu
			if (truckName.equalsIgnoreCase("quit")) { 
				break;
			} else {
				System.out.println("Please enter the food truck cuisine");
				foodType = scan.nextLine();
				System.out.println("Please enter a star rating from 1 - 5 ");
				rating = scan.nextInt();
//making sure the program only accepts values 1-5
				if (rating > 5 || rating < 1) {
					System.err.println("Invalid Entry: Please select from 1 - 5");
					rating = scan.nextInt();
				}
				scan.nextLine();
				foodtrucksArray[truckLoops] = new Foodtruck(truckName, foodType, rating);
			}
		}
	}
		
//Menu list to see all compiled data. Returning a boolean to stop the while loop if criteria met
	public boolean menuList() {
		System.out.println("Please select the options below by entering the respective number");
		System.out.println();
		System.out.println(
				" 1. List all food trucks. \n 2. See average rating of food trucks. \n 3. Display winning(highest-rated) food truck. \n 4. Quit the program. ");

		int numSelect = scan.nextInt();

		switch (numSelect) {
		case 1: //Displays all foodtrucks entered
			System.out.println("Foodtrucks: ");
			for (int i = 0; i < foodtrucksArray.length; i++) {
				if (foodtrucksArray[i] != null) {
					System.out.println(foodtrucksArray[i]); //calls on toString from FoodTruck class
					
				}
			}
			break;
		case 2://Displays the average rating of all entered trucks
			double counter = 0;
			double total = 0;
			for (int numbOfTrucks = 0; numbOfTrucks < foodtrucksArray.length; numbOfTrucks ++) {
				if (foodtrucksArray[numbOfTrucks] != null) {
					total += foodtrucksArray[numbOfTrucks].getRating();
					counter++;
				} 
				
			}
			double avg = total / counter;
			DecimalFormat df = new DecimalFormat("#.#"); //covers down on anything /3 that produces .66666/.33333/etc.
			System.out.println("The average foodtruck rating was: " + df.format(avg) + " stars.");
			break;
		case 3: //Displays winning trucks information. 
			int numbOfTrucks = 0;
			int highestRatedNum = foodtrucksArray[0].getRating();
			//loop to find the highest score
			for(numbOfTrucks = 0; numbOfTrucks < foodtrucksArray.length; numbOfTrucks ++) {
				if (foodtrucksArray[numbOfTrucks] != null) {
					if (highestRatedNum < foodtrucksArray[numbOfTrucks].getRating()) {
						highestRatedNum = foodtrucksArray[numbOfTrucks].getRating();
					} 
				}
			}
			//loop to correlate that score to respective truck
			for(numbOfTrucks = 0; numbOfTrucks < foodtrucksArray.length; numbOfTrucks ++) {
				if (foodtrucksArray[numbOfTrucks] != null) {
					if (highestRatedNum == foodtrucksArray[numbOfTrucks].getRating()) {
						System.out.println("The winning food truck was:\n" + foodtrucksArray[numbOfTrucks].toString());
					} 
				}
			}
			return true;
//			break;
		case 4: //Exits the program. and returns a false value to main method to stop while loop.
			System.out.println("Exiting Program");
			
			scan.close(); 
			return false;
		default://Checks if numbers are between 1 and 4
			if (numSelect != 1 || numSelect != 2 || numSelect != 3 || numSelect != 4) {
			System.err.println("Invalid Entry: Please select numbers 1-4.\nEnter any number and select enter to return to menu");
			scan.nextLine();
			numSelect = scan.nextInt();
			}
			break;

		}
		return true;
	}

}
