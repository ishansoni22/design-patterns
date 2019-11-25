package com.ishan.java.designpatterns.observer.wrong2;

public class CurrentConditionsDisplay implements Observer, Display {

  private Float temperature;
  private Float humidity;
  private Float pressure;

  @Override
  public void display() {
    System.out.println("Current conditions - Temperature : " +
        this.temperature + " ,Humidity : " +
        this.humidity + " ,Pressure : " +
        this.pressure);
  }

  @Override
  public void update(Float temperature, Float humidity, Float pressure) {
    this.temperature = temperature;
    this.humidity = humidity;
    this.pressure = pressure;
    /**
     * Is this the right place to call display. We will resolve this once we come to MVC pattern
     */
    display();
  }

}
