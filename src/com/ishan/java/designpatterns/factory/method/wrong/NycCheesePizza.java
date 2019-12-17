package com.ishan.java.designpatterns.factory.method.wrong;

public class NycCheesePizza implements Pizza {

  @Override
  public void prepare() {
    System.out.println("Prepare NYC Cheese Pizza");
  }

  @Override
  public void bake() {
    System.out.println("Bake NYC Cheese Pizza");
  }

  @Override
  public void cut() {
    System.out.println("Cut NYC Cheese Pizza");
  }

  @Override
  public void box() {
    System.out.println("Box NYC Cheese Pizza");
  }

}
