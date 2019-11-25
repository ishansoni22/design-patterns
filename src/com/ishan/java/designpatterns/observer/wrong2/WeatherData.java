package com.ishan.java.designpatterns.observer.wrong2;

import java.util.ArrayList;
import java.util.List;

/**
 * The WeatherData class knows how to pull weather conditions from actual physical weather stations
 * The getTemp, Humidity and Pressure methods somehow will get us the current conditions
 * Our task is to build 3 display devices [one for current conditions, one for weather stats and one for a forecast display
 * and these devices should get updated each time the weather object has a new measurement]
 * + APIs on top of this weather object
 */
public class WeatherData implements Subject {

  private Float temperature;
  private Float humidity;
  private Float pressure;
  List<Observer> observers = new ArrayList<>();

  // Mock the physical weather device
  public void setMeasurements(Float t, Float h, Float p) {
    this.temperature = t;
    this.humidity = h;
    this.pressure = p;
    measurementsChanged();
  }

  /**
   * This method is automatically called whenever the conditions change
   * TODO - Your code goes here [Our job is to plug in display devices]
   *
   */
  private void measurementsChanged() {
    notifyObservers();
    /**
     * What is wrong with this implementation?
     * - We have not encapsulated the part that changes [temp, humidity and pressure]
     */
  }

  @Override
  public void addObserver(Observer observer) {
    if(! observers.contains(observer)) {
      observers.add(observer);
    }
  }

  @Override
  public void removeObserver(Observer observer) {
    observers.remove(observer);
  }

  @Override
  public void notifyObservers() {
    observers.forEach(observer -> {
      observer.update(getTemperature(), getHumidity(), getPressure());
    });
  }

  public Float getTemperature() {return temperature;}
  public Float getHumidity() {return humidity;}
  public Float getPressure() {return pressure;}

}
