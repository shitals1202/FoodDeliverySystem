package com.bl;


import java.util.List;
import java.util.Scanner;

import com.bl.FoodItem.Category;
import com.bl.FoodItem.Taste;
import com.bl.FoodItem.VegType;
//UI Layer
public class UserInterface{
	FoodStore foodStore = FoodStore.getInstance();
	FoodItem foodItem = new FoodItem();
	private static UserInterface instance;
	public void print(List<FoodItem> foodList) {
		for (int i=0; i< foodList.size(); i++) {
			System.out.println(foodList.get(i));
		}
	}
	private UserInterface() {
		
	}
	public static synchronized  UserInterface getInstance() {
		if(instance == null) {
			instance = new UserInterface();
		}
		return instance;
		
	}
	public void showUserMenu() {
		Scanner sc = new Scanner(System.in);
		Application application = new Application();
		int n = 0;
		int exit =5;
		
		while(n!=exit) {
		System.out.println("Enter 1 for Adding Food item");
		System.out.println("Enter 2 for Removing Food item");
		System.out.println("Enter 3 for Printing the food item");
		System.out.println("Enter 4 for Edit the food item");
		System.out.println("press" + exit+ " for exit");
		n = sc.nextInt();
		application.handleUserSelection(n);
		}	
   }
	public FoodItem createFoodItems() {
		FoodItem foodItem = new FoodItem();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Food item you want to add :");
		foodItem.name = sc.nextLine();
		System.out.println("Enter 0:SWEET \n 1: SOUR \n 2: SPICY \n 3:SWEET_SOUR");
		int tasteUserInput =sc.nextInt();
		
		switch(tasteUserInput) {
		case 0:
			foodItem.setTaste(FoodItem.Taste.SWEET);
		break;
		case 1:
			foodItem.setTaste(FoodItem.Taste.SOUR);
		break;
		case 2:
			foodItem.setTaste(FoodItem.Taste.SPICY);
		break;
		case 3:
			foodItem.setTaste(FoodItem.Taste.SWEET_SOUR);
		break;
		}
		System.out.println("Enter Category: \n 0:STARTER \n 1:JUICES \n 2:MAINCOURSE \n 3:DESSERTS");
		int categoryUserInput = sc.nextInt();
		
		switch(categoryUserInput) {
		case 0:
			foodItem.setCategory(FoodItem.Category.STARTERS);
		break;
		case 1:
			foodItem.setCategory(FoodItem.Category.JUICES);
		break;
		case 2:
			foodItem.setCategory(FoodItem.Category.MAINCOURSE);
		break;
		case 3:
			foodItem.setCategory(FoodItem.Category.DESSERTS);
		break;
		}
		System.out.println("Enter a VegType: \n 0:Veg \n 1:Nonveg");
		int vegType = sc.nextInt();
		switch(vegType) {
		case 0:
			foodItem.setVegType(FoodItem.VegType.VEG);
		break;
		case 1:
			foodItem.setVegType(FoodItem.VegType.NON_VEG);
		break;
		}
		
		System.out.println("Enter the Price: ");
		int price = sc.nextInt();
		foodItem.setPrice(price);
		return foodItem;	
	}
	public FoodItem editFoodItem(FoodItem foodName1) {
		FoodStore foodStore = FoodStore.getInstance();		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter which Field You want to edit : 0:taste \n 1:category \n 2:vegtype \n 3:price \n  4:Name");
		int choice = sc.nextInt();
		switch(choice) {
			case 0:
				System.out.println("Enter the Taste Name: 0:SWEET \\n 1: SOUR \\n 2: SPICY \\n 3:SWEET_SOUR");
				int name = sc.nextInt();
				switch(name) {
				case 0:
					foodItem.setTaste(FoodItem.Taste.SWEET);
				break;
				case 1:
					foodItem.setTaste(FoodItem.Taste.SOUR);
				break;
				case 2:
					foodItem.setTaste(FoodItem.Taste.SPICY);
				break;
				case 3:
					foodItem.setTaste(FoodItem.Taste.SWEET_SOUR);
				break;
				}
				break;
			case 1:
				System.out.println("Enter the Category: 0:STARTER \\n 1:JUICES \\n 2:MAINCOURSE \\n 3:DESSERTS ");
				int category = sc.nextInt();
				switch(category) {
				case 0:
					foodItem.setCategory(FoodItem.Category.STARTERS);
				break;
				case 1:
					foodItem.setCategory(FoodItem.Category.JUICES);
				break;
				case 2:
					foodItem.setCategory(FoodItem.Category.MAINCOURSE);
				break;
				case 3:
					foodItem.setCategory(FoodItem.Category.DESSERTS);
				break;
				}
				break;
			case 2:
				System.out.println("Eneter the veg type: 0:Veg \\n 1:Nonveg");
				int vegType = sc.nextInt();
				switch(vegType) {
					case 0:
						foodItem.setVegType(FoodItem.VegType.VEG);
					break;
					case 1:
						foodItem.setVegType(FoodItem.VegType.NON_VEG);
					break;
					}
				break;
			case 3:
				System.out.println("Enter the Price: ");
				int price = sc.nextInt();
				foodItem.setPrice(price);
				break;
		}
		return foodItem;
	}
}