package com.driver;

public class Main {
  public static void main(String[] args) {
    Pizza vegPizza = new Pizza(300);
    vegPizza = addExtraCheese(vegPizza, 80);
    vegPizza = addExtraToppings(vegPizza, 70);
    vegPizza = addPaperBag(vegPizza, 20);
    int totalPrice1 = vegPizza.calculateTotalPrice();
    System.out.println("Example 1 Total Price: " + totalPrice1);

    // Example 2: Non-veg Deluxe Pizza
    Pizza nonVegDeluxePizza = new DeluxePizza(400, 80, 120);
    int totalPrice2 = nonVegDeluxePizza.calculateTotalPrice();
    System.out.println("Example 2 Total Price: " + totalPrice2);
  }

  public static Pizza addExtraCheese(Pizza pizza, int extraCheesePrice) {
    return new Pizza(pizza.basePrice + extraCheesePrice);
  }

  public static Pizza addExtraToppings(Pizza pizza, int extraToppingsPrice) {
    return new Pizza(pizza.basePrice + extraToppingsPrice);
  }

  public static Pizza addPaperBag(Pizza pizza, int paperBagPrice) {
    return new Pizza(pizza.basePrice + paperBagPrice);
  }
}