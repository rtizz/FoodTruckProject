package com.skilldistillery.foodtruck.entities;

public class Foodtruck {
	private static int nextTruckId = 202300;
	private int id;
	private String name;
	private String foodType;
	private int rating;
	
	public Foodtruck() {
		nextTruckId = nextTruckId + 1;
		this.id = nextTruckId;	
	}
	
	public Foodtruck(String truckName, String foodType, int rating) {
		nextTruckId = nextTruckId + 1;
		this.id = nextTruckId;	
		this.name = truckName;
		this.foodType = foodType;
		this.rating = rating;
	}

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFoodType() {
		return foodType;
	}

	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	} 
	

	@Override
	public String toString() {
		return " [Name: " + name + ", VendorID: " + id +  ", Food-Type: " + foodType + ", Rating: " + rating + "]";
	}



}

	
