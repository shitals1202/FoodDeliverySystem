package com.bl;

import java.util.Scanner;
//Controller Layer
public class Application{
	UserInterface userInterface = UserInterface.getInstance();
	
	public static void main(String[] args) {
		/*ChocolateShake chocolateshake = new ChocolateShake();
		chocolateshake.setPrice(100);
		
		ChickenBiryani chickenbiryani = new ChickenBiryani();
		chickenbiryani.setPrice(200);
		
		HakkaNoodles hakkanoddles = new HakkaNoodles();
		hakkanoddles.setPrice(300);
		
		MasalaDosa masaladosa = new MasalaDosa();
		masaladosa.setPrice(400);
		
		DalKhichadi dalkhichadi = new DalKhichadi();
		dalkhichadi.setPrice(50);
		
		
		FoodStore foodstore = new FoodStore();
		foodstore.add(masaladosa);
		foodstore.add(hakkanoddles);
		foodstore.add(chickenbiryani);
		foodstore.add(chocolateshake);
		foodstore.add(dalkhichadi);
		
		
		*/
		UserInterface userInterface = UserInterface.getInstance();
		userInterface.showUserMenu();
		//foodstore.remove(masaladosa);
		//foodstore.remove(hakkanoddles);
		//System.out.println("fooditem is removed");
		//userinterface.print(foodstore.getFoodItem());
	
		
	}

	public void handleUserSelection(int n) {
		FoodStore foodStore = FoodStore.getInstance();
		UserInterface userInterface = UserInterface.getInstance();
		switch( n ) {
		case 1 :
			/*ChocolateShake chocolateshake = new ChocolateShake();
			chocolateshake.setPrice(100);
			
			ChickenBiryani chickenbiryani = new ChickenBiryani();
			chickenbiryani.setPrice(200);
			
			HakkaNoodles hakkanoddles = new HakkaNoodles();
			hakkanoddles.setPrice(300);
			
			MasalaDosa masaladosa = new MasalaDosa();
			masaladosa.setPrice(400);
			
			DalKhichadi dalkhichadi = new DalKhichadi();
			dalkhichadi.setPrice(50);
			
			foodstore.add(masaladosa);	
			foodstore.add(dalkhichadi);
			foodstore.add(hakkanoddles);
			foodstore.add(chocolateshake);
			
			
			userInterface.print(foodstore.getFoodItem());
			*/
			
			FoodItem foodItem1 = userInterface.createFoodItems();
			foodStore.add(foodItem1);
			break;
		case 2 :
			System.out.println("Enter the name of food which u want to remove");
			Scanner sc = new Scanner(System.in);
			String foodName = sc.nextLine();
			FoodItem foodItem = foodStore.getFood(foodName);
			foodStore.remove(foodItem);
			break;
		case 3:
			userInterface.print(foodStore.getFoodItem());
			break;
		case 4:
			Scanner sc1= new Scanner(System.in);
			System.out.println("Enter the name of food which you want to edit: ");
			String foodName1 = sc1.nextLine();			
			FoodItem foodItem2 = foodStore.getFood(foodName1);
			userInterface.editFoodItem(foodItem2);
			break;
		case 5:
			
			break;
		}
	}
}