package com.company;

public class Main {

    public static void main(String[] args) {
	    Player player = new Player();
	    player.name = "Tim";
	    player.health = 20;
	    player.weapon = "Sword";

	    int damage = 10;
	    player.loseHealth(damage);
        System.out.println("Remaining health = " + player.healthRemaining());

        damage = 11;
        player.health = 200;
        player.loseHealth(damage);
        System.out.println("Remaining health = " + player.healthRemaining());

        EnhancedPlayer player1 = new EnhancedPlayer("Tim", 50, "Sword");
        System.out.println("Initial health is " + player1.getHealth());

        Printer printer = new Printer(50, false);
        System.out.println("Initial page coun = " + printer.getPagesPrinted());
        int pagesPrinted = printer.printPage(5);
        System.out.println("Pages printed was " + pagesPrinted + " new total print count for printer = " + printer.getPagesPrinted());
        pagesPrinted = printer.printPage(2);
        System.out.println("Pages printed was " + pagesPrinted + " new total print count for printer = " + printer.getPagesPrinted());
    }
}
