package com.ishan.java.designpatterns.observer.right;

import com.ishan.java.designpatterns.observer.wrong2.Display;
import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplay implements Observer, Display {

  public CurrentConditionsDisplay(Observable o) {
    o.addObserver(this);
  }

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
  public void update(Observable o, Object arg) {
    // PULL
    if(o instanceof WeatherData) {
      WeatherData weatherData = (WeatherData) o;
      this.temperature = weatherData.getTemperature();
      this.humidity = weatherData.getHumidity();
      this.pressure = weatherData.getPressure();
    }
    display();
  }

}
