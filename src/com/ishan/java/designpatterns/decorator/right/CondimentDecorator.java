package com.ishan.java.designpatterns.decorator.right;

public abstract class CondimentDecorator extends Beverage {
  protected Beverage beverage;

  public abstract String getDescription();
}
