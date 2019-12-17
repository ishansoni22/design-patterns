package com.ishan.java.designpatterns.factory.method.wrong;

public class NycPizzaFactory extends SimplePizzaFactory {

  /**
   * We can override this and return NYC types(regional types) of pizzas.
   *
   */
  @Override
  Pizza createPizza(String style) {
    Pizza pizza = null;
    if ("cheese".equals(style)) {
      pizza = new NycCheesePizza();
    }
    return pizza;
  }

}
