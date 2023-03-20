package com.hillel.kornieiev.project.homework14;

public class FitnessUser {

    int year = 2020;
    private final String firstName;
    private String surName;
    private final int birthDay;
    private final int birthMonth;
    private final int birthYear;
    private final String email;
    private final String phoneNum;
    private int weight;
    private int pressure;
    private int stepCount;
    private final int age;

    public FitnessUser(String firstName, String surName, int birthDay, int birthMonth, int birthYear,
                       String email, String phoneNum, int weight, int pressure, int stepCount) {

        this.firstName = firstName;
        this.surName = surName;
        this.birthDay = birthDay;
        this.birthMonth = birthMonth;
        this.birthYear = birthYear;
        this.email = email;
        this.phoneNum = phoneNum;
        this.weight = weight;
        this.pressure = pressure;
        this.stepCount = stepCount;
        this.age = year - this.birthYear;

    }

    public String getFirstName() {
        return firstName;
    }

    public String getSurName() {
        return surName;
    }
    public  void setSurName(String surName){
        this.surName = surName;
    }

    public int getBirthDay() {
        return birthDay;
    }

    public int getBirthMonth() {
        return birthMonth;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getPressure() {
        return pressure;
    }
    public void setPressure(int pressure) {
        this.pressure = pressure;
    }

    public int getStepCount() {
        return stepCount;
    }
    public void setStepCount(int stepCount) {
        this.stepCount = stepCount;
    }

    public void printAccountInfo() {
        System.out.println("Name: " + firstName + " " + surName);
        System.out.println("Email: " + email);
        System.out.println("Phone number: " + phoneNum);
        System.out.println("Age: " + age);
        System.out.println("Weight: " + weight);
        System.out.println("Pressure: " + pressure);
        System.out.println("Steps per day: " + stepCount);
    }
}
