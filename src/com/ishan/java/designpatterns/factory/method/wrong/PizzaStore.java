package com.ishan.java.designpatterns.factory.method.wrong;

/**
 * Lets say you have a pizza store
 */
public class PizzaStore {

  /**
   * Use composition to change behaviour dynamically at runtime.
   * The createPizza method in our SimplePizzaFactory is not static. We can subclass it and provide an alternate implementation
   * at runtime if needed
   */
  private SimplePizzaFactory simplePizzaFactory;

  public PizzaStore(
      SimplePizzaFactory simplePizzaFactory) {
    this.simplePizzaFactory = simplePizzaFactory;
  }

  Pizza orderPizza(String style) {
    Pizza pizza = null;

    //-----We have encapsulated the code that varies into a separate object ("Factory") whose only concern is to create objects
    pizza = simplePizzaFactory.createPizza(style);

    //-----Code that stays the same is still here
    pizza.prepare();;
    pizza.bake();;
    pizza.cut();
    pizza.box();

    return pizza;
  }

}
