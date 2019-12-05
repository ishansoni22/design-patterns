package com.ishan.java.designpatterns.decorator.wrong2;

// All beverages extend this class and provide implementation of the cost method!
// In addition to your coffee, you can ask for extras like whipped milk, soy, mocha etc
// How to you model that?
abstract public class Beverage {

  protected String description = "Unknown Beverage";

  public String getDescription() {
    return description;
  }

  // Add instance variables to keep track of what condiments have been added
  protected boolean mocha;

  protected boolean whippedMilk;

  public double cost() {
    double cost = 0d;
    if(mocha) {
      cost+=.1;
    }
    if(whippedMilk) {
      cost+=.06;
    }
    return cost;
  }

}
