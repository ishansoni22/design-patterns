package com.ishan.java.designpatterns.decorator.wrong2;

// New condiments will force us to add new instance variables in the Beverage class and also change the constructor of every class
// We make have new beverages and some of these beverages like iced tea may not have condiments - they will still inherit the mocha, whippedMilk instance variables. Incorrect Inheritance
// How would you model a double mocha?
public class Espresso extends Beverage {

  public Espresso(boolean mocha, boolean whippedMilk) {
    this.description = "Espresso";
    this.mocha = mocha;
    this.whippedMilk = whippedMilk;
  }

  @Override
  public double cost() {
    return 0.99 + super.cost();
  }

}
