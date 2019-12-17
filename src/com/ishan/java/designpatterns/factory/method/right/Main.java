package com.ishan.java.designpatterns.factory.method.right;

public class Main {

  public static void main(String[] args) {

    PizzaStore nycStore = new NycPizzaStore();
    nycStore.orderPizza("cheese");

    PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
    chicagoPizzaStore.orderPizza("cheese");
  }

}
