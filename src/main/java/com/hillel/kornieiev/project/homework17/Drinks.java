package com.hillel.kornieiev.project.homework17;

public class Drinks {

    private static double total = 0;

    private static final double coffeePrice = 3.50;
    private static final double teaPrice = 2.75;
    private static final double lemonadePrice = 5.50;
    private static final double mojitoPrice = 17;
    private static final double mineralWaterPrice = 4.75;
    private static final double coca_ColaPrice = 8;

    public Drinks(DrinksMachine userOrder) {
        counter++;
        drinkMaker(userOrder);
    }

    private static int counter = 0;
    public static int getCounter() {
        return counter;
    }

    public static double getTotal() {
        return total;
    }

    public static double getCoffeePrice() {
        return coffeePrice;
    }

    public static double getTeaPrice() {
        return teaPrice;
    }

    public static double getLemonadePrice() {
        return lemonadePrice;
    }

    public static double getMojitoPrice() {
        return mojitoPrice;
    }

    public static double getMineralWaterPrice() {
        return mineralWaterPrice;
    }

    public static double getCocaColaPrice() {
        return coca_ColaPrice;
    }

    public void drinkMaker(DrinksMachine userOrder) {
        switch (userOrder) {

            case Coffee: {
                coffeeOrder(userOrder);
                total += coffeePrice;
                break;
            }
            case Tea: {
                teaOrder(userOrder);
                total += teaPrice;
                break;
            }
            case Lemonade: {
                lemonadeOrder(userOrder);
                total += lemonadePrice;
                break;
            }
            case Mojito: {
                mojitoOrder(userOrder);
                total += mojitoPrice;
                break;
            }
            case Mineral_Water: {
                mineralWaterOrder(userOrder);
                total += mineralWaterPrice;
                break;
            }
            case Coca_Cola: {
                coca_colaOrder(userOrder);
                total += coca_ColaPrice;
                break;
            }
        }
    }

    static void drinkPrice() {

        System.out.println();
        System.out.println("Vending Machine");
        System.out.println();
        System.out.println(DrinksMachine.Coffee.getType() + coffeePrice + "$");
        System.out.println(DrinksMachine.Tea.getType() + teaPrice + "$");
        System.out.println(DrinksMachine.Lemonade.getType() + lemonadePrice + "$");
        System.out.println(DrinksMachine.Mojito.getType() + mojitoPrice + "$");
        System.out.println(DrinksMachine.Mineral_Water.getType() + mineralWaterPrice + "$");
        System.out.println(DrinksMachine.Coca_Cola.getType() + coca_ColaPrice + "$");
        System.out.println();
    }

    void coffeeOrder(DrinksMachine userOrder) {
        System.out.println("Making Your Order :" + userOrder.getType());
    }
    void teaOrder(DrinksMachine userOrder) {
        System.out.println("Making Your Order :" + userOrder.getType());
    }
    void lemonadeOrder(DrinksMachine userOrder) {
        System.out.println("Making Your Order :" + userOrder.getType());
    }
    void mojitoOrder(DrinksMachine userOrder) {
        System.out.println("Making Your Order :" + userOrder.getType());
    }
    void mineralWaterOrder(DrinksMachine userOrder) {
        System.out.println("Making Your Order :" + userOrder.getType());
    }
    void coca_colaOrder(DrinksMachine userOrder) {
        System.out.println("Making Your Order :" + userOrder.getType());
    }
}
