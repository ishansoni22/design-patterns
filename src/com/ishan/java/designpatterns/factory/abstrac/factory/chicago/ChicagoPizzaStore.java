package com.ishan.java.designpatterns.factory.abstrac.factory.chicago;

import com.ishan.java.designpatterns.factory.abstrac.factory.Cheese;
import com.ishan.java.designpatterns.factory.abstrac.factory.Pizza;
import com.ishan.java.designpatterns.factory.abstrac.factory.PizzaIngredientsFactory;
import com.ishan.java.designpatterns.factory.abstrac.factory.PizzaStore;
import com.ishan.java.designpatterns.factory.abstrac.factory.Sauce;

public class ChicagoPizzaStore extends PizzaStore {

  @Override
  protected Pizza createPizza(String style) {
    Pizza pizza = null;
    if("cheese".equals(style)) {
      pizza = new ChicagoCheesePizza(new PizzaIngredientsFactory() {
        @Override
        public Sauce createSauce() {
          return new ChicagoSauce();
        }

        @Override
        public Cheese createCheese() {
          return new MozzarellaCheese();
        }
      });
    }
    return pizza;
  }

}
