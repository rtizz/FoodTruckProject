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

EXPECTED OUTCOMES <br>
    1. List all food trucks. - Lists out all food trucks entered with all accompanying data plus an automatically assigned Vendor ID.
    2. See average rating of food trucks. - Compiles all respective ratings and produces the average of all the food truck ratings.
    3. Display highest-rated food truck. - Lists out the winning food truck will all respective data. If a tie, the program will print both highest rated.
    ***NOTE*** If more than one values share a high score, the program will default to the newest.
    4. Quit the program. - Self explanatory

# Code breakdown:
Additional (detailed) comments are left along side the code as well
## Foodtruck.java ##

Lines->Description <br> 
4-8: 	Respective varable declaration and assignment(for one).<br>
10-13 NoArg Ctor (not utilized in code).<br>
15-21	Main Foodtruck Ctor taking in the key parameters. <br>
		Utilization of auto - assigned venderID
24-54 Respective getters and setters for invoking private variables.<br>
57-60	To String<br>


## FoodTruckApp.java##

*Lines->Description* <br>
11-12	Initial instantiation of FoodTruck array and scanner objects.<br>
14-22	Main method<br>
		15: Instatiating FoodtruckApp object to be used in methods below.<br>
		16: Declaring and assigning a value to while loop boolean<br>
		18-21: Primary two methods being utilized, one being looped.<br>
28-55 populateFTArry method <br>
		1. Prompts users <br>
		2. Assigns input to variable <br>
		   Breaks for loop if criteria is met to initiate while loop<br>
		3. Sets those variables as parameters/arguments in Foodtruck Ctor<br>
58-126menuList method - returning a boolean to kill the while loop if criteria met.<br>
		Once user enters "quit" after entering 1 OR enter in 5 food trucks, populatFTArray method ends and menuList is initiated<br>
		54-59: 4 option main menu with a scanner input to assign to switch statment following.<br>
		61-122: Switch statement outlining the criteria for selecting items 1-4<br>
		>>>>>>Case 4: Exiting the menu and ending the program sends the false boolean value out to the main method to kill the 
				while loop.<br>


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
6. Decimal Format is a very helpful tool when you cant cleanly get rid of .66666666666, .3333333333, etc with conventional methods. 