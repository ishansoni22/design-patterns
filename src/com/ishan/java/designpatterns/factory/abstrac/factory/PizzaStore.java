package com.ishan.java.designpatterns.factory.abstrac.factory;

/**
 * Lets say you have a pizza store
 */
public abstract class PizzaStore {

  Pizza orderPizza(String style) {
    Pizza pizza = null;

    //-----Let the subclasses decide
    pizza = createPizza(style);

    //-----Code that stays the same is still here
    pizza.prepare();;
    pizza.bake();;
    pizza.cut();
    pizza.box();

    return pizza;
  }

  /**
   * This is the factory method
   * The subclasses get to decide the actual product here
   *
   */
  protected abstract Pizza createPizza(String style);

}
