package com.ishan.java.designpatterns.decorator.wrong1;

public class Espresso extends Beverage {

  public Espresso() {
    this.description = "Espresso";
  }

  @Override
  public double cost() {
    return 0.99;
  }

}
