package com.ishan.java.designpatterns.builder.wrong1;

/**
 * Problems:
 * There is a default no-arg constructor and a setter to set individual property
 * 1. Not immutable
 * 2. Unclear what the contract is. What is a must have/what is optional i.e What constitutes a valid
 * lunch order?
 *
 */
public class Lunch {
  private String bread;
  private String condiments;
  private String dressing;
  private String meat;
  private String drink;
  private String dessert;

  public String getBread() {
    return bread;
  }

  public void setBread(String bread) {
    this.bread = bread;
  }

  public String getCondiments() {
    return condiments;
  }

  public void setCondiments(String condiments) {
    this.condiments = condiments;
  }

  public String getDressing() {
    return dressing;
  }

  public void setDressing(String dressing) {
    this.dressing = dressing;
  }

  public String getMeat() {
    return meat;
  }

  public void setMeat(String meat) {
    this.meat = meat;
  }

  public String getDrink() {
    return drink;
  }

  public void setDrink(String drink) {
    this.drink = drink;
  }

  public String getDessert() {
    return dessert;
  }

  public void setDessert(String dessert) {
    this.dessert = dessert;
  }

}
