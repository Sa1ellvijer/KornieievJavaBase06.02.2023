package com.hillel.kornieiev.project.homework17;

import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        DrinksMachine[] drinksMachines = DrinksMachine.values();
        DrinksMachine orderDrinks = null;

        Drinks.drinkPrice();

        while (true) {
            boolean stop = false;

            while (true) {
                System.out.println("Please, make a choice: " + Arrays.toString(drinksMachines));
                String userEnter = scanner.nextLine();

                if (userEnter.toUpperCase().equals("STOP")) {
                    stop = true;
                    break;
                }

                for (DrinksMachine drink : drinksMachines) {
                    if (userEnter.equals(drink.toString())) {
                        orderDrinks = DrinksMachine.valueOf(userEnter);
                        break;
                    }
                }

                if (orderDrinks != null) {
                    break;
                } else {
                    System.out.println();
                    System.out.println("Incorrect entry - Try Again!");
                    System.out.println("To terminate the operation, write >STOP<");
                    System.out.println();
                }
            }

            if (stop) {
                break;
            }

            new Drinks(orderDrinks);
            orderDrinks = null;
            System.out.println();
            System.out.println("The number of orders: " + Drinks.getCounter());
            System.out.println("Payable amount: " + Drinks.getTotal() + "$");
            System.out.println("To terminate the operation, write >STOP<");

        }
    }
}
