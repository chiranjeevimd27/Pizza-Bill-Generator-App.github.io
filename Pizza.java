package io.github;

public class Pizza {

	private int price;
	private Boolean veg;
	private int extraCheesePrice=100;
	private int extraToppingPrice =150;
	private int backPackPrice=20;
	private int basePizzaPrice;
	private boolean isExtraCheeseAdded=false;
	private boolean isExtraToppingsAdded=false;
	private boolean isOptedForTakeAway=false;
	private String bill;
	
	
	
	public Pizza(Boolean veg) {
		this.veg=veg;
		if(this.veg) {
			this.price=300;
			
		}else {
			this.price=400;
		}
		basePizzaPrice =this.price;
	}
	
	
	public void addExtraCheese() {
		isExtraCheeseAdded =true;
		//System.out.println("Extra cheese added");
		this.price +=extraCheesePrice;
	}
	
	
	public void addExtraTopping() {
		isExtraToppingsAdded=true;
		//System.out.println("Extra toppings added");
		this.price +=extraToppingPrice;

		
	}
	public void takeAway() {
		isOptedForTakeAway=true;
		//System.out.println("Take away opted");
		this.price +=backPackPrice;

		
	}
	public void getBill() {
		System.out.println("Pizza: "+basePizzaPrice);
		
		if(isExtraCheeseAdded) {
			bill +="Extra cheese added:" +extraCheesePrice+"\n";
		}
		if(isExtraToppingsAdded) {
			bill +="Extra Toppings added:" +extraToppingPrice+"\n";
		}
		if(isOptedForTakeAway) {
			bill +="Take Away:" +backPackPrice+"\n";
		}
		bill += "Bill: "+this.price+"\n";
		System.out.println(bill);
		
	}

}
