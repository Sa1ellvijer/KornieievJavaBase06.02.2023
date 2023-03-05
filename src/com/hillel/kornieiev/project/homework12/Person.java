package com.hillel.kornieiev.project.homework12;

public class Person {
    public static void main(String[] args) {
        System.out.println();
        String[][] person = {
                {"Ichiban", "Jackie", "Geralt"},
                {"Kasuga", "Chan", "of Rivia"},
                {"Yokohama","Shanghai","Rivia"},
                {"+8123456789", "+8698765432", "+3803459876"}
        };

        for (int j = 0; j < person.length - 1; j++) {
            System.out.println(personInfo(person[0][j], person[1][j], person[2][j], person[3][j]));
        }
    }
        static String personInfo(String name, String surname, String city, String phone) {

        String info = "Зателефонувати громадянинові " + name + " " + surname +
                " з міста " + city + " можна за номером - " + phone + ".";

        return info;
    }
}
