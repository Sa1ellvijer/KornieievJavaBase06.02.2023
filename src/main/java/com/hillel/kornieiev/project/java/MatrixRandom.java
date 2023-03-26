package com.hillel.kornieiev.project.java;

public class MatrixRandom {

    public static void main(String[] args) {

        int randomMin = 10;
        int randomMax = 99;
        int randomSizeMin = 1;
        int randomSizeMax = 5;

        System.out.println();
        System.out.print("Array Size: ");
        int arraySizeOne = randomSizeMin + ((int) (Math.random() * (randomSizeMax - randomSizeMin + 1)));

        System.out.print(arraySizeOne);
        System.out.print(" ");
        int arraySizeTwo = randomSizeMin + ((int) (Math.random() * (randomSizeMax - randomSizeMin + 1)));

        System.out.print(arraySizeTwo);
        System.out.println();

        int[][] arrayMatrixOne = new int[arraySizeOne][arraySizeTwo];

        for (int i = 0; i < arrayMatrixOne.length; i++) {
            for (int j = 0; j < arrayMatrixOne[i].length; j++) {
                arrayMatrixOne[i][j] = randomMin + ((int) (Math.random() * (randomMax - randomMin + 1)));
            }
        }

        System.out.println();
        System.out.println("Array!");
        for (int i = 0; i < arrayMatrixOne.length; i++) {
            for (int j = 0; j < arrayMatrixOne[i].length; j++) {

                System.out.print(arrayMatrixOne[i][j] + " ");
            }

            System.out.println();
        }
    }

}
