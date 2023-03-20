package com.hillel.kornieiev.project.homework15;

public class RockMusic extends MusicStyles {

    private final String rockBand;

    public RockMusic(String rockBand) {
        this.rockBand = rockBand;
    }

    @Override
    void playMusic () {
        System.out.println("Playing Rock: " + rockBand);

    }
}

