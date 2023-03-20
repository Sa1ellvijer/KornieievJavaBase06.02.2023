package com.hillel.kornieiev.project.homework9;


public class Main {

    public static void main(String[] args) {

    int[] arrayOne = new int[25];

        System.out.println("Team One :");

        for (int i = 0; i < arrayOne.length; i++) {
            arrayOne[i] = (int) ((Math.random() * (40 - 18 + 1)) + 18);

            System.out.print(arrayOne[i] + " ");

        }

        System.out.println();

    int[] arrayTwo = new int[25];

        System.out.println("Team Two :");

        for (int i = 0; i < arrayTwo.length; i++) {
            arrayTwo[i] = (int) ((Math.random() * (40 - 18 + 1)) + 18);

            System.out.print(arrayTwo[i] + " ");

        }

        System.out.println();
        double sumAgeOne = 0;
        for (int j : arrayOne) {
            sumAgeOne = sumAgeOne + j;

        }
        //CheckSum
        //System.out.println();
        //System.out.println(sumAgeOne);

        System.out.println();
        double sumAgeTwo = 0;
        for (int j : arrayTwo) {
            sumAgeTwo = sumAgeTwo + j;

        }
        //CheckSum
        //System.out.println(sumAgeTwo);
        //System.out.println();

        double averAgeOne = sumAgeOne / arrayOne.length;
        int averAgeOneResult = (int) Math.round(averAgeOne);
        System.out.println("Team One average age : " + averAgeOneResult);

        double averAgeTwo = sumAgeTwo / arrayTwo.length;
        int averAgeTwoResult = (int) Math.round(averAgeTwo);
        System.out.println("Team Two average age : " + averAgeTwoResult);

    }
}
