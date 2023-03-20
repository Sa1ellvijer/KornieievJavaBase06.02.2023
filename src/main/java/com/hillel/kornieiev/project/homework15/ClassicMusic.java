package com.hillel.kornieiev.project.homework15;

public class ClassicMusic extends MusicStyles {

    private final String classicBand;

    public ClassicMusic(String classicBand) {
        this.classicBand = classicBand;
    }

    @Override
    void playMusic() {
        System.out.println("Playing Classic: " + classicBand);

    }
}