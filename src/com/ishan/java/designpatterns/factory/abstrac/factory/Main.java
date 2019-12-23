package com.ishan.java.designpatterns.factory.abstrac.factory;

import com.ishan.java.designpatterns.factory.abstrac.factory.chicago.ChicagoPizzaStore;
import com.ishan.java.designpatterns.factory.abstrac.factory.nyc.NycPizzaStore;

public class Main {

  public static void main(String[] args) {

    PizzaStore nycStore = new NycPizzaStore();
    nycStore.orderPizza("cheese");

    PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
    chicagoPizzaStore.orderPizza("cheese");
  }

}
