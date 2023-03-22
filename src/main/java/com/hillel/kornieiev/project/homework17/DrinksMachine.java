package com.hillel.kornieiev.project.homework17;

public enum DrinksMachine {

    Coffee("Coffee :"),
    Tea("Tea :"),
    Lemonade("Lemonade :"),
    Mojito("Mojito :"),
    Mineral_Water("Mineral Water :"),
    Coca_Cola("Coca-Cola :");

    private final String type;

    DrinksMachine(String type) {
        this.type = type;
    }

    public String getType() {
        return type;

    }
}
