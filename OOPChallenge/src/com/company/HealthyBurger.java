package com.company;

public class HealthyBurger extends Hamburger {

    private Addition carrot;
    private Addition onion;

    public HealthyBurger(String meat, double basePrice) {
        super("Brown Rye", meat, basePrice, "Healthy");
    }

    @Override
    public void addAddition(String name, double price) {
        switch (name) {
            case "Carrot":
                carrot = new Addition(name, price);
                break;
            case "Onion":
                onion = new Addition(name, price);
                break;
        }

        super.addAddition(name, price);
    }

    @Override
    public void calculateAdditionsPrice() {
        super.calculateAdditionsPrice();
        if (carrot != null) {
            setAdditionsPrice(carrot.getPrice());
            System.out.println(carrot.getName() + ": " + carrot.getPrice() + "$");
        }
        if (onion != null) {
            setAdditionsPrice(onion.getPrice());
            System.out.println(onion.getName() + ": " + onion.getPrice() + "$");
        }
    }
}
