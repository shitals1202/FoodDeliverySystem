package com.bl;

import com.bl.FoodItem.Category;
import com.bl.FoodItem.Taste;
import com.bl.FoodItem.VegType;

public class ChickenBiryani extends FoodItem{
ChickenBiryani(){
	
	taste = Taste.SPICY;
	category = Category.MAINCOURSE;
	vegtype = VegType.NON_VEG;
	name = "Chicken Biryani";
	}
}
