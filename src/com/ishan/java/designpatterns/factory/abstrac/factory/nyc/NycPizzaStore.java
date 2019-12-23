package com.ishan.java.designpatterns.factory.abstrac.factory.nyc;

import com.ishan.java.designpatterns.factory.abstrac.factory.Cheese;
import com.ishan.java.designpatterns.factory.abstrac.factory.Pizza;
import com.ishan.java.designpatterns.factory.abstrac.factory.PizzaIngredientsFactory;
import com.ishan.java.designpatterns.factory.abstrac.factory.PizzaStore;
import com.ishan.java.designpatterns.factory.abstrac.factory.Sauce;

public class NycPizzaStore extends PizzaStore {

  @Override
  protected Pizza createPizza(String style) {
    Pizza pizza = null;
    if("cheese".equals(style)) {
      pizza = new NycCheesePizza(new PizzaIngredientsFactory() {
        @Override
        public Sauce createSauce() {
          return new NycSauce();
        }

        @Override
        public Cheese createCheese() {
          return new ReggianoCheese();
        }
      });
    }
    return pizza;
  }

}
