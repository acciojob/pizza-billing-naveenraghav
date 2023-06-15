package com.driver;

public class Pizza {
    protected int basePrice;

    public Pizza(int basePrice) {
        this.basePrice = basePrice;
    }

    public int calculateTotalPrice() {
        return basePrice;
    }
}
