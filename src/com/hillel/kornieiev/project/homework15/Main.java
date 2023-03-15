package com.hillel.kornieiev.project.homework15;

public class Main {

    public static void main(String[] args) {

        System.out.println();
        MusicStyles[] music = {
                new ClassicMusic("Mozart"),
                new PopMusic("Sia"),
                new RockMusic("Powerwolf")
        };

        for (MusicStyles band : music) {
            band.playMusic();
        }
    }
}
