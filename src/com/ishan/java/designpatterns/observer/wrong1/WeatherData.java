package com.ishan.java.designpatterns.observer.wrong1;

/**
 * The WeatherData class knows how to pull weather conditions from actual physical weather stations
 * The getTemp, Humidity and Pressure methods somehow will get us the current conditions
 * Our task is to build 3 display devices [one for current conditions, one for weather stats and one for a forecast display
 * and these devices should get updated each time the weather object has a new measurement]
 * + APIs on top of this weather object
 */
public class WeatherData {

  public Float getTemperature(){
    // Code to get temperature from the physical station
    return null;
  }

  public Float getHumidity(){
    // Code to get humidity from the physical station
    return null;
  }

  public Float getPressure(){
    // Code to get pressure from the physical station
    return null;
  }

  /**
   * This method is automatically called whenever the conditions change
   * TODO - Your code goes here [Our job is to plug in display devices]
   *
   */
  public void measurementsChanged() {

    Float temp = getTemperature();
    Float humidity = getHumidity();
    Float pressure = getPressure();

    // Update display units
    // currentConditions.update(temp, humidity, pressure);

    /**
     * What is wrong with this implementation?
     * - Coding to concrete impl and not interfaces
     * - For every new display element, you need to alter code
     * - No way to add/remove display elements during runtime
     * - The display elements don't implement a common interface
     * - We have not encapsulated the part that changes [temp, humidity and pressure]
     */

  }

}
