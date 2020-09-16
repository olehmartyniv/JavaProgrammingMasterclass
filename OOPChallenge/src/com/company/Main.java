package com.company;

public class Main {

    public static void main(String[] args) {
	    Hamburger hamburger = new Hamburger("Wheat", "Pork", 2.5, "Regular");
		hamburger.addAddition("Lettuce", 0.10);
	    hamburger.printTotalPrice();

	    HealthyBurger healthyBurger = new HealthyBurger("Chicken", 3.5);
	    healthyBurger.addAddition("Cheese", 0.25);
	    healthyBurger.addAddition("Sauce", 0.05);
		healthyBurger.addAddition("Qwe", 0.05);
	    healthyBurger.printTotalPrice();

	    DeluxeBurger deluxeBurger = new DeluxeBurger("Wheat", "Beef", 3.0);
	    deluxeBurger.addAddition("Cheese", 0.25);
	    deluxeBurger.addAddition("Drink", 0.15);
	    deluxeBurger.printTotalPrice();
    }
}
