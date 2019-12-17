package com.ishan.java.designpatterns.factory.method.right;

public class NycPizzaStore extends PizzaStore {

  @Override
  protected Pizza createPizza(String style) {
    Pizza pizza = null;
    if("cheese".equals(style)) {
      pizza = new NycCheesePizza();
    }
    return pizza;
  }

}
