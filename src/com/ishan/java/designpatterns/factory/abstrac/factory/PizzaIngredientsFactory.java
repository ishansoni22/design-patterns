package com.ishan.java.designpatterns.factory.abstrac.factory;

public interface PizzaIngredientsFactory {
  Sauce createSauce();
  Cheese createCheese();

}
