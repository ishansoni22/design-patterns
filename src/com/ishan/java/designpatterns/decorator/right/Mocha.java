package com.ishan.java.designpatterns.decorator.right;

public class Mocha extends CondimentDecorator {

  public Mocha(Beverage beverage) {
    this.beverage = beverage;
  }

  @Override
  public String getDescription() {
    return this.beverage.getDescription() + ", Mocha";
  }

  @Override
  public double cost() {
    return 0.1 + beverage.cost();
  }

}
