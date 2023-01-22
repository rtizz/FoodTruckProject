# FoodTruckProject

# Description

The overall purpose of this program is to allow the user to input up to 5 Food Trucks (Name, foodtype, and rating (scale of 1-5)) and the program compiles all the information to display based on a variety of options. 


# Instructions:
1. Enter the name of a respective food truck, the food type, and a rating from 1 - 5 stars.
2. The prompts will continue until five food trucks have been entered 
   OR
   Enter "quit" at the food truck name prompt (after entering at least one food truck)to jump to main menu. 
   ***NOTE*** If "quit" is entered on first prompt. No food trucks will be entered.
3. Once at the main menu, the user will be prompted with 4 options:

    1. List all food trucks. - Lists out all food trucks entered with all accompanying data plus an automatically assigned Vendor ID.
    2. See average rating of food trucks. - Compiles all respective ratings and produces the average of all the food truck ratings.
    3. Display highest-rated food truck. - Lists out the winning food truck will all respective data. 
    ***NOTE*** If more than one values share a high score, the program will default to the newest.
    4. Quit the program. - Self explanatory

# Code breakdown:
Additional (detailed) comments are left along side the code as well
## Foodtruck.java ##

Lines:	Description
4-8: 	Respective varable declaration and assignment(for one).
10-13 	NoArg Ctor (not utilized in code).
15-21	Main Foodtruck Ctor taking in the key parameters.
		Utilization of auto - assigned venderID
24-54 	Respective getters and setters for invoking private variables.
57-60	To String


## FoodTruckApp.java##

Lines:	Description
11-12	Initial instantiation of FoodTruck array and scanner objects.
14-22	Main method
		15: Instatiating FoodtruckApp object to be used in methods below.
		16: Declaring and assigning a value to while loop boolean
		18-21: Primary two methods being utilized, one being looped.
26-50 	populateFTArry method 
		1. Prompts users
		2. Assigns input to variable
		   Breaks for loop if criteria is met to initiate while loop
		3. Sets those variables as parameters/arguments in Foodtruck Ctor
53-124	menuList method - returning a boolean to kill the while loop if criteria met.
		Once user enters "quit" after entering 1 OR enter in 5 food trucks, populatFTArray method ends and menuList is initiated
		54-59: 4 option main menu with a scanner input to assign to switch statment following.
		61-122: Switch statement outlining the criteria for selecting items 1-4
				Case 4: Exiting the menu and ending the program sends the false boolean value out to the main method to kill the 
				while loop.


# Technologies Used
1. Java
2. Eclipse
3. git

# Lessons Learned

1. (ReLearned) - Write out/draw what the desired effect is. i.e. determining winner and average were tedious processes.
2. Get better at naming and calling methods/objects. Half the time I was stuck was because I didnt realize where I should be
calling the information from. 
3. If technology can make your life easier, use it. I spent a while working with creating a toString in the wrong class before I realized eclipse does it for me where needed. 
4. Get better at understanding my own flow and pausing at a good point. I might think I was at a good stopping point but my left over notes didnt give me a clear understanding of what I was doing when I came back.
5. Better understand how to call tostrings. I feel I made Case 3 (menuList method) too convoluted when there was a much simpler way.
