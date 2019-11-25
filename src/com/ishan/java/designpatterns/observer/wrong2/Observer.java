package com.ishan.java.designpatterns.observer.wrong2;

public interface Observer {

  /**
   * We still have not encapsulated the areas that change [temp, humidity, pressure]
   */
  void update(Float temperature, Float humidity, Float pressure);

}
