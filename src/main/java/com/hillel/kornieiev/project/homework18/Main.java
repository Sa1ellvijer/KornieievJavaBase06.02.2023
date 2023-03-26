package com.hillel.kornieiev.project.homework18;

public class Main {

    public static void main(String[] args) {

        int randomMin = 1;
        int randomMax = 9;
        int randomSizeMin = 1;
        int randomSizeMax = 5;

        System.out.println();
        System.out.print("Array One Size: ");
        int arraySizeOne = randomSizeMin + ((int) (Math.random() * (randomSizeMax - randomSizeMin + 1)));

        System.out.print(arraySizeOne);
        System.out.print(":");
        int arraySizeTwo = randomSizeMin + ((int) (Math.random() * (randomSizeMax - randomSizeMin + 1)));

        System.out.print(arraySizeTwo);

        int[][] arrayMatrixOne = new int[arraySizeOne][arraySizeTwo];

        for (int i = 0; i < arrayMatrixOne.length; i++) {
            for (int j = 0; j < arrayMatrixOne[i].length; j++) {
                arrayMatrixOne[i][j] = randomMin + ((int) (Math.random() * (randomMax - randomMin + 1)));
            }
        }

        System.out.println();
        for (int i = 0; i < arrayMatrixOne.length; i++) {
            for (int j = 0; j < arrayMatrixOne[i].length; j++) {

                System.out.print(arrayMatrixOne[i][j] + " ");
            }

            System.out.println();
        }

        Matrix(arrayMatrixOne);
        System.out.println();
        System.out.println("ArrayLine!");
        int[] arrayLine = new int[5];
        for (int i = 0; i < arrayLine.length; i++) {
            arrayLine[i] = randomMin + ((int) (Math.random() * (randomMax - randomMin + 1)));
            System.out.print(arrayLine[i] + " ");
        }
        System.out.println();
        System.out.println("Math average : " + arrayMath(arrayLine));

    }

    public static double arrayMath(int[] arrayTwo) {
        if (arrayTwo == null) return -1;
        if (arrayTwo.length == 0) return 0;
        double arrayMathSum = 0;
        for (int i = 0; i < arrayTwo.length; i++) {
            arrayMathSum += arrayTwo[i];
        }

        double MathSum = arrayMathSum / arrayTwo.length;
        return MathSum;

    }

    public static int arrayBox(int[][] arrayThree) {
        if (arrayThree == null) return -2;
        if (arrayThree.length == 0) return -1;
        int arraySize = arrayThree.length;
        for (int i = 0; i < arrayThree.length; i++) {
            if (arraySize != arrayThree[i].length)
                return 0;
        }
        return 1;
    }

    private static void Matrix(int[][] arrayFour) {
        if (arrayBox(arrayFour) == 1) {
            System.out.println("The matrix is square!");
        } else if (arrayBox(arrayFour) == 0) {
            System.out.println("The matrix is not square!");
        }
    }
}
