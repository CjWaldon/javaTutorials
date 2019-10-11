package com.company;

public class Main {

    public static void main(String[] args) {
	Hamburger hamburger = new Hamburger("Basic", "Sausage", 3.56, "white");
	double price = hamburger.itemizeHamburger();
	hamburger.addHamburgerAddition1("Tomato", .27);
	hamburger.addHamburgerAddition2("lettuce", .75);
    hamburger.addHamburgerAddition3("cheese", 1.13);
    System.out.println("Total Burger price is: "+hamburger.itemizeHamburger());

    HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.67);
    healthyBurger.addHamburgerAddition1("Egg", 5.43);
    healthyBurger.addHealthAddition1("Lentils", 3.41);

    System.out.println("Total healthy burger price is "+ healthyBurger.itemizeHamburger());

    DeluxeBurger db = new DeluxeBurger();
    db.addHamburgerAddition3("something", 1.50);
    db.itemizeHamburger();
    }
}
