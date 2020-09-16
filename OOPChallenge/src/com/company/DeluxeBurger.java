package com.company;

public class DeluxeBurger extends Hamburger {

    private Addition chips;
    private Addition drink;

    public DeluxeBurger(String breadRoll, String meat, double basePrice) {
        super(breadRoll, meat, basePrice, "Deluxe");
        addAddition("Chips", 1.0);
        addAddition("Drink", 0.5);
    }

    @Override
    public void addAddition(String name, double price) {
        switch (name) {
            case "Chips":
                chips = new Addition(name, price);
                break;
            case "Drink":
                drink = new Addition(name, price);
                break;
            default:
                System.out.println("Can't add addition");
        }
    }

    @Override
    public void calculateAdditionsPrice() {
        if (chips != null) {
            setAdditionsPrice(chips.getPrice());
            System.out.println(chips.getName() + ": " + chips.getPrice() + "$");
        }
        if (drink != null) {
            setAdditionsPrice(drink.getPrice());
            System.out.println(drink.getName() + ": " + drink.getPrice() + "$");
        }
    }
}
