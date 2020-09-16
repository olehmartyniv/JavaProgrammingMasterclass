package com.company;

public class Hamburger {

    private String breadRoll;
    private String meat;
    private double basePrice;
    private String name;
    private double additionsPrice;
    private Addition lettuce;
    private Addition tomato;
    private Addition sauce;
    private Addition cheese;

    public Hamburger(String breadRoll, String meat, double basePrice, String name) {
        this.breadRoll = breadRoll;
        this.meat = meat;
        this.basePrice = basePrice;
        this.name = name;
    }

    public void setAdditionsPrice(double additionsPrice) {
        this.additionsPrice += additionsPrice;
    }

    public void addAddition(String name, double price) {
        switch (name) {
            case "Lettuce":
                lettuce = new Addition(name, price);
                break;
            case "Tomato":
                tomato = new Addition(name, price);
                break;
            case "Sauce":
                sauce = new Addition(name, price);
                break;
            case "Cheese":
                cheese = new Addition(name, price);
                break;
        }
    }

    public void printTotalPrice() {
        System.out.println("Base price: \t" + basePrice + "$");
        calculateAdditionsPrice();
        System.out.println("Total price:\t" + (basePrice + additionsPrice) + "$\n");
    }

    public void calculateAdditionsPrice() {
        if (lettuce != null) {
            setAdditionsPrice(lettuce.getPrice());
            System.out.println(lettuce.getName() + ": " + lettuce.getPrice() + "$");
        }
        if (tomato != null) {
            setAdditionsPrice(tomato.getPrice());
            System.out.println(tomato.getName() + ": " + tomato.getPrice() + "$");
        }
        if (sauce != null) {
            setAdditionsPrice(sauce.getPrice());
            System.out.println(sauce.getName() + ": " + sauce.getPrice() + "$");
        }
        if (cheese != null) {
            setAdditionsPrice(cheese.getPrice());
            System.out.println(cheese.getName() + ": " + cheese.getPrice() + "$");
        }
    }
}
