package com.ishan.java.designpatterns.factory.abstrac.factory.chicago;

import com.ishan.java.designpatterns.factory.abstrac.factory.Pizza;
import com.ishan.java.designpatterns.factory.abstrac.factory.PizzaIngredientsFactory;

public class ChicagoCheesePizza implements Pizza {
  private PizzaIngredientsFactory pizzaIngredientsFactory;

  public ChicagoCheesePizza(PizzaIngredientsFactory pizzaIngredientsFactory) {
    this.pizzaIngredientsFactory = pizzaIngredientsFactory;
  }

  @Override
  public void prepare() {
    System.out.printf("Prepare Chicago Cheese Pizza. Sauce : '%s', Cheese : '%s'%n",
        pizzaIngredientsFactory.createSauce().getName(),
        pizzaIngredientsFactory.createCheese().getName()
    );
  }

  @Override
  public void bake() {
    System.out.println("Bake Chicago Cheese Pizza");
  }

  @Override
  public void cut() {
    System.out.println("Cut Chicago Cheese Pizza");
  }

  @Override
  public void box() {
    System.out.println("Box Chicago Cheese Pizza");
  }

}
