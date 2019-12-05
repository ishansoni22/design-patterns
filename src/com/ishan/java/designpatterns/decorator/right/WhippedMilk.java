package com.ishan.java.designpatterns.decorator.right;

public class WhippedMilk extends CondimentDecorator {

  public WhippedMilk(Beverage beverage) {
    this.beverage = beverage;
  }

  @Override
  public String getDescription() {
    return this.beverage.getDescription() + ", Whip";
  }

  @Override
  public double cost() {
    return 0.06 + this.beverage.cost();
  }

}
