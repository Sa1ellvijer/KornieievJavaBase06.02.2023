package com.hillel.kornieiev.project.homework2;

public class Main {

    public static void main(String[] args) {

        char ch1 = '\u00b0' ;
        String str1 = "\u0027";
        char ch3 = '\u0022' ;

        byte CordNorth1 =40;
        byte CordNorth2 =41;
        double CordNorth3 =21.0;

        byte CordWest1 =74;
        byte CordWest2 =2;
        double CordWest3 =40.0;
        String str2 = "0";

        System.out.println();
        System.out.println("Statue of Liberty");
        System.out.println();
        System.out.println("DMS Lat: "+CordNorth1+ch1+""+CordNorth2+str1+""+CordNorth3+ch3+"N ");
        System.out.println("DMS Long: "+CordWest1+ch1+""+str2+""+CordWest2+str1+""+CordWest3+ch3+"W ");
    }
}
