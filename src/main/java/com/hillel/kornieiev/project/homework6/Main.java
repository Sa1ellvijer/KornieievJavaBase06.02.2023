package com.hillel.kornieiev.project.homework6;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // First team.

        System.out.println("Введіть назву команди!");
        String teamOneName = "1";
        if (scanner.hasNext()) {
            teamOneName = scanner.next();
            System.out.println(teamOneName + " Назва прийнята!");
        } else {
            System.out.println("Невірна назва!");
            System.exit(0);
        }

        System.out.println("Введіть кількість фрагів першого гравця!");
        int teamOnePlayer1Kills = 1;
        if (scanner.hasNextInt()) {
            teamOnePlayer1Kills = scanner.nextInt();
            System.out.println("Зареєстровано " + teamOnePlayer1Kills);
        } else {
            System.out.println("Помилка, перезавантаження!");
            System.exit(0);
        }

        System.out.println("Введіть кількість фрагів другого гравця!");
        int teamOnePlayer2Kills = 1;
        if (scanner.hasNextInt()) {
            teamOnePlayer2Kills = scanner.nextInt();
            System.out.println("Зареєстровано " + teamOnePlayer2Kills);
        } else {
            System.out.println("Помилка, перезавантаження!");
            System.exit(0);
        }

        System.out.println("Введіть кількість фрагів третього гравця!");
        int teamOnePlayer3Kills = 1;
        if (scanner.hasNextInt()) {
            teamOnePlayer3Kills = scanner.nextInt();
            System.out.println("Зареєстровано " + teamOnePlayer3Kills);
        } else {
            System.out.println("Помилка, перезавантаження!");
            System.exit(0);
        }

        System.out.println("Введіть кількість фрагів четвертого гравця!");
        int teamOnePlayer4Kills = 1;
        if (scanner.hasNextInt()) {
            teamOnePlayer4Kills = scanner.nextInt();
            System.out.println("Зареєстровано " + teamOnePlayer4Kills);
        } else {
            System.out.println("Помилка, перезавантаження!");
            System.exit(0);
        }

        System.out.println("Введіть кількість фрагів п’ятого гравця!");
        int teamOnePlayer5Kills = 1;
        if (scanner.hasNextInt()) {
            teamOnePlayer5Kills = scanner.nextInt();
            System.out.println("Зареєстровано " + teamOnePlayer5Kills);
        } else {
            System.out.println("Помилка, перезавантаження!");
            System.exit(0);
        }

        System.out.println();
        int totalNumberOfKillsTeamOne = teamOnePlayer1Kills + teamOnePlayer2Kills + teamOnePlayer3Kills +
                teamOnePlayer4Kills + teamOnePlayer5Kills;
        System.out.println(totalNumberOfKillsTeamOne + " - Всього фрагів на команду " + teamOneName);

        // Second team.

        System.out.println();
        System.out.println("Введіть назву команди!");
        String teamTwoName = "1";
        if (scanner.hasNext()) {
            teamTwoName = scanner.next();
            System.out.println(teamTwoName + " Назва прийнята!");
        } else {
            System.out.println("Невірна назва!");
            System.exit(0);
        }

        System.out.println("Введіть кількість фрагів першого гравця!");
        int teamTwoPlayer1Kills = 1;
        if (scanner.hasNextInt()) {
            teamTwoPlayer1Kills = scanner.nextInt();
            System.out.println("Зареєстровано " + teamTwoPlayer1Kills);
        } else {
            System.out.println("Помилка, перезавантаження!");
            System.exit(0);
        }

        System.out.println("Введіть кількість фрагів другого гравця!");
        int teamTwoPlayer2Kills = 1;
        if (scanner.hasNextInt()) {
            teamTwoPlayer2Kills = scanner.nextInt();
            System.out.println("Зареєстровано " + teamTwoPlayer2Kills);
        } else {
            System.out.println("Помилка, перезавантаження!");
            System.exit(0);
        }

        System.out.println("Введіть кількість фрагів третього гравця!");
        int teamTwoPlayer3Kills = 1;
        if (scanner.hasNextInt()) {
            teamTwoPlayer3Kills = scanner.nextInt();
            System.out.println("Зареєстровано " + teamTwoPlayer3Kills);
        } else {
            System.out.println("Помилка, перезавантаження!");
            System.exit(0);
        }

        System.out.println("Введіть кількість фрагів четвертого гравця!");
        int teamTwoPlayer4Kills = 1;
        if (scanner.hasNextInt()) {
            teamTwoPlayer4Kills = scanner.nextInt();
            System.out.println("Зареєстровано " + teamTwoPlayer4Kills);
        } else {
            System.out.println("Помилка, перезавантаження!");
            System.exit(0);
        }

        System.out.println("Введіть кількість фрагів п’ятого гравця!");
        int teamTwoPlayer5Kills = 1;
        if (scanner.hasNextInt()) {
            teamTwoPlayer5Kills = scanner.nextInt();
            System.out.println("Зареєстровано " + teamTwoPlayer5Kills);
        } else {
            System.out.println("Помилка, перезавантаження!");
            System.exit(0);
        }

        System.out.println();
        int totalNumberOfKillsTeamTwo = teamTwoPlayer1Kills + teamTwoPlayer2Kills + teamTwoPlayer3Kills +
                teamTwoPlayer4Kills + teamTwoPlayer5Kills;
        System.out.println(totalNumberOfKillsTeamTwo + " - Всього фрагів на команду " + teamTwoName);

        int midAriTeamOne = (totalNumberOfKillsTeamOne/5);
        int midAriTeamTwo = (totalNumberOfKillsTeamTwo/5);
        System.out.println();
        System.out.println("Середня кількість фрагів " + teamOneName + " - " + midAriTeamOne);
        System.out.println("Середня кількість фрагів " + teamTwoName + " - " + midAriTeamTwo);

        // Result.

        System.out.println();
        System.out.println("Підсумок матчу!");
        if (totalNumberOfKillsTeamOne == totalNumberOfKillsTeamTwo) {
            System.out.println("Нічия - Команди набрали однакову кількість очок.");
            System.out.print(teamOneName + " :" + totalNumberOfKillsTeamOne + " / "
                    + teamTwoName + " :" + totalNumberOfKillsTeamTwo + " очок.");

        } else if (totalNumberOfKillsTeamOne < totalNumberOfKillsTeamTwo) {
            System.out.println("Перемогла команда " + teamTwoName + " набравши "
                    + totalNumberOfKillsTeamTwo + " очок.");

        } else {
            System.out.println("Перемогла команда " + teamOneName + " набравши "
                    + totalNumberOfKillsTeamOne + " очок.");
        }
    }
}
