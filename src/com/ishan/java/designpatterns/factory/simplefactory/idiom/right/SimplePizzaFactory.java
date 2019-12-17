package com.ishan.java.designpatterns.factory.simplefactory.idiom.right;

/**
 * Encapsulate object creation and move it to a "factory"
 * "Factory" handles details of object creation.
 * This is the Simple Factory Design.
 * What are the advantages of this?
 * - SimplePizzaFactory can have many clients. Single point of change
 * - No concrete implementation details in our client code. They always code to Pizza
 * - static(No need to create an object but then you can't subclass it and change its behaviour) vs non-static(Need to create object
 * but can subclass and change behaviour of this method if needed) createPizza?
 */
class SimplePizzaFactory {

  Pizza createPizza(String style) {
    Pizza pizza = null;
    if ("cheese".equals(style)) {
      pizza = new CheesePizza();
    } else if ("greek".equals(style)) {
      pizza = new GreekPizza();
    }
    return pizza;
  }

}
