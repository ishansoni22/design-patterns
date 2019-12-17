package com.ishan.java.designpatterns.factory.method.wrong;

public class Main {

  public static void main(String[] args) {

    PizzaStore nycStore = new PizzaStore(new NycPizzaFactory());
    nycStore.orderPizza("cheese");

  }

}
