package com.bl;

import java.util.ArrayList;
import java.util.List;
//Data Layer
public class FoodStore {

	private static FoodStore instance;
	private List<FoodItem> fooditems = new ArrayList<>();
	
	private FoodStore() {
		
	}
	public static synchronized FoodStore getInstance() {
		if(instance == null) {
			instance = new FoodStore();
		}
		return instance;
		
	}
	
	
	
	public void add(FoodItem foodItems) {
		fooditems.add(foodItems);
	}
	public List<FoodItem> getFoodItem() {
		return fooditems;
	}
	
	public void setFooditem(List<FoodItem> fooditems) {
		this.fooditems = fooditems;
	}
	public void remove(FoodItem foodItems) {
		fooditems.remove(foodItems);
	}
	
	public FoodItem getFood(String foodName) {
		for(FoodItem foodItem : fooditems){
			if(foodName.equals(foodItem.name)){
				return foodItem;
			}
		}
		return null;
	}

}