package com.hillel.kornieiev.project.homework13;

public class Burger {

    String bun;
    String meat;
    String doubleMeat;
    String cheese;
    String salad;
    String mayonnaise;

    //Classic Burger.
    public Burger (String bun, String meat, String cheese, String salad, String mayonnaise) {

        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.salad = salad;
        this.mayonnaise = mayonnaise;

        System.out.println("Classic : " + bun + meat + cheese + salad + mayonnaise);
    }

    // Double Meat Burger.
    public Burger (String bun, String meat, String doubleMeat, String cheese, String salad, String mayonnaise) {

        this.bun = bun;
        this.meat = meat;
        this.doubleMeat = doubleMeat;
        this.cheese = cheese;
        this.salad = salad;
        this.mayonnaise = mayonnaise;

        System.out.println("Double Meat : " + bun + meat + doubleMeat + cheese + salad + mayonnaise);

    }
    //Dietary Burger.
    public Burger (String bun, String meat, String cheese, String salad) {

        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.salad = salad;

        System.out.println("Dietary : " + bun + meat + cheese + salad);

    }
}

