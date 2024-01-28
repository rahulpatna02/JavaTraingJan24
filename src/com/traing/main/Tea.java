package com.traing.main;

public class Tea implements Drink {
//Implemantation for make a drink of Drink Interface
	
	public String makeADrink() {

		return "Tea";
	}

}

class MilkTea extends Tea{
	//method overriding 
	@Override
	public String makeADrink() {

		return "MilkTea";
	}
	public void ingedient(String item1,int qnt) {
		
	}
	//Method Overloading
	public void ingedient(String item1,String item2,int qnt) {
		
	}
}

class GreenTea extends Tea{
	public String makeADrink() {

		return "GreenTea";
	}
}
