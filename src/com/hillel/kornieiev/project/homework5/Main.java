package com.hillel.kornieiev.project.homework5;

public class Main {

    public static void main(String[] args) {

        // Dynasty Li

        int WarriorLi = 13;
        int ArcherLi = 24;
        int HorsemanLi = 46;
        int TotalPeopleLi = 860;

        // Dynasty Min

        int WarriorMin = 9;
        int ArcherMin = 35;
        int HorsemanMin = 12;
        double TotalPeopleMin = 860*1.5;

        System.out.println();
        System.out.println("Династія Лі, загальний показник атаки:");
        System.out.println((WarriorLi+ArcherLi+HorsemanLi)*TotalPeopleLi);
        System.out.println();
        System.out.println("Династія Мінь, загальний показник атаки:");
        System.out.println((WarriorMin + ArcherMin + HorsemanMin)*TotalPeopleMin);
    }
}
