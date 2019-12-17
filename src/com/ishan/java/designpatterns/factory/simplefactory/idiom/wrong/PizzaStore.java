package com.ishan.java.designpatterns.factory.simplefactory.idiom.wrong;

/**
 * Lets say you have a pizza store
 */
public class PizzaStore {

  /**
   * What if you have to add new pizzas or remove some?
   * This code is not closed for modification (Remember the open closed principle)
   *
   */
  Pizza orderPizza(String style) {
    Pizza pizza = null;

    //-----Code that varies
    if ("cheese".equals(style)) {
      pizza = new CheesePizza();
    } else if ("greek".equals(style)) {
      pizza = new GreekPizza();
    }

    //-----Code that stays the same
    pizza.prepare();;
    pizza.bake();;
    pizza.cut();
    pizza.box();

    return pizza;
  }

}
