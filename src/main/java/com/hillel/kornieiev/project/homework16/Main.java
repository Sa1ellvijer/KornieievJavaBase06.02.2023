package com.hillel.kornieiev.project.homework16;

public class Main {

    public static void main(String[] args) {

        Androids android = new Androids();

        System.out.println("Android loading!...");
        android.linuxOS("ver. 17.5");
        android.call("+010-011-11-01");
        android.sms("Hello Google");
        android.internet("Google.com");

        System.out.println();

        iPhones iOS = new iPhones();

        System.out.println("iOS loading!...");
        iOS.call("+010-011-11-01");
        iOS.sms("Hello Google :)");
        iOS.internet("Apple.com");

    }

}
