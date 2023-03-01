package com.hillel.kornieiev.project.homework11;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Scanner.

        int M;
        Scanner inputOne = new Scanner(System.in);
        System.out.println("Enter Array length between 1 and 9: ");
        M = inputOne.nextInt();
        if (M < 1 || M > 9){
            System.out.println("Fatal Error! Try Again!");
            System.out.println();
            System.out.println("Enter Array length between 1 and 9: ");
            inputOne = new Scanner(System.in);
            M = inputOne.nextInt();
        } else {
            System.out.println(M + " Registered!");
        }

        int N;
        Scanner inputTwo = new Scanner(System.in);
        System.out.println("Enter Array height between 1 and 9: ");
        N = inputTwo.nextInt();
        if (N < 1 || N > 9){
            System.out.println("Fatal Error! Try Again!");
            System.out.println();
            System.out.println("Enter Array height between 1 and 9: ");
            inputTwo = new Scanner(System.in);
            N = inputTwo.nextInt();
        } else {
            System.out.println(N + " Registered!");
        }

        // Range of random numbers.

        int randomMin = 10;
        int randomMax = 99;

        int[][] arrayMatrixOne = new int[M][N];

        for (int i = 0; i < arrayMatrixOne.length; i++) {
            for (int j = 0; j < arrayMatrixOne[i].length ; j++) {
                arrayMatrixOne[i][j] = randomMin + ((int) (Math.random() * (randomMax - randomMin + 1)));
            }
        }

        //Matrix transposition.

        int[][] arrayMatrixTwo = new int[N][M];

        for (int i = 0; i < arrayMatrixOne.length; i++) {
            for (int j = 0; j < arrayMatrixOne[i].length; j++) {
                arrayMatrixTwo[j][i] = arrayMatrixOne[i][j];
            }
        }

        //Exit.

        System.out.println();
        System.out.println("Original Array!");
        for (int i = 0; i < arrayMatrixOne.length; i++) {
            for (int j = 0; j < arrayMatrixOne[i].length; j++) {

                System.out.print(arrayMatrixOne[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Transposed Array!");
        for (int i = 0; i < arrayMatrixTwo.length; i++) {
            for (int j = 0; j < arrayMatrixTwo[i].length; j++) {

                System.out.print(arrayMatrixTwo[i][j] + " ");
            }
            System.out.println();
        }


    }
}







