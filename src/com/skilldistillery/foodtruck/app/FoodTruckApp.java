package com.skilldistillery.foodtruck.app;

import java.util.Scanner;

import com.skilldistillery.foodtruck.entities.Foodtruck;

public class FoodTruckApp {


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
				System.out.println("Please enter a star rating from 1 - 5 ");
				rating = scan.nextInt();
				if (rating > 5 || rating < 1) {
					System.err.println("Invalid Entry: Please select from 1 - 5");
					rating = scan.nextInt();
				}
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
			double counter = 0;
			double total = 0;
			for (int numbOfTrucks = 0; numbOfTrucks < foodtrucksArray.length; numbOfTrucks ++) {
				if (foodtrucksArray[numbOfTrucks] != null) {
					total += foodtrucksArray[numbOfTrucks].getRating();
					counter++;
				} 
				
			}
			double avg = total / counter;
			//avg = Math.round(avg*) /2;
			System.out.println("The average foodtruck rating was: " + avg + " stars.");
			break;
		case 3:
			String winnerName = null;
			int winnerId = 0; 
			String winnerFood = null;
			int winnerRating = 0;
			int highestRatedNum = foodtrucksArray[0].getRating();
			for(int numbOfTrucks = 0; numbOfTrucks < foodtrucksArray.length; numbOfTrucks ++) {
				if (foodtrucksArray[numbOfTrucks] != null) {
					if (foodtrucksArray[numbOfTrucks].getRating() > highestRatedNum) {
						//highestRatedNum = foodtrucksArray[numbOfTrucks].getRating();
						
						winnerName = foodtrucksArray[numbOfTrucks].getName();
						winnerId = foodtrucksArray[numbOfTrucks].getId();
						winnerFood = foodtrucksArray[numbOfTrucks].getFoodType();
						winnerRating = foodtrucksArray[numbOfTrucks].getRating();
						
					} else if (foodtrucksArray[numbOfTrucks].getRating() == highestRatedNum) {
						winnerName = foodtrucksArray[numbOfTrucks].getName();
						winnerId = foodtrucksArray[numbOfTrucks].getId();
						winnerFood = foodtrucksArray[numbOfTrucks].getFoodType();
						winnerRating = foodtrucksArray[numbOfTrucks].getRating();
					}
				}
			} 
			//System.out.println(highestRatedNum);
			System.out.println(" The winning food truck was, " + winnerName + ", VendorID: " + winnerId +  ", Food-Type: " + winnerFood + ", Rating: " + winnerRating + "]");
			break;
		case 4:
			System.out.println("Exiting Program");
			// isTrue = false;
			scan.close(); 
			return false;
		default:
			if (numSelect != 1 || numSelect != 2 || numSelect != 3 || numSelect != 4) {
			System.err.println("Invalid Entry: Please select 1-4");
			numSelect = scan.nextInt();
			}
			break;

		}
		return true;
	}

}
