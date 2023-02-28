package com.hillel.kornieiev.project.homework10;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] arrayOne = new int[7];
        for (int i = 0; i < arrayOne.length; i++) {
            arrayOne[i] = (int) ((Math.random() * (9 + 1)) + 0);
        }
        Arrays.sort(arrayOne);

        int[] arrayTwo = new int[7];
        for (int i = 0; i < arrayTwo.length; i++) {
            arrayTwo[i] = (int) ((Math.random() * (9 + 1)) + 0);
        }
        Arrays.sort(arrayTwo);

         System.out.println(Arrays.toString(arrayOne));
         System.out.println(Arrays.toString(arrayTwo));

         int counter = 0;

        if (arrayOne[0] == arrayTwo[0]) {
            //System.out.println(arrayOne[0] + " та " + arrayTwo[0] + " Збіг!");
            counter++;
        }

        if (arrayOne[1] == arrayTwo[1]) {
            //System.out.println(arrayOne[1] + " та " + arrayTwo[1] + " Збіг!");
            counter++;
        }

        if (arrayOne[2] == arrayTwo[2]) {
            //System.out.println(arrayOne[2] + " та " + arrayTwo[2] + " Збіг!");
            counter++;
        }

        if (arrayOne[3] == arrayTwo[3]) {
            //System.out.println(arrayOne[3] + " та " + arrayTwo[3] + " Збіг!");
            counter++;
        }

        if (arrayOne[4] == arrayTwo[4]) {
            //System.out.println(arrayOne[4] + " та " + arrayTwo[4] + " Збіг!");
            counter++;
        }

        if (arrayOne[5] == arrayTwo[5]) {
            //System.out.println(arrayOne[5] + " та " + arrayTwo[5] + " Збіг!");
            counter++;
        }

        if (arrayOne[6] == arrayTwo[6]) {
            //System.out.println(arrayOne[6] + " та " + arrayTwo[6] + " Збіг!");
            counter++;
        }

        System.out.println();
        System.out.println("Кількість збігів : " + counter);

    }

}