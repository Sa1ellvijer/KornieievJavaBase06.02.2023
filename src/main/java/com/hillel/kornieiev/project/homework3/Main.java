package com.hillel.kornieiev.project.homework3;

public class Main {

    public static void main(String[] args) {

        byte SideLength = 10;
        byte SideWidth = 5;
        byte SideHeight = 5;

        int volume = SideLength*SideWidth*SideHeight;
        int lenght = SideLength*4;

        System.out.println();
        System.out.println("Об'єм паралелепіпеда = " + volume);
        System.out.println("Сума довжин паралелепіпеда = " + lenght);
    }
}
