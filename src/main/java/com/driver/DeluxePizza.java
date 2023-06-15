package com.driver;

public class DeluxePizza extends Pizza {
    private int extraCheesePrice;
    private int extraToppingsPrice;

    public DeluxePizza(int basePrice, int extraCheesePrice, int extraToppingsPrice) {
        super(basePrice);
        this.extraCheesePrice = extraCheesePrice;
        this.extraToppingsPrice = extraToppingsPrice;
    }

    @Override
    public int calculateTotalPrice() {
        return basePrice + extraCheesePrice + extraToppingsPrice;
    }
}
