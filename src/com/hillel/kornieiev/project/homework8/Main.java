package com.hillel.kornieiev.project.homework8;

public class Main {


    public static void main(String[] args) {

        int Counter = 0;
        int Shuttle;
        for (Shuttle = 1; Shuttle < 999; Shuttle++) {

            if (Shuttle / 10 == 4 || Shuttle % 10 == 4 || Shuttle / 10 % 10 == 4 || Shuttle / 100 == 4 ||
                    Shuttle / 10 == 9 || Shuttle % 10 == 9 || Shuttle / 10 % 10 == 9 || Shuttle / 100 == 9) {
                continue;

            }

            System.out.println("Shuttle :" + Shuttle);
            Counter++;
            if (Counter == 100) {
                System.out.println();
                System.out.println("Shuttle count : "+ Counter);
                break;
            }
        }

    }

}
