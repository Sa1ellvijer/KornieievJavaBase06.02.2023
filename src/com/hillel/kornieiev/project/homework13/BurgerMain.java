package com.hillel.kornieiev.project.homework13;

public class BurgerMain {

    public static void main(String[] args) {
        System.out.println();

        Burger burgerClassic;
        burgerClassic = new Burger("Bun,","Meat,","Cheese,","Salad,","Mayonnaise.");

        Burger burgerDoubleMeat;
            burgerDoubleMeat = new Burger("Bun,","Meat,","Meat,",
                    "Cheese,","Salad,", "Mayonnaise.");

        Burger burgerDietary;
        burgerDietary = new Burger("Bun,","Meat,","Cheese,","Salad.");
    }
}
