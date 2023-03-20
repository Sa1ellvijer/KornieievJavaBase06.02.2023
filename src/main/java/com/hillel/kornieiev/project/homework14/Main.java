package com.hillel.kornieiev.project.homework14;

public class Main {

    public static void main(String[] args) {

        FitnessUser user1 = new FitnessUser("Jackie","Chan",7,4,1954,
                "Jackie@mail.com","+86-111-222-33-44",80,77,19119);

        FitnessUser user2 = new FitnessUser("Arnold","HastaLaVista",30,7,1947,
                "Arnold@mail.com","+01-999-888-77-66",95,80,14645);

        FitnessUser user3 = new FitnessUser("Bruce","Wayne",27,11,1940,
                "Bruce@mail.com","+86-110-220-44-55",74,66,17565);

        System.out.println();
        System.out.println("Old user data!");
        System.out.println();
        user1.printAccountInfo();
        System.out.println();
        user2.printAccountInfo();
        System.out.println();
        user3.printAccountInfo();

        user2.setSurName("Schwarzenegger");
        user2.setWeight(92);
        user2.setPressure(78);
        user2.setStepCount(24645);

        user3.setSurName("Lee");
        user3.setWeight(72);
        user3.setPressure(65);
        user3.setStepCount(27565);

        System.out.println();
        System.out.println("Updated user data!");
        System.out.println();
        user1.printAccountInfo();
        System.out.println();
        user2.printAccountInfo();
        System.out.println();
        user3.printAccountInfo();

    }
}
