package com.company;

public class Main {

    public static void main(String[] args) {

        Fred chicken = new Fred(6, "boo", "code");
        Fred goat = new Fred(12, "meaw", "rat");

	System.out.println(goat.getSound());
	System.out.println(chicken.getFood());
	chicken.setLegs(5);
        System.out.println(chicken.getLegs());
        System.out.println(goat.getLegs());
        System.out.println(chicken.getFood());
    }
}
