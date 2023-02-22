package com.hillel.kornieiev.project.homework7;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        int Number = (int) (Math.random() * (10 + 1));
        int userEnter;

        while (true) {
            System.out.println("Enter number!");
            Scanner scanner = new Scanner(System.in);

            if (scanner.hasNextInt()) {
                userEnter = scanner.nextInt();

                if (userEnter < Number || userEnter > Number) {
                    System.out.print("Bad Luck!");
                    //System.out.println(Number); //Advice
                }
                    if (userEnter<Number) {
                        System.out.println(" Try a Higher number!");
                    }

                    if (userEnter>Number) {
                        System.out.println(" Try a Lower number!");
                    }

                if (userEnter == Number) {
                    System.out.println("Correct: " + Number + " - Victory");
                    break;
                }

            } else {
                System.out.println("Wrong! Need number!");
                scanner.nextLine();
                break;

            }
        }
    }
}