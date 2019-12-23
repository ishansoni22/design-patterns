package com.ishan.java.designpatterns.factory.abstrac.factory.nyc;

import com.ishan.java.designpatterns.factory.abstrac.factory.Pizza;
import com.ishan.java.designpatterns.factory.abstrac.factory.PizzaIngredientsFactory;

public class NycCheesePizza implements Pizza {
  private PizzaIngredientsFactory pizzaIngredientsFactory;

  public NycCheesePizza(PizzaIngredientsFactory pizzaIngredientsFactory) {
    this.pizzaIngredientsFactory = pizzaIngredientsFactory;
  }

  @Override
  public void prepare() {
    System.out.printf("Prepare NYC Cheese Pizza. Sauce : '%s', Cheese : '%s'%n" ,
        this.pizzaIngredientsFactory.createSauce().getName(),
        this.pizzaIngredientsFactory.createCheese().getName()
    );
  }

  @Override
  public void bake() {
    System.out.println("Bake NYC Cheese Pizza");
  }

  @Override
  public void cut() {
    System.out.println("Cut NYC Cheese Pizza");
  }

  @Override
  public void box() {
    System.out.println("Box NYC Cheese Pizza");
  }

}
