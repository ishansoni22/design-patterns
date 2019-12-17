package com.ishan.java.designpatterns.factory.method.right;

public class ChicagoPizzaStore extends PizzaStore {

  @Override
  protected Pizza createPizza(String style) {
    Pizza pizza = null;
    if("cheese".equals(style)) {
      pizza = new ChicagoCheesePizza();
    }
    return pizza;
  }

}
