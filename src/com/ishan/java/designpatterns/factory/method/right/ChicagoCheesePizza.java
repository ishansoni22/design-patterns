package com.ishan.java.designpatterns.factory.method.right;

public class ChicagoCheesePizza implements Pizza {

  @Override
  public void prepare() {
    System.out.println("Prepare Chicago Cheese Pizza");
  }

  @Override
  public void bake() {
    System.out.println("Bake Chicago Cheese Pizza");
  }

  @Override
  public void cut() {
    System.out.println("Cut Chicago Cheese Pizza");
  }

  @Override
  public void box() {
    System.out.println("Box Chicago Cheese Pizza");
  }

}
