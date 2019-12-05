package com.ishan.java.designpatterns.decorator.wrong1;

// All beverages extend this class and provide implementation of the cost method!
// In addition to your coffee, you can ask for condiments like whipped milk, soy, mocha etc
// How to you model that?
abstract public class Beverage {

  protected String description = "Unknown Beverage";

  public String getDescription() {
    return description;
  }

  public abstract double cost();

}
