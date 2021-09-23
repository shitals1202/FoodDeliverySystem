package com.bl;


public class FoodItem{
	enum Taste { SWEET, SOUR , SPICY , SWEET_SOUR };
	enum Category {STARTERS , JUICES , MAINCOURSE , DESSERTS};
	enum VegType {VEG , NON_VEG};
	
	protected Taste taste;
	protected Category category;
	protected VegType vegtype;
	protected int price ;
	protected String name;
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "FoodItem [ taste =" + taste +" , category= " +category+ " , Vegtype ="+vegtype+", Price= "+price+", Name ="+name+"]";
	}

	public void setTaste(Taste tasteChoice) {
		this.taste =tasteChoice;	
	}

	public void setCategory(Category categoryChoice) {
		this.category = categoryChoice;
		
	}

	public void setVegType(VegType VegType) {
		this.vegtype = VegType;
		
	}
	
}