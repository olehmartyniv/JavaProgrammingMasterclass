package com.company;

public class Main {

    public static void main(String[] args) {
	    for (int i = 1; i < 11; i++) {
	        Movie movie = randomMovie();
            System.out.println("Movie #" + i + ": " + movie.getName() + "\n" + "Plot: " + movie.plot() + "\n");
        }

	    Car car = new Car("Base car", 4);
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Ferrari ferrari = new Ferrari();
        System.out.println(ferrari.startEngine());
        System.out.println(ferrari.accelerate());
        System.out.println(ferrari.brake());
    }

    public static Movie randomMovie() {
        int randomNumber = (int) (Math.random() * 5) + 1;
        System.out.println("Random number generated was: " + randomNumber);
        switch (randomNumber) {
            case 1:
                return new Jaws();
            case 2:
                return new IndependenceDay();
            case 3:
                return new MazeRunner();
            case 4:
                return new StarWars();
            case 5:
                return new Forgetable();
            default:
                return null;
        }
    }
}

class Movie {

    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String plot() {
        return "No plot here";
    }

    public String getName() {
        return name;
    }
}

class Jaws extends Movie {

    public Jaws() {
        super("Jaws");
    }

    @Override
    public String plot() {
        return "A shark eats lots of people";
    }
}

class IndependenceDay extends Movie {

    public IndependenceDay() {
        super("Independence Day");
    }

    @Override
    public String plot() {
        return "Alien";
    }
}

class MazeRunner extends Movie {

    public MazeRunner() {
        super("Maze Runner");
    }

    @Override
    public String plot() {
        return "Kids try and escape a maze";
    }
}

class StarWars extends Movie {

    public StarWars() {
        super("Star Wars");
    }

    @Override
    public String plot() {
        return "Imperial Forces try to take over the universe";
    }
}

class Forgetable extends Movie {

    public Forgetable() {
        super("Forgetable");
    }

    // No plot method
}

class Car {

    private String name;
    private boolean engine;
    private int cylinders;
    private int wheels;

    public Car(String name, int cylinders) {
        this.name = name;
        this.cylinders = cylinders;
        engine = true;
        wheels = 4;
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String startEngine() {
        return "Car engine is started";
    }

    public String accelerate() {
        return "Car speed is increased";
    }

    public String brake() {
        return "Car speed is decreased";
    }
}

class Mercedes  extends Car {

    public Mercedes() {
        super("Mercedes", 8);
    }

    @Override
    public String startEngine() {
        return "Mercedes engine is started";
    }

    @Override
    public String accelerate() {
        return "Mercedes speed is increased";
    }

    @Override
    public String brake() {
        return "Mercedes speed is decreased";
    }
}

class Audi extends Car {

    public Audi() {
        super("Audi", 6);
    }

    @Override
    public String startEngine() {
        return "Audi engine is started";
    }

    @Override
    public String accelerate() {
        return "Audi speed is increased";
    }

    @Override
    public String brake() {
        return "Audi speed is decreased";
    }
}

class Ferrari extends Car {

    public Ferrari() {
        super("Ferrari", 12);
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() + " engine is started";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName() + " speed is increased";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName() + " speed is decreased";
    }
}