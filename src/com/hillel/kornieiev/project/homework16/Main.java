package com.hillel.kornieiev.project.homework16;

public class Main {

    public static void main(String[] args) {

        System.out.println("Android loading!...");
        Androids android = new Androids();

        android.call("+010-011-11-01");
        android.sms("Hello Google");
        android.internet("Google.com");

        System.out.println();

        System.out.println("iOS loading!...");
        iPhones iOS = new iPhones();

        iOS.call("+010-011-11-01");
        iOS.sms("Hello Google :)");
        iOS.internet("Apple.com");

    }

}
