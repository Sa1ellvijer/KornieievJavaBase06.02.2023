package com.hillel.kornieiev.project.homework15;

public class PopMusic extends MusicStyles {

    private final String popBand;

    public PopMusic(String popBand) {
        this.popBand = popBand;
    }

    @Override
    void playMusic() {
        System.out.println("Playing Pop: " + popBand);

    }
}
