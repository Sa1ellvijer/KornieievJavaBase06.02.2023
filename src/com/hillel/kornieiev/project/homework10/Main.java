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

        System.out.println();
        int counter =0;
        for (int i = 0; i < arrayOne.length; i++) {
            if (arrayOne[i] == arrayTwo[i]) {
                counter++;
                System.out.println("Збіг: " + arrayOne[i] + " та " + arrayTwo[i]);
            }
        }

        System.out.println();
        System.out.println("Кількість збігів : " + counter);

    }
}