package com.ishan.java.designpatterns.decorator.wrong1;

// Class explosion!
// Maintenance nightmare
// What happens when a new condiment is added. You have to make so many new classes
// What happens when the price of a condiment changes. You have to make changes in so many classes
public class EspressoWithMochaAndWhippedMilk extends Beverage {

  public EspressoWithMochaAndWhippedMilk() {
    this.description = "Espresso, mocha, whipped milk";
  }

  @Override
  public double cost() {
    return 1.15;
  }

}
