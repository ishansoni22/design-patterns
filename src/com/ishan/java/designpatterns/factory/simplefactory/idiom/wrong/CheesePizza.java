package com.ishan.java.designpatterns.factory.simplefactory.idiom.wrong;

public class CheesePizza implements Pizza {

  @Override
  public void prepare() {
    System.out.println("Prepare Cheese Pizza");
  }

  @Override
  public void bake() {
    System.out.println("Bake Cheese Pizza");
  }

  @Override
  public void cut() {
    System.out.println("Cut Cheese Pizza");
  }

  @Override
  public void box() {
    System.out.println("Box Cheese Pizza");
  }

}
